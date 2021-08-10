package stacksAndQueues;

public class AnimalShelter<T> {
    Queue<Animal> animalQueue = new Queue<Animal>();

    public void enqueue(Animal animal) {
        animalQueue.enqueue(animal);
    }

    public Animal dequeue(String pref) {
        Animal result = null;
        if (pref == "cat") {
            if(animalQueue.front == null){
                return null;
            }
            result = animalQueue.dequeue();
            if(result.getClass().getSimpleName() == "Cat"){
                return result;
            }
            while (animalQueue.peek().getClass().getSimpleName() != "Cat") {
                result = animalQueue.dequeue();
                if(result.getClass().getSimpleName() == "Cat"){
                    return result;
                }
                if (animalQueue.front == null) {
                    return null;
                }
            }
            return result;

        } else if (pref == "dog") {
            while (animalQueue.peek().toString() != "Dog") {
                result = animalQueue.dequeue();
                if (animalQueue.front == null) {
                    return null;
                }
            }
            return result;
        }

        return null;

    }
}
