package ar.edu.utn.frc.tup.lc.iii.scaffolding.repositories;

import ar.edu.utn.frc.tup.lc.iii.scaffolding.entities.DummyEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

@Repository
public interface DummyRepository extends JpaRepository<DummyEntity, Long> {
}
