package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cb0  reason: default package */
/* loaded from: classes.dex */
public final class cb0 implements defpackage.ab0 {
    public final android.graphics.Matrix a;
    public final int[] b;

    public cb0() {
            r1 = this;
            r1.<init>()
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.a = r0
            r0 = 2
            int[] r0 = new int[r0]
            r1.b = r0
            return
    }

    @Override // defpackage.ab0
    public void a(android.view.View r6, float[] r7) {
            r5 = this;
            android.graphics.Matrix r0 = r5.a
            r0.reset()
            defpackage.od.r(r6, r0)
            android.view.ViewParent r1 = r6.getParent()
        Lc:
            boolean r2 = r1 instanceof android.view.View
            if (r2 == 0) goto L18
            r6 = r1
            android.view.View r6 = (android.view.View) r6
            android.view.ViewParent r1 = r6.getParent()
            goto Lc
        L18:
            int[] r5 = r5.b
            r6.getLocationOnScreen(r5)
            r1 = 0
            r2 = r5[r1]
            r3 = 1
            r4 = r5[r3]
            r6.getLocationInWindow(r5)
            r6 = r5[r1]
            r5 = r5[r3]
            int r6 = r6 - r2
            float r6 = (float) r6
            int r5 = r5 - r4
            float r5 = (float) r5
            r0.postTranslate(r6, r5)
            defpackage.hv.Y(r0, r7)
            return
    }
}
