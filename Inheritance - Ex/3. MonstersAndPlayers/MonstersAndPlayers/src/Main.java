import hero.BladeKnight;
import hero.Elf;

public class Main {
    public static void main(String[] args) {
        Elf elf = new Elf("Ivan", 12);
        BladeKnight bladeKnight = new BladeKnight("Blade", 50);
        System.out.println(bladeKnight);
    }
}