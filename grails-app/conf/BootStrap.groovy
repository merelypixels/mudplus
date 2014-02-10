import mudplus.DriverRequestMap

class BootStrap {

    def init = { servletContext ->
        for (String url in [
                '/', '/index', '/index.gsp', '/**/favicon.ico',
                '/**/js/**', '/**/css/**', '/**/images/**',
                '/login', '/login.*', '/login/*',
                '/logout', '/logout.*', '/logout/*']) {
            new DriverRequestMap(url: url, configAttribute: 'permitAll').save()
        }
    }
    def destroy = {
    }
}
