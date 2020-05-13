class LRUCache {
  private int capacity;  
private LinkedHashMap<Integer,Integer> map;
    public LRUCache(int capacity) {
        this.capacity=capacity;
        map= new LinkedHashMap<>();
    }
    
    public int get(int key) {
        if(map.containsKey(key)){
            int val = map.get(key);
        map.remove(key);
        map.put(key,val);
        return val;}
        else
            return -1;
    }
    
    public void put(int key, int value) {
          if(map.containsKey(key))
              map.remove(key);
        else if(map.size()==capacity)
            map.remove(map.keySet().iterator().next());
        map.put(key,value);
            
                
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */