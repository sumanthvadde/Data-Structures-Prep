/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if(s.length !== t.length) return false;
    
    var map= new Map()
    for(const i of s){
        map.set(i, (map.get(i) || 0) +1)
    }
    
    for(const i of t){
        if(!map.has(i)) return false
        map.set(i, ((map.get(i) || 0))-1)
        if(map.get(i) === 0){
            map.delete(i)
        }
    }
    return map.size == 0
};