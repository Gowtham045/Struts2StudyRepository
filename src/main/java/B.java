public class B extends A{
    private String name;
    public String getNameFromB(){
        return name;
    }
    public void setNameForB(String s){
        this.name=s;
    }

    public static void main(String args[]){
        B ob=new B();
        ob.setNameForA("A");
        ob.setNameForB("B");
        System.out.println(ob.getNameFromA());
        System.out.println(ob.getNameFromB());

    }
}
