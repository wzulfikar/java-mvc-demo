# Java MVC Demo

- create dynamic web project
- create new package named `mvc_demo`
- copy content of `mvc_demo` from this repo to your package `mvc_demo`
- copy `person.jsp` to your `WebContent` directory
- visit `/Person`

### Flow
- [View ➜ Controller] User visit `/Person` & `PersonController` handles the request 
- [Controller ➜ Model] `PersonController` tries to *create* new person object based on `Person` model 
- [Controller ➜ View] `PersonController` send the response to user, passing a `person` object
- [View] `person.jsp` display the response

### Convention
Uses common convention,

- Name of class uses `upper-camel-case` letter
  - class *person* should be `Person`, not `person`.
  - class *old person* should be `OldPerson`, not `oldPerson` or `old_person`
- Instance of class uses `camel-case` letter
- Name of method uses `camel-case` letter
  - method *eat cake* should be `eatCake()`, not `EatCake()` or `eat_cake()`