package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bc  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bc implements defpackage.eo2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.eo2 B;

    public /* synthetic */ bc(int r1, defpackage.eo2 r2) {
            r0 = this;
            r0.A = r1
            r0.B = r2
            r0.<init>()
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r25, java.lang.Object r26) {
            r24 = this;
            r0 = r24
            r1 = r26
            int r2 = r0.A
            r3 = 56
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r6 = 0
            r7 = 2
            r8 = 1
            r9 = 0
            jg7 r10 = defpackage.jg7.a
            eo2 r0 = r0.B
            switch(r2) {
                case 0: goto L1b4;
                case 1: goto L14c;
                case 2: goto L120;
                case 3: goto Lf4;
                case 4: goto Ld9;
                case 5: goto L89;
                case 6: goto L63;
                case 7: goto L56;
                default: goto L15;
            }
        L15:
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3 = r1 & 3
            if (r3 == r7) goto L25
            r3 = r8
            goto L26
        L25:
            r3 = r9
        L26:
            r1 = r1 & r8
            xq2 r2 = (defpackage.xq2) r2
            boolean r1 = r2.S(r1, r3)
            if (r1 == 0) goto L52
            nq6 r1 = defpackage.ye7.b
            java.lang.Object r1 = r2.j(r1)
            xe7 r1 = (defpackage.xe7) r1
            s47 r11 = r1.k
            r22 = 0
            r23 = 16744447(0xff7fff, float:2.3463968E-38)
            r12 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r20 = 0
            s47 r1 = defpackage.s47.a(r11, r12, r14, r16, r17, r18, r20, r22, r23)
            defpackage.x37.a(r1, r0, r2, r9)
            goto L55
        L52:
            r2.V()
        L55:
            return r10
        L56:
            r2 = r25
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r1 = (java.lang.String) r1
            r2.getClass()
            r0.o(r2, r1)
            return r10
        L63:
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3 = r1 & 3
            if (r3 == r7) goto L73
            r3 = r8
            goto L74
        L73:
            r3 = r9
        L74:
            r1 = r1 & r8
            xq2 r2 = (defpackage.xq2) r2
            boolean r1 = r2.S(r1, r3)
            if (r1 == 0) goto L85
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r0.o(r2, r1)
            goto L88
        L85:
            r2.V()
        L88:
            return r10
        L89:
            r2 = r25
            n46 r2 = (defpackage.n46) r2
            java.lang.Object r0 = r0.o(r2, r1)
            java.util.List r0 = (java.util.List) r0
            int r1 = r0.size()
        L97:
            if (r9 >= r1) goto Lcd
            java.lang.Object r3 = r0.get(r9)
            if (r3 == 0) goto Lca
            q46 r4 = r2.B
            if (r4 == 0) goto Lca
            boolean r4 = r4.c(r3)
            if (r4 == 0) goto Laa
            goto Lca
        Laa:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "item at index "
            r0.<init>(r1)
            r0.append(r9)
            java.lang.String r1 = " can't be saved: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        Lca:
            int r9 = r9 + 1
            goto L97
        Lcd:
            boolean r1 = r0.isEmpty()
            if (r1 != 0) goto Ld8
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
        Ld8:
            return r6
        Ld9:
            r2 = r25
            java.io.File r2 = (java.io.File) r2
            java.io.IOException r1 = (java.io.IOException) r1
            r2.getClass()
            r1.getClass()
            java.lang.Object r0 = r0.o(r2, r1)
            nl4 r1 = defpackage.nl4.TERMINATE
            if (r0 == r1) goto Lee
            return r10
        Lee:
            uz6 r0 = new uz6
            r0.<init>(r2, r6, r6)
            throw r0
        Lf4:
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3 = r1 & 3
            if (r3 == r7) goto L104
            r3 = r8
            goto L105
        L104:
            r3 = r9
        L105:
            r1 = r1 & r8
            xq2 r2 = (defpackage.xq2) r2
            boolean r1 = r2.S(r1, r3)
            if (r1 == 0) goto L11c
            nq6 r1 = defpackage.ye7.b
            java.lang.Object r1 = r2.j(r1)
            xe7 r1 = (defpackage.xe7) r1
            s47 r1 = r1.g
            defpackage.x37.a(r1, r0, r2, r9)
            goto L11f
        L11c:
            r2.V()
        L11f:
            return r10
        L120:
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r3 = r1 & 3
            if (r3 == r7) goto L130
            r3 = r8
            goto L131
        L130:
            r3 = r9
        L131:
            r1 = r1 & r8
            xq2 r2 = (defpackage.xq2) r2
            boolean r1 = r2.S(r1, r3)
            if (r1 == 0) goto L148
            nq6 r1 = defpackage.ye7.b
            java.lang.Object r1 = r2.j(r1)
            xe7 r1 = (defpackage.xe7) r1
            s47 r1 = r1.j
            defpackage.x37.a(r1, r0, r2, r9)
            goto L14b
        L148:
            r2.V()
        L14b:
            return r10
        L14c:
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r6 = r1 & 3
            if (r6 == r7) goto L15b
            r9 = r8
        L15b:
            r1 = r1 & r8
            xq2 r2 = (defpackage.xq2) r2
            boolean r1 = r2.S(r1, r9)
            if (r1 == 0) goto L1b0
            py0 r1 = defpackage.g31.a
            py0 r6 = defpackage.j31.a
            java.lang.Object r6 = r2.j(r6)
            kt0 r6 = (defpackage.kt0) r6
            long r8 = r6.a
            nq6 r6 = defpackage.vt0.a
            java.lang.Object r6 = r2.j(r6)
            ut0 r6 = (defpackage.ut0) r6
            boolean r6 = r6.k()
            if (r6 == 0) goto L188
            float r6 = defpackage.hv.N(r8)
            double r8 = (double) r6
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 <= 0) goto L195
            goto L191
        L188:
            float r6 = defpackage.hv.N(r8)
            double r8 = (double) r6
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 >= 0) goto L195
        L191:
            r4 = 1060991140(0x3f3d70a4, float:0.74)
            goto L198
        L195:
            r4 = 1058642330(0x3f19999a, float:0.6)
        L198:
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            pq r1 = r1.a(r4)
            bc r4 = new bc
            r4.<init>(r7, r0)
            r0 = -2126650894(0xffffffff813de1f2, float:-3.4875925E-38)
            zv0 r0 = defpackage.n16.I(r0, r4, r2)
            defpackage.hv.d(r1, r0, r2, r3)
            goto L1b3
        L1b0:
            r2.V()
        L1b3:
            return r10
        L1b4:
            r2 = r25
            px0 r2 = (defpackage.px0) r2
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r6 = r1 & 3
            if (r6 == r7) goto L1c3
            r9 = r8
        L1c3:
            r1 = r1 & r8
            xq2 r2 = (defpackage.xq2) r2
            boolean r1 = r2.S(r1, r9)
            if (r1 == 0) goto L218
            py0 r1 = defpackage.g31.a
            py0 r6 = defpackage.j31.a
            java.lang.Object r6 = r2.j(r6)
            kt0 r6 = (defpackage.kt0) r6
            long r6 = r6.a
            nq6 r8 = defpackage.vt0.a
            java.lang.Object r8 = r2.j(r8)
            ut0 r8 = (defpackage.ut0) r8
            boolean r8 = r8.k()
            if (r8 == 0) goto L1f0
            float r6 = defpackage.hv.N(r6)
            double r6 = (double) r6
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 <= 0) goto L1fc
            goto L1f9
        L1f0:
            float r6 = defpackage.hv.N(r6)
            double r6 = (double) r6
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 >= 0) goto L1fc
        L1f9:
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L1ff
        L1fc:
            r4 = 1063172178(0x3f5eb852, float:0.87)
        L1ff:
            java.lang.Float r4 = java.lang.Float.valueOf(r4)
            pq r1 = r1.a(r4)
            bc r4 = new bc
            r5 = 3
            r4.<init>(r5, r0)
            r0 = -1654653485(0xffffffff9d5ffdd3, float:-2.9645028E-21)
            zv0 r0 = defpackage.n16.I(r0, r4, r2)
            defpackage.hv.d(r1, r0, r2, r3)
            goto L21b
        L218:
            r2.V()
        L21b:
            return r10
    }
}
