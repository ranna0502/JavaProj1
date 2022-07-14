class Main {
  public static void main(String[] args) {
    // 「true」を用いて、「真」を表す真偽値を出力してください
    System.out.println(true);
    
    // 「false」を用いて、「偽」を表す真偽値を出力してください
    System.out.println(false);
    
    // 「==」を用いて、値を比較した結果を出力してください
    System.out.println(12/4==3);
    
    // 「!=」を用いて、値を比較した結果を出力してください
    System.out.println(12/4!=3);
    
    // 変数を定義し、値を比較した結果を代入してください
    boolean bool;
    bool = 3*9==27;
    
    // 変数boolの値を出力してください
    System.out.println(bool);
    
  }
}

class Main {
  public static void main(String[] args) {
    // 「4 + 2」と「6」を比較し、falseとなるようにしてください
    System.out.println(4+2>6);
    
    // 「4 + 2」と「6」を比較し、trueとなるようにしてください
    System.out.println(4+2>=6);
    
  }
}


class Main {
  public static void main(String[] args) {
    // trueと出力されるようにしてください
    System.out.println(true || false);
    
    // falseと出力されるようにしてください
    System.out.println(false && true);
    
    // 「8 < 5」かつ「3 >= 2」の結果を出力してください
    System.out.println(8<5 && 3 >=2);
    
    // 「8 < 5」または「3 >= 2」の結果を出力してください
    System.out.println(8<5 || 3 >=2);
    
    // 「8 < 5」でない、の結果を出力してください
    System.out.println(!(8<5));
    
  }
}

class Main {
  public static void main(String[] args) {
    // 条件式に直接trueをいれてください
    if (true) {
      System.out.println("条件式がtrueのため、出力されます");
    }
    
    // 条件式に直接falseをいれてください
    if (false) {
      System.out.println("条件式がfalseのため、出力されません");
    }
    
    int x = 5;
    // if文を用いて、変数xが2より大きいとき「xは2より大きい」と出力してください
    if (x > 2) {
      System.out.println("xは2より大きい");
    }
    
    // if文を用いて、変数xが8より大きいとき「xは8より大きい」と出力してください
    if (x > 8) {
      System.out.println("xは8より大きい");
    }
    
  }
}


class Main {
  public static void main(String[] args) {
    int number = 12;
    
    // numberが20より小さいとき、どちらでもないときの条件分岐を追加してください
    if (number < 10) {
      System.out.println("10より小さい");
    }else if(number < 20){
      System.out.println("10以上、20より小さい");
    }else{
      System.out.println("20以上");
    }
    
  }
}


class Main {
  public static void main(String[] args) {
    int n = 1;
    
    // switch文を用いて、変数nの値に応じて条件分岐をしてください
    switch (n){
      case 1:
        System.out.println("大吉です");
        break;
      case 2:
        System.out.println("吉です");
        break;
    }
  }
}

class Main {
  public static void main(String[] args) {
    int n = 0;
    
    switch (n) {
      case 1:
        System.out.println("大吉です");
        break;
      case 2:
        System.out.println("中吉です");
        break;
      // defaultを用いて、変数nの値がどのcaseにも合致しない場合の処理を記述してください
      default:
        System.out.println("凶です");
        break;
      
    }
  }
}



// while構文
class Main {
  public static void main(String[] args) {
    int number = 10;
    
    // while文を用いて、numberが0より大きい場合に繰り返す、繰り返し処理を作ってください
    while (number > 0){
      System.out.println(number);
      number -= 1;
    }
    
  }
}


// for構文
class Main {
  public static void main(String[] args) {
    // for文を用いて、繰り返し処理をつくってください
    for (int i = 1;i <= 10;i++){
      System.out.println(i+"回目のループです");
    }
    
  }
}


class Main {
  public static void main(String[] args) {
    System.out.println("=== while文 ===");
    int i = 1;
    while (i < 10) {
      // iが5の倍数のとき、繰り返し処理を終了してください
      if (i % 5 == 0){
        break;
      }
      
      System.out.println(i);
      i++;
    }
    
    System.out.println("=== for文 ===");
    for (int j = 1; j < 10; j++) {
      // jが3の倍数のとき、処理をスキップしてください
      if (j % 3 == 0){
        continue;
      }
      
      System.out.println(j);
    }
  }
}

// 配列
class Main {
  public static void main(String[] args) {
    // 変数namesに、配列を代入してください
    String names[] = {"にんじゃわんこ","ひつじ仙人","ベイビーわんこ"};
    
    // インデックス番号が0の要素を出力してください
    System.out.println(names[0]);
    
    // インデックス番号が2の要素を出力してください
    System.out.println(names[2]);
    
  }
}


class Main {
  public static void main(String[] args) {
    // 変数languagesを定義し、配列を代入してください
   
   
    String languages[] = {"Ruby", "PHP", "Python"};
    
    // インデックス番号が「1」の要素を出力してください
    System.out.println(languages[1]);
    
    // インデックス番号が「1」の要素を「Java」で上書きしてください
    languages[1] = "Java";
    
    // インデックス番号が「1」の要素を出力してください
    System.out.println(languages[1]);
    
  }
}

class Main {
  public static void main(String[] args) {
    String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
    
    // for文を用いて、「私の名前は◯◯です」と出力してください
    for (int i = 0; i < names.length; i++){
      System.out.println("私の名前は"+names[i]+"です");
    }
    
  }
}


// 拡張for文
class Main {
  public static void main(String[] args) {
    String[] names = {"にんじゃわんこ", "ひつじ仙人", "ベイビーわんこ"};
    
    // 配列用のfor文を用いて、「私の名前は◯◯です」と出力してください
    for (String name:names){
      System.out.println("私の名前は"+name+"です");
    }
    
  }
}


class Main {
  public static void main(String[] args) {
    // 変数numbersに、与えられた数字の配列を代入してください
    int numbers[] = {1, 4, 6, 9, 13, 16};
    
    int oddSum = 0;
    int evenSum = 0;
    
    // for文を用いて、配列numbersの偶数の和と奇数の和を求めてください
    for (int i = 0; i < numbers.length; i++){
      if (numbers[i] % 2 == 0){
        evenSum += numbers[i];
      }else{
        o
        ddSum += numbers[i];
      }
    }

    System.out.println("奇数の和は" + oddSum + "です");
    System.out.println("偶数の和は" + evenSum + "です");
  }
}