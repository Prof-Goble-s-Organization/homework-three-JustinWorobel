public class Pair <X, Y>{
    private X first;
    private Y second;


    public Pair(X initFirst, Y initSecond){
        first = initFirst;
        second = initSecond;
    }


    public X getFirst(){
        return first;
    }

    public Y getSecond(){
        return second;
    }

    public void setFirst(X fir){
        first = fir;
    }

    public void setSecond(Y sec){
        second = sec;
    }

    public static void main(String[] args){
        Pair intPair = new Pair(3, 4);
        Pair mixPair = new Pair(3, 4.5);
        Pair pairPair = new Pair(intPair, mixPair);
        
    }
}
