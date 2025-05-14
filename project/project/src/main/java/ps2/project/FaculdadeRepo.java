package ps2.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ps2.project.model.Faculdade;

public interface FaculdadeRepo extends JpaRepository<Faculdade, Long> {
}
