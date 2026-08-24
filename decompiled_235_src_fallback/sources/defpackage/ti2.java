package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ti2  reason: default package */
/* loaded from: classes.dex */
public abstract class ti2 {
    public static final defpackage.yz3 a = null;
    public static final defpackage.bk b = null;

    static {
            yz3 r0 = new yz3
            r1 = 2
            r0.<init>(r1)
            defpackage.ti2.a = r0
            bk r0 = new bk
            r1 = 1
            r0.<init>(r1)
            defpackage.ti2.b = r0
            return
    }

    public static defpackage.qj2 a(android.content.Context r5, java.util.List r6) {
            java.lang.String r0 = "FontProvider.getFontFamilyResult"
            java.lang.String r0 = defpackage.ln2.f0(r0)
            android.os.Trace.beginSection(r0)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L6a
            r0.<init>()     // Catch: java.lang.Throwable -> L6a
            r1 = 0
        Lf:
            int r2 = r6.size()     // Catch: java.lang.Throwable -> L6a
            if (r1 >= r2) goto L61
            java.lang.Object r2 = r6.get(r1)     // Catch: java.lang.Throwable -> L6a
            ui2 r2 = (defpackage.ui2) r2     // Catch: java.lang.Throwable -> L6a
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L6a
            r4 = 31
            if (r3 < r4) goto L3e
            java.lang.String r3 = r2.e     // Catch: java.lang.Throwable -> L6a
            android.graphics.Typeface r4 = defpackage.je7.c(r3)     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L3e
            android.graphics.fonts.Font r4 = defpackage.je7.d(r4)     // Catch: java.lang.Throwable -> L6a
            if (r4 == 0) goto L3e
            rj2 r4 = new rj2     // Catch: java.lang.Throwable -> L6a
            java.lang.String r2 = r2.f     // Catch: java.lang.Throwable -> L6a
            r4.<init>(r3, r2)     // Catch: java.lang.Throwable -> L6a
            rj2[] r2 = new defpackage.rj2[]{r4}     // Catch: java.lang.Throwable -> L6a
            r0.add(r2)     // Catch: java.lang.Throwable -> L6a
            goto L5e
        L3e:
            android.content.pm.PackageManager r3 = r5.getPackageManager()     // Catch: java.lang.Throwable -> L6a
            android.content.res.Resources r4 = r5.getResources()     // Catch: java.lang.Throwable -> L6a
            android.content.pm.ProviderInfo r3 = b(r3, r2, r4)     // Catch: java.lang.Throwable -> L6a
            if (r3 != 0) goto L55
            qj2 r5 = new qj2     // Catch: java.lang.Throwable -> L6a
            r5.<init>()     // Catch: java.lang.Throwable -> L6a
            android.os.Trace.endSection()
            return r5
        L55:
            java.lang.String r3 = r3.authority     // Catch: java.lang.Throwable -> L6a
            rj2[] r2 = c(r5, r2, r3)     // Catch: java.lang.Throwable -> L6a
            r0.add(r2)     // Catch: java.lang.Throwable -> L6a
        L5e:
            int r1 = r1 + 1
            goto Lf
        L61:
            qj2 r5 = new qj2     // Catch: java.lang.Throwable -> L6a
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L6a
            android.os.Trace.endSection()
            return r5
        L6a:
            r5 = move-exception
            android.os.Trace.endSection()
            throw r5
    }

    public static android.content.pm.ProviderInfo b(android.content.pm.PackageManager r9, defpackage.ui2 r10, android.content.res.Resources r11) {
            bk r0 = defpackage.ti2.b
            yz3 r1 = defpackage.ti2.a
            java.lang.String r2 = "Found content provider "
            java.lang.String r3 = "No package found for authority: "
            java.lang.String r4 = "FontProvider.getProvider"
            java.lang.String r4 = defpackage.ln2.f0(r4)
            android.os.Trace.beginSection(r4)
            java.util.List r4 = r10.d     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r5 = r10.a
            java.lang.String r10 = r10.b
            r6 = 0
            if (r4 == 0) goto L1b
            goto L1f
        L1b:
            java.util.List r4 = defpackage.ej2.S(r11, r6)     // Catch: java.lang.Throwable -> Ldd
        L1f:
            si2 r11 = new si2     // Catch: java.lang.Throwable -> Ldd
            r11.<init>()     // Catch: java.lang.Throwable -> Ldd
            r11.a = r5     // Catch: java.lang.Throwable -> Ldd
            r11.b = r10     // Catch: java.lang.Throwable -> Ldd
            r11.c = r4     // Catch: java.lang.Throwable -> Ldd
            java.lang.Object r7 = r1.h(r11)     // Catch: java.lang.Throwable -> Ldd
            android.content.pm.ProviderInfo r7 = (android.content.pm.ProviderInfo) r7     // Catch: java.lang.Throwable -> Ldd
            if (r7 == 0) goto L36
            android.os.Trace.endSection()
            return r7
        L36:
            android.content.pm.ProviderInfo r7 = r9.resolveContentProvider(r5, r6)     // Catch: java.lang.Throwable -> Ldd
            if (r7 == 0) goto Lcb
            java.lang.String r3 = r7.packageName     // Catch: java.lang.Throwable -> Ldd
            boolean r3 = r3.equals(r10)     // Catch: java.lang.Throwable -> Ldd
            if (r3 == 0) goto Lb1
            java.lang.String r10 = r7.packageName     // Catch: java.lang.Throwable -> Ldd
            r2 = 64
            android.content.pm.PackageInfo r9 = r9.getPackageInfo(r10, r2)     // Catch: java.lang.Throwable -> Ldd
            android.content.pm.Signature[] r9 = r9.signatures     // Catch: java.lang.Throwable -> Ldd
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ldd
            r10.<init>()     // Catch: java.lang.Throwable -> Ldd
            int r2 = r9.length     // Catch: java.lang.Throwable -> Ldd
            r3 = r6
        L55:
            if (r3 >= r2) goto L63
            r5 = r9[r3]     // Catch: java.lang.Throwable -> Ldd
            byte[] r5 = r5.toByteArray()     // Catch: java.lang.Throwable -> Ldd
            r10.add(r5)     // Catch: java.lang.Throwable -> Ldd
            int r3 = r3 + 1
            goto L55
        L63:
            java.util.Collections.sort(r10, r0)     // Catch: java.lang.Throwable -> Ldd
            r9 = r6
        L67:
            int r2 = r4.size()     // Catch: java.lang.Throwable -> Ldd
            if (r9 >= r2) goto Lac
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Ldd
            java.lang.Object r3 = r4.get(r9)     // Catch: java.lang.Throwable -> Ldd
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> Ldd
            r2.<init>(r3)     // Catch: java.lang.Throwable -> Ldd
            java.util.Collections.sort(r2, r0)     // Catch: java.lang.Throwable -> Ldd
            int r3 = r10.size()     // Catch: java.lang.Throwable -> Ldd
            int r5 = r2.size()     // Catch: java.lang.Throwable -> Ldd
            if (r3 == r5) goto L86
            goto L9f
        L86:
            r3 = r6
        L87:
            int r5 = r10.size()     // Catch: java.lang.Throwable -> Ldd
            if (r3 >= r5) goto La5
            java.lang.Object r5 = r10.get(r3)     // Catch: java.lang.Throwable -> Ldd
            byte[] r5 = (byte[]) r5     // Catch: java.lang.Throwable -> Ldd
            java.lang.Object r8 = r2.get(r3)     // Catch: java.lang.Throwable -> Ldd
            byte[] r8 = (byte[]) r8     // Catch: java.lang.Throwable -> Ldd
            boolean r5 = java.util.Arrays.equals(r5, r8)     // Catch: java.lang.Throwable -> Ldd
            if (r5 != 0) goto La2
        L9f:
            int r9 = r9 + 1
            goto L67
        La2:
            int r3 = r3 + 1
            goto L87
        La5:
            r1.l(r11, r7)     // Catch: java.lang.Throwable -> Ldd
            android.os.Trace.endSection()
            return r7
        Lac:
            android.os.Trace.endSection()
            r9 = 0
            return r9
        Lb1:
            android.content.pm.PackageManager$NameNotFoundException r9 = new android.content.pm.PackageManager$NameNotFoundException     // Catch: java.lang.Throwable -> Ldd
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldd
            r11.<init>(r2)     // Catch: java.lang.Throwable -> Ldd
            r11.append(r5)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r0 = ", but package was not "
            r11.append(r0)     // Catch: java.lang.Throwable -> Ldd
            r11.append(r10)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> Ldd
            r9.<init>(r10)     // Catch: java.lang.Throwable -> Ldd
            throw r9     // Catch: java.lang.Throwable -> Ldd
        Lcb:
            android.content.pm.PackageManager$NameNotFoundException r9 = new android.content.pm.PackageManager$NameNotFoundException     // Catch: java.lang.Throwable -> Ldd
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ldd
            r10.<init>(r3)     // Catch: java.lang.Throwable -> Ldd
            r10.append(r5)     // Catch: java.lang.Throwable -> Ldd
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> Ldd
            r9.<init>(r10)     // Catch: java.lang.Throwable -> Ldd
            throw r9     // Catch: java.lang.Throwable -> Ldd
        Ldd:
            r9 = move-exception
            android.os.Trace.endSection()
            throw r9
    }

    public static defpackage.rj2[] c(android.content.Context r20, defpackage.ui2 r21, java.lang.String r22) {
            r1 = r21
            r0 = r22
            java.lang.String r2 = "content"
            java.lang.String r3 = "FontProvider.query"
            java.lang.String r3 = defpackage.ln2.f0(r3)
            android.os.Trace.beginSection(r3)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L133
            r3.<init>()     // Catch: java.lang.Throwable -> L133
            android.net.Uri$Builder r4 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L133
            r4.<init>()     // Catch: java.lang.Throwable -> L133
            android.net.Uri$Builder r4 = r4.scheme(r2)     // Catch: java.lang.Throwable -> L133
            android.net.Uri$Builder r4 = r4.authority(r0)     // Catch: java.lang.Throwable -> L133
            android.net.Uri r6 = r4.build()     // Catch: java.lang.Throwable -> L133
            android.net.Uri$Builder r4 = new android.net.Uri$Builder     // Catch: java.lang.Throwable -> L133
            r4.<init>()     // Catch: java.lang.Throwable -> L133
            android.net.Uri$Builder r2 = r4.scheme(r2)     // Catch: java.lang.Throwable -> L133
            android.net.Uri$Builder r0 = r2.authority(r0)     // Catch: java.lang.Throwable -> L133
            java.lang.String r2 = "file"
            android.net.Uri$Builder r0 = r0.appendPath(r2)     // Catch: java.lang.Throwable -> L133
            android.net.Uri r2 = r0.build()     // Catch: java.lang.Throwable -> L133
            android.content.ContentResolver r0 = r20.getContentResolver()     // Catch: java.lang.Throwable -> L133
            android.content.ContentProviderClient r5 = r0.acquireUnstableContentProviderClient(r6)     // Catch: java.lang.Throwable -> L133
            r4 = 0
            java.lang.String r7 = "_id"
            java.lang.String r8 = "file_id"
            java.lang.String r9 = "font_ttc_index"
            java.lang.String r10 = "font_variation_settings"
            java.lang.String r11 = "font_weight"
            java.lang.String r12 = "font_italic"
            java.lang.String r13 = "result_code"
            java.lang.String[] r7 = new java.lang.String[]{r7, r8, r9, r10, r11, r12, r13}     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r0 = "ContentQueryWrapper.query"
            java.lang.String r0 = defpackage.ln2.f0(r0)     // Catch: java.lang.Throwable -> Lbe
            android.os.Trace.beginSection(r0)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r8 = "query = ?"
            java.lang.String r0 = r1.c     // Catch: java.lang.Throwable -> L123
            java.lang.String[] r9 = new java.lang.String[]{r0}     // Catch: java.lang.Throwable -> L123
            if (r5 != 0) goto L6b
            goto L7a
        L6b:
            r11 = 0
            r10 = 0
            android.database.Cursor r4 = r5.query(r6, r7, r8, r9, r10, r11)     // Catch: android.os.RemoteException -> L72 java.lang.Throwable -> L123
            goto L7a
        L72:
            r0 = move-exception
            java.lang.String r7 = "FontsProvider"
            java.lang.String r8 = "Unable to query the content provider"
            android.util.Log.w(r7, r8, r0)     // Catch: java.lang.Throwable -> L123
        L7a:
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lbe
            if (r4 == 0) goto L10c
            int r7 = r4.getCount()     // Catch: java.lang.Throwable -> Lbe
            if (r7 <= 0) goto L10c
            java.lang.String r3 = "result_code"
            int r3 = r4.getColumnIndex(r3)     // Catch: java.lang.Throwable -> Lbe
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lbe
            r7.<init>()     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r8 = "_id"
            int r8 = r4.getColumnIndex(r8)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r9 = "file_id"
            int r9 = r4.getColumnIndex(r9)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r10 = "font_ttc_index"
            int r10 = r4.getColumnIndex(r10)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r11 = "font_weight"
            int r11 = r4.getColumnIndex(r11)     // Catch: java.lang.Throwable -> Lbe
            java.lang.String r12 = "font_italic"
            int r12 = r4.getColumnIndex(r12)     // Catch: java.lang.Throwable -> Lbe
        Lae:
            boolean r13 = r4.moveToNext()     // Catch: java.lang.Throwable -> Lbe
            if (r13 == 0) goto L10b
            r13 = -1
            if (r3 == r13) goto Lc1
            int r14 = r4.getInt(r3)     // Catch: java.lang.Throwable -> Lbe
            r19 = r14
            goto Lc3
        Lbe:
            r0 = move-exception
            goto L128
        Lc1:
            r19 = 0
        Lc3:
            if (r10 == r13) goto Lcb
            int r14 = r4.getInt(r10)     // Catch: java.lang.Throwable -> Lbe
            r15 = r14
            goto Lcc
        Lcb:
            r15 = 0
        Lcc:
            if (r9 != r13) goto Ld8
            long r0 = r4.getLong(r8)     // Catch: java.lang.Throwable -> Lbe
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r6, r0)     // Catch: java.lang.Throwable -> Lbe
        Ld6:
            r14 = r0
            goto Le1
        Ld8:
            long r0 = r4.getLong(r9)     // Catch: java.lang.Throwable -> Lbe
            android.net.Uri r0 = android.content.ContentUris.withAppendedId(r2, r0)     // Catch: java.lang.Throwable -> Lbe
            goto Ld6
        Le1:
            if (r11 == r13) goto Lea
            int r0 = r4.getInt(r11)     // Catch: java.lang.Throwable -> Lbe
        Le7:
            r16 = r0
            goto Led
        Lea:
            r0 = 400(0x190, float:5.6E-43)
            goto Le7
        Led:
            if (r12 == r13) goto Lfb
            int r0 = r4.getInt(r12)     // Catch: java.lang.Throwable -> Lbe
            r1 = 1
            if (r0 != r1) goto Lfb
            r17 = r1
        Lf8:
            r1 = r21
            goto Lfe
        Lfb:
            r17 = 0
            goto Lf8
        Lfe:
            java.lang.String r0 = r1.f     // Catch: java.lang.Throwable -> Lbe
            rj2 r13 = new rj2     // Catch: java.lang.Throwable -> Lbe
            r18 = r0
            r13.<init>(r14, r15, r16, r17, r18, r19)     // Catch: java.lang.Throwable -> Lbe
            r7.add(r13)     // Catch: java.lang.Throwable -> Lbe
            goto Lae
        L10b:
            r3 = r7
        L10c:
            if (r4 == 0) goto L111
            r4.close()     // Catch: java.lang.Throwable -> L133
        L111:
            if (r5 == 0) goto L116
            r5.close()     // Catch: java.lang.Throwable -> L133
        L116:
            r0 = 0
            rj2[] r0 = new defpackage.rj2[r0]     // Catch: java.lang.Throwable -> L133
            java.lang.Object[] r0 = r3.toArray(r0)     // Catch: java.lang.Throwable -> L133
            rj2[] r0 = (defpackage.rj2[]) r0     // Catch: java.lang.Throwable -> L133
            android.os.Trace.endSection()
            return r0
        L123:
            r0 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lbe
            throw r0     // Catch: java.lang.Throwable -> Lbe
        L128:
            if (r4 == 0) goto L12d
            r4.close()     // Catch: java.lang.Throwable -> L133
        L12d:
            if (r5 == 0) goto L132
            r5.close()     // Catch: java.lang.Throwable -> L133
        L132:
            throw r0     // Catch: java.lang.Throwable -> L133
        L133:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
    }
}
