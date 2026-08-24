package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m45  reason: default package */
/* loaded from: classes.dex */
public final class m45 extends android.widget.FrameLayout {
    public static final java.lang.Object L = null;
    public final java.util.ArrayList A;
    public defpackage.l45 B;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            defpackage.m45.L = r0
            return
    }

    public m45(android.content.Context r1, java.util.List r2) {
            r0 = this;
            r0.<init>(r1)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.A = r1
            r0.setProtections(r2)
            return
    }

    private defpackage.hx6 getOrInstallSystemBarStateMonitor() {
            r3 = this;
            android.view.View r3 = r3.getRootView()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r0 = 2131427952(0x7f0b0270, float:1.8477535E38)
            java.lang.Object r1 = r3.getTag(r0)
            boolean r2 = r1 instanceof defpackage.hx6
            if (r2 == 0) goto L14
            hx6 r1 = (defpackage.hx6) r1
            return r1
        L14:
            hx6 r1 = new hx6
            r1.<init>(r3)
            r3.setTag(r0, r1)
            return r1
    }

    public final void a() {
            r13 = this;
            java.util.ArrayList r0 = r13.A
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lc
            r13.b()
            return
        Lc:
            hx6 r1 = r13.getOrInstallSystemBarStateMonitor()
            r13.b()
            l45 r2 = new l45
            r2.<init>(r1, r0)
            r13.B = r2
            int r0 = r13.getChildCount()
            l45 r1 = r13.B
            java.util.ArrayList r1 = r1.a
            int r1 = r1.size()
            r2 = 0
            r3 = r2
        L28:
            if (r3 >= r1) goto Lc1
            l45 r4 = r13.B
            java.util.ArrayList r4 = r4.a
            java.lang.Object r4 = r4.get(r3)
            mt0 r4 = (defpackage.mt0) r4
            android.content.Context r5 = r13.getContext()
            int r6 = r3 + r0
            k45 r7 = r4.b
            int r4 = r4.a
            r8 = 1
            r9 = 8
            r10 = -1
            if (r4 == r8) goto L67
            r8 = 2
            if (r4 == r8) goto L62
            r8 = 4
            if (r4 == r8) goto L5b
            if (r4 != r9) goto L51
            int r4 = r7.b
            r8 = 80
            goto L6b
        L51:
            java.lang.String r13 = "Unexpected side: "
            java.lang.String r13 = defpackage.lb1.g(r4, r13)
            defpackage.i.h(r13)
            return
        L5b:
            int r4 = r7.a
            r8 = 5
        L5e:
            r12 = r10
            r10 = r4
            r4 = r12
            goto L6b
        L62:
            int r4 = r7.b
            r8 = 48
            goto L6b
        L67:
            int r4 = r7.a
            r8 = 3
            goto L5e
        L6b:
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            r11.<init>(r10, r4, r8)
            e83 r4 = r7.c
            int r8 = r4.a
            r11.leftMargin = r8
            int r8 = r4.b
            r11.topMargin = r8
            int r8 = r4.c
            r11.rightMargin = r8
            int r4 = r4.d
            r11.bottomMargin = r4
            android.view.View r4 = new android.view.View
            r4.<init>(r5)
            java.lang.Object r5 = defpackage.m45.L
            r4.setTag(r5)
            float r5 = r7.f
            r4.setTranslationX(r5)
            float r5 = r7.g
            r4.setTranslationY(r5)
            float r5 = r7.h
            r4.setAlpha(r5)
            boolean r5 = r7.d
            if (r5 == 0) goto La0
            r9 = r2
        La0:
            r4.setVisibility(r9)
            android.graphics.drawable.ColorDrawable r5 = r7.e
            r4.setBackground(r5)
            ap3 r5 = new ap3
            r8 = 18
            r5.<init>(r8, r11, r4)
            ap3 r8 = r7.i
            if (r8 != 0) goto Lbc
            r7.i = r5
            r13.addView(r4, r6, r11)
            int r3 = r3 + 1
            goto L28
        Lbc:
            java.lang.String r13 = "Trying to overwrite the existing callback. Did you send one protection to multiple ProtectionLayouts?"
            defpackage.i.m(r13)
        Lc1:
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r3, int r4, android.view.ViewGroup.LayoutParams r5) {
            r2 = this;
            if (r3 == 0) goto L20
            java.lang.Object r0 = r3.getTag()
            java.lang.Object r1 = defpackage.m45.L
            if (r0 == r1) goto L20
            l45 r0 = r2.B
            if (r0 == 0) goto L15
            java.util.ArrayList r0 = r0.a
            int r0 = r0.size()
            goto L16
        L15:
            r0 = 0
        L16:
            int r1 = r2.getChildCount()
            int r1 = r1 - r0
            if (r4 > r1) goto L1f
            if (r4 >= 0) goto L20
        L1f:
            r4 = r1
        L20:
            super.addView(r3, r4, r5)
            return
    }

    public final void b() {
            r5 = this;
            l45 r0 = r5.B
            if (r0 == 0) goto L61
            int r0 = r5.getChildCount()
            l45 r1 = r5.B
            java.util.ArrayList r1 = r1.a
            int r1 = r1.size()
            int r0 = r0 - r1
            l45 r1 = r5.B
            java.util.ArrayList r1 = r1.a
            int r1 = r1.size()
            r5.removeViews(r0, r1)
            l45 r0 = r5.B
            java.util.ArrayList r0 = r0.a
            int r0 = r0.size()
            r1 = 0
        L25:
            l45 r2 = r5.B
            r3 = 0
            if (r1 >= r0) goto L39
            java.util.ArrayList r2 = r2.a
            java.lang.Object r2 = r2.get(r1)
            mt0 r2 = (defpackage.mt0) r2
            k45 r2 = r2.b
            r2.i = r3
            int r1 = r1 + 1
            goto L25
        L39:
            java.util.ArrayList r0 = r2.a
            boolean r1 = r2.f
            if (r1 == 0) goto L40
            goto L5f
        L40:
            r1 = 1
            r2.f = r1
            hx6 r4 = r2.b
            java.util.ArrayList r4 = r4.b
            r4.remove(r2)
            int r2 = r0.size()
            int r2 = r2 - r1
        L4f:
            if (r2 < 0) goto L5c
            java.lang.Object r1 = r0.get(r2)
            mt0 r1 = (defpackage.mt0) r1
            r1.e = r3
            int r2 = r2 + (-1)
            goto L4f
        L5c:
            r0.clear()
        L5f:
            r5.B = r3
        L61:
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r0 = this;
            super.onAttachedToWindow()
            r0.a()
            r0.requestApplyInsets()
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
            r5 = this;
            super.onDetachedFromWindow()
            r5.b()
            android.view.View r5 = r5.getRootView()
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r0 = 2131427952(0x7f0b0270, float:1.8477535E38)
            java.lang.Object r1 = r5.getTag(r0)
            boolean r2 = r1 instanceof defpackage.hx6
            if (r2 != 0) goto L18
            goto L22
        L18:
            hx6 r1 = (defpackage.hx6) r1
            java.util.ArrayList r2 = r1.b
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L23
        L22:
            return
        L23:
            fx6 r2 = r1.a
            rk3 r3 = new rk3
            r4 = 14
            r3.<init>(r1, r4)
            r2.post(r3)
            r1 = 0
            r5.setTag(r0, r1)
            return
    }

    public void setProtections(java.util.List<defpackage.mt0> r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.A
            r0.clear()
            r0.addAll(r2)
            boolean r2 = r1.isAttachedToWindow()
            if (r2 == 0) goto L14
            r1.a()
            r1.requestApplyInsets()
        L14:
            return
    }
}
