package app.test;

public class ClassA {
    private ClassB classB;

    public ClassA(ClassB classB) {
        this.classB = classB;
    }

    public ClassA() {
    }

    public void setClassB(ClassB classB) {
        this.classB = classB;
    }
}
