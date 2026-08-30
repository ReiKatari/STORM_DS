package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cu5  reason: default package */
/* loaded from: classes.dex */
public abstract class cu5 {
    public static final List a = l07.c0(Application.class, pt5.class);
    public static final List b = l07.b0(pt5.class);

    public static final Constructor a(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List F0 = nu.F0(parameterTypes);
            if (list.equals(F0)) {
                return constructor;
            }
            if (list.size() == F0.size() && F0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final ra7 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (ra7) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            c44.n("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            c44.o("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
