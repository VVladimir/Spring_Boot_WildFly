package io.spring.boot.guedes.repository;

import io.spring.boot.guedes.entity.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author azooiverde
 */    

    public interface UsuarioRepository extends MongoRepository<Usuario, String> {
            
}
