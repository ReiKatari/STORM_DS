package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qq7  reason: default package */
/* loaded from: classes.dex */
public abstract class qq7 extends defpackage.l11 {
    public boolean g0;
    public boolean h0;

    @Override // defpackage.l11
    public final void e(androidx.constraintlayout.widget.ConstraintLayout r1) {
            r0 = this;
            r0.d(r1)
            return
    }

    @Override // defpackage.l11
    public void h(android.util.AttributeSet r6) {
            r5 = this;
            super.h(r6)
            if (r6 == 0) goto L2d
            android.content.Context r0 = r5.getContext()
            int[] r1 = defpackage.e75.b
            android.content.res.TypedArray r6 = r0.obtainStyledAttributes(r6, r1)
            int r0 = r6.getIndexCount()
            r1 = 0
        L14:
            if (r1 >= r0) goto L2a
            int r2 = r6.getIndex(r1)
            r3 = 6
            r4 = 1
            if (r2 != r3) goto L21
            r5.g0 = r4
            goto L27
        L21:
            r3 = 22
            if (r2 != r3) goto L27
            r5.h0 = r4
        L27:
            int r1 = r1 + 1
            goto L14
        L2a:
            r6.recycle()
        L2d:
            return
    }

    public abstract void l(defpackage.rq7 r1, int r2, int r3);

    @Override // defpackage.l11, android.view.View
    public final void onAttachedToWindow() {
            r6 = this;
            super.onAttachedToWindow()
            boolean r0 = r6.g0
            if (r0 != 0) goto Lb
            boolean r0 = r6.h0
            if (r0 == 0) goto L4b
        Lb:
            android.view.ViewParent r0 = r6.getParent()
            boolean r1 = r0 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r1 == 0) goto L4b
            androidx.constraintlayout.widget.ConstraintLayout r0 = (androidx.constraintlayout.widget.ConstraintLayout) r0
            int r1 = r6.getVisibility()
            float r2 = r6.getElevation()
            r3 = 0
        L1e:
            int r4 = r6.B
            if (r3 >= r4) goto L4b
            int[] r4 = r6.A
            r4 = r4[r3]
            android.util.SparseArray r5 = r0.A
            java.lang.Object r4 = r5.get(r4)
            android.view.View r4 = (android.view.View) r4
            if (r4 == 0) goto L48
            boolean r5 = r6.g0
            if (r5 == 0) goto L37
            r4.setVisibility(r1)
        L37:
            boolean r5 = r6.h0
            if (r5 == 0) goto L48
            r5 = 0
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 <= 0) goto L48
            float r5 = r4.getTranslationZ()
            float r5 = r5 + r2
            r4.setTranslationZ(r5)
        L48:
            int r3 = r3 + 1
            goto L1e
        L4b:
            return
    }

    @Override // android.view.View
    public void setElevation(float r2) {
            r1 = this;
            super.setElevation(r2)
            android.view.ViewParent r2 = r1.getParent()
            if (r2 == 0) goto L12
            boolean r0 = r2 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r0 == 0) goto L12
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            r1.d(r2)
        L12:
            return
    }

    @Override // android.view.View
    public void setVisibility(int r2) {
            r1 = this;
            super.setVisibility(r2)
            android.view.ViewParent r2 = r1.getParent()
            if (r2 == 0) goto L12
            boolean r0 = r2 instanceof androidx.constraintlayout.widget.ConstraintLayout
            if (r0 == 0) goto L12
            androidx.constraintlayout.widget.ConstraintLayout r2 = (androidx.constraintlayout.widget.ConstraintLayout) r2
            r1.d(r2)
        L12:
            return
    }
}
