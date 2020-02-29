package sweets.task1;

import java.util.*; 
class Sweets{
    String name;
    String type;
    int cost;
    int weight;
    Sweets(String name,String type,int cost,int weight){
        this.name=name;
        this.type=type;
        this.cost=cost;
        this.weight=weight;
    }
}
// sort by using the weight of the sweets
class Sortbyweight implements Comparator<Sweets> { 
    public int compare(Sweets a, Sweets b){ 
        return a.weight - b.weight; 
    } 
}
//sort by using the cost of the sweets
class Sortbycost implements Comparator<Sweets> { 
    public int compare(Sweets a, Sweets b){ 
        return a.cost - b.cost; 
    } 
}
// sort by using the type of sweets
class Sortbytype implements Comparator<Sweets> { 
    public int compare(Sweets a, Sweets b){ 
        return a.type.compareTo(b.type); 
    } 
}
