package ps2.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ps2.project.model.Professor;

public interface ProfessorRepo extends JpaRepository<Professor, Long> {
}
