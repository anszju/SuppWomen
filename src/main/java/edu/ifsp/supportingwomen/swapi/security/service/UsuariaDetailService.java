import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import edu.ifsp.supportingwomen.swapi.model.Usuaria;
import edu.ifsp.supportingwomen.swapi.repository.UsuariaRepository;

public class UsuariaDetailService implements  UsuariaDestailsService {
    @Autowired
    UsuariaRepository usuariaRepository;

    @Override
    public UsuariaDetails loadUserByUsername(String nome) throws UsernameNotFoundException {
        Usuaria usuarioCredenciais = usuariaRepository.findByUsername(nome);
        if(usuarioCredenciais == null)
            throw new UsernameNotFoundException(nome);

        return new UsuariaDetails(usuarioCredenciais);
    }   
}