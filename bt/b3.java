package Session01.bt;
public class b3 {
    private int age;

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Tuổi không thể âm!");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        b3 user = new b3();
        user.setAge(20);
        System.out.println("Tuổi: " + user.getAge());
    }
}