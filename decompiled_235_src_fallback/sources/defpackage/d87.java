package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d87  reason: default package */
/* loaded from: classes.dex */
public final class d87 implements defpackage.b54 {
    public defpackage.i44 A;
    public defpackage.o44 B;
    public final /* synthetic */ androidx.appcompat.widget.Toolbar L;

    public d87(androidx.appcompat.widget.Toolbar r1) {
            r0 = this;
            r0.<init>()
            r0.L = r1
            return
    }

    @Override // defpackage.b54
    public final boolean b(defpackage.it6 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.b54
    public final boolean c() {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // defpackage.b54
    public final void d(defpackage.i44 r1, boolean r2) {
            r0 = this;
            return
    }

    @Override // defpackage.b54
    public final boolean f(defpackage.o44 r7) {
            r6 = this;
            androidx.appcompat.widget.Toolbar r0 = r6.L
            android.view.View r1 = r0.h0
            boolean r2 = r1 instanceof defpackage.zs0
            if (r2 == 0) goto Ld
            zs0 r1 = (defpackage.zs0) r1
            r1.onActionViewCollapsed()
        Ld:
            android.view.View r1 = r0.h0
            r0.removeView(r1)
            mr r1 = r0.g0
            r0.removeView(r1)
            r1 = 0
            r0.h0 = r1
            java.util.ArrayList r2 = r0.D0
            int r3 = r2.size()
            r4 = 1
            int r3 = r3 - r4
        L22:
            if (r3 < 0) goto L30
            java.lang.Object r5 = r2.get(r3)
            android.view.View r5 = (android.view.View) r5
            r0.addView(r5)
            int r3 = r3 + (-1)
            goto L22
        L30:
            r2.clear()
            r6.B = r1
            r0.requestLayout()
            r6 = 0
            r7.C = r6
            i44 r7 = r7.n
            r7.p(r6)
            r0.x()
            return r4
    }

    @Override // defpackage.b54
    public final boolean h(defpackage.o44 r6) {
            r5 = this;
            androidx.appcompat.widget.Toolbar r0 = r5.L
            r0.c()
            mr r1 = r0.g0
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == r0) goto L1d
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L18
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            mr r2 = r0.g0
            r1.removeView(r2)
        L18:
            mr r1 = r0.g0
            r0.addView(r1)
        L1d:
            android.view.View r1 = r6.getActionView()
            r0.h0 = r1
            r5.B = r6
            android.view.ViewParent r5 = r1.getParent()
            r1 = 2
            if (r5 == r0) goto L51
            boolean r2 = r5 instanceof android.view.ViewGroup
            if (r2 == 0) goto L37
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            android.view.View r2 = r0.h0
            r5.removeView(r2)
        L37:
            e87 r5 = androidx.appcompat.widget.Toolbar.h()
            int r2 = r0.m0
            r2 = r2 & 112(0x70, float:1.57E-43)
            r3 = 8388611(0x800003, float:1.1754948E-38)
            r2 = r2 | r3
            r5.a = r2
            r5.b = r1
            android.view.View r2 = r0.h0
            r2.setLayoutParams(r5)
            android.view.View r5 = r0.h0
            r0.addView(r5)
        L51:
            int r5 = r0.getChildCount()
            r2 = 1
            int r5 = r5 - r2
        L57:
            if (r5 < 0) goto L76
            android.view.View r3 = r0.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r4 = r3.getLayoutParams()
            e87 r4 = (defpackage.e87) r4
            int r4 = r4.b
            if (r4 == r1) goto L73
            androidx.appcompat.widget.ActionMenuView r4 = r0.A
            if (r3 == r4) goto L73
            r0.removeViewAt(r5)
            java.util.ArrayList r4 = r0.D0
            r4.add(r3)
        L73:
            int r5 = r5 + (-1)
            goto L57
        L76:
            r0.requestLayout()
            r6.C = r2
            i44 r5 = r6.n
            r6 = 0
            r5.p(r6)
            android.view.View r5 = r0.h0
            boolean r6 = r5 instanceof defpackage.zs0
            if (r6 == 0) goto L8c
            zs0 r5 = (defpackage.zs0) r5
            r5.onActionViewExpanded()
        L8c:
            r0.x()
            return r2
    }

    @Override // defpackage.b54
    public final void i() {
            r4 = this;
            o44 r0 = r4.B
            if (r0 == 0) goto L24
            i44 r0 = r4.A
            if (r0 == 0) goto L1f
            java.util.ArrayList r0 = r0.f
            int r0 = r0.size()
            r1 = 0
        Lf:
            if (r1 >= r0) goto L1f
            i44 r2 = r4.A
            android.view.MenuItem r2 = r2.getItem(r1)
            o44 r3 = r4.B
            if (r2 != r3) goto L1c
            goto L24
        L1c:
            int r1 = r1 + 1
            goto Lf
        L1f:
            o44 r0 = r4.B
            r4.f(r0)
        L24:
            return
    }

    @Override // defpackage.b54
    public final void k(android.content.Context r2, defpackage.i44 r3) {
            r1 = this;
            i44 r2 = r1.A
            if (r2 == 0) goto Lb
            o44 r0 = r1.B
            if (r0 == 0) goto Lb
            r2.d(r0)
        Lb:
            r1.A = r3
            return
    }
}
