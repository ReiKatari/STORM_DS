package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dm2  reason: default package */
/* loaded from: classes.dex */
public abstract class dm2 {
    public static void f(java.util.List r8, android.view.View r9) {
            int r0 = r8.size()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L12
            java.lang.Object r3 = r8.get(r2)
            if (r3 != r9) goto Lf
            goto L57
        Lf:
            int r2 = r2 + 1
            goto L6
        L12:
            java.util.WeakHashMap r2 = defpackage.ao7.a
            java.lang.String r2 = r9.getTransitionName()
            if (r2 == 0) goto L1d
            r8.add(r9)
        L1d:
            r9 = r0
        L1e:
            int r2 = r8.size()
            if (r9 >= r2) goto L57
            java.lang.Object r2 = r8.get(r9)
            android.view.View r2 = (android.view.View) r2
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L54
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            int r3 = r2.getChildCount()
            r4 = r1
        L35:
            if (r4 >= r3) goto L54
            android.view.View r5 = r2.getChildAt(r4)
            r6 = r1
        L3c:
            if (r6 >= r0) goto L48
            java.lang.Object r7 = r8.get(r6)
            if (r7 != r5) goto L45
            goto L51
        L45:
            int r6 = r6 + 1
            goto L3c
        L48:
            java.lang.String r6 = r5.getTransitionName()
            if (r6 == 0) goto L51
            r8.add(r5)
        L51:
            int r4 = r4 + 1
            goto L35
        L54:
            int r9 = r9 + 1
            goto L1e
        L57:
            return
    }

    public static void j(android.view.View r4, android.graphics.Rect r5) {
            boolean r0 = r4.isAttachedToWindow()
            if (r0 != 0) goto L7
            return
        L7:
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>()
            int r1 = r4.getWidth()
            float r1 = (float) r1
            int r2 = r4.getHeight()
            float r2 = (float) r2
            r3 = 0
            r0.set(r3, r3, r1, r2)
            android.graphics.Matrix r1 = r4.getMatrix()
            r1.mapRect(r0)
            int r1 = r4.getLeft()
            float r1 = (float) r1
            int r2 = r4.getTop()
            float r2 = (float) r2
            r0.offset(r1, r2)
            android.view.ViewParent r1 = r4.getParent()
        L32:
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L60
            android.view.View r1 = (android.view.View) r1
            int r2 = r1.getScrollX()
            int r2 = -r2
            float r2 = (float) r2
            int r3 = r1.getScrollY()
            int r3 = -r3
            float r3 = (float) r3
            r0.offset(r2, r3)
            android.graphics.Matrix r2 = r1.getMatrix()
            r2.mapRect(r0)
            int r2 = r1.getLeft()
            float r2 = (float) r2
            int r3 = r1.getTop()
            float r3 = (float) r3
            r0.offset(r2, r3)
            android.view.ViewParent r1 = r1.getParent()
            goto L32
        L60:
            r1 = 2
            int[] r1 = new int[r1]
            android.view.View r4 = r4.getRootView()
            r4.getLocationOnScreen(r1)
            r4 = 0
            r4 = r1[r4]
            float r4 = (float) r4
            r2 = 1
            r1 = r1[r2]
            float r1 = (float) r1
            r0.offset(r4, r1)
            float r4 = r0.left
            int r4 = java.lang.Math.round(r4)
            float r1 = r0.top
            int r1 = java.lang.Math.round(r1)
            float r2 = r0.right
            int r2 = java.lang.Math.round(r2)
            float r0 = r0.bottom
            int r0 = java.lang.Math.round(r0)
            r5.set(r4, r1, r2, r0)
            return
    }

    public static boolean k(java.util.List r0) {
            if (r0 == 0) goto Lb
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r0 = 0
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public abstract void a(android.view.View r1, java.lang.Object r2);

    public abstract void b(java.lang.Object r1, java.util.ArrayList r2);

    public void c(java.lang.Object r1) {
            r0 = this;
            return
    }

    public void d(java.lang.Object r1, defpackage.mf r2) {
            r0 = this;
            return
    }

    public abstract void e(android.view.ViewGroup r1, java.lang.Object r2);

    public abstract boolean g(java.lang.Object r1);

    public abstract java.lang.Object h(java.lang.Object r1);

    public java.lang.Object i(android.view.ViewGroup r1, java.lang.Object r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    public abstract boolean l();

    public abstract boolean m(java.lang.Object r1);

    public abstract java.lang.Object n(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3);

    public abstract java.lang.Object o(java.lang.Object r1, java.lang.Object r2);

    public abstract void p(java.lang.Object r1, android.view.View r2, java.util.ArrayList r3);

    public abstract void q(java.lang.Object r1, java.lang.Object r2, java.util.ArrayList r3, java.lang.Object r4, java.util.ArrayList r5);

    public void r(java.lang.Object r1, float r2) {
            r0 = this;
            return
    }

    public abstract void s(android.view.View r1, java.lang.Object r2);

    public abstract void t(java.lang.Object r1, android.graphics.Rect r2);

    public abstract void u(androidx.fragment.app.o r1, java.lang.Object r2, defpackage.uj0 r3, java.lang.Runnable r4);

    public void v(java.lang.Object r1, defpackage.uj0 r2, defpackage.n0 r3, java.lang.Runnable r4) {
            r0 = this;
            kf1 r4 = (defpackage.kf1) r4
            r4.run()
            return
    }

    public abstract void w(java.lang.Object r1, android.view.View r2, java.util.ArrayList r3);

    public abstract void x(java.lang.Object r1, java.util.ArrayList r2, java.util.ArrayList r3);

    public abstract java.lang.Object y(java.lang.Object r1);
}
