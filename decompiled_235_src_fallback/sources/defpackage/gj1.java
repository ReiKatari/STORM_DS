package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gj1  reason: default package */
/* loaded from: classes.dex */
public final class gj1 extends defpackage.p0 implements defpackage.zk4 {
    public final android.view.Window i0;
    public final defpackage.vs4 j0;
    public boolean k0;
    public boolean l0;
    public boolean m0;
    public boolean n0;

    public gj1(android.content.Context r2, android.view.Window r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            r1.i0 = r3
            zv0 r2 = defpackage.aw0.a
            vs4 r2 = defpackage.np2.Y(r2)
            r1.j0 = r2
            java.util.WeakHashMap r2 = defpackage.ao7.a
            defpackage.sn7.c(r1, r1)
            fj1 r2 = new fj1
            r2.<init>(r1)
            defpackage.ao7.p(r1, r2)
            return
    }

    @Override // defpackage.zk4
    public final defpackage.vu7 U(android.view.View r6, defpackage.vu7 r7) {
            r5 = this;
            boolean r6 = r5.l0
            if (r6 == 0) goto L5
            goto L3c
        L5:
            r6 = 0
            android.view.View r0 = r5.getChildAt(r6)
            int r1 = r0.getLeft()
            int r1 = java.lang.Math.max(r6, r1)
            int r2 = r0.getTop()
            int r2 = java.lang.Math.max(r6, r2)
            int r3 = r5.getWidth()
            int r4 = r0.getRight()
            int r3 = r3 - r4
            int r3 = java.lang.Math.max(r6, r3)
            int r5 = r5.getHeight()
            int r0 = r0.getBottom()
            int r5 = r5 - r0
            int r5 = java.lang.Math.max(r6, r5)
            if (r1 != 0) goto L3d
            if (r2 != 0) goto L3d
            if (r3 != 0) goto L3d
            if (r5 != 0) goto L3d
        L3c:
            return r7
        L3d:
            ru7 r6 = r7.a
            vu7 r5 = r6.q(r1, r2, r3, r5)
            return r5
    }

    @Override // defpackage.p0
    public final void a(defpackage.px0 r6, int r7) {
            r5 = this;
            xq2 r6 = (defpackage.xq2) r6
            r0 = 1735448596(0x6770d814, float:1.1373539E24)
            r6.d0(r0)
            boolean r0 = r6.h(r5)
            r1 = 2
            if (r0 == 0) goto L11
            r0 = 4
            goto L12
        L11:
            r0 = r1
        L12:
            r0 = r0 | r7
            r2 = r0 & 3
            r3 = 0
            r4 = 1
            if (r2 == r1) goto L1b
            r1 = r4
            goto L1c
        L1b:
            r1 = r3
        L1c:
            r0 = r0 & r4
            boolean r0 = r6.S(r0, r1)
            if (r0 == 0) goto L33
            vs4 r0 = r5.j0
            java.lang.Object r0 = r0.getValue()
            eo2 r0 = (defpackage.eo2) r0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            r0.o(r6, r1)
            goto L36
        L33:
            r6.V()
        L36:
            cf5 r6 = r6.t()
            if (r6 == 0) goto L44
            o0 r0 = new o0
            r1 = 5
            r0.<init>(r5, r7, r1)
            r6.d = r0
        L44:
            return
    }

    @Override // defpackage.p0
    public final void g(boolean r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            r4 = 0
            android.view.View r4 = r3.getChildAt(r4)
            if (r4 != 0) goto L8
            return
        L8:
            int r0 = r3.getPaddingLeft()
            int r1 = r3.getPaddingRight()
            int r1 = r1 + r0
            int r0 = r3.getPaddingTop()
            int r2 = r3.getPaddingBottom()
            int r2 = r2 + r0
            int r7 = r7 - r5
            int r8 = r8 - r6
            int r5 = r4.getMeasuredWidth()
            int r6 = r4.getMeasuredHeight()
            int r7 = r7 - r5
            int r7 = r7 - r1
            int r8 = r8 - r6
            int r8 = r8 - r2
            int r0 = r3.getPaddingLeft()
            int r7 = r7 / 2
            int r7 = r7 + r0
            int r3 = r3.getPaddingTop()
            int r8 = r8 / 2
            int r8 = r8 + r3
            int r5 = r5 + r7
            int r6 = r6 + r8
            r4.layout(r7, r8, r5, r6)
            return
    }

    @Override // defpackage.p0
    public final boolean getShouldCreateCompositionOnAttachedToWindow() {
            r0 = this;
            boolean r0 = r0.n0
            return r0
    }

    @Override // defpackage.p0
    public final void h(int r13, int r14) {
            r12 = this;
            r0 = 0
            android.view.View r1 = r12.getChildAt(r0)
            if (r1 != 0) goto Lb
            super.h(r13, r14)
            return
        Lb:
            int r2 = android.view.View.MeasureSpec.getSize(r13)
            int r3 = android.view.View.MeasureSpec.getSize(r14)
            int r4 = android.view.View.MeasureSpec.getMode(r14)
            r5 = -2
            android.view.Window r6 = r12.i0
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 != r7) goto L49
            boolean r8 = r12.k0
            if (r8 != 0) goto L49
            android.view.WindowManager$LayoutParams r8 = r6.getAttributes()
            int r8 = r8.height
            if (r8 != r5) goto L49
            boolean r8 = r12.l0
            if (r8 == 0) goto L46
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 30
            if (r8 >= r9) goto L3b
            lp r8 = defpackage.lp.a
            int r8 = r8.a(r6)
            goto L4a
        L3b:
            r9 = 32
            if (r8 >= r9) goto L49
            sp r8 = defpackage.sp.a
            int r8 = r8.a(r6)
            goto L4a
        L46:
            int r8 = r3 + 1
            goto L4a
        L49:
            r8 = r3
        L4a:
            int r9 = r12.getPaddingLeft()
            int r10 = r12.getPaddingRight()
            int r10 = r10 + r9
            int r9 = r12.getPaddingTop()
            int r11 = r12.getPaddingBottom()
            int r11 = r11 + r9
            int r9 = r2 - r10
            if (r9 >= 0) goto L61
            r9 = r0
        L61:
            int r8 = r8 - r11
            if (r8 >= 0) goto L65
            goto L66
        L65:
            r0 = r8
        L66:
            int r8 = android.view.View.MeasureSpec.getMode(r13)
            if (r8 != 0) goto L6d
            goto L71
        L6d:
            int r13 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r7)
        L71:
            if (r4 != 0) goto L74
            goto L78
        L74:
            int r14 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r7)
        L78:
            r1.measure(r13, r14)
            r13 = 1073741824(0x40000000, float:2.0)
            if (r8 == r7) goto L88
            if (r8 == r13) goto L91
            int r14 = r1.getMeasuredWidth()
            int r2 = r14 + r10
            goto L91
        L88:
            int r14 = r1.getMeasuredWidth()
            int r14 = r14 + r10
            int r2 = java.lang.Math.min(r2, r14)
        L91:
            if (r4 == r7) goto L9d
            if (r4 == r13) goto L9b
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            goto La6
        L9b:
            r13 = r3
            goto La6
        L9d:
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            int r13 = java.lang.Math.min(r3, r13)
        La6:
            r12.setMeasuredDimension(r2, r13)
            boolean r13 = r12.l0
            if (r13 != 0) goto Lc7
            int r13 = r1.getMeasuredHeight()
            int r13 = r13 + r11
            if (r13 <= r3) goto Lc7
            android.view.WindowManager$LayoutParams r13 = r6.getAttributes()
            int r13 = r13.height
            if (r13 != r5) goto Lc7
            r6.addFlags(r7)
            boolean r12 = r12.k0
            if (r12 != 0) goto Lc7
            r12 = -1
            r6.setLayout(r12, r12)
        Lc7:
            return
    }
}
