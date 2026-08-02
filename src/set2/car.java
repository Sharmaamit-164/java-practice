package set2;

class car {
    String Make;
    String Model;
    int Year;

    void setattributes(String M, String MO, int Y) {
        Make = M;
        Model = MO;
        Year = Y;
    }

    void displaycar() {
        System.out.println("Car Make:=" + Make);
        System.out.println("Car Model:=" + Model);
        System.out.println("Car year:=" + Year);
    }
}
    class main{
        public static void main(String[]args){
            car mycar = new car();
            mycar.setattributes("Toyota","corolla",2022);
            mycar.displaycar();
        }
    }

