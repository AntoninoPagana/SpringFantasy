# SpringFantasy
# Traccia:
Obiettivo: Creare un'applicazione web per la gestione dei personaggi in un mondo fantasy, con funzionalità di creazione, visualizzazione, modifica ed eliminazione dei personaggi.<br>
Requisiti:<br>
Ogni personaggio deve avere un nome, una razza, una classe, un livello e una descrizione.<br>
Le razze disponibili includono umani, elfi, nani e orchi.<br>
Le classi disponibili includono guerrieri, maghi, ranger e ladri.<br>
L'applicazione deve consentire agli utenti di:<br>
Creare un nuovo personaggio, specificando nome, razza, classe e descrizione.<br>
Visualizzare l'elenco completo dei personaggi.<br>
Visualizzare i dettagli di un personaggio specifico.<br>
Modificare i dettagli di un personaggio esistente.<br>
Eliminare un personaggio dall'elenco.<br>
L'applicazione deve includere una funzionalità di ricerca per cercare personaggi per nome, razza o classe.<br>
Implementazione:<br>
Classe Character:<br>
Attributi: id, nome, razza, classe, livello, descrizione.<br>
Metodi: getter e setter per tutti gli attributi.<br>
Classe CharacterService:<br>
Interfaccia contenente i metodi per la gestione dei personaggi.<br>
Metodi:<br>
List<Character> getAllCharacters(): Restituisce l'elenco completo dei personaggi.<br>
Character getCharacterById(int id): Restituisce un personaggio specifico per ID.<br>
void createCharacter(Character character): Crea un nuovo personaggio.<br>
void updateCharacter(int id, Character character): Aggiorna i dettagli di un personaggio esistente.<br>
void deleteCharacter(int id): Rimuove un personaggio dall'elenco.<br>
List<Character> searchCharacters(String keyword): Cerca personaggi per nome, razza o classe.<br>
Classe CharacterController:<br>
Controller per gestire le richieste HTTP relative ai personaggi.<br>
Metodi:<br>
GET /characters: Restituisce l'elenco completo dei personaggi.<br>
GET /characters/{id}: Restituisce i dettagli di un personaggio specifico.<br>
POST /characters: Crea un nuovo personaggio.<br>
PUT /characters/{id}: Aggiorna i dettagli di un personaggio esistente.<br>
DELETE /characters/{id}: Rimuove un personaggio dall'elenco.<br>
GET /characters/search?keyword={keyword}: Cerca personaggi per nome, razza o classe.<br>
Implementazione della logica di business nei metodi di CharacterService.<br>
Configurazione di Spring Data JPA per l'interazione con il database.<br>
