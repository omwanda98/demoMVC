package jay.demoMVC.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jay.demoMVC.app.model.Student;


public interface StudentRepository extends JpaRepository<Student, Long> {

}
