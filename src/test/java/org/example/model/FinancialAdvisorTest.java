package org.example.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.*;

class FinancialAdvisorTest {
    @Mock
    Ihandler ssucesor;
    @InjectMocks
    FinancialAdvisor financialAdvisor;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void testPetition() {
        when(ssucesor.petition(anyInt())).thenReturn(0);

        int result = financialAdvisor.petition(0);
        Assertions.assertEquals(0, result);
    }



}

