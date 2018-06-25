import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

class WhileLoop2 {

    public static void main(String[] args) {
        Task34 task1 = new Task34();
        task1.run();

    }

}

class Task34 {

    public void run() {
        final Queue<String> queue = new ArrayDeque<>();
        final RandomLengthStringGenerator2 randomLengthStringGenerator = new RandomLengthStringGenerator2();

        for (int i = 0; i < 50; i++) {
            final String randomString = randomLengthStringGenerator.generateRandomString();
            queue.offer(randomString);
        }

        final QueueSplitter queueSplitter = new QueueSplitter(queue);

        final List<String> onlyOdd = queueSplitter.getOnlyOdd();
        final List<String> onlyEven = queueSplitter.getOnlyEven();

        System.out.println(onlyOdd);
        System.out.println();
        System.out.println(onlyEven);
    }

}

class QueueSplitter {

    private Queue<String> queue;

    public QueueSplitter(Queue<String> queue) {
        this.queue = queue;
    }

    public List<String> getOnlyEven() {
        final List<String> result = new ArrayList<>();

        for (String element : queue) {
            if (element.length() % 2 == 0) {
                result.add(element);
            }
        }
        return result;

    }

    public List<String> getOnlyOdd() {
        final List<String> result = new ArrayList<>();

        for (String element : queue) {
            if (element.length() % 2 != 0) {
                result.add(element);
            }
        }

        return result;

    }

}

class RandomLengthStringGenerator2 {

    private Random random = new Random();

    public String generateRandomString() {
        int randomLength = random.nextInt(50) + 1;

        String result = "";

        for (int i = 0; i < randomLength; i++) {
            result += "a";
        }

        return result;
    }

}