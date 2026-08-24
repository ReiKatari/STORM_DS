package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bg4  reason: default package */
/* loaded from: classes.dex */
public final class bg4 implements defpackage.cg4 {
    @Override // defpackage.cg4
    public final boolean b(defpackage.z64 r7) {
            r6 = this;
            r6 = 0
            r0 = r6
        L2:
            r1 = 0
            if (r7 == 0) goto L4d
            boolean r2 = r7 instanceof defpackage.yy4
            r3 = 1
            if (r2 == 0) goto L13
            yy4 r7 = (defpackage.yy4) r7
            boolean r7 = r7.P()
            if (r7 == 0) goto L48
            return r3
        L13:
            int r2 = r7.L
            r4 = 16
            r2 = r2 & r4
            if (r2 == 0) goto L48
            boolean r2 = r7 instanceof defpackage.zg1
            if (r2 == 0) goto L48
            r2 = r7
            zg1 r2 = (defpackage.zg1) r2
            z64 r2 = r2.l0
        L23:
            if (r2 == 0) goto L45
            int r5 = r2.L
            r5 = r5 & r4
            if (r5 == 0) goto L42
            int r1 = r1 + 1
            if (r1 != r3) goto L30
            r7 = r2
            goto L42
        L30:
            if (r0 != 0) goto L39
            ua4 r0 = new ua4
            z64[] r5 = new defpackage.z64[r4]
            r0.<init>(r5)
        L39:
            if (r7 == 0) goto L3f
            r0.b(r7)
            r7 = r6
        L3f:
            r0.b(r2)
        L42:
            z64 r2 = r2.Y
            goto L23
        L45:
            if (r1 != r3) goto L48
            goto L2
        L48:
            z64 r7 = defpackage.nc1.A(r0)
            goto L2
        L4d:
            return r1
    }

    @Override // defpackage.cg4
    public final int c() {
            r0 = this;
            r0 = 16
            return r0
    }

    @Override // defpackage.cg4
    public final void e(defpackage.sm3 r1, long r2, defpackage.zx2 r4, int r5, boolean r6) {
            r0 = this;
            r1.A(r2, r4, r5, r6)
            return
    }

    @Override // defpackage.cg4
    public final boolean g(defpackage.zx2 r9, defpackage.sm3 r10) {
            r8 = this;
            if0 r8 = r10.B0
            java.lang.Object r8 = r8.e
            eg4 r8 = (defpackage.eg4) r8
            r8.getClass()
            r10 = 16
            boolean r0 = defpackage.fg4.g(r10)
            z64 r8 = r8.a1(r0)
            r0 = 0
            if (r8 != 0) goto L18
            goto L8b
        L18:
            boolean r1 = r8.j0
            if (r1 == 0) goto L8b
            z64 r1 = r8.A
            boolean r1 = r1.j0
            if (r1 != 0) goto L27
            java.lang.String r1 = "visitLocalDescendants called on an unattached node"
            defpackage.p53.c(r1)
        L27:
            z64 r8 = r8.A
            int r1 = r8.R
            r1 = r1 & r10
            if (r1 == 0) goto L8b
        L2e:
            if (r8 == 0) goto L8b
            int r1 = r8.L
            r1 = r1 & r10
            if (r1 == 0) goto L88
            r1 = 0
            r2 = r8
            r3 = r1
        L38:
            if (r2 == 0) goto L88
            boolean r4 = r2 instanceof defpackage.yy4
            r5 = 1
            if (r4 == 0) goto L4f
            yy4 r2 = (defpackage.yy4) r2
            boolean r2 = r2.u0()
            if (r2 == 0) goto L83
            ca4 r8 = r9.A
            int r8 = r8.b
            int r8 = r8 - r5
            r9.L = r8
            return r5
        L4f:
            int r4 = r2.L
            r4 = r4 & r10
            if (r4 == 0) goto L83
            boolean r4 = r2 instanceof defpackage.zg1
            if (r4 == 0) goto L83
            r4 = r2
            zg1 r4 = (defpackage.zg1) r4
            z64 r4 = r4.l0
            r6 = r0
        L5e:
            if (r4 == 0) goto L80
            int r7 = r4.L
            r7 = r7 & r10
            if (r7 == 0) goto L7d
            int r6 = r6 + 1
            if (r6 != r5) goto L6b
            r2 = r4
            goto L7d
        L6b:
            if (r3 != 0) goto L74
            ua4 r3 = new ua4
            z64[] r7 = new defpackage.z64[r10]
            r3.<init>(r7)
        L74:
            if (r2 == 0) goto L7a
            r3.b(r2)
            r2 = r1
        L7a:
            r3.b(r4)
        L7d:
            z64 r4 = r4.Y
            goto L5e
        L80:
            if (r6 != r5) goto L83
            goto L38
        L83:
            z64 r2 = defpackage.nc1.A(r3)
            goto L38
        L88:
            z64 r8 = r8.Y
            goto L2e
        L8b:
            return r0
    }

    @Override // defpackage.cg4
    public final boolean i(defpackage.sm3 r1) {
            r0 = this;
            r0 = 1
            return r0
    }
}
