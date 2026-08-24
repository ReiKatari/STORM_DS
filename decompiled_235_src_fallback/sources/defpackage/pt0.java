package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pt0  reason: default package */
/* loaded from: classes.dex */
public abstract class pt0 {
    public static void A(android.app.NotificationChannel r1) {
            r0 = 1
            r1.setShowBadge(r0)
            return
    }

    public static void B(android.app.NotificationChannel r0, android.net.Uri r1, android.media.AudioAttributes r2) {
            r0.setSound(r1, r2)
            return
    }

    public static void C(android.app.Notification.Builder r2) {
            r0 = 0
            r2.setTimeoutAfter(r0)
            return
    }

    public static void D(android.view.MenuItem r0, java.lang.CharSequence r1) {
            r0.setTooltipText(r1)
            return
    }

    public static void E(android.app.NotificationChannel r1) {
            r0 = 0
            r1.setVibrationPattern(r0)
            return
    }

    public static void F(android.content.Context r0, android.content.Intent r1) {
            r0.startForegroundService(r1)
            return
    }

    public static final android.graphics.ColorSpace a(defpackage.nt0 r23) {
            r0 = r23
            cq5 r1 = defpackage.qt0.e
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto L14
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r1 = r0
            android.graphics.ColorSpace r1 = (android.graphics.ColorSpace) r1
            return r0
        L14:
            cq5 r1 = defpackage.qt0.q
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto L26
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.ACES
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r1 = r0
            android.graphics.ColorSpace r1 = (android.graphics.ColorSpace) r1
            return r0
        L26:
            cq5 r1 = defpackage.qt0.r
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto L38
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.ACESCG
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r1 = r0
            android.graphics.ColorSpace r1 = (android.graphics.ColorSpace) r1
            return r0
        L38:
            cq5 r1 = defpackage.qt0.o
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto L4a
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.ADOBE_RGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r1 = r0
            android.graphics.ColorSpace r1 = (android.graphics.ColorSpace) r1
            return r0
        L4a:
            cq5 r1 = defpackage.qt0.j
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto L5c
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.BT2020
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r1 = r0
            android.graphics.ColorSpace r1 = (android.graphics.ColorSpace) r1
            return r0
        L5c:
            cq5 r1 = defpackage.qt0.i
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto L6e
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.BT709
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r1 = r0
            android.graphics.ColorSpace r1 = (android.graphics.ColorSpace) r1
            return r0
        L6e:
            zi3 r1 = defpackage.qt0.t
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto L80
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.CIE_LAB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r1 = r0
            android.graphics.ColorSpace r1 = (android.graphics.ColorSpace) r1
            return r0
        L80:
            zi3 r1 = defpackage.qt0.s
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto L92
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.CIE_XYZ
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r1 = r0
            android.graphics.ColorSpace r1 = (android.graphics.ColorSpace) r1
            return r0
        L92:
            cq5 r1 = defpackage.qt0.k
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto La4
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DCI_P3
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r1 = r0
            android.graphics.ColorSpace r1 = (android.graphics.ColorSpace) r1
            return r0
        La4:
            cq5 r1 = defpackage.qt0.l
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto Lb6
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.DISPLAY_P3
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r1 = r0
            android.graphics.ColorSpace r1 = (android.graphics.ColorSpace) r1
            return r0
        Lb6:
            cq5 r1 = defpackage.qt0.g
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto Lc8
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.EXTENDED_SRGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r1 = r0
            android.graphics.ColorSpace r1 = (android.graphics.ColorSpace) r1
            return r0
        Lc8:
            cq5 r1 = defpackage.qt0.h
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto Lda
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.LINEAR_EXTENDED_SRGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r1 = r0
            android.graphics.ColorSpace r1 = (android.graphics.ColorSpace) r1
            return r0
        Lda:
            cq5 r1 = defpackage.qt0.f
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto Lec
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.LINEAR_SRGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r1 = r0
            android.graphics.ColorSpace r1 = (android.graphics.ColorSpace) r1
            return r0
        Lec:
            cq5 r1 = defpackage.qt0.m
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto Lfe
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.NTSC_1953
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r1 = r0
            android.graphics.ColorSpace r1 = (android.graphics.ColorSpace) r1
            return r0
        Lfe:
            cq5 r1 = defpackage.qt0.p
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto L110
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.PRO_PHOTO_RGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r1 = r0
            android.graphics.ColorSpace r1 = (android.graphics.ColorSpace) r1
            return r0
        L110:
            cq5 r1 = defpackage.qt0.n
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto L122
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SMPTE_C
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r1 = r0
            android.graphics.ColorSpace r1 = (android.graphics.ColorSpace) r1
            return r0
        L122:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            r3 = 0
            if (r1 < r2) goto L152
            cq5 r1 = defpackage.qt0.v
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto L13a
            android.graphics.ColorSpace$Named r1 = defpackage.gi.e()
            android.graphics.ColorSpace r1 = android.graphics.ColorSpace.get(r1)
            goto L14c
        L13a:
            cq5 r1 = defpackage.qt0.w
            boolean r1 = defpackage.nb3.k(r0, r1)
            if (r1 == 0) goto L14b
            android.graphics.ColorSpace$Named r1 = defpackage.gi.v()
            android.graphics.ColorSpace r1 = android.graphics.ColorSpace.get(r1)
            goto L14c
        L14b:
            r1 = r3
        L14c:
            if (r1 == 0) goto L152
            r0 = r1
            android.graphics.ColorSpace r0 = (android.graphics.ColorSpace) r0
            return r1
        L152:
            boolean r1 = r0 instanceof defpackage.cq5
            if (r1 == 0) goto L1ce
            java.lang.String r5 = r0.a
            cq5 r0 = (defpackage.cq5) r0
            ys7 r1 = r0.d
            float[] r7 = r1.a()
            e97 r1 = r0.g
            if (r1 == 0) goto L181
            android.graphics.ColorSpace$Rgb$TransferParameters r2 = new android.graphics.ColorSpace$Rgb$TransferParameters
            double r9 = r1.b
            double r11 = r1.c
            double r13 = r1.d
            double r2 = r1.e
            r15 = r2
            double r2 = r1.f
            r17 = r2
            double r2 = r1.g
            r19 = r2
            double r1 = r1.a
            android.graphics.ColorSpace$Rgb$TransferParameters r8 = new android.graphics.ColorSpace$Rgb$TransferParameters
            r21 = r1
            r8.<init>(r9, r11, r13, r15, r17, r19, r21)
            r3 = r8
        L181:
            float[] r1 = r0.i
            r2 = 0
            if (r3 == 0) goto L1af
            android.graphics.ColorSpace$Rgb r4 = new android.graphics.ColorSpace$Rgb
            float[] r0 = r0.h
            android.graphics.ColorSpace$Rgb r4 = new android.graphics.ColorSpace$Rgb
            r4.<init>(r5, r0, r7, r3)
            r0 = r1[r2]
            boolean r0 = java.lang.Float.isNaN(r0)
            if (r0 == 0) goto L198
            goto L1a2
        L198:
            float[] r0 = r4.getTransform()
            boolean r0 = java.util.Arrays.equals(r0, r1)
            if (r0 == 0) goto L1a5
        L1a2:
            android.graphics.ColorSpace r4 = (android.graphics.ColorSpace) r4
            return r4
        L1a5:
            android.graphics.ColorSpace$Rgb r0 = new android.graphics.ColorSpace$Rgb
            android.graphics.ColorSpace$Rgb r0 = new android.graphics.ColorSpace$Rgb
            r0.<init>(r5, r1, r3)
            android.graphics.ColorSpace r0 = (android.graphics.ColorSpace) r0
            return r0
        L1af:
            android.graphics.ColorSpace$Rgb r1 = new android.graphics.ColorSpace$Rgb
            float[] r6 = r0.h
            bq5 r1 = r0.l
            ot0 r8 = new ot0
            r8.<init>(r2, r1)
            bq5 r1 = r0.o
            ot0 r9 = new ot0
            r2 = 1
            r9.<init>(r2, r1)
            float r10 = r0.e
            float r11 = r0.f
            android.graphics.ColorSpace$Rgb r4 = new android.graphics.ColorSpace$Rgb
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            android.graphics.ColorSpace r4 = (android.graphics.ColorSpace) r4
            return r4
        L1ce:
            android.graphics.ColorSpace$Named r0 = android.graphics.ColorSpace.Named.SRGB
            android.graphics.ColorSpace r0 = android.graphics.ColorSpace.get(r0)
            r1 = r0
            android.graphics.ColorSpace r1 = (android.graphics.ColorSpace) r1
            return r0
    }

    public static android.app.Notification.Builder b(android.content.Context r1, java.lang.String r2) {
            android.app.Notification$Builder r0 = new android.app.Notification$Builder
            r0.<init>(r1, r2)
            return r0
    }

    public static android.app.NotificationChannel c(int r1, java.lang.CharSequence r2, java.lang.String r3) {
            android.app.NotificationChannel r0 = new android.app.NotificationChannel
            r0.<init>(r3, r2, r1)
            return r0
    }

    public static void d(android.app.NotificationManager r0, android.app.NotificationChannel r1) {
            r0.createNotificationChannel(r1)
            return
    }

    public static android.graphics.drawable.Icon e(android.graphics.Bitmap r0) {
            android.graphics.drawable.Icon r0 = android.graphics.drawable.Icon.createWithAdaptiveBitmap(r0)
            return r0
    }

    public static void f(android.app.NotificationChannel r1) {
            r0 = 0
            r1.enableLights(r0)
            return
    }

    public static void g(android.app.NotificationChannel r1) {
            r0 = 0
            r1.enableVibration(r0)
            return
    }

    public static android.view.autofill.AutofillId h(android.view.View r0) {
            android.view.autofill.AutofillId r0 = r0.getAutofillId()
            return r0
    }

    public static float i(android.view.ViewConfiguration r0) {
            float r0 = r0.getScaledHorizontalScrollFactor()
            return r0
    }

    public static float j(android.view.ViewConfiguration r0) {
            float r0 = r0.getScaledHorizontalScrollFactor()
            return r0
    }

    public static float k(android.view.ViewConfiguration r0) {
            float r0 = r0.getScaledVerticalScrollFactor()
            return r0
    }

    public static float l(android.view.ViewConfiguration r0) {
            float r0 = r0.getScaledVerticalScrollFactor()
            return r0
    }

    public static android.content.Intent m(android.content.Context r6, android.content.BroadcastReceiver r7, android.content.IntentFilter r8, android.os.Handler r9) {
            r3 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            android.content.Intent r6 = r0.registerReceiver(r1, r2, r3, r4, r5)
            return r6
    }

    public static android.content.Intent n(android.content.Context r6, android.content.BroadcastReceiver r7, android.content.IntentFilter r8, android.os.Handler r9) {
            r3 = 0
            r5 = 2
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            android.content.Intent r6 = r0.registerReceiver(r1, r2, r3, r4, r5)
            return r6
    }

    public static void o(android.view.MenuItem r0, char r1, int r2) {
            r0.setAlphabeticShortcut(r1, r2)
            return
    }

    public static void p(android.app.Notification.Builder r1) {
            r0 = 0
            r1.setBadgeIconType(r0)
            return
    }

    public static void q(android.view.MenuItem r0, java.lang.CharSequence r1) {
            r0.setContentDescription(r1)
            return
    }

    public static void r(android.app.NotificationChannel r1) {
            r0 = 0
            r1.setDescription(r0)
            return
    }

    public static void s(android.app.NotificationChannel r1) {
            r0 = 0
            r1.setGroup(r0)
            return
    }

    public static void t(android.app.Notification.Builder r1) {
            r0 = 0
            r1.setGroupAlertBehavior(r0)
            return
    }

    public static void u(android.view.MenuItem r0, android.content.res.ColorStateList r1) {
            r0.setIconTintList(r1)
            return
    }

    public static void v(android.view.MenuItem r0, android.graphics.PorterDuff.Mode r1) {
            r0.setIconTintMode(r1)
            return
    }

    public static void w(android.app.NotificationChannel r1) {
            r0 = 0
            r1.setLightColor(r0)
            return
    }

    public static void x(android.view.MenuItem r0, char r1, int r2) {
            r0.setNumericShortcut(r1, r2)
            return
    }

    public static void y(android.app.Notification.Builder r1) {
            r0 = 0
            r1.setSettingsText(r0)
            return
    }

    public static void z(android.app.Notification.Builder r1) {
            r0 = 0
            r1.setShortcutId(r0)
            return
    }
}
