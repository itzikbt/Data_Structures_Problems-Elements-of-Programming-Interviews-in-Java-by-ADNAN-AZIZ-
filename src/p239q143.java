import java.util.*;

public class p239q143 {
    public static void main(String[] args) {

    }

    public static class Name implements Comparable<Name>{
        String firstName;
        String lastName;
        public Name(String firstName, String lastname){
            this.firstName = firstName;
            this.lastName = lastname;
        }

        public int compareTo(Name other){
            int cmpFirst = this.firstName.compareTo(other.firstName);
            if (cmpFirst != 0)
                return cmpFirst;
            return this.lastName.compareTo(other.lastName);
        }

    }

    public static void removeFirstNameDuplicates(List<Name> names){
        Collections.sort(names);
        int idx = 0;
        for (int i = 1; i < names.size(); i++){
            if (!names.get(idx).firstName.equals(names.get(i).firstName)){
                idx++;
                names.set(idx, names.get(i));
            }
        }
        names.subList(idx+1, names.size()).clear();
    }


}
