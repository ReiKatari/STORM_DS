package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e87  reason: default package */
/* loaded from: classes.dex */
public abstract class e87 {
    public final eu a;
    public final eu b;
    public final eu c;

    public e87(eu euVar, eu euVar2, eu euVar3) {
        this.a = euVar;
        this.b = euVar2;
        this.c = euVar3;
    }

    public abstract f87 a();

    public final Class b(Class cls) {
        String name = cls.getName();
        eu euVar = this.c;
        Class cls2 = (Class) euVar.get(name);
        if (cls2 == null) {
            String name2 = cls.getPackage().getName();
            String simpleName = cls.getSimpleName();
            Class<?> cls3 = Class.forName(name2 + "." + simpleName + "Parcelizer", false, cls.getClassLoader());
            euVar.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        eu euVar = this.a;
        Method method = (Method) euVar.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, e87.class.getClassLoader()).getDeclaredMethod("read", e87.class);
            euVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        eu euVar = this.b;
        Method method = (Method) euVar.get(name);
        if (method == null) {
            Class b = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b.getDeclaredMethod("write", cls, e87.class);
            euVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i);

    public final Parcelable f(Parcelable parcelable, int i) {
        if (!e(i)) {
            return parcelable;
        }
        return ((f87) this).e.readParcelable(f87.class.getClassLoader());
    }

    public final g87 g() {
        String readString = ((f87) this).e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (g87) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e) {
            c44.o("VersionedParcel encountered ClassNotFoundException", e);
            return null;
        } catch (IllegalAccessException e2) {
            c44.o("VersionedParcel encountered IllegalAccessException", e2);
            return null;
        } catch (NoSuchMethodException e3) {
            c44.o("VersionedParcel encountered NoSuchMethodException", e3);
            return null;
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof RuntimeException)) {
                c44.o("VersionedParcel encountered InvocationTargetException", e4);
                return null;
            }
            throw ((RuntimeException) e4.getCause());
        }
    }

    public abstract void h(int i);

    public final void i(g87 g87Var) {
        if (g87Var == null) {
            ((f87) this).e.writeString(null);
            return;
        }
        try {
            ((f87) this).e.writeString(b(g87Var.getClass()).getName());
            f87 a = a();
            try {
                d(g87Var.getClass()).invoke(null, g87Var, a);
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
                c44.o("VersionedParcel encountered ClassNotFoundException", e);
            } catch (IllegalAccessException e2) {
                c44.o("VersionedParcel encountered IllegalAccessException", e2);
            } catch (NoSuchMethodException e3) {
                c44.o("VersionedParcel encountered NoSuchMethodException", e3);
            } catch (InvocationTargetException e4) {
                if (!(e4.getCause() instanceof RuntimeException)) {
                    c44.o("VersionedParcel encountered InvocationTargetException", e4);
                    return;
                }
                throw ((RuntimeException) e4.getCause());
            }
        } catch (ClassNotFoundException e5) {
            c44.o(g87Var.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }
}
