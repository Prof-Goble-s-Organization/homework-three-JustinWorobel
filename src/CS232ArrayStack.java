public class CS232ArrayStack<X> implements CS232Stack<X> {
    private CS232ArrayList<X> list;


    public CS232ArrayStack(){
        list = new CS232ArrayList<>();
    }

    @Override
    public void push(X element){
        list.add(element);
    }
    
    @Override 
    public X pop(){
        if(list.size() == 0){
            return null;
        }
        return list.remove(list.size()-1);
    }

    @Override 
    public X peek(){
        if (list.size == 0){
            return null;
        }
        return list.get(list.size()-1);
    }

    @Override
    public int size(){
        return list.size();
    }



}
