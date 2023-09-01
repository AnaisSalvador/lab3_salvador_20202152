package com.example.lab3_salvador_20202152.repositorio;
import com.example.lab3_salvador_20202152.entidad.Estadio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadioRepository extends JpaRepository<Estadio, Integer> {

}
