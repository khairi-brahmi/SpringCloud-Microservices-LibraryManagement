package fst.if5.cloud.projetMicroServices.student.repository;


import org.springframework.data.mongodb.repository.MongoRepository;
import fst.if5.cloud.projetMicroServices.student.model.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

    public Student findById(String id);
  //  public List<Student> findByBookId(String bookId);
    
}
