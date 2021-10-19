package in.spstech.springdemo;

class Student {

    private Teachable teacher;

    public Student(final Teachable teacher) {
        this.teacher = teacher;
    }

    public void study() {
        teacher.teach();
    }
}
