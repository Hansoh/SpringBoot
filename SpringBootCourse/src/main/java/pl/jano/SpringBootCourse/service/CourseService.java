package pl.jano.SpringBootCourse.service;

import pl.jano.SpringBootCourse.model.CourseDTO;
import pl.jano.SpringBootCourse.persistence.model.Course;
import pl.jano.SpringBootCourse.persistence.repository.CourseRepo;

import java.util.List;

public interface CourseService extends BaseService<Course, Long, CourseRepo> {

    CourseDTO getCourseDtoById(Long id);

    CourseDTO createCourse(CourseDTO courseDTO);

    List<CourseDTO> getAllCourses();
}
