package griffio.beans.inject;

import griffio.beans.unique.UniqueType;

import java.lang.annotation.ElementType;

@java.lang.annotation.Target({ElementType.TYPE, java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.PARAMETER})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
@org.springframework.beans.factory.annotation.Qualifier
public @interface SystemUniqueId {
    UniqueType value();
}
