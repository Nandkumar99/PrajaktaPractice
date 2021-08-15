package Javapractice;

class Bird {


    public void cat(){
        System.out.println("Mani");
    }

    public static void animal(){
        System.out.println("Chillya");
    }

    public static void main(String args[]){

        Bird b= new Bird();
        b.cat();

        Bird.animal();
    }

}
