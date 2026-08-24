package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vq3  reason: default package */
/* loaded from: classes.dex */
public final class vq3 implements defpackage.tq3 {
    public final defpackage.ii1 a;
    public final /* synthetic */ defpackage.pr3 b;
    public final /* synthetic */ boolean c;

    public vq3(defpackage.pr3 r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r1.b = r2
            r1.c = r3
            sa1 r3 = new sa1
            r0 = 1
            r3.<init>(r2, r0)
            ii1 r2 = defpackage.np2.I(r3)
            r1.a = r2
            return
    }

    @Override // defpackage.tq3
    public final int a() {
            r4 = this;
            pr3 r4 = r4.b
            jr3 r0 = r4.j()
            lo4 r0 = r0.o
            lo4 r1 = defpackage.lo4.Vertical
            if (r0 != r1) goto L1c
            jr3 r4 = r4.j()
            long r0 = r4.e()
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
        L1a:
            int r4 = (int) r0
            return r4
        L1c:
            jr3 r4 = r4.j()
            long r0 = r4.e()
            r4 = 32
            long r0 = r0 >> r4
            goto L1a
    }

    @Override // defpackage.tq3
    public final float b() {
            r1 = this;
            pr3 r1 = r1.b
            int r0 = r1.h()
            int r1 = r1.i()
            int r0 = r0 * 500
            int r0 = r0 + r1
            float r1 = (float) r0
            return r1
    }

    @Override // defpackage.tq3
    public final int c() {
            r1 = this;
            pr3 r1 = r1.b
            jr3 r0 = r1.j()
            int r0 = r0.l
            int r0 = -r0
            jr3 r1 = r1.j()
            int r1 = r1.p
            int r0 = r0 + r1
            return r0
    }

    @Override // defpackage.tq3
    public final float d() {
            r2 = this;
            pr3 r2 = r2.b
            int r0 = r2.h()
            int r1 = r2.i()
            boolean r2 = r2.c()
            if (r2 == 0) goto L18
            int r0 = r0 * 500
            int r0 = r0 + r1
            float r2 = (float) r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r2 = r2 + r0
            return r2
        L18:
            int r0 = r0 * 500
            int r0 = r0 + r1
            float r2 = (float) r0
            return r2
    }

    @Override // defpackage.tq3
    public final defpackage.bt0 e() {
            r2 = this;
            r0 = 1
            boolean r1 = r2.c
            ii1 r2 = r2.a
            if (r1 == 0) goto L17
            bt0 r1 = new bt0
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r1.<init>(r2, r0)
            return r1
        L17:
            bt0 r1 = new bt0
            java.lang.Object r2 = r2.getValue()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r1.<init>(r0, r2)
            return r1
    }

    @Override // defpackage.tq3
    public final java.lang.Object f(int r1, defpackage.l7 r2) {
            r0 = this;
            pr3 r0 = r0.b
            java.lang.Object r0 = defpackage.pr3.l(r0, r1, r2)
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            if (r0 != r1) goto Lb
            return r0
        Lb:
            jg7 r0 = defpackage.jg7.a
            return r0
    }
}
