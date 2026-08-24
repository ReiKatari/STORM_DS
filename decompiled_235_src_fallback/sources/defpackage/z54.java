package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z54  reason: default package */
/* loaded from: classes.dex */
public final class z54 implements defpackage.y54 {
    public final /* synthetic */ int a;
    public final java.lang.Object b;
    public final java.lang.Object c;
    public final java.lang.Object d;

    public /* synthetic */ z54(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, int r4) {
            r0 = this;
            r0.a = r4
            r0.b = r1
            r0.c = r2
            r0.d = r3
            r0.<init>()
            return
    }

    @Override // defpackage.y54
    public final int a() {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            r0 = 21
            return r0
        L8:
            r0 = 20
            return r0
    }

    @Override // defpackage.y54
    public final void b() {
            r15 = this;
            int r0 = r15.a
            java.lang.Object r1 = r15.d
            java.lang.Object r2 = r15.c
            java.lang.Object r3 = r15.b
            r4 = 0
            switch(r0) {
                case 0: goto L10e;
                default: goto Lc;
            }
        Lc:
            java.io.File r0 = new java.io.File
            android.content.Context r3 = (android.content.Context) r3
            java.io.File r5 = r3.getFilesDir()
            java.lang.String r6 = "rom_data.json"
            r0.<init>(r5, r6)
            boolean r5 = r0.isFile()
            yt1 r6 = defpackage.yt1.A
            if (r5 != 0) goto L22
            goto L4f
        L22:
            a64 r5 = new a64
            r5.<init>()
            java.lang.reflect.Type r5 = r5.b
            r5.getClass()
            su2 r2 = (defpackage.su2) r2     // Catch: java.lang.Throwable -> L3f
            java.io.FileReader r7 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3f
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L3f
            ie7 r0 = new ie7     // Catch: java.lang.Throwable -> L3f
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r0 = r2.c(r7, r0)     // Catch: java.lang.Throwable -> L3f
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L3f
            goto L46
        L3f:
            r0 = move-exception
            em5 r2 = new em5
            r2.<init>(r0)
            r0 = r2
        L46:
            java.lang.Throwable r2 = defpackage.hm5.a(r0)
            if (r2 != 0) goto L4d
            r6 = r0
        L4d:
            java.util.List r6 = (java.util.List) r6
        L4f:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L57
            goto L10d
        L57:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r5 = r6.iterator()
        L60:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L104
            java.lang.Object r0 = r5.next()
            r6 = r0
            nq5 r6 = (defpackage.nq5) r6
            android.net.Uri r10 = r6.l()
            if (r10 != 0) goto L76
            r7 = r4
            goto Lfd
        L76:
            r0 = r1
            uh7 r0 = (defpackage.uh7) r0     // Catch: java.lang.Throwable -> L84
            zl1 r0 = r0.a(r10)     // Catch: java.lang.Throwable -> L84
            if (r0 == 0) goto L86
            java.lang.String r0 = r0.i()     // Catch: java.lang.Throwable -> L84
            goto L8e
        L84:
            r0 = move-exception
            goto L88
        L86:
            r0 = r4
            goto L8e
        L88:
            em5 r7 = new em5
            r7.<init>(r0)
            r0 = r7
        L8e:
            boolean r7 = r0 instanceof defpackage.em5
            if (r7 == 0) goto L94
            r0 = r4
        L94:
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto La0
            java.lang.String r0 = r6.j()
            if (r0 != 0) goto La0
            java.lang.String r0 = "ROM"
        La0:
            r9 = r0
            android.content.ContentResolver r0 = r3.getContentResolver()     // Catch: java.lang.Throwable -> Lc5
            java.io.InputStream r7 = r0.openInputStream(r10)     // Catch: java.lang.Throwable -> Lc5
            if (r7 == 0) goto Lcd
            boolean r0 = r7 instanceof java.io.BufferedInputStream     // Catch: java.lang.Throwable -> Lb3
            if (r0 == 0) goto Lb6
            r0 = r7
            java.io.BufferedInputStream r0 = (java.io.BufferedInputStream) r0     // Catch: java.lang.Throwable -> Lb3
            goto Lbd
        Lb3:
            r0 = move-exception
            r8 = r0
            goto Lc7
        Lb6:
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> Lb3
            r8 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r7, r8)     // Catch: java.lang.Throwable -> Lb3
        Lbd:
            uz5 r0 = defpackage.kn2.K(r0)     // Catch: java.lang.Throwable -> Lb3
            r7.close()     // Catch: java.lang.Throwable -> Lc5
            goto Ld5
        Lc5:
            r0 = move-exception
            goto Lcf
        Lc7:
            throw r8     // Catch: java.lang.Throwable -> Lc8
        Lc8:
            r0 = move-exception
            defpackage.ge7.t(r7, r8)     // Catch: java.lang.Throwable -> Lc5
            throw r0     // Catch: java.lang.Throwable -> Lc5
        Lcd:
            r0 = r4
            goto Ld5
        Lcf:
            em5 r7 = new em5
            r7.<init>(r0)
            r0 = r7
        Ld5:
            boolean r7 = r0 instanceof defpackage.em5
            if (r7 == 0) goto Ldb
            r0 = r4
        Ldb:
            uz5 r0 = (defpackage.uz5) r0
            oq5 r7 = new oq5
            java.lang.String r8 = r6.j()
            if (r8 != 0) goto Le6
            r8 = r9
        Le6:
            android.net.Uri r11 = r6.k()
            it5 r12 = r6.h()
            java.util.Date r13 = r6.i()
            if (r0 == 0) goto Lf8
            boolean r0 = r0.c
        Lf6:
            r14 = r0
            goto Lfa
        Lf8:
            r0 = 0
            goto Lf6
        Lfa:
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
        Lfd:
            if (r7 == 0) goto L60
            r2.add(r7)
            goto L60
        L104:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L10d
            r15.d(r2)     // Catch: java.lang.Throwable -> L10d
        L10d:
            return
        L10e:
            kd6 r3 = (defpackage.kd6) r3
            ng6 r3 = (defpackage.ng6) r3
            android.net.Uri[] r15 = r3.r()
            java.lang.Object r15 = defpackage.fv.E0(r15)
            android.net.Uri r15 = (android.net.Uri) r15
            if (r15 != 0) goto L11f
            goto L141
        L11f:
            yj1 r1 = (defpackage.yj1) r1
            sv4 r0 = defpackage.sv4.READ_WRITE
            xj1 r15 = r1.a(r15, r0)
            xj1 r0 = defpackage.xj1.OK
            if (r15 != r0) goto L12c
            goto L141
        L12c:
            p06 r2 = (defpackage.p06) r2
            xb2 r2 = (defpackage.xb2) r2
            r2.q()
            android.content.SharedPreferences r15 = r3.b
            android.content.SharedPreferences$Editor r15 = r15.edit()
            java.lang.String r0 = "rom_search_dirs"
            r15.putStringSet(r0, r4)
            r15.apply()
        L141:
            return
    }

    @Override // defpackage.y54
    public final int c() {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            r0 = 22
            return r0
        L8:
            r0 = 21
            return r0
    }

    public void d(java.util.ArrayList r4) {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.lang.Object r1 = r3.b
            android.content.Context r1 = (android.content.Context) r1
            java.io.File r1 = r1.getFilesDir()
            java.lang.String r2 = "rom_data.json"
            r0.<init>(r1, r2)
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            java.io.FileOutputStream r2 = new java.io.FileOutputStream
            r2.<init>(r0)
            r1.<init>(r2)
            java.lang.Object r3 = r3.c     // Catch: java.lang.Throwable -> L28
            su2 r3 = (defpackage.su2) r3     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = r3.f(r4)     // Catch: java.lang.Throwable -> L28
            r1.write(r3)     // Catch: java.lang.Throwable -> L28
            r1.close()
            return
        L28:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L2a
        L2a:
            r4 = move-exception
            defpackage.ge7.t(r1, r3)
            throw r4
    }
}
