package animal;

public class Human extends Animal implements Thinkable {
    private String hobby; //趣味

 // getter
    public String getHobby() {
        return hobby;
    }

    // setter
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    // 引数なしのコンストラクタ
    public Human() {
    }

 // 引数ありのコンストラクタ
    public Human(String name, int age, String hobby) {
        super(name, age);
        this.hobby = hobby;
    }
    
    @Override
    public void think() {
        System.out.println("私は" + hobby + "について考えています。");
    }
}

