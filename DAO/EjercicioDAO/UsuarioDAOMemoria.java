import java.util.ArrayList;
import java.util.List;

public class UsuarioDAOMemoria implements UsuarioDAO {
    private List<Usuario> usuarios;

    public UsuarioDAOMemoria() {
        this.usuarios = new ArrayList<>();
    }

    @Override
    public List<Usuario> obtenerTodos() {
        return usuarios;
    }

    @Override
    public Usuario obtenerPorId(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    @Override
    public void guardar(Usuario usuario) {
        usuarios.add(usuario);
    }

    @Override
    public void actualizar(Usuario usuario) {
        for (Usuario u : usuarios) {
            if (u.getId() == usuario.getId()) {
                u.setNombre(usuario.getNombre());
                u.setEmail(usuario.getEmail());
                break;
            }
        }
    }

    @Override
    public void eliminar(int id) {
        usuarios.removeIf(u -> u.getId() == id);
    }
}
