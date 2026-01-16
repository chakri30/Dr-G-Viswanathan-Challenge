import java.util.*;
public class substringwithconcatenationofallwods {
    public List findSubstring(String s, String[] words){
        List ans = new ArrayList();
        int len = words[0].length();
        Map<String, Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        for(int i = 0; i <= s.length() - len * words.length; i++){
            Map<String, Integer> copy = new HashMap<>(map);
            for(int j = 0; j < words.length; j++){
                String sub = s.substring(i + j * len,i + j * len + len);
                if(copy.containsKey(sub)){
                    int count = copy.get(sub);
                    if(count == 1) copy.remove(sub);
                    else copy.put(sub,count - 1);
                    if(copy.isEmpty()){
                        ans.add(i);
                        break;
                    }

                }else{
                    break;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        String[] words = new String[n];
        for(int i = 0; i < n; i++){
            words[i] = sc.next();
        }
        substringwithconcatenationofallwods solution = new substringwithconcatenationofallwods();
        List result = solution.findSubstring(s,words);
        System.out.print(result);
}
}