package h0;

import d0.v1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    public final v1 f5835a;

    public d(v1 v1Var) {
        this.f5835a = v1Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof d) || !this.f5835a.equals(((d) obj).f5835a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f5835a.hashCode();
    }

    public final String toString() {
        return "UnsupportedUseCase(unsupportedUseCase=" + this.f5835a + ')';
    }
}
