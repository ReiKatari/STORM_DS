package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rr4  reason: default package */
/* loaded from: classes.dex */
public final class rr4 implements defpackage.sd2 {
    public final defpackage.ql6 a;
    public final defpackage.ue1 b;

    public rr4(defpackage.ql6 r1, defpackage.ue1 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.sd2
    public final java.lang.Object a(defpackage.i86 r7, float r8, defpackage.r41 r9) {
            r6 = this;
            boolean r0 = r9 instanceof defpackage.qr4
            if (r0 == 0) goto L13
            r0 = r9
            qr4 r0 = (defpackage.qr4) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L1a
        L13:
            qr4 r0 = new qr4
            s41 r9 = (defpackage.s41) r9
            r0.<init>(r6, r9)
        L1a:
            java.lang.Object r9 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            defpackage.oi2.Y(r9)
            goto L45
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L30:
            defpackage.oi2.Y(r9)
            bg2 r9 = new bg2
            r2 = 17
            r9.<init>(r2, r6, r7)
            r0.Y = r4
            ql6 r2 = r6.a
            java.lang.Object r9 = r2.d(r7, r8, r9, r0)
            if (r9 != r1) goto L45
            return r1
        L45:
            java.lang.Number r9 = (java.lang.Number) r9
            float r7 = r9.floatValue()
            ue1 r6 = r6.b
            float r8 = r6.l()
            r9 = 0
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 != 0) goto L57
            goto L8e
        L57:
            float r8 = r6.l()
            float r8 = java.lang.Math.abs(r8)
            double r0 = (double) r8
            r4 = 4562254508917369340(0x3f50624dd2f1a9fc, double:0.001)
            int r8 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r8 >= 0) goto L8e
            int r8 = r6.k()
            bf1 r0 = r6.k
            boolean r0 = r0.a()
            if (r0 == 0) goto L89
            vs4 r0 = r6.m
            java.lang.Object r0 = r0.getValue()
            cr4 r0 = (defpackage.cr4) r0
            w61 r0 = r0.s
            yq4 r1 = new yq4
            r2 = 2
            r1.<init>(r6, r3, r2)
            r2 = 3
            defpackage.hv.L(r0, r3, r3, r1, r2)
        L89:
            r0 = 0
            r6.t(r9, r8, r0)
            goto L97
        L8e:
            float r6 = r6.l()
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r6)
        L97:
            java.lang.Float r6 = new java.lang.Float
            r6.<init>(r7)
            return r6
    }
}
