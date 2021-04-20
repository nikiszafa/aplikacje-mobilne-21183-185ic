## Lab nr 2 Aktywności i intencje
  - Stworzyłem aplikację przekazującą wiadomość tekstową do aplikacji typu gmail, sms. 
  - Stworzyłem aktywności które przekazują sobie wiadomość za pomocą putExtra()
  - Utworzyłem przejście do innej aktywności po wciśnięciu przycisku
  - Przejście do aktywności innej aplikacji typu gmail, sms, facebook messenger.
  - Przekazałem wiadomość do innej aktywności i pobrałem ją za pomocą getIntent()
  
    email.setType("message/rfc822") powoduje że Android znajdzie aktywności aplikacji które mogą obsłużyć przekazywany typ danych
    
    message/rfc822 jest to format wiadomości email
    
![strona głóna](/Lab2/6.jpg)

W pliku manifest możemy ustalić typ intencji jakie dana aktywność ma przyjmość, intent filter
np.
```
<intent-filter>
<action android:name="android.intent.action.SEND"/>
<data android:mimeType="text/plain"/>
<data android:mimeType="image/*"/>
</intent-filter>
```

![strona głóna](/Lab2/1.JPG)


![strona głóna](/Lab2/2.JPG)


![strona głóna](/Lab2/3.JPG)


![strona głóna](/Lab2/4.JPG)

![strona głóna](/Lab2/5.JPG)

![strona głóna](/Lab2/7.jpg)

![strona głóna](/Lab2/8.jpg)


