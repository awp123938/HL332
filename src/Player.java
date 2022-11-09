import weapon.*;

public class Player {

    private Weapon[] weaponsSlots;

    public Player() {
        weaponsSlots = new Weapon[]{
                new Bazuka(),
                new Bomb(),
                new Revolver(),
                new Ak()
        };
    }

    public int getSlotsCount() {
        return weaponsSlots.length;
    }

    public void shotWithWeapon(int slot) {
        if (slot > weaponsSlots.length - 1) {
            System.out.println("Чувак, у тебя гораздо меньше оружия.");
        } else if (slot == -1) {
            System.out.println("Ты не выстрелил. Java любит пацифистов.");
        } else if (slot < -2) {
            System.out.println("Нет такого оружия");
        } else {
            Weapon weapon = weaponsSlots[slot];
            weapon.shot();
        }
    }
}