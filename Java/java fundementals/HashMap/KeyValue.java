import java.util.HashMap;
import java.util.Set;

public class KeyValue{

    public static void main(String []args){
        HashMap<String, String> story = new HashMap<String, String>();
        story.put("Art for All" , "inspired by the true story of a young girl in Egypt");
        story.put("To Clean a Creek" , "inspired by the true story of a young boy in Brazil");
        story.put("The Happiness Project" , "inspired by the true story of a young girl in India ");
        story.put("Project Moo" , "based on the true story of how one girl from Indonesia");
        String title = story.get("Art for All");
        System.out.println("The small description is " + title);
        Set<String> keys = story.keySet();
        for ( String key : keys ){
            System.out.println(key);
            System.out.println(story.get(key));
        }
    }
}