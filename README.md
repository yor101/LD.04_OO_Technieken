# Onderzoek:

In semester twee heb ik ook onderzoek gedaan naar OO technieken. Toen is er meer globaal gekeken naar de vier pijlers van OO. De vier pijlers:

* Encapsulation

Hou de waardes van je object privé, gebruik publieke interface zoals getters and setters.

* Inheritance

Object van gerelateerd classes hebben meestal vergelijkbare gedragen. Inheritance is een relatie met een algemenen en meer gespecialiseerd classes.

* Abstraction

Met abstraction laatje alleen relevante data zien en verberg je onnodige details.

* Polymorphism

Met “many form” kan een object meerdere vormen hebben. Dit voorbeeld zie je eigenlijk bij veel Inheritance.

### Toepassing van OO in spring
Met de vier pijlers van OO wil ik kijken hoe spring op deze OO technieken hanteert. Ik wil kijken naar hoe spring de connection classes maakt. Wat mij meteen opviel is dat een abstract classes met abstract voor de class naam word geschreven. 
Je ziet dan de pijlers van OO goed worden gebruikt in Spring, zo heb je Inheritance van gelijken classes. Je heb abstraction, de classe AbstractConnectionFactory. Deze class is een goed voorbeeld van abstraction pijler. Deze beschik over verschillenden variablen en methodes. Deze worden met de abstracten als het ware verborgen. 
Spring maakt gebruikt van Beans. Een bean is een proces waarin een object zijn afhankelijkheden definieert zonder ze te creëren. Deze worden gemanaged door de Inversion of Control(IoC) van Spring. Het 
