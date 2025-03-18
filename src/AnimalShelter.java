import java.util.LinkedList;

public class AnimalShelter {

    enum AnimalType {
        DOG,
        CAT
    }

    static class Animal {
        public String name;
        public AnimalType type;

        public Animal(String name, AnimalType type) {
            this.name = name;
            this.type = type;
        }

        @Override
        public String toString() {
            return "Animal{" +
                    "name='" + name + '\'' +
                    ", type=" + type +
                    '}';
        }
    }

    private final LinkedList<Animal> dogQueue = new LinkedList<>();
    private final LinkedList<Animal> catQueue = new LinkedList<>();

    public AnimalShelter() {
    }

    public void enqueue(Animal animal) {
        if (animal.type == AnimalType.DOG) {
            dogQueue.add(animal);
        } else {
            catQueue.add(animal);
        }
    }

    // Returns an animal from the queue of greater size
    public Animal dequeueAny() {
        if (dogQueue.size() > catQueue.size()) {
            return dogQueue.pop();
        }
        return catQueue.pop();
    }

    public Animal dequeueDog() {
        return dogQueue.pop();
    }

    public Animal dequeueCat() {
        return catQueue.pop();
    }

    public static void main(String[] args) {
        AnimalShelter shelter = new AnimalShelter();
        shelter.enqueue(new Animal("Bear", AnimalType.DOG));
        shelter.enqueue(new Animal("Finley", AnimalType.DOG));
        shelter.enqueue(new Animal("Benji", AnimalType.DOG));
        shelter.enqueue(new Animal("Morgana", AnimalType.CAT));
        shelter.enqueue(new Animal("Garfield", AnimalType.CAT));
        shelter.enqueue(new Animal("Meowth", AnimalType.CAT));

        System.out.println(shelter.dequeueDog());
        System.out.println(shelter.dequeueDog());
        System.out.println(shelter.dequeueAny());
        System.out.println(shelter.dequeueCat());
        System.out.println(shelter.dequeueAny());
        System.out.println(shelter.dequeueAny());
    }

}
