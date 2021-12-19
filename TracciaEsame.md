# EsameJava2019
Prova svolta in Java per l'esame di Algoritmi e Strutture dati in Java.

**TRACCIA:**
Utilizzando le conoscenze apprese di Programmazione Orientata agli Oggetti, implementare in Java la
soluzione di un applicativo per la gestione di una filiale delle Poste, per lo smistamento dei pacchi.
L'applicativo deve prevedere almeno le seguenti classi:
* Classe Pacco (Astratta con un metodo astratto)
* Classe Lettera (derivata da Pacco)
* Classe Scatola (derivata da Pacco)
* Classe Impiegato
* Classe Direttore
Implementare uno scenario prevedendo che:
* Ogni Pacco sia definito da mittente, destinatario e costo di spedizione;
* ogni Lettera abbia anche uno stato di destinazione (Italia o Altro);
* ogni Scatola, oltre ad avere lo stato di destinazione, abbia anche un peso.
Ogni Impiegato: 
* sia inizializzato a partire da un file di testo personale che contiene, in maniera indiscriminata,
lettere e/o pacchi (schema del file di testo riportato sotto);
* possa inviare oggetti di tipo Lettera e oggetti di tipo Scatola, e stampare la sequenza di invio
dei due tipi di oggetti su due file di testo separati.
* debba gestire l'invio di oggetti di tipo Lettera secondo uno schema di tipo PILA, e l'invio di
oggetti di tipo Scatola secondo un approccio di tipo CODA (dimensione max per pila e coda
pari al numero di elementi contenuti nel file di testo);
* sia caratterizzato da un indice di performance che si incrementi di 1 per ogni Lettera inviata
e di 1*peso_scatola per ogni Scatola inviata.
Ogni Direttore:
* possa stampare su file di testo i propri impiegati ordinati per valore attuale di performance
(ordine decrescente).

(La traccia dell'esame è stata estratta automaticamente con https://brandfolder.com/workbench/extract-text-from-image.
protrebbe presentare degli errori)
