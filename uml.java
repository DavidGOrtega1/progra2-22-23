@startuml
Class Student{
        -String name
        -String surname
        -String id
        -float grade
        +Student(String name, String surname, String id, float grade)
        +setGrade(float grade)
        +setName(String name)
        +setSurname(String surname)
        +setId(id String)
        +getId()
        +getName()
        +getSurname()
        +getGrade()
        }
@enduml