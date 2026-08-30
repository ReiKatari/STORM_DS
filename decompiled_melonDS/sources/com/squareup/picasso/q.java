package com.squareup.picasso;

import android.content.Context;
import android.net.Uri;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q extends h {

    /* renamed from: d  reason: collision with root package name */
    public static final String[] f3275d = {"orientation"};

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ int f3276c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q(Context context, int i2) {
        super(context, 0);
        this.f3276c = i2;
    }

    @Override // com.squareup.picasso.h, com.squareup.picasso.f0
    public final boolean a(a4.n nVar) {
        switch (this.f3276c) {
            case 0:
                Uri uri = (Uri) nVar.B;
                if ("content".equals(uri.getScheme()) && "media".equals(uri.getAuthority())) {
                    return true;
                }
                return false;
            default:
                return "file".equals(((Uri) nVar.B).getScheme());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0068, code lost:
        if (r2 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
        if (r2 == null) goto L17;
     */
    @Override // com.squareup.picasso.h, com.squareup.picasso.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final cd.h1 c(a4.n r9, int r10) {
        /*
            r8 = this;
            int r10 = r8.f3276c
            switch(r10) {
                case 0: goto L3e;
                default: goto L5;
            }
        L5:
            android.content.Context r10 = r8.f3230b
            android.content.ContentResolver r10 = r10.getContentResolver()
            java.lang.Object r0 = r9.B
            android.net.Uri r0 = (android.net.Uri) r0
            java.io.InputStream r10 = r10.openInputStream(r0)
            fj.r r10 = ij.a.w0(r10)
            cd.h1 r0 = new cd.h1
            com.squareup.picasso.y r1 = com.squareup.picasso.y.DISK
            java.lang.Object r9 = r9.B
            android.net.Uri r9 = (android.net.Uri) r9
            c.e r2 = new c.e
            java.lang.String r9 = r9.getPath()
            r2.<init>(r9)
            java.lang.String r9 = "Orientation"
            c.b r9 = r2.d(r9)
            if (r9 != 0) goto L31
            goto L38
        L31:
            java.nio.ByteOrder r2 = r2.f2359d     // Catch: java.lang.NumberFormatException -> L38
            int r9 = r9.e(r2)     // Catch: java.lang.NumberFormatException -> L38
            goto L39
        L38:
            r9 = 1
        L39:
            r2 = 0
            r0.<init>(r2, r10, r1, r9)
            return r0
        L3e:
            android.content.Context r10 = r8.f3230b
            android.content.ContentResolver r0 = r10.getContentResolver()
            java.lang.Object r1 = r9.B
            android.net.Uri r1 = (android.net.Uri) r1
            r6 = 0
            r7 = 0
            java.lang.String[] r2 = com.squareup.picasso.q.f3275d     // Catch: java.lang.Throwable -> L6b java.lang.RuntimeException -> L6e
            r4 = 0
            r5 = 0
            r3 = 0
            android.database.Cursor r2 = r0.query(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L6b java.lang.RuntimeException -> L6e
            if (r2 == 0) goto L68
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L64 java.lang.RuntimeException -> L76
            if (r3 != 0) goto L5c
            goto L68
        L5c:
            int r6 = r2.getInt(r6)     // Catch: java.lang.Throwable -> L64 java.lang.RuntimeException -> L76
        L60:
            r2.close()
            goto L79
        L64:
            r0 = move-exception
            r9 = r0
            r7 = r2
            goto L70
        L68:
            if (r2 == 0) goto L79
            goto L60
        L6b:
            r0 = move-exception
            r9 = r0
            goto L70
        L6e:
            r2 = r7
            goto L76
        L70:
            if (r7 == 0) goto L75
            r7.close()
        L75:
            throw r9
        L76:
            if (r2 == 0) goto L79
            goto L60
        L79:
            java.lang.String r0 = r0.getType(r1)
            if (r0 == 0) goto L85
            java.lang.String r1 = "video/"
            boolean r0 = r0.startsWith(r1)
        L85:
            android.content.ContentResolver r10 = r10.getContentResolver()
            java.lang.Object r9 = r9.B
            android.net.Uri r9 = (android.net.Uri) r9
            java.io.InputStream r9 = r10.openInputStream(r9)
            fj.r r9 = ij.a.w0(r9)
            cd.h1 r10 = new cd.h1
            com.squareup.picasso.y r0 = com.squareup.picasso.y.DISK
            r10.<init>(r7, r9, r0, r6)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.squareup.picasso.q.c(a4.n, int):cd.h1");
    }
}
