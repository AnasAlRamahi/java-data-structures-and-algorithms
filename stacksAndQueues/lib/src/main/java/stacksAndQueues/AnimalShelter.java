package stacksAndQueues;

public class AnimalShelter<T> {
    Queue<Animal> animalQueue = new Queue<Animal>();

    public void enqueue(Animal animal) {
        animalQueue.enqueue(animal);
    }

    public Animal dequeue(String pref) {
        Animal result = null;
        Queue<Animal> secondQueue = new Queue<Animal>();

        while (!animalQueue.peek().getClass().getSimpleName().equalsIgnoreCase(pref) && animalQueue.front != null) {
            secondQueue.enqueue(animalQueue.dequeue());
        }

        result = animalQueue.dequeue();

        while (animalQueue.front != null) {
            secondQueue.enqueue(animalQueue.dequeue());
        }

        animalQueue = secondQueue;

        return result;
    }
}
