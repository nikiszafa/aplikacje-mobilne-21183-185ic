- FrameLayout pozwala nakładać na siebie widoki, w przeciwieństwie do np linearLayout
gdzie są one w jednym rzędzie lun kolumnie. Pozwala to na przykład wyświetlać tekst na grafikach.
Użyłem go aby umieścić w tle grafikę sklepu.

- ConstraintLayout jest narzędziem bardziej złożonym od FrameLayout i LinearLayout.
Jest rozwiązaniem bardziej wydajnym od layoutów zagnieżdżonych

- Możliwe jest zagnieżdżanie layoutów np. w FrameLayout możemy zagnieździć LinearLayout

- ScrollView, jeśli dodamy wiele widoków do naszego layoutu mogą nie zmieścić się na ekranie.
LinearLayout nie posiada scrollbara, i nie możemy scrolować w dół strony. ScrollView nam to umożliwia
i rozwiązuje ten problem.

- Użyłem Switch oraz CheckBox aby zaznaczać zakupione produkty.