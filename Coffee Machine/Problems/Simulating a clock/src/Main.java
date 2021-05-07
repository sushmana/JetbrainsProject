class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
     if(this.minutes!=59){
         this.minutes+=1;
     }
     else{
        if(hours!=12){
            this.hours+=1;
            this.minutes=0;
        }
        else{
            this.hours=1;
            this.minutes=0;
        }
         
     }
    }
}
