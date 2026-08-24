package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ff6  reason: default package */
/* loaded from: classes.dex */
public final class ff6 extends defpackage.aj3 implements defpackage.on2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ defpackage.gf6 L;

    public /* synthetic */ ff6(defpackage.gf6 r1, int r2) {
            r0 = this;
            r0.B = r2
            r0.L = r1
            r1 = 0
            r0.<init>(r1)
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r12 = this;
            int r0 = r12.B
            r1 = 0
            gf6 r12 = r12.L
            switch(r0) {
                case 0: goto L2f;
                default: goto L8;
            }
        L8:
            java.util.List r12 = r12.b()
            int r0 = r12.size()
        L10:
            if (r1 >= r0) goto L2c
            java.lang.Object r2 = r12.get(r1)
            if6 r2 = (defpackage.if6) r2
            x60 r3 = r2.d()
            boolean r3 = r3.b()
            if (r3 == 0) goto L29
            boolean r2 = r2.h()
            if (r2 == 0) goto L29
            goto L2c
        L29:
            int r1 = r1 + 1
            goto L10
        L2c:
            jg7 r12 = defpackage.jg7.a
            return r12
        L2f:
            boolean r0 = r12.g
            gn r2 = r12.f
            sg6 r3 = r12.b
            if (r0 != 0) goto Lb0
            boolean r0 = r3.a()
            if (r0 == 0) goto Lb0
            vs4 r0 = r2.d
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lb0
            java.util.List r0 = r12.c()
            int r4 = r0.size()
        L53:
            r5 = 0
            if (r1 >= r4) goto L6b
            java.lang.Object r6 = r0.get(r1)
            r7 = r6
            if6 r7 = (defpackage.if6) r7
            x60 r7 = r7.d()
            boolean r7 = r7.b()
            if (r7 == 0) goto L68
            goto L6c
        L68:
            int r1 = r1 + 1
            goto L53
        L6b:
            r6 = r5
        L6c:
            if6 r6 = (defpackage.if6) r6
            if (r6 == 0) goto Lb0
            x60 r0 = r6.d()
            rc2 r0 = r0.f
            boolean r1 = r0 instanceof defpackage.io6
            if (r1 == 0) goto Lad
            io6 r0 = (defpackage.io6) r0
            float r1 = r0.a
            float r0 = r0.b
            r4 = 1065353216(0x3f800000, float:1.0)
            int r6 = java.lang.Float.floatToRawIntBits(r4)
            long r6 = (long) r6
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r8 = (long) r4
            r4 = 32
            long r6 = r6 << r4
            r10 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r10
            long r6 = r6 | r8
            jk4 r4 = new jk4
            r4.<init>(r6)
            io6 r6 = new io6
            r6.<init>(r1, r0, r4)
            w61 r0 = r3.B
            bf4 r1 = new bf4
            r3 = 16
            r1.<init>(r12, r6, r5, r3)
            r3 = 3
            defpackage.hv.L(r0, r5, r5, r1, r3)
        Lad:
            r0 = 1
            r12.g = r0
        Lb0:
            java.lang.Object r12 = r2.d()
            jk4 r12 = (defpackage.jk4) r12
            long r0 = r12.a
            jk4 r12 = new jk4
            r12.<init>(r0)
            return r12
    }
}
