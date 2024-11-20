📄Descripció Nivel 1: 
Singleton

Crea una jerarquia d’objectes amb tres classes: Treballador, TreballadorOnline i TreballadorPresencial.

La classe Treballador té els atributs nom, cognom, preu/hora, i el mètode calcularSou() que rep per paràmetre el nombre d'hores treballades i el multiplica pel preu/hora. Les classes filles l'han de sobreescriure, emprant @Override.

Des del main() de la classe Principal, fes les invocacions necessàries per demostrar el funcionament de l’anotació @Override.

En els treballadors presencials, el mètode per calcular el seu sou, rebrà per paràmetre el nombre d’hores treballades al mes. A l’hora de calcular el sou es multiplicarà el nombre d’hores treballades pel preu/hora, més el valor d'un atribut static anomenat benzina que afegirem en aquesta classe.

En els treballadors online, el mètode per calcular el seu sou rebrà per paràmetre el nombre d'hores treballades al mes. A l'hora de calcular el sou es multiplicarà el nombre d'hores treballades pel preu/hora i se li sumarà el preu de la tarifa plana d'Internet, que serà una constant de la classe TreballadorOnline.

📄Descripció Nivel 2: 
Abstract Factory

Crea un petit gestor de direccions i números de telèfon internacionals.

L'aplicació ha de permetre afegir a l'agenda, adreces i números de telèfon internacionals. Tenint en compte els diferents formats dels diferents països, construeix l'agenda, les adreces i els telèfons implementant un patró Abstract Factory.
