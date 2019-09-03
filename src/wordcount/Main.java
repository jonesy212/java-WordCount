// create a class

package wordcount;

public class Main
{
    public static void main(String[] args)
    

    unText = unText.replaceAll("[[\\.\\?\\!\\,\\;\\:\\{\\}\\(\\)\\']]", "");

    String[] words = unText.split(" +");
    HashMap<String, Interger> map = new HashMap<String, Integer>();
    
    for(String aWord:words)
    {
        if(!map.containsKey(aWord))
        {
            map.put(aWord, 1);
        }
        else
        {
            map.put(aWord, map.get(aWord) + 1);
        }
        //create a wordcount
        //(parameter must match words parameter)
        //() at the end must ALWAYS be there to know
        //this is a methos

        ArrayList<HashMap.Entry<String, Integer>>sortedMap = new ArrayList<HashMap.Entry<String>

    }
}