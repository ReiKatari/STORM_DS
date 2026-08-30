package e7;

import a7.k0;
import android.os.Bundle;
import java.io.Serializable;
import vc.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends k0 {

    /* renamed from: q  reason: collision with root package name */
    public final Class f4376q;

    /* renamed from: r  reason: collision with root package name */
    public final Class f4377r;

    public b(Class cls) {
        super(true);
        this.f4376q = cls;
        if (Serializable.class.isAssignableFrom(cls)) {
            if (cls.isEnum()) {
                this.f4377r = cls;
                return;
            } else {
                fj.j.d(cls, " is not an Enum type.");
                throw null;
            }
        }
        fj.j.d(cls, " does not implement Serializable.");
        throw null;
    }

    @Override // a7.k0
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof Serializable) {
            return (Serializable) obj;
        }
        return null;
    }

    @Override // a7.k0
    public final String b() {
        return this.f4377r.getName();
    }

    @Override // a7.k0
    public final Object d(String str) {
        Enum r12 = null;
        if (str.equals("null")) {
            return null;
        }
        Class cls = this.f4377r;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Object obj = enumConstants[i2];
            Enum r62 = (Enum) obj;
            r62.getClass();
            if (o.P(r62.name(), str, true)) {
                r12 = obj;
                break;
            }
            i2++;
        }
        Enum r13 = r12;
        if (r13 != null) {
            return r13;
        }
        StringBuilder u4 = w.d.u("Enum value ", str, " not found for type ");
        u4.append(cls.getName());
        u4.append('.');
        throw new IllegalArgumentException(u4.toString());
    }

    @Override // a7.k0
    public final void e(Bundle bundle, String str, Object obj) {
        str.getClass();
        bundle.putSerializable(str, (Serializable) this.f4376q.cast((Serializable) obj));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        return this.f4376q.equals(((b) obj).f4376q);
    }

    public final int hashCode() {
        return this.f4376q.hashCode();
    }
}
