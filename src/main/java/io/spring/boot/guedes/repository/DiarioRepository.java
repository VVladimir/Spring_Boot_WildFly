package io.spring.boot.guedes.repository;

import io.spring.boot.guedes.entity.Aluno;
import io.spring.boot.guedes.entity.Diario;
import io.spring.boot.guedes.entity.Modulo;
import java.util.Date;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author azooiverde
 */
public interface DiarioRepository extends MongoRepository<Diario, String> {
    
    List<Diario> findByAluno(Aluno aluno);
    
    List<Diario> findByModulo(Modulo modulo);
    
    List<Diario> findByDataBetween(Date dataDe, Date dataAte);
    
}
