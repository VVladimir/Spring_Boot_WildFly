package io.spring.boot.guedes.repository;

import io.spring.boot.guedes.entity.Usuario;
import java.util.List;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.core.query.TextCriteria;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author azooiverde
 */    

    public interface UsuarioRepository extends MongoRepository<Usuario, String> {
        
        public List<Usuario> findAllBy(TextCriteria criteria, Pageable pages);
        
        public List<Usuario> findByNomeLikeIgnoreCase(String nome);
            
}
