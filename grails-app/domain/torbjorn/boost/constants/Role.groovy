package torbjorn.boost.constants

import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
class Role {
    public final static long ADMIN = 1
    public final static long USER = 2
    static {
        System.out.println(ADMIN);
        System.out.println(USER);
    }
}
