package it.silviafabbri.tesi.business;

import it.silviafabbri.tesi.model.Incasso;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IncassoPostgresRepository extends JpaRepository<Incasso, UUID> {
}
