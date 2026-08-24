package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dd4  reason: default package */
/* loaded from: classes.dex */
public final class dd4 extends fd4 {
    public final Class q;

    public dd4(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
            e41.f(cls, " does not implement Parcelable or Serializable.");
            throw null;
        } else {
            this.q = cls;
        }
    }

    @Override // defpackage.fd4
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        return bundle.get(str);
    }

    @Override // defpackage.fd4
    public final String b() {
        return this.q.getName();
    }

    @Override // defpackage.fd4
    public final Object d(String str) {
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // defpackage.fd4
    public final void e(Bundle bundle, String str, Object obj) {
        str.getClass();
        this.q.cast(obj);
        if (obj != null && !(obj instanceof Parcelable)) {
            if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
                return;
            }
            return;
        }
        bundle.putParcelable(str, (Parcelable) obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && dd4.class.equals(obj.getClass())) {
            return nb3.k(this.q, ((dd4) obj).q);
        }
        return false;
    }

    public final int hashCode() {
        return this.q.hashCode();
    }
}
