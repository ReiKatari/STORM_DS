package f1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 extends b3.o implements a4.p {

    /* renamed from: i0  reason: collision with root package name */
    public final j1.i f4543i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f4544j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f4545k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f4546l0;

    public f0(j1.i iVar) {
        this.f4543i0 = iVar;
    }

    @Override // b3.o
    public final void G0() {
        zc.x.v(C0(), null, null, new a9.b(11, null, this), 3);
    }

    @Override // a4.p
    public final void z(a4.r0 r0Var) {
        r0Var.a();
        k3.b bVar = r0Var.A;
        if (this.f4544j0) {
            k3.d.P(r0Var, i3.s.b(i3.s.f6681b, 0.3f), bVar.c(), 0.0f, 122);
        } else if (!this.f4545k0 && !this.f4546l0) {
        } else {
            k3.d.P(r0Var, i3.s.b(i3.s.f6681b, 0.1f), bVar.c(), 0.0f, 122);
        }
    }
}
