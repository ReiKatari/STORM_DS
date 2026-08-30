package defpackage;

import android.content.Context;
import android.net.Uri;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bw3  reason: default package */
/* loaded from: classes.dex */
public final class bw3 extends t01 {
    public static final String[] d = {"orientation"};
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bw3(Context context, int i) {
        super(context, 0);
        this.c = i;
    }

    @Override // defpackage.t01, defpackage.fb5
    public final boolean a(n85 n85Var) {
        switch (this.c) {
            case 0:
                Uri uri = (Uri) n85Var.B;
                if ("content".equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
                    return true;
                }
                return false;
            default:
                return "file".equals(((Uri) n85Var.B).getScheme());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
        if (r4 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0074, code lost:
        if (r4 == null) goto L17;
     */
    @Override // defpackage.t01, defpackage.fb5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.oi c(defpackage.n85 r9, int r10) {
        /*
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
            t13 r8 = defpackage.sn2.P(r8)
            oi r10 = new oi
            ln4 r0 = defpackage.ln4.DISK
            java.lang.Object r9 = r9.B
            android.net.Uri r9 = (android.net.Uri) r9
            a32 r2 = new a32
            java.lang.String r9 = r9.getPath()
            r2.<init>(r9)
            java.lang.String r9 = "Orientation"
            t22 r9 = r2.d(r9)
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
            java.lang.String[] r4 = defpackage.bw3.d     // Catch: java.lang.Throwable -> L69 java.lang.RuntimeException -> L6c
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
            t13 r8 = defpackage.sn2.P(r8)
            oi r9 = new oi
            ln4 r0 = defpackage.ln4.DISK
            r9.<init>(r1, r8, r0, r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bw3.c(n85, int):oi");
    }
}
