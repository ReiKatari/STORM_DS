package com.google.android.gms.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class SignInButton extends android.widget.FrameLayout implements android.view.View.OnClickListener {
    public static final int COLOR_AUTO = 2;
    public static final int COLOR_DARK = 0;
    public static final int COLOR_LIGHT = 1;
    public static final int SIZE_ICON_ONLY = 2;
    public static final int SIZE_STANDARD = 0;
    public static final int SIZE_WIDE = 1;
    private int zaa;
    private int zab;
    private android.view.View zac;
    private android.view.View.OnClickListener zad;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ButtonSize {
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    /* loaded from: classes.dex */
    public @interface ColorScheme {
    }

    public SignInButton(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public SignInButton(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public SignInButton(android.content.Context r2, android.util.AttributeSet r3, int r4) {
            r1 = this;
            r1.<init>(r2, r3, r4)
            r4 = 0
            r1.zad = r4
            android.content.res.Resources$Theme r2 = r2.getTheme()
            int[] r4 = defpackage.l75.a
            r0 = 0
            android.content.res.TypedArray r2 = r2.obtainStyledAttributes(r3, r4, r0, r0)
            int r3 = r2.getInt(r0, r0)     // Catch: java.lang.Throwable -> L2a
            r1.zaa = r3     // Catch: java.lang.Throwable -> L2a
            r3 = 1
            r4 = 2
            int r3 = r2.getInt(r3, r4)     // Catch: java.lang.Throwable -> L2a
            r1.zab = r3     // Catch: java.lang.Throwable -> L2a
            r2.recycle()
            int r2 = r1.zaa
            int r3 = r1.zab
            r1.setStyle(r2, r3)
            return
        L2a:
            r1 = move-exception
            r2.recycle()
            throw r1
    }

    private final void zaa(android.content.Context r5) {
            r4 = this;
            android.view.View r0 = r4.zac
            if (r0 == 0) goto L7
            r4.removeView(r0)
        L7:
            int r0 = r4.zaa     // Catch: defpackage.fj5 -> L12
            int r1 = r4.zab     // Catch: defpackage.fj5 -> L12
            android.view.View r0 = com.google.android.gms.common.internal.zaz.zaa(r5, r0, r1)     // Catch: defpackage.fj5 -> L12
            r4.zac = r0     // Catch: defpackage.fj5 -> L12
            goto L2c
        L12:
            java.lang.String r0 = "SignInButton"
            java.lang.String r1 = "Sign in button not found, using placeholder instead"
            android.util.Log.w(r0, r1)
            int r0 = r4.zaa
            int r1 = r4.zab
            com.google.android.gms.common.internal.zaaa r2 = new com.google.android.gms.common.internal.zaaa
            r3 = 0
            r2.<init>(r5, r3)
            android.content.res.Resources r5 = r5.getResources()
            r2.zaa(r5, r0, r1)
            r4.zac = r2
        L2c:
            android.view.View r5 = r4.zac
            r4.addView(r5)
            android.view.View r5 = r4.zac
            boolean r0 = r4.isEnabled()
            r5.setEnabled(r0)
            android.view.View r5 = r4.zac
            r5.setOnClickListener(r4)
            return
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View r3) {
            r2 = this;
            android.view.View$OnClickListener r0 = r2.zad
            if (r0 == 0) goto Lb
            android.view.View r1 = r2.zac
            if (r3 != r1) goto Lb
            r0.onClick(r2)
        Lb:
            return
    }

    public void setColorScheme(int r2) {
            r1 = this;
            int r0 = r1.zaa
            r1.setStyle(r0, r2)
            return
    }

    @Override // android.view.View
    public void setEnabled(boolean r1) {
            r0 = this;
            super.setEnabled(r1)
            android.view.View r0 = r0.zac
            r0.setEnabled(r1)
            return
    }

    @Override // android.view.View
    public void setOnClickListener(android.view.View.OnClickListener r1) {
            r0 = this;
            r0.zad = r1
            android.view.View r1 = r0.zac
            if (r1 == 0) goto L9
            r1.setOnClickListener(r0)
        L9:
            return
    }

    @java.lang.Deprecated
    public void setScopes(com.google.android.gms.common.api.Scope[] r2) {
            r1 = this;
            int r2 = r1.zaa
            int r0 = r1.zab
            r1.setStyle(r2, r0)
            return
    }

    public void setSize(int r2) {
            r1 = this;
            int r0 = r1.zab
            r1.setStyle(r2, r0)
            return
    }

    public void setStyle(int r1, int r2) {
            r0 = this;
            r0.zaa = r1
            r0.zab = r2
            android.content.Context r1 = r0.getContext()
            r0.zaa(r1)
            return
    }

    @java.lang.Deprecated
    public void setStyle(int r1, int r2, com.google.android.gms.common.api.Scope[] r3) {
            r0 = this;
            r0.setStyle(r1, r2)
            return
    }
}
