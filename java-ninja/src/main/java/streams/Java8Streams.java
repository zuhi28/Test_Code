package streams;

//import javafx.util.Pair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

public class Java8Streams {
    private static final Logger LOG = LoggerFactory.getLogger(Java8Streams.class);
    private static final Random rand = new SecureRandom();

    public static void main(String[] args) {
//        streamsMapToMapTransformation();
//        streamsListToMapTransformation();
        streamsProcessListsInParallel();
    }

    private static void streamsProcessListsInParallel() {
        LOG.info("*******ProcessListsInParallel*******");
        List<String> list1 = Arrays.asList("a1", "a2", "a3", "a4", "a5");
        List<String> list2 = Arrays.asList("b1", "b2", "b3", "b4", "b5");
        list1.parallelStream().map(i -> randomSleep(i, 100)).forEach(i -> System.out.println(i));
    }

    private static <T> T randomSleep(T in, int range) {
        try {
            Thread.sleep(rand.nextInt(range));
        } catch (InterruptedException e) {
        }
        return in;
    }

    private static void streamsListToMapTransformation() {
        LOG.info("*******ListToMapTransformation*******");
//        Arrays.asList("a1", "a2", "b1", "c2", "c1")
//                .stream()
//                .filter(s -> s.startsWith("c2"))
//                .map(String::toUpperCase)
//                .sorted()
//                .map(i -> new Pair(i, i.length()))
//                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()))
//                .forEach((k, v) -> System.out.println(k + " = " + v));
    }

    private static void streamsMapToMapTransformation() {
        Map<String, String> map = new HashMap<>();
        map.put("1", "one");
        map.put("2", "two");
        map.put("3", "three");
        map.put("4", "four");
        LOG.info("*******MapToMapTransformation*******");
        map.entrySet().stream()
                .collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()))
                .forEach((k, v) -> System.out.println(k + " = " + v));
    }
}
