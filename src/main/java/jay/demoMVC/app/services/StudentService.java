package jay.demoMVC.app.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jay.demoMVC.app.model.Student;
import jay.demoMVC.app.repository.StudentRepository;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public Optional<Student> getStudentById(Long id) {
        return studentRepository.findById(id);
    }
}
