# Java MVC Demo

- create dynamic web project
- create new package named `mvc_demo`
- copy content of `mvc_demo` from this repo to your package `mvc_demo`
- copy `person.jsp` to your `WebContent` directory
- visit `/Person`

### Flows
- [View ➜ Controller] User visit `/Person` & `PersonController` handles the request 
- [Controller ➜ Model] `PersonController` tries to *create* new person object based on `Person` model 
- [Controller ➜ View] `PersonController` send the response to user, passing a `person` object
- [View] `person.jsp` display the response