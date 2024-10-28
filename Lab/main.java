interface A{
    void show();
}
interface B{
    void show(String s);
}
class main implements A,B{
    public void show(){
        System.out.println("interface a");
    }
    public void show(String s){
        System.out.println("interface b "+s);
    }
    public static void main(String[] args) {
        main obj=new main();
        obj.show();
        obj.show("B");
    }
}