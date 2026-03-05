package Hospital.Management.System.com.example.Controller;


import Hospital.Management.System.com.example.Entity.Patient;
import Hospital.Management.System.com.example.Services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    PatientService patientService;

    @PostMapping("/addpatient")
    public ResponseEntity<Patient> addPatient(@RequestBody Patient patient){
        return new ResponseEntity<>(patientService.addpatient(patient), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Patient> getAllPatient(){
        return patientService.getAllPatient();

    }
}
