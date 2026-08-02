package set3;/*import java.util.Scanner;
public class players{
    String Name;
    int Number;
    int Age;
    double Strikerate;
    void setdata(String N,int E,int A,double S){
        Name=N;
        Number=E;
        Age=A;
        Strikerate=S;
    }
    void display(){
        System.out.println("Name="+Name+"Number="+Number+"Age="+Age+"strikerate="+Strikerate);
    }
}
class playerdemo{
    public static void main(String[]args){
        players p[] = new players[15];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<15;i++){
            p[i] = new players();
            System.out.println("enter player name");
            String N=sc.nextLine();
            System.out.println("enter player number");
            int E=sc.nextInt();
            System.out.println("enter player Age");
            int A=sc.nextInt();
            System.out.println("enter player strike rate");
            double S=sc.nextDouble();
            p[i].setdata(N,E,A,S);
        }
        for(int i=0;i<15;i++)
            p[i].display();
    }
}*/
import java.util.Scanner;

class players {
    String Name;
    int Number;
    int Age;
    double Strikerate;

    void setdata(String N, int E, int A, double S) {
        Name = N;
        Number = E;
        Age = A;
        Strikerate = S;
    }

    void display() {
        System.out.println("Name = " + Name + ", Number = " + Number + ", Age = " + Age + ", Strike Rate = " + Strikerate);
    }
}

class playerdemo {
    public static void main(String[] args) {
        players[] p = new players[15];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 15; i++) {
            p[i] = new players();

            System.out.println("Enter player name:");
            String N = sc.nextLine();

            System.out.println("Enter player number:");
            int E = sc.nextInt();

            System.out.println("Enter player age:");
            int A = sc.nextInt();

            System.out.println("Enter player strike rate:");
            double S = sc.nextDouble();

            p[i].setdata(N, E, A, S);
        }

        System.out.println("\n--- Player Details ---");
        for (int i = 0; i < 15; i++) {
            p[i].display();
        }

        sc.close();
    }
}
