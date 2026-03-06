package Hospital.Management.System.com.example.Services;

import Hospital.Management.System.com.example.Entity.Doctor;
import Hospital.Management.System.com.example.Entity.Patient;
import Hospital.Management.System.com.example.Exception.DuplicateResourceException;
import Hospital.Management.System.com.example.Repository.DoctorRepository;
import Hospital.Management.System.com.example.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    DoctorRepository doctorRepository;

    public Patient addpatient(Patient patient){
        boolean exists=patientRepository.existsByNameAndAgeAndDisease(
                patient.getName(),patient.getAge(),patient.getDisease());
        if(exists){
            throw new DuplicateResourceException("Patient already exists");
        }

        Long doctorId=patient.getDoctor().getId();

        Doctor doctor= doctorRepository.findById(doctorId)
                .orElseThrow(() -> new RuntimeException("Doctor not found"));
        patient.setDoctor(doctor);
        return patientRepository.save(patient);
    }

    public List<Patient> getAllPatient(){
        return patientRepository.findAll();
    }

    public String deletePatient(Long id) {
        if (!patientRepository.existsById(id)) {
            throw new RuntimeException("Patient not found with id:" + id);
        }
            patientRepository.deleteById(id);
            return "Patient deleted successfully";
    }
}
