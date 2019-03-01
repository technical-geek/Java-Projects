import java.util.HashMap;

public class DataStructures {

    String name = "hello";

    HashMap<String, Float> carSpeedMap = new HashMap<>();
    HashMap<Integer, Boolean> orderIdMap = new HashMap<>();
    HashMap<Integer, Integer> testMap = new HashMap<>();

    public void initHashMap(){

        carSpeedMap.put("Mercedes", 300f);
        carSpeedMap.put("Audi", 350f);
        carSpeedMap.put("Ferrari", 400f);

        // try using foreach  and explore all the methods on hashmap


       System.out.println(carSpeedMap.containsKey("hello"));


       orderIdMap.put(209403924,true);
       orderIdMap.put(22,false);
       orderIdMap.put(33,true);


        testMap.put(22,40);
        testMap.put(33,50);

        if(testMap.containsKey(22)){
            int result = testMap.get(22)/2;
            System.out.println(result);
        }
        else {
            System.out.println("key not found");
        }

    }

    public  void getCarAndSpeedInfo(String carName, float speed){
        carSpeedMap.put(carName,speed);
    }

}
