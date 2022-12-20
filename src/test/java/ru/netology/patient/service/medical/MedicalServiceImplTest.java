package ru.netology.patient.service.medical;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import ru.netology.patient.repository.PatientInfoFileRepository;

import static org.junit.jupiter.api.Assertions.*;
class MedicalServiceImplTest {

    @Test
    void checkBloodPressure() {
        PatientInfoFileRepository patientIFR = Mockito.mock(PatientInfoFileRepository.class);
        Mockito.when(patientIFR.)
    }

    @Test
    void checkTemperature() {
    }
}