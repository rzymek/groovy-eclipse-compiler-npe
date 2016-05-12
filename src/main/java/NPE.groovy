import groovy.transform.CompileStatic

@CompileStatic
class NPE {
    def foo = (1 !== 2);
}