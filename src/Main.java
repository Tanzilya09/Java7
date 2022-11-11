public class Main {
    public static Hero heroes[];
    public static void main(String[] args) {
        Medic medic = new Medic();
        medic.setDamage(0);
        medic.setHealth(2000);
        medic.setTypeSuperAbility("Medic применил суперспособность Hil");
        Magic magic = new Magic();
        magic.setDamage(100);
        magic.setHealth(2000);
        magic.setTypeSuperAbility("Magic применил суперспособность Volcanic Shield");
        Warrior warrior = new Warrior();
        warrior.setDamage(100);
        warrior.setHealth(2000);
        warrior.setTypeSuperAbility("Warrior применил суперспособность Breath of Lies ");
        heroes = new Hero[]{magic, medic, warrior};
        for (Hero hero : heroes) {
            hero.applySuperAbility(hero.getTypeSuperAbility());

        }
    }
}