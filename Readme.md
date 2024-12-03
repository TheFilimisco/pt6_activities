

### 1. Casa - Sala - Cuina
   Defineix tres classes: Casa, Sala, Cuina. 
   - La classe Sala té com atributs numeroDeTelevisions(int) i tipusSala(String) i
   disposa d'un constructor que l'inicialitza a 0 i "desconegut".
   - La classe Cuina ha de tenir com atributs esIndependent (boolean) i
   nombreDeFogons(int) i un constructor que els inicialitza a false i 0. 
   - La casa tindrà els següents atributs de la classe: superfície(double),
   direcció(String), salaCasa(tipus Sala) i cuinaCasa (tipus Cuina). Defineix un
   constructor per la classe Casa que estableixi uns valors per defecte als
   atributs simples i que creï nous objectes pels atributs Objecte.
- Crea una nova classe per a testejar les classes definides anteriorment. En ella crea
  cases de diferents tipologies i després mostra com es creen els resultats. (Pots fer
  ús del mètode toString() que pots definir a totes les classes).

### 2. Gestió Institut

   Es vol fer un mini gestor per un institut per controlar els alumnes, els mòduls als que
   està matriculat un alumne i les seves notes. Guardarem:
   - Per a l'Alumne: nom, cognoms, edat i dni.
   - Per al Mòdul: el nom del mòdul
   - Una matrícula estarà composta per: un alumne, un mòdul i una nota.
   Crea una classe Test amb una simulació de 2 estudiants matriculats a 3 mòduls
   cadascú. Dóna les següents opcions al programa:
   - extreureNotesMitjana: Donat un dni d'entrada, n'extreu la mitjana de les notes
   d'aquest alumne.
   - extreuModulsSuspesos: Donat el Dni d'un alumne, n'extreu els mòduls que
   ha suspès.