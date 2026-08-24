package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p41  reason: default package */
/* loaded from: classes.dex */
public class p41 extends android.content.ContextWrapper {
    public static android.content.res.Configuration Y;
    public int A;
    public android.content.res.Resources.Theme B;
    public android.view.LayoutInflater L;
    public android.content.res.Configuration R;
    public android.content.res.Resources X;

    public p41(android.content.Context r1, int r2) {
            r0 = this;
            r0.<init>(r1)
            r0.A = r2
            return
    }

    public final void a(android.content.res.Configuration r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.X
            if (r0 != 0) goto L16
            android.content.res.Configuration r0 = r1.R
            if (r0 != 0) goto L10
            android.content.res.Configuration r0 = new android.content.res.Configuration
            r0.<init>(r2)
            r1.R = r0
            return
        L10:
            java.lang.String r1 = "Override configuration has already been set"
            defpackage.i.m(r1)
            return
        L16:
            java.lang.String r1 = "getResources() or getAssets() has already been called"
            defpackage.i.m(r1)
            return
    }

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(android.content.Context r1) {
            r0 = this;
            super.attachBaseContext(r1)
            return
    }

    public final void b() {
            r2 = this;
            android.content.res.Resources$Theme r0 = r2.B
            if (r0 != 0) goto L1d
            android.content.res.Resources r0 = r2.getResources()
            android.content.res.Resources$Theme r0 = r0.newTheme()
            r2.B = r0
            android.content.Context r0 = r2.getBaseContext()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            if (r0 == 0) goto L1d
            android.content.res.Resources$Theme r1 = r2.B
            r1.setTo(r0)
        L1d:
            android.content.res.Resources$Theme r0 = r2.B
            int r2 = r2.A
            r1 = 1
            r0.applyStyle(r2, r1)
            return
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.AssetManager getAssets() {
            r0 = this;
            android.content.res.Resources r0 = r0.getResources()
            android.content.res.AssetManager r0 = r0.getAssets()
            return r0
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources getResources() {
            r3 = this;
            android.content.res.Resources r0 = r3.X
            if (r0 != 0) goto L38
            android.content.res.Configuration r0 = r3.R
            if (r0 == 0) goto L32
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 26
            if (r1 < r2) goto L25
            android.content.res.Configuration r1 = defpackage.p41.Y
            if (r1 != 0) goto L1c
            android.content.res.Configuration r1 = new android.content.res.Configuration
            r1.<init>()
            r2 = 0
            r1.fontScale = r2
            defpackage.p41.Y = r1
        L1c:
            android.content.res.Configuration r1 = defpackage.p41.Y
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L25
            goto L32
        L25:
            android.content.res.Configuration r0 = r3.R
            android.content.Context r0 = r3.createConfigurationContext(r0)
            android.content.res.Resources r0 = r0.getResources()
            r3.X = r0
            goto L38
        L32:
            android.content.res.Resources r0 = super.getResources()
            r3.X = r0
        L38:
            android.content.res.Resources r3 = r3.X
            return r3
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final java.lang.Object getSystemService(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "layout_inflater"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1d
            android.view.LayoutInflater r2 = r1.L
            if (r2 != 0) goto L1a
            android.content.Context r2 = r1.getBaseContext()
            android.view.LayoutInflater r2 = android.view.LayoutInflater.from(r2)
            android.view.LayoutInflater r2 = r2.cloneInContext(r1)
            r1.L = r2
        L1a:
            android.view.LayoutInflater r1 = r1.L
            return r1
        L1d:
            android.content.Context r1 = r1.getBaseContext()
            java.lang.Object r1 = r1.getSystemService(r2)
            return r1
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final android.content.res.Resources.Theme getTheme() {
            r1 = this;
            android.content.res.Resources$Theme r0 = r1.B
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r1.A
            if (r0 != 0) goto Le
            r0 = 2132017820(0x7f14029c, float:1.967393E38)
            r1.A = r0
        Le:
            r1.b()
            android.content.res.Resources$Theme r1 = r1.B
            return r1
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int r2) {
            r1 = this;
            int r0 = r1.A
            if (r0 == r2) goto L9
            r1.A = r2
            r1.b()
        L9:
            return
    }
}
