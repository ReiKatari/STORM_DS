package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: la6  reason: default package */
/* loaded from: classes.dex */
public final class la6 extends defpackage.dm5 implements defpackage.eo2 {
    public final /* synthetic */ int L;
    public long R;
    public int X;
    public /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ java.lang.Object Z;

    public la6(long r2, defpackage.ch5 r4, defpackage.r41 r5) {
            r1 = this;
            r0 = 0
            r1.L = r0
            r1.R = r2
            r1.Z = r4
            r2 = 2
            r1.<init>(r2, r5)
            return
    }

    public la6(defpackage.vy4 r2, defpackage.r41 r3) {
            r1 = this;
            r0 = 1
            r1.L = r0
            r1.Z = r2
            r2 = 2
            r1.<init>(r2, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            int r0 = r2.L
            jg7 r1 = defpackage.jg7.a
            mw6 r3 = (defpackage.mw6) r3
            r41 r4 = (defpackage.r41) r4
            switch(r0) {
                case 0: goto L16;
                default: goto Lb;
            }
        Lb:
            r41 r2 = r2.q(r4, r3)
            la6 r2 = (defpackage.la6) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
        L16:
            r41 r2 = r2.q(r4, r3)
            la6 r2 = (defpackage.la6) r2
            java.lang.Object r2 = r2.s(r1)
            return r2
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r5, java.lang.Object r6) {
            r4 = this;
            int r0 = r4.L
            java.lang.Object r1 = r4.Z
            switch(r0) {
                case 0: goto L11;
                default: goto L7;
            }
        L7:
            la6 r4 = new la6
            vy4 r1 = (defpackage.vy4) r1
            r4.<init>(r1, r5)
            r4.Y = r6
            return r4
        L11:
            la6 r0 = new la6
            long r2 = r4.R
            ch5 r1 = (defpackage.ch5) r1
            r0.<init>(r2, r1, r5)
            r0.Y = r6
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.L
            java.lang.Object r1 = r8.Z
            r2 = 0
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            r4 = 1
            switch(r0) {
                case 0: goto L51;
                default: goto Lb;
            }
        Lb:
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r8.X
            if (r5 == 0) goto L21
            if (r5 != r4) goto L1d
            long r1 = r8.R
            java.lang.Object r3 = r8.Y
            mw6 r3 = (defpackage.mw6) r3
            defpackage.oi2.Y(r9)
            goto L47
        L1d:
            defpackage.i.m(r3)
            goto L50
        L21:
            defpackage.oi2.Y(r9)
            java.lang.Object r9 = r8.Y
            mw6 r9 = (defpackage.mw6) r9
            vy4 r1 = (defpackage.vy4) r1
            long r1 = r1.b
            fo7 r3 = r9.f()
            r3.getClass()
            r5 = 40
            long r5 = r5 + r1
            r3 = r9
            r1 = r5
        L38:
            r8.Y = r3
            r8.R = r1
            r8.X = r4
            r9 = 3
            java.lang.Object r9 = defpackage.hz6.b(r3, r8, r9)
            if (r9 != r0) goto L47
            r2 = r0
            goto L50
        L47:
            vy4 r9 = (defpackage.vy4) r9
            long r5 = r9.b
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 < 0) goto L38
            r2 = r9
        L50:
            return r2
        L51:
            ch5 r1 = (defpackage.ch5) r1
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r8.X
            if (r5 == 0) goto L67
            if (r5 != r4) goto L63
            java.lang.Object r8 = r8.Y
            mw6 r8 = (defpackage.mw6) r8
            defpackage.oi2.Y(r9)
            goto L85
        L63:
            defpackage.i.m(r3)
            goto Lb7
        L67:
            defpackage.oi2.Y(r9)
            java.lang.Object r9 = r8.Y
            mw6 r9 = (defpackage.mw6) r9
            long r2 = r8.R
            y36 r5 = new y36
            r6 = 2
            r5.<init>(r1, r6)
            r8.Y = r9
            r8.X = r4
            java.lang.Object r8 = defpackage.sn1.c(r9, r2, r5, r8)
            if (r8 != r0) goto L82
            r2 = r0
            goto Lb7
        L82:
            r7 = r9
            r9 = r8
            r8 = r7
        L85:
            vy4 r9 = (defpackage.vy4) r9
            if (r9 == 0) goto L9d
            long r0 = r1.A
            r2 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r0 = r0 & r2
            r2 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 == 0) goto L9d
            im1 r2 = defpackage.im1.Drag
            goto Lb7
        L9d:
            ow6 r8 = r8.Y
            oy4 r8 = r8.p0
            java.util.List r8 = r8.a
            java.lang.Object r8 = defpackage.gt0.H0(r8)
            vy4 r8 = (defpackage.vy4) r8
            boolean r9 = defpackage.ej2.p(r8)
            if (r9 == 0) goto Lb5
            r8.a()
            im1 r2 = defpackage.im1.Up
            goto Lb7
        Lb5:
            im1 r2 = defpackage.im1.Cancel
        Lb7:
            return r2
    }
}
