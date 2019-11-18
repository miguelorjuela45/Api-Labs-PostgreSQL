package co.web.project.repository;

import org.springframework.data.jpa.repository.*;
import co.web.project.entity.Solicitudes;

public interface ISolicitudesRepository extends JpaRepository<Solicitudes, Long> {

}
