/*
 * Created by boonloong
 */

package com.ongbl.sfgpetclinic.controllers;

import com.ongbl.sfgpetclinic.model.Owner;
import com.ongbl.sfgpetclinic.services.OwnerService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * @created: 5/11/2022
 * @author: boonloong
 */
@ExtendWith(MockitoExtension.class)
class OwnerControllerTest {

    @Mock
    OwnerService ownerService;

    @InjectMocks
    OwnerController controller;

    Set<Owner> owners;

    MockMvc mockMvc;

    @BeforeEach
    void setUp() {
        owners = new HashSet<>();
        owners.add(Owner.builder().id(1L).build());
        owners.add(Owner.builder().id(2L).build());

        mockMvc = MockMvcBuilders.standaloneSetup(controller).build();

    }

    @Test
    void findOwners() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/owners/find"))
                .andExpect(status().isOk())
                .andExpect(view().name("owners/findOwners"))
                .andExpect(model().attributeExists("owner"));

        Mockito.verifyNoInteractions(ownerService);
    }

    @Test
    void processFindFormReturnOne() throws Exception {
        when(ownerService.findAllByLastNameLike(anyString())).thenReturn(Arrays.asList(Owner.builder().id(1l).build()));

        mockMvc.perform(MockMvcRequestBuilders.get("/owners"))
                .andExpect(status().is3xxRedirection())
                .andExpect(view().name("redirect:/owners/1"));
    }

    @Test
    void processFindFormEmptyReturnMany() throws Exception {
        when(ownerService.findAllByLastNameLike(anyString()))
                .thenReturn(Arrays.asList(
                        Owner.builder().id(1l).build(),
                        Owner.builder().id(2l).build()));

        mockMvc.perform(MockMvcRequestBuilders.get("/owners")
                        .param("lastName",""))
                .andExpect(status().isOk())
                .andExpect(view().name("owners/ownersList"))
                .andExpect(model().attribute("selections", hasSize(2)));;
    }

    @Test
    void displayOwner() throws Exception {
        when(ownerService.findById(anyLong())).thenReturn(Owner.builder().id(1L).build());

        mockMvc.perform(MockMvcRequestBuilders.get("/owners/123"))
                .andExpect(status().isOk())
                .andExpect(view().name("owners/ownerDetails"))
                .andExpect(model().attribute("owner", hasProperty("id", is(1L))));
    }
}