class Solution {
    public String removeOccurrences(String s, String part) {
        StringBuilder sb = new StringBuilder("");

        int n = s.length();
        int partlen = part.length();
        for(int i = 0; i < n; i++){
            sb.append(s.charAt(i));
            if(sb.length() >= partlen && sb.substring(sb.length() - partlen).equals(part)){
                sb.delete(sb.length() - partlen, sb.length());
            }
        }
        return sb.toString();
    }
}