package fst.if5.cloud.projetMicroServices.student.api;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import fst.if5.cloud.projetMicroServices.student.model.Student;
import fst.if5.cloud.projetMicroServices.student.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	StudentRepository repository;

	protected Logger logger = Logger.getLogger(StudentController.class.getName());

	
	@RequestMapping(value = "/student/{id}", method = RequestMethod.GET)
	public Student findById(@PathVariable("id") String id) {
		logger.info(String.format("Student.findById(%s)", id));
		return repository.findById(id);
	}
/*
	@RequestMapping(value = "/students/book/{book}", method = RequestMethod.GET)
	public List<Student> findByBook(@PathVariable("book") String bookId) {
		logger.info(String.format("Student.findByBook(%s)", bookId));
		return repository.findByBookId(bookId);
	}*/

	@RequestMapping(value = "/students", method = RequestMethod.GET)
	public List<Student> findAll() {
		logger.info("Student.findAll()");
		return repository.findAll();
	}

	@RequestMapping(value = "/students", method = RequestMethod.POST)
	public Student add(@RequestBody Student student) {
		logger.info(String.format("Student.add(%s)", student));
		return repository.save(student);
	}
	
	
	@RequestMapping(value = "/student/{id}", method = RequestMethod.PUT)
	public Student update(@RequestBody Student student) {
		logger.info(String.format("Student.update(%s)", student));
		return repository.save(student);
	}
	

	@RequestMapping(value = "/student/{id}", method = RequestMethod.DELETE)
    public void  deleteStudent(@PathVariable String id) {
        repository.delete(id);
    }
    
}