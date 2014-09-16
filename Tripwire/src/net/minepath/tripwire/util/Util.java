package net.minepath.tripwire.util;

import java.util.UUID;

public class Util {

	public static UUID getUUID(String uuid) {
		if (uuid.length() != 32) {
			// Get player UUID from Mojang's servers
		}
		return UUID.fromString(uuid.substring(0, 8) + "-" + uuid.substring(8, 12) + "-" + uuid.substring(12, 16) + "-" + uuid.substring(16, 20) + "-" + uuid.substring(20, 32));
	}
}
