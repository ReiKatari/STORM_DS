package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kx0  reason: default package */
/* loaded from: classes.dex */
public final class kx0 extends defpackage.aj3 implements defpackage.eo2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.mx0 L;
    public final /* synthetic */ defpackage.te R;
    public final /* synthetic */ defpackage.eo2 X;

    public kx0(defpackage.mx0 r1, defpackage.te r2, defpackage.eo2 r3, int r4) {
            r0 = this;
            r4 = 1
            r0.B = r4
            r0.L = r1
            r0.R = r2
            r0.X = r3
            r1 = 2
            r0.<init>(r1)
            return
    }

    public kx0(defpackage.te r2, defpackage.mx0 r3, defpackage.eo2 r4) {
            r1 = this;
            r0 = 0
            r1.B = r0
            r1.R = r2
            r1.L = r3
            r1.X = r4
            r2 = 2
            r1.<init>(r2)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            int r0 = r7.B
            jg7 r1 = defpackage.jg7.a
            r2 = 1
            eo2 r3 = r7.X
            te r4 = r7.R
            mx0 r7 = r7.L
            switch(r0) {
                case 0: goto L1d;
                default: goto Le;
            }
        Le:
            px0 r8 = (defpackage.px0) r8
            java.lang.Number r9 = (java.lang.Number) r9
            r9.intValue()
            int r9 = defpackage.ii2.a0(r2)
            r7.a(r4, r3, r8, r9)
            return r1
        L1d:
            px0 r8 = (defpackage.px0) r8
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r0 = r9 & 3
            r5 = 2
            r6 = 0
            if (r0 == r5) goto L2d
            r0 = r2
            goto L2e
        L2d:
            r0 = r6
        L2e:
            r9 = r9 & r2
            xq2 r8 = (defpackage.xq2) r8
            boolean r9 = r8.S(r9, r0)
            if (r9 == 0) goto L46
            r9 = 866651995(0x33a80f5b, float:7.825903E-8)
            r8.b0(r9)
            vm r7 = r7.k
            defpackage.ky0.a(r4, r7, r3, r8, r6)
            r8.p(r6)
            goto L49
        L46:
            r8.V()
        L49:
            return r1
    }
}
