package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ts2  reason: default package */
/* loaded from: classes.dex */
public final class ts2 extends yy3 implements up4 {
    public l14 j0;
    public ns2 k0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, ns2, l33] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object R0(defpackage.ts2 r4, defpackage.k11 r5) {
        /*
            boolean r0 = r5 instanceof defpackage.qs2
            if (r0 == 0) goto L13
            r0 = r5
            qs2 r0 = (defpackage.qs2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            qs2 r0 = new qs2
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            ns2 r0 = r0.R
            defpackage.me2.a0(r5)
            goto L4a
        L29:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L30:
            defpackage.me2.a0(r5)
            ns2 r5 = r4.k0
            if (r5 != 0) goto L4c
            ns2 r5 = new ns2
            r5.<init>()
            l14 r2 = r4.j0
            r0.R = r5
            r0.Z = r3
            java.lang.Object r0 = r2.a(r5, r0)
            if (r0 != r1) goto L49
            return r1
        L49:
            r0 = r5
        L4a:
            r4.k0 = r0
        L4c:
            o27 r4 = defpackage.o27.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts2.R0(ts2, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object S0(defpackage.ts2 r5, defpackage.k11 r6) {
        /*
            boolean r0 = r6 instanceof defpackage.rs2
            if (r0 == 0) goto L13
            r0 = r6
            rs2 r0 = (defpackage.rs2) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            rs2 r0 = new rs2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.me2.a0(r6)
            goto L45
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r3
        L2e:
            defpackage.me2.a0(r6)
            ns2 r6 = r5.k0
            if (r6 == 0) goto L47
            os2 r2 = new os2
            r2.<init>(r6)
            l14 r6 = r5.j0
            r0.Y = r4
            java.lang.Object r6 = r6.a(r2, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            r5.k0 = r3
        L47:
            o27 r5 = defpackage.o27.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ts2.S0(ts2, k11):java.lang.Object");
    }

    @Override // defpackage.yy3
    public final void K0() {
        T0();
    }

    @Override // defpackage.up4
    public final void O(kp4 kp4Var, lp4 lp4Var, long j) {
        if (lp4Var == lp4.Main) {
            int i = kp4Var.f;
            if (i == 4) {
                tq5.w(F0(), null, null, new ss2(this, null, 0), 3);
            } else if (i == 5) {
                tq5.w(F0(), null, null, new ss2(this, null, 1), 3);
            }
        }
    }

    public final void T0() {
        ns2 ns2Var = this.k0;
        if (ns2Var != null) {
            this.j0.b(new os2(ns2Var));
            this.k0 = null;
        }
    }

    @Override // defpackage.up4
    public final void q0() {
        T0();
    }
}
