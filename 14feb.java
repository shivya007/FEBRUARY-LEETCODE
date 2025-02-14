class ProductOfNumbers {
    ArrayList<Integer> list;
    int n;
    public ProductOfNumbers() {
        list = new ArrayList<>();
        n = 0;
    }
    
    public void add(int num) {
        if(num == 0) {
            list.clear();
            n = 0;
        }
        else {
            if(list.isEmpty()){
                list.add(num);
            }
            else{
                list.add(list.get(n-1) * num);
            }
            n++;
        }
    }
    
    public int getProduct(int k) {
        if(k > n) return 0;
        if(k == n) return list.get(n-1);
        return list.get(n-1) / list.get(n - k - 1);



        /*int prod = 1;
        int i = 1;
        while( k > 0){
            prod *= list.get(list.size()- i);
            if(prod == 0) return 0;
            i++;
            k--;
        }
        return prod;*/
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */