package Files;

public class Student {
    private String name;
    private Long age;
    private Long type;

    public Student(String name, Long age, Long type){
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public Student(){
    }

    public String getName(){
        return name;
    }

    public void setName(String name ){
        this.name = name;
    }

    public Long getAge(){
        return age;
    }

    public void setAge(Long age){
        this.age = age;
    }

    public Long getType(){
        return type;
    }

    public void setType(){
        this.name=name;
    }

    public String toString(){
        return "Student={"+
                "name='"+name+'\''+
                ", age="+age+
                ", type="+type+
                '}';
    }
}
