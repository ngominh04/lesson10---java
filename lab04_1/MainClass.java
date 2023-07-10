package lab04_1;
// khai báo static để dùng luôn ko cần khai báo
public class MainClass {

    public static int cong(int a,int b){return a+b;}
    public static float cong(float a,int b){return (a+b);}
    public static float cong(float a,float b){return a+b;}

    public static void main(String[] args) {
        Button button=new Button();
        ListBox listBox=new ListBox();


        System.out.println("Button");
        button.DrawWindow();
        System.out.println("List box");
        listBox.DrawWindow();

        System.out.println("--------------- USE OVERLOADING -----------------");
        System.out.println("cong int + int = "+cong(1,2));
        System.out.println("cong float + int = "+cong(1.2f,2));
        System.out.println("cong float + float = "+cong(1.5f,2.5f));

    }
}
