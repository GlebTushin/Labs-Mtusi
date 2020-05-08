public class t3 {
    public static boolean canComplete(String  osn,String word) {
        int index=0;
        int i=0;
        int cout=0;
        while (i<osn.length()){
            for (int j=index;j<word.length();j++){
                if (word.charAt(j)==osn.charAt(i)){
                    index=j+1;
                    cout=1;
                    break;
                }
            }
            if (cout==0){return false;}
            cout=0;
            i=i+1;
        }

        return true;
    }
    }

