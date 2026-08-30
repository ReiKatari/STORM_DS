package g2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ n B;

    public /* synthetic */ g(n nVar, int i2) {
        this.A = i2;
        this.B = nVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0078, code lost:
        if (r0 > 0.999999f) goto L23;
     */
    @Override // mc.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b() {
        /*
            r5 = this;
            int r0 = r5.A
            switch(r0) {
                case 0: goto Lc9;
                case 1: goto L81;
                case 2: goto L37;
                case 3: goto L30;
                case 4: goto L1e;
                case 5: goto L13;
                default: goto L5;
            }
        L5:
            g2.n r0 = r5.B
            n2.f1 r0 = r0.f5269g
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r0.getClass()
            return r0
        L13:
            g2.n r0 = r5.B
            float r0 = r0.e()
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L1e:
            g2.n r0 = r5.B
            g2.g2 r1 = r0.d()
            n2.e0 r0 = r0.f5270h
            java.lang.Object r0 = r0.getValue()
            yb.j r2 = new yb.j
            r2.<init>(r1, r0)
            return r2
        L30:
            g2.n r0 = r5.B
            g2.g2 r0 = r0.d()
            return r0
        L37:
            g2.n r0 = r5.B
            g2.g2 r1 = r0.d()
            n2.f1 r2 = r0.f5269g
            java.lang.Object r2 = r2.getValue()
            float r1 = r1.c(r2)
            g2.g2 r2 = r0.d()
            n2.e0 r3 = r0.f5271i
            java.lang.Object r3 = r3.getValue()
            float r2 = r2.c(r3)
            float r2 = r2 - r1
            float r3 = java.lang.Math.abs(r2)
            boolean r4 = java.lang.Float.isNaN(r3)
            if (r4 != 0) goto L7a
            r4 = 897988541(0x358637bd, float:1.0E-6)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L7a
            float r0 = r0.e()
            float r0 = r0 - r1
            float r0 = r0 / r2
            int r1 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r1 >= 0) goto L73
            r0 = 0
            goto L7c
        L73:
            r1 = 1065353199(0x3f7fffef, float:0.999999)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 <= 0) goto L7c
        L7a:
            r0 = 1065353216(0x3f800000, float:1.0)
        L7c:
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            return r0
        L81:
            g2.n r0 = r5.B
            n2.f1 r1 = r0.f5274l
            java.lang.Object r1 = r1.getValue()
            if (r1 != 0) goto Lc8
            n2.b1 r1 = r0.f5272j
            float r1 = r1.g()
            boolean r2 = java.lang.Float.isNaN(r1)
            n2.f1 r3 = r0.f5269g
            if (r2 != 0) goto Lc4
            java.lang.Object r2 = r3.getValue()
            g2.g2 r0 = r0.d()
            float r3 = r0.c(r2)
            int r4 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r4 != 0) goto Laa
            goto Lc2
        Laa:
            boolean r3 = java.lang.Float.isNaN(r3)
            if (r3 == 0) goto Lb1
            goto Lc2
        Lb1:
            if (r4 >= 0) goto Lbb
            r3 = 1
            java.lang.Object r1 = r0.b(r1, r3)
            if (r1 != 0) goto Lc8
            goto Lc2
        Lbb:
            r3 = 0
            java.lang.Object r1 = r0.b(r1, r3)
            if (r1 != 0) goto Lc8
        Lc2:
            r1 = r2
            goto Lc8
        Lc4:
            java.lang.Object r1 = r3.getValue()
        Lc8:
            return r1
        Lc9:
            g2.n r0 = r5.B
            n2.f1 r1 = r0.f5274l
            java.lang.Object r1 = r1.getValue()
            if (r1 != 0) goto Lef
            n2.b1 r1 = r0.f5272j
            float r1 = r1.g()
            boolean r2 = java.lang.Float.isNaN(r1)
            n2.f1 r3 = r0.f5269g
            if (r2 != 0) goto Leb
            java.lang.Object r2 = r3.getValue()
            r3 = 0
            java.lang.Object r1 = r0.c(r1, r3, r2)
            goto Lef
        Leb:
            java.lang.Object r1 = r3.getValue()
        Lef:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: g2.g.b():java.lang.Object");
    }
}
