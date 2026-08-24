package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: id5  reason: default package */
/* loaded from: classes.dex */
public abstract class id5 extends androidx.constraintlayout.widget.ConstraintLayout {
    public final defpackage.rk3 p0;
    public int q0;
    public final defpackage.p24 r0;

    public id5(android.content.Context r5, android.util.AttributeSet r6) {
            r4 = this;
            r0 = 2130969464(0x7f040378, float:1.754761E38)
            r4.<init>(r5, r6, r0)
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r5)
            r2 = 2131624025(0x7f0e0059, float:1.8875218E38)
            r1.inflate(r2, r4)
            p24 r1 = new p24
            r1.<init>()
            r4.r0 = r1
            ei5 r2 = new ei5
            r3 = 1056964608(0x3f000000, float:0.5)
            r2.<init>(r3)
            n24 r3 = r1.B
            me6 r3 = r3.a
            le6 r3 = r3.f()
            r3.e = r2
            r3.f = r2
            r3.g = r2
            r3.h = r2
            me6 r2 = r3.a()
            r1.setShapeAppearanceModel(r2)
            p24 r1 = r4.r0
            r2 = -1
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
            r1.n(r2)
            p24 r1 = r4.r0
            r4.setBackground(r1)
            int[] r1 = defpackage.a75.w
            r2 = 0
            android.content.res.TypedArray r5 = r5.obtainStyledAttributes(r6, r1, r0, r2)
            int r6 = r5.getDimensionPixelSize(r2, r2)
            r4.q0 = r6
            rk3 r6 = new rk3
            r0 = 8
            r6.<init>(r4, r0)
            r4.p0 = r6
            r5.recycle()
            return
    }

    @Override // android.view.ViewGroup
    public final void addView(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
            r0 = this;
            super.addView(r1, r2, r3)
            int r2 = r1.getId()
            r3 = -1
            if (r2 != r3) goto L11
            int r2 = android.view.View.generateViewId()
            r1.setId(r2)
        L11:
            android.os.Handler r1 = r0.getHandler()
            if (r1 == 0) goto L1f
            rk3 r0 = r0.p0
            r1.removeCallbacks(r0)
            r1.post(r0)
        L1f:
            return
    }

    public abstract void o();

    @Override // android.view.View
    public final void onFinishInflate() {
            r0 = this;
            super.onFinishInflate()
            r0.o()
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup
    public final void onViewRemoved(android.view.View r1) {
            r0 = this;
            super.onViewRemoved(r1)
            android.os.Handler r1 = r0.getHandler()
            if (r1 == 0) goto L11
            rk3 r0 = r0.p0
            r1.removeCallbacks(r0)
            r1.post(r0)
        L11:
            return
    }

    @Override // android.view.View
    public final void setBackgroundColor(int r1) {
            r0 = this;
            p24 r0 = r0.r0
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.n(r1)
            return
    }
}
