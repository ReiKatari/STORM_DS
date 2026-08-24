package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bz5  reason: default package */
/* loaded from: classes.dex */
public final class bz5 implements defpackage.ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ defpackage.tz5 B;

    public /* synthetic */ bz5(defpackage.tz5 r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    public bz5(defpackage.tz5 r1, defpackage.w61 r2) {
            r0 = this;
            r2 = 0
            r0.A = r2
            r0.<init>()
            r0.B = r1
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r14, defpackage.r41 r15) {
            r13 = this;
            int r0 = r13.A
            jg7 r1 = defpackage.jg7.a
            tz5 r2 = r13.B
            switch(r0) {
                case 0: goto L20;
                case 1: goto L19;
                case 2: goto L11;
                default: goto L9;
            }
        L9:
            java.util.List r14 = (java.util.List) r14
            tp6 r13 = r2.J
            r13.l(r14)
            return r1
        L11:
            ss5 r14 = (defpackage.ss5) r14
            tp6 r13 = r2.H
            r13.l(r14)
            return r1
        L19:
            java.util.List r14 = (java.util.List) r14
            java.lang.Object r13 = r13.b(r14, r15)
            return r13
        L20:
            android.net.Uri[] r14 = (android.net.Uri[]) r14
            of6 r13 = r2.x
            int r15 = r14.length
            r0 = 0
            r3 = 1
            if (r15 != 0) goto L2b
            r15 = r3
            goto L2c
        L2b:
            r15 = r0
        L2c:
            r15 = r15 ^ r3
            java.lang.Boolean r15 = java.lang.Boolean.valueOf(r15)
            r13.k(r15)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            int r15 = r14.length
            r4 = r0
        L3b:
            r5 = 0
            if (r4 >= r15) goto L74
            r6 = r14[r4]
            java.lang.String r7 = android.provider.DocumentsContract.getTreeDocumentId(r6)     // Catch: java.lang.Throwable -> L5e
            lz5 r8 = new lz5     // Catch: java.lang.Throwable -> L5e
            r7.getClass()     // Catch: java.lang.Throwable -> L5e
            java.lang.String r9 = defpackage.tz5.k(r7)     // Catch: java.lang.Throwable -> L5e
            r10 = 58
            java.lang.String r10 = defpackage.qs6.M0(r10, r7, r7)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r10 = android.net.Uri.decode(r10)     // Catch: java.lang.Throwable -> L5e
            r10.getClass()     // Catch: java.lang.Throwable -> L5e
            r8.<init>(r6, r7, r9, r10)     // Catch: java.lang.Throwable -> L5e
            goto L64
        L5e:
            r6 = move-exception
            em5 r8 = new em5
            r8.<init>(r6)
        L64:
            boolean r6 = r8 instanceof defpackage.em5
            if (r6 == 0) goto L69
            goto L6a
        L69:
            r5 = r8
        L6a:
            lz5 r5 = (defpackage.lz5) r5
            if (r5 == 0) goto L71
            r13.add(r5)
        L71:
            int r4 = r4 + 1
            goto L3b
        L74:
            tp6 r14 = r2.F
            r14.getClass()
            r14.m(r5, r13)
            tp6 r14 = r2.G
            java.lang.Object r15 = r14.getValue()
            java.util.List r15 = (java.util.List) r15
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r4 = r15.iterator()
        L8d:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L9f
            java.lang.Object r6 = r4.next()
            boolean r7 = r6 instanceof defpackage.fz5
            if (r7 == 0) goto L8d
            r2.add(r6)
            goto L8d
        L9f:
            java.util.ArrayList r4 = new java.util.ArrayList
            r6 = 10
            int r6 = defpackage.ht0.v0(r2, r6)
            r4.<init>(r6)
            int r6 = r2.size()
            r7 = r0
        Laf:
            if (r7 >= r6) goto Lbf
            java.lang.Object r8 = r2.get(r7)
            int r7 = r7 + 1
            fz5 r8 = (defpackage.fz5) r8
            java.lang.String r8 = r8.a
            r4.add(r8)
            goto Laf
        Lbf:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r6 = r4.size()
            r7 = r0
        Lc9:
            if (r7 >= r6) goto Lf6
            java.lang.Object r8 = r4.get(r7)
            int r7 = r7 + 1
            r9 = r8
            java.lang.String r9 = (java.lang.String) r9
            boolean r10 = r13.isEmpty()
            if (r10 == 0) goto Ldb
            goto Lc9
        Ldb:
            int r10 = r13.size()
            r11 = r0
        Le0:
            if (r11 >= r10) goto Lc9
            java.lang.Object r12 = r13.get(r11)
            int r11 = r11 + 1
            lz5 r12 = (defpackage.lz5) r12
            java.lang.String r12 = r12.b
            boolean r12 = defpackage.tz5.o(r9, r12)
            if (r12 == 0) goto Le0
            r2.add(r8)
            goto Lc9
        Lf6:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r6 = r13.isEmpty()
            gz5 r7 = defpackage.gz5.a
            if (r6 == 0) goto L107
            r4.add(r7)
            goto L155
        L107:
            int r6 = r13.size()
            if (r6 != r3) goto L13b
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L124
            fz5 r0 = new fz5
            java.lang.Object r13 = defpackage.gt0.H0(r13)
            lz5 r13 = (defpackage.lz5) r13
            java.lang.String r13 = r13.b
            r0.<init>(r13)
            r4.add(r0)
            goto L155
        L124:
            int r13 = r2.size()
        L128:
            if (r0 >= r13) goto L155
            java.lang.Object r3 = r2.get(r0)
            int r0 = r0 + 1
            java.lang.String r3 = (java.lang.String) r3
            fz5 r6 = new fz5
            r6.<init>(r3)
            r4.add(r6)
            goto L128
        L13b:
            r4.add(r7)
            int r13 = r2.size()
        L142:
            if (r0 >= r13) goto L155
            java.lang.Object r3 = r2.get(r0)
            int r0 = r0 + 1
            java.lang.String r3 = (java.lang.String) r3
            fz5 r6 = new fz5
            r6.<init>(r3)
            r4.add(r6)
            goto L142
        L155:
            boolean r13 = r4.isEmpty()
            if (r13 == 0) goto L15e
            r4.add(r7)
        L15e:
            boolean r13 = r4.equals(r15)
            if (r13 != 0) goto L167
            r14.m(r5, r4)
        L167:
            return r1
    }

    public java.lang.Object b(java.util.List r7, defpackage.r41 r8) {
            r6 = this;
            boolean r0 = r8 instanceof defpackage.cz5
            if (r0 == 0) goto L13
            r0 = r8
            cz5 r0 = (defpackage.cz5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            cz5 r0 = new cz5
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            tz5 r6 = r6.B
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            defpackage.oi2.Y(r8)
            goto L45
        L2a:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L30:
            defpackage.oi2.Y(r8)
            xe1 r8 = defpackage.xk1.a
            ag r2 = new ag
            r5 = 15
            r2.<init>(r7, r6, r3, r5)
            r0.Y = r4
            java.lang.Object r8 = defpackage.hv.d0(r8, r2, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            java.util.List r8 = (java.util.List) r8
            tp6 r6 = r6.D
            r6.l(r8)
            jg7 r6 = defpackage.jg7.a
            return r6
    }
}
