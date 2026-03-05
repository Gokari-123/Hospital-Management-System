package Hospital.Management.System.com.example.Controller;


import Hospital.Management.System.com.example.Entity.Doctor;
import Hospital.Management.System.com.example.Repository.DoctorRepository;
import Hospital.Management.System.com.example.Security.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    DoctorRepository doctorRepository;

    @Autowired
    JwtUtil jwtUtil;

    @PostMapping("/login")
    public String login(@RequestBody Doctor doctor){

        Doctor dbDoctor  =doctorRepository.findByEmail(doctor.getEmail()).orElseThrow();

        if(dbDoctor.getPassword().equals(doctor.getPassword())){
            return jwtUtil.generateTocken(dbDoctor.getEmail());
        }else {
            throw new RuntimeException("Invalid Login");
        }
    }
}
