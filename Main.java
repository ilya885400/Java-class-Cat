
class Main {
  public static void main(String[] args) {
    Cat myCat = new Cat("Томат", 0, "Лиза");
    
    myCat.miay();
    myCat.jump();
    myCat.drink_milk();
    
  }
}


class Cat{
  
  private String name;
  private int age;
  private String master;
  
  Cat(String _name, int _age, String _master){
    name = _name;
    age = _age;
    master = _master;
    if (age <0){
      age = 0;
    }
  }
  
  void miay(){
    if (age<1){
      System.out.println("Мяяяяяу");
    }
    else{
      System.out.println("Mi-a-y");
    }
  }
  void jump(){
    System.out.println("(*jump)");
  }
  void drink_milk(){
    System.out.println("(*drink milk)");
  }
  
}
