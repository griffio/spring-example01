package griffio.beans.inject;

import java.lang.annotation.ElementType;

@java.lang.annotation.Target({ElementType.FIELD, java.lang.annotation.ElementType.TYPE})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@java.lang.annotation.Documented
@org.springframework.beans.factory.annotation.Qualifier
public @interface SystemComponent {
    java.lang.String value() default "";
}
