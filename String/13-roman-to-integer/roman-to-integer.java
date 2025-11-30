class Solution {
    public int romanToInt(String s) {
                HashMap<Character,Integer> h = new HashMap<Character,Integer>();
        h.put('I',1);
        h.put('V',5);
        h.put('X',10);
        h.put('L',50);
        h.put('C',100);
        h.put('D',500);
        h.put('M',1000);
        char[] ch = s.toCharArray();
        int res = h.get(ch[0]);
        for(int i=1;i<ch.length;i++){
            if(h.get(ch[i])>h.get(ch[i-1])){
                res-= h.get(ch[i-1]);
                res+= h.get(ch[i])- h.get(ch[i-1]);

            }
            else{
                res+=h.get(ch[i]);
            }
        }

return res;
    }
    }