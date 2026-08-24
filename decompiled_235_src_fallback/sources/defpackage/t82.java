package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t82  reason: default package */
/* loaded from: classes.dex */
public abstract class t82 {
    public static defpackage.lw2 a(defpackage.lv7 r5, androidx.window.extensions.layout.FoldingFeature r6) {
            r5.getClass()
            r6.getClass()
            int r0 = r6.getType()
            r1 = 2
            r2 = 1
            if (r0 == r2) goto L15
            if (r0 == r1) goto L12
            goto L82
        L12:
            gr1 r0 = defpackage.gr1.h0
            goto L17
        L15:
            gr1 r0 = defpackage.gr1.g0
        L17:
            int r3 = r6.getState()
            if (r3 == r2) goto L23
            if (r3 == r1) goto L20
            goto L82
        L20:
            gr1 r1 = defpackage.gr1.f0
            goto L25
        L23:
            gr1 r1 = defpackage.gr1.e0
        L25:
            w60 r2 = new w60
            android.graphics.Rect r3 = r6.getBounds()
            r3.getClass()
            r2.<init>(r3)
            w60 r5 = r5.a
            android.graphics.Rect r5 = r5.c()
            int r3 = r2.a()
            if (r3 != 0) goto L44
            int r3 = r2.b()
            if (r3 != 0) goto L44
            goto L82
        L44:
            int r3 = r2.b()
            int r4 = r5.width()
            if (r3 == r4) goto L59
            int r3 = r2.a()
            int r4 = r5.height()
            if (r3 == r4) goto L59
            goto L82
        L59:
            int r3 = r2.b()
            int r4 = r5.width()
            if (r3 >= r4) goto L6e
            int r3 = r2.a()
            int r4 = r5.height()
            if (r3 >= r4) goto L6e
            goto L82
        L6e:
            int r3 = r2.b()
            int r4 = r5.width()
            if (r3 != r4) goto L84
            int r2 = r2.a()
            int r5 = r5.height()
            if (r2 != r5) goto L84
        L82:
            r5 = 0
            return r5
        L84:
            lw2 r5 = new lw2
            w60 r2 = new w60
            android.graphics.Rect r6 = r6.getBounds()
            r6.getClass()
            r2.<init>(r6)
            r5.<init>(r2, r0, r1)
            return r5
    }

    public static defpackage.kv7 b(defpackage.lv7 r3, androidx.window.extensions.layout.WindowLayoutInfo r4) {
            r3.getClass()
            r4.getClass()
            java.util.List r4 = r4.getDisplayFeatures()
            r4.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r4 = r4.iterator()
        L16:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r4.next()
            androidx.window.extensions.layout.DisplayFeature r1 = (androidx.window.extensions.layout.DisplayFeature) r1
            boolean r2 = r1 instanceof androidx.window.extensions.layout.FoldingFeature
            if (r2 == 0) goto L2d
            androidx.window.extensions.layout.FoldingFeature r1 = (androidx.window.extensions.layout.FoldingFeature) r1
            lw2 r1 = a(r3, r1)
            goto L2e
        L2d:
            r1 = 0
        L2e:
            if (r1 == 0) goto L16
            r0.add(r1)
            goto L16
        L34:
            kv7 r3 = new kv7
            r3.<init>(r0)
            return r3
    }

    public static defpackage.kv7 c(android.content.Context r17, androidx.window.extensions.layout.WindowLayoutInfo r18) {
            r0 = r17
            r1 = r18
            d90 r2 = defpackage.d90.H0
            b70 r3 = defpackage.b70.B
            sh1 r4 = defpackage.sh1.B
            r1.getClass()
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 34
            if (r5 < r6) goto L16
            sh1 r7 = defpackage.sh1.A
            goto L18
        L16:
            xd5 r7 = defpackage.xd5.d0
        L18:
            r8 = 1
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r8 = 2
            java.lang.Integer r10 = java.lang.Integer.valueOf(r8)
            r8 = 4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r8)
            r8 = 8
            java.lang.Integer r12 = java.lang.Integer.valueOf(r8)
            r8 = 16
            java.lang.Integer r13 = java.lang.Integer.valueOf(r8)
            r8 = 32
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)
            r8 = 64
            java.lang.Integer r15 = java.lang.Integer.valueOf(r8)
            r8 = 128(0x80, float:1.8E-43)
            java.lang.Integer r16 = java.lang.Integer.valueOf(r8)
            java.lang.Integer[] r8 = new java.lang.Integer[]{r9, r10, r11, r12, r13, r14, r15, r16}
            defpackage.hf.w(r8)
            r8 = 30
            if (r5 < r8) goto L60
            if (r5 < r6) goto L54
            r2 = r4
            goto L57
        L54:
            if (r5 < r8) goto L57
            r2 = r3
        L57:
            lv7 r0 = r2.e(r0, r7)
            kv7 r0 = b(r0, r1)
            return r0
        L60:
            r9 = 29
            if (r5 < r9) goto L7a
            boolean r9 = r0 instanceof android.app.Activity
            if (r9 == 0) goto L7a
            android.app.Activity r0 = (android.app.Activity) r0
            if (r5 < r6) goto L6e
            r2 = r4
            goto L71
        L6e:
            if (r5 < r8) goto L71
            r2 = r3
        L71:
            lv7 r0 = r2.c(r0, r7)
            kv7 r0 = b(r0, r1)
            return r0
        L7a:
            java.lang.String r0 = "Display Features are only supported after Q. Display features for non-Activity contexts are not expected to be reported on devices running Q."
            defpackage.fa6.h(r0)
            r0 = 0
            return r0
    }
}
