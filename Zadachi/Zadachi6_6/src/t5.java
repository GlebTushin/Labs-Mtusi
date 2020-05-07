public class t5 {public static String getHashTags(String Line)
{String max="";
String max1="";
String max2="";
for(String word:Line.split(" ")){
    if (word.length()>max.length()){
        max2=max1;
        max1=max;
        max=word;
    }
    else if (word.length()>max1.length()){
        max2=max1;
        max1=word;
    }
   else if (word.length()>max2.length()){
        max2=word;
    }
}
return "#"+max+" #"+max1+" #"+max2;

}


}

