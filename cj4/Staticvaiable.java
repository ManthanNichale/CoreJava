package cj4;

public class Staticvaiable { //Difference between the Static method and non-Static method

int a=20;
static int b=40;
    void Disk(){
        System.out.println(a);
    }
   static void Show(){
        System.out.println(b);//static method not allow the non-static variable.
    }

    public static void main(String[] args) {
        Staticvaiable obj = new Staticvaiable();
        obj.Disk();

        Staticvaiable.Show();




    }
}
