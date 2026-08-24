package defpackage;

import android.os.Bundle;
import java.io.Serializable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ed4  reason: default package */
/* loaded from: classes.dex */
public class ed4 extends fd4 {
    public final Class q;

    public ed4(Class cls) {
        super(true);
        if (Serializable.class.isAssignableFrom(cls)) {
            if (!cls.isEnum()) {
                this.q = cls;
                return;
            } else {
                e41.f(cls, " is an Enum. You should use EnumType instead.");
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
        return (Serializable) bundle.get(str);
    }

    @Override // defpackage.fd4
    public String b() {
        return this.q.getName();
    }

    @Override // defpackage.fd4
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
        if (!(obj instanceof ed4)) {
            return false;
        }
        return nb3.k(this.q, ((ed4) obj).q);
    }

    @Override // defpackage.fd4
    /* renamed from: g */
    public Serializable d(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.q.hashCode();
    }

    public ed4(int i, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.q = cls;
        } else {
            e41.f(cls, " does not implement Serializable.");
            throw null;
        }
    }
}
