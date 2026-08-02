package set2;

class Ccar {
    String Make;
    String Model;
    int Year;

    // Default constructor
    Ccar() {
        Make = "unknown";
        Model = "not known";
        Year = 0;
    }

    // Parameterized constructor
    Ccar(String M, String MO, int Y) {
        Make = M;
        Model = MO;
        Year = Y;
    }

    void displayCcar() {
        System.out.println("Make:" + Make);
        System.out.println("Model:" + Model);
        System.out.println("Year:" + Year);
    }
}
      class MI{
        public static void main(String[]args){
            Ccar mycar1 = new Ccar();
            Ccar mycar2 = new Ccar("Honda","civic",2023);

            //Display part
            mycar1.displayCcar();
            System.out.println();
            mycar2.displayCcar();

        }
    }




