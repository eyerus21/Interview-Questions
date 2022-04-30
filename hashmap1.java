import java.util.HashMap;
public class hashmap1 {
    public static void main(String [] args){
        HashMap<String, Integer> empIds= new HashMap();
        empIds.put("helen",123 );
        empIds.put("Abraham",234);

        System.out.println(empIds);

        System.out.println(empIds.get("helen"));

        System.out.println(empIds.containsKey("adu"));

        System.out.println(empIds.containsValue(7));

        empIds.put("Abraham", 7);
        System.out.println(empIds);

        empIds.replace("Abraham", 21);
        System.out.println(empIds);

        empIds.putIfAbsent("Abel",7);
        System.out.println(empIds);

        empIds.remove("helen");
        System.out.println(empIds);

    }
}
