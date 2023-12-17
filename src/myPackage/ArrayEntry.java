package myPackage;

import java.util.Objects;

public class ArrayEntry implements Comparable<ArrayEntry> { // for page177 q11.1 , p265 q15.6
    public Integer value ;
    public  Integer arrayId;

    public ArrayEntry(Integer value, Integer arrayId){
        this.value = value;
        this.arrayId = arrayId;
    }


    @Override
    public int compareTo(ArrayEntry o) {
        int result = Integer.compare(value, o.value);
        if (result == 0)
            result = Integer.compare(arrayId, o.arrayId);
        return result;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == null || !(obj instanceof ArrayEntry))
            return false;
        if (this == obj)
            return true;
        ArrayEntry that = (ArrayEntry) obj;
        return this.value == that.value && this.arrayId == that.arrayId;
    }

    @Override
    public int hashCode(){
        return Objects.hash(value,arrayId);
    }




}
