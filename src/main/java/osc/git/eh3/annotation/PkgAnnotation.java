/**
 * 
 */
package osc.git.eh3.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author lixiangrong
 *
 */
@Target(ElementType.PACKAGE)
@Retention(RetentionPolicy.RUNTIME)
@interface PkgAnnotation {

}