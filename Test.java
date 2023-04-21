class vehicle {
    void ruun(){
        System.out.println("Transporting passangers");
    }
}
class TukTuk extends vehicle{
    void run(){
        System.out.println("Tuktuks are slow");
    }
}
class Test{
    public static void main (String[] args){
        TukTuk tuk = new TukTuk();
        tuk.run();
        tuk.ruun();
        }
}

