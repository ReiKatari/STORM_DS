package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 implements x1 {
    public final mc.l A;
    public g0 B;

    public f0(mc.l lVar) {
        this.A = lVar;
    }

    @Override // n2.x1
    public final void a() {
        this.B = (g0) this.A.k(s.f10021c);
    }

    @Override // n2.x1
    public final void c() {
        g0 g0Var = this.B;
        if (g0Var != null) {
            g0Var.dispose();
        }
        this.B = null;
    }

    @Override // n2.x1
    public final void b() {
    }
}
