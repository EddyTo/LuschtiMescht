package risk.app.model;

import java.util.HashMap;
import java.util.Iterator;

public class UserList extends HashMap<Long, User> {
	public long nextId() {
		long nextId = 0;
		long itemId = 0;
		Iterator<Entry<Long, User>> it = this.entrySet().iterator();
		while(it.hasNext()) {
			Entry<Long, User> entry = it.next();
			itemId = entry.getValue().getId();
			if(nextId < itemId) {
				nextId = itemId;
			}
		}
		return ++itemId;
	}

}
