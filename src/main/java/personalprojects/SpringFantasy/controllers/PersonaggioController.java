package personalprojects.SpringFantasy.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import personalprojects.SpringFantasy.entities.Personaggio;
import personalprojects.SpringFantasy.enums.Classe;
import personalprojects.SpringFantasy.enums.Razza;
import personalprojects.SpringFantasy.services.PersonaggioService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/characters")
public class PersonaggioController {
    @Autowired
    private PersonaggioService personaggioService;

    /**
     * @param personaggio
     * @return
     */
    @PostMapping("/create")
    public ResponseEntity<Personaggio> create(@RequestBody Personaggio personaggio) {
        Personaggio personaggioToCreate = personaggioService.create(personaggio);
        return ResponseEntity.ok().body(personaggioToCreate);
    }

    /**
     * @return
     */
    @GetMapping("/readAll")
    public ResponseEntity<List<Personaggio>> readAll() {
        List<Personaggio> listToRead = personaggioService.readAll();
        return ResponseEntity.ok().body(listToRead);
    }

    /**
     * @param id
     * @return
     */
    @GetMapping("/readSingle/{id}")
    public ResponseEntity<Optional<Personaggio>> readSingle(@RequestParam Long id) {
        Optional<Personaggio> personaggioToRead = personaggioService.readSingle(id);
        return ResponseEntity.ok().body(personaggioToRead);
    }

    /**
     * @param personaggio
     * @param id
     * @return
     */
    @PutMapping("/update/{id}")
    public ResponseEntity<Optional<Personaggio>> update(@RequestBody Personaggio personaggio, @RequestParam Long id) {
        Optional<Personaggio> personaggioToUpdate = personaggioService.update(personaggio, id);
        return ResponseEntity.ok().body(personaggioToUpdate);
    }

    /**
     * @param id
     * @return
     */
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Optional<Personaggio>> delete(@RequestParam Long id) {
        Optional<Personaggio> personaggioToDelete = personaggioService.delete(id);
        return ResponseEntity.ok().body(personaggioToDelete);
    }

    /**
     * @param nome
     * @return
     */
    @GetMapping("/readAllByNome")
    public ResponseEntity<List<Personaggio>> readByNome(@RequestParam String nome) {
        List<Personaggio> listToRead = personaggioService.readByNome(nome);
        return ResponseEntity.ok().body(listToRead);
    }

    /**
     * @param razza
     * @return
     */
    @GetMapping("/readAllByRazza")
    public ResponseEntity<List<Personaggio>> readByRazza(@RequestParam Razza razza) {
        List<Personaggio> listToRead = personaggioService.readByRazza(razza);
        return ResponseEntity.ok().body(listToRead);
    }

    /**
     * @param classe
     * @return
     */
    @GetMapping("/readAllByClasse")
    public ResponseEntity<List<Personaggio>> readByClasse(@RequestParam Classe classe) {
        List<Personaggio> listToRead = personaggioService.readByClasse(classe);
        return ResponseEntity.ok().body(listToRead);
    }
}
