package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jf5  reason: default package */
/* loaded from: classes.dex */
public final class jf5 implements defpackage.nt {
    public final defpackage.o94 A;
    public final defpackage.ca4 B;
    public final java.lang.Object L;

    public jf5(java.lang.Object r2) {
            r1 = this;
            r1.<init>()
            o94 r0 = new o94
            r0.<init>()
            r1.A = r0
            ca4 r0 = new ca4
            r0.<init>()
            r1.B = r0
            r1.L = r2
            return
    }

    public final void a(defpackage.cg7 r11, defpackage.jb1 r12) {
            r10 = this;
            o94 r3 = r10.A
            int r0 = r3.b
            ca4 r2 = new ca4
            r2.<init>()
            r1 = 0
            r4 = r1
            r5 = r4
            r6 = r5
        Ld:
            ca4 r1 = r10.B
            if (r4 >= r0) goto Lc8
            int r7 = r4 + 1
            int r8 = r3.c(r4)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            switch(r8) {
                case 0: goto Lc4;
                case 1: goto Lb9;
                case 2: goto La8;
                case 3: goto L87;
                case 4: goto L83;
                case 5: goto L72;
                case 6: goto L5e;
                case 7: goto L44;
                case 8: goto L1b;
                default: goto L1a;
            }     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
        L1a:
            goto L5c
        L1b:
            java.lang.Object r4 = r11.L     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            boolean r8 = r4 instanceof defpackage.ww0     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            if (r8 == 0) goto L3d
            r8 = r4
            ww0 r8 = (defpackage.ww0) r8     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            java.lang.Object r9 = r12.f     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            ua4 r9 = (defpackage.ua4) r9     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            boolean r9 = r9.j(r8)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            if (r9 == 0) goto L3d
            r8.b()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            goto L3d
        L32:
            r5 = r10
            r4 = r7
            goto Ldb
        L36:
            r0 = move-exception
            r10 = r0
            goto Le3
        L3a:
            r0 = move-exception
            r10 = r0
            goto L32
        L3d:
            r2.a(r4)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            r11.e()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            goto L5c
        L44:
            int r4 = r5 + 1
            java.lang.Object r8 = r1.f(r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            r8.getClass()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            r9 = 2
            defpackage.ge7.p(r9, r8)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            eo2 r8 = (defpackage.eo2) r8     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            int r5 = r5 + 2
            java.lang.Object r4 = r1.f(r4)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            r11.n(r8, r4)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
        L5c:
            r4 = r7
            goto Ld
        L5e:
            int r4 = r4 + 2
            r3.c(r7)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            int r7 = r5 + 1
            java.lang.Object r5 = r1.f(r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            sm3 r5 = (defpackage.sm3) r5     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            r5 = r7
            goto Ld
        L6d:
            r0 = move-exception
            r10 = r0
            r5 = r10
            goto Ldb
        L72:
            int r4 = r4 + 2
            int r7 = r3.c(r7)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            int r8 = r5 + 1
            java.lang.Object r5 = r1.f(r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            r11.c(r7, r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            r5 = r8
            goto Ld
        L83:
            r11.a()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            goto L5c
        L87:
            int r8 = r4 + 2
            int r7 = r3.c(r7)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> La3
            int r9 = r4 + 3
            int r8 = r3.c(r8)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L9e
            int r4 = r4 + 4
            int r9 = r3.c(r9)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            r11.f(r7, r8, r9)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            goto Ld
        L9e:
            r0 = move-exception
            r10 = r0
            r5 = r10
            r4 = r9
            goto Ldb
        La3:
            r0 = move-exception
            r10 = r0
            r5 = r10
            r4 = r8
            goto Ldb
        La8:
            int r8 = r4 + 2
            int r7 = r3.c(r7)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> La3
            int r4 = r4 + 3
            int r8 = r3.c(r8)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            r11.g(r7, r8)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            goto Ld
        Lb9:
            int r4 = r5 + 1
            java.lang.Object r5 = r1.f(r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            r11.d(r5)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            r5 = r4
            goto L5c
        Lc4:
            r11.j()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L3a
            goto L5c
        Lc8:
            int r10 = r1.b     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            if (r5 != r10) goto Lcd
            goto Ld2
        Lcd:
            java.lang.String r10 = "Applier operation size mismatch"
            defpackage.tx0.a(r10)     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
        Ld2:
            r1.d()     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            r3.b = r6     // Catch: java.lang.Throwable -> L36 java.lang.Exception -> L6d
            r11.l()
            return
        Ldb:
            yw0 r0 = new yw0     // Catch: java.lang.Throwable -> L36
            int r4 = r4 + (-1)
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L36
            throw r0     // Catch: java.lang.Throwable -> L36
        Le3:
            r11.l()
            throw r10
    }

    @Override // defpackage.nt
    public final void c(int r3, java.lang.Object r4) {
            r2 = this;
            r0 = 5
            o94 r1 = r2.A
            r1.a(r0)
            r1.a(r3)
            ca4 r2 = r2.B
            r2.a(r4)
            return
    }

    @Override // defpackage.nt
    public final void d(java.lang.Object r3) {
            r2 = this;
            o94 r0 = r2.A
            r1 = 1
            r0.a(r1)
            ca4 r2 = r2.B
            r2.a(r3)
            return
    }

    @Override // defpackage.nt
    public final void e() {
            r1 = this;
            o94 r1 = r1.A
            r0 = 8
            r1.a(r0)
            return
    }

    @Override // defpackage.nt
    public final void f(int r2, int r3, int r4) {
            r1 = this;
            r0 = 3
            o94 r1 = r1.A
            r1.a(r0)
            r1.a(r2)
            r1.a(r3)
            r1.a(r4)
            return
    }

    @Override // defpackage.nt
    public final void g(int r2, int r3) {
            r1 = this;
            r0 = 2
            o94 r1 = r1.A
            r1.a(r0)
            r1.a(r2)
            r1.a(r3)
            return
    }

    @Override // defpackage.nt
    public final void j() {
            r1 = this;
            o94 r1 = r1.A
            r0 = 0
            r1.a(r0)
            return
    }

    @Override // defpackage.nt
    public final void k(int r3, java.lang.Object r4) {
            r2 = this;
            r0 = 6
            o94 r1 = r2.A
            r1.a(r0)
            r1.a(r3)
            ca4 r2 = r2.B
            r2.a(r4)
            return
    }

    @Override // defpackage.nt
    public final java.lang.Object m() {
            r0 = this;
            java.lang.Object r0 = r0.L
            return r0
    }

    @Override // defpackage.nt
    public final void n(defpackage.eo2 r3, java.lang.Object r4) {
            r2 = this;
            o94 r0 = r2.A
            r1 = 7
            r0.a(r1)
            ca4 r2 = r2.B
            r2.a(r3)
            r2.a(r4)
            return
    }
}
