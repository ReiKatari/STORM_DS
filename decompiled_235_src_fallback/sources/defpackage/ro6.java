package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ro6  reason: default package */
/* loaded from: classes.dex */
public final class ro6 {
    public final android.content.Context a;
    public final defpackage.kd6 b;
    public final defpackage.uh7 c;

    public ro6(android.content.Context r1, defpackage.kd6 r2, defpackage.uh7 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final android.net.Uri a(defpackage.pq5 r13) {
            r12 = this;
            java.lang.String r0 = ".bak"
            android.content.Context r1 = r12.a
            java.lang.String r2 = "Created shadow backup '"
            r13.getClass()
            kd6 r3 = r12.b
            ng6 r3 = (defpackage.ng6) r3
            android.net.Uri r4 = r3.u(r13)
            uh7 r12 = r12.c
            zl1 r5 = r12.b(r4)
            if (r5 == 0) goto L111
            android.net.Uri r4 = r13.d
            zl1 r12 = r12.a(r4)
            r4 = 0
            if (r12 == 0) goto Lff
            java.lang.String r6 = r12.i()
            if (r6 != 0) goto L2a
            goto Lff
        L2a:
            android.content.SharedPreferences r12 = r3.b
            java.lang.String r3 = "save_file_use_srm_extension"
            r7 = 0
            boolean r12 = r12.getBoolean(r3, r7)
            if (r12 == 0) goto L38
            java.lang.String r12 = "srm"
            goto L3a
        L38:
            java.lang.String r12 = "sav"
        L3a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r6)
            java.lang.String r7 = "."
            r3.append(r7)
            r3.append(r12)
            java.lang.String r3 = r3.toString()
            java.lang.String r12 = defpackage.qs6.F0(r6, r12, r3)
            java.lang.String r13 = r13.a
            java.lang.String r3 = "resolved save file '"
            java.lang.String r6 = "' for rom='"
            java.lang.String r7 = "'"
            java.lang.String r13 = defpackage.lb1.n(r3, r12, r6, r13, r7)
            java.lang.String r3 = "SramProvider"
            android.util.Log.i(r3, r13)
            zl1 r13 = r5.f(r12)
            java.lang.String r6 = "application/*"
            if (r13 == 0) goto Ld5
            long r8 = r13.n()     // Catch: java.lang.Throwable -> Lcd
            r10 = 0
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 <= 0) goto Lcd
            java.lang.String r12 = r12.concat(r0)     // Catch: java.lang.Throwable -> Lcd
            zl1 r0 = r5.f(r12)     // Catch: java.lang.Throwable -> Lcd
            if (r0 != 0) goto L83
            zl1 r0 = r5.c(r6, r12)     // Catch: java.lang.Throwable -> Lcd
        L83:
            if (r0 == 0) goto Lcd
            android.content.ContentResolver r4 = r1.getContentResolver()     // Catch: java.lang.Throwable -> Lcd
            android.net.Uri r5 = r13.j()     // Catch: java.lang.Throwable -> Lcd
            java.io.InputStream r4 = r4.openInputStream(r5)     // Catch: java.lang.Throwable -> Lcd
            if (r4 == 0) goto Lbb
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Throwable -> La8
            android.net.Uri r0 = r0.j()     // Catch: java.lang.Throwable -> La8
            java.io.OutputStream r0 = r1.openOutputStream(r0)     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto Lb1
            defpackage.f04.w(r4, r0)     // Catch: java.lang.Throwable -> Laa
            r0.close()     // Catch: java.lang.Throwable -> La8
            goto Lb1
        La8:
            r12 = move-exception
            goto Lb5
        Laa:
            r12 = move-exception
            throw r12     // Catch: java.lang.Throwable -> Lac
        Lac:
            r1 = move-exception
            defpackage.ge7.t(r0, r12)     // Catch: java.lang.Throwable -> La8
            throw r1     // Catch: java.lang.Throwable -> La8
        Lb1:
            r4.close()     // Catch: java.lang.Throwable -> Lcd
            goto Lbb
        Lb5:
            throw r12     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            r0 = move-exception
            defpackage.ge7.t(r4, r12)     // Catch: java.lang.Throwable -> Lcd
            throw r0     // Catch: java.lang.Throwable -> Lcd
        Lbb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcd
            r0.<init>(r2)     // Catch: java.lang.Throwable -> Lcd
            r0.append(r12)     // Catch: java.lang.Throwable -> Lcd
            r0.append(r7)     // Catch: java.lang.Throwable -> Lcd
            java.lang.String r12 = r0.toString()     // Catch: java.lang.Throwable -> Lcd
            android.util.Log.i(r3, r12)     // Catch: java.lang.Throwable -> Lcd
        Lcd:
            android.net.Uri r12 = r13.j()
            r12.getClass()
            return r12
        Ld5:
            zl1 r13 = r5.c(r6, r12)
            if (r13 == 0) goto Ldf
            android.net.Uri r4 = r13.j()
        Ldf:
            if (r4 != 0) goto Lfe
            zl1 r12 = r5.f(r12)
            if (r12 == 0) goto Lee
            android.net.Uri r12 = r12.j()
            if (r12 == 0) goto Lee
            return r12
        Lee:
            qo6 r12 = new qo6
            android.net.Uri r13 = r5.j()
            java.lang.String r0 = "Could not create temporary SRAM file at "
            java.lang.String r13 = defpackage.xg6.n(r13, r0)
            r12.<init>(r13)
            throw r12
        Lfe:
            return r4
        Lff:
            qo6 r13 = new qo6
            if (r12 == 0) goto L107
            android.net.Uri r4 = r12.j()
        L107:
            java.lang.String r12 = "Cannot determine SRAM file name: "
            java.lang.String r12 = defpackage.xg6.n(r4, r12)
            r13.<init>(r12)
            throw r13
        L111:
            qo6 r12 = new qo6
            java.lang.String r13 = "Cannot create root document: "
            java.lang.String r13 = defpackage.xg6.n(r4, r13)
            r12.<init>(r13)
            throw r12
    }
}
