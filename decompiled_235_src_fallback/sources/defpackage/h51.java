package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h51  reason: default package */
/* loaded from: classes.dex */
public final class h51 extends android.view.ViewGroup.MarginLayoutParams {
    public defpackage.e51 a;
    public boolean b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public int h;
    public int i;
    public int j;
    public android.view.View k;
    public android.view.View l;
    public boolean m;
    public boolean n;
    public final android.graphics.Rect o;

    public h51() {
            r2 = this;
            r0 = -2
            r2.<init>(r0, r0)
            r0 = 0
            r2.b = r0
            r2.c = r0
            r2.d = r0
            r1 = -1
            r2.e = r1
            r2.f = r1
            r2.g = r0
            r2.h = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.o = r0
            return
    }

    public h51(android.content.Context r9, android.util.AttributeSet r10) {
            r8 = this;
            r8.<init>(r9, r10)
            r0 = 0
            r8.b = r0
            r8.c = r0
            r8.d = r0
            r1 = -1
            r8.e = r1
            r8.f = r1
            r8.g = r0
            r8.h = r0
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r8.o = r2
            int[] r2 = defpackage.f75.b
            android.content.res.TypedArray r2 = r9.obtainStyledAttributes(r10, r2)
            int r3 = r2.getInteger(r0, r0)
            r8.c = r3
            r3 = 1
            int r4 = r2.getResourceId(r3, r1)
            r8.f = r4
            r4 = 2
            int r4 = r2.getInteger(r4, r0)
            r8.d = r4
            r4 = 6
            int r1 = r2.getInteger(r4, r1)
            r8.e = r1
            r1 = 5
            int r1 = r2.getInt(r1, r0)
            r8.g = r1
            r1 = 4
            int r1 = r2.getInt(r1, r0)
            r8.h = r1
            r1 = 3
            boolean r4 = r2.hasValue(r1)
            r8.b = r4
            if (r4 == 0) goto Le9
            java.lang.String r1 = r2.getString(r1)
            java.lang.String r4 = androidx.coordinatorlayout.widget.CoordinatorLayout.s0
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            r5 = 0
            if (r4 == 0) goto L61
            goto Ldc
        L61:
            java.lang.String r4 = "."
            boolean r4 = r1.startsWith(r4)
            if (r4 == 0) goto L7d
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r6 = r9.getPackageName()
            r4.append(r6)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            goto La0
        L7d:
            r4 = 46
            int r6 = r1.indexOf(r4)
            if (r6 < 0) goto L86
            goto La0
        L86:
            java.lang.String r6 = androidx.coordinatorlayout.widget.CoordinatorLayout.s0
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto La0
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r6)
            r7.append(r4)
            r7.append(r1)
            java.lang.String r1 = r7.toString()
        La0:
            java.lang.ThreadLocal r4 = androidx.coordinatorlayout.widget.CoordinatorLayout.u0     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r6 = r4.get()     // Catch: java.lang.Exception -> Lb3
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Exception -> Lb3
            if (r6 != 0) goto Lb5
            java.util.HashMap r6 = new java.util.HashMap     // Catch: java.lang.Exception -> Lb3
            r6.<init>()     // Catch: java.lang.Exception -> Lb3
            r4.set(r6)     // Catch: java.lang.Exception -> Lb3
            goto Lb5
        Lb3:
            r8 = move-exception
            goto Ldf
        Lb5:
            java.lang.Object r4 = r6.get(r1)     // Catch: java.lang.Exception -> Lb3
            java.lang.reflect.Constructor r4 = (java.lang.reflect.Constructor) r4     // Catch: java.lang.Exception -> Lb3
            if (r4 != 0) goto Ld1
            java.lang.ClassLoader r4 = r9.getClassLoader()     // Catch: java.lang.Exception -> Lb3
            java.lang.Class r0 = java.lang.Class.forName(r1, r0, r4)     // Catch: java.lang.Exception -> Lb3
            java.lang.Class[] r4 = androidx.coordinatorlayout.widget.CoordinatorLayout.t0     // Catch: java.lang.Exception -> Lb3
            java.lang.reflect.Constructor r4 = r0.getConstructor(r4)     // Catch: java.lang.Exception -> Lb3
            r4.setAccessible(r3)     // Catch: java.lang.Exception -> Lb3
            r6.put(r1, r4)     // Catch: java.lang.Exception -> Lb3
        Ld1:
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r10}     // Catch: java.lang.Exception -> Lb3
            java.lang.Object r9 = r4.newInstance(r9)     // Catch: java.lang.Exception -> Lb3
            e51 r9 = (defpackage.e51) r9     // Catch: java.lang.Exception -> Lb3
            r5 = r9
        Ldc:
            r8.a = r5
            goto Le9
        Ldf:
            java.lang.String r9 = "Could not inflate Behavior subclass "
            java.lang.String r9 = r9.concat(r1)
            defpackage.u34.p(r9, r8)
            throw r5
        Le9:
            r2.recycle()
            e51 r9 = r8.a
            if (r9 == 0) goto Lf3
            r9.g(r8)
        Lf3:
            return
    }

    public h51(android.view.ViewGroup.LayoutParams r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            r1.b = r2
            r1.c = r2
            r1.d = r2
            r0 = -1
            r1.e = r0
            r1.f = r0
            r1.g = r2
            r1.h = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.o = r2
            return
    }

    public h51(android.view.ViewGroup.MarginLayoutParams r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            r1.b = r2
            r1.c = r2
            r1.d = r2
            r0 = -1
            r1.e = r0
            r1.f = r0
            r1.g = r2
            r1.h = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.o = r2
            return
    }

    public h51(defpackage.h51 r2) {
            r1 = this;
            r1.<init>(r2)
            r2 = 0
            r1.b = r2
            r1.c = r2
            r1.d = r2
            r0 = -1
            r1.e = r0
            r1.f = r0
            r1.g = r2
            r1.h = r2
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r1.o = r2
            return
    }

    public final boolean a(int r2) {
            r1 = this;
            if (r2 == 0) goto La
            r0 = 1
            if (r2 == r0) goto L7
            r1 = 0
            return r1
        L7:
            boolean r1 = r1.n
            return r1
        La:
            boolean r1 = r1.m
            return r1
    }
}
