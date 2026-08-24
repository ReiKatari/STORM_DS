package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ju6  reason: default package */
/* loaded from: classes.dex */
public final class ju6 {
    public java.lang.CharSequence A;
    public java.lang.CharSequence B;
    public android.content.res.ColorStateList C;
    public android.graphics.PorterDuff.Mode D;
    public final /* synthetic */ defpackage.ku6 E;
    public final android.view.Menu a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public int i;
    public int j;
    public java.lang.CharSequence k;
    public java.lang.CharSequence l;
    public int m;
    public char n;
    public int o;
    public char p;
    public int q;
    public int r;
    public boolean s;
    public boolean t;
    public boolean u;
    public int v;
    public int w;
    public java.lang.String x;
    public java.lang.String y;
    public defpackage.p44 z;

    public ju6(defpackage.ku6 r1, android.view.Menu r2) {
            r0 = this;
            r0.<init>()
            r0.E = r1
            r1 = 0
            r0.C = r1
            r0.D = r1
            r0.a = r2
            r1 = 0
            r0.b = r1
            r0.c = r1
            r0.d = r1
            r0.e = r1
            r1 = 1
            r0.f = r1
            r0.g = r1
            return
    }

    public final java.lang.Object a(java.lang.String r2, java.lang.Class[] r3, java.lang.Object[] r4) {
            r1 = this;
            ku6 r1 = r1.E     // Catch: java.lang.Exception -> L1a
            android.content.Context r1 = r1.c     // Catch: java.lang.Exception -> L1a
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Exception -> L1a
            r0 = 0
            java.lang.Class r1 = java.lang.Class.forName(r2, r0, r1)     // Catch: java.lang.Exception -> L1a
            java.lang.reflect.Constructor r1 = r1.getConstructor(r3)     // Catch: java.lang.Exception -> L1a
            r3 = 1
            r1.setAccessible(r3)     // Catch: java.lang.Exception -> L1a
            java.lang.Object r1 = r1.newInstance(r4)     // Catch: java.lang.Exception -> L1a
            return r1
        L1a:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Cannot instantiate class: "
            r3.<init>(r4)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "SupportMenuInflater"
            android.util.Log.w(r3, r2, r1)
            r1 = 0
            return r1
    }

    public final void b(android.view.MenuItem r9) {
            r8 = this;
            ku6 r0 = r8.E
            android.content.Context r1 = r0.c
            boolean r2 = r8.s
            android.view.MenuItem r2 = r9.setChecked(r2)
            boolean r3 = r8.t
            android.view.MenuItem r2 = r2.setVisible(r3)
            boolean r3 = r8.u
            android.view.MenuItem r2 = r2.setEnabled(r3)
            int r3 = r8.r
            r4 = 0
            r5 = 1
            if (r3 < r5) goto L1e
            r3 = r5
            goto L1f
        L1e:
            r3 = r4
        L1f:
            android.view.MenuItem r2 = r2.setCheckable(r3)
            java.lang.CharSequence r3 = r8.l
            android.view.MenuItem r2 = r2.setTitleCondensed(r3)
            int r3 = r8.m
            r2.setIcon(r3)
            int r2 = r8.v
            if (r2 < 0) goto L35
            r9.setShowAsAction(r2)
        L35:
            java.lang.String r2 = r8.y
            if (r2 == 0) goto L87
            boolean r2 = r1.isRestricted()
            if (r2 != 0) goto L81
            iu6 r2 = new iu6
            java.lang.Object r3 = r0.d
            if (r3 != 0) goto L4b
            java.lang.Object r1 = defpackage.ku6.a(r1)
            r0.d = r1
        L4b:
            java.lang.Object r1 = r0.d
            java.lang.String r3 = r8.y
            r2.<init>()
            r2.B = r1
            java.lang.Class r1 = r1.getClass()
            java.lang.Class[] r6 = defpackage.iu6.R     // Catch: java.lang.Exception -> L64
            java.lang.reflect.Method r6 = r1.getMethod(r3, r6)     // Catch: java.lang.Exception -> L64
            r2.L = r6     // Catch: java.lang.Exception -> L64
            r9.setOnMenuItemClickListener(r2)
            goto L87
        L64:
            r8 = move-exception
            android.view.InflateException r9 = new android.view.InflateException
            java.lang.String r0 = "Couldn't resolve menu item onClick handler "
            java.lang.String r2 = " in class "
            java.lang.StringBuilder r0 = defpackage.i61.t(r0, r3, r2)
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r9.<init>(r0)
            r9.initCause(r8)
            throw r9
        L81:
            java.lang.String r8 = "The android:onClick attribute cannot be used within a restricted context"
            defpackage.i.m(r8)
            return
        L87:
            int r1 = r8.r
            r2 = 2
            if (r1 < r2) goto Ld1
            boolean r1 = r9 instanceof defpackage.o44
            if (r1 == 0) goto L9c
            r1 = r9
            o44 r1 = (defpackage.o44) r1
            int r2 = r1.x
            r2 = r2 & (-5)
            r2 = r2 | 4
            r1.x = r2
            goto Ld1
        L9c:
            boolean r1 = r9 instanceof defpackage.s44
            if (r1 == 0) goto Ld1
            r1 = r9
            s44 r1 = (defpackage.s44) r1
            lu6 r2 = r1.c
            java.lang.reflect.Method r3 = r1.d     // Catch: java.lang.Exception -> Lbc
            if (r3 != 0) goto Lbe
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Exception -> Lbc
            java.lang.String r6 = "setExclusiveCheckable"
            java.lang.Class r7 = java.lang.Boolean.TYPE     // Catch: java.lang.Exception -> Lbc
            java.lang.Class[] r7 = new java.lang.Class[]{r7}     // Catch: java.lang.Exception -> Lbc
            java.lang.reflect.Method r3 = r3.getDeclaredMethod(r6, r7)     // Catch: java.lang.Exception -> Lbc
            r1.d = r3     // Catch: java.lang.Exception -> Lbc
            goto Lbe
        Lbc:
            r1 = move-exception
            goto Lca
        Lbe:
            java.lang.reflect.Method r1 = r1.d     // Catch: java.lang.Exception -> Lbc
            java.lang.Boolean r3 = java.lang.Boolean.TRUE     // Catch: java.lang.Exception -> Lbc
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Exception -> Lbc
            r1.invoke(r2, r3)     // Catch: java.lang.Exception -> Lbc
            goto Ld1
        Lca:
            java.lang.String r2 = "MenuItemWrapper"
            java.lang.String r3 = "Error while calling setExclusiveCheckable"
            android.util.Log.w(r2, r3, r1)
        Ld1:
            java.lang.String r1 = r8.x
            if (r1 == 0) goto Le3
            java.lang.Class[] r2 = defpackage.ku6.e
            java.lang.Object[] r0 = r0.a
            java.lang.Object r0 = r8.a(r1, r2, r0)
            android.view.View r0 = (android.view.View) r0
            r9.setActionView(r0)
            r4 = r5
        Le3:
            int r0 = r8.w
            if (r0 <= 0) goto Lf4
            if (r4 != 0) goto Led
            r9.setActionView(r0)
            goto Lf4
        Led:
            java.lang.String r0 = "SupportMenuInflater"
            java.lang.String r1 = "Ignoring attribute 'itemActionViewLayout'. Action view already specified."
            android.util.Log.w(r0, r1)
        Lf4:
            p44 r0 = r8.z
            if (r0 == 0) goto L10a
            boolean r1 = r9 instanceof defpackage.lu6
            if (r1 == 0) goto L103
            r1 = r9
            lu6 r1 = (defpackage.lu6) r1
            r1.a(r0)
            goto L10a
        L103:
            java.lang.String r0 = "MenuItemCompat"
            java.lang.String r1 = "setActionProvider: item does not implement SupportMenuItem; ignoring"
            android.util.Log.w(r0, r1)
        L10a:
            java.lang.CharSequence r0 = r8.A
            boolean r1 = r9 instanceof defpackage.lu6
            r2 = 26
            if (r1 == 0) goto L119
            r3 = r9
            lu6 r3 = (defpackage.lu6) r3
            r3.setContentDescription(r0)
            goto L120
        L119:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r2) goto L120
            defpackage.pt0.q(r9, r0)
        L120:
            java.lang.CharSequence r0 = r8.B
            if (r1 == 0) goto L12b
            r3 = r9
            lu6 r3 = (defpackage.lu6) r3
            r3.setTooltipText(r0)
            goto L132
        L12b:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r2) goto L132
            defpackage.pt0.D(r9, r0)
        L132:
            char r0 = r8.n
            int r3 = r8.o
            if (r1 == 0) goto L13f
            r4 = r9
            lu6 r4 = (defpackage.lu6) r4
            r4.setAlphabeticShortcut(r0, r3)
            goto L146
        L13f:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r2) goto L146
            defpackage.pt0.o(r9, r0, r3)
        L146:
            char r0 = r8.p
            int r3 = r8.q
            if (r1 == 0) goto L153
            r4 = r9
            lu6 r4 = (defpackage.lu6) r4
            r4.setNumericShortcut(r0, r3)
            goto L15a
        L153:
            int r4 = android.os.Build.VERSION.SDK_INT
            if (r4 < r2) goto L15a
            defpackage.pt0.x(r9, r0, r3)
        L15a:
            android.graphics.PorterDuff$Mode r0 = r8.D
            if (r0 == 0) goto L16e
            if (r1 == 0) goto L167
            r3 = r9
            lu6 r3 = (defpackage.lu6) r3
            r3.setIconTintMode(r0)
            goto L16e
        L167:
            int r3 = android.os.Build.VERSION.SDK_INT
            if (r3 < r2) goto L16e
            defpackage.pt0.v(r9, r0)
        L16e:
            android.content.res.ColorStateList r8 = r8.C
            if (r8 == 0) goto L181
            if (r1 == 0) goto L17a
            lu6 r9 = (defpackage.lu6) r9
            r9.setIconTintList(r8)
            goto L181
        L17a:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r2) goto L181
            defpackage.pt0.u(r9, r8)
        L181:
            return
    }
}
