package io.spring.boot.guedes.repository;

import io.spring.boot.guedes.entity.Aluno;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author azooiverde
 */
public interface AlunoRepository extends MongoRepository<Aluno, String> {
    
}
