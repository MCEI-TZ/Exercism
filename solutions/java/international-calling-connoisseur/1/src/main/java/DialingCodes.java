import java.util.Map;
import java.util.HashMap;

public class DialingCodes {
    Map<Integer,String> dialingCode = new HashMap<>();
    public Map<Integer, String> getCodes() {
        return this.dialingCode;
    }

    public void setDialingCode(Integer code, String country) {
        dialingCode.put(code,country);
    }

    public String getCountry(Integer code) {
        return dialingCode.get(code);
    }

    public void addNewDialingCode(Integer code, String country) {
        if(!dialingCode.containsKey(code) && !dialingCode.containsValue(country)) dialingCode.put(code, country);
    }

    public Integer findDialingCode(String country) {
        for(Map.Entry<Integer,String> entry : dialingCode.entrySet()){
            if(entry.getValue().equals(country)){
                return entry.getKey();
            }
        }
        return null;
    }

    public void updateCountryDialingCode(Integer code, String country) {
        for(Map.Entry<Integer, String> entry : dialingCode.entrySet()){
            if(entry.getValue().equals(country));
            dialingCode.remove(entry.getKey());
            break;
        }
        dialingCode.put(code,country);
    }
}
