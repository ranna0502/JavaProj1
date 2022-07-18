// インスタンスフィールドとコンストラクタ
// インスタンス生成時にデータを作る

class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);

    System.out.println(person1.firstName);
    System.out.println(person1.lastName);
    System.out.println(person1.age);
    System.out.println(person1.height);
    System.out.println(person1.weight);
  }
}


class Person {
  // 以下にインスタンスフィールドを定義してください
  public String firstName;
  public String lastName;
  public int age;
  public double height;
  public double weight;

  // 以下にコンストラクタを定義し、インスタンスフィールドに値をセットしてください
  Person(String firstName,String lastName,int age,double height,double weight){
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

}


// thisはインスタンスフィールドとインスタンスメソッドに使用できる
class Person {
  public String firstName;
  public String lastName;
  public int age;
  public double height;
  public double weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }

  // printDataメソッドを定義してください
  public void printData() {
    System.out.println("私の名前は"+ this.fullName() +"です");
    System.out.println("年齢は"+ this.age +"歳です");
    System.out.println("BMIは"+ Math.round(this.bmi())+"です");
  }

}


// staticはクラスに属する時に使用
// 初期値を設定する
// 呼び出し時はクラス名.クラスフィールド名
class Person {
  // int型のクラスフィールドcountを定義し、0を代入してください
  public static int count = 0;

  public String firstName;
  public String lastName;
  public int age;
  public double height, weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    // 変数countに1を足してください
    Person.count ++;

    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }

  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
  }



  // クラスメソッド
  // クラスフィールドと同じ
  class Main {
  public static void main(String[] args) {
    Person person1 = new Person("Kate", "Jones", 27, 1.6, 50.0);
    person1.printData();

    Person person2 = new Person("John", "Smith", 65, 1.75, 80.0);
    person2.printData();

    // printCountメソッドを呼び出してください
    Person.printCount();

  }
}

class Person {
  public static int count = 0;
  public String firstName, lastName;
  public int age;
  public double height, weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    Person.count++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }

  // クラスメソッドprintCount()を定義してください
  public static void printCount(){
    System.out.println("合計"+ Person.count +"人です");
  }

}


// インスタンスに戻る
// コンストラクタをオーバーロードさせたい時は、２種類作る
// this()を使用できる
// インスタンス生成時に最適な方を選んでくれる
class Person {
  public static int count = 0;
  public String firstName;
  // インスタンスフィールドmiddleNameを定義してください
  public String middleName;

  public String lastName;
  public int age;
  public double height, weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    Person.count++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  // middleNameを受け取るコンストラクタを定義してください
  Person(String firstName,String middleName, String lastName, int age, double height, double weight) {
    this(firstName,lastName,age,height,weight);
    Person.count++;
    this.middleName = middleName;
  }

  public String fullName() {
    return this.firstName + " " + this.lastName;
  }

  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }

  public static void printCount() {
    System.out.println("合計" + Person.count + "人です");
  }
}


// ゲッター
// ゲッターメソッドを作る
// クラス外で使用する時は、インスタンス名.ゲッターメソッド名
class Person {
  private static int count = 0;
  private String firstName;
  private String middleName;
  private String lastName;
  private int age;
  private double height;
  private double weight;

  Person(String firstName, String lastName, int age, double height, double weight) {
    Person.count++;
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
  }

  Person(String firstName, String middleName, String lastName, int age, double height, double weight) {
    this(firstName, lastName, age, height, weight);
    this.middleName = middleName;
  }

  // middleNameフィールドのゲッターを定義してください
  public String getMiddleName(){
    return this.middleName;
  }

  public String fullName() {
    if (this.middleName == null) {
      return this.firstName + " " + this.lastName;
    } else {
      return this.firstName + " " + this.middleName + " " + this.lastName;
    }
  }

  public void printData() {
    System.out.println("私の名前は" + this.fullName() + "です");
    System.out.println("年齢は" + this.age + "歳です");
    System.out.println("BMIは" + Math.round(this.bmi()) + "です");
  }

  public double bmi() {
    return this.weight / this.height / this.height;
  }

  public static void printCount() {
    System.out.println("合計" + Person.count + "人です");
  }
}