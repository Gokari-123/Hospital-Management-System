package Hospital.Management.System.com.example.Repository;

import Hospital.Management.System.com.example.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient, Long> {

    boolean existsByNameAndAgeAndDisease(String name,int age,String disease);
}
