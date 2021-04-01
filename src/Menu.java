public class Menu {
    private String name;
    private String foodCode;
    private String type;
    private double price;



    public Menu(String name, String foodCode, String type, double price){
        this.name = name;
        this.foodCode = foodCode;
        this.type = type;
        this.price = price;


    }
    public String toString(){
        return name + ", " + foodCode + ", " + type + ", " + price ;
    }

    public String getName() {
        return name;
    }

    public String getFoodCode() {
        return foodCode;
    }

    public String getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }





    public void setName(String name) {
        this.name = name;
    }

    public void setFoodCode(String foodCode) {
        this.foodCode = foodCode;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(double price) {
        this.price = price;
    }





}
