class A{
    int i,j;
    void showij(){
        System.out.println("i and j: "+i+" "+j);
    }
}
class B extends A{
    int k;
    void showk(){
        System.out.println("k: " + k);
    }
    void sum(){
        System.out.println("i+ j+ K " +(i+j+k));
    }
}
class SimpleInheritance {
    public static void main(String[] args) {
        A superOb= new A();
        B subOb = new B();
        superOb.i= 10;
        superOb.j= 20;
        System.out.println("Contantes of SuperOb: ");
        superOb.showij();
        System.out.println();
        //subclass access to all public member of it superclass
        subOb.i=7;
        subOb.j=8;
        subOb.k=9;
        System.out.println("Contents of SubOb: ");
        subOb.showij();
        subOb.showk();
        System.out.println();
        System.out.println("sum of i, j and k in SubOb: ");
        subOb.sum();
    }
}