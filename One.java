import com.google.common.base.Joiner;
import redis.clients.jedis.Jedis;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
	Map<String,String> mapDb = new HashMap<>();
        mapDb.put("ONE","1");
        mapDb.put("TWO","2");
        mapDb.put("THREE","3");
        mapDb.put("FOUR","4");
	}
}
 
