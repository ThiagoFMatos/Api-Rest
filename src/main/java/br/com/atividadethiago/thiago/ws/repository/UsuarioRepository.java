package br.com.atividadethiago.thiago.ws.repository;

import br.com.atividadethiago.thiago.ws.model.UsuarioModel;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<UsuarioModel, Integer>
 {
}