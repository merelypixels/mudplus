package mudplus

import org.springframework.http.HttpMethod

class DriverRequestMap {

	String url
	String configAttribute
	HttpMethod httpMethod

	static mapping = {
		cache true
	}

	static constraints = {
		url blank: false, unique: 'httpMethod'
		configAttribute blank: false
		httpMethod nullable: true
	}
}
