import java.util.ArrayList;

class MagicDictionary {
    
    ArrayList<String> list;

    /** Initialize your data structure here. */
    public MagicDictionary() {
        list = new ArrayList<String>();
    }
    
    /** Build a dictionary through a list of words */
    public void buildDict(String[] dict) {
        for(int i=0; i<dict.length; ++i){
            list.add(dict[i]);
        }
    }
    
    /** Returns if there is any word in the trie that equals to the given word after modifying exactly one character */
    public boolean search(String word) {
        int count =0;
        for(String s : list){
            for(int i=0; i<word.length(); ++i){
                if(word.length() != s.length()){
                    break;
                }
                if(word.charAt(i)==s.charAt(i)){
                    ++count;
                }
            }
            if(count==word.length()-1){
                return true;
            }
            count=0;
        }
        return false;
    }
}

/**
 * Your MagicDictionary object will be instantiated and called as such:
 * MagicDictionary obj = new MagicDictionary();
 * obj.buildDict(dict);
 * boolean param_2 = obj.search(word);
 */