package y3;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d1 extends a4.j1 {

    /* renamed from: a  reason: collision with root package name */
    public final mc.l f14671a;

    public d1(mc.l lVar) {
        this.f14671a = lVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [y3.e1, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f14677i0 = this.f14671a;
        long j2 = Integer.MIN_VALUE;
        oVar.f14678j0 = (j2 & 4294967295L) | (j2 << 32);
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        if (this.f14671a == ((d1) obj).f14671a) {
            return true;
        }
        return false;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        e1 e1Var = (e1) oVar;
        e1Var.f14677i0 = this.f14671a;
        long j2 = Integer.MIN_VALUE;
        e1Var.f14678j0 = (j2 & 4294967295L) | (j2 << 32);
    }

    public final int hashCode() {
        return this.f14671a.hashCode();
    }
}
