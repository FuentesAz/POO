import java.util.List;

public interface UsuarioDAO {
    List<Usuario> obtenerTodos();
    Usuario obtenerPorId(int id);
    void guardar(Usuario usuario);
    void actualizar(Usuario usuario);
    void eliminar(int id);
}

