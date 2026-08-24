package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lr4  reason: default package */
/* loaded from: classes.dex */
public final class lr4 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public /* synthetic */ java.lang.Object Y;
    public final /* synthetic */ defpackage.nr4 Z;
    public final /* synthetic */ int d0;
    public final /* synthetic */ float e0;
    public final /* synthetic */ defpackage.to f0;

    public lr4(defpackage.nr4 r1, int r2, float r3, defpackage.to r4, defpackage.r41 r5) {
            r0 = this;
            r0.Z = r1
            r0.d0 = r2
            r0.e0 = r3
            r0.f0 = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            p76 r1 = (defpackage.p76) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            lr4 r0 = (defpackage.lr4) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r7, java.lang.Object r8) {
            r6 = this;
            lr4 r0 = new lr4
            float r3 = r6.e0
            to r4 = r6.f0
            nr4 r1 = r6.Z
            int r2 = r6.d0
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r0.Y = r8
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r11) {
            r10 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r10.X
            jg7 r2 = defpackage.jg7.a
            r3 = 1
            if (r1 == 0) goto L16
            if (r1 != r3) goto Lf
            defpackage.oi2.Y(r11)
            return r2
        Lf:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            r10 = 0
            return r10
        L16:
            defpackage.oi2.Y(r11)
            java.lang.Object r11 = r10.Y
            p76 r11 = (defpackage.p76) r11
            lr3 r1 = new lr3
            nr4 r4 = r10.Z
            r1.<init>(r11, r4, r3)
            r10.X = r3
            or4 r11 = defpackage.pr4.a
            java.lang.Integer r11 = new java.lang.Integer
            int r5 = r10.d0
            r11.<init>(r5)
            int r11 = r11.intValue()
            int r11 = r4.j(r11)
            ss4 r6 = r4.q
            r6.i(r11)
            int r11 = r4.e
            if (r5 <= r11) goto L42
            r11 = r3
            goto L43
        L42:
            r11 = 0
        L43:
            int r6 = r1.e()
            int r7 = r4.e
            int r6 = r6 - r7
            int r6 = r6 + r3
            if (r11 == 0) goto L53
            int r3 = r1.e()
            if (r5 > r3) goto L59
        L53:
            if (r11 != 0) goto L78
            int r3 = r4.e
            if (r5 >= r3) goto L78
        L59:
            int r3 = r4.e
            int r3 = r5 - r3
            int r3 = java.lang.Math.abs(r3)
            r7 = 3
            if (r3 < r7) goto L78
            if (r11 == 0) goto L6e
            int r11 = r5 - r6
            int r3 = r4.e
            if (r11 >= r3) goto L75
            r11 = r3
            goto L75
        L6e:
            int r6 = r6 + r5
            int r11 = r4.e
            if (r6 <= r11) goto L74
            goto L75
        L74:
            r11 = r6
        L75:
            r1.f(r11)
        L78:
            int r11 = r1.b(r5)
            float r11 = (float) r11
            float r3 = r10.e0
            float r5 = r11 + r3
            ah5 r11 = new ah5
            r11.<init>()
            ql1 r7 = new ql1
            r3 = 27
            r7.<init>(r3, r11, r1)
            r9 = 4
            r4 = 0
            to r6 = r10.f0
            r8 = r10
            java.lang.Object r10 = defpackage.kj2.l(r4, r5, r6, r7, r8, r9)
            if (r10 != r0) goto L99
            goto L9a
        L99:
            r10 = r2
        L9a:
            if (r10 != r0) goto L9d
            return r0
        L9d:
            return r2
    }
}
