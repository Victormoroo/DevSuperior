package entities;

public class Product {
  
  public String name;
  public double price;
  public int quantity;

  public double totalValueInStock() {
    return price * quantity;
  }

  public void addProducts(int quantity) {
    this.quantity += quantity;
  }

  public void removeProducts(int quantity) {
    this.quantity -= quantity;
  }

  // Reescreve a funcao toString() do Object, dessa forma evita repeticao de codigo para vizualizacao de dados
  public String toString() {
    return name + ", $" + String.format("%.2f", price) + ", " + quantity + " units, Total: $" + String.format("%.2f", totalValueInStock());
  }
}
