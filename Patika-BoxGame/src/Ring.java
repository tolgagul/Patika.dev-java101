public class Ring {
    Fighter f1;
    Fighter f2;

    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight){
        this.f1=f1;
        this.f2=f2;
        this.maxWeight= maxWeight;
        this.minWeight= minWeight;

    }

    public void run(){
        if(isCheck()){
            while(this.f1.health>0&&this.f2.health>0){
                System.out.println("====NEW ROUND====");
                if(isFirst()){
                    this.f2.health=this.f1.hit(this.f2);
                    if(isWin()){
                        break;
                    }
                    this.f1.health=this.f2.hit(this.f1);
                    if(isWin()){
                        break;
                    }
                    printScore();
                }else{
                    this.f1.health=this.f2.hit(this.f1);
                    if(isWin()){
                        break;
                    }
                    this.f2.health=this.f1.hit(this.f2);
                    if(isWin()){
                        break;
                    }
                    printScore();
                }
            }
        }else{
            System.out.println("Welterweight is not compatible!");
        }
    }

    public void printScore(){
        System.out.println("--------------------");
        System.out.println(this.f1.name + " health:"+" "+ this.f1.health);
        System.out.println(this.f2.name + " health:"+" "+ this.f2.health);
    }


    public boolean isWin(){
        if(this.f1.health==0){
            System.out.println("-------------");
            System.out.println(this.f2.name+" is the Winner!");
            return true;
        }
        if(this.f2.health==0){
            System.out.println("-------------");
            System.out.println(this.f1.name+" is the Winner!");
            return true;
        }
        return false;
    }

    public boolean isFirst(){
        double randomNumber = Math.random()*100;
        return randomNumber<=50;
    }

    public boolean isCheck(){
        return (this.f1.weight>=this.minWeight && this.f1.weight<=this.maxWeight)&&(this.f2.weight>=this.minWeight && this.f2.weight<=this.maxWeight);
    }
}