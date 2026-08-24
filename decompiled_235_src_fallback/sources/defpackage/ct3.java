package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ct3  reason: default package */
/* loaded from: classes.dex */
public final class ct3 extends defpackage.ln2 {
    public final /* synthetic */ int g;
    public final com.google.android.material.sidesheet.SideSheetBehavior h;

    public /* synthetic */ ct3(com.google.android.material.sidesheet.SideSheetBehavior r1, int r2) {
            r0 = this;
            r0.g = r2
            r0.h = r1
            r0.<init>()
            return
    }

    @Override // defpackage.ln2
    public final int B() {
            r0 = this;
            int r0 = r0.g
            switch(r0) {
                case 0: goto L7;
                default: goto L5;
            }
        L5:
            r0 = 0
            return r0
        L7:
            r0 = 1
            return r0
    }

    @Override // defpackage.ln2
    public final boolean I(float r1) {
            r0 = this;
            int r0 = r0.g
            switch(r0) {
                case 0: goto Le;
                default: goto L5;
            }
        L5:
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            return r0
        Le:
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L15
            r0 = 1
            goto L16
        L15:
            r0 = 0
        L16:
            return r0
    }

    @Override // defpackage.ln2
    public final boolean J(android.view.View r4) {
            r3 = this;
            int r0 = r3.g
            r1 = 0
            r2 = 1
            switch(r0) {
                case 0: goto L1a;
                default: goto L7;
            }
        L7:
            int r4 = r4.getLeft()
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r3.h
            int r0 = r0.m
            int r3 = r3.u()
            int r3 = r3 + r0
            int r3 = r3 / 2
            if (r4 <= r3) goto L19
            r1 = r2
        L19:
            return r1
        L1a:
            int r4 = r4.getRight()
            int r0 = r3.u()
            int r3 = r3.v()
            int r0 = r0 - r3
            int r0 = r0 / 2
            if (r4 >= r0) goto L2c
            r1 = r2
        L2c:
            return r1
    }

    @Override // defpackage.ln2
    public final boolean K(float r1, float r2) {
            r0 = this;
            int r0 = r0.g
            switch(r0) {
                case 0: goto L1f;
                default: goto L5;
            }
        L5:
            float r0 = java.lang.Math.abs(r1)
            float r2 = java.lang.Math.abs(r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L1d
            float r0 = java.lang.Math.abs(r1)
            r1 = 1140457472(0x43fa0000, float:500.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1d
            r0 = 1
            goto L1e
        L1d:
            r0 = 0
        L1e:
            return r0
        L1f:
            float r0 = java.lang.Math.abs(r1)
            float r2 = java.lang.Math.abs(r2)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L37
            float r0 = java.lang.Math.abs(r1)
            r1 = 1140457472(0x43fa0000, float:500.0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L37
            r0 = 1
            goto L38
        L37:
            r0 = 0
        L38:
            return r0
    }

    @Override // defpackage.ln2
    public final boolean c0(android.view.View r5, float r6) {
            r4 = this;
            int r0 = r4.g
            r1 = 0
            r2 = 1
            r3 = 1056964608(0x3f000000, float:0.5)
            com.google.android.material.sidesheet.SideSheetBehavior r4 = r4.h
            switch(r0) {
                case 0: goto L1e;
                default: goto Lb;
            }
        Lb:
            int r5 = r5.getRight()
            float r5 = (float) r5
            float r4 = r4.k
            float r6 = r6 * r4
            float r6 = r6 + r5
            float r4 = java.lang.Math.abs(r6)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 <= 0) goto L1d
            r1 = r2
        L1d:
            return r1
        L1e:
            int r5 = r5.getLeft()
            float r5 = (float) r5
            float r4 = r4.k
            float r6 = r6 * r4
            float r6 = r6 + r5
            float r4 = java.lang.Math.abs(r6)
            int r4 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r4 <= 0) goto L30
            r1 = r2
        L30:
            return r1
    }

    @Override // defpackage.ln2
    public final void g0(android.view.ViewGroup.MarginLayoutParams r1, int r2) {
            r0 = this;
            int r0 = r0.g
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            r1.rightMargin = r2
            return
        L8:
            r1.leftMargin = r2
            return
    }

    @Override // defpackage.ln2
    public final void h0(android.view.ViewGroup.MarginLayoutParams r2, int r3, int r4) {
            r1 = this;
            int r0 = r1.g
            com.google.android.material.sidesheet.SideSheetBehavior r1 = r1.h
            switch(r0) {
                case 0: goto Lf;
                default: goto L7;
            }
        L7:
            int r1 = r1.m
            if (r3 > r1) goto Le
            int r1 = r1 - r3
            r2.rightMargin = r1
        Le:
            return
        Lf:
            int r1 = r1.m
            if (r3 > r1) goto L15
            r2.leftMargin = r4
        L15:
            return
    }

    @Override // defpackage.ln2
    public final int i(android.view.ViewGroup.MarginLayoutParams r1) {
            r0 = this;
            int r0 = r0.g
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            int r0 = r1.rightMargin
            return r0
        L8:
            int r0 = r1.leftMargin
            return r0
    }

    @Override // defpackage.ln2
    public final float j(int r2) {
            r1 = this;
            int r0 = r1.g
            switch(r0) {
                case 0: goto L15;
                default: goto L5;
            }
        L5:
            com.google.android.material.sidesheet.SideSheetBehavior r0 = r1.h
            int r0 = r0.m
            float r0 = (float) r0
            int r1 = r1.u()
            float r1 = (float) r1
            float r1 = r0 - r1
            float r2 = (float) r2
            float r0 = r0 - r2
            float r0 = r0 / r1
            return r0
        L15:
            int r0 = r1.v()
            float r0 = (float) r0
            int r1 = r1.u()
            float r1 = (float) r1
            float r1 = r1 - r0
            float r2 = (float) r2
            float r2 = r2 - r0
            float r2 = r2 / r1
            return r2
    }

    @Override // defpackage.ln2
    public final int s(android.view.ViewGroup.MarginLayoutParams r1) {
            r0 = this;
            int r0 = r0.g
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            int r0 = r1.rightMargin
            return r0
        L8:
            int r0 = r1.leftMargin
            return r0
    }

    @Override // defpackage.ln2
    public final int u() {
            r3 = this;
            int r0 = r3.g
            com.google.android.material.sidesheet.SideSheetBehavior r3 = r3.h
            r1 = 0
            switch(r0) {
                case 0: goto L15;
                default: goto L8;
            }
        L8:
            int r0 = r3.m
            int r2 = r3.l
            int r0 = r0 - r2
            int r3 = r3.o
            int r0 = r0 - r3
            int r3 = java.lang.Math.max(r1, r0)
            return r3
        L15:
            int r0 = r3.n
            int r3 = r3.o
            int r0 = r0 + r3
            int r3 = java.lang.Math.max(r1, r0)
            return r3
    }

    @Override // defpackage.ln2
    public final int v() {
            r1 = this;
            int r0 = r1.g
            com.google.android.material.sidesheet.SideSheetBehavior r1 = r1.h
            switch(r0) {
                case 0: goto La;
                default: goto L7;
            }
        L7:
            int r1 = r1.m
            return r1
        La:
            int r0 = r1.l
            int r0 = -r0
            int r1 = r1.o
            int r0 = r0 - r1
            return r0
    }

    @Override // defpackage.ln2
    public final int w() {
            r1 = this;
            int r0 = r1.g
            com.google.android.material.sidesheet.SideSheetBehavior r1 = r1.h
            switch(r0) {
                case 0: goto La;
                default: goto L7;
            }
        L7:
            int r1 = r1.m
            return r1
        La:
            int r1 = r1.o
            return r1
    }

    @Override // defpackage.ln2
    public final int x() {
            r1 = this;
            int r0 = r1.g
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r1 = r1.u()
            return r1
        La:
            com.google.android.material.sidesheet.SideSheetBehavior r1 = r1.h
            int r1 = r1.l
            int r1 = -r1
            return r1
    }

    @Override // defpackage.ln2
    public final int y(android.view.View r2) {
            r1 = this;
            int r0 = r1.g
            com.google.android.material.sidesheet.SideSheetBehavior r1 = r1.h
            switch(r0) {
                case 0: goto Lf;
                default: goto L7;
            }
        L7:
            int r2 = r2.getLeft()
            int r1 = r1.o
            int r2 = r2 - r1
            return r2
        Lf:
            int r2 = r2.getRight()
            int r1 = r1.o
            int r2 = r2 + r1
            return r2
    }

    @Override // defpackage.ln2
    public final int z(androidx.coordinatorlayout.widget.CoordinatorLayout r1) {
            r0 = this;
            int r0 = r0.g
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            int r0 = r1.getRight()
            return r0
        La:
            int r0 = r1.getLeft()
            return r0
    }
}
