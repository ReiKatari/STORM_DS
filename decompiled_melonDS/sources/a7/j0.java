package a7;

import android.os.Bundle;
import java.io.Serializable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class j0 extends k0 {

    /* renamed from: q  reason: collision with root package name */
    public final Class f579q;

    public j0(Class cls) {
        super(true);
        if (Serializable.class.isAssignableFrom(cls)) {
            if (!cls.isEnum()) {
                this.f579q = cls;
                return;
            } else {
                fj.j.d(cls, " is an Enum. You should use EnumType instead.");
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
        return (Serializable) bundle.get(str);
    }

    @Override // a7.k0
    public String b() {
        return this.f579q.getName();
    }

    @Override // a7.k0
    public final void e(Bundle bundle, String str, Object obj) {
        Serializable serializable = (Serializable) obj;
        str.getClass();
        serializable.getClass();
        this.f579q.cast(serializable);
        bundle.putSerializable(str, serializable);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j0)) {
            return false;
        }
        return nc.k.a(this.f579q, ((j0) obj).f579q);
    }

    @Override // a7.k0
    /* renamed from: g */
    public Serializable d(String str) {
        throw new UnsupportedOperationException("Serializables don't support default values.");
    }

    public final int hashCode() {
        return this.f579q.hashCode();
    }

    public j0(int i2, Class cls) {
        super(false);
        if (Serializable.class.isAssignableFrom(cls)) {
            this.f579q = cls;
        } else {
            fj.j.d(cls, " does not implement Serializable.");
            throw null;
        }
    }
}
