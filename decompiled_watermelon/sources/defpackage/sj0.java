package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sj0  reason: default package */
/* loaded from: classes.dex */
public final class sj0 implements w92 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public sj0(n75 n75Var, w92 w92Var, String[] strArr, int[] iArr) {
        this.A = 3;
        this.B = n75Var;
        this.X = w92Var;
        this.L = strArr;
        this.R = iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r1.b(r13, r3) == r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0095, code lost:
        if (r1.b(r13, r3) == r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0097, code lost:
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(int[] r14, defpackage.j11 r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.L
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.Object r1 = r13.X
            w92 r1 = (defpackage.w92) r1
            java.lang.Object r2 = r13.B
            n75 r2 = (defpackage.n75) r2
            boolean r3 = r15 instanceof defpackage.ky6
            if (r3 == 0) goto L1f
            r3 = r15
            ky6 r3 = (defpackage.ky6) r3
            int r4 = r3.Z
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1f
            int r4 = r4 - r5
            r3.Z = r4
            goto L24
        L1f:
            ky6 r3 = new ky6
            r3.<init>(r13, r15)
        L24:
            java.lang.Object r15 = r3.X
            p31 r4 = defpackage.p31.COROUTINE_SUSPENDED
            int r5 = r3.Z
            r6 = 0
            r7 = 2
            r8 = 1
            if (r5 == 0) goto L40
            if (r5 == r8) goto L3a
            if (r5 != r7) goto L34
            goto L3a
        L34:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r13)
            return r6
        L3a:
            int[] r14 = r3.R
            defpackage.me2.a0(r15)
            goto L98
        L40:
            defpackage.me2.a0(r15)
            java.lang.Object r15 = r2.A
            if (r15 != 0) goto L56
            java.util.Set r13 = defpackage.nu.H0(r0)
            r3.R = r14
            r3.Z = r8
            java.lang.Object r13 = r1.b(r13, r3)
            if (r13 != r4) goto L98
            goto L97
        L56:
            java.lang.Object r13 = r13.R
            int[] r13 = (int[]) r13
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            int r5 = r0.length
            r8 = 0
            r9 = r8
        L62:
            if (r8 >= r5) goto L83
            r10 = r0[r8]
            int r11 = r9 + 1
            java.lang.Object r12 = r2.A
            if (r12 == 0) goto L7d
            int[] r12 = (int[]) r12
            r9 = r13[r9]
            r12 = r12[r9]
            r9 = r14[r9]
            if (r12 == r9) goto L79
            r15.add(r10)
        L79:
            int r8 = r8 + 1
            r9 = r11
            goto L62
        L7d:
            java.lang.String r13 = "Required value was null."
            defpackage.i.n(r13)
            return r6
        L83:
            boolean r13 = r15.isEmpty()
            if (r13 != 0) goto L98
            java.util.Set r13 = defpackage.tq0.s1(r15)
            r3.R = r14
            r3.Z = r7
            java.lang.Object r13 = r1.b(r13, r3)
            if (r13 != r4) goto L98
        L97:
            return r4
        L98:
            r2.A = r14
            o27 r13 = defpackage.o27.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sj0.a(int[], j11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00f2  */
    @Override // defpackage.w92
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(java.lang.Object r8, defpackage.j11 r9) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sj0.b(java.lang.Object, j11):java.lang.Object");
    }

    public /* synthetic */ sj0(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
    }
}
