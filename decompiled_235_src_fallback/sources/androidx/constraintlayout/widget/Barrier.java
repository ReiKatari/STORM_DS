package androidx.constraintlayout.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Barrier extends defpackage.l11 {
    public int g0;
    public int h0;
    public defpackage.a20 i0;

    public Barrier(android.content.Context r2) {
            r1 = this;
            r1.<init>(r2)
            r0 = 32
            int[] r0 = new int[r0]
            r1.A = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f0 = r0
            r1.L = r2
            r2 = 0
            r1.h(r2)
            r2 = 8
            super.setVisibility(r2)
            return
    }

    public Barrier(android.content.Context r1, android.util.AttributeSet r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 8
            super.setVisibility(r1)
            return
    }

    public boolean getAllowsGoneWidget() {
            r0 = this;
            a20 r0 = r0.i0
            boolean r0 = r0.w0
            return r0
    }

    public int getMargin() {
            r0 = this;
            a20 r0 = r0.i0
            int r0 = r0.x0
            return r0
    }

    public int getType() {
            r0 = this;
            int r0 = r0.g0
            return r0
    }

    @Override // defpackage.l11
    public final void h(android.util.AttributeSet r7) {
            r6 = this;
            super.h(r7)
            a20 r0 = new a20
            r0.<init>()
            r6.i0 = r0
            if (r7 == 0) goto L4e
            android.content.Context r0 = r6.getContext()
            int[] r1 = defpackage.e75.b
            android.content.res.TypedArray r7 = r0.obtainStyledAttributes(r7, r1)
            int r0 = r7.getIndexCount()
            r1 = 0
            r2 = r1
        L1c:
            if (r2 >= r0) goto L4b
            int r3 = r7.getIndex(r2)
            r4 = 26
            if (r3 != r4) goto L2e
            int r3 = r7.getInt(r3, r1)
            r6.setType(r3)
            goto L48
        L2e:
            r4 = 25
            if (r3 != r4) goto L3c
            a20 r4 = r6.i0
            r5 = 1
            boolean r3 = r7.getBoolean(r3, r5)
            r4.w0 = r3
            goto L48
        L3c:
            r4 = 27
            if (r3 != r4) goto L48
            int r3 = r7.getDimensionPixelSize(r3, r1)
            a20 r4 = r6.i0
            r4.x0 = r3
        L48:
            int r2 = r2 + 1
            goto L1c
        L4b:
            r7.recycle()
        L4e:
            a20 r7 = r6.i0
            r6.R = r7
            r6.k()
            return
    }

    @Override // defpackage.l11
    public final void i(defpackage.u11 r1, defpackage.gx2 r2, defpackage.o21 r3, android.util.SparseArray r4) {
            r0 = this;
            super.i(r1, r2, r3, r4)
            v11 r1 = r1.e
            boolean r3 = r2 instanceof defpackage.a20
            if (r3 == 0) goto L1f
            r3 = r2
            a20 r3 = (defpackage.a20) r3
            l21 r2 = r2.U
            m21 r2 = (defpackage.m21) r2
            boolean r2 = r2.y0
            int r4 = r1.g0
            r0.l(r3, r4, r2)
            boolean r0 = r1.o0
            r3.w0 = r0
            int r0 = r1.h0
            r3.x0 = r0
        L1f:
            return
    }

    @Override // defpackage.l11
    public final void j(defpackage.l21 r2, boolean r3) {
            r1 = this;
            int r0 = r1.g0
            r1.l(r2, r0, r3)
            return
    }

    public final void l(defpackage.l21 r5, int r6, boolean r7) {
            r4 = this;
            r4.h0 = r6
            int r6 = r4.g0
            r0 = 0
            r1 = 6
            r2 = 1
            r3 = 5
            if (r7 == 0) goto L14
            if (r6 != r3) goto Lf
            r4.h0 = r2
            goto L1d
        Lf:
            if (r6 != r1) goto L1d
            r4.h0 = r0
            goto L1d
        L14:
            if (r6 != r3) goto L19
            r4.h0 = r0
            goto L1d
        L19:
            if (r6 != r1) goto L1d
            r4.h0 = r2
        L1d:
            boolean r6 = r5 instanceof defpackage.a20
            if (r6 == 0) goto L27
            a20 r5 = (defpackage.a20) r5
            int r4 = r4.h0
            r5.v0 = r4
        L27:
            return
    }

    public void setAllowsGoneWidget(boolean r1) {
            r0 = this;
            a20 r0 = r0.i0
            r0.w0 = r1
            return
    }

    public void setDpMargin(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            float r2 = (float) r2
            float r2 = r2 * r0
            r0 = 1056964608(0x3f000000, float:0.5)
            float r2 = r2 + r0
            int r2 = (int) r2
            a20 r1 = r1.i0
            r1.x0 = r2
            return
    }

    public void setMargin(int r1) {
            r0 = this;
            a20 r0 = r0.i0
            r0.x0 = r1
            return
    }

    public void setType(int r1) {
            r0 = this;
            r0.g0 = r1
            return
    }
}
