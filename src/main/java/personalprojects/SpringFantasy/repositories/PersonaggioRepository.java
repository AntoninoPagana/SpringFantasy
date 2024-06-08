package personalprojects.SpringFantasy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import personalprojects.SpringFantasy.entities.Personaggio;
import personalprojects.SpringFantasy.enums.Classe;
import personalprojects.SpringFantasy.enums.Razza;

import java.util.List;

public interface PersonaggioRepository extends JpaRepository<Personaggio, Long> {
    //Custom Queries
    List<Personaggio> findByNome(String nome);

    List<Personaggio> findByRazza(Razza razza);

    List<Personaggio> findByClasse(Classe classe);
}
