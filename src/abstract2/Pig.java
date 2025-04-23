package abstract2;

import abstract1.AbstractAnimal;

public class Pig extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("꿀꿀");
    }

    @Override
    public void move() {
        System.out.println("돼지 이동");
    }
}
