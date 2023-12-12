import java.util.*;

public class p247q145 {
    public static void main(String[] args) {

    }

    public static void groupByAge(List<Student> students){
        Map<Integer,Integer> countByAge = new HashMap<>();
        for (Student student: students){
            if (countByAge.containsKey(student.age))
                countByAge.put(student.age,countByAge.get(student.age)+1);
            else
                countByAge.put(student.age,1);
        }

        Map<Integer,Integer> offsetByAge = new HashMap<>();
        int offset = 0;
        for (Map.Entry<Integer,Integer> entry : countByAge.entrySet()){
            offsetByAge.put(entry.getKey(), offset);
            offset += entry.getValue();
        }

        while(!offsetByAge.isEmpty()){
            Map.Entry<Integer,Integer> pos = offsetByAge.entrySet().iterator().next();
            int age = students.get(pos.getValue()).age;
            int toPos = offsetByAge.get(age);
            Collections.swap(students, pos.getValue(), toPos);

            int count = countByAge.get(age) -1;
            countByAge.put(age, count);
            if (countByAge.get(age) > 0)
                offsetByAge.put(age, toPos +1);
            else
                offsetByAge.remove(age);
        }
    }

    public static class Student{
        int age;
        String name;
        public Student(int age, String name){
            this.age = age;
            this.name = name;
        }
    }

}
