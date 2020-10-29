package cinema;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Theater {
    private String TheaterNum;
    private int price;
    private int capacity;
    private String seatsNum;
    
    public Theater(String TheaterNum, int price,int capacity,String seatsNum){
        this.TheaterNum = TheaterNum;
        this.price = price;
        this.capacity = capacity;
        this.seatsNum = seatsNum;
    }

    public String getTheaterNum() {
        return TheaterNum;
    }

    public void setTheaterNum(String TheaterNum) {
        this.TheaterNum = TheaterNum;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getSeatsNum() {
        return seatsNum;
    }

    public void setSeatsNum(String seatsNum) {
        this.seatsNum = seatsNum;
    }
    
    
    
    
}
