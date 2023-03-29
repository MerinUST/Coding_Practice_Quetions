static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()==b.length()){
            
        
        String x=a.toLowerCase();
        String c=b.toLowerCase();
        char[] arr1=x.toCharArray();
        char[] arr2=c.toCharArray();
        java.util.Arrays.sort(arr1);
        java.util.Arrays.sort(arr2);
        boolean w=true;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                w=false;
                break;
            }
        }
       return w;
        }
        return false;
    }
