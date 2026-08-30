package androidx.lifecycle;

import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class w0 {

    /* renamed from: a  reason: collision with root package name */
    public static final List f1497a = p7.t.y(Application.class, p0.class);

    /* renamed from: b  reason: collision with root package name */
    public static final List f1498b = p7.t.x(p0.class);

    public static final Constructor a(Class cls, List list) {
        list.getClass();
        Constructor<?>[] constructors = cls.getConstructors();
        constructors.getClass();
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            parameterTypes.getClass();
            List Q = zb.k.Q(parameterTypes);
            if (list.equals(Q)) {
                return constructor;
            }
            if (list.size() == Q.size() && Q.containsAll(list)) {
                throw new UnsupportedOperationException("Class " + cls.getSimpleName() + " must have parameters in the proper order: " + list);
            }
        }
        return null;
    }

    public static final y0 b(Class cls, Constructor constructor, Object... objArr) {
        try {
            return (y0) constructor.newInstance(Arrays.copyOf(objArr, objArr.length));
        } catch (IllegalAccessException e6) {
            m9.o.l("Failed to access ", cls, e6);
            return null;
        } catch (InstantiationException e10) {
            throw new RuntimeException("A " + cls + " cannot be instantiated.", e10);
        } catch (InvocationTargetException e11) {
            m9.o.m("An exception happened in constructor of " + cls, e11.getCause());
            return null;
        }
    }
}
