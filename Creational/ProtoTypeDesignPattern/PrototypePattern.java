class Character implements Cloneable {

  private String name;
  private int health;
  private int attackPower;
  private int level;

  public Character(String name, int health, int attackPower, int level) {
    this.name = name;
    this.health = health;
    this.attackPower = attackPower;
    this.level = level;
  }

  @Override
  public Character clone() throws CloneNotSupportedException {
    return (Character) super.clone();
  }

  public void showCharacterInfo() {
    System.out.println("Character [Name=" + name +
        ", Health=" + health +
        ", AttackPower=" + attackPower +
        ", Level=" + level + "]");
  }
}

public class PrototypePattern {
  public static void main(String[] args) throws CloneNotSupportedException {

    Character warrior = new Character("Warrior", 100, 50, 1);

    System.out.println("Original Character:");
    warrior.showCharacterInfo();

    Character cloneWarrior = warrior.clone();

    System.out.println("Cloned Character:");
    cloneWarrior.showCharacterInfo();
  }
}
