package d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x extends d0.d {

    /* renamed from: o  reason: collision with root package name */
    public final w f3316o;

    /* renamed from: p  reason: collision with root package name */
    public final androidx.lifecycle.x f3317p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(androidx.lifecycle.x xVar, w wVar) {
        super(11);
        wVar.getClass();
        this.f3316o = wVar;
        this.f3317p = xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        x xVar = (x) obj;
        if (nc.k.a(this.f3316o, xVar.f3316o) && nc.k.a(this.f3317p, xVar.f3317p)) {
            return true;
        }
        return false;
    }

    @Override // d0.d
    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f3316o.hashCode() * 31;
        androidx.lifecycle.x xVar = this.f3317p;
        if (xVar == null) {
            hashCode = 0;
        } else {
            hashCode = xVar.hashCode();
        }
        return hashCode2 + hashCode;
    }

    @Override // d0.d
    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.f3316o + ", owner=" + this.f3317p + ')';
    }
}
