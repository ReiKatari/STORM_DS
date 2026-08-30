package l4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: a  reason: collision with root package name */
    public final z f8778a;

    /* renamed from: b  reason: collision with root package name */
    public final y f8779b;

    public a0(z zVar, y yVar) {
        this.f8778a = zVar;
        this.f8779b = yVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (nc.k.a(this.f8779b, a0Var.f8779b) && nc.k.a(this.f8778a, a0Var.f8778a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i2;
        int i10 = 0;
        z zVar = this.f8778a;
        if (zVar != null) {
            i2 = zVar.hashCode();
        } else {
            i2 = 0;
        }
        int i11 = i2 * 31;
        y yVar = this.f8779b;
        if (yVar != null) {
            i10 = yVar.hashCode();
        }
        return i11 + i10;
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f8778a + ", paragraphSyle=" + this.f8779b + ')';
    }
}
