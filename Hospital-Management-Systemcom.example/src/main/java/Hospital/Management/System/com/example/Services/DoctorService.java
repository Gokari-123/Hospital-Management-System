package Hospital.Management.System.com.example.Services;


import Hospital.Management.System.com.example.Entity.Doctor;
import Hospital.Management.System.com.example.Exception.DuplicateResourceException;
import Hospital.Management.System.com.example.Repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DoctorService {

    @Autowired
    DoctorRepository doctorRepository;

    public Doctor addDoctor(Doctor doctor){
        Optional<Doctor> existingDoctor=
                doctorRepository.findByEmail(doctor.getEmail());
        if(existingDoctor.isPresent()){
            throw new DuplicateResourceException("Doctor already exists with this email");
        }
        return doctorRepository.save(doctor);
    }

    public List<Doctor> getAllDoctor(){
        return doctorRepository.findAll();
    }
}
