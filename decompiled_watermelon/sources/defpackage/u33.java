package defpackage;

import android.os.Bundle;
import java.io.Serializable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u33  reason: default package */
/* loaded from: classes.dex */
public final class u33 extends z44 {
    public final Class q;
    public final Class r;

    public u33(Class cls) {
        super(true);
        this.q = cls;
        if (Serializable.class.isAssignableFrom(cls)) {
            if (cls.isEnum()) {
                this.r = cls;
                return;
            } else {
                f81.g(cls, " is not an Enum type.");
                throw null;
            }
        }
        f81.g(cls, " does not implement Serializable.");
        throw null;
    }

    @Override // defpackage.z44
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof Serializable) {
            return (Serializable) obj;
        }
        return null;
    }

    @Override // defpackage.z44
    public final String b() {
        return this.r.getName();
    }

    @Override // defpackage.z44
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
            if (gh6.g0(r5.name(), str, true)) {
                r1 = obj;
                break;
            }
            i++;
        }
        Enum r12 = r1;
        if (r12 != null) {
            return r12;
        }
        StringBuilder u = b31.u("Enum value ", str, " not found for type ");
        u.append(cls.getName());
        u.append('.');
        throw new IllegalArgumentException(u.toString());
    }

    @Override // defpackage.z44
    public final void e(Bundle bundle, String str, Object obj) {
        str.getClass();
        bundle.putSerializable(str, (Serializable) this.q.cast((Serializable) obj));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u33)) {
            return false;
        }
        return this.q.equals(((u33) obj).q);
    }

    public final int hashCode() {
        return this.q.hashCode();
    }
}
