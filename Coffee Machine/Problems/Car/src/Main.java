class Car {

    int yearModel;
    String make;
    int speed;
    
    public void accelerate(){
        this.speed+=5;
    }
    
    public void brake(){
        speed = Math.max(0,speed-5);
    }
}
