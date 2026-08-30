package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: e7  reason: default package */
/* loaded from: classes.dex */
public final class e7 implements w92 {
    public final /* synthetic */ int A;
    public final /* synthetic */ k24 B;
    public final /* synthetic */ pj4 L;

    public /* synthetic */ e7(k24 k24Var, pj4 pj4Var, int i) {
        this.A = i;
        this.B = k24Var;
        this.L = pj4Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
        if (defpackage.gk2.r(-1.0f, androidx.recyclerview.widget.RecyclerView.A1, r3, r4, r5, 4) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
        if (defpackage.dk7.q(5500, r5) != r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0081, code lost:
        if (defpackage.gk2.r(androidx.recyclerview.widget.RecyclerView.A1, -1.0f, r3, r4, r5, 4) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0083, code lost:
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(defpackage.vq4 r14, defpackage.j11 r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof defpackage.d7
            if (r0 == 0) goto L14
            r0 = r15
            d7 r0 = (defpackage.d7) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r5 = r0
            goto L1a
        L14:
            d7 r0 = new d7
            r0.<init>(r13, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r5.R
            p31 r0 = defpackage.p31.COROUTINE_SUSPENDED
            int r1 = r5.Y
            pj4 r7 = r13.L
            k24 r13 = r13.B
            r8 = 2
            r9 = 1
            r10 = 0
            r11 = 3
            r12 = 0
            if (r1 == 0) goto L43
            if (r1 == r9) goto L3f
            if (r1 == r8) goto L3b
            if (r1 != r11) goto L35
            defpackage.me2.a0(r15)
            goto L84
        L35:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r13)
            return r12
        L3b:
            defpackage.me2.a0(r15)
            goto L6c
        L3f:
            defpackage.me2.a0(r15)
            goto L61
        L43:
            defpackage.me2.a0(r15)
            r13.setValue(r14)
            f81 r14 = defpackage.cn1.c
            xy6 r3 = defpackage.ct3.V0(r10, r10, r14, r11)
            c7 r4 = new c7
            r4.<init>()
            r5.Y = r9
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 0
            r6 = 4
            java.lang.Object r14 = defpackage.gk2.r(r1, r2, r3, r4, r5, r6)
            if (r14 != r0) goto L61
            goto L83
        L61:
            r5.Y = r8
            r14 = 5500(0x157c, double:2.7174E-320)
            java.lang.Object r14 = defpackage.dk7.q(r14, r5)
            if (r14 != r0) goto L6c
            goto L83
        L6c:
            f81 r14 = defpackage.cn1.c
            xy6 r3 = defpackage.ct3.V0(r10, r10, r14, r11)
            c7 r4 = new c7
            r4.<init>()
            r5.Y = r11
            r1 = 0
            r2 = -1082130432(0xffffffffbf800000, float:-1.0)
            r6 = 4
            java.lang.Object r14 = defpackage.gk2.r(r1, r2, r3, r4, r5, r6)
            if (r14 != r0) goto L84
        L83:
            return r0
        L84:
            r13.setValue(r12)
            o27 r13 = defpackage.o27.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e7.a(vq4, j11):java.lang.Object");
    }

    @Override // defpackage.w92
    public final Object b(Object obj, j11 j11Var) {
        switch (this.A) {
            case 0:
                return a((vq4) obj, j11Var);
            default:
                this.B.setValue(Boolean.TRUE);
                this.L.i(((ky) obj).c);
                return o27.a;
        }
    }
}
