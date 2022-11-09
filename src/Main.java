import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Player player = new Player();
        int numberOfWeapon = player.getSlotsCount();
        String weapon;
        if (numberOfWeapon == 1) {
            weapon = "вид";
        } else if (numberOfWeapon > 1 && numberOfWeapon < 5) {
            weapon = "вида";
        } else {
            weapon = "видов";
        }

        System.out.println("У тебя " + numberOfWeapon + " " + weapon + " оружия!\n" +
                "Введи цифру, чтобы выбрать оружие, либо \"-1\", чтобы выйти");

        int slot;
        while (true) {
            slot = sc.nextInt() - 1;
            if (slot == -2) {
                break;
            } else {
                player.shotWithWeapon(slot);
                System.out.println("Следующий выстрел");

            }
        }
        System.out.println("End game");
    }
}