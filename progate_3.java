// class,引数
class Main {
  public static void main(String[] args) {
    // 引数に「Kate Jones」を渡してください
    printData("Kate Jones");

    // 引数に「John Christopher Smith」を渡してください
    printData("John Christopher Smith");

  }

  // 引数を受け取るようにしてください
  public static void printData(String name) {
    // 「私の名前は◯◯です」と出力されるように書き換えてください
    System.out.println("私の名前は"+name+"です");

  }
}


// 引数を複数渡す時は順番通りに
class Main {
  public static void main(String[] args) {
    // それぞれ年齢に関する引数を追加してください
    printData("Kate Jones",27);
    printData("John Christopher Smith",65);
  }

  // 年齢に関する引数を受け取れるようにしてください
  public static void printData(String name,int age) {
    System.out.println("私の名前は" + name + "です");
    // 「年齢は◯◯歳です」と出力してください
    System.out.println("年齢は"+ age + "歳です");

  }
}


// 戻り値を返す
  public static void main(String[] args) {
    // fullNameメソッドの結果を変数nameに代入してください
    String name = fullName("Kate","Jones");

    // printDataの引数を書き換えてください
    printData(name, 27);

    // こちらは書き換えないでください
    printData("John Christopher Smith", 65);

  }

  public static void printData(String name, int age) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
  }

  // fullNameメソッドを定義してください
  public static String fullName(String firstName,String lastName){
    return firstName + " " + lastName;
  }

}


// メソッドのオーバーロード
// 同じメソッド名で引数が違うと定義できる
class Main {
  public static void main(String[] args) {
    printData(fullName("Kate", "Jones"), 27);

    // fullNameメソッドを用いて、printDataの引数を書き換えてください
    printData(fullName("John","Christopher","Smith"), 65);
  }

  public static void printData(String name, int age) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
  }

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  // fullNameメソッドを定義してください
  public static String fullName(String firstName,String middleName,String lastName) {
    return firstName + " " + middleName + " " + lastName;
  }

}


// メソッドを組み合わせる
// bmiメソッドをprintDataメソッドと組み合わせる
class Main {
  public static void main(String[] args) {
    printData(fullName("Kate", "Jones"), 27, 1.6, 50.0);
    printData(fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
  }

  public static void printData(String name, int age, double height, double weight) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");

    // 変数bmiに、bmiメソッドを用いてBMIを代入してください
    double bmi = bmi(height,weight);

    // 変数bmiを用いて、「BMIは◯◯です」と出力してください
    System.out.println("BMIは"+bmi+"です");

  }

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  public static String fullName(String firstName, String middleName, String lastName) {
    return firstName + " " + middleName + " " + lastName;
  }

  // bmiメソッドを定義してください
  public static double bmi(double height,double weight) {
    return weight / height / height;
  }

}


// 真偽値の戻り値
class Main {
  public static void main(String[] args) {
    printData(fullName("Kate", "Jones"), 27, 1.6, 50.0);
    printData(fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
  }

  public static void printData(String name, int age, double height, double weight) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");
    double bmi = bmi(height, weight);
    System.out.println("BMIは" + bmi + "です");

    // isHealthyメソッドの結果で条件分岐を行ってください
    if (isHealthy(bmi)) {
      System.out.println("健康です");
    }else{
      System.out.println("健康ではありません");
    }

  }

  public static String fullName(String firstName, String lastName) {
    return firstName + " " + lastName;
  }

  public static String fullName(String firstName, String middleName, String lastName) {
    return firstName + " " + middleName + " " + lastName;
  }

  public static double bmi(double height, double weight) {
    return weight / height / height;
  }

  // isHealthyメソッドを定義してください
  public static boolean isHealthy(double bmi){
    return bmi >= 18.5 && bmi < 25.0;
  }

}


// クラスの定義
// main classには実行のみ、person classにはロジックのみと切り分ける
public class Main {
  public static void main(String[] args) {
    // printDataメソッドとfullNameメソッドの呼び出しを書き換えてください
    Person.printData(Person.fullName("Kate", "Jones"), 27, 1.6, 50.0);
    Person.printData(Person.fullName("John", "Christopher", "Smith"), 65, 1.75, 80.0);
  }
}



// java.lang.Mathを読み込んでください
// ライブラリの使用
// java.langで呼び出せる外部classはimportしなくても使用できる
import java.lang.Math;

class Person {
  public static void printData(String name, int age, double height, double weight) {
    System.out.println("私の名前は" + name + "です");
    System.out.println("年齢は" + age + "歳です");
    System.out.println("身長は" + height + "mです");
    System.out.println("体重は" + weight + "kgです");
    double bmi = bmi(height, weight);
    // Mathクラスのroundメソッドを用いて、BMIを四捨五入して出力するようにしてください
    System.out.println("BMIは" + Math.round(bmi) + "です");

    if (isHealthy(bmi)) {
      System.out.println("標準値です");
    } else {
      System.out.println("標準値の範囲外です");
    }
  }
  
  
  
  
  // java.util.Scannerを読み込んでください
import java.util.Scanner;

class Main {
  public static void main (String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("名前： ");
    
    // 変数nameを定義し、コンソールから文字列を受け取って代入してください
    String name = scanner.next();
    
    // 「こんにちは◯◯さん」と出力してください
    System.out.println("こんにちは"+name+"さん");
  }
}


import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("名前：");
    // 文字列の入力を受け取ってください
    String firstName = scanner.next();
    
    System.out.print("名字：");
    // 文字列の入力を受け取ってください
    String lastName = scanner.next();
    
    System.out.print("年齢：");
    // 整数の入力を受け取ってください
    int age = scanner.nextInt();
    
    System.out.print("身長(m)：");
    // 小数の入力を受け取ってください
    double height = scanner.nextDouble();
    
    System.out.print("体重(kg)：");
    // 小数の入力を受け取ってください
    double weight = scanner.nextDouble();
    
    Person.printData(Person.fullName(firstName, lastName), age, height, weight);
  }