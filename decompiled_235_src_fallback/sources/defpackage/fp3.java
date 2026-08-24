package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fp3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class fp3 implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ java.lang.Object L;

    public /* synthetic */ fp3(int r2, java.util.Collection r3) {
            r1 = this;
            r0 = 3
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            return
    }

    public /* synthetic */ fp3(java.lang.Object r1, int r2, int r3) {
            r0 = this;
            r0.A = r3
            r0.L = r1
            r0.B = r2
            r0.<init>()
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r9) {
            r8 = this;
            int r0 = r8.A
            r1 = 2
            jg7 r2 = defpackage.jg7.a
            r3 = 0
            java.lang.Object r4 = r8.L
            int r8 = r8.B
            switch(r0) {
                case 0: goto L40;
                case 1: goto L37;
                case 2: goto L1a;
                default: goto Ld;
            }
        Ld:
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.List r9 = (java.util.List) r9
            boolean r8 = r9.addAll(r8, r4)
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            return r8
        L1a:
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            cx4 r9 = (defpackage.cx4) r9
            int r0 = r4.size()
            r5 = r3
        L23:
            if (r5 >= r0) goto L36
            java.lang.Object r6 = r4.get(r5)
            dx4 r6 = (defpackage.dx4) r6
            int r7 = r6.B
            int r7 = r8 - r7
            int r7 = r7 / r1
            defpackage.cx4.l(r9, r6, r3, r7)
            int r5 = r5 + 1
            goto L23
        L36:
            return r2
        L37:
            dx4 r4 = (defpackage.dx4) r4
            cx4 r9 = (defpackage.cx4) r9
            int r8 = -r8
            defpackage.cx4.j(r9, r4, r3, r8)
            return r2
        L40:
            ip3 r4 = (defpackage.ip3) r4
            nq3 r9 = (defpackage.nq3) r9
            oe1 r0 = r4.a
            vl6 r4 = defpackage.ln2.t()
            if (r4 == 0) goto L51
            qn2 r5 = r4.e()
            goto L52
        L51:
            r5 = 0
        L52:
            vl6 r6 = defpackage.ln2.N(r4)
            defpackage.ln2.V(r4, r6, r5)
            r0.getClass()
            int r0 = r9.a
            r4 = -1
            if (r0 != r4) goto L62
            goto L63
        L62:
            r1 = r0
        L63:
            if (r3 >= r1) goto L6d
            int r0 = r8 + r3
            r9.a(r0)
            int r3 = r3 + 1
            goto L63
        L6d:
            return r2
    }
}
