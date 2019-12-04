package pl.jano.SpringBootCourse.persistence.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import pl.jano.SpringBootCourse.persistence.model.BaseEntity;

import java.io.Serializable;

public interface BaseRepo<T extends BaseEntity, K extends Serializable>
        extends JpaRepository<T,K>, JpaSpecificationExecutor<T> {
}
