package br.com.api.sigabem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.api.sigabem.model.Freight;

@Repository
public interface FreightRepository extends JpaRepository<Freight, Long> {

}
