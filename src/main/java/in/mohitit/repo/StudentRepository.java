package in.mohitit.repo;

import org.springframework.data.repository.CrudRepository;

import in.mohitit.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Integer>{

}
