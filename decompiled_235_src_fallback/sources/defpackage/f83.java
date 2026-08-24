package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f83  reason: default package */
/* loaded from: classes.dex */
public final class f83 extends defpackage.f55 {
    public final android.view.View L;
    public int R;
    public int X;
    public final int[] Y;

    public f83(android.view.View r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r0 = 2
            int[] r0 = new int[r0]
            r1.Y = r0
            r1.L = r2
            return
    }

    @Override // defpackage.f55
    public final void i0(defpackage.au7 r1) {
            r0 = this;
            android.view.View r0 = r0.L
            r1 = 0
            r0.setTranslationY(r1)
            return
    }

    @Override // defpackage.f55
    public final void j0(defpackage.au7 r2) {
            r1 = this;
            android.view.View r2 = r1.L
            int[] r0 = r1.Y
            r2.getLocationOnScreen(r0)
            r2 = 1
            r2 = r0[r2]
            r1.R = r2
            return
    }

    @Override // defpackage.f55
    public final defpackage.vu7 k0(defpackage.vu7 r3, java.util.List r4) {
            r2 = this;
            java.util.Iterator r4 = r4.iterator()
        L4:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r4.next()
            au7 r0 = (defpackage.au7) r0
            zt7 r1 = r0.a
            int r1 = r1.d()
            r1 = r1 & 8
            if (r1 == 0) goto L4
            int r4 = r2.X
            zt7 r0 = r0.a
            float r0 = r0.c()
            r1 = 0
            int r4 = defpackage.vo.c(r0, r4, r1)
            float r4 = (float) r4
            android.view.View r2 = r2.L
            r2.setTranslationY(r4)
        L2d:
            return r3
    }

    @Override // defpackage.f55
    public final defpackage.rr6 l0(defpackage.au7 r3, defpackage.rr6 r4) {
            r2 = this;
            android.view.View r3 = r2.L
            int[] r0 = r2.Y
            r3.getLocationOnScreen(r0)
            r1 = 1
            r0 = r0[r1]
            int r1 = r2.R
            int r1 = r1 - r0
            r2.X = r1
            float r2 = (float) r1
            r3.setTranslationY(r2)
            return r4
    }
}
