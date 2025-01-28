package com.devopsdummy.springbootms2.controller;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class FechaTest {

    @Test
    void testGetDateTime() {
        fecha fechaController = new fecha();
        String result = fechaController.getDateTime();

        // Verificar que el resultado contiene "Fecha y Hora actual:"
        assertTrue(result.startsWith("Fecha y Hora actual: "));

        // Verificar que la fecha es válida
        String dateTimeString = result.replace("Fecha y Hora actual: ", "");
        LocalDateTime parsedDateTime = LocalDateTime.parse(dateTimeString);

        // Verificar que la fecha parseada no es nula
        assertTrue(parsedDateTime != null);
    }
}
