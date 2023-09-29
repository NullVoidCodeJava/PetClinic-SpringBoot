package tech.vedantchimote.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

@WebMvcTest(VetController.class)
public class VetControllerTest {

  @Autowired
  private MockMvc mockMvc;

  @BeforeEach
  public void setUp() {
    mockMvc = MockMvcBuilders.standaloneSetup(new VetController()).build();
  }

  @Test
  public void testVetsWhenCalledWithValidRequestThenReturnsViewName() throws Exception {
    // Arrange
    String expectedViewName = "vets/index";

    // Act and Assert
    mockMvc.perform(MockMvcRequestBuilders.get("/vets"))
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.view().name(expectedViewName));
  }
}