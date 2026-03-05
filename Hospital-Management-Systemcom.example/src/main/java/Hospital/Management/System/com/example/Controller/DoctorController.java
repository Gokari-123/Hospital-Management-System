package Hospital.Management.System.com.example.Controller;

import Hospital.Management.System.com.example.Entity.Doctor;
import Hospital.Management.System.com.example.Services.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    DoctorService doctorService;

    @PostMapping("/adddoctor")
    public ResponseEntity<Doctor> addDoctor(@RequestBody Doctor doctor){
        return new ResponseEntity<>(doctorService.addDoctor(doctor), HttpStatus.CREATED);
    }

    @GetMapping
    public List<Doctor> getAllDoctor(){
        return doctorService.getAllDoctor();
    }
}
