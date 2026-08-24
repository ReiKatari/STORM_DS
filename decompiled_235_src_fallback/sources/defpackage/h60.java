package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h60  reason: default package */
/* loaded from: classes.dex */
public final class h60 extends defpackage.oi2 {
    public final /* synthetic */ int e;
    public final /* synthetic */ defpackage.e51 f;

    public /* synthetic */ h60(defpackage.e51 r1, int r2) {
            r0 = this;
            r0.e = r2
            r0.f = r1
            r0.<init>()
            return
    }

    @Override // defpackage.oi2
    public int E(android.view.View r2) {
            r1 = this;
            int r0 = r1.e
            switch(r0) {
                case 1: goto La;
                default: goto L5;
            }
        L5:
            int r1 = super.E(r2)
            return r1
        La:
            e51 r1 = r1.f
            com.google.android.material.sidesheet.SideSheetBehavior r1 = (com.google.android.material.sidesheet.SideSheetBehavior) r1
            int r2 = r1.l
            int r1 = r1.o
            int r2 = r2 + r1
            return r2
    }

    @Override // defpackage.oi2
    public int F() {
            r1 = this;
            int r0 = r1.e
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r1 = super.F()
            return r1
        La:
            e51 r1 = r1.f
            com.google.android.material.bottomsheet.BottomSheetBehavior r1 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r1
            boolean r0 = r1.I
            if (r0 == 0) goto L15
            int r1 = r1.V
            goto L17
        L15:
            int r1 = r1.G
        L17:
            return r1
    }

    @Override // defpackage.oi2
    public final void Q(int r3) {
            r2 = this;
            int r0 = r2.e
            e51 r2 = r2.f
            r1 = 1
            switch(r0) {
                case 0: goto L14;
                default: goto L8;
            }
        L8:
            if (r3 != r1) goto L13
            com.google.android.material.sidesheet.SideSheetBehavior r2 = (com.google.android.material.sidesheet.SideSheetBehavior) r2
            boolean r3 = r2.g
            if (r3 == 0) goto L13
            r2.w(r1)
        L13:
            return
        L14:
            if (r3 != r1) goto L1f
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            boolean r3 = r2.K
            if (r3 == 0) goto L1f
            r2.J(r1)
        L1f:
            return
    }

    @Override // defpackage.oi2
    public final void R(android.view.View r4, int r5, int r6) {
            r3 = this;
            int r0 = r3.e
            e51 r3 = r3.f
            switch(r0) {
                case 0: goto L4d;
                default: goto L7;
            }
        L7:
            com.google.android.material.sidesheet.SideSheetBehavior r3 = (com.google.android.material.sidesheet.SideSheetBehavior) r3
            java.lang.ref.WeakReference r6 = r3.q
            if (r6 == 0) goto L14
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L15
        L14:
            r6 = 0
        L15:
            if (r6 == 0) goto L2f
            android.view.ViewGroup$LayoutParams r0 = r6.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0
            if (r0 == 0) goto L2f
            ln2 r1 = r3.a
            int r2 = r4.getLeft()
            int r4 = r4.getRight()
            r1.h0(r0, r2, r4)
            r6.setLayoutParams(r0)
        L2f:
            java.util.LinkedHashSet r4 = r3.v
            boolean r6 = r4.isEmpty()
            if (r6 != 0) goto L4c
            ln2 r3 = r3.a
            r3.j(r5)
            java.util.Iterator r3 = r4.iterator()
            boolean r4 = r3.hasNext()
            if (r4 != 0) goto L47
            goto L4c
        L47:
            java.lang.ClassCastException r3 = defpackage.i61.j(r3)
            throw r3
        L4c:
            return
        L4d:
            com.google.android.material.bottomsheet.BottomSheetBehavior r3 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r3
            r3.y(r6)
            return
    }

    @Override // defpackage.oi2
    public final void S(android.view.View r7, float r8, float r9) {
            r6 = this;
            int r0 = r6.e
            r1 = 1
            r2 = 0
            r3 = 3
            r4 = 5
            e51 r6 = r6.f
            switch(r0) {
                case 0: goto L63;
                default: goto Lb;
            }
        Lb:
            com.google.android.material.sidesheet.SideSheetBehavior r6 = (com.google.android.material.sidesheet.SideSheetBehavior) r6
            ln2 r0 = r6.a
            boolean r0 = r0.I(r8)
            if (r0 == 0) goto L16
            goto L5f
        L16:
            ln2 r0 = r6.a
            boolean r0 = r0.c0(r7, r8)
            if (r0 == 0) goto L2f
            ln2 r0 = r6.a
            boolean r8 = r0.K(r8, r9)
            if (r8 != 0) goto L5e
            ln2 r8 = r6.a
            boolean r8 = r8.J(r7)
            if (r8 == 0) goto L5f
            goto L5e
        L2f:
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r0 == 0) goto L40
            float r8 = java.lang.Math.abs(r8)
            float r9 = java.lang.Math.abs(r9)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto L40
            goto L5e
        L40:
            int r8 = r7.getLeft()
            ln2 r9 = r6.a
            int r9 = r9.u()
            int r9 = r8 - r9
            int r9 = java.lang.Math.abs(r9)
            ln2 r0 = r6.a
            int r0 = r0.v()
            int r8 = r8 - r0
            int r8 = java.lang.Math.abs(r8)
            if (r9 >= r8) goto L5e
            goto L5f
        L5e:
            r3 = r4
        L5f:
            r6.y(r7, r3, r1)
            return
        L63:
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            com.google.android.material.bottomsheet.BottomSheetBehavior r6 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r6
            r5 = 6
            if (r0 >= 0) goto L7c
            boolean r8 = r6.b
            if (r8 == 0) goto L70
            goto L137
        L70:
            int r8 = r7.getTop()
            android.os.SystemClock.uptimeMillis()
            int r9 = r6.E
            if (r8 <= r9) goto L137
            goto Lcd
        L7c:
            boolean r0 = r6.I
            if (r0 == 0) goto Ld0
            boolean r0 = r6.K(r7, r9)
            if (r0 == 0) goto Ld0
            float r8 = java.lang.Math.abs(r8)
            float r0 = java.lang.Math.abs(r9)
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 >= 0) goto L99
            int r8 = r6.d
            float r8 = (float) r8
            int r8 = (r9 > r8 ? 1 : (r9 == r8 ? 0 : -1))
            if (r8 > 0) goto La8
        L99:
            int r8 = r7.getTop()
            int r9 = r6.V
            int r0 = r6.C()
            int r0 = r0 + r9
            int r0 = r0 / 2
            if (r8 <= r0) goto Lab
        La8:
            r3 = r4
            goto L137
        Lab:
            boolean r8 = r6.b
            if (r8 == 0) goto Lb1
            goto L137
        Lb1:
            int r8 = r7.getTop()
            int r9 = r6.C()
            int r8 = r8 - r9
            int r8 = java.lang.Math.abs(r8)
            int r9 = r7.getTop()
            int r0 = r6.E
            int r9 = r9 - r0
            int r9 = java.lang.Math.abs(r9)
            if (r8 >= r9) goto Lcd
            goto L137
        Lcd:
            r3 = r5
            goto L137
        Ld0:
            int r0 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            r2 = 4
            if (r0 == 0) goto Lfe
            float r8 = java.lang.Math.abs(r8)
            float r9 = java.lang.Math.abs(r9)
            int r8 = (r8 > r9 ? 1 : (r8 == r9 ? 0 : -1))
            if (r8 <= 0) goto Le2
            goto Lfe
        Le2:
            boolean r8 = r6.b
            if (r8 == 0) goto Le8
        Le6:
            r3 = r2
            goto L137
        Le8:
            int r8 = r7.getTop()
            int r9 = r6.E
            int r9 = r8 - r9
            int r9 = java.lang.Math.abs(r9)
            int r0 = r6.G
            int r8 = r8 - r0
            int r8 = java.lang.Math.abs(r8)
            if (r9 >= r8) goto Le6
            goto Lcd
        Lfe:
            int r8 = r7.getTop()
            boolean r9 = r6.b
            if (r9 == 0) goto L118
            int r9 = r6.D
            int r9 = r8 - r9
            int r9 = java.lang.Math.abs(r9)
            int r0 = r6.G
            int r8 = r8 - r0
            int r8 = java.lang.Math.abs(r8)
            if (r9 >= r8) goto Le6
            goto L137
        L118:
            int r9 = r6.E
            if (r8 >= r9) goto L127
            int r9 = r6.G
            int r9 = r8 - r9
            int r9 = java.lang.Math.abs(r9)
            if (r8 >= r9) goto Lcd
            goto L137
        L127:
            int r9 = r8 - r9
            int r9 = java.lang.Math.abs(r9)
            int r0 = r6.G
            int r8 = r8 - r0
            int r8 = java.lang.Math.abs(r8)
            if (r9 >= r8) goto Le6
            goto Lcd
        L137:
            r6.L(r7, r3, r1)
            return
    }

    @Override // defpackage.oi2
    public final boolean a0(android.view.View r5, int r6) {
            r4 = this;
            int r0 = r4.e
            r1 = 1
            e51 r4 = r4.f
            r2 = 0
            switch(r0) {
                case 0: goto L1d;
                default: goto L9;
            }
        L9:
            com.google.android.material.sidesheet.SideSheetBehavior r4 = (com.google.android.material.sidesheet.SideSheetBehavior) r4
            int r6 = r4.h
            if (r6 != r1) goto L10
            goto L1b
        L10:
            java.lang.ref.WeakReference r4 = r4.p
            if (r4 == 0) goto L1b
            java.lang.Object r4 = r4.get()
            if (r4 != r5) goto L1b
            goto L1c
        L1b:
            r1 = r2
        L1c:
            return r1
        L1d:
            com.google.android.material.bottomsheet.BottomSheetBehavior r4 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r4
            int r0 = r4.N
            if (r0 != r1) goto L24
            goto L54
        L24:
            boolean r3 = r4.d0
            if (r3 == 0) goto L29
            goto L54
        L29:
            r3 = 3
            if (r0 != r3) goto L46
            int r0 = r4.b0
            if (r0 != r6) goto L46
            java.lang.ref.WeakReference r6 = r4.X
            if (r6 == 0) goto L3b
            java.lang.Object r6 = r6.get()
            android.view.View r6 = (android.view.View) r6
            goto L3c
        L3b:
            r6 = 0
        L3c:
            if (r6 == 0) goto L46
            r0 = -1
            boolean r6 = r6.canScrollVertically(r0)
            if (r6 == 0) goto L46
            goto L54
        L46:
            android.os.SystemClock.uptimeMillis()
            java.lang.ref.WeakReference r4 = r4.W
            if (r4 == 0) goto L54
            java.lang.Object r4 = r4.get()
            if (r4 != r5) goto L54
            goto L55
        L54:
            r1 = r2
        L55:
            return r1
    }

    @Override // defpackage.oi2
    public final int m(android.view.View r2, int r3) {
            r1 = this;
            int r0 = r1.e
            switch(r0) {
                case 0: goto L1a;
                default: goto L5;
            }
        L5:
            e51 r1 = r1.f
            com.google.android.material.sidesheet.SideSheetBehavior r1 = (com.google.android.material.sidesheet.SideSheetBehavior) r1
            ln2 r2 = r1.a
            int r2 = r2.x()
            ln2 r1 = r1.a
            int r1 = r1.w()
            int r1 = defpackage.ej2.q(r3, r2, r1)
            return r1
        L1a:
            int r1 = r2.getLeft()
            return r1
    }

    @Override // defpackage.oi2
    public final int n(android.view.View r2, int r3) {
            r1 = this;
            int r0 = r1.e
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r1 = r2.getTop()
            return r1
        La:
            e51 r2 = r1.f
            com.google.android.material.bottomsheet.BottomSheetBehavior r2 = (com.google.android.material.bottomsheet.BottomSheetBehavior) r2
            int r2 = r2.C()
            int r1 = r1.F()
            int r1 = defpackage.ej2.q(r3, r2, r1)
            return r1
    }
}
