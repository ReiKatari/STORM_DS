package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x44  reason: default package */
/* loaded from: classes.dex */
public final class x44 extends z44 {
    public final Class q;

    public x44(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
            f81.g(cls, " does not implement Parcelable or Serializable.");
            throw null;
        } else {
            this.q = cls;
        }
    }

    @Override // defpackage.z44
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        return bundle.get(str);
    }

    @Override // defpackage.z44
    public final String b() {
        return this.q.getName();
    }

    @Override // defpackage.z44
    public final Object d(String str) {
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // defpackage.z44
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
        if (obj != null && x44.class.equals(obj.getClass())) {
            return b53.x(this.q, ((x44) obj).q);
        }
        return false;
    }

    public final int hashCode() {
        return this.q.hashCode();
    }
}
