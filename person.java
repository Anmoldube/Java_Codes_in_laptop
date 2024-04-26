public class person {
    String name;
    int age;

    // if we did not create any constructor the java will automatically create one
    // default cont" of java

    // public person(){
    // }
    // for us.

    // Example of non-parameter const"

    // public person(){
    // this.name = "Aknfkd";
    // this.age = 22;
    // }

    public person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    public void fuc() {
        System.out.println(this.name + " " + this.age);
    }

}
