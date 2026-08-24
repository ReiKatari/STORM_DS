package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wt7  reason: default package */
/* loaded from: classes.dex */
public final class wt7 extends defpackage.zt7 {
    public static final android.view.animation.PathInterpolator e = null;
    public static final defpackage.q92 f = null;
    public static final android.view.animation.DecelerateInterpolator g = null;
    public static final android.view.animation.AccelerateInterpolator h = null;

    static {
            android.view.animation.PathInterpolator r0 = new android.view.animation.PathInterpolator
            r1 = 1066192077(0x3f8ccccd, float:1.1)
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            r0.<init>(r3, r1, r3, r2)
            defpackage.wt7.e = r0
            q92 r0 = new q92
            r1 = 0
            r0.<init>(r1)
            defpackage.wt7.f = r0
            android.view.animation.DecelerateInterpolator r0 = new android.view.animation.DecelerateInterpolator
            r1 = 1069547520(0x3fc00000, float:1.5)
            r0.<init>(r1)
            defpackage.wt7.g = r0
            android.view.animation.AccelerateInterpolator r0 = new android.view.animation.AccelerateInterpolator
            r0.<init>(r1)
            defpackage.wt7.h = r0
            return
    }

    public static void f(defpackage.au7 r2, android.view.View r3) {
            f55 r0 = k(r3)
            if (r0 == 0) goto Le
            r0.i0(r2)
            int r0 = r0.A
            if (r0 != 0) goto Le
            goto L25
        Le:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L25
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r0 = 0
        L15:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L25
            android.view.View r1 = r3.getChildAt(r0)
            f(r2, r1)
            int r0 = r0 + 1
            goto L15
        L25:
            return
    }

    public static void g(android.view.View r2, defpackage.au7 r3, defpackage.vu7 r4, boolean r5) {
            f55 r0 = k(r2)
            r1 = 0
            if (r0 == 0) goto L15
            r0.B = r4
            if (r5 != 0) goto L15
            r0.j0(r3)
            int r5 = r0.A
            if (r5 != 0) goto L14
            r5 = 1
            goto L15
        L14:
            r5 = r1
        L15:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L2b
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
        L1b:
            int r0 = r2.getChildCount()
            if (r1 >= r0) goto L2b
            android.view.View r0 = r2.getChildAt(r1)
            g(r0, r3, r4, r5)
            int r1 = r1 + 1
            goto L1b
        L2b:
            return
    }

    public static void h(android.view.View r2, defpackage.vu7 r3, java.util.List r4) {
            f55 r0 = k(r2)
            if (r0 == 0) goto Lf
            vu7 r3 = r0.k0(r3, r4)
            int r0 = r0.A
            if (r0 != 0) goto Lf
            goto L26
        Lf:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L26
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0 = 0
        L16:
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto L26
            android.view.View r1 = r2.getChildAt(r0)
            h(r1, r3, r4)
            int r0 = r0 + 1
            goto L16
        L26:
            return
    }

    public static void i(android.view.View r2, defpackage.au7 r3, defpackage.rr6 r4) {
            f55 r0 = k(r2)
            if (r0 == 0) goto Le
            r0.l0(r3, r4)
            int r0 = r0.A
            if (r0 != 0) goto Le
            goto L25
        Le:
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L25
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r0 = 0
        L15:
            int r1 = r2.getChildCount()
            if (r0 >= r1) goto L25
            android.view.View r1 = r2.getChildAt(r0)
            i(r1, r3, r4)
            int r0 = r0 + 1
            goto L15
        L25:
            return
    }

    public static android.view.WindowInsets j(android.view.View r1, android.view.WindowInsets r2) {
            r0 = 2131427947(0x7f0b026b, float:1.8477525E38)
            java.lang.Object r0 = r1.getTag(r0)
            if (r0 == 0) goto La
            return r2
        La:
            android.view.WindowInsets r1 = r1.onApplyWindowInsets(r2)
            return r1
    }

    public static defpackage.f55 k(android.view.View r1) {
            r0 = 2131427956(0x7f0b0274, float:1.8477543E38)
            java.lang.Object r1 = r1.getTag(r0)
            boolean r0 = r1 instanceof defpackage.vt7
            if (r0 == 0) goto L10
            vt7 r1 = (defpackage.vt7) r1
            f55 r1 = r1.a
            return r1
        L10:
            r1 = 0
            return r1
    }
}
