// Design a Cache Lib (Evection policy can be provided by the client [LRU, LFU, XYZ])

Interface Evict {
    evict();
}

class LRU implements Evict {
    evict() {
        // Logic to evict the least recently used item
    }
} 

class XYZ implements Evict {
    evict() {
        // Logic to evict based on XYZ policy
    }
}

Interface CacheService {
    HashMap<String, Object> map; 
    int capacity;
    Evict evict;

    void put(key,value);
    Object get(key);
}


// class LRUCacheServiceImp implements CacheService {
//     Void put(string key, Object value) {

//     }
//     Object get(key) {

//     }
// }


class CacheServiceImp implements CacheService {
    Void put(string key, Object value) {
        if(map.size() == capacity) {
            evict.evict();
        }
        map[key] = value;
    }
    Object get(key){
        
    }
}