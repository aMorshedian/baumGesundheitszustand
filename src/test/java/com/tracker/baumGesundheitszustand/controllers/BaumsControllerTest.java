package com.tracker.baumGesundheitszustand.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@AutoConfigureMockMvc
@SpringBootTest
class BaumsControllerTest {
    @Autowired
    private MockMvc mockMvc;


    @Test
    public void list() throws Exception {

        mockMvc.perform(
                get("/baumGesundheit/{stadtName}/{strasseName}", "Muenchen","Strassenummer1")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
        )
                // then
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.*", hasSize(20)));

    }

    @Test
    public void listInvalidStadt() throws Exception {

        mockMvc.perform(
                get("/baumGesundheit/{stadtName}/{strasseName}", "Invalid","Strassenummer1")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
        )
                // then
                .andDo(print())
                .andExpect(status().isNotFound());

    }

    @Test
    public void listInvalidStrasse() throws Exception {

        mockMvc.perform(
                get("/baumGesundheit/{stadtName}/{strasseName}", "Muenchen","invalid")
                        .contentType(MediaType.APPLICATION_JSON_VALUE)
        )
                // then
                .andDo(print())
                .andExpect(status().isNotFound());

    }
}