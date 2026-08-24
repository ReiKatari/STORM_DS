package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m34  reason: default package */
/* loaded from: classes.dex */
public final class m34 extends defpackage.a41 {
    public static final java.lang.String[] d = null;
    public final /* synthetic */ int c;

    static {
            java.lang.String r0 = "orientation"
            java.lang.String[] r0 = new java.lang.String[]{r0}
            defpackage.m34.d = r0
            return
    }

    public /* synthetic */ m34(android.content.Context r1, int r2) {
            r0 = this;
            r0.c = r2
            r2 = 0
            r0.<init>(r1, r2)
            return
    }

    @Override // defpackage.a41, defpackage.xk5
    public final boolean a(defpackage.m44 r2) {
            r1 = this;
            int r1 = r1.c
            switch(r1) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            java.lang.Object r1 = r2.B
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.String r1 = r1.getScheme()
            java.lang.String r2 = "file"
            boolean r1 = r2.equals(r1)
            return r1
        L14:
            java.lang.Object r1 = r2.B
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.String r2 = "content"
            java.lang.String r0 = r1.getScheme()
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L32
            java.lang.String r2 = "media"
            java.lang.String r1 = r1.getAuthority()
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L32
            r1 = 1
            goto L33
        L32:
            r1 = 0
        L33:
            return r1
    }

    @Override // defpackage.a41, defpackage.xk5
    public final defpackage.aj c(defpackage.m44 r9, int r10) {
            r8 = this;
            int r10 = r8.c
            r1 = 0
            android.content.Context r8 = r8.b
            switch(r10) {
                case 0: goto L3e;
                default: goto L8;
            }
        L8:
            android.content.ContentResolver r8 = r8.getContentResolver()
            java.lang.Object r10 = r9.B
            android.net.Uri r10 = (android.net.Uri) r10
            java.io.InputStream r8 = r8.openInputStream(r10)
            a83 r8 = defpackage.hi2.P(r8)
            aj r10 = new aj
            qw4 r0 = defpackage.qw4.DISK
            java.lang.Object r9 = r9.B
            android.net.Uri r9 = (android.net.Uri) r9
            s72 r2 = new s72
            java.lang.String r9 = r9.getPath()
            r2.<init>(r9)
            java.lang.String r9 = "Orientation"
            l72 r9 = r2.d(r9)
            if (r9 != 0) goto L32
            goto L39
        L32:
            java.nio.ByteOrder r2 = r2.d     // Catch: java.lang.NumberFormatException -> L39
            int r9 = r9.e(r2)     // Catch: java.lang.NumberFormatException -> L39
            goto L3a
        L39:
            r9 = 1
        L3a:
            r10.<init>(r1, r8, r0, r9)
            return r10
        L3e:
            android.content.ContentResolver r2 = r8.getContentResolver()
            java.lang.Object r10 = r9.B
            r3 = r10
            android.net.Uri r3 = (android.net.Uri) r3
            r10 = 0
            java.lang.String[] r4 = defpackage.m34.d     // Catch: java.lang.Throwable -> L69 java.lang.RuntimeException -> L6c
            r6 = 0
            r7 = 0
            r5 = 0
            android.database.Cursor r4 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L69 java.lang.RuntimeException -> L6c
            if (r4 == 0) goto L66
            boolean r0 = r4.moveToFirst()     // Catch: java.lang.Throwable -> L62 java.lang.RuntimeException -> L74
            if (r0 != 0) goto L5a
            goto L66
        L5a:
            int r10 = r4.getInt(r10)     // Catch: java.lang.Throwable -> L62 java.lang.RuntimeException -> L74
        L5e:
            r4.close()
            goto L77
        L62:
            r0 = move-exception
            r8 = r0
            r1 = r4
            goto L6e
        L66:
            if (r4 == 0) goto L77
            goto L5e
        L69:
            r0 = move-exception
            r8 = r0
            goto L6e
        L6c:
            r4 = r1
            goto L74
        L6e:
            if (r1 == 0) goto L73
            r1.close()
        L73:
            throw r8
        L74:
            if (r4 == 0) goto L77
            goto L5e
        L77:
            java.lang.String r0 = r2.getType(r3)
            if (r0 == 0) goto L83
            java.lang.String r2 = "video/"
            boolean r0 = r0.startsWith(r2)
        L83:
            android.content.ContentResolver r8 = r8.getContentResolver()
            java.lang.Object r9 = r9.B
            android.net.Uri r9 = (android.net.Uri) r9
            java.io.InputStream r8 = r8.openInputStream(r9)
            a83 r8 = defpackage.hi2.P(r8)
            aj r9 = new aj
            qw4 r0 = defpackage.qw4.DISK
            r9.<init>(r1, r8, r0, r10)
            return r9
    }
}
