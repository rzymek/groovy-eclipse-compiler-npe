
    Internal Groovy Error --- exception in phase 'class generation' in source unit '/home/rzymek/devel/github/groovy-eclipse-compiler-npe/src/main/java/AnnotationArray.groovy' unexpected NullpointerException
    BUG! exception in phase 'class generation' in source unit '/home/rzymek/devel/github/groovy-eclipse-compiler-npe/src/main/java/AnnotationArray.groovy' unexpected NullpointerException
        at org.codehaus.groovy.control.CompilationUnit.applyToPrimaryClassNodes(CompilationUnit.java:1221)
        at org.codehaus.groovy.control.CompilationUnit.doPhaseOperation(CompilationUnit.java:646)
        at org.codehaus.groovy.control.CompilationUnit.processPhaseOperations(CompilationUnit.java:624)
        at org.codehaus.groovy.control.CompilationUnit.compile(CompilationUnit.java:601)
        at org.codehaus.jdt.groovy.internal.compiler.ast.GroovyCompilationUnitDeclaration.processToPhase(GroovyCompilationUnitDeclaration.java:202)
        at org.codehaus.jdt.groovy.internal.compiler.ast.GroovyCompilationUnitDeclaration.generateCode(GroovyCompilationUnitDeclaration.java:1707)
        at org.eclipse.jdt.internal.compiler.Compiler.process(Compiler.java:838)
        at org.eclipse.jdt.internal.compiler.ProcessTaskManager.run(ProcessTaskManager.java:137)
        at java.lang.Thread.run(Thread.java:745)
    Caused by: java.lang.NullPointerException
        at org.codehaus.groovy.classgen.AnnotationVisitor.getConstantExpression(AnnotationVisitor.java:260)
        at org.codehaus.groovy.classgen.AnnotationVisitor.visitExpression(AnnotationVisitor.java:216)
        at org.codehaus.groovy.classgen.AnnotationVisitor.visitListExpression(AnnotationVisitor.java:285)
        at org.codehaus.groovy.classgen.AnnotationVisitor.visitExpression(AnnotationVisitor.java:201)
        at org.codehaus.groovy.classgen.AnnotationVisitor.visitExpression(AnnotationVisitor.java:211)
        at org.codehaus.groovy.classgen.AnnotationVisitor.visit(AnnotationVisitor.java:79)
        at org.codehaus.groovy.classgen.ExtendedVerifier.visitAnnotation(ExtendedVerifier.java:248)
        at org.codehaus.groovy.classgen.ExtendedVerifier.visitAnnotations(ExtendedVerifier.java:139)
        at org.codehaus.groovy.classgen.ExtendedVerifier.visitClass(ExtendedVerifier.java:68)
        at org.codehaus.groovy.control.CompilationUnit$6.call(CompilationUnit.java:855)
        at org.codehaus.groovy.control.CompilationUnit.applyToPrimaryClassNodes(CompilationUnit.java:1216)
        ... 8 more
    Status ERROR: org.eclipse.jdt.core code=4 Internal groovy compiler error. BUG! exception in phase 'class generation' in source unit '/home/rzymek/devel/github/groovy-eclipse-compiler-npe/src/main/java/AnnotationArray.groovy' unexpected NullpointerException
    /home/rzymek/devel/github/groovy-eclipse-compiler-npe/src/main/java/AnnotationArray.groovy: 1 Groovy:Internal groovy compiler error.
    [INFO] -------------------------------------------------------------
    [ERROR] COMPILATION ERROR :
    [INFO] -------------------------------------------------------------
    [ERROR] /home/rzymek/devel/github/groovy-eclipse-compiler-npe/src/main/java/AnnotationArray.groovy:[1,1] 1. ERROR in /home/rzymek/devel/github/groovy-eclipse-compiler-npe/src/main/java/AnnotationArray.groovy (at line 1)
        @SuppressWarnings(Consts.ARR)
        ^
    Groovy:Internal groovy compiler error.

    [ERROR] Found 1 error and 0 warnings.
