package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o65  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class o65 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ java.lang.Object L;
    public final /* synthetic */ java.lang.Object R;
    public final /* synthetic */ java.lang.Object X;

    public /* synthetic */ o65(defpackage.n65 r2, boolean r3, defpackage.ah5 r4, defpackage.ah5 r5) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.B = r3
            r1.R = r4
            r1.X = r5
            return
    }

    public /* synthetic */ o65(boolean r2, defpackage.zq7 r3, defpackage.qr7 r4, defpackage.hm4 r5) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            r1.X = r5
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r11 = this;
            int r0 = r11.A
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r2 = r11.X
            java.lang.Object r3 = r11.R
            java.lang.Object r4 = r11.L
            boolean r11 = r11.B
            switch(r0) {
                case 0: goto L23;
                default: goto Lf;
            }
        Lf:
            zq7 r4 = (defpackage.zq7) r4
            qr7 r3 = (defpackage.qr7) r3
            hm4 r2 = (defpackage.hm4) r2
            if (r11 == 0) goto L1f
            if (r4 == 0) goto L1f
            java.lang.String r11 = r4.a
            r3.g(r11)
            goto L22
        L1f:
            r3.e(r2)
        L22:
            return r1
        L23:
            n65 r4 = (defpackage.n65) r4
            ah5 r3 = (defpackage.ah5) r3
            ah5 r2 = (defpackage.ah5) r2
            boolean r0 = r4.b()
            w61 r5 = r4.a
            rs4 r6 = r4.h
            r7 = 2
            r8 = 3
            r9 = 0
            if (r0 == r11) goto L53
            vs4 r0 = r4.d
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r11)
            r0.setValue(r10)
            rs4 r0 = r4.f
            r10 = 0
            r0.i(r10)
            if (r11 == 0) goto L4b
            float r10 = r6.h()
        L4b:
            qc r11 = new qc
            r11.<init>(r4, r10, r9, r7)
            defpackage.hv.L(r5, r9, r9, r11, r8)
        L53:
            float r11 = r3.A
            rs4 r0 = r4.g
            r0.i(r11)
            float r11 = r2.A
            float r0 = r6.h()
            int r0 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r0 != 0) goto L65
            goto L76
        L65:
            r6.i(r11)
            boolean r0 = r4.b()
            if (r0 == 0) goto L76
            qc r0 = new qc
            r0.<init>(r4, r11, r9, r7)
            defpackage.hv.L(r5, r9, r9, r0, r8)
        L76:
            return r1
    }
}
