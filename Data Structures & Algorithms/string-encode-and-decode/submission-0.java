class Solution {

    public String encode(List<String> strs) {
        if (strs==null||strs.size()==0)
        return "";
        StringBuilder r= new StringBuilder();
        StringBuilder data= new StringBuilder();
        for(String n:strs){
            r.append(n.length()).append(",");
            data.append(n);
        }
        r.append("#");
        return r.toString() + data.toString();

    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        if (str==null||str.length()==0)
        return result;
        List<Integer> h= new ArrayList<>();
        int i=0;
        while(str.charAt(i)!='#'){
            int j=i;
            while(str.charAt(j)!=','){
                j++;
            }
            h.add(Integer.parseInt(str.substring(i,j)));
            i=j+1;
        }
        i++;
        for(int t:h){
            result.add(str.substring(i,i+t));
            i+=t;
        }
        return result;



    }
}
