package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ny0  reason: default package */
/* loaded from: classes.dex */
public abstract class ny0 implements defpackage.pw5 {
    public static final java.util.List d = null;
    public final android.content.Context a;
    public final defpackage.uh7 b;
    public final defpackage.ud4 c;

    static {
            java.lang.String r0 = "dsi"
            java.lang.String r1 = "ids"
            java.lang.String r2 = "nds"
            java.lang.String[] r0 = new java.lang.String[]{r2, r0, r1}
            java.util.List r0 = defpackage.hf.c0(r0)
            defpackage.ny0.d = r0
            return
    }

    public ny0(android.content.Context r1, defpackage.uh7 r2, defpackage.ud4 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public static java.lang.Comparable h(defpackage.ny0 r5, defpackage.pq5 r6, defpackage.s41 r7) {
            boolean r0 = r7 instanceof defpackage.my0
            if (r0 == 0) goto L13
            r0 = r7
            my0 r0 = (defpackage.my0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            my0 r0 = new my0
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L28
            defpackage.oi2.Y(r7)     // Catch: defpackage.ly0 -> L46
            goto L43
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r4
        L2e:
            defpackage.oi2.Y(r7)
            ud4 r7 = r5.c
            android.net.Uri r7 = r7.d(r6, r3)
            if (r7 == 0) goto L3a
            return r7
        L3a:
            r0.Y = r3     // Catch: defpackage.ly0 -> L46
            java.lang.Object r7 = r5.e(r6, r0)     // Catch: defpackage.ly0 -> L46
            if (r7 != r1) goto L43
            return r1
        L43:
            android.net.Uri r7 = (android.net.Uri) r7     // Catch: defpackage.ly0 -> L46
            return r7
        L46:
            return r4
    }

    public static boolean i(java.lang.String r1) {
            r0 = 46
            java.lang.String r1 = defpackage.qs6.O0(r0, r1, r1)
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r0)
            r1.getClass()
            java.util.List r0 = defpackage.ny0.d
            boolean r1 = r0.contains(r1)
            return r1
    }

    @Override // defpackage.pw5
    public final defpackage.lx5 a(defpackage.pq5 r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            java.io.InputStream r2 = r2.f(r3)     // Catch: java.lang.Exception -> L12
            if (r2 == 0) goto L1b
            lx5 r3 = defpackage.kn2.J(r3, r2)     // Catch: java.lang.Throwable -> L14
            r2.close()     // Catch: java.lang.Exception -> L12
            return r3
        L12:
            r2 = move-exception
            goto L1c
        L14:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L16
        L16:
            r1 = move-exception
            defpackage.ge7.t(r2, r3)     // Catch: java.lang.Exception -> L12
            throw r1     // Catch: java.lang.Exception -> L12
        L1b:
            return r0
        L1c:
            r2.printStackTrace()
            return r0
    }

    @Override // defpackage.pw5
    public final java.lang.Object b(defpackage.pq5 r1, defpackage.dh r2) {
            r0 = this;
            java.lang.Comparable r0 = h(r0, r1, r2)
            return r0
    }

    @Override // defpackage.pw5
    public final android.graphics.Bitmap c(defpackage.pq5 r3) {
            r2 = this;
            r3.getClass()
            r0 = 0
            java.io.InputStream r2 = r2.f(r3)     // Catch: java.lang.Exception -> L12
            if (r2 == 0) goto L1b
            android.graphics.Bitmap r3 = defpackage.kn2.I(r2)     // Catch: java.lang.Throwable -> L14
            r2.close()     // Catch: java.lang.Exception -> L12
            return r3
        L12:
            r2 = move-exception
            goto L1c
        L14:
            r3 = move-exception
            throw r3     // Catch: java.lang.Throwable -> L16
        L16:
            r1 = move-exception
            defpackage.ge7.t(r2, r3)     // Catch: java.lang.Exception -> L12
            throw r1     // Catch: java.lang.Exception -> L12
        L1b:
            return r0
        L1c:
            r2.printStackTrace()
            return r0
    }

    @Override // defpackage.pw5
    public final defpackage.pq5 d(android.net.Uri r37, android.net.Uri r38) {
            r36 = this;
            r0 = r36
            r4 = r37
            r16 = 0
            uh7 r1 = r0.b     // Catch: java.lang.Exception -> L20
            zl1 r1 = r1.a(r4)     // Catch: java.lang.Exception -> L20
            if (r1 == 0) goto L23
            java.lang.String r2 = defpackage.hf.V(r1)     // Catch: java.lang.Exception -> L20
            if (r2 == 0) goto L23
            boolean r3 = defpackage.ln2.G(r2)     // Catch: java.lang.Exception -> L20
            if (r3 != 0) goto L1b
            goto L1d
        L1b:
            r2 = r16
        L1d:
            if (r2 != 0) goto L38
            goto L23
        L20:
            r0 = move-exception
            goto L105
        L23:
            java.lang.String r2 = r4.getLastPathSegment()     // Catch: java.lang.Exception -> L20
            if (r2 == 0) goto L36
            r3 = 47
            java.lang.String r2 = defpackage.qs6.O0(r3, r2, r2)     // Catch: java.lang.Exception -> L20
            r3 = 46
            java.lang.String r2 = defpackage.qs6.R0(r3, r2, r2)     // Catch: java.lang.Exception -> L20
            goto L38
        L36:
            java.lang.String r2 = "Compressed Game"
        L38:
            if (r1 == 0) goto L43
            java.lang.String r1 = r1.i()     // Catch: java.lang.Exception -> L20
            if (r1 != 0) goto L41
            goto L43
        L41:
            r3 = r1
            goto L44
        L43:
            r3 = r2
        L44:
            android.content.Context r1 = r0.a     // Catch: java.lang.Exception -> L20
            android.content.ContentResolver r1 = r1.getContentResolver()     // Catch: java.lang.Exception -> L20
            java.io.InputStream r1 = r1.openInputStream(r4)     // Catch: java.lang.Exception -> L20
            if (r1 == 0) goto L75
            ss0 r5 = r0.g(r1)     // Catch: java.lang.Throwable -> L5e
            if (r5 == 0) goto L69
            uz5 r0 = defpackage.kn2.K(r5)     // Catch: java.lang.Throwable -> L61
            r5.close()     // Catch: java.lang.Throwable -> L5e
            goto L6b
        L5e:
            r0 = move-exception
            r2 = r0
            goto L6f
        L61:
            r0 = move-exception
            r2 = r0
            throw r2     // Catch: java.lang.Throwable -> L64
        L64:
            r0 = move-exception
            defpackage.ge7.t(r5, r2)     // Catch: java.lang.Throwable -> L5e
            throw r0     // Catch: java.lang.Throwable -> L5e
        L69:
            r0 = r16
        L6b:
            r1.close()     // Catch: java.lang.Exception -> L20
            goto L77
        L6f:
            throw r2     // Catch: java.lang.Throwable -> L70
        L70:
            r0 = move-exception
            defpackage.ge7.t(r1, r2)     // Catch: java.lang.Exception -> L20
            throw r0     // Catch: java.lang.Exception -> L20
        L75:
            r0 = r16
        L77:
            if (r0 == 0) goto L86
            java.lang.String r1 = r0.a     // Catch: java.lang.Exception -> L20
            boolean r5 = defpackage.ln2.G(r1)     // Catch: java.lang.Exception -> L20
            if (r5 != 0) goto L82
            goto L84
        L82:
            r1 = r16
        L84:
            if (r1 != 0) goto L87
        L86:
            r1 = r2
        L87:
            if (r0 == 0) goto L8d
            boolean r2 = r0.c     // Catch: java.lang.Exception -> L20
        L8b:
            r8 = r2
            goto L8f
        L8d:
            r2 = 0
            goto L8b
        L8f:
            pq5 r2 = new pq5     // Catch: java.lang.Exception -> L20
            java.lang.String r5 = ""
            if (r0 == 0) goto L98
            java.lang.String r6 = r0.b     // Catch: java.lang.Exception -> L20
            goto L99
        L98:
            r6 = r5
        L99:
            if (r8 == 0) goto Lc5
            jt5 r17 = new jt5     // Catch: java.lang.Exception -> L20
            u26 r18 = defpackage.u26.DSi     // Catch: java.lang.Exception -> L20
            a36 r19 = defpackage.a36.DEFAULT     // Catch: java.lang.Exception -> L20
            uw5 r21 = defpackage.uw5.o     // Catch: java.lang.Exception -> L20
            nx5 r24 = defpackage.nx5.GLOBAL     // Catch: java.lang.Exception -> L20
            r34 = 0
            r35 = 0
            r20 = 0
            r22 = 0
            r23 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r31 = 0
            r32 = 0
            r33 = 0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch: java.lang.Exception -> L20
            goto Le9
        Lc5:
            jt5 r17 = new jt5     // Catch: java.lang.Exception -> L20
            r31 = 0
            r32 = 262143(0x3ffff, float:3.6734E-40)
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 0
            r26 = 0
            r27 = 0
            r28 = 0
            r29 = 0
            r30 = 0
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)     // Catch: java.lang.Exception -> L20
        Le9:
            if (r0 == 0) goto Lf2
            java.lang.String r0 = r0.d     // Catch: java.lang.Exception -> L20
            if (r0 != 0) goto Lf0
            goto Lf2
        Lf0:
            r9 = r0
            goto Lf3
        Lf2:
            r9 = r5
        Lf3:
            r14 = 0
            r15 = 7680(0x1e00, float:1.0762E-41)
            r7 = 0
            r10 = 0
            r12 = 0
            r13 = 0
            r5 = r38
            r0 = r2
            r2 = r6
            r6 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13, r14, r15)     // Catch: java.lang.Exception -> L20
            return r0
        L105:
            r0.printStackTrace()
            return r16
    }

    public final java.lang.Object e(defpackage.pq5 r6, defpackage.my0 r7) {
            r5 = this;
            ud4 r0 = r5.c
            n36 r1 = new n36
            r41 r7 = defpackage.np2.V(r7)
            x61 r2 = defpackage.x61.UNDECIDED
            r1.<init>(r7, r2)
            android.content.Context r2 = r5.a
            android.content.ContentResolver r2 = r2.getContentResolver()
            android.net.Uri r3 = r6.d
            java.io.InputStream r2 = r2.openInputStream(r3)
            if (r2 == 0) goto L76
            ss0 r5 = r5.g(r2)     // Catch: java.lang.Throwable -> L55
            if (r5 == 0) goto L5d
            u63 r3 = new u63     // Catch: java.lang.Throwable -> L4c
            r4 = 24
            r3.<init>(r4, r5, r1)     // Catch: java.lang.Throwable -> L4c
            r0.a(r6, r3)     // Catch: java.lang.Throwable -> L4c
            l61 r7 = r7.b()     // Catch: java.lang.Throwable -> L4c
            boolean r7 = defpackage.yh2.z(r7)     // Catch: java.lang.Throwable -> L4c
            if (r7 == 0) goto L51
            r7 = 0
            android.net.Uri r6 = r0.d(r6, r7)     // Catch: java.lang.Throwable -> L4c
            if (r6 != 0) goto L4e
            ly0 r6 = new ly0     // Catch: java.lang.Throwable -> L4c
            java.lang.String r7 = "Failed to find extracted NDS ROM file"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L4c
            em5 r7 = new em5     // Catch: java.lang.Throwable -> L4c
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L4c
            r1.i(r7)     // Catch: java.lang.Throwable -> L4c
            goto L51
        L4c:
            r6 = move-exception
            goto L57
        L4e:
            r1.i(r6)     // Catch: java.lang.Throwable -> L4c
        L51:
            r5.close()     // Catch: java.lang.Throwable -> L55
            goto L6c
        L55:
            r5 = move-exception
            goto L70
        L57:
            throw r6     // Catch: java.lang.Throwable -> L58
        L58:
            r7 = move-exception
            defpackage.ge7.t(r5, r6)     // Catch: java.lang.Throwable -> L55
            throw r7     // Catch: java.lang.Throwable -> L55
        L5d:
            ly0 r5 = new ly0     // Catch: java.lang.Throwable -> L55
            java.lang.String r6 = "Failed to find an NDS ROM to extract"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L55
            em5 r6 = new em5     // Catch: java.lang.Throwable -> L55
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L55
            r1.i(r6)     // Catch: java.lang.Throwable -> L55
        L6c:
            r2.close()
            goto L85
        L70:
            throw r5     // Catch: java.lang.Throwable -> L71
        L71:
            r6 = move-exception
            defpackage.ge7.t(r2, r5)
            throw r6
        L76:
            ly0 r5 = new ly0
            java.lang.String r6 = "Failed to open compressed file for extraction"
            r5.<init>(r6)
            em5 r6 = new em5
            r6.<init>(r5)
            r1.i(r6)
        L85:
            java.lang.Object r5 = r1.a()
            return r5
    }

    public final java.io.InputStream f(defpackage.pq5 r3) {
            r2 = this;
            r0 = 0
            ud4 r1 = r2.c
            android.net.Uri r0 = r1.d(r3, r0)
            android.content.Context r1 = r2.a
            if (r0 == 0) goto L14
            android.content.ContentResolver r2 = r1.getContentResolver()
            java.io.InputStream r2 = r2.openInputStream(r0)
            return r2
        L14:
            android.content.ContentResolver r0 = r1.getContentResolver()
            android.net.Uri r3 = r3.d
            java.io.InputStream r3 = r0.openInputStream(r3)
            if (r3 == 0) goto L25
            ss0 r2 = r2.g(r3)
            return r2
        L25:
            r2 = 0
            return r2
    }

    public abstract defpackage.ss0 g(java.io.InputStream r1);
}
