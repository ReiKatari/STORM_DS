package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: de7  reason: default package */
/* loaded from: classes.dex */
public final class de7 extends defpackage.yc7 {
    public final /* synthetic */ int a;
    public final boolean b;

    public /* synthetic */ de7(boolean r1, int r2) {
            r0 = this;
            r0.a = r2
            r0.b = r1
            r0.<init>()
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r3) {
            r2 = this;
            int r2 = r2.a
            r0 = 0
            switch(r2) {
                case 0: goto L1c;
                default: goto L6;
            }
        L6:
            jf3 r2 = r3.n0()
            jf3 r1 = defpackage.jf3.NULL
            if (r2 != r1) goto L12
            r3.j0()
            goto L1b
        L12:
            double r2 = r3.X()
            float r2 = (float) r2
            java.lang.Float r0 = java.lang.Float.valueOf(r2)
        L1b:
            return r0
        L1c:
            jf3 r2 = r3.n0()
            jf3 r1 = defpackage.jf3.NULL
            if (r2 != r1) goto L28
            r3.j0()
            goto L30
        L28:
            double r2 = r3.X()
            java.lang.Double r0 = java.lang.Double.valueOf(r2)
        L30:
            return r0
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r4, java.lang.Object r5) {
            r3 = this;
            int r0 = r3.a
            boolean r3 = r3.b
            switch(r0) {
                case 0: goto L26;
                default: goto L7;
            }
        L7:
            java.lang.Number r5 = (java.lang.Number) r5
            if (r5 != 0) goto Lf
            r4.A()
            goto L25
        Lf:
            float r0 = r5.floatValue()
            if (r3 == 0) goto L19
            double r1 = (double) r0
            defpackage.fe7.a(r1)
        L19:
            boolean r3 = r5 instanceof java.lang.Float
            if (r3 == 0) goto L1e
            goto L22
        L1e:
            java.lang.Float r5 = java.lang.Float.valueOf(r0)
        L22:
            r4.a0(r5)
        L25:
            return
        L26:
            java.lang.Number r5 = (java.lang.Number) r5
            if (r5 != 0) goto L2e
            r4.A()
            goto L3a
        L2e:
            double r0 = r5.doubleValue()
            if (r3 == 0) goto L37
            defpackage.fe7.a(r0)
        L37:
            r4.U(r0)
        L3a:
            return
    }
}
