package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ip  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ip implements defpackage.qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ java.util.ArrayList B;

    public /* synthetic */ ip(int r1, java.util.ArrayList r2) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.<init>()
            return
    }

    public /* synthetic */ ip(defpackage.xb2 r1, java.util.ArrayList r2) {
            r0 = this;
            r1 = 1
            r0.A = r1
            r0.<init>()
            r0.B = r2
            return
    }

    @Override // defpackage.qn2
    public final java.lang.Object g(java.lang.Object r20) {
            r19 = this;
            r0 = r19
            int r1 = r0.A
            jg7 r2 = defpackage.jg7.a
            r3 = 1
            r4 = 0
            java.util.ArrayList r5 = r0.B
            switch(r1) {
                case 0: goto Lca;
                case 1: goto L84;
                case 2: goto L25;
                default: goto Ld;
            }
        Ld:
            r0 = r20
            cx4 r0 = (defpackage.cx4) r0
            int r1 = r5.size()
            r3 = r4
        L16:
            if (r3 >= r1) goto L24
            java.lang.Object r6 = r5.get(r3)
            dx4 r6 = (defpackage.dx4) r6
            defpackage.cx4.j(r0, r6, r4, r4)
            int r3 = r3 + 1
            goto L16
        L24:
            return r2
        L25:
            r0 = r20
            cx4 r0 = (defpackage.cx4) r0
            int r1 = r5.size()
            r6 = r4
        L2e:
            if (r6 >= r1) goto L83
            java.lang.Object r7 = r5.get(r6)
            i34 r7 = (defpackage.i34) r7
            java.util.List r8 = r7.b
            boolean r9 = r7.g
            int r10 = r7.k
            r11 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r10 == r11) goto L41
            goto L46
        L41:
            java.lang.String r10 = "position() should be called first"
            defpackage.s53.a(r10)
        L46:
            int r10 = r8.size()
            r11 = r4
        L4b:
            if (r11 >= r10) goto L7e
            java.lang.Object r12 = r8.get(r11)
            dx4 r12 = (defpackage.dx4) r12
            int[] r13 = r7.i
            int r14 = r11 * 2
            r15 = r13[r14]
            int r14 = r14 + r3
            r13 = r13[r14]
            long r14 = (long) r15
            r16 = 32
            long r14 = r14 << r16
            long r3 = (long) r13
            r17 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r17
            long r3 = r3 | r14
            long r13 = r7.c
            long r3 = defpackage.i93.c(r3, r13)
            if (r9 == 0) goto L76
            defpackage.cx4.r(r0, r12, r3)
            goto L79
        L76:
            defpackage.cx4.n(r0, r12, r3)
        L79:
            int r11 = r11 + 1
            r3 = 1
            r4 = 0
            goto L4b
        L7e:
            int r6 = r6 + 1
            r3 = 1
            r4 = 0
            goto L2e
        L83:
            return r2
        L84:
            r0 = r20
            pq5 r0 = (defpackage.pq5) r0
            android.net.Uri r0 = r0.e
            if (r0 != 0) goto L8e
        L8c:
            r4 = 0
            goto Lc5
        L8e:
            java.lang.String r0 = android.provider.DocumentsContract.getDocumentId(r0)     // Catch: java.lang.Throwable -> L93
            goto L9a
        L93:
            r0 = move-exception
            em5 r1 = new em5
            r1.<init>(r0)
            r0 = r1
        L9a:
            boolean r1 = r0 instanceof defpackage.em5
            if (r1 == 0) goto La0
            r0 = 0
        La0:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto La5
            goto L8c
        La5:
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto Lad
        Lab:
            r3 = 0
            goto Lc4
        Lad:
            int r1 = r5.size()
            r2 = 0
        Lb2:
            if (r2 >= r1) goto Lab
            java.lang.Object r3 = r5.get(r2)
            int r2 = r2 + 1
            java.lang.String r3 = (java.lang.String) r3
            r4 = 0
            boolean r3 = defpackage.xs6.g0(r0, r3, r4)
            if (r3 == 0) goto Lb2
            r3 = 1
        Lc4:
            r4 = r3
        Lc5:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        Lca:
            r0 = r20
            cx4 r0 = (defpackage.cx4) r0
            int r1 = r5.size()
            r4 = 0
        Ld3:
            if (r4 >= r1) goto Le2
            java.lang.Object r3 = r5.get(r4)
            dx4 r3 = (defpackage.dx4) r3
            r6 = 0
            defpackage.cx4.l(r0, r3, r6, r6)
            int r4 = r4 + 1
            goto Ld3
        Le2:
            return r2
    }
}
