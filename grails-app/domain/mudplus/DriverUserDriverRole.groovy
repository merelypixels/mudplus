package mudplus

import org.apache.commons.lang.builder.HashCodeBuilder

class DriverUserDriverRole implements Serializable {

	private static final long serialVersionUID = 1

	DriverUser driverUser
	DriverRole driverRole

	boolean equals(other) {
		if (!(other instanceof DriverUserDriverRole)) {
			return false
		}

		other.driverUser?.id == driverUser?.id &&
			other.driverRole?.id == driverRole?.id
	}

	int hashCode() {
		def builder = new HashCodeBuilder()
		if (driverUser) builder.append(driverUser.id)
		if (driverRole) builder.append(driverRole.id)
		builder.toHashCode()
	}

	static DriverUserDriverRole get(long driverUserId, long driverRoleId) {
		DriverUserDriverRole.where {
			driverUser == DriverUser.load(driverUserId) &&
			driverRole == DriverRole.load(driverRoleId)
		}.get()
	}

	static DriverUserDriverRole create(DriverUser driverUser, DriverRole driverRole, boolean flush = false) {
		new DriverUserDriverRole(driverUser: driverUser, driverRole: driverRole).save(flush: flush, insert: true)
	}

	static boolean remove(DriverUser u, DriverRole r, boolean flush = false) {

		int rowCount = DriverUserDriverRole.where {
			driverUser == DriverUser.load(u.id) &&
			driverRole == DriverRole.load(r.id)
		}.deleteAll()

		rowCount > 0
	}

	static void removeAll(DriverUser u) {
		DriverUserDriverRole.where {
			driverUser == DriverUser.load(u.id)
		}.deleteAll()
	}

	static void removeAll(DriverRole r) {
		DriverUserDriverRole.where {
			driverRole == DriverRole.load(r.id)
		}.deleteAll()
	}

	static mapping = {
		id composite: ['driverRole', 'driverUser']
		version false
	}
}
