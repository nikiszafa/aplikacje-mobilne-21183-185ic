- SQLite Database - daje nam dostęp do bazy danych.

- SQLiteOpenHelper() - pomaga nam tworzyć i zarządzać bazą danych
Tworzymy rozszerzając klasę SQLiteOpenHelper.

- onCreate() - metoda przywoływana kiedy baza danych zostaje utworzona
na urządzeniu. Powinna zawierać kod który jest potrzebny
do stworzenia tabeli potrzebnych dla naszej aplikacji.
Tworzymy tabelę z drinkami przy tworzeniu bazy.
![strona głóna](/Lab6/1.JPG)


- onUpgrade() - metoda przywoływana kiedy baza danych 
musi zostać zaktualizowana. Na przykład zmodyfikować strukturę
bazy danych po jej wypuszczeniu.


- Cursor() - pozwala na odczytywanie i zapisywanie w bazie danych.
Tworzymy cursor aby dostać name, description i image resource ID dla 
naszego wybranego drinka
![strona głóna](/Lab6/2.JPG)
![strona głóna](/Lab6/3.JPG)

- moveToFirst(), moveToLast(), moveToPrevious(), moveToNext().
metody służące do poruszania się po rekordach.
Zwracają true/false w zależności od metody.
moveToFirst() - idziemy do pierwszego rekordu
moveToLast() - idziemy do ostatniego rekordu
moveToPrevious() - idzeimy do poprzedniego rekordu
moveToNext() - idziemy do nastepnego rekordu
![strona głóna](/Lab6/4.JPG)
