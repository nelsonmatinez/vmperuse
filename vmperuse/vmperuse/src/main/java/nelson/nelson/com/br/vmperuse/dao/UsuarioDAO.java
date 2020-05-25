package nelson.nelson.com.br.vmperuse.dao;

import org.springframework.data.repository.CrudRepository;

import nelson.nelson.com.br.vmperuse.model.Usuario;



public interface UsuarioDAO extends CrudRepository<Usuario, Integer> {
	public Usuario findByEmailAndSenha(String email, String senha);
	public Usuario findByRacfAndSenha(String racf, String senha);
}
