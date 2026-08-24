package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jd0  reason: default package */
/* loaded from: classes.dex */
public final class jd0 implements defpackage.c82, defpackage.yi7 {
    public final /* synthetic */ int A;
    public final defpackage.da4 B;

    public jd0(int r6) {
            r5 = this;
            r5.A = r6
            switch(r6) {
                case 1: goto L34;
                case 2: goto L2a;
                case 3: goto L21;
                case 4: goto L18;
                case 5: goto Lf;
                default: goto L5;
            }
        L5:
            r5.<init>()
            da4 r6 = defpackage.da4.d()
            r5.B = r6
            return
        Lf:
            da4 r6 = defpackage.da4.d()
            r0 = 5
            r5.<init>(r6, r0)
            return
        L18:
            da4 r6 = defpackage.da4.d()
            r0 = 4
            r5.<init>(r6, r0)
            return
        L21:
            da4 r6 = defpackage.da4.d()
            r0 = 3
            r5.<init>(r6, r0)
            return
        L2a:
            r5.<init>()
            da4 r6 = defpackage.da4.d()
            r5.B = r6
            return
        L34:
            da4 r6 = defpackage.da4.d()
            r5.<init>()
            r5.B = r6
            xx r0 = defpackage.kz6.D
            r1 = 0
            java.lang.Object r2 = r6.b(r0, r1)
            java.lang.Class r2 = (java.lang.Class) r2
            java.lang.Class<gj0> r3 = defpackage.gj0.class
            if (r2 == 0) goto L59
            boolean r4 = r2.equals(r3)
            if (r4 == 0) goto L51
            goto L59
        L51:
            java.lang.String r6 = "Invalid target class configuration for "
            java.lang.String r0 = ": "
            defpackage.fa6.f(r6, r5, r0, r2)
            throw r1
        L59:
            r6.m(r0, r3)
            xx r5 = defpackage.kz6.C
            java.lang.Object r0 = r6.b(r5, r1)
            if (r0 != 0) goto L83
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r3.getCanonicalName()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            java.util.UUID r1 = java.util.UUID.randomUUID()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.m(r5, r0)
        L83:
            return
    }

    public jd0(defpackage.da4 r8, int r9) {
            r7 = this;
            r7.A = r9
            java.lang.String r0 = "-"
            java.lang.String r1 = ": "
            java.lang.String r2 = "Invalid target class configuration for "
            r3 = 0
            switch(r9) {
                case 4: goto L10b;
                case 5: goto La4;
                case 6: goto L58;
                default: goto Lc;
            }
        Lc:
            r7.<init>()
            r7.B = r8
            xx r9 = defpackage.kz6.D
            java.lang.Object r4 = r8.b(r9, r3)
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class<r13> r5 = defpackage.r13.class
            if (r4 == 0) goto L28
            boolean r6 = r4.equals(r5)
            if (r6 == 0) goto L24
            goto L28
        L24:
            defpackage.fa6.f(r2, r7, r1, r4)
            throw r3
        L28:
            bj7 r7 = defpackage.bj7.IMAGE_ANALYSIS
            xx r1 = defpackage.zi7.T
            r8.m(r1, r7)
            r8.m(r9, r5)
            xx r7 = defpackage.kz6.C
            java.lang.Object r9 = r8.b(r7, r3)
            if (r9 != 0) goto L57
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = r5.getCanonicalName()
            r9.append(r1)
            r9.append(r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.m(r7, r9)
        L57:
            return
        L58:
            r7.<init>()
            r7.B = r8
            xx r9 = defpackage.kz6.D
            java.lang.Object r4 = r8.b(r9, r3)
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class<pr6> r5 = defpackage.pr6.class
            if (r4 == 0) goto L74
            boolean r6 = r4.equals(r5)
            if (r6 == 0) goto L70
            goto L74
        L70:
            defpackage.fa6.f(r2, r7, r1, r4)
            throw r3
        L74:
            bj7 r7 = defpackage.bj7.STREAM_SHARING
            xx r1 = defpackage.zi7.T
            r8.m(r1, r7)
            r8.m(r9, r5)
            xx r7 = defpackage.kz6.C
            java.lang.Object r9 = r8.b(r7, r3)
            if (r9 != 0) goto La3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = r5.getCanonicalName()
            r9.append(r1)
            r9.append(r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.m(r7, r9)
        La3:
            return
        La4:
            r7.<init>()
            r7.B = r8
            xx r9 = defpackage.kz6.D
            java.lang.Object r4 = r8.b(r9, r3)
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class<p25> r5 = defpackage.p25.class
            if (r4 == 0) goto Lc0
            boolean r6 = r4.equals(r5)
            if (r6 == 0) goto Lbc
            goto Lc0
        Lbc:
            defpackage.fa6.f(r2, r7, r1, r4)
            throw r3
        Lc0:
            bj7 r7 = defpackage.bj7.PREVIEW
            xx r1 = defpackage.zi7.T
            r8.m(r1, r7)
            r8.m(r9, r5)
            xx r7 = defpackage.kz6.C
            java.lang.Object r9 = r8.b(r7, r3)
            if (r9 != 0) goto Lef
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = r5.getCanonicalName()
            r9.append(r1)
            r9.append(r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.m(r7, r9)
        Lef:
            xx r7 = defpackage.n23.r
            r9 = -1
            java.lang.Integer r0 = java.lang.Integer.valueOf(r9)
            java.lang.Object r0 = r8.b(r7, r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != r9) goto L10a
            r9 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.m(r7, r9)
        L10a:
            return
        L10b:
            r7.<init>()
            r7.B = r8
            xx r9 = defpackage.kz6.D
            java.lang.Object r4 = r8.b(r9, r3)
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Class<d23> r5 = defpackage.d23.class
            if (r4 == 0) goto L127
            boolean r6 = r4.equals(r5)
            if (r6 == 0) goto L123
            goto L127
        L123:
            defpackage.fa6.f(r2, r7, r1, r4)
            throw r3
        L127:
            bj7 r7 = defpackage.bj7.IMAGE_CAPTURE
            xx r1 = defpackage.zi7.T
            r8.m(r1, r7)
            r8.m(r9, r5)
            xx r7 = defpackage.kz6.C
            java.lang.Object r9 = r8.b(r7, r3)
            if (r9 != 0) goto L156
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r1 = r5.getCanonicalName()
            r9.append(r1)
            r9.append(r0)
            java.util.UUID r0 = java.util.UUID.randomUUID()
            r9.append(r0)
            java.lang.String r9 = r9.toString()
            r8.m(r7, r9)
        L156:
            return
    }

    public defpackage.kd0 a() {
            r1 = this;
            kd0 r0 = new kd0
            da4 r1 = r1.B
            go4 r1 = defpackage.go4.a(r1)
            r0.<init>(r1)
            return r0
    }

    public void b(defpackage.yy0 r6) {
            r5 = this;
            r6.getClass()
            java.util.Set r0 = r6.c()
            java.util.Iterator r0 = r0.iterator()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            xx r1 = (defpackage.xx) r1
            r1.getClass()
            xy0 r2 = r6.j(r1)
            java.lang.Object r3 = r6.e(r1)
            da4 r4 = r5.B
            r4.l(r1, r2, r3)
            goto Lb
        L28:
            return
    }

    @Override // defpackage.c82
    public defpackage.da4 f() {
            r2 = this;
            int r0 = r2.A
            r1 = 0
            da4 r2 = r2.B
            switch(r0) {
                case 0: goto La;
                case 1: goto L8;
                case 2: goto L9;
                case 3: goto L8;
                case 4: goto L8;
                case 5: goto L8;
                default: goto L8;
            }
        L8:
            return r2
        L9:
            throw r1
        La:
            throw r1
    }

    @Override // defpackage.yi7
    public defpackage.zi7 h() {
            r1 = this;
            int r0 = r1.A
            da4 r1 = r1.B
            switch(r0) {
                case 3: goto L25;
                case 4: goto L1b;
                case 5: goto L11;
                default: goto L7;
            }
        L7:
            qr6 r0 = new qr6
            go4 r1 = defpackage.go4.a(r1)
            r0.<init>(r1)
            return r0
        L11:
            q25 r0 = new q25
            go4 r1 = defpackage.go4.a(r1)
            r0.<init>(r1)
            return r0
        L1b:
            e23 r0 = new e23
            go4 r1 = defpackage.go4.a(r1)
            r0.<init>(r1)
            return r0
        L25:
            v13 r0 = new v13
            go4 r1 = defpackage.go4.a(r1)
            r0.<init>(r1)
            return r0
    }
}
