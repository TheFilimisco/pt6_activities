

### 1. Casa - Sala - Cuina (_home_)
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

### 2. Gestió Institut(_institutmanagement_)

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

### 3. Ferries - Camions (ferriesmanagement)

Volem gestionar certa informació associada als ferries que transporten camions
entre dos ports.
La informació rellevant relativa als camions és: La matrícula del camió i el pes del
camió en Tm.
La informació rellevant relativa als ferries és:
   1. La matrícula del ferry.
   2. El nom del ferry.
   3. El nom del port destí del ferry.
   5. El preu en € que cobra el ferry al camió per cada Tm de pes.
   6. El pes màxim en Tm dels camions transportables pel ferry.
   7. Els camions carregats al ferry.
   A partir de les dades anteriors, creem una classe gestioFerryCamio amb un menu i
   les següents funcionalitats:
   1. Determinar el pes total dels camions embarcats. Ha de retornar la suma dels
   pesos de camions que té el ferry embarcat
   2. Determinar si un camió està embarcat. A partir de la matrícula del camió s'ha
   de descobrir si el camió està embarcat.
   3. Determinar si un camió pot embarcar. Calcular si és possible embarcar un
   camió
   4. Embarcar un camió.
   5. Determinar el camió que ha embarcat en n-èsima posició. Donat un nombre
   enter, determinar quina matrícula i pes té aquest camió.
   6. Determinar l'import del peatge d'un camió.
   7. Determinar el peatge total recaptat.


### 4. Telefonia  (telephony)

   Una empresa de telefonia mòbil vol un programa per a gestionar la facturació de les
   trucades de veu dels seus clients. El preu de les trucades es calcula en funció d'un
   preu per minut que pot variar entre clients. Per cada client guardarem les trucades
   que realitzi.
   Volem dissenyar i escriure un programa que pugui efectuar les operacions següents:
   - Afegir un client, tenint en compte que no pot haver-hi dos clients amb el
   mateix DNI.
   - Afegir una trucada a un client.
   - Escriure per pantalla el detall de la factura actual d'un client (dades del client,
   preu_x_minut, total factura, llistat de trucades (per cada trucada destí i
   duració), total minuts parlats.
   - Fer un llistat de tots clients, detallant el seu DNI, nom i un resum de les dades
   de la factura actual (número de trucades, número de minuts totals, import
   total).
     ![ModelRelationTelephony](src/telephony/modelRelation.png).

