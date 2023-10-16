package br.edu.univille.orcamento_venda.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.univille.orcamento_venda.entity.Usuario;

@Repository
public interface UsuarioRepository
        extends JpaRepository<Usuario, Long> {

}
