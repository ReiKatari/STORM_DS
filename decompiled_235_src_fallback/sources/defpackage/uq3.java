package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uq3  reason: default package */
/* loaded from: classes.dex */
public final class uq3 implements defpackage.tq3 {
    public final /* synthetic */ defpackage.ue1 a;
    public final /* synthetic */ boolean b;

    public uq3(defpackage.ue1 r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.tq3
    public final int a() {
            r4 = this;
            ue1 r4 = r4.a
            cr4 r0 = r4.m()
            lo4 r0 = r0.e
            lo4 r1 = defpackage.lo4.Vertical
            if (r0 != r1) goto L1c
            cr4 r4 = r4.m()
            long r0 = r4.e()
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
        L1a:
            int r4 = (int) r0
            return r4
        L1c:
            cr4 r4 = r4.m()
            long r0 = r4.e()
            r4 = 32
            long r0 = r0 >> r4
            goto L1a
    }

    @Override // defpackage.tq3
    public final float b() {
            r2 = this;
            ue1 r2 = r2.a
            long r0 = defpackage.ii2.r(r2)
            float r2 = (float) r0
            return r2
    }

    @Override // defpackage.tq3
    public final int c() {
            r1 = this;
            ue1 r1 = r1.a
            cr4 r0 = r1.m()
            int r0 = r0.f
            int r0 = -r0
            cr4 r1 = r1.m()
            int r1 = r1.d
            int r0 = r0 + r1
            return r0
    }

    @Override // defpackage.tq3
    public final float d() {
            r2 = this;
            ue1 r2 = r2.a
            cr4 r0 = r2.m()
            int r2 = r2.n()
            long r0 = defpackage.pr4.a(r0, r2)
            float r2 = (float) r0
            return r2
    }

    @Override // defpackage.tq3
    public final defpackage.bt0 e() {
            r2 = this;
            r0 = 1
            boolean r1 = r2.b
            ue1 r2 = r2.a
            if (r1 == 0) goto L11
            bt0 r1 = new bt0
            int r2 = r2.n()
            r1.<init>(r2, r0)
            return r1
        L11:
            bt0 r1 = new bt0
            int r2 = r2.n()
            r1.<init>(r0, r2)
            return r1
    }

    @Override // defpackage.tq3
    public final java.lang.Object f(int r4, defpackage.l7 r5) {
            r3 = this;
            l7 r0 = new l7
            r1 = 0
            r2 = 3
            ue1 r3 = r3.a
            r0.<init>(r3, r4, r1, r2)
            xa4 r4 = defpackage.xa4.Default
            java.lang.Object r3 = r3.d(r4, r0, r5)
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            jg7 r5 = defpackage.jg7.a
            if (r3 != r4) goto L16
            goto L17
        L16:
            r3 = r5
        L17:
            if (r3 != r4) goto L1a
            return r3
        L1a:
            return r5
    }
}
