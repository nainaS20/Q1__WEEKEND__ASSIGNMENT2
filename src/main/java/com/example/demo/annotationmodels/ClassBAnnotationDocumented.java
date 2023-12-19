package com.example.demo.annotationmodels;

import com.example.demo.annotationinterface.ClassDocumentation;
import com.example.demo.annotationinterface.MethodDocumentation;
import com.example.demo.annotationinterface.MethodDocumentation;

/**
 * This is Case 2 class Documentation.
 *
 * @ClassDocumentation "Case 2 - Annotation and Documentation"
 */
@ClassDocumentation("case 2 class annotation")
public class ClassBAnnotationDocumented {

    /**
     * This is Case 2 method 1 Documentation.
     *
     * @MethodDocumentation "case 2 - Annotation and Documentation"
     */
    @MethodDocumentation("case 2 method 1 annotation")
    public void case2method1() {
        System.out.println("case 2 method 1");
    }

    /**
     * This is Case 2 method 2 Documentation.
     *
     * @MethodDocumentation "case 2 - Annotation and Documentation"
     */
    @MethodDocumentation("case 2 method 1 annotation")
    public void case2method2() {
        System.out.println("case 2 method 1");
    }
}