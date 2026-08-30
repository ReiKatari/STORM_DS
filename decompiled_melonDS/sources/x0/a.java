package x0;

import d0.q;
import m9.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final int f14310a;

    /* renamed from: b  reason: collision with root package name */
    public final q f14311b;

    public a(int i2, q qVar) {
        this.f14310a = i2;
        if (qVar != null) {
            this.f14311b = qVar;
        } else {
            o.i("Null cameraIdentifier");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f14310a == aVar.f14310a && this.f14311b.equals(aVar.f14311b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f14310a ^ 1000003) * 1000003) ^ this.f14311b.hashCode();
    }

    public final String toString() {
        return "Key{lifecycleOwnerHash=" + this.f14310a + ", cameraIdentifier=" + this.f14311b + "}";
    }
}
