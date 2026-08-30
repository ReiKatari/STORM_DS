package y3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n0 implements o1 {

    /* renamed from: a  reason: collision with root package name */
    public final a1.y f14713a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ p0 f14714b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f14715c;

    public n0(p0 p0Var, Object obj) {
        this.f14714b = p0Var;
        this.f14715c = obj;
        int[] iArr = a1.n.f73a;
        this.f14713a = new a1.y();
    }

    @Override // y3.o1
    public final int a() {
        a4.o0 o0Var = (a4.o0) this.f14714b.f14721d0.g(this.f14715c);
        if (o0Var != null) {
            return ((p2.b) ((a1.f0) o0Var.n()).B).L;
        }
        return 0;
    }

    @Override // y3.o1
    public final void b(a7.b0 b0Var) {
        a4.n1 n1Var;
        b3.o oVar;
        a4.o0 o0Var = (a4.o0) this.f14714b.f14721d0.g(this.f14715c);
        if (o0Var != null && (n1Var = o0Var.A0) != null && (oVar = n1Var.f268f) != null) {
            a4.l.y(oVar, "androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", b0Var);
        }
    }

    @Override // y3.o1
    public final long c(int i2) {
        a4.o0 o0Var = (a4.o0) this.f14714b.f14721d0.g(this.f14715c);
        if (o0Var != null && o0Var.H()) {
            int i10 = ((p2.b) ((a1.f0) o0Var.n()).B).L;
            if (i2 < 0 || i2 >= i10) {
                x3.a.e("Index (" + i2 + ") is out of bound of [0, " + i10 + ')');
            }
            if (this.f14713a.b(i2)) {
                return (((a4.o0) ((a1.f0) o0Var.n()).get(i2)).B0.f348p.A << 32) | (((a4.o0) ((a1.f0) o0Var.n()).get(i2)).B0.f348p.B & 4294967295L);
            }
            return 0L;
        }
        return 0L;
    }

    @Override // y3.o1
    public final void d(int i2, long j2) {
        p0 p0Var = this.f14714b;
        a4.o0 o0Var = (a4.o0) p0Var.f14721d0.g(this.f14715c);
        if (o0Var != null && o0Var.H()) {
            int i10 = ((p2.b) ((a1.f0) o0Var.n()).B).L;
            if (i2 < 0 || i2 >= i10) {
                x3.a.e("Index (" + i2 + ") is out of bound of [0, " + i10 + ')');
            }
            if (o0Var.I()) {
                x3.a.a("Pre-measure called on node that is not placed");
            }
            a4.o0 o0Var2 = p0Var.A;
            o0Var2.f288l0 = true;
            ((b4.x) a4.s0.a(o0Var)).s((a4.o0) ((a1.f0) o0Var.n()).get(i2), j2);
            o0Var2.f288l0 = false;
            this.f14713a.a(i2);
        }
    }

    @Override // y3.o1
    public final void dispose() {
        p0.c(this.f14714b, this.f14715c);
    }
}
