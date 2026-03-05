package Hospital.Management.System.com.example.Repository;

import Hospital.Management.System.com.example.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> {

 Optional<Doctor> findByEmail(String email);
}
