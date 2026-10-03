# Assignment 3 — Bridge Design Pattern

## Topic: Cake

### 1. Project Description

This project demonstrates the Bridge Design Pattern using a cake example.

The project separates cake types from decoration types.
Cake types and decorations can be changed independently without changing each other.

---

## 2. Bridge Pattern Components

### Abstraction
`Cake` is the Abstraction.

It contains a reference to `CakeDecorator`, which creates the bridge between the abstraction and implementation.

### Refined Abstractions
The Refined Abstractions are:
- `BirthdayCake`
- `WeddingCake`

They extend the `Cake` abstract class.

### Implementor
`CakeDecorator` is the Implementor interface.

It declares the `decorate()` method that is implemented by different decorators.

### Concrete Implementors
The Concrete Implementors are:
- `ChocolateDecorator`
- `FruitDecorator`

They implement the `CakeDecorator` interface and provide different decoration methods.

### Client
`Main` is the Client.

It creates different cakes with different decorators at runtime.

For example, `BirthdayCake` can work with `ChocolateDecorator` or `FruitDecorator` without changing the `BirthdayCake` class.

---

## 3. Clean Code Principles

### 1. Clear Separation of Responsibilities

The project separates cake types from decoration types.

`Cake`, `BirthdayCake`, and `WeddingCake` are responsible for cake functionality.

`CakeDecorator`, `ChocolateDecorator`, and `FruitDecorator` are responsible for decoration.

This makes the code easier to understand and maintain.

### 2. Meaningful Names

The project uses clear and meaningful names such as:

- `BirthdayCake`
- `WeddingCake`
- `ChocolateDecorator`
- `FruitDecorator`
- `makeCake()`
- `decorate()`

The names clearly describe the purpose of each class and method.

### 3. Small and Focused Classes

Each class has one specific responsibility.

For example, `BirthdayCake` represents a birthday cake, while `ChocolateDecorator` is responsible only for chocolate decoration.

This keeps the classes simple and easy to understand.

### 4. No Duplicated Logic

Decoration logic is separated from cake classes.

The `ChocolateDecorator` and `FruitDecorator` classes contain their own decoration logic, so the same logic does not need to be repeated inside `BirthdayCake` and `WeddingCake`.

This reduces code duplication.

### 5. Easy Extension and Backward Compatibility

New cake types or decorators can be added without changing the existing classes.

For example, a new `CreamDecorator` can implement the `CakeDecorator` interface.

The existing `Cake`, `BirthdayCake`, and `WeddingCake` classes do not need to be changed.

This makes the project flexible and easy to extend.

---

## 4. How the Bridge Works

The bridge is created by this reference inside the `Cake` class:

`protected CakeDecorator decorator;`

The `Cake` abstraction does not depend directly on `ChocolateDecorator` or `FruitDecorator`.

Instead, it depends on the `CakeDecorator` interface.

The cake delegates the decoration work using:

`decorator.decorate();`

Because of this structure, cake types and decoration types can vary independently.

---

## 5. Runtime Flexibility

The same cake type can use different implementations.

For example:

`BirthdayCake + ChocolateDecorator`

or:

`BirthdayCake + FruitDecorator`

The `BirthdayCake` class does not need to be modified when the decoration implementation changes.

This demonstrates the runtime flexibility of the Bridge Design Pattern.

---

## 6. Conclusion

The Bridge Design Pattern separates the abstraction from its implementation.

In this project:

- `Cake` is the Abstraction.
- `BirthdayCake` and `WeddingCake` are Refined Abstractions.
- `CakeDecorator` is the Implementor.
- `ChocolateDecorator` and `FruitDecorator` are Concrete Implementors.
- `Main` is the Client.

This structure reduces coupling, avoids duplicated logic, and makes the project easier to extend and maintain.