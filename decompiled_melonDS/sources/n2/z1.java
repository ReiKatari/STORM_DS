package n2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z1 extends cc.a implements zc.s {
    public final /* synthetic */ a3.f B;
    public final /* synthetic */ a2 L;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public z1(a3.f r2, n2.a2 r3) {
        /*
            r1 = this;
            zc.r r0 = zc.r.A
            r1.B = r2
            r1.L = r3
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.z1.<init>(a3.f, n2.a2):void");
    }

    @Override // zc.s
    public final void z(cc.g gVar, Throwable th2) {
        a3.f fVar = this.B;
        a2 a2Var = this.L;
        d0.d.k0(th2, new a3.e(0, fVar, a2Var));
        zc.s sVar = (zc.s) a2Var.A.t(zc.r.A);
        if (sVar != null) {
            sVar.z(gVar, th2);
            return;
        }
        throw th2;
    }
}
