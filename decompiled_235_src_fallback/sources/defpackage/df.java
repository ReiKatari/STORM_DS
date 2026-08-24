package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: df  reason: default package */
/* loaded from: classes.dex */
public final class df implements android.view.translation.ViewTranslationCallback {
    public static final defpackage.df a = null;

    static {
            df r0 = new df
            r0.<init>()
            defpackage.df.a = r0
            return
    }

    public final boolean onClearTranslation(android.view.View r13) {
            r12 = this;
            r13.getClass()
            te r13 = (defpackage.te) r13
            qf r12 = r13.getContentCaptureManager$ui()
            r12.getClass()
            lf r13 = defpackage.lf.SHOW_ORIGINAL
            r12.Y = r13
            g93 r12 = r12.c()
            java.lang.Object[] r13 = r12.c
            long[] r12 = r12.a
            int r0 = r12.length
            int r0 = r0 + (-2)
            if (r0 < 0) goto L82
            r1 = 0
            r2 = r1
        L1f:
            r3 = r12[r2]
            long r5 = ~r3
            r7 = 7
            long r5 = r5 << r7
            long r5 = r5 & r3
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L7d
            int r5 = r2 - r0
            int r5 = ~r5
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r7 = r1
        L39:
            if (r7 >= r5) goto L7b
            r8 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r3
            r10 = 128(0x80, double:6.3E-322)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L77
            int r8 = r2 << 3
            int r8 = r8 + r7
            r8 = r13[r8]
            za6 r8 = (defpackage.za6) r8
            xa6 r8 = r8.a
            ta6 r8 = r8.d
            ja4 r8 = r8.A
            fb6 r9 = defpackage.bb6.E
            java.lang.Object r9 = r8.g(r9)
            r10 = 0
            if (r9 != 0) goto L5b
            r9 = r10
        L5b:
            if (r9 == 0) goto L77
            fb6 r9 = defpackage.sa6.n
            java.lang.Object r8 = r8.g(r9)
            if (r8 != 0) goto L66
            goto L67
        L66:
            r10 = r8
        L67:
            y1 r10 = (defpackage.y1) r10
            if (r10 == 0) goto L77
            ao2 r8 = r10.b
            on2 r8 = (defpackage.on2) r8
            if (r8 == 0) goto L77
            java.lang.Object r8 = r8.c()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
        L77:
            long r3 = r3 >> r6
            int r7 = r7 + 1
            goto L39
        L7b:
            if (r5 != r6) goto L82
        L7d:
            if (r2 == r0) goto L82
            int r2 = r2 + 1
            goto L1f
        L82:
            r12 = 1
            return r12
    }

    public final boolean onHideTranslation(android.view.View r13) {
            r12 = this;
            r13.getClass()
            te r13 = (defpackage.te) r13
            qf r12 = r13.getContentCaptureManager$ui()
            r12.getClass()
            lf r13 = defpackage.lf.SHOW_ORIGINAL
            r12.Y = r13
            g93 r12 = r12.c()
            java.lang.Object[] r13 = r12.c
            long[] r12 = r12.a
            int r0 = r12.length
            int r0 = r0 + (-2)
            if (r0 < 0) goto L8a
            r1 = 0
            r2 = r1
        L1f:
            r3 = r12[r2]
            long r5 = ~r3
            r7 = 7
            long r5 = r5 << r7
            long r5 = r5 & r3
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L85
            int r5 = r2 - r0
            int r5 = ~r5
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r7 = r1
        L39:
            if (r7 >= r5) goto L83
            r8 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r3
            r10 = 128(0x80, double:6.3E-322)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L7f
            int r8 = r2 << 3
            int r8 = r8 + r7
            r8 = r13[r8]
            za6 r8 = (defpackage.za6) r8
            xa6 r8 = r8.a
            ta6 r8 = r8.d
            ja4 r8 = r8.A
            fb6 r9 = defpackage.bb6.E
            java.lang.Object r9 = r8.g(r9)
            r10 = 0
            if (r9 != 0) goto L5b
            r9 = r10
        L5b:
            java.lang.Boolean r11 = java.lang.Boolean.TRUE
            boolean r9 = defpackage.nb3.k(r9, r11)
            if (r9 == 0) goto L7f
            fb6 r9 = defpackage.sa6.m
            java.lang.Object r8 = r8.g(r9)
            if (r8 != 0) goto L6c
            goto L6d
        L6c:
            r10 = r8
        L6d:
            y1 r10 = (defpackage.y1) r10
            if (r10 == 0) goto L7f
            ao2 r8 = r10.b
            qn2 r8 = (defpackage.qn2) r8
            if (r8 == 0) goto L7f
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            java.lang.Object r8 = r8.g(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
        L7f:
            long r3 = r3 >> r6
            int r7 = r7 + 1
            goto L39
        L83:
            if (r5 != r6) goto L8a
        L85:
            if (r2 == r0) goto L8a
            int r2 = r2 + 1
            goto L1f
        L8a:
            r12 = 1
            return r12
    }

    public final boolean onShowTranslation(android.view.View r13) {
            r12 = this;
            r13.getClass()
            te r13 = (defpackage.te) r13
            qf r12 = r13.getContentCaptureManager$ui()
            r12.getClass()
            lf r13 = defpackage.lf.SHOW_TRANSLATED
            r12.Y = r13
            g93 r12 = r12.c()
            java.lang.Object[] r13 = r12.c
            long[] r12 = r12.a
            int r0 = r12.length
            int r0 = r0 + (-2)
            if (r0 < 0) goto L8a
            r1 = 0
            r2 = r1
        L1f:
            r3 = r12[r2]
            long r5 = ~r3
            r7 = 7
            long r5 = r5 << r7
            long r5 = r5 & r3
            r7 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r5 = r5 & r7
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 == 0) goto L85
            int r5 = r2 - r0
            int r5 = ~r5
            int r5 = r5 >>> 31
            r6 = 8
            int r5 = 8 - r5
            r7 = r1
        L39:
            if (r7 >= r5) goto L83
            r8 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r3
            r10 = 128(0x80, double:6.3E-322)
            int r8 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r8 >= 0) goto L7f
            int r8 = r2 << 3
            int r8 = r8 + r7
            r8 = r13[r8]
            za6 r8 = (defpackage.za6) r8
            xa6 r8 = r8.a
            ta6 r8 = r8.d
            ja4 r8 = r8.A
            fb6 r9 = defpackage.bb6.E
            java.lang.Object r9 = r8.g(r9)
            r10 = 0
            if (r9 != 0) goto L5b
            r9 = r10
        L5b:
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            boolean r9 = defpackage.nb3.k(r9, r11)
            if (r9 == 0) goto L7f
            fb6 r9 = defpackage.sa6.m
            java.lang.Object r8 = r8.g(r9)
            if (r8 != 0) goto L6c
            goto L6d
        L6c:
            r10 = r8
        L6d:
            y1 r10 = (defpackage.y1) r10
            if (r10 == 0) goto L7f
            ao2 r8 = r10.b
            qn2 r8 = (defpackage.qn2) r8
            if (r8 == 0) goto L7f
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            java.lang.Object r8 = r8.g(r9)
            java.lang.Boolean r8 = (java.lang.Boolean) r8
        L7f:
            long r3 = r3 >> r6
            int r7 = r7 + 1
            goto L39
        L83:
            if (r5 != r6) goto L8a
        L85:
            if (r2 == r0) goto L8a
            int r2 = r2 + 1
            goto L1f
        L8a:
            r12 = 1
            return r12
    }
}
