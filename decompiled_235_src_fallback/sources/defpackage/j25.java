package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j25  reason: default package */
/* loaded from: classes.dex */
public final class j25 implements defpackage.qh1 {
    public final /* synthetic */ defpackage.qh1 A;
    public boolean B;
    public boolean L;
    public final defpackage.hb4 R;

    public j25(defpackage.qh1 r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            hb4 r1 = new hb4
            r1.<init>()
            r0.R = r1
            return
    }

    @Override // defpackage.qh1
    public final long M(float r1) {
            r0 = this;
            qh1 r0 = r0.A
            long r0 = r0.M(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float Q(int r1) {
            r0 = this;
            qh1 r0 = r0.A
            float r0 = r0.Q(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float T(float r1) {
            r0 = this;
            qh1 r0 = r0.A
            float r0 = r0.T(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float Y() {
            r0 = this;
            qh1 r0 = r0.A
            float r0 = r0.Y()
            return r0
    }

    @Override // defpackage.qh1
    public final float a() {
            r0 = this;
            qh1 r0 = r0.A
            float r0 = r0.a()
            return r0
    }

    public final java.lang.Object b(defpackage.s41 r5) {
            r4 = this;
            boolean r0 = r5 instanceof defpackage.g25
            if (r0 == 0) goto L13
            r0 = r5
            g25 r0 = (defpackage.g25) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            g25 r0 = new g25
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.oi2.Y(r5)
            goto L3a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.oi2.Y(r5)
            r0.Y = r3
            java.lang.Object r5 = r4.i(r0)
            if (r5 != r1) goto L3a
            return r1
        L3a:
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r4 = r5.booleanValue()
            if (r4 == 0) goto L45
            jg7 r4 = defpackage.jg7.a
            return r4
        L45:
            tr2 r4 = new tr2
            java.lang.String r5 = "The press gesture was canceled."
            r4.<init>(r5)
            throw r4
    }

    public final void c() {
            r1 = this;
            r0 = 1
            r1.L = r0
            hb4 r1 = r1.R
            boolean r0 = r1.f()
            if (r0 == 0) goto Lf
            r0 = 0
            r1.h(r0)
        Lf:
            return
    }

    public final void d() {
            r1 = this;
            r0 = 1
            r1.B = r0
            hb4 r1 = r1.R
            boolean r0 = r1.f()
            if (r0 == 0) goto Lf
            r0 = 0
            r1.h(r0)
        Lf:
            return
    }

    @Override // defpackage.qh1
    public final float e0(float r1) {
            r0 = this;
            qh1 r0 = r0.A
            float r0 = r0.e0(r1)
            return r0
    }

    public final java.lang.Object f(defpackage.s41 r5) {
            r4 = this;
            boolean r0 = r5 instanceof defpackage.h25
            if (r0 == 0) goto L13
            r0 = r5
            h25 r0 = (defpackage.h25) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            h25 r0 = new h25
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.oi2.Y(r5)
            goto L3c
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.oi2.Y(r5)
            r0.Y = r3
            hb4 r5 = r4.R
            java.lang.Object r5 = r5.e(r0)
            if (r5 != r1) goto L3c
            return r1
        L3c:
            r5 = 0
            r4.B = r5
            r4.L = r5
            jg7 r4 = defpackage.jg7.a
            return r4
    }

    public final java.lang.Object i(defpackage.s41 r7) {
            r6 = this;
            boolean r0 = r7 instanceof defpackage.i25
            if (r0 == 0) goto L13
            r0 = r7
            i25 r0 = (defpackage.i25) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            i25 r0 = new i25
            r0.<init>(r6, r7)
        L18:
            java.lang.Object r7 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            hb4 r4 = r6.R
            r5 = 1
            if (r2 == 0) goto L30
            if (r2 != r5) goto L2a
            defpackage.oi2.Y(r7)
            goto L44
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L30:
            defpackage.oi2.Y(r7)
            boolean r7 = r6.B
            if (r7 != 0) goto L47
            boolean r7 = r6.L
            if (r7 != 0) goto L47
            r0.Y = r5
            java.lang.Object r7 = r4.e(r0)
            if (r7 != r1) goto L44
            return r1
        L44:
            r4.h(r3)
        L47:
            boolean r6 = r6.B
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
    }

    @Override // defpackage.qh1
    public final int k0(long r1) {
            r0 = this;
            qh1 r0 = r0.A
            int r0 = r0.k0(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final long p(float r1) {
            r0 = this;
            qh1 r0 = r0.A
            long r0 = r0.p(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final long q(long r1) {
            r0 = this;
            qh1 r0 = r0.A
            long r0 = r0.q(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final int r0(float r1) {
            r0 = this;
            qh1 r0 = r0.A
            int r0 = r0.r0(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final long v0(long r1) {
            r0 = this;
            qh1 r0 = r0.A
            long r0 = r0.v0(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float x(long r1) {
            r0 = this;
            qh1 r0 = r0.A
            float r0 = r0.x(r1)
            return r0
    }

    @Override // defpackage.qh1
    public final float y0(long r1) {
            r0 = this;
            qh1 r0 = r0.A
            float r0 = r0.y0(r1)
            return r0
    }
}
