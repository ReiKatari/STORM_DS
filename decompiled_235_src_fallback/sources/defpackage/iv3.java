package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iv3  reason: default package */
/* loaded from: classes.dex */
public class iv3 {
    public int a;
    public androidx.recyclerview.widget.RecyclerView b;
    public defpackage.gg5 c;
    public boolean d;
    public boolean e;
    public android.view.View f;
    public final defpackage.qg5 g;
    public boolean h;
    public final android.view.animation.LinearInterpolator i;
    public final android.view.animation.DecelerateInterpolator j;
    public android.graphics.PointF k;
    public final android.util.DisplayMetrics l;
    public boolean m;
    public float n;
    public int o;
    public int p;

    public iv3(android.content.Context r4) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.a = r0
            qg5 r1 = new qg5
            r1.<init>()
            r1.d = r0
            r0 = 0
            r1.f = r0
            r1.g = r0
            r1.a = r0
            r1.b = r0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.c = r2
            r2 = 0
            r1.e = r2
            r3.g = r1
            android.view.animation.LinearInterpolator r1 = new android.view.animation.LinearInterpolator
            r1.<init>()
            r3.i = r1
            android.view.animation.DecelerateInterpolator r1 = new android.view.animation.DecelerateInterpolator
            r1.<init>()
            r3.j = r1
            r3.m = r0
            r3.o = r0
            r3.p = r0
            android.content.res.Resources r4 = r4.getResources()
            android.util.DisplayMetrics r4 = r4.getDisplayMetrics()
            r3.l = r4
            return
    }

    public static int a(int r1, int r2, int r3, int r4, int r5) {
            r0 = -1
            if (r5 == r0) goto L1b
            if (r5 == 0) goto L11
            r1 = 1
            if (r5 != r1) goto La
            int r4 = r4 - r2
            return r4
        La:
            java.lang.String r1 = "snap preference should be one of the constants defined in SmoothScroller, starting with SNAP_"
            defpackage.i.h(r1)
            r1 = 0
            return r1
        L11:
            int r3 = r3 - r1
            if (r3 <= 0) goto L15
            return r3
        L15:
            int r4 = r4 - r2
            if (r4 >= 0) goto L19
            return r4
        L19:
            r1 = 0
            return r1
        L1b:
            int r3 = r3 - r1
            return r3
    }

    public int b(android.view.View r4, int r5) {
            r3 = this;
            gg5 r3 = r3.c
            if (r3 == 0) goto L45
            boolean r0 = r3.d()
            if (r0 != 0) goto Lb
            goto L45
        Lb:
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            hg5 r0 = (defpackage.hg5) r0
            int r1 = r4.getLeft()
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            hg5 r2 = (defpackage.hg5) r2
            android.graphics.Rect r2 = r2.b
            int r2 = r2.left
            int r1 = r1 - r2
            int r2 = r0.leftMargin
            int r1 = r1 - r2
            int r2 = r4.getRight()
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            hg5 r4 = (defpackage.hg5) r4
            android.graphics.Rect r4 = r4.b
            int r4 = r4.right
            int r2 = r2 + r4
            int r4 = r0.rightMargin
            int r2 = r2 + r4
            int r4 = r3.D()
            int r0 = r3.n
            int r3 = r3.E()
            int r0 = r0 - r3
            int r3 = a(r1, r2, r4, r0, r5)
            return r3
        L45:
            r3 = 0
            return r3
    }

    public int c(android.view.View r4, int r5) {
            r3 = this;
            gg5 r3 = r3.c
            if (r3 == 0) goto L45
            boolean r0 = r3.e()
            if (r0 != 0) goto Lb
            goto L45
        Lb:
            android.view.ViewGroup$LayoutParams r0 = r4.getLayoutParams()
            hg5 r0 = (defpackage.hg5) r0
            int r1 = r4.getTop()
            android.view.ViewGroup$LayoutParams r2 = r4.getLayoutParams()
            hg5 r2 = (defpackage.hg5) r2
            android.graphics.Rect r2 = r2.b
            int r2 = r2.top
            int r1 = r1 - r2
            int r2 = r0.topMargin
            int r1 = r1 - r2
            int r2 = r4.getBottom()
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            hg5 r4 = (defpackage.hg5) r4
            android.graphics.Rect r4 = r4.b
            int r4 = r4.bottom
            int r2 = r2 + r4
            int r4 = r0.bottomMargin
            int r2 = r2 + r4
            int r4 = r3.F()
            int r0 = r3.o
            int r3 = r3.C()
            int r0 = r0 - r3
            int r3 = a(r1, r2, r4, r0, r5)
            return r3
        L45:
            r3 = 0
            return r3
    }

    public float d(android.util.DisplayMetrics r1) {
            r0 = this;
            int r0 = r1.densityDpi
            float r0 = (float) r0
            r1 = 1103626240(0x41c80000, float:25.0)
            float r1 = r1 / r0
            return r1
    }

    public int e(int r2) {
            r1 = this;
            int r2 = java.lang.Math.abs(r2)
            float r2 = (float) r2
            boolean r0 = r1.m
            if (r0 != 0) goto L14
            android.util.DisplayMetrics r0 = r1.l
            float r0 = r1.d(r0)
            r1.n = r0
            r0 = 1
            r1.m = r0
        L14:
            float r1 = r1.n
            float r2 = r2 * r1
            double r1 = (double) r2
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            return r1
    }

    public android.graphics.PointF f(int r2) {
            r1 = this;
            gg5 r1 = r1.c
            boolean r0 = r1 instanceof defpackage.rg5
            if (r0 == 0) goto Ld
            rg5 r1 = (defpackage.rg5) r1
            android.graphics.PointF r1 = r1.a(r2)
            return r1
        Ld:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "You should override computeScrollVectorForPosition when the LayoutManager does not implement "
            r1.<init>(r2)
            java.lang.Class<rg5> r2 = defpackage.rg5.class
            java.lang.String r2 = r2.getCanonicalName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "RecyclerView"
            android.util.Log.w(r2, r1)
            r1 = 0
            return r1
    }

    public final void g(int r9, int r10) {
            r8 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r8.b
            int r1 = r8.a
            r2 = -1
            if (r1 == r2) goto L9
            if (r0 != 0) goto Lc
        L9:
            r8.i()
        Lc:
            boolean r1 = r8.d
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L3d
            android.view.View r1 = r8.f
            if (r1 != 0) goto L3d
            gg5 r1 = r8.c
            if (r1 == 0) goto L3d
            int r1 = r8.a
            android.graphics.PointF r1 = r8.f(r1)
            if (r1 == 0) goto L3d
            float r5 = r1.x
            int r6 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r6 != 0) goto L2e
            float r6 = r1.y
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L3d
        L2e:
            float r5 = java.lang.Math.signum(r5)
            int r5 = (int) r5
            float r1 = r1.y
            float r1 = java.lang.Math.signum(r1)
            int r1 = (int) r1
            r0.g0(r5, r1, r3)
        L3d:
            r1 = 0
            r8.d = r1
            android.view.View r5 = r8.f
            qg5 r6 = r8.g
            if (r5 == 0) goto L70
            androidx.recyclerview.widget.RecyclerView r7 = r8.b
            r7.getClass()
            wg5 r5 = androidx.recyclerview.widget.RecyclerView.N(r5)
            if (r5 == 0) goto L55
            int r2 = r5.b()
        L55:
            int r5 = r8.a
            if (r2 != r5) goto L67
            android.view.View r2 = r8.f
            sg5 r3 = r0.d1
            r8.h(r2, r6)
            r6.a(r0)
            r8.i()
            goto L70
        L67:
            java.lang.String r2 = "RecyclerView"
            java.lang.String r5 = "Passed over target position while smooth scrolling."
            android.util.Log.e(r2, r5)
            r8.f = r3
        L70:
            boolean r2 = r8.e
            if (r2 == 0) goto L114
            sg5 r2 = r0.d1
            androidx.recyclerview.widget.RecyclerView r2 = r8.b
            gg5 r2 = r2.m0
            int r2 = r2.v()
            r3 = 1
            if (r2 != 0) goto L86
            r8.i()
            goto Lff
        L86:
            int r2 = r8.o
            int r9 = r2 - r9
            int r2 = r2 * r9
            if (r2 > 0) goto L8e
            r9 = r1
        L8e:
            r8.o = r9
            int r2 = r8.p
            int r10 = r2 - r10
            int r2 = r2 * r10
            if (r2 > 0) goto L98
            r10 = r1
        L98:
            r8.p = r10
            if (r9 != 0) goto Lff
            if (r10 != 0) goto Lff
            int r9 = r8.a
            android.graphics.PointF r9 = r8.f(r9)
            if (r9 == 0) goto Lf8
            float r10 = r9.x
            int r2 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r2 != 0) goto Lb3
            float r2 = r9.y
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto Lb3
            goto Lf8
        Lb3:
            float r10 = r10 * r10
            float r2 = r9.y
            float r2 = r2 * r2
            float r2 = r2 + r10
            double r4 = (double) r2
            double r4 = java.lang.Math.sqrt(r4)
            float r10 = (float) r4
            float r2 = r9.x
            float r2 = r2 / r10
            r9.x = r2
            float r4 = r9.y
            float r4 = r4 / r10
            r9.y = r4
            r8.k = r9
            r9 = 1176256512(0x461c4000, float:10000.0)
            float r2 = r2 * r9
            int r10 = (int) r2
            r8.o = r10
            float r4 = r4 * r9
            int r9 = (int) r4
            r8.p = r9
            r9 = 10000(0x2710, float:1.4013E-41)
            int r9 = r8.e(r9)
            int r10 = r8.o
            float r10 = (float) r10
            r2 = 1067030938(0x3f99999a, float:1.2)
            float r10 = r10 * r2
            int r10 = (int) r10
            int r4 = r8.p
            float r4 = (float) r4
            float r4 = r4 * r2
            int r4 = (int) r4
            float r9 = (float) r9
            float r9 = r9 * r2
            int r9 = (int) r9
            r6.a = r10
            r6.b = r4
            r6.c = r9
            android.view.animation.LinearInterpolator r9 = r8.i
            r6.e = r9
            r6.f = r3
            goto Lff
        Lf8:
            int r9 = r8.a
            r6.d = r9
            r8.i()
        Lff:
            int r9 = r6.d
            if (r9 < 0) goto L104
            r1 = r3
        L104:
            r6.a(r0)
            if (r1 == 0) goto L114
            boolean r9 = r8.e
            if (r9 == 0) goto L114
            r8.d = r3
            vg5 r8 = r0.a1
            r8.b()
        L114:
            return
    }

    public void h(android.view.View r7, defpackage.qg5 r8) {
            r6 = this;
            android.graphics.PointF r0 = r6.k
            r1 = 0
            r2 = -1
            r3 = 1
            r4 = 0
            if (r0 == 0) goto L15
            float r0 = r0.x
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r0 != 0) goto Lf
            goto L15
        Lf:
            if (r0 <= 0) goto L13
            r0 = r3
            goto L16
        L13:
            r0 = r2
            goto L16
        L15:
            r0 = r1
        L16:
            int r0 = r6.b(r7, r0)
            android.graphics.PointF r5 = r6.k
            if (r5 == 0) goto L2a
            float r5 = r5.y
            int r4 = (r5 > r4 ? 1 : (r5 == r4 ? 0 : -1))
            if (r4 != 0) goto L25
            goto L2a
        L25:
            if (r4 <= 0) goto L29
            r1 = r3
            goto L2a
        L29:
            r1 = r2
        L2a:
            int r7 = r6.c(r7, r1)
            int r1 = r0 * r0
            int r2 = r7 * r7
            int r2 = r2 + r1
            double r1 = (double) r2
            double r1 = java.lang.Math.sqrt(r1)
            int r1 = (int) r1
            int r1 = r6.e(r1)
            double r1 = (double) r1
            r4 = 4599717252057688074(0x3fd57a786c22680a, double:0.3356)
            double r1 = r1 / r4
            double r1 = java.lang.Math.ceil(r1)
            int r1 = (int) r1
            if (r1 <= 0) goto L59
            int r0 = -r0
            int r7 = -r7
            r8.a = r0
            r8.b = r7
            r8.c = r1
            android.view.animation.DecelerateInterpolator r6 = r6.j
            r8.e = r6
            r8.f = r3
        L59:
            return
    }

    public final void i() {
            r4 = this;
            boolean r0 = r4.e
            if (r0 != 0) goto L5
            return
        L5:
            r0 = 0
            r4.e = r0
            r4.p = r0
            r4.o = r0
            r1 = 0
            r4.k = r1
            androidx.recyclerview.widget.RecyclerView r2 = r4.b
            sg5 r2 = r2.d1
            r3 = -1
            r2.a = r3
            r4.f = r1
            r4.a = r3
            r4.d = r0
            gg5 r0 = r4.c
            iv3 r2 = r0.e
            if (r2 != r4) goto L24
            r0.e = r1
        L24:
            r4.c = r1
            r4.b = r1
            return
    }
}
