package app.school.repository;

import app.school.model.entity.Course;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface CourseRepository extends JpaRepository<Course, UUID> {

    Optional<List<Course>> findCourseByNameOrCourseCode(String name, Long courseCode);
    Optional<Course> findCourseByCourseCode(Long courseCode);
    Optional<List<Course>> findCoursesByStudentsEmpty();
    Page<Course> findAll(Pageable pageable);

}
