# UNITN-lingProg-Concessionario
Università di Trento - Soluzione compito di Linguaggi di Programmazione, Modulo 1 – febbraio 2019

🔥 Esempio di soluzione da me realizzata per l'esame di Ronchetti di febbraio 2019.

### Testo
1) Si prepari su un foglio il diagramma UML di tutte le classi coinvolte nel progetto sotto
specificato. Non serve mostrare le classi di ]avaFX, eccetto quelle da cui le classi scritte
dal programmatore ereditano direttamente, se ve ne sono. Al termine, il foglio (sul
quale devono essere presenti nome, cognome, numero di matricola) dovrà essere
consegnato.

2) Un Record è una struttura dati composta di tre campi fieldl, field2, field3, i primi due
di tipo String, il terzo di tipo Integer.

3) Record implementa il metodo equals.

4) Si considerino i seguenti tipi di record:
    * "Persona", composta di campi che rappresentano Nome, Cognome, Anno di nascita
    * "Automobile", composta di campi che rappresentano Marca, Modello, Prezzo

5) Ognuna delle classi indicate al punto 4 ha associato un insieme del proprio tipo,
ovvero, ci saranno un insieme di Persona e un insieme di Automobile: ogni volta che un
oggetto viene creato, esso viene verificato (si veda il punto 7) e aggiunto all'insieme del
proprio tipo.

6) L'interfaccia dell'applicazione sarà divisa in due parti, con la sinistra che riguarda le
persone e quella destra che riguarda le auto. L'immagine mostra la finestra principale
e la finestra di input di cui al punto 7.<br>
NOTA:nel seguito, con il termine "stampare" si intende:
    1. scrivere l'output nel campo di testo a video: quello sinistro per le operazioni
sulle persone, quello destro per le auto, sovrascrivendo quanto già presente nel
campo stesso e, contemporaneamente,
    2. produrre lo stesso output sulla console di Netbeans.
    
<p align="center">
  <img src="https://user-images.githubusercontent.com/39135429/60918326-5b781780-a293-11e9-8856-1616af8d6d51.png" alt="esempio">
</p>
    
7) In sede di correzione, I'implernentazione di ambedue le opzioni verrà valutata con
punteggio pieno; l'implementazione della sola opzione 2 comporterà invece una
penalità.

8) I bottoni "Nuova Persona" e "Nuova Auto" aprono una finestra di input nella quale
l'utente inserisce i relativi dati. Il bottone "Controlla e inserisci" posto su di essa,
quando premuto, avvia il controllo che nessun campo sia vuoto, che il terzo campo sia
rappresentabile come intero e che un record con dati uguali non sia già presente nel
relativo insieme. Se il controllo non ha successo viene data una comunicazione in
console e la finestra di input rimane aperta. Se invece il controllo ha successo, la
finestra viene chiusa, il record viene aggiunto al relativo insieme, e nella finestra
principale il campo di testo viene aggiornato stampandovi tutti i record dell'insieme in
ordine arbitrario.

9) I bottoni "Conta" stampano il numero di Persone o di Automobili presenti, a seconda
che si tratti del bottone di sinistra o di destra.
"

9) Ciascun bottone "mescola" rimescola il relativo insieme e ne ristampa nel campo tutti i
record.

10) I bottoni "ordina" ordinano i record del relativo campo, ristampandolo. L'ordinamento
delle persone è per cognome, quello delle auto è per modello.

11) Il bottone "ordina per anno" agisce sulle persone riordinandole per anno e
ristampandone l'insieme.

12) Il bottone "ordina per prezzo" agisce sulle auto riordinandole per prezzo e
ristampandone l'insieme.

## In questo progetto sono stati svolti i punti:
- [ ] 1. Si prepari su un foglio il diagramma UML
- [x] 2 3 4 5 6 7 8 9 10 
- [ ] 11 12
