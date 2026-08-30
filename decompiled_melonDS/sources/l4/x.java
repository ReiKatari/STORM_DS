package l4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a  reason: collision with root package name */
    public final long f8914a;

    /* renamed from: b  reason: collision with root package name */
    public final long f8915b;

    public x(long j2, long j10) {
        this.f8914a = j2;
        this.f8915b = j10;
        x4.p[] pVarArr = x4.o.f14348b;
        if ((j2 & 1095216660480L) == 0) {
            r4.a.a("width cannot be TextUnit.Unspecified");
        }
        if ((j10 & 1095216660480L) == 0) {
            r4.a.a("height cannot be TextUnit.Unspecified");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof x) {
            x xVar = (x) obj;
            if (x4.o.a(this.f8914a, xVar.f8914a) && x4.o.a(this.f8915b, xVar.f8915b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        x4.p[] pVarArr = x4.o.f14348b;
        return Integer.hashCode(4) + w.d.f(this.f8915b, Long.hashCode(this.f8914a) * 31, 31);
    }

    public final String toString() {
        return "Placeholder(width=" + ((Object) x4.o.d(this.f8914a)) + ", height=" + ((Object) x4.o.d(this.f8915b)) + ", placeholderVerticalAlign=" + ((Object) "Center") + ')';
    }
}
