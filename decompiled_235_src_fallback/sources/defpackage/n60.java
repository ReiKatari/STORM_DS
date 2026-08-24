package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n60  reason: default package */
/* loaded from: classes.dex */
public final class n60 extends defpackage.i60 {
    public final java.lang.Boolean a;
    public final defpackage.vu7 b;
    public android.view.Window c;
    public boolean d;

    public n60(android.view.View r1, defpackage.vu7 r2) {
            r0 = this;
            r0.<init>()
            r0.b = r2
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = com.google.android.material.bottomsheet.BottomSheetBehavior.A(r1)
            p24 r2 = r2.i
            if (r2 == 0) goto L12
            n24 r2 = r2.B
            android.content.res.ColorStateList r2 = r2.d
            goto L16
        L12:
            android.content.res.ColorStateList r2 = r1.getBackgroundTintList()
        L16:
            if (r2 == 0) goto L27
            int r1 = r2.getDefaultColor()
            boolean r1 = defpackage.mp2.L(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.a = r1
            return
        L27:
            android.graphics.drawable.Drawable r1 = r1.getBackground()
            android.content.res.ColorStateList r1 = defpackage.u24.r(r1)
            r2 = 0
            if (r1 == 0) goto L3b
            int r1 = r1.getDefaultColor()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L3c
        L3b:
            r1 = r2
        L3c:
            if (r1 == 0) goto L4d
            int r1 = r1.intValue()
            boolean r1 = defpackage.mp2.L(r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r0.a = r1
            return
        L4d:
            r0.a = r2
            return
    }

    @Override // defpackage.i60
    public final void a(android.view.View r1) {
            r0 = this;
            r0.d(r1)
            return
    }

    @Override // defpackage.i60
    public final void b(android.view.View r1) {
            r0 = this;
            r0.d(r1)
            return
    }

    @Override // defpackage.i60
    public final void c(android.view.View r1, int r2) {
            r0 = this;
            r0.d(r1)
            return
    }

    public final void d(android.view.View r8) {
            r7 = this;
            int r0 = r8.getTop()
            vu7 r1 = r7.b
            int r2 = r1.d()
            r3 = 26
            r4 = 30
            r5 = 35
            if (r0 >= r2) goto L65
            android.view.Window r0 = r7.c
            if (r0 == 0) goto L4c
            java.lang.Boolean r2 = r7.a
            if (r2 != 0) goto L1d
            boolean r7 = r7.d
            goto L21
        L1d:
            boolean r7 = r2.booleanValue()
        L21:
            android.view.View r2 = r0.getDecorView()
            s35 r6 = new s35
            r6.<init>(r2)
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r5) goto L34
            av7 r2 = new av7
            r2.<init>(r0, r6)
            goto L49
        L34:
            if (r2 < r4) goto L3c
            zu7 r2 = new zu7
            r2.<init>(r0, r6)
            goto L49
        L3c:
            if (r2 < r3) goto L44
            xu7 r2 = new xu7
            r2.<init>(r0, r6)
            goto L49
        L44:
            wu7 r2 = new wu7
            r2.<init>(r0, r6)
        L49:
            r2.d(r7)
        L4c:
            int r7 = r8.getPaddingLeft()
            int r0 = r1.d()
            int r1 = r8.getTop()
            int r0 = r0 - r1
            int r1 = r8.getPaddingRight()
            int r2 = r8.getPaddingBottom()
            r8.setPadding(r7, r0, r1, r2)
            return
        L65:
            int r0 = r8.getTop()
            if (r0 == 0) goto Lac
            android.view.Window r0 = r7.c
            if (r0 == 0) goto L9c
            boolean r7 = r7.d
            android.view.View r1 = r0.getDecorView()
            s35 r2 = new s35
            r2.<init>(r1)
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r5) goto L84
            av7 r1 = new av7
            r1.<init>(r0, r2)
            goto L99
        L84:
            if (r1 < r4) goto L8c
            zu7 r1 = new zu7
            r1.<init>(r0, r2)
            goto L99
        L8c:
            if (r1 < r3) goto L94
            xu7 r1 = new xu7
            r1.<init>(r0, r2)
            goto L99
        L94:
            wu7 r1 = new wu7
            r1.<init>(r0, r2)
        L99:
            r1.d(r7)
        L9c:
            int r7 = r8.getPaddingLeft()
            int r0 = r8.getPaddingRight()
            int r1 = r8.getPaddingBottom()
            r2 = 0
            r8.setPadding(r7, r2, r0, r1)
        Lac:
            return
    }

    public final void e(android.view.Window r3) {
            r2 = this;
            android.view.Window r0 = r2.c
            if (r0 != r3) goto L5
            goto L1a
        L5:
            r2.c = r3
            if (r3 == 0) goto L1a
            android.view.View r0 = r3.getDecorView()
            cv7 r1 = new cv7
            r1.<init>(r3, r0)
            bv7 r3 = r1.a
            boolean r3 = r3.b()
            r2.d = r3
        L1a:
            return
    }
}
