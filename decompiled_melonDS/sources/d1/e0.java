package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: a  reason: collision with root package name */
    public final p2.b f3556a = new p2.b(new c0[16]);

    /* renamed from: b  reason: collision with root package name */
    public final n2.f1 f3557b = n2.s.w(Boolean.FALSE);

    /* renamed from: c  reason: collision with root package name */
    public long f3558c = Long.MIN_VALUE;

    /* renamed from: d  reason: collision with root package name */
    public final n2.f1 f3559d = n2.s.w(Boolean.TRUE);

    public final void a(n2.m mVar, int i2) {
        int i10;
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-318043801);
        if (rVar.h(this)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i2;
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = n2.s.w(null);
                rVar.h0(L);
            }
            n2.w0 w0Var = (n2.w0) L;
            if (!((Boolean) this.f3559d.getValue()).booleanValue() && !((Boolean) this.f3557b.getValue()).booleanValue()) {
                rVar.X(-151918981);
            } else {
                rVar.X(-144841960);
                boolean h2 = rVar.h(this);
                Object L2 = rVar.L();
                if (h2 || L2 == eVar) {
                    L2 = new a9.d(w0Var, this, (cc.c) null, 10);
                    rVar.h0(L2);
                }
                n2.s.g(this, (mc.p) L2, rVar);
            }
            rVar.p(false);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.s0(i2, 2, this);
        }
    }
}
