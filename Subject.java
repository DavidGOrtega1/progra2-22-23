public class Subject {
    private String name;
    private Student[] students;
    private boolean isOrdered;
    private int position;
    private int capacity;

    /**
     * Creates a new subject with the given name and capacity.
     * @param name The name of the subject.
     * @param capacity The maximum number of students that can be added to the subject.
     */
    public Subject(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.position = 0;
        this.isOrdered = false;
        this.students = new Student[capacity];
    }


    public void addStudent(Student student) {
        if (position < capacity) {
            students[position] = student;
            position = position + 1;
            isOrdered = false;
        }
    }
    //ಠ_ಠ
    /**
     * Returns the average grade of all the students in the subject.
     * @return The average grade of all the students in the subject.
     */
    public void orderStudents() {
        if (!isOrdered) {
            for (int i = 0; i < position; i++) {
                for (int j = i + 1; j < position; j++) {
                    if (students[i].getGrade() < students[j].getGrade()) {
                        Student temp = students[i];
                        students[i] = students[j];
                        students[j] = temp;
                    }
                }
            }
            isOrdered = true;
        }
    }

    /*
     * Returns the median grade of all the students in the subject.
     */
    public Student getStudent(int p){
        if(p<position){
            return this.students[p];
        }
        return null;
    }
    public float getMedian() {
        orderStudents();
        float median=0;
        if (position%2==1){
            int p= (position / 2);
            median=this.students[p].getGrade();
        }
        if (position%2==0){
            int p= (position / 2);
            median= (students[p].getGrade() + students[p-1].getGrade()) / 2;
        }
        return median;
    }

    public float getAverageGrade(){
        float averageGrade = 0f;
        for (int i = 0; i < position; i++) {
            averageGrade += students[i].getGrade();
        }
        return (averageGrade / (float) position);
    }


    public int getPosition() {
        return position;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }

    public boolean getIsOrdered() {
        return isOrdered;
    }
    public Student getBestStudent() {
        orderStudents();
        return students[0];
    }
    public Student getWorstStudent() {
        orderStudents();
        return students[position - 1];
    }
}