@startuml
Class Subject{
        -String name
        -student[] students
        -boolean isOrdered
        -int position
        -int capacity
        +setCapacity(int capacity)
        +setName(String name)
        +getName()
        +getCapacity()
        +getStudents()
        +getPosition()
        +setPosition(int position)
        +setOrdered(boolean ordered)
        +getOrdered()
        +setStudents(Student[] students)
        +getStudents()
        +addStudent(Student student)
        +orderStudents()
        +getMedian()
        +getAverage()
        +getBestStudent()
        +getWorstStudent()
        }
@enduml
