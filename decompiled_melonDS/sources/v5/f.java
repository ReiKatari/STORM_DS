package v5;

import a1.s;
import a1.w0;
import com.squareup.picasso.j0;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a  reason: collision with root package name */
    public static final s f13741a = new s(16);

    /* renamed from: b  reason: collision with root package name */
    public static final ThreadPoolExecutor f13742b;

    /* renamed from: c  reason: collision with root package name */
    public static final Object f13743c;

    /* renamed from: d  reason: collision with root package name */
    public static final w0 f13744d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new j0(2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        f13742b = threadPoolExecutor;
        f13743c = new Object();
        f13744d = new w0(0);
    }

    public static String a(int i2, List list) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((c) list.get(i10)).f13733g);
            sb2.append("-");
            sb2.append(i2);
            if (i10 < list.size() - 1) {
                sb2.append(";");
            }
        }
        return sb2.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0052 A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #3 {all -> 0x00c1, blocks: (B:3:0x000b, B:5:0x0013, B:8:0x001c, B:9:0x0020, B:30:0x0052, B:33:0x005b, B:35:0x0061, B:37:0x0067, B:39:0x0078, B:47:0x009d, B:50:0x00a9, B:43:0x0081, B:45:0x0098, B:14:0x002f, B:16:0x0037, B:19:0x003b, B:21:0x003f, B:26:0x004a, B:56:0x00b7, B:44:0x0092, B:38:0x0072), top: B:64:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b A[Catch: all -> 0x00c1, TRY_ENTER, TryCatch #3 {all -> 0x00c1, blocks: (B:3:0x000b, B:5:0x0013, B:8:0x001c, B:9:0x0020, B:30:0x0052, B:33:0x005b, B:35:0x0061, B:37:0x0067, B:39:0x0078, B:47:0x009d, B:50:0x00a9, B:43:0x0081, B:45:0x0098, B:14:0x002f, B:16:0x0037, B:19:0x003b, B:21:0x003f, B:26:0x004a, B:56:0x00b7, B:44:0x0092, B:38:0x0072), top: B:64:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static v5.e b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
        /*
            a1.s r0 = v5.f.f13741a
            java.lang.String r1 = "getFontSync"
            java.lang.String r1 = aj.g.v0(r1)
            android.os.Trace.beginSection(r1)
            java.lang.Object r1 = r0.h(r8)     // Catch: java.lang.Throwable -> Lc1
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1     // Catch: java.lang.Throwable -> Lc1
            if (r1 == 0) goto L1c
            v5.e r8 = new v5.e     // Catch: java.lang.Throwable -> Lc1
            r8.<init>(r1)     // Catch: java.lang.Throwable -> Lc1
            android.os.Trace.endSection()
            return r8
        L1c:
            o1.r r10 = v5.b.a(r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb7 java.lang.Throwable -> Lc1
            java.util.List r1 = r10.f10586b     // Catch: java.lang.Throwable -> Lc1
            int r10 = r10.f10585a     // Catch: java.lang.Throwable -> Lc1
            r2 = 1
            r3 = -3
            r4 = 0
            if (r10 == 0) goto L2f
            if (r10 == r2) goto L2d
        L2b:
            r10 = r3
            goto L50
        L2d:
            r10 = -2
            goto L50
        L2f:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> Lc1
            v5.g[] r10 = (v5.g[]) r10     // Catch: java.lang.Throwable -> Lc1
            if (r10 == 0) goto L4f
            int r5 = r10.length     // Catch: java.lang.Throwable -> Lc1
            if (r5 != 0) goto L3b
            goto L4f
        L3b:
            int r5 = r10.length     // Catch: java.lang.Throwable -> Lc1
            r6 = r4
        L3d:
            if (r6 >= r5) goto L4d
            r7 = r10[r6]     // Catch: java.lang.Throwable -> Lc1
            int r7 = r7.f13750f     // Catch: java.lang.Throwable -> Lc1
            if (r7 == 0) goto L4a
            if (r7 >= 0) goto L48
            goto L2b
        L48:
            r10 = r7
            goto L50
        L4a:
            int r6 = r6 + 1
            goto L3d
        L4d:
            r10 = r4
            goto L50
        L4f:
            r10 = r2
        L50:
            if (r10 == 0) goto L5b
            v5.e r8 = new v5.e     // Catch: java.lang.Throwable -> Lc1
            r8.<init>(r10)     // Catch: java.lang.Throwable -> Lc1
            android.os.Trace.endSection()
            return r8
        L5b:
            int r10 = r1.size()     // Catch: java.lang.Throwable -> Lc1
            if (r10 <= r2) goto L81
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lc1
            r2 = 29
            if (r10 < r2) goto L81
            p7.j r10 = q5.e.f12290a     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r10 = "TypefaceCompat.createFromFontInfoWithFallback"
            java.lang.String r10 = aj.g.v0(r10)     // Catch: java.lang.Throwable -> Lc1
            android.os.Trace.beginSection(r10)     // Catch: java.lang.Throwable -> Lc1
            p7.j r10 = q5.e.f12290a     // Catch: java.lang.Throwable -> L7c
            android.graphics.Typeface r9 = r10.r(r9, r1, r11)     // Catch: java.lang.Throwable -> L7c
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lc1
            goto L9b
        L7c:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lc1
            throw r8     // Catch: java.lang.Throwable -> Lc1
        L81:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> Lc1
            v5.g[] r10 = (v5.g[]) r10     // Catch: java.lang.Throwable -> Lc1
            p7.j r1 = q5.e.f12290a     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "TypefaceCompat.createFromFontInfo"
            java.lang.String r1 = aj.g.v0(r1)     // Catch: java.lang.Throwable -> Lc1
            android.os.Trace.beginSection(r1)     // Catch: java.lang.Throwable -> Lc1
            p7.j r1 = q5.e.f12290a     // Catch: java.lang.Throwable -> Lb2
            android.graphics.Typeface r9 = r1.q(r9, r10, r11)     // Catch: java.lang.Throwable -> Lb2
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lc1
        L9b:
            if (r9 == 0) goto La9
            r0.l(r8, r9)     // Catch: java.lang.Throwable -> Lc1
            v5.e r8 = new v5.e     // Catch: java.lang.Throwable -> Lc1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lc1
            android.os.Trace.endSection()
            return r8
        La9:
            v5.e r8 = new v5.e     // Catch: java.lang.Throwable -> Lc1
            r8.<init>(r3)     // Catch: java.lang.Throwable -> Lc1
            android.os.Trace.endSection()
            return r8
        Lb2:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lc1
            throw r8     // Catch: java.lang.Throwable -> Lc1
        Lb7:
            v5.e r8 = new v5.e     // Catch: java.lang.Throwable -> Lc1
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lc1
            android.os.Trace.endSection()
            return r8
        Lc1:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: v5.f.b(java.lang.String, android.content.Context, java.util.List, int):v5.e");
    }
}
