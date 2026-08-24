package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: je7  reason: default package */
/* loaded from: classes.dex */
public abstract class je7 {
    public static final defpackage.bl2 a = null;
    public static final defpackage.yz3 b = null;
    public static android.graphics.Paint c;

    static {
            java.lang.String r0 = "TypefaceCompat static init"
            java.lang.String r0 = defpackage.ln2.f0(r0)
            android.os.Trace.beginSection(r0)
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L17
            qe7 r0 = new qe7
            r0.<init>()
            defpackage.je7.a = r0
            goto L57
        L17:
            r1 = 29
            if (r0 < r1) goto L23
            pe7 r0 = new pe7
            r0.<init>()
            defpackage.je7.a = r0
            goto L57
        L23:
            r1 = 28
            if (r0 < r1) goto L2f
            oe7 r0 = new oe7
            r0.<init>()
            defpackage.je7.a = r0
            goto L57
        L2f:
            r1 = 26
            if (r0 < r1) goto L3b
            ne7 r0 = new ne7
            r0.<init>()
            defpackage.je7.a = r0
            goto L57
        L3b:
            java.lang.reflect.Method r0 = defpackage.le7.e0
            if (r0 != 0) goto L46
            java.lang.String r1 = "TypefaceCompatApi24Impl"
            java.lang.String r2 = "Unable to collect necessary private methods.Fallback to legacy implementation."
            android.util.Log.w(r1, r2)
        L46:
            if (r0 == 0) goto L50
            le7 r0 = new le7
            r0.<init>()
            defpackage.je7.a = r0
            goto L57
        L50:
            ke7 r0 = new ke7
            r0.<init>()
            defpackage.je7.a = r0
        L57:
            yz3 r0 = new yz3
            r1 = 16
            r0.<init>(r1)
            defpackage.je7.b = r0
            r0 = 0
            defpackage.je7.c = r0
            android.os.Trace.endSection()
            return
    }

    public static android.graphics.Typeface a(android.content.Context r16, defpackage.aj2 r17, android.content.res.Resources r18, int r19, java.lang.String r20, int r21, int r22, defpackage.gi2 r23, boolean r24) {
            r2 = r16
            r0 = r17
            r4 = r22
            r1 = r23
            boolean r3 = r0 instanceof defpackage.dj2
            r5 = 5
            r6 = -3
            if (r3 == 0) goto L25a
            dj2 r0 = (defpackage.dj2) r0
            java.lang.String r3 = "TypefaceCompat"
            java.lang.String r7 = r0.d
            boolean r8 = android.text.TextUtils.isEmpty(r7)
            r9 = 0
            r10 = 1
            r11 = 0
            if (r8 != 0) goto L25
            android.graphics.Typeface r7 = c(r7)
            if (r7 == 0) goto L25
            goto Le9
        L25:
            java.util.ArrayList r7 = r0.a
            int r8 = r7.size()
            if (r8 != r10) goto L3b
            java.lang.Object r3 = r7.get(r11)
            ui2 r3 = (defpackage.ui2) r3
            java.lang.String r3 = r3.e
            android.graphics.Typeface r7 = c(r3)
            goto Le9
        L3b:
            int r8 = android.os.Build.VERSION.SDK_INT
            r12 = 31
            if (r8 >= r12) goto L44
        L41:
            r7 = r9
            goto Le9
        L44:
            r8 = r11
        L45:
            int r12 = r7.size()
            if (r8 >= r12) goto L5d
            java.lang.Object r12 = r7.get(r8)
            ui2 r12 = (defpackage.ui2) r12
            java.lang.String r12 = r12.e
            android.graphics.Typeface r12 = c(r12)
            if (r12 != 0) goto L5a
            goto L41
        L5a:
            int r8 = r8 + 1
            goto L45
        L5d:
            r12 = r9
            r8 = r11
        L5f:
            int r13 = r7.size()
            if (r8 >= r13) goto Le5
            java.lang.Object r13 = r7.get(r8)
            ui2 r13 = (defpackage.ui2) r13
            int r14 = r7.size()
            int r14 = r14 - r10
            if (r8 != r14) goto L80
            java.lang.String r14 = r13.f
            boolean r14 = android.text.TextUtils.isEmpty(r14)
            if (r14 == 0) goto L80
            java.lang.String r3 = r13.e
            defpackage.r74.x(r12, r3)
            goto Le5
        L80:
            java.lang.String r14 = r13.e
            java.lang.String r15 = r13.f
            android.graphics.Typeface r14 = c(r14)
            android.graphics.fonts.Font r14 = d(r14)
            if (r14 != 0) goto La7
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Unable identify the primary font for "
            r7.<init>(r8)
            java.lang.String r8 = r13.e
            r7.append(r8)
            java.lang.String r8 = ". Falling back to provider font."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            android.util.Log.w(r3, r7)
            goto L41
        La7:
            boolean r13 = android.text.TextUtils.isEmpty(r15)
            if (r13 != 0) goto Lcf
            defpackage.r74.o()     // Catch: java.io.IOException -> Lc8
            defpackage.r74.C()     // Catch: java.io.IOException -> Lc8
            android.graphics.fonts.Font$Builder r13 = defpackage.ij5.e(r14)     // Catch: java.io.IOException -> Lc8
            android.graphics.fonts.Font$Builder r13 = defpackage.r74.i(r13, r15)     // Catch: java.io.IOException -> Lc8
            android.graphics.fonts.Font r13 = defpackage.r74.j(r13)     // Catch: java.io.IOException -> Lc8
            android.graphics.fonts.FontFamily$Builder r13 = defpackage.r74.k(r13)     // Catch: java.io.IOException -> Lc8
            android.graphics.fonts.FontFamily r13 = defpackage.r74.l(r13)     // Catch: java.io.IOException -> Lc8
            goto Ld7
        Lc8:
            java.lang.String r7 = "Failed to clone Font instance. Fall back to provider font."
            android.util.Log.e(r3, r7)
            goto L41
        Lcf:
            android.graphics.fonts.FontFamily$Builder r13 = defpackage.r74.B(r14)
            android.graphics.fonts.FontFamily r13 = defpackage.r74.l(r13)
        Ld7:
            if (r12 != 0) goto Lde
            android.graphics.Typeface$CustomFallbackBuilder r12 = defpackage.r74.f(r13)
            goto Le1
        Lde:
            defpackage.r74.w(r12, r13)
        Le1:
            int r8 = r8 + 1
            goto L5f
        Le5:
            android.graphics.Typeface r7 = defpackage.r74.g(r12)
        Le9:
            if (r7 == 0) goto L108
            if (r1 == 0) goto Lfe
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            q64 r2 = new q64
            r2.<init>(r5, r1, r7)
            r0.post(r2)
        Lfe:
            yz3 r0 = defpackage.je7.b
            java.lang.String r1 = b(r18, r19, r20, r21, r22)
            r0.l(r1, r7)
            return r7
        L108:
            if (r24 == 0) goto L112
            int r3 = r0.c
            if (r3 != 0) goto L110
        L10e:
            r3 = r10
            goto L115
        L110:
            r3 = r11
            goto L115
        L112:
            if (r1 != 0) goto L110
            goto L10e
        L115:
            r7 = -1
            if (r24 == 0) goto L11b
            int r8 = r0.b
            goto L11c
        L11b:
            r8 = r7
        L11c:
            android.os.Handler r12 = new android.os.Handler
            android.os.Looper r13 = android.os.Looper.getMainLooper()
            r12.<init>(r13)
            j97 r13 = new j97
            r14 = 2
            r13.<init>(r14)
            r13.B = r1
            java.util.ArrayList r0 = r0.a
            u63 r15 = new u63
            d72 r1 = new d72
            r1.<init>(r12, r10)
            r12 = 14
            r15.<init>(r12, r13, r1)
            if (r3 == 0) goto L1e4
            int r3 = r0.size()
            if (r3 > r10) goto L1de
            java.lang.Object r0 = r0.get(r11)
            r3 = r0
            ui2 r3 = (defpackage.ui2) r3
            yz3 r0 = defpackage.zi2.a
            java.lang.Object[] r0 = new java.lang.Object[]{r3}
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>(r10)
            r0 = r0[r11]
            java.util.Objects.requireNonNull(r0)
            r12.add(r0)
            java.util.List r0 = java.util.Collections.unmodifiableList(r12)
            java.lang.String r0 = defpackage.zi2.a(r4, r0)
            yz3 r12 = defpackage.zi2.a
            java.lang.Object r12 = r12.h(r0)
            android.graphics.Typeface r12 = (android.graphics.Typeface) r12
            if (r12 == 0) goto L17a
            uo2 r0 = new uo2
            r0.<init>(r5, r13, r12)
            r1.execute(r0)
            r9 = r12
            goto L255
        L17a:
            if (r8 != r7) goto L19c
            java.lang.Object[] r1 = new java.lang.Object[]{r3}
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r10)
            r1 = r1[r11]
            java.util.Objects.requireNonNull(r1)
            r3.add(r1)
            java.util.List r1 = java.util.Collections.unmodifiableList(r3)
            yi2 r0 = defpackage.zi2.b(r0, r2, r1, r4)
            r15.z(r0)
            android.graphics.Typeface r9 = r0.a
            goto L255
        L19c:
            r1 = r0
            xi2 r0 = new xi2
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ThreadPoolExecutor r1 = defpackage.zi2.b     // Catch: java.lang.InterruptedException -> L1cc
            java.util.concurrent.Future r0 = r1.submit(r0)     // Catch: java.lang.InterruptedException -> L1cc
            long r1 = (long) r8
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L1b9 java.util.concurrent.ExecutionException -> L1bb java.util.concurrent.TimeoutException -> L1bd
            java.lang.Object r0 = r0.get(r1, r3)     // Catch: java.lang.InterruptedException -> L1b9 java.util.concurrent.ExecutionException -> L1bb java.util.concurrent.TimeoutException -> L1bd
            yi2 r0 = (defpackage.yi2) r0     // Catch: java.lang.InterruptedException -> L1cc
            r15.z(r0)     // Catch: java.lang.InterruptedException -> L1cc
            android.graphics.Typeface r9 = r0.a     // Catch: java.lang.InterruptedException -> L1cc
            goto L255
        L1b9:
            r0 = move-exception
            goto L1c5
        L1bb:
            r0 = move-exception
            goto L1c6
        L1bd:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException     // Catch: java.lang.InterruptedException -> L1cc
            java.lang.String r1 = "timeout"
            r0.<init>(r1)     // Catch: java.lang.InterruptedException -> L1cc
            throw r0     // Catch: java.lang.InterruptedException -> L1cc
        L1c5:
            throw r0     // Catch: java.lang.InterruptedException -> L1cc
        L1c6:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException     // Catch: java.lang.InterruptedException -> L1cc
            r1.<init>(r0)     // Catch: java.lang.InterruptedException -> L1cc
            throw r1     // Catch: java.lang.InterruptedException -> L1cc
        L1cc:
            java.lang.Object r0 = r15.L
            d72 r0 = (defpackage.d72) r0
            java.lang.Object r1 = r15.B
            j97 r1 = (defpackage.j97) r1
            ub0 r2 = new ub0
            r2.<init>(r1, r6, r11)
            r0.execute(r2)
            goto L255
        L1de:
            java.lang.String r0 = "Fallbacks with blocking fetches are not supported for performance reasons"
            defpackage.i.h(r0)
            return r9
        L1e4:
            java.lang.String r2 = defpackage.zi2.a(r4, r0)
            yz3 r3 = defpackage.zi2.a
            java.lang.Object r3 = r3.h(r2)
            android.graphics.Typeface r3 = (android.graphics.Typeface) r3
            if (r3 == 0) goto L1fc
            uo2 r0 = new uo2
            r0.<init>(r5, r13, r3)
            r1.execute(r0)
            r9 = r3
            goto L255
        L1fc:
            jr1 r1 = new jr1
            r1.<init>(r15, r10)
            java.lang.Object r3 = defpackage.zi2.c
            monitor-enter(r3)
            ci6 r5 = defpackage.zi2.d     // Catch: java.lang.Throwable -> L213
            java.lang.Object r6 = r5.get(r2)     // Catch: java.lang.Throwable -> L213
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L213
            if (r6 == 0) goto L215
            r6.add(r1)     // Catch: java.lang.Throwable -> L213
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L213
            goto L255
        L213:
            r0 = move-exception
            goto L258
        L215:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L213
            r6.<init>()     // Catch: java.lang.Throwable -> L213
            r6.add(r1)     // Catch: java.lang.Throwable -> L213
            r5.put(r2, r6)     // Catch: java.lang.Throwable -> L213
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L213
            r3 = r0
            xi2 r0 = new xi2
            r5 = 1
            r1 = r2
            r2 = r16
            r0.<init>(r1, r2, r3, r4, r5)
            java.util.concurrent.ThreadPoolExecutor r2 = defpackage.zi2.b
            jr1 r3 = new jr1
            r3.<init>(r1, r14)
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r1 != 0) goto L242
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            r1.<init>(r5)
            goto L247
        L242:
            android.os.Handler r1 = new android.os.Handler
            r1.<init>()
        L247:
            h15 r5 = new h15
            r5.<init>()
            r5.B = r0
            r5.L = r3
            r5.R = r1
            r2.execute(r5)
        L255:
            r7 = r18
            goto L27d
        L258:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L213
            throw r0
        L25a:
            bl2 r3 = defpackage.je7.a
            bj2 r0 = (defpackage.bj2) r0
            r7 = r18
            android.graphics.Typeface r9 = r3.o(r2, r0, r7, r4)
            if (r1 == 0) goto L27d
            if (r9 == 0) goto L27a
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r0.<init>(r2)
            q64 r2 = new q64
            r2.<init>(r5, r1, r9)
            r0.post(r2)
            goto L27d
        L27a:
            r1.n(r6)
        L27d:
            if (r9 == 0) goto L288
            yz3 r0 = defpackage.je7.b
            java.lang.String r1 = b(r18, r19, r20, r21, r22)
            r0.l(r1, r9)
        L288:
            return r9
    }

    public static java.lang.String b(android.content.res.Resources r1, int r2, java.lang.String r3, int r4, int r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getResourcePackageName(r2)
            r0.append(r1)
            r1 = 45
            r0.append(r1)
            r0.append(r3)
            r0.append(r1)
            r0.append(r4)
            r0.append(r1)
            r0.append(r2)
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static android.graphics.Typeface c(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L1e
            boolean r1 = r3.isEmpty()
            if (r1 == 0) goto La
            goto L1e
        La:
            r1 = 0
            android.graphics.Typeface r3 = android.graphics.Typeface.create(r3, r1)
            android.graphics.Typeface r2 = android.graphics.Typeface.DEFAULT
            android.graphics.Typeface r1 = android.graphics.Typeface.create(r2, r1)
            if (r3 == 0) goto L1e
            boolean r1 = r3.equals(r1)
            if (r1 != 0) goto L1e
            return r3
        L1e:
            return r0
    }

    public static android.graphics.fonts.Font d(android.graphics.Typeface r2) {
            android.graphics.Paint r0 = defpackage.je7.c
            if (r0 != 0) goto Lb
            android.graphics.Paint r0 = new android.graphics.Paint
            r0.<init>()
            defpackage.je7.c = r0
        Lb:
            android.graphics.Paint r0 = defpackage.je7.c
            r1 = 1092616192(0x41200000, float:10.0)
            r0.setTextSize(r1)
            android.graphics.Paint r0 = defpackage.je7.c
            r0.setTypeface(r2)
            android.graphics.Paint r2 = defpackage.je7.c
            android.graphics.text.PositionedGlyphs r2 = defpackage.ij5.g(r2)
            int r0 = defpackage.ij5.a(r2)
            if (r0 != 0) goto L25
            r2 = 0
            return r2
        L25:
            android.graphics.fonts.Font r2 = defpackage.ij5.f(r2)
            return r2
    }
}
