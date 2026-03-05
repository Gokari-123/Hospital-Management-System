package Hospital.Management.System.com.example.Services;

import Hospital.Management.System.com.example.Entity.Patient;
import Hospital.Management.System.com.example.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    public Patient addpatient(Patient patient){
        return patientRepository.save(patient);
    }

    public List<Patient> getAllPatient(){
        return patientRepository.findAll();
    }
}
