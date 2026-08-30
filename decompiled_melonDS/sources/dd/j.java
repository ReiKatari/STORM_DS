package dd;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j implements cd.i {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public j(nc.t tVar, cd.i iVar, String[] strArr, int[] iArr) {
        this.A = 2;
        this.B = tVar;
        this.X = iVar;
        this.L = strArr;
        this.R = iArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00fc  */
    @Override // cd.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.Object r8, cc.c r9) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.j.a(java.lang.Object, cc.c):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0053, code lost:
        if (r1.a(r15, r3) == r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0096, code lost:
        if (r1.a(r15, r3) == r4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0098, code lost:
        return r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(int[] r14, cc.c r15) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.L
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.lang.Object r1 = r13.X
            cd.i r1 = (cd.i) r1
            java.lang.Object r2 = r13.B
            nc.t r2 = (nc.t) r2
            boolean r3 = r15 instanceof k7.e0
            if (r3 == 0) goto L1f
            r3 = r15
            k7.e0 r3 = (k7.e0) r3
            int r4 = r3.Z
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1f
            int r4 = r4 - r5
            r3.Z = r4
            goto L24
        L1f:
            k7.e0 r3 = new k7.e0
            r3.<init>(r13, r15)
        L24:
            java.lang.Object r15 = r3.X
            dc.a r4 = dc.a.COROUTINE_SUSPENDED
            int r5 = r3.Z
            r6 = 2
            r7 = 1
            if (r5 == 0) goto L40
            if (r5 == r7) goto L3a
            if (r5 != r6) goto L33
            goto L3a
        L33:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r14)
            r14 = 0
            return r14
        L3a:
            int[] r14 = r3.R
            p7.j.I(r15)
            goto L99
        L40:
            p7.j.I(r15)
            java.lang.Object r15 = r2.A
            if (r15 != 0) goto L56
            java.util.Set r15 = zb.k.S(r0)
            r3.R = r14
            r3.Z = r7
            java.lang.Object r15 = r1.a(r15, r3)
            if (r15 != r4) goto L99
            goto L98
        L56:
            java.lang.Object r15 = r13.R
            int[] r15 = (int[]) r15
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r7 = r0.length
            r8 = 0
            r9 = r8
        L62:
            if (r8 >= r7) goto L84
            r10 = r0[r8]
            int r11 = r9 + 1
            java.lang.Object r12 = r2.A
            if (r12 == 0) goto L7d
            int[] r12 = (int[]) r12
            r9 = r15[r9]
            r12 = r12[r9]
            r9 = r14[r9]
            if (r12 == r9) goto L79
            r5.add(r10)
        L79:
            int r8 = r8 + 1
            r9 = r11
            goto L62
        L7d:
            java.lang.String r14 = "Required value was null."
            a0.j.p(r14)
            r14 = 0
            return r14
        L84:
            boolean r15 = r5.isEmpty()
            if (r15 != 0) goto L99
            java.util.Set r15 = zb.l.s0(r5)
            r3.R = r14
            r3.Z = r6
            java.lang.Object r15 = r1.a(r15, r3)
            if (r15 != r4) goto L99
        L98:
            return r4
        L99:
            r2.A = r14
            yb.y r14 = yb.y.f14813a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: dd.j.b(int[], cc.c):java.lang.Object");
    }

    public /* synthetic */ j(Object obj, Object obj2, Object obj3, Object obj4, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
    }
}
