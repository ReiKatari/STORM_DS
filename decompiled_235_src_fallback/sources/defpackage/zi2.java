package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zi2  reason: default package */
/* loaded from: classes.dex */
public abstract class zi2 {
    public static final defpackage.yz3 a = null;
    public static final java.util.concurrent.ThreadPoolExecutor b = null;
    public static final java.lang.Object c = null;
    public static final defpackage.ci6 d = null;

    static {
            yz3 r0 = new yz3
            r1 = 16
            r0.<init>(r1)
            defpackage.zi2.a = r0
            kx2 r9 = new kx2
            r0 = 1
            r9.<init>(r0)
            java.util.concurrent.ThreadPoolExecutor r2 = new java.util.concurrent.ThreadPoolExecutor
            java.util.concurrent.LinkedBlockingDeque r8 = new java.util.concurrent.LinkedBlockingDeque
            r8.<init>()
            r3 = 0
            r4 = 1
            r5 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS
            r2.<init>(r3, r4, r5, r7, r8, r9)
            r2.allowCoreThreadTimeOut(r0)
            defpackage.zi2.b = r2
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.zi2.c = r0
            ci6 r0 = new ci6
            r1 = 0
            r0.<init>(r1)
            defpackage.zi2.d = r0
            return
    }

    public static java.lang.String a(int r3, java.util.List r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r4.size()
            if (r1 >= r2) goto L2f
            java.lang.Object r2 = r4.get(r1)
            ui2 r2 = (defpackage.ui2) r2
            java.lang.String r2 = r2.g
            r0.append(r2)
            java.lang.String r2 = "-"
            r0.append(r2)
            r0.append(r3)
            int r2 = r4.size()
            int r2 = r2 + (-1)
            if (r1 >= r2) goto L2c
            java.lang.String r2 = ";"
            r0.append(r2)
        L2c:
            int r1 = r1 + 1
            goto L6
        L2f:
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static defpackage.yi2 b(java.lang.String r8, android.content.Context r9, java.util.List r10, int r11) {
            yz3 r0 = defpackage.zi2.a
            java.lang.String r1 = "getFontSync"
            java.lang.String r1 = defpackage.ln2.f0(r1)
            android.os.Trace.beginSection(r1)
            java.lang.Object r1 = r0.h(r8)     // Catch: java.lang.Throwable -> Lc1
            android.graphics.Typeface r1 = (android.graphics.Typeface) r1     // Catch: java.lang.Throwable -> Lc1
            if (r1 == 0) goto L1c
            yi2 r8 = new yi2     // Catch: java.lang.Throwable -> Lc1
            r8.<init>(r1)     // Catch: java.lang.Throwable -> Lc1
            android.os.Trace.endSection()
            return r8
        L1c:
            qj2 r10 = defpackage.ti2.a(r9, r10)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> Lb7 java.lang.Throwable -> Lc1
            java.util.List r1 = r10.b     // Catch: java.lang.Throwable -> Lc1
            int r10 = r10.a     // Catch: java.lang.Throwable -> Lc1
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
            rj2[] r10 = (defpackage.rj2[]) r10     // Catch: java.lang.Throwable -> Lc1
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
            int r7 = r7.f     // Catch: java.lang.Throwable -> Lc1
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
            yi2 r8 = new yi2     // Catch: java.lang.Throwable -> Lc1
            r8.<init>(r10)     // Catch: java.lang.Throwable -> Lc1
            android.os.Trace.endSection()
            return r8
        L5b:
            int r10 = r1.size()     // Catch: java.lang.Throwable -> Lc1
            if (r10 <= r2) goto L81
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> Lc1
            r2 = 29
            if (r10 < r2) goto L81
            bl2 r10 = defpackage.je7.a     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r10 = "TypefaceCompat.createFromFontInfoWithFallback"
            java.lang.String r10 = defpackage.ln2.f0(r10)     // Catch: java.lang.Throwable -> Lc1
            android.os.Trace.beginSection(r10)     // Catch: java.lang.Throwable -> Lc1
            bl2 r10 = defpackage.je7.a     // Catch: java.lang.Throwable -> L7c
            android.graphics.Typeface r9 = r10.q(r9, r1, r11)     // Catch: java.lang.Throwable -> L7c
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lc1
            goto L9b
        L7c:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lc1
            throw r8     // Catch: java.lang.Throwable -> Lc1
        L81:
            java.lang.Object r10 = r1.get(r4)     // Catch: java.lang.Throwable -> Lc1
            rj2[] r10 = (defpackage.rj2[]) r10     // Catch: java.lang.Throwable -> Lc1
            bl2 r1 = defpackage.je7.a     // Catch: java.lang.Throwable -> Lc1
            java.lang.String r1 = "TypefaceCompat.createFromFontInfo"
            java.lang.String r1 = defpackage.ln2.f0(r1)     // Catch: java.lang.Throwable -> Lc1
            android.os.Trace.beginSection(r1)     // Catch: java.lang.Throwable -> Lc1
            bl2 r1 = defpackage.je7.a     // Catch: java.lang.Throwable -> Lb2
            android.graphics.Typeface r9 = r1.p(r9, r10, r11)     // Catch: java.lang.Throwable -> Lb2
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lc1
        L9b:
            if (r9 == 0) goto La9
            r0.l(r8, r9)     // Catch: java.lang.Throwable -> Lc1
            yi2 r8 = new yi2     // Catch: java.lang.Throwable -> Lc1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lc1
            android.os.Trace.endSection()
            return r8
        La9:
            yi2 r8 = new yi2     // Catch: java.lang.Throwable -> Lc1
            r8.<init>(r3)     // Catch: java.lang.Throwable -> Lc1
            android.os.Trace.endSection()
            return r8
        Lb2:
            r8 = move-exception
            android.os.Trace.endSection()     // Catch: java.lang.Throwable -> Lc1
            throw r8     // Catch: java.lang.Throwable -> Lc1
        Lb7:
            yi2 r8 = new yi2     // Catch: java.lang.Throwable -> Lc1
            r9 = -1
            r8.<init>(r9)     // Catch: java.lang.Throwable -> Lc1
            android.os.Trace.endSection()
            return r8
        Lc1:
            r8 = move-exception
            android.os.Trace.endSection()
            throw r8
    }
}
