# Wallet

A wallet where the wallet owner can put money into the wallet and can buy things.

### Prerequisites

Java JDK: (Version 1.8.0 or above)

### Installing

Compile the javac source code

```
javac OwnerTest.java
```

Execute java application
```
java OwnerTest
```
Create a Wallet and Owner object

```
Wallet wallet = new Wallet();
Owner owner = new Owner();
```

The Owner object can add money and buy things
```
owner.addMoney(200, wallet);
owner.buy(150,wallet);
```