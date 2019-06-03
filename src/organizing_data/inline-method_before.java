package organizing_data;

class PizzaDelivery {
    // ...
    int getRating() {
        return moreThanFiveLateDeliveries() > 5 ? 2 : 1;
    }
}