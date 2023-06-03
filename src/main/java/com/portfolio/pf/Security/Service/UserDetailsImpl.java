package com.portfolio.pf.Security.Service;

import com.portfolio.pf.Security.Entity.Usuario;
import com.portfolio.pf.Security.Entity.UsuarioPrincipal;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

//import java.util.Optional;

@Service
public class UserDetailsImpl implements UserDetailsService {

    //@Autowired
    //UsuarioService usuarioService;
    
    //@Override
    //public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        //Usuario usuario = usuarioService.getByNombreUsuario(nombreUsuario).get();
      //  return UsuarioPrincipal.build(usuario);
    //}
    
    
    
    
    
    
    
   private final UsuarioService usuarioService;

    @Autowired
    public UserDetailsImpl(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @Override
    public UserDetails loadUserByUsername(String nombreUsuario) throws UsernameNotFoundException {
        Optional<Usuario> usuarioOptional = usuarioService.getByNombreUsuario(nombreUsuario);
        Usuario usuario = usuarioOptional.orElseThrow(() ->
                new UsernameNotFoundException("Usuario no encontrado: " + nombreUsuario));
        return UsuarioPrincipal.build(usuario);
    }
}