package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ba6  reason: default package */
/* loaded from: classes.dex */
public final class ba6 implements a92 {
    public final ci3 a;
    public final x81 b;
    public final sc6 c;
    public final wf1 d = lw5.c;

    public ba6(ci3 ci3Var, x81 x81Var, sc6 sc6Var) {
        this.a = ci3Var;
        this.b = x81Var;
        this.c = sc6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object b(defpackage.ba6 r7, defpackage.dw5 r8, float r9, float r10, defpackage.y96 r11, defpackage.k11 r12) {
        /*
            boolean r0 = r12 instanceof defpackage.aa6
            if (r0 == 0) goto L14
            r0 = r12
            aa6 r0 = (defpackage.aa6) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r12 = r0
            goto L1a
        L14:
            aa6 r0 = new aa6
            r0.<init>(r7, r12)
            goto L12
        L1a:
            java.lang.Object r0 = r12.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r12.Y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L2a
            defpackage.me2.a0(r0)
            goto L9a
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r7)
            r7 = 0
            return r7
        L31:
            defpackage.me2.a0(r0)
            float r0 = java.lang.Math.abs(r9)
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L3e
            goto L46
        L3e:
            float r0 = java.lang.Math.abs(r10)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L4d
        L46:
            r7 = 28
            io r7 = defpackage.dt3.f(r9, r10, r7)
            return r7
        L4d:
            r12.Y = r3
            x81 r0 = r7.b
            q9 r4 = new q9
            dz4 r5 = r0.a
            r6 = 26
            r4.<init>(r6, r5)
            ko r5 = new ko
            r5.<init>(r2)
            ko r2 = new ko
            r2.<init>(r10)
            oo r2 = r4.D(r5, r2)
            ko r2 = (defpackage.ko) r2
            float r2 = r2.a
            float r2 = java.lang.Math.abs(r2)
            float r4 = java.lang.Math.abs(r9)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 < 0) goto L7f
            t71 r7 = new t71
            r7.<init>(r3, r0)
        L7d:
            r0 = r9
            goto L88
        L7f:
            dz4 r0 = new dz4
            sc6 r7 = r7.c
            r0.<init>(r7)
            r7 = r0
            goto L7d
        L88:
            java.lang.Float r9 = new java.lang.Float
            r9.<init>(r0)
            r0 = r10
            java.lang.Float r10 = new java.lang.Float
            r10.<init>(r0)
            java.lang.Object r0 = r7.m(r8, r9, r10, r11, r12)
            if (r0 != r1) goto L9a
            return r1
        L9a:
            eo r0 = (defpackage.eo) r0
            io r7 = r0.b
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba6.b(ba6, dw5, float, float, y96, k11):java.lang.Object");
    }

    @Override // defpackage.a92
    public Object a(vw5 vw5Var, float f, j11 j11Var) {
        return d(vw5Var, f, l07.j, (k11) j11Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object c(defpackage.dw5 r11, float r12, defpackage.mi2 r13, defpackage.k11 r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof defpackage.x96
            if (r0 == 0) goto L13
            r0 = r14
            x96 r0 = (defpackage.x96) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            x96 r0 = new x96
            r0.<init>(r10, r14)
        L18:
            java.lang.Object r14 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            mi2 r13 = r0.R
            defpackage.me2.a0(r14)
            goto L4b
        L29:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r10)
            r10 = 0
            return r10
        L30:
            defpackage.me2.a0(r14)
            z91 r4 = new z91
            r9 = 0
            r5 = r10
            r8 = r11
            r6 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            r0.R = r7
            r0.Z = r3
            wf1 r10 = r5.d
            java.lang.Object r14 = defpackage.tq5.G(r10, r4, r0)
            if (r14 != r1) goto L4a
            return r1
        L4a:
            r13 = r7
        L4b:
            eo r14 = (defpackage.eo) r14
            java.lang.Float r10 = new java.lang.Float
            r11 = 0
            r10.<init>(r11)
            r13.n(r10)
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba6.c(dw5, float, mi2, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(defpackage.dw5 r5, float r6, defpackage.mi2 r7, defpackage.k11 r8) {
        /*
            r4 = this;
            boolean r0 = r8 instanceof defpackage.z96
            if (r0 == 0) goto L13
            r0 = r8
            z96 r0 = (defpackage.z96) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            z96 r0 = new z96
            r0.<init>(r4, r8)
        L18:
            java.lang.Object r8 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.me2.a0(r8)
            goto L3a
        L27:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r4)
            r4 = 0
            return r4
        L2e:
            defpackage.me2.a0(r8)
            r0.Y = r3
            java.lang.Object r8 = r4.c(r5, r6, r7, r0)
            if (r8 != r1) goto L3a
            return r1
        L3a:
            eo r8 = (defpackage.eo) r8
            java.lang.Float r4 = r8.a
            float r4 = r4.floatValue()
            io r5 = r8.b
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L4a
            goto L54
        L4a:
            java.lang.Object r4 = r5.b()
            java.lang.Number r4 = (java.lang.Number) r4
            float r6 = r4.floatValue()
        L54:
            java.lang.Float r4 = new java.lang.Float
            r4.<init>(r6)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba6.d(dw5, float, mi2, k11):java.lang.Object");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ba6) {
            ba6 ba6Var = (ba6) obj;
            if (!ba6Var.c.equals(this.c) || !b53.x(ba6Var.b, this.b) || ba6Var.a != this.a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.a.hashCode() + ((hashCode + (this.c.hashCode() * 31)) * 31);
    }
}
