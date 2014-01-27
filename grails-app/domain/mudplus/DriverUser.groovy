package mudplus

import mudplus.things.KnownPhysicalThing

class DriverUser {

	transient springSecurityService

	String username
	String password
	boolean enabled = true
	boolean accountExpired
	boolean accountLocked
	boolean passwordExpired
    KnownPhysicalThing currentBody
    private String knownIpAddresses
    Date lastLoggedIn
    Date lastLoggedOut

    static hasMany = [ linkedBodies : KnownPhysicalThing, authorizedSymultaneousUsers: DriverUser]

	static transients = ['springSecurityService']

	static constraints = {
		username blank: false, unique: true
		password blank: false
	}

	static mapping = {
		password column: '`password`'
	}

	Set<DriverRole> getAuthorities() {
		DriverUserDriverRole.findAllByDriverUser(this).collect { it.driverRole } as Set
	}

	def beforeInsert() {
		encodePassword()
	}

	def beforeUpdate() {
		if (isDirty('password')) {
			encodePassword()
		}
	}

	protected void encodePassword() {
		password = springSecurityService.encodePassword(password)
	}
}
