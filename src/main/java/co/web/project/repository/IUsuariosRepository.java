package co.web.project.repository;

import org.springframework.data.jpa.repository.*;
import co.web.project.entity.Usuarios;

public interface IUsuariosRepository extends JpaRepository<Usuarios, Long> {

}
