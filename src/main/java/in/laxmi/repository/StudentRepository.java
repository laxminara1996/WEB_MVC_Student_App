package in.laxmi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.laxmi.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {


}
