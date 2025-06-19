//without parameters without return
class methods
{
    public void add(){
        System.out.println("the result is"+" "+(10+20));
    }
    public static void main(String[] args){
        methods m = new methods();
        m.add();
    }
}
//without parameters with return
class Methods {
    public int sub() {
        return 10 - 20;
    }

    public static void main(String[] args) {
        Methods m = new Methods();
        int result = m.sub(); 
        System.out.println("the result is"+" "+result); 
    }
}
//with parameter without return 
class Methods {
    public void mul(int a, int b) {
        int result = a * b;
        System.out.println("The result is " + result);
    }
    public static void main(String[] args) {
        Methods m = new Methods();
        m.mul(10, 20); 
    }
}
//with parameter with return
class Methods {
    public int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Methods m = new Methods();
        int result = m.div(10, 10); 
        System.out.println("The result is " + result);
    }
}
