public class MathsBasics {
    int inputOne = 0;
    int inputTwo = 0;

    int add(int a, int b){
        return a+b;
    }

    int div(int a, int b){
        return a/b;
    }

    int mul(int a, int b){
        return a*b;
    }

    public static void main(String args[]){
        MathsBasics b = new MathsBasics();
        System.out.println(b.add(10,20));
        System.out.println(b.div(10,0));
        System.out.println(b.div(10,0));


    }

}
