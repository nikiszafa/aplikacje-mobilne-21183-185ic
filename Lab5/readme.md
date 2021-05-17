## Lab5.Fragmenty
### Wykonałem oraz przeanalizwoałem aplikację z rozdziału 9-11

- Fragmenty ułatwiają pracę dzieląc kod na mniejsze kawałki. Odciążając nas z używania klas Activity.
Ułatwiają projektowanie UI na urządzenia o różnych szerokościach ekranu.
Są pojemnikiem dla różnych elementów UI i funkcjonalności które są im przypisane.
Dzięki temu nasza aplikacja staje się bardziej modularna.

- Poniższa Metoda onCreateView(), jest wywoływana kiedy Android potrzebuje layoutu fragmentu.
LayoutInflator jest to parametr który używamy do "napompowania" layoutu naszego fragmentu.
"Napompowanie" layoutu powoduje przekształcenie XML view na obiekty JAVA.
ViewGroup jest to ViewGroup w layoucie activity naszego fragmentu.
Określamy layout fragmentu używając metody LayoutInflator inflate()
![strona głóna](/Lab5/1.JPG)

- Jeśli layout dla naszego activity będzie zawierał tylko jeden fragment.
Możemy zamieścić go w ten sposób, pozbywając się innego kodu:
Możemy tak zrobić ponieważ <fragment> jest typem View.
![strona głóna](/Lab5/2.JPG)

- Fragment Manager, aby activity mogło skomunikować się z fragmentem, musi zdobyć referencje 
do tego fragmentu. Możemy to zrobić używając fragment manager. Używamy go do komunikowania się 
z fragmentami używanymi przez activity.
Dzięki findFragmentById() zdobywamy reference do naszego fragmentu.
![strona głóna](/Lab5/3.JPG)

- ListFragment jest to fragment zawierający jedynie listę.

- Stworzyłem interfejs Listener. Klasa MainActivity implementuje ten interfejs, dzięki temu
WorkoutListFragment będzie w stanie przekazać do MainActivity który item na liście został wybrany.
![strona głóna](/Lab5/4.JPG)
![strona głóna](/Lab5/5.JPG)

- Stworzyłem wersje layoutu na Tablet, w tym celu utworzyłem katalog layout-large
w którym znajdują się layouty dopasowane do większych ekranów.

- Transakcje, jeśli korzystamy z aplikacji na tablecie i fragmenty znajdują się obok siebie.
Chcemy aby przycisk powrotu cofał nas do poprzedniego stanu fragmentu. A nie tak jak
domyślnie do poprzedniego Activity. W tym celu wykorzystujemy Transakcje.

![strona głóna](/Lab5/6.JPG)
![strona głóna](/Lab5/7.JPG)
![strona głóna](/Lab5/8.JPG)
![strona głóna](/Lab5/9.JPG)
![strona głóna](/Lab5/10.JPG)
![strona głóna](/Lab5/11.JPG)
