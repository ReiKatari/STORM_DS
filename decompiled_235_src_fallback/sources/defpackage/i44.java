package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i44  reason: default package */
/* loaded from: classes.dex */
public class i44 implements android.view.Menu {
    public static final int[] y = null;
    public final android.content.Context a;
    public final android.content.res.Resources b;
    public boolean c;
    public final boolean d;
    public defpackage.g44 e;
    public final java.util.ArrayList f;
    public final java.util.ArrayList g;
    public boolean h;
    public final java.util.ArrayList i;
    public final java.util.ArrayList j;
    public boolean k;
    public int l;
    public java.lang.CharSequence m;
    public android.graphics.drawable.Drawable n;
    public android.view.View o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;
    public final java.util.ArrayList t;
    public final java.util.concurrent.CopyOnWriteArrayList u;
    public defpackage.o44 v;
    public boolean w;
    public boolean x;

    static {
            r0 = 6
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA  , data: [1, 4, 5, 3, 2, 0} // fill-array
            defpackage.i44.y = r0
            return
    }

    public i44(android.content.Context r6) {
            r5 = this;
            r5.<init>()
            r0 = 0
            r5.l = r0
            r5.p = r0
            r5.q = r0
            r5.r = r0
            r5.s = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.t = r1
            java.util.concurrent.CopyOnWriteArrayList r1 = new java.util.concurrent.CopyOnWriteArrayList
            r1.<init>()
            r5.u = r1
            r5.w = r0
            r5.a = r6
            android.content.res.Resources r1 = r6.getResources()
            r5.b = r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5.f = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5.g = r2
            r2 = 1
            r5.h = r2
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5.i = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r5.j = r3
            r5.k = r2
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.keyboard
            if (r1 == r2) goto L7c
            android.view.ViewConfiguration r1 = android.view.ViewConfiguration.get(r6)
            java.lang.reflect.Method r3 = defpackage.go7.a
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L60
            boolean r6 = defpackage.pp.w(r1)
            goto L79
        L60:
            android.content.res.Resources r6 = r6.getResources()
            java.lang.String r1 = "bool"
            java.lang.String r3 = "android"
            java.lang.String r4 = "config_showMenuShortcutsWhenKeyboardPresent"
            int r1 = r6.getIdentifier(r4, r1, r3)
            if (r1 == 0) goto L78
            boolean r6 = r6.getBoolean(r1)
            if (r6 == 0) goto L78
            r6 = r2
            goto L79
        L78:
            r6 = r0
        L79:
            if (r6 == 0) goto L7c
            r0 = r2
        L7c:
            r5.d = r0
            return
    }

    public final defpackage.o44 a(int r11, int r12, int r13, java.lang.CharSequence r14) {
            r10 = this;
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r0 = r0 & r13
            int r0 = r0 >> 16
            if (r0 < 0) goto L43
            r1 = 6
            if (r0 >= r1) goto L43
            int[] r1 = defpackage.i44.y
            r0 = r1[r0]
            int r0 = r0 << 16
            r1 = 65535(0xffff, float:9.1834E-41)
            r1 = r1 & r13
            r7 = r0 | r1
            int r9 = r10.l
            o44 r2 = new o44
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r8 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            java.util.ArrayList r10 = r3.f
            int r11 = r10.size()
            r12 = 1
            int r11 = r11 - r12
        L2a:
            if (r11 < 0) goto L3b
            java.lang.Object r13 = r10.get(r11)
            o44 r13 = (defpackage.o44) r13
            int r13 = r13.d
            if (r13 > r7) goto L38
            int r11 = r11 + r12
            goto L3c
        L38:
            int r11 = r11 + (-1)
            goto L2a
        L3b:
            r11 = 0
        L3c:
            r10.add(r11, r2)
            r3.p(r12)
            return r2
        L43:
            java.lang.String r10 = "order does not contain a valid category."
            defpackage.i.h(r10)
            r10 = 0
            return r10
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.b
            java.lang.String r2 = r0.getString(r2)
            r0 = 0
            o44 r1 = r1.a(r0, r0, r0, r2)
            return r1
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.content.res.Resources r0 = r1.b
            java.lang.String r5 = r0.getString(r5)
            o44 r1 = r1.a(r2, r3, r4, r5)
            return r1
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            o44 r0 = r0.a(r1, r2, r3, r4)
            return r0
    }

    @Override // android.view.Menu
    public final android.view.MenuItem add(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            o44 r1 = r1.a(r0, r0, r0, r2)
            return r1
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
            r7 = this;
            android.content.Context r0 = r7.a
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L12
            int r2 = r11.size()
            goto L13
        L12:
            r2 = r1
        L13:
            r14 = r14 & 1
            if (r14 != 0) goto L1a
            r7.removeGroup(r8)
        L1a:
            if (r1 >= r2) goto L5b
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L2a
            r4 = r13
            goto L2c
        L2a:
            r4 = r12[r4]
        L2c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            o44 r4 = r7.a(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            r4.setIcon(r5)
            r4.g = r3
            if (r15 == 0) goto L58
            int r14 = r14.specificIndex
            if (r14 < 0) goto L58
            r15[r14] = r4
        L58:
            int r1 = r1 + 1
            goto L1a
        L5b:
            return r2
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.b
            java.lang.String r2 = r0.getString(r2)
            r0 = 0
            android.view.SubMenu r1 = r1.addSubMenu(r0, r0, r0, r2)
            return r1
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int r2, int r3, int r4, int r5) {
            r1 = this;
            android.content.res.Resources r0 = r1.b
            java.lang.String r5 = r0.getString(r5)
            android.view.SubMenu r1 = r1.addSubMenu(r2, r3, r4, r5)
            return r1
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(int r1, int r2, int r3, java.lang.CharSequence r4) {
            r0 = this;
            o44 r1 = r0.a(r1, r2, r3, r4)
            it6 r2 = new it6
            android.content.Context r3 = r0.a
            r2.<init>(r3, r0, r1)
            r1.o = r2
            java.lang.CharSequence r0 = r1.e
            r2.setHeaderTitle(r0)
            return r2
    }

    @Override // android.view.Menu
    public final android.view.SubMenu addSubMenu(java.lang.CharSequence r2) {
            r1 = this;
            r0 = 0
            android.view.SubMenu r1 = r1.addSubMenu(r0, r0, r0, r2)
            return r1
    }

    public final void b(defpackage.b54 r3, android.content.Context r4) {
            r2 = this;
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            java.util.concurrent.CopyOnWriteArrayList r1 = r2.u
            r1.add(r0)
            r3.k(r4, r2)
            r3 = 1
            r2.k = r3
            return
    }

    public final void c(boolean r5) {
            r4 = this;
            boolean r0 = r4.s
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r4.s = r0
            java.util.concurrent.CopyOnWriteArrayList r0 = r4.u
            java.util.Iterator r1 = r0.iterator()
        Le:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L2a
            java.lang.Object r2 = r1.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r3 = r2.get()
            b54 r3 = (defpackage.b54) r3
            if (r3 != 0) goto L26
            r0.remove(r2)
            goto Le
        L26:
            r3.d(r4, r5)
            goto Le
        L2a:
            r5 = 0
            r4.s = r5
            return
    }

    @Override // android.view.Menu
    public final void clear() {
            r1 = this;
            o44 r0 = r1.v
            if (r0 == 0) goto L7
            r1.d(r0)
        L7:
            java.util.ArrayList r0 = r1.f
            r0.clear()
            r0 = 1
            r1.p(r0)
            return
    }

    public final void clearHeader() {
            r1 = this;
            r0 = 0
            r1.n = r0
            r1.m = r0
            r1.o = r0
            r0 = 0
            r1.p(r0)
            return
    }

    @Override // android.view.Menu
    public final void close() {
            r1 = this;
            r0 = 1
            r1.c(r0)
            return
    }

    public boolean d(defpackage.o44 r6) {
            r5 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r5.u
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 != 0) goto L3b
            o44 r1 = r5.v
            if (r1 == r6) goto Le
            goto L3b
        Le:
            r5.w()
            java.util.Iterator r1 = r0.iterator()
        L15:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L33
            java.lang.Object r3 = r1.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            b54 r4 = (defpackage.b54) r4
            if (r4 != 0) goto L2d
            r0.remove(r3)
            goto L15
        L2d:
            boolean r2 = r4.f(r6)
            if (r2 == 0) goto L15
        L33:
            r5.v()
            if (r2 == 0) goto L3b
            r6 = 0
            r5.v = r6
        L3b:
            return r2
    }

    public boolean e(defpackage.i44 r1, android.view.MenuItem r2) {
            r0 = this;
            g44 r0 = r0.e
            if (r0 == 0) goto Lc
            boolean r0 = r0.n(r1, r2)
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean f(defpackage.o44 r6) {
            r5 = this;
            java.util.concurrent.CopyOnWriteArrayList r0 = r5.u
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            r5.w()
            java.util.Iterator r1 = r0.iterator()
        L11:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r1.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            b54 r4 = (defpackage.b54) r4
            if (r4 != 0) goto L29
            r0.remove(r3)
            goto L11
        L29:
            boolean r2 = r4.h(r6)
            if (r2 == 0) goto L11
        L2f:
            r5.v()
            if (r2 == 0) goto L36
            r5.v = r6
        L36:
            return r2
    }

    @Override // android.view.Menu
    public final android.view.MenuItem findItem(int r5) {
            r4 = this;
            java.util.ArrayList r4 = r4.f
            int r0 = r4.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L26
            java.lang.Object r2 = r4.get(r1)
            o44 r2 = (defpackage.o44) r2
            int r3 = r2.a
            if (r3 != r5) goto L14
            return r2
        L14:
            boolean r3 = r2.hasSubMenu()
            if (r3 == 0) goto L23
            it6 r2 = r2.o
            android.view.MenuItem r2 = r2.findItem(r5)
            if (r2 == 0) goto L23
            return r2
        L23:
            int r1 = r1 + 1
            goto L7
        L26:
            r4 = 0
            return r4
    }

    public final defpackage.o44 g(int r11, android.view.KeyEvent r12) {
            r10 = this;
            java.util.ArrayList r0 = r10.t
            r0.clear()
            r10.h(r0, r11, r12)
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 == 0) goto L10
            return r2
        L10:
            int r1 = r12.getMetaState()
            android.view.KeyCharacterMap$KeyData r3 = new android.view.KeyCharacterMap$KeyData
            r3.<init>()
            r12.getKeyData(r3)
            int r12 = r0.size()
            r4 = 1
            r5 = 0
            if (r12 != r4) goto L2b
            java.lang.Object r10 = r0.get(r5)
            o44 r10 = (defpackage.o44) r10
            return r10
        L2b:
            boolean r10 = r10.n()
            r4 = r5
        L30:
            if (r4 >= r12) goto L60
            java.lang.Object r6 = r0.get(r4)
            o44 r6 = (defpackage.o44) r6
            if (r10 == 0) goto L3d
            char r7 = r6.j
            goto L3f
        L3d:
            char r7 = r6.h
        L3f:
            char[] r8 = r3.meta
            char r9 = r8[r5]
            if (r7 != r9) goto L49
            r9 = r1 & 2
            if (r9 == 0) goto L5c
        L49:
            r9 = 2
            char r8 = r8[r9]
            if (r7 != r8) goto L52
            r8 = r1 & 2
            if (r8 != 0) goto L5c
        L52:
            if (r10 == 0) goto L5d
            r8 = 8
            if (r7 != r8) goto L5d
            r7 = 67
            if (r11 != r7) goto L5d
        L5c:
            return r6
        L5d:
            int r4 = r4 + 1
            goto L30
        L60:
            return r2
    }

    @Override // android.view.Menu
    public final android.view.MenuItem getItem(int r1) {
            r0 = this;
            java.util.ArrayList r0 = r0.f
            java.lang.Object r0 = r0.get(r1)
            android.view.MenuItem r0 = (android.view.MenuItem) r0
            return r0
    }

    public final void h(java.util.List r13, int r14, android.view.KeyEvent r15) {
            r12 = this;
            boolean r0 = r12.n()
            int r1 = r15.getModifiers()
            android.view.KeyCharacterMap$KeyData r2 = new android.view.KeyCharacterMap$KeyData
            r2.<init>()
            boolean r3 = r15.getKeyData(r2)
            r4 = 67
            if (r3 != 0) goto L18
            if (r14 == r4) goto L18
            goto L6a
        L18:
            java.util.ArrayList r12 = r12.f
            int r3 = r12.size()
            r5 = 0
            r6 = r5
        L20:
            if (r6 >= r3) goto L6a
            java.lang.Object r7 = r12.get(r6)
            o44 r7 = (defpackage.o44) r7
            boolean r8 = r7.hasSubMenu()
            if (r8 == 0) goto L33
            it6 r8 = r7.o
            r8.h(r13, r14, r15)
        L33:
            if (r0 == 0) goto L38
            char r8 = r7.j
            goto L3a
        L38:
            char r8 = r7.h
        L3a:
            if (r0 == 0) goto L3f
            int r9 = r7.k
            goto L41
        L3f:
            int r9 = r7.i
        L41:
            r10 = 69647(0x1100f, float:9.7596E-41)
            r11 = r1 & r10
            r9 = r9 & r10
            if (r11 != r9) goto L67
            if (r8 == 0) goto L67
            char[] r9 = r2.meta
            char r10 = r9[r5]
            if (r8 == r10) goto L5e
            r10 = 2
            char r9 = r9[r10]
            if (r8 == r9) goto L5e
            if (r0 == 0) goto L67
            r9 = 8
            if (r8 != r9) goto L67
            if (r14 != r4) goto L67
        L5e:
            boolean r8 = r7.isEnabled()
            if (r8 == 0) goto L67
            r13.add(r7)
        L67:
            int r6 = r6 + 1
            goto L20
        L6a:
            return
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
            r4 = this;
            boolean r0 = r4.x
            if (r0 == 0) goto L5
            goto L1b
        L5:
            java.util.ArrayList r4 = r4.f
            int r0 = r4.size()
            r1 = 0
            r2 = r1
        Ld:
            if (r2 >= r0) goto L20
            java.lang.Object r3 = r4.get(r2)
            o44 r3 = (defpackage.o44) r3
            boolean r3 = r3.isVisible()
            if (r3 == 0) goto L1d
        L1b:
            r4 = 1
            return r4
        L1d:
            int r2 = r2 + 1
            goto Ld
        L20:
            return r1
    }

    public final void i() {
            r9 = this;
            java.util.ArrayList r0 = r9.l()
            boolean r1 = r9.k
            if (r1 != 0) goto L9
            return
        L9:
            java.util.concurrent.CopyOnWriteArrayList r1 = r9.u
            java.util.Iterator r2 = r1.iterator()
            r3 = 0
            r4 = r3
        L11:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L2f
            java.lang.Object r5 = r2.next()
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5
            java.lang.Object r6 = r5.get()
            b54 r6 = (defpackage.b54) r6
            if (r6 != 0) goto L29
            r1.remove(r5)
            goto L11
        L29:
            boolean r5 = r6.c()
            r4 = r4 | r5
            goto L11
        L2f:
            java.util.ArrayList r1 = r9.i
            java.util.ArrayList r2 = r9.j
            if (r4 == 0) goto L59
            r1.clear()
            r2.clear()
            int r4 = r0.size()
            r5 = r3
        L40:
            if (r5 >= r4) goto L66
            java.lang.Object r6 = r0.get(r5)
            o44 r6 = (defpackage.o44) r6
            int r7 = r6.x
            r8 = 32
            r7 = r7 & r8
            if (r7 != r8) goto L53
            r1.add(r6)
            goto L56
        L53:
            r2.add(r6)
        L56:
            int r5 = r5 + 1
            goto L40
        L59:
            r1.clear()
            r2.clear()
            java.util.ArrayList r0 = r9.l()
            r2.addAll(r0)
        L66:
            r9.k = r3
            return
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int r1, android.view.KeyEvent r2) {
            r0 = this;
            o44 r0 = r0.g(r1, r2)
            if (r0 == 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public java.lang.String j() {
            r0 = this;
            java.lang.String r0 = "android:menu:actionviewstates"
            return r0
    }

    public defpackage.i44 k() {
            r0 = this;
            return r0
    }

    public final java.util.ArrayList l() {
            r7 = this;
            boolean r0 = r7.h
            java.util.ArrayList r1 = r7.g
            if (r0 != 0) goto L7
            return r1
        L7:
            r1.clear()
            java.util.ArrayList r0 = r7.f
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        L12:
            if (r4 >= r2) goto L26
            java.lang.Object r5 = r0.get(r4)
            o44 r5 = (defpackage.o44) r5
            boolean r6 = r5.isVisible()
            if (r6 == 0) goto L23
            r1.add(r5)
        L23:
            int r4 = r4 + 1
            goto L12
        L26:
            r7.h = r3
            r0 = 1
            r7.k = r0
            return r1
    }

    public boolean m() {
            r0 = this;
            boolean r0 = r0.w
            return r0
    }

    public boolean n() {
            r0 = this;
            boolean r0 = r0.c
            return r0
    }

    public boolean o() {
            r0 = this;
            boolean r0 = r0.d
            return r0
    }

    public final void p(boolean r4) {
            r3 = this;
            boolean r0 = r3.p
            r1 = 1
            if (r0 != 0) goto L3b
            if (r4 == 0) goto Lb
            r3.h = r1
            r3.k = r1
        Lb:
            java.util.concurrent.CopyOnWriteArrayList r4 = r3.u
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L14
            goto L41
        L14:
            r3.w()
            java.util.Iterator r0 = r4.iterator()
        L1b:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L37
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            b54 r2 = (defpackage.b54) r2
            if (r2 != 0) goto L33
            r4.remove(r1)
            goto L1b
        L33:
            r2.i()
            goto L1b
        L37:
            r3.v()
            return
        L3b:
            r3.q = r1
            if (r4 == 0) goto L41
            r3.r = r1
        L41:
            return
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int r2, int r3) {
            r1 = this;
            android.view.MenuItem r2 = r1.findItem(r2)
            r0 = 0
            boolean r1 = r1.q(r2, r0, r3)
            return r1
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int r1, android.view.KeyEvent r2, int r3) {
            r0 = this;
            o44 r1 = r0.g(r1, r2)
            if (r1 == 0) goto Lc
            r2 = 0
            boolean r1 = r0.q(r1, r2, r3)
            goto Ld
        Lc:
            r1 = 0
        Ld:
            r2 = r3 & 2
            if (r2 == 0) goto L15
            r2 = 1
            r0.c(r2)
        L15:
            return r1
    }

    public final boolean q(android.view.MenuItem r7, defpackage.b54 r8, int r9) {
            r6 = this;
            o44 r7 = (defpackage.o44) r7
            r0 = 0
            if (r7 == 0) goto Ld2
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Ld2
        Ld:
            i44 r1 = r7.n
            android.view.MenuItem$OnMenuItemClickListener r2 = r7.p
            r3 = 1
            if (r2 == 0) goto L1c
            boolean r2 = r2.onMenuItemClick(r7)
            if (r2 == 0) goto L1c
        L1a:
            r1 = r3
            goto L43
        L1c:
            boolean r2 = r1.e(r1, r7)
            if (r2 == 0) goto L23
            goto L1a
        L23:
            android.content.Intent r2 = r7.g
            if (r2 == 0) goto L35
            android.content.Context r1 = r1.a     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r2)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L1a
        L2d:
            r1 = move-exception
            java.lang.String r2 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r2, r4, r1)
        L35:
            p44 r1 = r7.A
            if (r1 == 0) goto L42
            android.view.ActionProvider r1 = r1.b
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L42
            goto L1a
        L42:
            r1 = r0
        L43:
            p44 r2 = r7.A
            if (r2 == 0) goto L51
            android.view.ActionProvider r4 = r2.b
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L51
            r4 = r3
            goto L52
        L51:
            r4 = r0
        L52:
            boolean r5 = r7.e()
            if (r5 == 0) goto L64
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Ld1
            r6.c(r3)
            goto Ld1
        L64:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L75
            if (r4 == 0) goto L6d
            goto L75
        L6d:
            r7 = r9 & 1
            if (r7 != 0) goto Ld1
            r6.c(r3)
            goto Ld1
        L75:
            r9 = r9 & 4
            if (r9 != 0) goto L7c
            r6.c(r0)
        L7c:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L90
            it6 r9 = new it6
            android.content.Context r5 = r6.a
            r9.<init>(r5, r6, r7)
            r7.o = r9
            java.lang.CharSequence r5 = r7.e
            r9.setHeaderTitle(r5)
        L90:
            it6 r7 = r7.o
            if (r4 == 0) goto L99
            android.view.ActionProvider r9 = r2.b
            r9.onPrepareSubMenu(r7)
        L99:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.u
            boolean r2 = r9.isEmpty()
            if (r2 == 0) goto La2
            goto Lcb
        La2:
            if (r8 == 0) goto La8
            boolean r0 = r8.b(r7)
        La8:
            java.util.Iterator r8 = r9.iterator()
        Lac:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lcb
            java.lang.Object r2 = r8.next()
            java.lang.ref.WeakReference r2 = (java.lang.ref.WeakReference) r2
            java.lang.Object r4 = r2.get()
            b54 r4 = (defpackage.b54) r4
            if (r4 != 0) goto Lc4
            r9.remove(r2)
            goto Lac
        Lc4:
            if (r0 != 0) goto Lac
            boolean r0 = r4.b(r7)
            goto Lac
        Lcb:
            r1 = r1 | r0
            if (r1 != 0) goto Ld1
            r6.c(r3)
        Ld1:
            return r1
        Ld2:
            return r0
    }

    public final void r(defpackage.b54 r4) {
            r3 = this;
            java.util.concurrent.CopyOnWriteArrayList r3 = r3.u
            java.util.Iterator r0 = r3.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r2 = r1.get()
            b54 r2 = (defpackage.b54) r2
            if (r2 == 0) goto L1c
            if (r2 != r4) goto L6
        L1c:
            r3.remove(r1)
            goto L6
        L20:
            return
    }

    @Override // android.view.Menu
    public final void removeGroup(int r6) {
            r5 = this;
            java.util.ArrayList r0 = r5.f
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L18
            java.lang.Object r4 = r0.get(r3)
            o44 r4 = (defpackage.o44) r4
            int r4 = r4.b
            if (r4 != r6) goto L15
            goto L19
        L15:
            int r3 = r3 + 1
            goto L8
        L18:
            r3 = -1
        L19:
            if (r3 < 0) goto L40
            int r1 = r0.size()
            int r1 = r1 - r3
        L20:
            int r4 = r2 + 1
            if (r2 >= r1) goto L3c
            java.lang.Object r2 = r0.get(r3)
            o44 r2 = (defpackage.o44) r2
            int r2 = r2.b
            if (r2 != r6) goto L3c
            if (r3 < 0) goto L3a
            int r2 = r0.size()
            if (r3 < r2) goto L37
            goto L3a
        L37:
            r0.remove(r3)
        L3a:
            r2 = r4
            goto L20
        L3c:
            r6 = 1
            r5.p(r6)
        L40:
            return
    }

    @Override // android.view.Menu
    public final void removeItem(int r5) {
            r4 = this;
            java.util.ArrayList r0 = r4.f
            int r1 = r0.size()
            r2 = 0
        L7:
            if (r2 >= r1) goto L17
            java.lang.Object r3 = r0.get(r2)
            o44 r3 = (defpackage.o44) r3
            int r3 = r3.a
            if (r3 != r5) goto L14
            goto L18
        L14:
            int r2 = r2 + 1
            goto L7
        L17:
            r2 = -1
        L18:
            if (r2 < 0) goto L28
            int r5 = r0.size()
            if (r2 < r5) goto L21
            goto L28
        L21:
            r0.remove(r2)
            r5 = 1
            r4.p(r5)
        L28:
            return
    }

    public final void s(android.os.Bundle r8) {
            r7 = this;
            if (r8 != 0) goto L3
            goto L4b
        L3:
            java.lang.String r0 = r7.j()
            android.util.SparseArray r0 = r8.getSparseParcelableArray(r0)
            java.util.ArrayList r1 = r7.f
            int r1 = r1.size()
            r2 = 0
        L12:
            if (r2 >= r1) goto L3a
            android.view.MenuItem r3 = r7.getItem(r2)
            android.view.View r4 = r3.getActionView()
            if (r4 == 0) goto L28
            int r5 = r4.getId()
            r6 = -1
            if (r5 == r6) goto L28
            r4.restoreHierarchyState(r0)
        L28:
            boolean r4 = r3.hasSubMenu()
            if (r4 == 0) goto L37
            android.view.SubMenu r3 = r3.getSubMenu()
            it6 r3 = (defpackage.it6) r3
            r3.s(r8)
        L37:
            int r2 = r2 + 1
            goto L12
        L3a:
            java.lang.String r0 = "android:menu:expandedactionview"
            int r8 = r8.getInt(r0)
            if (r8 <= 0) goto L4b
            android.view.MenuItem r7 = r7.findItem(r8)
            if (r7 == 0) goto L4b
            r7.expandActionView()
        L4b:
            return
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int r7, boolean r8, boolean r9) {
            r6 = this;
            java.util.ArrayList r6 = r6.f
            int r0 = r6.size()
            r1 = 0
            r2 = r1
        L8:
            if (r2 >= r0) goto L26
            java.lang.Object r3 = r6.get(r2)
            o44 r3 = (defpackage.o44) r3
            int r4 = r3.b
            if (r4 != r7) goto L23
            int r4 = r3.x
            r4 = r4 & (-5)
            if (r9 == 0) goto L1c
            r5 = 4
            goto L1d
        L1c:
            r5 = r1
        L1d:
            r4 = r4 | r5
            r3.x = r4
            r3.setCheckable(r8)
        L23:
            int r2 = r2 + 1
            goto L8
        L26:
            return
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean r1) {
            r0 = this;
            r0.w = r1
            return
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int r5, boolean r6) {
            r4 = this;
            java.util.ArrayList r4 = r4.f
            int r0 = r4.size()
            r1 = 0
        L7:
            if (r1 >= r0) goto L19
            java.lang.Object r2 = r4.get(r1)
            o44 r2 = (defpackage.o44) r2
            int r3 = r2.b
            if (r3 != r5) goto L16
            r2.setEnabled(r6)
        L16:
            int r1 = r1 + 1
            goto L7
        L19:
            return
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int r11, boolean r12) {
            r10 = this;
            java.util.ArrayList r0 = r10.f
            int r1 = r0.size()
            r2 = 0
            r3 = r2
            r4 = r3
        L9:
            r5 = 1
            if (r3 >= r1) goto L29
            java.lang.Object r6 = r0.get(r3)
            o44 r6 = (defpackage.o44) r6
            int r7 = r6.b
            if (r7 != r11) goto L26
            int r7 = r6.x
            r8 = r7 & (-9)
            if (r12 == 0) goto L1e
            r9 = r2
            goto L20
        L1e:
            r9 = 8
        L20:
            r8 = r8 | r9
            r6.x = r8
            if (r7 == r8) goto L26
            r4 = r5
        L26:
            int r3 = r3 + 1
            goto L9
        L29:
            if (r4 == 0) goto L2e
            r10.p(r5)
        L2e:
            return
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean r1) {
            r0 = this;
            r0.c = r1
            r1 = 0
            r0.p(r1)
            return
    }

    @Override // android.view.Menu
    public final int size() {
            r0 = this;
            java.util.ArrayList r0 = r0.f
            int r0 = r0.size()
            return r0
    }

    public final void t(android.os.Bundle r8) {
            r7 = this;
            java.util.ArrayList r0 = r7.f
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L46
            android.view.MenuItem r3 = r7.getItem(r2)
            android.view.View r4 = r3.getActionView()
            if (r4 == 0) goto L34
            int r5 = r4.getId()
            r6 = -1
            if (r5 == r6) goto L34
            if (r1 != 0) goto L22
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
        L22:
            r4.saveHierarchyState(r1)
            boolean r4 = r3.isActionViewExpanded()
            if (r4 == 0) goto L34
            java.lang.String r4 = "android:menu:expandedactionview"
            int r5 = r3.getItemId()
            r8.putInt(r4, r5)
        L34:
            boolean r4 = r3.hasSubMenu()
            if (r4 == 0) goto L43
            android.view.SubMenu r3 = r3.getSubMenu()
            it6 r3 = (defpackage.it6) r3
            r3.t(r8)
        L43:
            int r2 = r2 + 1
            goto L8
        L46:
            if (r1 == 0) goto L4f
            java.lang.String r7 = r7.j()
            r8.putSparseParcelableArray(r7, r1)
        L4f:
            return
    }

    public final void u(int r2, java.lang.CharSequence r3, int r4, android.graphics.drawable.Drawable r5, android.view.View r6) {
            r1 = this;
            r0 = 0
            if (r6 == 0) goto La
            r1.o = r6
            r1.m = r0
            r1.n = r0
            goto L2a
        La:
            if (r2 <= 0) goto L15
            android.content.res.Resources r3 = r1.b
            java.lang.CharSequence r2 = r3.getText(r2)
            r1.m = r2
            goto L19
        L15:
            if (r3 == 0) goto L19
            r1.m = r3
        L19:
            if (r4 <= 0) goto L24
            android.content.Context r2 = r1.a
            android.graphics.drawable.Drawable r2 = r2.getDrawable(r4)
            r1.n = r2
            goto L28
        L24:
            if (r5 == 0) goto L28
            r1.n = r5
        L28:
            r1.o = r0
        L2a:
            r2 = 0
            r1.p(r2)
            return
    }

    public final void v() {
            r2 = this;
            r0 = 0
            r2.p = r0
            boolean r1 = r2.q
            if (r1 == 0) goto Le
            r2.q = r0
            boolean r0 = r2.r
            r2.p(r0)
        Le:
            return
    }

    public final void w() {
            r1 = this;
            boolean r0 = r1.p
            if (r0 != 0) goto Lc
            r0 = 1
            r1.p = r0
            r0 = 0
            r1.q = r0
            r1.r = r0
        Lc:
            return
    }
}
