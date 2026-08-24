package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ol5  reason: default package */
/* loaded from: classes.dex */
public final class ol5 {
    public static final android.graphics.PorterDuff.Mode f = null;
    public static defpackage.ol5 g;
    public static final defpackage.nl5 h = null;
    public java.util.WeakHashMap a;
    public final java.util.WeakHashMap b;
    public android.util.TypedValue c;
    public boolean d;
    public defpackage.pa e;

    static {
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            defpackage.ol5.f = r0
            nl5 r0 = new nl5
            r1 = 6
            r0.<init>(r1)
            defpackage.ol5.h = r0
            return
    }

    public ol5() {
            r2 = this;
            r2.<init>()
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r1 = 0
            r0.<init>(r1)
            r2.b = r0
            return
    }

    public static synchronized defpackage.ol5 b() {
            java.lang.Class<ol5> r0 = defpackage.ol5.class
            monitor-enter(r0)
            ol5 r1 = defpackage.ol5.g     // Catch: java.lang.Throwable -> Lf
            if (r1 != 0) goto L11
            ol5 r1 = new ol5     // Catch: java.lang.Throwable -> Lf
            r1.<init>()     // Catch: java.lang.Throwable -> Lf
            defpackage.ol5.g = r1     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r1 = move-exception
            goto L15
        L11:
            ol5 r1 = defpackage.ol5.g     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public static synchronized android.graphics.PorterDuffColorFilter e(int r4, android.graphics.PorterDuff.Mode r5) {
            java.lang.Class<ol5> r0 = defpackage.ol5.class
            monitor-enter(r0)
            nl5 r1 = defpackage.ol5.h     // Catch: java.lang.Throwable -> L33
            r1.getClass()     // Catch: java.lang.Throwable -> L33
            r2 = 31
            int r3 = r2 + r4
            int r3 = r3 * r2
            int r2 = r5.hashCode()     // Catch: java.lang.Throwable -> L33
            int r2 = r2 + r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L33
            java.lang.Object r2 = r1.h(r2)     // Catch: java.lang.Throwable -> L33
            android.graphics.PorterDuffColorFilter r2 = (android.graphics.PorterDuffColorFilter) r2     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L35
            android.graphics.PorterDuffColorFilter r2 = new android.graphics.PorterDuffColorFilter     // Catch: java.lang.Throwable -> L33
            r2.<init>(r4, r5)     // Catch: java.lang.Throwable -> L33
            int r4 = r5.hashCode()     // Catch: java.lang.Throwable -> L33
            int r4 = r4 + r3
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L33
            java.lang.Object r4 = r1.l(r4, r2)     // Catch: java.lang.Throwable -> L33
            android.graphics.PorterDuffColorFilter r4 = (android.graphics.PorterDuffColorFilter) r4     // Catch: java.lang.Throwable -> L33
            goto L35
        L33:
            r4 = move-exception
            goto L37
        L35:
            monitor-exit(r0)
            return r2
        L37:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L33
            throw r4
    }

    public final android.graphics.drawable.Drawable a(android.content.Context r7, int r8) {
            r6 = this;
            android.util.TypedValue r0 = r6.c
            if (r0 != 0) goto Lb
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            r6.c = r0
        Lb:
            android.util.TypedValue r0 = r6.c
            android.content.res.Resources r1 = r7.getResources()
            r2 = 1
            r1.getValue(r8, r0, r2)
            int r1 = r0.assetCookie
            long r1 = (long) r1
            r3 = 32
            long r1 = r1 << r3
            int r3 = r0.data
            long r3 = (long) r3
            long r1 = r1 | r3
            monitor-enter(r6)
            java.util.WeakHashMap r3 = r6.b     // Catch: java.lang.Throwable -> L48
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Throwable -> L48
            hz3 r3 = (defpackage.hz3) r3     // Catch: java.lang.Throwable -> L48
            r4 = 0
            if (r3 != 0) goto L2e
            monitor-exit(r6)
        L2c:
            r3 = r4
            goto L50
        L2e:
            java.lang.Object r5 = r3.b(r1)     // Catch: java.lang.Throwable -> L48
            java.lang.ref.WeakReference r5 = (java.lang.ref.WeakReference) r5     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L4e
            java.lang.Object r5 = r5.get()     // Catch: java.lang.Throwable -> L48
            android.graphics.drawable.Drawable$ConstantState r5 = (android.graphics.drawable.Drawable.ConstantState) r5     // Catch: java.lang.Throwable -> L48
            if (r5 == 0) goto L4b
            android.content.res.Resources r3 = r7.getResources()     // Catch: java.lang.Throwable -> L48
            android.graphics.drawable.Drawable r3 = r5.newDrawable(r3)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r6)
            goto L50
        L48:
            r7 = move-exception
            goto Ld0
        L4b:
            r3.g(r1)     // Catch: java.lang.Throwable -> L48
        L4e:
            monitor-exit(r6)
            goto L2c
        L50:
            if (r3 == 0) goto L53
            return r3
        L53:
            pa r3 = r6.e
            if (r3 != 0) goto L59
        L57:
            r8 = r4
            goto L9c
        L59:
            r3 = 2131230780(0x7f08003c, float:1.8077622E38)
            if (r8 != r3) goto L76
            android.graphics.drawable.LayerDrawable r8 = new android.graphics.drawable.LayerDrawable
            r3 = 2131230779(0x7f08003b, float:1.807762E38)
            android.graphics.drawable.Drawable r3 = r6.c(r7, r3)
            r5 = 2131230781(0x7f08003d, float:1.8077624E38)
            android.graphics.drawable.Drawable r5 = r6.c(r7, r5)
            android.graphics.drawable.Drawable[] r3 = new android.graphics.drawable.Drawable[]{r3, r5}
            r8.<init>(r3)
            goto L9c
        L76:
            r3 = 2131230815(0x7f08005f, float:1.8077693E38)
            if (r8 != r3) goto L83
            r8 = 2131165243(0x7f07003b, float:1.7944698E38)
            android.graphics.drawable.LayerDrawable r8 = defpackage.pa.k(r6, r7, r8)
            goto L9c
        L83:
            r3 = 2131230814(0x7f08005e, float:1.8077691E38)
            if (r8 != r3) goto L90
            r8 = 2131165244(0x7f07003c, float:1.79447E38)
            android.graphics.drawable.LayerDrawable r8 = defpackage.pa.k(r6, r7, r8)
            goto L9c
        L90:
            r3 = 2131230816(0x7f080060, float:1.8077695E38)
            if (r8 != r3) goto L57
            r8 = 2131165245(0x7f07003d, float:1.7944702E38)
            android.graphics.drawable.LayerDrawable r8 = defpackage.pa.k(r6, r7, r8)
        L9c:
            if (r8 == 0) goto Lcf
            int r0 = r0.changingConfigurations
            r8.setChangingConfigurations(r0)
            monitor-enter(r6)
            android.graphics.drawable.Drawable$ConstantState r0 = r8.getConstantState()     // Catch: java.lang.Throwable -> Lbf
            if (r0 == 0) goto Lcb
            java.util.WeakHashMap r3 = r6.b     // Catch: java.lang.Throwable -> Lbf
            java.lang.Object r3 = r3.get(r7)     // Catch: java.lang.Throwable -> Lbf
            hz3 r3 = (defpackage.hz3) r3     // Catch: java.lang.Throwable -> Lbf
            if (r3 != 0) goto Lc1
            hz3 r3 = new hz3     // Catch: java.lang.Throwable -> Lbf
            r3.<init>(r4)     // Catch: java.lang.Throwable -> Lbf
            java.util.WeakHashMap r4 = r6.b     // Catch: java.lang.Throwable -> Lbf
            r4.put(r7, r3)     // Catch: java.lang.Throwable -> Lbf
            goto Lc1
        Lbf:
            r7 = move-exception
            goto Lcd
        Lc1:
            java.lang.ref.WeakReference r7 = new java.lang.ref.WeakReference     // Catch: java.lang.Throwable -> Lbf
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Lbf
            r3.f(r1, r7)     // Catch: java.lang.Throwable -> Lbf
            monitor-exit(r6)
            return r8
        Lcb:
            monitor-exit(r6)
            return r8
        Lcd:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lbf
            throw r7
        Lcf:
            return r8
        Ld0:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L48
            throw r7
    }

    public final synchronized android.graphics.drawable.Drawable c(android.content.Context r2, int r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 0
            android.graphics.drawable.Drawable r2 = r1.d(r2, r3, r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return r2
        L8:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r2
    }

    public final synchronized android.graphics.drawable.Drawable d(android.content.Context r3, int r4, boolean r5) {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.d     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L6
            goto L26
        L6:
            r0 = 1
            r2.d = r0     // Catch: java.lang.Throwable -> L31
            r0 = 2131230842(0x7f08007a, float:1.8077748E38)
            android.graphics.drawable.Drawable r0 = r2.c(r3, r0)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L40
            boolean r1 = r0 instanceof defpackage.bl7     // Catch: java.lang.Throwable -> L31
            if (r1 != 0) goto L26
            java.lang.String r1 = "android.graphics.drawable.VectorDrawable"
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Throwable -> L31
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L31
            boolean r0 = r1.equals(r0)     // Catch: java.lang.Throwable -> L31
            if (r0 == 0) goto L40
        L26:
            android.graphics.drawable.Drawable r0 = r2.a(r3, r4)     // Catch: java.lang.Throwable -> L31
            if (r0 != 0) goto L33
            android.graphics.drawable.Drawable r0 = r3.getDrawable(r4)     // Catch: java.lang.Throwable -> L31
            goto L33
        L31:
            r3 = move-exception
            goto L4b
        L33:
            if (r0 == 0) goto L39
            android.graphics.drawable.Drawable r0 = r2.g(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> L31
        L39:
            if (r0 == 0) goto L3e
            defpackage.bp1.a(r0)     // Catch: java.lang.Throwable -> L31
        L3e:
            monitor-exit(r2)
            return r0
        L40:
            r3 = 0
            r2.d = r3     // Catch: java.lang.Throwable -> L31
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L31
            java.lang.String r4 = "This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat."
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L31
            throw r3     // Catch: java.lang.Throwable -> L31
        L4b:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L31
            throw r3
    }

    public final synchronized android.content.res.ColorStateList f(android.content.Context r4, int r5) {
            r3 = this;
            monitor-enter(r3)
            java.util.WeakHashMap r0 = r3.a     // Catch: java.lang.Throwable -> L48
            r1 = 0
            if (r0 == 0) goto L15
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L48
            un6 r0 = (defpackage.un6) r0     // Catch: java.lang.Throwable -> L48
            if (r0 == 0) goto L15
            java.lang.Object r0 = r0.c(r5)     // Catch: java.lang.Throwable -> L48
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0     // Catch: java.lang.Throwable -> L48
            goto L16
        L15:
            r0 = r1
        L16:
            if (r0 != 0) goto L4a
            pa r0 = r3.e     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L1d
            goto L21
        L1d:
            android.content.res.ColorStateList r1 = r0.l(r4, r5)     // Catch: java.lang.Throwable -> L48
        L21:
            if (r1 == 0) goto L46
            java.util.WeakHashMap r0 = r3.a     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L2e
            java.util.WeakHashMap r0 = new java.util.WeakHashMap     // Catch: java.lang.Throwable -> L48
            r0.<init>()     // Catch: java.lang.Throwable -> L48
            r3.a = r0     // Catch: java.lang.Throwable -> L48
        L2e:
            java.util.WeakHashMap r0 = r3.a     // Catch: java.lang.Throwable -> L48
            java.lang.Object r0 = r0.get(r4)     // Catch: java.lang.Throwable -> L48
            un6 r0 = (defpackage.un6) r0     // Catch: java.lang.Throwable -> L48
            if (r0 != 0) goto L43
            un6 r0 = new un6     // Catch: java.lang.Throwable -> L48
            r2 = 0
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L48
            java.util.WeakHashMap r2 = r3.a     // Catch: java.lang.Throwable -> L48
            r2.put(r4, r0)     // Catch: java.lang.Throwable -> L48
        L43:
            r0.a(r5, r1)     // Catch: java.lang.Throwable -> L48
        L46:
            r0 = r1
            goto L4a
        L48:
            r4 = move-exception
            goto L4c
        L4a:
            monitor-exit(r3)
            return r0
        L4c:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L48
            throw r4
    }

    public final android.graphics.drawable.Drawable g(android.content.Context r9, int r10, boolean r11, android.graphics.drawable.Drawable r12) {
            r8 = this;
            android.content.res.ColorStateList r0 = r8.f(r9, r10)
            r1 = 0
            if (r0 == 0) goto L20
            android.graphics.drawable.Drawable r9 = r12.mutate()
            r9.setTintList(r0)
            pa r8 = r8.e
            if (r8 != 0) goto L13
            goto L1a
        L13:
            r8 = 2131230829(0x7f08006d, float:1.8077722E38)
            if (r10 != r8) goto L1a
            android.graphics.PorterDuff$Mode r1 = android.graphics.PorterDuff.Mode.MULTIPLY
        L1a:
            if (r1 == 0) goto L1f
            r9.setTintMode(r1)
        L1f:
            return r9
        L20:
            pa r0 = r8.e
            r2 = 2130968849(0x7f040111, float:1.7546363E38)
            r3 = 2130968847(0x7f04010f, float:1.754636E38)
            if (r0 == 0) goto L94
            r0 = 2131230824(0x7f080068, float:1.8077712E38)
            r4 = 16908301(0x102000d, float:2.3877265E-38)
            r5 = 16908303(0x102000f, float:2.387727E-38)
            r6 = 16908288(0x1020000, float:2.387723E-38)
            if (r10 != r0) goto L5e
            r8 = r12
            android.graphics.drawable.LayerDrawable r8 = (android.graphics.drawable.LayerDrawable) r8
            android.graphics.drawable.Drawable r10 = r8.findDrawableByLayerId(r6)
            int r11 = defpackage.h57.c(r9, r2)
            android.graphics.PorterDuff$Mode r0 = defpackage.ir.b
            defpackage.pa.u(r10, r11, r0)
            android.graphics.drawable.Drawable r10 = r8.findDrawableByLayerId(r5)
            int r11 = defpackage.h57.c(r9, r2)
            defpackage.pa.u(r10, r11, r0)
            android.graphics.drawable.Drawable r8 = r8.findDrawableByLayerId(r4)
            int r9 = defpackage.h57.c(r9, r3)
            defpackage.pa.u(r8, r9, r0)
            return r12
        L5e:
            r0 = 2131230815(0x7f08005f, float:1.8077693E38)
            if (r10 == r0) goto L6d
            r0 = 2131230814(0x7f08005e, float:1.8077691E38)
            if (r10 == r0) goto L6d
            r0 = 2131230816(0x7f080060, float:1.8077695E38)
            if (r10 != r0) goto L94
        L6d:
            r8 = r12
            android.graphics.drawable.LayerDrawable r8 = (android.graphics.drawable.LayerDrawable) r8
            android.graphics.drawable.Drawable r10 = r8.findDrawableByLayerId(r6)
            int r11 = defpackage.h57.b(r9, r2)
            android.graphics.PorterDuff$Mode r0 = defpackage.ir.b
            defpackage.pa.u(r10, r11, r0)
            android.graphics.drawable.Drawable r10 = r8.findDrawableByLayerId(r5)
            int r11 = defpackage.h57.c(r9, r3)
            defpackage.pa.u(r10, r11, r0)
            android.graphics.drawable.Drawable r8 = r8.findDrawableByLayerId(r4)
            int r9 = defpackage.h57.c(r9, r3)
            defpackage.pa.u(r8, r9, r0)
            return r12
        L94:
            pa r8 = r8.e
            r0 = 0
            if (r8 == 0) goto Lf7
            android.graphics.PorterDuff$Mode r4 = defpackage.ir.b
            java.lang.Object r5 = r8.B
            int[] r5 = (int[]) r5
            boolean r5 = defpackage.pa.e(r5, r10)
            r6 = 1
            r7 = -1
            if (r5 == 0) goto Laa
        La7:
            r10 = r6
        La8:
            r8 = r7
            goto Le0
        Laa:
            java.lang.Object r2 = r8.R
            int[] r2 = (int[]) r2
            boolean r2 = defpackage.pa.e(r2, r10)
            if (r2 == 0) goto Lb6
            r2 = r3
            goto La7
        Lb6:
            java.lang.Object r8 = r8.X
            int[] r8 = (int[]) r8
            boolean r8 = defpackage.pa.e(r8, r10)
            r2 = 16842801(0x1010031, float:2.3693695E-38)
            if (r8 == 0) goto Lc6
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.MULTIPLY
            goto La7
        Lc6:
            r8 = 2131230801(0x7f080051, float:1.8077665E38)
            if (r10 != r8) goto Ld7
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r2 = 16842800(0x1010030, float:2.3693693E-38)
            r10 = r6
            goto Le0
        Ld7:
            r8 = 2131230783(0x7f08003f, float:1.8077629E38)
            if (r10 != r8) goto Ldd
            goto La7
        Ldd:
            r10 = r0
            r2 = r10
            goto La8
        Le0:
            if (r10 == 0) goto Lf7
            android.graphics.drawable.Drawable r10 = r12.mutate()
            int r9 = defpackage.h57.c(r9, r2)
            android.graphics.PorterDuffColorFilter r9 = defpackage.ir.c(r9, r4)
            r10.setColorFilter(r9)
            if (r8 == r7) goto Lf6
            r10.setAlpha(r8)
        Lf6:
            r0 = r6
        Lf7:
            if (r0 != 0) goto Lfc
            if (r11 == 0) goto Lfc
            return r1
        Lfc:
            return r12
    }
}
