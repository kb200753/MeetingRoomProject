public class meetingRoom2 {
    private double time;
    private String timeCode;
    private String nameOfClient;
    private double price;



    public meetingRoom2(double time, String timeCode, String nameOfClient, double price){
        this.time = time;
        this.timeCode = timeCode;
        this.nameOfClient = nameOfClient;
        this.price = price;


    }
    public String toString(){
        return time + ", " + timeCode + ", " + nameOfClient + ", " + price ;
    }

    public double getTime() {
        return time;
    }

    public String getTimeCode() {
        return timeCode;
    }

    public String getNameOfClient() {
        return nameOfClient;
    }

    public double getPrice() {
        return price;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void setTimeCode(String timeCode) {
        this.timeCode = timeCode;
    }

    public void setNameOfClient(String nameOfClient) {
        this.nameOfClient = nameOfClient;
    }

    public void setPrice(double price) {
        this.price = price;
    }

}
