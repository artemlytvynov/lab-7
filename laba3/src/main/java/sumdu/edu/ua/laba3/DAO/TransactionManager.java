/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sumdu.edu.ua.laba3.DAO;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
import sumdu.edu.ua.laba3.model.Student;

/**
 *
 * @author lytvy
 */
@Service
@Transactional
public class TransactionManager {
    private final DAO_Student userRepository;

    @Autowired
    public TransactionManager(DAO_Student userRepository) {
        this.userRepository = userRepository;
    }

    public Student addStudent(Student student) {
        return userRepository.save(student);
    }

    public List<Student> getAllStudent() {
        return userRepository.findAll();
    }

    public Student getStudentById(Integer StudentId) {
        return userRepository.findById(StudentId).orElse(null);
    }

    public Student updateStudent(Student student) {
        return userRepository.save(student);
    }

    public void deleteStudent(Integer StudentId) {
        userRepository.deleteById(StudentId);
    }
}
