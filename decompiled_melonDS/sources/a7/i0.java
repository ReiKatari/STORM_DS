package a7;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i0 extends k0 {

    /* renamed from: q  reason: collision with root package name */
    public final Class f577q;

    public i0(Class cls) {
        super(true);
        if (!Parcelable.class.isAssignableFrom(cls) && !Serializable.class.isAssignableFrom(cls)) {
            fj.j.d(cls, " does not implement Parcelable or Serializable.");
            throw null;
        } else {
            this.f577q = cls;
        }
    }

    @Override // a7.k0
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        return bundle.get(str);
    }

    @Override // a7.k0
    public final String b() {
        return this.f577q.getName();
    }

    @Override // a7.k0
    public final Object d(String str) {
        throw new UnsupportedOperationException("Parcelables don't support default values.");
    }

    @Override // a7.k0
    public final void e(Bundle bundle, String str, Object obj) {
        str.getClass();
        this.f577q.cast(obj);
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
        if (obj != null && i0.class.equals(obj.getClass())) {
            return nc.k.a(this.f577q, ((i0) obj).f577q);
        }
        return false;
    }

    public final int hashCode() {
        return this.f577q.hashCode();
    }
}
