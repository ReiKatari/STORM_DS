package com.google.android.material.snackbar;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class BaseTransientBottomBar$Behavior extends com.google.android.material.behavior.SwipeDismissBehavior<android.view.View> {
    public final defpackage.vs0 h;

    public BaseTransientBottomBar$Behavior() {
            r4 = this;
            r4.<init>()
            vs0 r0 = new vs0
            r1 = 24
            r0.<init>(r1)
            r1 = 0
            r2 = 1036831949(0x3dcccccd, float:0.1)
            float r2 = java.lang.Math.max(r1, r2)
            r3 = 1065353216(0x3f800000, float:1.0)
            float r2 = java.lang.Math.min(r2, r3)
            r4.e = r2
            r2 = 1058642330(0x3f19999a, float:0.6)
            float r1 = java.lang.Math.max(r1, r2)
            float r1 = java.lang.Math.min(r1, r3)
            r4.f = r1
            r1 = 0
            r4.d = r1
            r4.h = r0
            return
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior, defpackage.e51
    public final boolean j(androidx.coordinatorlayout.widget.CoordinatorLayout r3, android.view.View r4, android.view.MotionEvent r5) {
            r2 = this;
            vs0 r0 = r2.h
            r0.getClass()
            int r0 = r5.getActionMasked()
            if (r0 == 0) goto L27
            r1 = 1
            if (r0 == r1) goto L12
            r1 = 3
            if (r0 == r1) goto L12
            goto L4c
        L12:
            u2 r0 = defpackage.u2.c
            if (r0 != 0) goto L1d
            u2 r0 = new u2
            r0.<init>()
            defpackage.u2.c = r0
        L1d:
            u2 r0 = defpackage.u2.c
            java.lang.Object r0 = r0.b
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            goto L4c
        L24:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r2
        L27:
            float r0 = r5.getX()
            int r0 = (int) r0
            float r1 = r5.getY()
            int r1 = (int) r1
            boolean r0 = r3.o(r4, r0, r1)
            if (r0 == 0) goto L4c
            u2 r0 = defpackage.u2.c
            if (r0 != 0) goto L42
            u2 r0 = new u2
            r0.<init>()
            defpackage.u2.c = r0
        L42:
            u2 r0 = defpackage.u2.c
            java.lang.Object r0 = r0.b
            monitor-enter(r0)
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            goto L4c
        L49:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L49
            throw r2
        L4c:
            boolean r2 = super.j(r3, r4, r5)
            return r2
    }

    @Override // com.google.android.material.behavior.SwipeDismissBehavior
    public final boolean v(android.view.View r1) {
            r0 = this;
            vs0 r0 = r0.h
            r0.getClass()
            boolean r0 = r1 instanceof defpackage.u20
            return r0
    }
}
