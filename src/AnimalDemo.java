// ============================================================
//  Diagrama 4 — Animal / Mammal / Cat / Dog
// ============================================================

// ---- Animal (root superclass) ------------------------------
class Animal {
    private String name;

    public Animal(String name) { this.name = name; }

    public String getName() { return name; }

    @Override
    public String toString() {
        return "Animal[name=\"" + name + "\"]";
    }
}

// ---- Mammal ------------------------------------------------
class Mammal extends Animal {

    public Mammal(String name) { super(name); }

    @Override
    public String toString() {
        return "Mammal[" + super.toString() + "]";
    }
}

// ---- Cat ---------------------------------------------------
class Cat extends Mammal {

    public Cat(String name) { super(name); }

    public void greets() {
        System.out.println("Meow");
    }

    @Override
    public String toString() {
        return "Cat[" + super.toString() + "]";
    }
}

// ---- Dog ---------------------------------------------------
class Dog extends Mammal {

    public Dog(String name) { super(name); }

    public void greets() {
        System.out.println("Woof");
    }

    public void greets(Dog another) {
        System.out.println("Woooof");
    }

    @Override
    public String toString() {
        return "Dog[" + super.toString() + "]";
    }
}

