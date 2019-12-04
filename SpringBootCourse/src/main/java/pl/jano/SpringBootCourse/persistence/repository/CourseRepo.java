package pl.jano.SpringBootCourse.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import pl.jano.SpringBootCourse.persistence.model.Course;

public interface CourseRepo
        extends JpaRepository<Course, Long>,
        JpaSpecificationExecutor<Course>, BaseRepo<Course, Long> {


}
