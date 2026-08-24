package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gx4  reason: default package */
/* loaded from: classes.dex */
public final class gx4 extends defpackage.rq7 {
    @Override // defpackage.rq7
    public final void V(int r6, int r7, int r8, int r9) {
            r5 = this;
            int r0 = r5.z0
            int r1 = r5.A0
            int r2 = r5.v0
            int r3 = r5.w0
            int r0 = r0 + r1
            int r2 = r2 + r3
            int r1 = r5.u0
            r3 = 0
            if (r1 <= 0) goto L21
            l21[] r1 = r5.t0
            r1 = r1[r3]
            int r1 = r1.r()
            int r0 = r0 + r1
            l21[] r1 = r5.t0
            r1 = r1[r3]
            int r1 = r1.l()
            int r2 = r2 + r1
        L21:
            int r1 = r5.c0
            int r0 = java.lang.Math.max(r1, r0)
            int r1 = r5.d0
            int r1 = java.lang.Math.max(r1, r2)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1073741824(0x40000000, float:2.0)
            if (r6 != r4) goto L34
            goto L40
        L34:
            if (r6 != r2) goto L3b
            int r7 = java.lang.Math.min(r0, r7)
            goto L40
        L3b:
            if (r6 != 0) goto L3f
            r7 = r0
            goto L40
        L3f:
            r7 = r3
        L40:
            if (r8 != r4) goto L43
            goto L4f
        L43:
            if (r8 != r2) goto L4a
            int r9 = java.lang.Math.min(r1, r9)
            goto L4f
        L4a:
            if (r8 != 0) goto L4e
            r9 = r1
            goto L4f
        L4e:
            r9 = r3
        L4f:
            r5.C0 = r7
            r5.D0 = r9
            r5.P(r7)
            r5.M(r9)
            int r6 = r5.u0
            if (r6 <= 0) goto L5e
            r3 = 1
        L5e:
            r5.B0 = r3
            return
    }

    @Override // defpackage.l21
    public final void b(defpackage.jv3 r2, boolean r3) {
            r1 = this;
            super.b(r2, r3)
            int r2 = r1.u0
            if (r2 <= 0) goto L29
            l21[] r2 = r1.t0
            r3 = 0
            r2 = r2[r3]
            r2.E()
            r0 = 1056964608(0x3f000000, float:0.5)
            r2.f0 = r0
            r2.e0 = r0
            g11 r0 = defpackage.g11.LEFT
            r2.e(r0, r1, r0, r3)
            g11 r0 = defpackage.g11.RIGHT
            r2.e(r0, r1, r0, r3)
            g11 r0 = defpackage.g11.TOP
            r2.e(r0, r1, r0, r3)
            g11 r0 = defpackage.g11.BOTTOM
            r2.e(r0, r1, r0, r3)
        L29:
            return
    }
}
