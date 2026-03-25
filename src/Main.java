class AnimalDemo {
    public static void main(String[] args) {
        Animal a  = new Animal("Generic");
        Mammal m  = new Mammal("Mammal");
        Cat    c  = new Cat("Whiskers");
        Dog    d1 = new Dog("Rex");
        Dog    d2 = new Dog("Buddy");

        System.out.println(a);
        System.out.println(m);
        System.out.println(c);
        System.out.println(d1);

        System.out.print(c.getName() + " says: "); c.greets();
        System.out.print(d1.getName() + " says: "); d1.greets();
        System.out.print(d1.getName() + " meets " + d2.getName() + ": ");
        d1.greets(d2);
    }
}