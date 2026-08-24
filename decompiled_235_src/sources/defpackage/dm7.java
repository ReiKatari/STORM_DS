package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dm7  reason: default package */
/* loaded from: classes.dex */
public abstract class dm7 {
    public final wu a;
    public final wu b;
    public final wu c;

    public dm7(wu wuVar, wu wuVar2, wu wuVar3) {
        this.a = wuVar;
        this.b = wuVar2;
        this.c = wuVar3;
    }

    public abstract em7 a();

    public final Class b(Class cls) {
        String name = cls.getName();
        wu wuVar = this.c;
        Class cls2 = (Class) wuVar.get(name);
        if (cls2 == null) {
            String name2 = cls.getPackage().getName();
            String simpleName = cls.getSimpleName();
            Class<?> cls3 = Class.forName(name2 + "." + simpleName + "Parcelizer", false, cls.getClassLoader());
            wuVar.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        wu wuVar = this.a;
        Method method = (Method) wuVar.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, dm7.class.getClassLoader()).getDeclaredMethod("read", dm7.class);
            wuVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        wu wuVar = this.b;
        Method method = (Method) wuVar.get(name);
        if (method == null) {
            Class b = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b.getDeclaredMethod("write", cls, dm7.class);
            wuVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((em7) this).e.readParcelable(em7.class.getClassLoader());
    }

    public final fm7 g() {
        String readString = ((em7) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (fm7) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            u34.p("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            u34.p("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            u34.p("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof RuntimeException)) {
                u34.p("VersionedParcel encountered InvocationTargetException", e4);
                return null;
            }
            throw ((RuntimeException) e4.getCause());
        }
    }

    public abstract void h(int i);

    public final void i(fm7 fm7Var) {
        if (fm7Var == null) {
            ((em7) this).e.writeString(null);
            return;
        }
        try {
            ((em7) this).e.writeString(b(fm7Var.getClass()).getName());
            em7 a = a();
            try {
                d(fm7Var.getClass()).invoke(null, fm7Var, a);
                Parcel parcel = a.e;
                int i = a.i;
                if (i >= 0) {
                    int i2 = a.d.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                u34.p("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                u34.p("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                u34.p("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    u34.p("VersionedParcel encountered InvocationTargetException", e4);
                    return;
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            u34.p(fm7Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
