/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.dao;

import ec.edu.ups.modelo.Usuario;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Anahi
 */
public class UsuarioDao {

    private List<Usuario> listaUsuario;

    public UsuarioDao() {
        
    }

    public UsuarioDao(List<Usuario> listaUsuario) {
        this.listaUsuario = listaUsuario;
    }
    
    public void create(Usuario usuario) {
        listaUsuario.add(usuario);
    }

    public Usuario read(String correo, String contra) {
        for (Usuario usuario : listaUsuario) {
            if (usuario.getCorreo().equals(correo) && usuario.getContraseña().equals(contra)) {
                return usuario;
            }
        }
        return null;
        
    }

    public void update(Usuario usuario) {
        for (int i = 0; i < listaUsuario.size(); i++) {
            Usuario u = listaUsuario.get(i);
            if (u.getCedula().equals(usuario.getCedula())) {
                listaUsuario.set(i, usuario);
                break;
            }
        }
    }

    public void delete(Usuario usuario) {
        Iterator<Usuario> it = listaUsuario.iterator();
        while (it.hasNext()) {
            Usuario u = it.next();
            if (u.getCedula().equals(usuario.getCedula())) {
                it.remove();
                break;
            }
        }
    }

    public List<Usuario> findAll() {
        return listaUsuario;
        
    }
}
