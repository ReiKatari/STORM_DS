package defpackage;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i56  reason: default package */
/* loaded from: classes.dex */
public abstract class i56 {
    public static final List a = hf.c0(Application.class, v46.class);
    public static final List b = hf.b0(v46.class);

    public static final Constructor a(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List T0 = fv.T0(parameterTypes);
            if (list.equals(T0)) {
                return constructor;
            }
            if (list.size() == T0.size() && T0.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final qo7 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (qo7) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e) {
            u34.o("Failed to access ", cls, e);
            return null;
        } catch (InstantiationException e2) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e2);
        } catch (InvocationTargetException e3) {
            u34.p("An exception happened in constructor of " + cls, e3.getCause());
            return null;
        }
    }
}
