package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: os5  reason: default package */
/* loaded from: classes.dex */
public final class os5 extends defpackage.hw6 implements defpackage.eo2 {
    public int X;
    public int Y;
    public final /* synthetic */ defpackage.ss5 Z;
    public final /* synthetic */ int d0;
    public final /* synthetic */ int e0;
    public final /* synthetic */ int f0;
    public final /* synthetic */ defpackage.ip3 g0;
    public final /* synthetic */ defpackage.pr3 h0;
    public final /* synthetic */ defpackage.om6 i0;

    public os5(defpackage.ss5 r1, int r2, int r3, int r4, defpackage.ip3 r5, defpackage.pr3 r6, defpackage.om6 r7, defpackage.r41 r8) {
            r0 = this;
            r0.Z = r1
            r0.d0 = r2
            r0.e0 = r3
            r0.f0 = r4
            r0.g0 = r5
            r0.h0 = r6
            r0.i0 = r7
            r1 = 2
            r0.<init>(r1, r8)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            os5 r0 = (defpackage.os5) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r10, java.lang.Object r11) {
            r9 = this;
            os5 r0 = new os5
            pr3 r6 = r9.h0
            om6 r7 = r9.i0
            ss5 r1 = r9.Z
            int r2 = r9.d0
            int r3 = r9.e0
            int r4 = r9.f0
            ip3 r5 = r9.g0
            r8 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r11) {
            r10 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r10.Y
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L21
            if (r1 == r5) goto L1b
            if (r1 == r4) goto L1b
            if (r1 != r3) goto L15
            defpackage.oi2.Y(r11)
            goto L86
        L15:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            return r2
        L1b:
            int r1 = r10.X
            defpackage.oi2.Y(r11)
            goto L70
        L21:
            defpackage.oi2.Y(r11)
            ss5 r11 = r10.Z
            n06 r1 = r11.f
            int[] r6 = defpackage.ns5.a
            int r1 = r1.ordinal()
            r1 = r6[r1]
            int r7 = r10.e0
            int r8 = r10.d0
            if (r1 == r5) goto L3f
            if (r1 != r4) goto L3b
        L38:
            int r8 = r8 + r7
            r1 = r8
            goto L46
        L3b:
            defpackage.i.d()
            return r2
        L3f:
            int r1 = r10.f0
            int r7 = r7 - r1
            if (r7 >= 0) goto L38
            r7 = 0
            goto L38
        L46:
            n06 r11 = r11.f
            int r11 = r11.ordinal()
            r11 = r6[r11]
            if (r11 == r5) goto L63
            if (r11 != r4) goto L5f
            r10.X = r1
            r10.Y = r4
            pr3 r11 = r10.h0
            java.lang.Object r11 = defpackage.pr3.l(r11, r1, r10)
            if (r11 != r0) goto L70
            goto L85
        L5f:
            defpackage.i.d()
            return r2
        L63:
            r10.X = r1
            r10.Y = r5
            ip3 r11 = r10.g0
            java.lang.Object r11 = defpackage.ip3.j(r11, r1, r10)
            if (r11 != r0) goto L70
            goto L85
        L70:
            r10.X = r1
            r10.Y = r3
            ss5 r4 = r10.Z
            int r5 = r10.e0
            ip3 r6 = r10.g0
            pr3 r7 = r10.h0
            om6 r8 = r10.i0
            r9 = r10
            java.lang.Object r10 = defpackage.nw7.O(r4, r5, r6, r7, r8, r9)
            if (r10 != r0) goto L86
        L85:
            return r0
        L86:
            jg7 r10 = defpackage.jg7.a
            return r10
    }
}
