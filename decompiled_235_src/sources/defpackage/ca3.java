package defpackage;

import android.os.Bundle;
import java.io.Serializable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ca3  reason: default package */
/* loaded from: classes.dex */
public final class ca3 extends fd4 {
    public final Class q;
    public final Class r;

    public ca3(Class cls) {
        super(true);
        this.q = cls;
        if (Serializable.class.isAssignableFrom(cls)) {
            if (cls.isEnum()) {
                this.r = cls;
                return;
            } else {
                e41.f(cls, " is not an Enum type.");
                throw null;
            }
        }
        e41.f(cls, " does not implement Serializable.");
        throw null;
    }

    @Override // defpackage.fd4
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof Serializable) {
            return (Serializable) obj;
        }
        return null;
    }

    @Override // defpackage.fd4
    public final String b() {
        return this.r.getName();
    }

    @Override // defpackage.fd4
    public final Object d(String str) {
        Enum r1 = null;
        if (str.equals("null")) {
            return null;
        }
        Class cls = this.r;
        Object[] enumConstants = cls.getEnumConstants();
        enumConstants.getClass();
        int length = enumConstants.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Object obj = enumConstants[i];
            Enum r5 = (Enum) obj;
            r5.getClass();
            if (xs6.Z(r5.name(), str, true)) {
                r1 = obj;
                break;
            }
            i++;
        }
        Enum r12 = r1;
        if (r12 != null) {
            return r12;
        }
        StringBuilder t = i61.t("Enum value ", str, " not found for type ");
        t.append(cls.getName());
        t.append('.');
        throw new IllegalArgumentException(t.toString());
    }

    @Override // defpackage.fd4
    public final void e(Bundle bundle, String str, Object obj) {
        str.getClass();
        bundle.putSerializable(str, (Serializable) this.q.cast((Serializable) obj));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ca3)) {
            return false;
        }
        return this.q.equals(((ca3) obj).q);
    }

    public final int hashCode() {
        return this.q.hashCode();
    }
}
