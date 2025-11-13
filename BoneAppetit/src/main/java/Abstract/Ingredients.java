package Abstract;

public abstract class Ingredients {
    private String name;
    private double price;

    public Ingredients(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public abstract double calculatePrice();

    }

