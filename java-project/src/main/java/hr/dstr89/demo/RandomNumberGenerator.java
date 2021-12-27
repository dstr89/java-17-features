package hr.dstr89.demo;

import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomNumberGenerator {

    public static int randomGeneratorOldSchool(int bound) {
        Random random = new Random();
        return random.nextInt(bound);
    }

    public static int randomGeneratorNewApi(int bound) {
        RandomGenerator randomGenerator = RandomGeneratorFactory.getDefault().create();
        return randomGenerator.nextInt(bound);
    }

}
