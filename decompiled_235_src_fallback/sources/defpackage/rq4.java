package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rq4  reason: default package */
/* loaded from: classes.dex */
public final class rq4 extends defpackage.z64 implements defpackage.jm3 {
    public defpackage.lq4 k0;

    @Override // defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r9, defpackage.x24 r10, long r11) {
            r8 = this;
            lq4 r0 = r8.k0
            kk3 r1 = r9.getLayoutDirection()
            float r0 = r0.b(r1)
            lq4 r1 = r8.k0
            float r1 = r1.d()
            lq4 r2 = r8.k0
            kk3 r3 = r9.getLayoutDirection()
            float r2 = r2.c(r3)
            lq4 r8 = r8.k0
            float r8 = r8.a()
            r3 = 0
            int r4 = defpackage.om1.a(r0, r3)
            r5 = 0
            r6 = 1
            if (r4 < 0) goto L2b
            r4 = r6
            goto L2c
        L2b:
            r4 = r5
        L2c:
            int r7 = defpackage.om1.a(r1, r3)
            if (r7 < 0) goto L34
            r7 = r6
            goto L35
        L34:
            r7 = r5
        L35:
            r4 = r4 & r7
            int r7 = defpackage.om1.a(r2, r3)
            if (r7 < 0) goto L3e
            r7 = r6
            goto L3f
        L3e:
            r7 = r5
        L3f:
            r4 = r4 & r7
            int r3 = defpackage.om1.a(r8, r3)
            if (r3 < 0) goto L47
            r5 = r6
        L47:
            r3 = r4 & r5
            if (r3 != 0) goto L50
            java.lang.String r3 = "Padding must be non-negative"
            defpackage.n53.a(r3)
        L50:
            int r0 = r9.r0(r0)
            int r2 = r9.r0(r2)
            int r2 = r2 + r0
            int r1 = r9.r0(r1)
            int r8 = r9.r0(r8)
            int r8 = r8 + r1
            int r3 = -r2
            int r4 = -r8
            long r3 = defpackage.s21.i(r11, r3, r4)
            dx4 r10 = r10.y(r3)
            int r3 = r10.A
            int r3 = r3 + r2
            int r2 = defpackage.s21.g(r3, r11)
            int r3 = r10.B
            int r3 = r3 + r8
            int r8 = defpackage.s21.f(r3, r11)
            m83 r11 = new m83
            r12 = 2
            r11.<init>(r10, r0, r1, r12)
            zt1 r10 = defpackage.zt1.A
            f34 r8 = r9.K(r2, r8, r10, r11)
            return r8
    }
}
