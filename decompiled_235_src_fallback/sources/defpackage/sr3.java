package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sr3  reason: default package */
/* loaded from: classes.dex */
public final class sr3 implements defpackage.tq3 {
    public final /* synthetic */ defpackage.ip3 a;

    public sr3(defpackage.ip3 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.tq3
    public final int a() {
            r4 = this;
            ip3 r4 = r4.a
            wo3 r0 = r4.h()
            lo4 r0 = r0.q
            lo4 r1 = defpackage.lo4.Vertical
            if (r0 != r1) goto L1c
            wo3 r4 = r4.h()
            long r0 = r4.e()
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
        L1a:
            int r4 = (int) r0
            return r4
        L1c:
            wo3 r4 = r4.h()
            long r0 = r4.e()
            r4 = 32
            long r0 = r0 >> r4
            goto L1a
    }

    @Override // defpackage.tq3
    public final float b() {
            r1 = this;
            ip3 r1 = r1.a
            int r0 = r1.g()
            zo3 r1 = r1.d
            ss4 r1 = r1.c
            int r1 = r1.h()
            int r0 = r0 * 500
            int r0 = r0 + r1
            float r1 = (float) r0
            return r1
    }

    @Override // defpackage.tq3
    public final int c() {
            r1 = this;
            ip3 r1 = r1.a
            wo3 r0 = r1.h()
            int r0 = r0.n
            int r0 = -r0
            wo3 r1 = r1.h()
            int r1 = r1.r
            int r0 = r0 + r1
            return r0
    }

    @Override // defpackage.tq3
    public final float d() {
            r2 = this;
            ip3 r2 = r2.a
            int r0 = r2.g()
            zo3 r1 = r2.d
            ss4 r1 = r1.c
            int r1 = r1.h()
            boolean r2 = r2.c()
            if (r2 == 0) goto L1c
            int r0 = r0 * 500
            int r0 = r0 + r1
            float r2 = (float) r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 + r0
            return r2
        L1c:
            int r0 = r0 * 500
            int r0 = r0 + r1
            float r2 = (float) r0
            return r2
    }

    @Override // defpackage.tq3
    public final defpackage.bt0 e() {
            r1 = this;
            bt0 r1 = new bt0
            r0 = -1
            r1.<init>(r0, r0)
            return r1
    }

    @Override // defpackage.tq3
    public final java.lang.Object f(int r1, defpackage.l7 r2) {
            r0 = this;
            ip3 r0 = r0.a
            java.lang.Object r0 = defpackage.ip3.j(r0, r1, r2)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto Lb
            return r0
        Lb:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
