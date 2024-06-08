package personalprojects.SpringFantasy.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import personalprojects.SpringFantasy.entities.Personaggio;
import personalprojects.SpringFantasy.enums.Classe;
import personalprojects.SpringFantasy.enums.Razza;
import personalprojects.SpringFantasy.repositories.PersonaggioRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaggioService {
    @Autowired
    private PersonaggioRepository personaggioRepository;

    //Creare un nuovo personaggio, specificando nome, razza, classe e descrizione.
    public Personaggio create(Personaggio personaggio) {
        Personaggio personaggioToCreate = personaggioRepository.save(personaggio);
        return personaggioToCreate;
    }

    //Visualizzare l'elenco completo dei personaggi.
    public List<Personaggio> readAll() {
        List<Personaggio> listToRead = personaggioRepository.findAll();
        return listToRead;
    }

    //Visualizzare i dettagli di un personaggio specifico.
    public Optional<Personaggio> readSingle(Long id) {
        Optional<Personaggio> personaggioToRead = personaggioRepository.findById(id);
        if (personaggioToRead.isPresent()) {
            return personaggioToRead;
        } else {
            return Optional.empty();
        }
    }

    //Modificare i dettagli di un personaggio esistente.
    public Optional<Personaggio> update(Personaggio personaggioUpdated, Long id) {
        Optional<Personaggio> personaggioToUpdate = personaggioRepository.findById(id);
        if (personaggioToUpdate.isPresent()) {
            personaggioToUpdate.get().setNome(personaggioUpdated.getNome());
            personaggioToUpdate.get().setRazza(personaggioUpdated.getRazza());
            personaggioToUpdate.get().setClasse(personaggioUpdated.getClasse());
            personaggioToUpdate.get().setLivello(personaggioUpdated.getLivello());
            personaggioToUpdate.get().setDescrizione(personaggioUpdated.getDescrizione());
            personaggioRepository.save(personaggioUpdated);
            return personaggioToUpdate;
        } else {
            return Optional.empty();
        }
    }

    //Eliminare un personaggio dall'elenco.
    public Optional<Personaggio> delete(Long id) {
        Optional<Personaggio> personaggioToDelete = personaggioRepository.findById(id);
        if (personaggioToDelete.isPresent()) {
            personaggioRepository.delete(personaggioToDelete.get());
            return personaggioToDelete;
        } else {
            return Optional.empty();
        }
    }

    //L'applicazione deve includere una funzionalità di ricerca per cercare personaggi per nome, razza o classe.
    public List<Personaggio> readByNome(String nome) {
        List<Personaggio> listToRead = personaggioRepository.findByNome(nome);
        return listToRead;
    }

    public List<Personaggio> readByRazza(Razza razza) {
        List<Personaggio> listToRead = personaggioRepository.findByRazza(razza);
        return listToRead;
    }

    public List<Personaggio> readByClasse(Classe classe) {
        List<Personaggio> listToRead = personaggioRepository.findByClasse(classe);
        return listToRead;
    }
}
