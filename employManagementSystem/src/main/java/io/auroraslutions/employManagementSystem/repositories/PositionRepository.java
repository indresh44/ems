package io.auroraslutions.employManagementSystem.repositories;

import io.auroraslutions.employManagementSystem.domain.Position;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Taimoor Choudhary on 9/12/18.
 */
public interface PositionRepository extends JpaRepository<Position, Long> {

    List<Position> findByTitle(String title);
}
