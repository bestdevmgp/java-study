package abstract2;

import abstract1.AbstractAnimal;

public class Cow extends AbstractAnimal {
    @Override
    public void sound() {
        System.out.println("음매");
    }

    @Override
    public void move() {
        System.out.println("소 이동");
    }
}
