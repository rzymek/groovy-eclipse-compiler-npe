
    mvn clean compile
    
Output:

    Internal Groovy Error --- exception in phase 'instruction selection' in source unit '/home/rzymek/devel/github/groovy-eclipse-compiler-npe/src/main/java/NPE.groovy' unexpected NullpointerException
    BUG! exception in phase 'instruction selection' in source unit '/home/rzymek/devel/github/groovy-eclipse-compiler-npe/src/main/java/NPE.groovy' unexpected NullpointerException
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
        at org.codehaus.groovy.transform.trait.Traits.decomposeSuperCallName(Traits.java:235)
        at org.codehaus.groovy.transform.stc.TraitTypeCheckingExtension.handleMissingMethod(TraitTypeCheckingExtension.java:55)
        at org.codehaus.groovy.transform.stc.DefaultTypeCheckingExtension.handleMissingMethod(DefaultTypeCheckingExtension.java:107)
        at org.codehaus.groovy.transform.stc.StaticTypeCheckingVisitor.findMethodOrFail(StaticTypeCheckingVisitor.java:3404)
        at org.codehaus.groovy.transform.sc.StaticCompilationVisitor.findMethodOrFail(StaticCompilationVisitor.java:301)
        at org.codehaus.groovy.transform.stc.StaticTypeCheckingVisitor.getResultType(StaticTypeCheckingVisitor.java:3312)
        at org.codehaus.groovy.transform.stc.StaticTypeCheckingVisitor.visitBinaryExpression(StaticTypeCheckingVisitor.java:528)
        at org.codehaus.groovy.ast.expr.BinaryExpression.visit(BinaryExpression.java:49)
        at org.codehaus.groovy.ast.ClassCodeVisitorSupport.visitProperty(ClassCodeVisitorSupport.java:143)
        at org.codehaus.groovy.transform.stc.StaticTypeCheckingVisitor.visitProperty(StaticTypeCheckingVisitor.java:1389)
        at org.codehaus.groovy.ast.ClassNode.visitContents(ClassNode.java:1188)
        at org.codehaus.groovy.ast.ClassCodeVisitorSupport.visitClass(ClassCodeVisitorSupport.java:52)
        at org.codehaus.groovy.transform.stc.StaticTypeCheckingVisitor.visitClass(StaticTypeCheckingVisitor.java:240)
        at org.codehaus.groovy.transform.sc.StaticCompilationVisitor.visitClass(StaticCompilationVisitor.java:110)
        at org.codehaus.groovy.transform.sc.StaticCompileTransformation.visit(StaticCompileTransformation.java:61)
        at org.codehaus.groovy.transform.ASTTransformationVisitor.visitClass(ASTTransformationVisitor.java:150)
        at org.codehaus.groovy.transform.ASTTransformationVisitor$2.call(ASTTransformationVisitor.java:227)
        at org.codehaus.groovy.control.CompilationUnit.applyToPrimaryClassNodes(CompilationUnit.java:1216)
        ... 8 more
    Status ERROR: org.eclipse.jdt.core code=4 Internal groovy compiler error. BUG! exception in phase 'instruction selection' in source unit '/home/rzymek/devel/github/groovy-eclipse-compiler-npe/src/main/java/NPE.groovy' unexpected NullpointerException
    /home/rzymek/devel/github/groovy-eclipse-compiler-npe/src/main/java/NPE.groovy: 1 Groovy:Internal groovy compiler error.
