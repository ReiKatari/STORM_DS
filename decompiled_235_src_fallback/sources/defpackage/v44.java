package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v44  reason: default package */
/* loaded from: classes.dex */
public class v44 {
    public final android.content.Context a;
    public final defpackage.i44 b;
    public final boolean c;
    public final int d;
    public android.view.View e;
    public int f;
    public boolean g;
    public defpackage.a54 h;
    public defpackage.t44 i;
    public android.widget.PopupWindow.OnDismissListener j;
    public final defpackage.u44 k;

    public v44(android.content.Context r1, defpackage.i44 r2, android.view.View r3, boolean r4, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r6 = 8388611(0x800003, float:1.1754948E-38)
            r0.f = r6
            u44 r6 = new u44
            r6.<init>(r0)
            r0.k = r6
            r0.a = r1
            r0.b = r2
            r0.e = r3
            r0.c = r4
            r0.d = r5
            return
    }

    public final defpackage.t44 a() {
            r8 = this;
            t44 r0 = r8.i
            if (r0 != 0) goto L6b
            java.lang.String r0 = "window"
            android.content.Context r1 = r8.a
            java.lang.Object r0 = r1.getSystemService(r0)
            android.view.WindowManager r0 = (android.view.WindowManager) r0
            android.view.Display r0 = r0.getDefaultDisplay()
            android.graphics.Point r2 = new android.graphics.Point
            r2.<init>()
            r0.getRealSize(r2)
            int r0 = r2.x
            int r2 = r2.y
            int r0 = java.lang.Math.min(r0, r2)
            android.content.res.Resources r1 = r1.getResources()
            r2 = 2131165206(0x7f070016, float:1.7944623E38)
            int r1 = r1.getDimensionPixelSize(r2)
            android.content.Context r3 = r8.a
            if (r0 < r1) goto L3d
            gl0 r0 = new gl0
            android.view.View r1 = r8.e
            int r2 = r8.d
            boolean r4 = r8.c
            r0.<init>(r3, r1, r2, r4)
            goto L4b
        L3d:
            ep6 r2 = new ep6
            android.view.View r5 = r8.e
            int r6 = r8.d
            boolean r7 = r8.c
            i44 r4 = r8.b
            r2.<init>(r3, r4, r5, r6, r7)
            r0 = r2
        L4b:
            i44 r1 = r8.b
            r0.l(r1)
            u44 r1 = r8.k
            r0.r(r1)
            android.view.View r1 = r8.e
            r0.n(r1)
            a54 r1 = r8.h
            r0.g(r1)
            boolean r1 = r8.g
            r0.o(r1)
            int r1 = r8.f
            r0.p(r1)
            r8.i = r0
        L6b:
            t44 r8 = r8.i
            return r8
    }

    public final boolean b() {
            r0 = this;
            t44 r0 = r0.i
            if (r0 == 0) goto Lc
            boolean r0 = r0.a()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public void c() {
            r1 = this;
            r0 = 0
            r1.i = r0
            android.widget.PopupWindow$OnDismissListener r1 = r1.j
            if (r1 == 0) goto La
            r1.onDismiss()
        La:
            return
    }

    public final void d(int r3, int r4, boolean r5, boolean r6) {
            r2 = this;
            t44 r0 = r2.a()
            r0.s(r6)
            if (r5 == 0) goto L47
            int r5 = r2.f
            android.view.View r6 = r2.e
            int r6 = r6.getLayoutDirection()
            int r5 = android.view.Gravity.getAbsoluteGravity(r5, r6)
            r5 = r5 & 7
            r6 = 5
            if (r5 != r6) goto L21
            android.view.View r5 = r2.e
            int r5 = r5.getWidth()
            int r3 = r3 - r5
        L21:
            r0.q(r3)
            r0.t(r4)
            android.content.Context r2 = r2.a
            android.content.res.Resources r2 = r2.getResources()
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            float r2 = r2.density
            r5 = 1111490560(0x42400000, float:48.0)
            float r2 = r2 * r5
            r5 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r5
            int r2 = (int) r2
            android.graphics.Rect r5 = new android.graphics.Rect
            int r6 = r3 - r2
            int r1 = r4 - r2
            int r3 = r3 + r2
            int r4 = r4 + r2
            r5.<init>(r6, r1, r3, r4)
            r0.A = r5
        L47:
            r0.e()
            return
    }
}
