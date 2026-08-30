package defpackage;

import android.os.Bundle;
import java.io.Serializable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y44  reason: default package */
/* loaded from: classes.dex */
public class y44 extends z44 {
    public final Class q;

    public y44(Class cls) {
        super(true);
        if (Serializable.class.isAssignableFrom(cls)) {
            if (!cls.isEnum()) {
                this.q = cls;
                return;
            } else {
                f81.g(cls, " is an Enum. You should use EnumType instead.");
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
        return (Serializable) bundle.get(str);
    }

    @Override // defpackage.z44
    public String b() {
        return this.q.getName();
    }

    @Override // defpackage.z44
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        str.getClass();
        serializable.getClass();
        this.q.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y44)) {
            return false;
        }
        return b53.x(this.q, ((y44) obj).q);
    }

    @Override // defpackage.z44
    /* renamed from: g */
    public Serializable d(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.q.hashCode();
    }

    public y44(int i, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.q = cls;
        } else {
            f81.g(cls, " does not implement Serializable.");
            throw null;
        }
    }
}
