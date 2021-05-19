### LAB7. Zadania asynchroniczne
Przerobiona aplikacja z poprzedniego LAB.
Dodanie funkcji dodawania napojów do ulubionych.
Stworzony został AsyncTask UpdateDrinkTask, dzięki niemu możemy aktualizować listę drinków w tle.

- Klasa AsyncTask - pozwala wykonywać operacje w tle. 
Kiedy kończą swoje działanie, pozwalają na aktualizację widoku w głównym wątku.

- onPreExecute() - metoda działająca przed doInBackground()

- doInBackground() - kod w tej metodzie działa w wątku w tle

- onPostExecute() - metoda działająca po doInBackground() 

- onProgressUpdate() - metoda publikująca progress zadania
- 
![strona głóna](/Lab7/3.JPG)

- Parametry 
- Progress - wskaźnik progresu zadania
- Results - wskaźnik wyniku zadania


Możemy dodawać napoje do ulubionych

![strona głóna](/Lab7/1.JPG)

Ulubione napoje pokazują sie na głównym ekranie. 
Naciskajac na nie trafiamy na ich opis

![strona głóna](/Lab7/2.JPG)
