package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fj1  reason: default package */
/* loaded from: classes.dex */
public final class fj1 extends defpackage.f55 {
    public final /* synthetic */ defpackage.gj1 L;

    public fj1(defpackage.gj1 r1) {
            r0 = this;
            r0.L = r1
            r1 = 1
            r0.<init>(r1)
            return
    }

    @Override // defpackage.f55
    public final defpackage.vu7 k0(defpackage.vu7 r6, java.util.List r7) {
            r5 = this;
            gj1 r5 = r5.L
            boolean r7 = r5.l0
            if (r7 == 0) goto L7
            goto L3e
        L7:
            r7 = 0
            android.view.View r0 = r5.getChildAt(r7)
            int r1 = r0.getLeft()
            int r1 = java.lang.Math.max(r7, r1)
            int r2 = r0.getTop()
            int r2 = java.lang.Math.max(r7, r2)
            int r3 = r5.getWidth()
            int r4 = r0.getRight()
            int r3 = r3 - r4
            int r3 = java.lang.Math.max(r7, r3)
            int r5 = r5.getHeight()
            int r0 = r0.getBottom()
            int r5 = r5 - r0
            int r5 = java.lang.Math.max(r7, r5)
            if (r1 != 0) goto L3f
            if (r2 != 0) goto L3f
            if (r3 != 0) goto L3f
            if (r5 != 0) goto L3f
        L3e:
            return r6
        L3f:
            ru7 r6 = r6.a
            vu7 r5 = r6.q(r1, r2, r3, r5)
            return r5
    }

    @Override // defpackage.f55
    public final defpackage.rr6 l0(defpackage.au7 r6, defpackage.rr6 r7) {
            r5 = this;
            gj1 r5 = r5.L
            boolean r6 = r5.l0
            if (r6 == 0) goto L7
            goto L3e
        L7:
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
            if (r1 != 0) goto L3f
            if (r2 != 0) goto L3f
            if (r3 != 0) goto L3f
            if (r5 != 0) goto L3f
        L3e:
            return r7
        L3f:
            e83 r5 = defpackage.e83.c(r1, r2, r3, r5)
            int r6 = r5.a
            rr6 r0 = new rr6
            java.lang.Object r1 = r7.B
            e83 r1 = (defpackage.e83) r1
            int r2 = r5.b
            int r3 = r5.c
            int r5 = r5.d
            e83 r1 = defpackage.vu7.e(r1, r6, r2, r3, r5)
            java.lang.Object r7 = r7.L
            e83 r7 = (defpackage.e83) r7
            e83 r5 = defpackage.vu7.e(r7, r6, r2, r3, r5)
            r6 = 14
            r0.<init>(r6, r1, r5)
            return r0
    }
}
