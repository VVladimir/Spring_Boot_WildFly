package io.spring.boot.guedes.repository;

import io.spring.boot.guedes.entity.Modulo;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author azooiverde
 */
public interface ModuloRepository extends MongoRepository<Modulo, String> {
    
}
