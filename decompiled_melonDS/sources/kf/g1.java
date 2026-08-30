package kf;

import android.content.Context;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g1 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f8223a;

    /* renamed from: b  reason: collision with root package name */
    public final xf.a f8224b;

    /* renamed from: c  reason: collision with root package name */
    public final LinkedHashMap f8225c = new LinkedHashMap();

    /* renamed from: d  reason: collision with root package name */
    public final Map f8226d = Collections.synchronizedMap(new LinkedHashMap());

    public g1(Context context, xf.a aVar) {
        this.f8223a = context;
        this.f8224b = aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.graphics.Bitmap a(kf.g1 r7, java.lang.String r8, ze.a r9) {
        /*
            android.content.Context r0 = r7.f8223a
            java.util.LinkedHashMap r1 = r7.f8225c
            java.lang.Object r2 = r1.get(r8)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            if (r2 == 0) goto Ld
            return r2
        Ld:
            java.io.File r2 = r0.getExternalCacheDir()
            java.lang.String r3 = "rom_icons"
            r4 = 0
            if (r2 == 0) goto L1c
            java.io.File r5 = new java.io.File
            r5.<init>(r2, r3)
            goto L1d
        L1c:
            r5 = r4
        L1d:
            if (r5 == 0) goto L3a
            boolean r2 = r5.isDirectory()
            r6 = 1
            if (r2 != r6) goto L3a
            java.io.File r2 = new java.io.File
            r2.<init>(r5, r8)
            boolean r6 = r2.isFile()
            if (r6 == 0) goto L3a
            java.lang.String r7 = r2.getAbsolutePath()
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeFile(r7)
            goto L88
        L3a:
            android.net.Uri r2 = r9.f15056d
            k6.c r2 = k6.a.d(r0, r2)
            xf.a r7 = r7.f8224b
            zd.f r7 = r7.a(r2)
            if (r7 != 0) goto L49
            goto L88
        L49:
            android.graphics.Bitmap r7 = r7.c(r9)
            if (r7 == 0) goto L87
            if (r5 == 0) goto L87
            java.io.File r9 = r0.getExternalCacheDir()
            if (r9 == 0) goto L5c
            java.io.File r4 = new java.io.File
            r4.<init>(r9, r3)
        L5c:
            if (r4 != 0) goto L5f
            goto L87
        L5f:
            boolean r9 = r4.isDirectory()
            if (r9 != 0) goto L6b
            boolean r9 = r4.mkdirs()
            if (r9 == 0) goto L87
        L6b:
            java.io.File r9 = new java.io.File
            r9.<init>(r4, r8)
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L87
            r0.<init>(r9)     // Catch: java.lang.Exception -> L87
            android.graphics.Bitmap$CompressFormat r9 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Throwable -> L80
            r2 = 100
            r7.compress(r9, r2, r0)     // Catch: java.lang.Throwable -> L80
            r0.close()     // Catch: java.lang.Exception -> L87
            goto L87
        L80:
            r9 = move-exception
            throw r9     // Catch: java.lang.Throwable -> L82
        L82:
            r2 = move-exception
            l0.f.f(r0, r9)     // Catch: java.lang.Exception -> L87
            throw r2     // Catch: java.lang.Exception -> L87
        L87:
            r4 = r7
        L88:
            if (r4 == 0) goto L8d
            r1.put(r8, r4)
        L8d:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: kf.g1.a(kf.g1, java.lang.String, ze.a):android.graphics.Bitmap");
    }
}
