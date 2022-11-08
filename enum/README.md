<h1>Enumerations serve the purpose of representing a group of named constants in a programming language. For example, the 4 suits in a deck of playing cards may be 4 enumerators named Club, Diamond, Heart, and Spade, belonging to an enumerated type named Suit. </h1>
<hr>
A Java enumeration is a class type. Although we don't need need to instantiate an enum using new, it has the same capabilities as other classes. This fact makes Java enumeration a very powerful tool. Just like classes, you can give them constructor, add instance variables and methods, and even implement interfaces.
<hr>
<div><h1>Declaration of enum in Java</h1>Enum declaration can be done outside a Class or inside a Class but not inside a Method.</div>
<hr>


enum and constructor:  

enum can contain a constructor and it is executed separately for each enum constant at the time of enum class loading.
We can't create enum objects explicitly and hence we can't invoke enum constructor directly.
enum and methods:  

enum can contain both concrete methods and abstract methods. If an enum class has an abstract method, then each instance of the enum class must implement it
