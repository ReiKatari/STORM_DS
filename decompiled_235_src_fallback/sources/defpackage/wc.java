package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class wc implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.dd B;

    public /* synthetic */ wc(defpackage.dd r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r5 = this;
            int r0 = r5.A
            r1 = 0
            dd r5 = r5.B
            switch(r0) {
                case 0: goto Lc2;
                case 1: goto L7c;
                case 2: goto L32;
                case 3: goto L2d;
                case 4: goto L1d;
                case 5: goto L14;
                default: goto L8;
            }
        L8:
            vs4 r5 = r5.g
            java.lang.Object r5 = r5.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            r5.getClass()
            return r5
        L14:
            float r5 = r5.e()
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            return r5
        L1d:
            s04 r0 = r5.d()
            ii1 r5 = r5.h
            java.lang.Object r5 = r5.getValue()
            vr4 r1 = new vr4
            r1.<init>(r0, r5)
            return r1
        L2d:
            s04 r5 = r5.d()
            return r5
        L32:
            s04 r0 = r5.d()
            vs4 r2 = r5.g
            java.lang.Object r2 = r2.getValue()
            float r0 = r0.c(r2)
            s04 r2 = r5.d()
            ii1 r3 = r5.i
            java.lang.Object r3 = r3.getValue()
            float r2 = r2.c(r3)
            float r2 = r2 - r0
            float r3 = java.lang.Math.abs(r2)
            boolean r4 = java.lang.Float.isNaN(r3)
            if (r4 != 0) goto L75
            r4 = 897988541(0x358637bd, float:1.0E-6)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L75
            float r5 = r5.e()
            float r5 = r5 - r0
            float r5 = r5 / r2
            int r0 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r0 >= 0) goto L6b
            goto L77
        L6b:
            r0 = 1065353199(0x3f7fffef, float:0.999999)
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 <= 0) goto L73
            goto L75
        L73:
            r1 = r5
            goto L77
        L75:
            r1 = 1065353216(0x3f800000, float:1.0)
        L77:
            java.lang.Float r5 = java.lang.Float.valueOf(r1)
            return r5
        L7c:
            vs4 r0 = r5.l
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto Lc1
            rs4 r0 = r5.j
            float r0 = r0.h()
            boolean r1 = java.lang.Float.isNaN(r0)
            vs4 r2 = r5.g
            if (r1 != 0) goto Lbd
            java.lang.Object r1 = r2.getValue()
            s04 r5 = r5.d()
            float r2 = r5.c(r1)
            int r3 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r3 != 0) goto La3
            goto Lbb
        La3:
            boolean r2 = java.lang.Float.isNaN(r2)
            if (r2 == 0) goto Laa
            goto Lbb
        Laa:
            if (r3 >= 0) goto Lb4
            r2 = 1
            java.lang.Object r0 = r5.b(r0, r2)
            if (r0 != 0) goto Lc1
            goto Lbb
        Lb4:
            r2 = 0
            java.lang.Object r0 = r5.b(r0, r2)
            if (r0 != 0) goto Lc1
        Lbb:
            r0 = r1
            goto Lc1
        Lbd:
            java.lang.Object r0 = r2.getValue()
        Lc1:
            return r0
        Lc2:
            vs4 r0 = r5.l
            java.lang.Object r0 = r0.getValue()
            if (r0 != 0) goto Le5
            rs4 r0 = r5.j
            float r0 = r0.h()
            boolean r2 = java.lang.Float.isNaN(r0)
            vs4 r3 = r5.g
            if (r2 != 0) goto Le1
            java.lang.Object r2 = r3.getValue()
            java.lang.Object r0 = r5.c(r0, r1, r2)
            goto Le5
        Le1:
            java.lang.Object r0 = r3.getValue()
        Le5:
            return r0
    }
}
