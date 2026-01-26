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
        return dialingCode.entrySet()
            .stream().filter(e-> e.getValue().equals(country))
            .map(Map.Entry::getKey)
            .findFirst().orElse(null);
    }

    public void updateCountryDialingCode(Integer code, String country) {
        Integer oldCode = findDialingCode(country);
            if(oldCode != null){
                dialingCode.remove(oldCode);
                setDialingCode(code,country);
            }
        }
}