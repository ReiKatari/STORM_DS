package e8;

import a1.e;
import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import m9.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    public final e f4403a;

    /* renamed from: b  reason: collision with root package name */
    public final e f4404b;

    /* renamed from: c  reason: collision with root package name */
    public final e f4405c;

    public a(e eVar, e eVar2, e eVar3) {
        this.f4403a = eVar;
        this.f4404b = eVar2;
        this.f4405c = eVar3;
    }

    public abstract b a();

    public final Class b(Class cls) {
        String name = cls.getName();
        e eVar = this.f4405c;
        Class cls2 = (Class) eVar.get(name);
        if (cls2 == null) {
            String name2 = cls.getPackage().getName();
            String simpleName = cls.getSimpleName();
            Class<?> cls3 = Class.forName(name2 + "." + simpleName + "Parcelizer", false, cls.getClassLoader());
            eVar.put(cls.getName(), cls3);
            return cls3;
        }
        return cls2;
    }

    public final Method c(String str) {
        e eVar = this.f4403a;
        Method method = (Method) eVar.get(str);
        if (method == null) {
            System.currentTimeMillis();
            Method declaredMethod = Class.forName(str, true, a.class.getClassLoader()).getDeclaredMethod("read", a.class);
            eVar.put(str, declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public final Method d(Class cls) {
        String name = cls.getName();
        e eVar = this.f4404b;
        Method method = (Method) eVar.get(name);
        if (method == null) {
            Class b10 = b(cls);
            System.currentTimeMillis();
            Method declaredMethod = b10.getDeclaredMethod("write", cls, a.class);
            eVar.put(cls.getName(), declaredMethod);
            return declaredMethod;
        }
        return method;
    }

    public abstract boolean e(int i2);

    public final Parcelable f(Parcelable parcelable, int i2) {
        if (!e(i2)) {
            return parcelable;
        }
        return ((b) this).f4407e.readParcelable(b.class.getClassLoader());
    }

    public final c g() {
        String readString = ((b) this).f4407e.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (c) c(readString).invoke(null, a());
        } catch (ClassNotFoundException e6) {
            o.m("VersionedParcel encountered ClassNotFoundException", e6);
            return null;
        } catch (IllegalAccessException e10) {
            o.m("VersionedParcel encountered IllegalAccessException", e10);
            return null;
        } catch (NoSuchMethodException e11) {
            o.m("VersionedParcel encountered NoSuchMethodException", e11);
            return null;
        } catch (InvocationTargetException e12) {
            if (!(e12.getCause() instanceof RuntimeException)) {
                o.m("VersionedParcel encountered InvocationTargetException", e12);
                return null;
            }
            throw ((RuntimeException) e12.getCause());
        }
    }

    public abstract void h(int i2);

    public final void i(c cVar) {
        if (cVar == null) {
            ((b) this).f4407e.writeString(null);
            return;
        }
        try {
            ((b) this).f4407e.writeString(b(cVar.getClass()).getName());
            b a10 = a();
            try {
                d(cVar.getClass()).invoke(null, cVar, a10);
                Parcel parcel = a10.f4407e;
                int i2 = a10.f4411i;
                if (i2 >= 0) {
                    int i10 = a10.f4406d.get(i2);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i10);
                    parcel.writeInt(dataPosition - i10);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e6) {
                o.m("VersionedParcel encountered ClassNotFoundException", e6);
            } catch (IllegalAccessException e10) {
                o.m("VersionedParcel encountered IllegalAccessException", e10);
            } catch (NoSuchMethodException e11) {
                o.m("VersionedParcel encountered NoSuchMethodException", e11);
            } catch (InvocationTargetException e12) {
                if (!(e12.getCause() instanceof RuntimeException)) {
                    o.m("VersionedParcel encountered InvocationTargetException", e12);
                    return;
                }
                throw ((RuntimeException) e12.getCause());
            }
        } catch (ClassNotFoundException e13) {
            o.m(cVar.getClass().getSimpleName().concat(" does not have a Parcelizer"), e13);
        }
    }
}
