package com.google.android.material.behavior;

import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SwipeDismissBehavior<V extends android.view.View> extends defpackage.e51 {
    public defpackage.ho7 a;
    public boolean b;
    public boolean c;
    public int d;
    public float e;
    public float f;
    public final defpackage.pw6 g;

    public SwipeDismissBehavior() {
            r1 = this;
            r1.<init>()
            r0 = 2
            r1.d = r0
            r0 = 0
            r1.e = r0
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.f = r0
            pw6 r0 = new pw6
            r0.<init>(r1)
            r1.g = r0
            return
    }

    @Override // defpackage.e51
    public boolean j(androidx.coordinatorlayout.widget.CoordinatorLayout r5, android.view.View r6, android.view.MotionEvent r7) {
            r4 = this;
            boolean r0 = r4.b
            int r1 = r7.getActionMasked()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L13
            if (r1 == r2) goto L10
            r6 = 3
            if (r1 == r6) goto L10
            goto L23
        L10:
            r4.b = r3
            goto L23
        L13:
            float r0 = r7.getX()
            int r0 = (int) r0
            float r1 = r7.getY()
            int r1 = (int) r1
            boolean r0 = r5.o(r6, r0, r1)
            r4.b = r0
        L23:
            if (r0 == 0) goto L43
            ho7 r6 = r4.a
            if (r6 != 0) goto L36
            ho7 r6 = new ho7
            android.content.Context r0 = r5.getContext()
            pw6 r1 = r4.g
            r6.<init>(r0, r5, r1)
            r4.a = r6
        L36:
            boolean r5 = r4.c
            if (r5 != 0) goto L43
            ho7 r4 = r4.a
            boolean r4 = r4.p(r7)
            if (r4 == 0) goto L43
            return r2
        L43:
            return r3
    }

    @Override // defpackage.e51
    public final boolean k(androidx.coordinatorlayout.widget.CoordinatorLayout r2, android.view.View r3, int r4) {
            r1 = this;
            int r2 = r3.getImportantForAccessibility()
            r4 = 0
            if (r2 != 0) goto L23
            r2 = 1
            r3.setImportantForAccessibility(r2)
            r2 = 1048576(0x100000, float:1.469368E-39)
            defpackage.ao7.k(r3, r2)
            defpackage.ao7.i(r3, r4)
            boolean r2 = r1.v(r3)
            if (r2 == 0) goto L23
            p2 r2 = defpackage.p2.l
            s35 r0 = new s35
            r0.<init>(r1)
            defpackage.ao7.l(r3, r2, r0)
        L23:
            return r4
    }

    @Override // defpackage.e51
    public final boolean u(android.view.View r2, android.view.MotionEvent r3) {
            r1 = this;
            ho7 r2 = r1.a
            if (r2 == 0) goto L16
            boolean r2 = r1.c
            if (r2 == 0) goto Lf
            int r2 = r3.getActionMasked()
            r0 = 3
            if (r2 == r0) goto L14
        Lf:
            ho7 r1 = r1.a
            r1.j(r3)
        L14:
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    public boolean v(android.view.View r1) {
            r0 = this;
            r0 = 1
            return r0
    }
}
