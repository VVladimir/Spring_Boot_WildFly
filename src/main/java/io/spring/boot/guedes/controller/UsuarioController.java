package io.spring.boot.guedes.controller;

import io.spring.boot.guedes.entity.Usuario;
import io.spring.boot.guedes.repository.UsuarioRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author azooiverde
 */
@RestController
public class UsuarioController {
    
    @Autowired 
    UsuarioRepository repository;
    
    @RequestMapping(value = "/usuario", method = RequestMethod.GET)
    public List<Usuario> listUsuario() {
        return repository.findAll();
    }
    
    @RequestMapping(value = "/usuario", method = RequestMethod.POST)
    public Usuario save(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    }
    
    @RequestMapping(value = "/usuario", method = RequestMethod.PUT)
    public Usuario edit(@RequestBody Usuario usuario) {
        return repository.save(usuario);
    }
    
    @RequestMapping(value = "/usuario/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable String id) {
        repository.delete(id);
    }
}
