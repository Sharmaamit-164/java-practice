package set2;

class cardisplay {
        String Make;
        String Model;
        int Year;

        // Default constructor
        cardisplay() {
            Make = "unknown";
            Model = "not known";
            Year = 0;
        }

        // Parameterized constructor
        cardisplay(String M, String MO, int Y) {
            Make = M;
            Model = MO;
            Year = Y;
        }

        void displayInfo() {
            System.out.println("Make:" + Make);
            System.out.println("Model:" + Model);
            System.out.println("Year:" + Year);
        }
    }
    class MIdemo{
        public static void main(String[]args){
            cardisplay mycar1 = new cardisplay();
            mycar1.displayInfo();
            cardisplay mycar2 = new cardisplay("Honda","civic",2023);
            mycar2.displayInfo();



        }
    }






