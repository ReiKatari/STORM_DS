package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bb0  reason: default package */
/* loaded from: classes.dex */
public final class bb0 implements defpackage.ab0 {
    public final int[] a;
    public final float[] b;

    public bb0(int r1, int r2) {
            r0 = this;
            r0.<init>()
            int[] r1 = new int[]{r1, r2}
            r0.a = r1
            r1 = 2
            float[] r1 = new float[r1]
            r1 = {x0012: FILL_ARRAY_DATA  , data: [0, 1065353216} // fill-array
            r0.b = r1
            return
    }

    public bb0(int r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            int[] r1 = new int[]{r1, r2, r3}
            r0.a = r1
            r1 = 3
            float[] r1 = new float[r1]
            r1 = {x0012: FILL_ARRAY_DATA  , data: [0, 1056964608, 1065353216} // fill-array
            r0.b = r1
            return
    }

    public bb0(java.util.ArrayList r5, java.util.ArrayList r6) {
            r4 = this;
            r4.<init>()
            int r0 = r5.size()
            int[] r1 = new int[r0]
            r4.a = r1
            float[] r1 = new float[r0]
            r4.b = r1
            r1 = 0
        L10:
            if (r1 >= r0) goto L31
            int[] r2 = r4.a
            java.lang.Object r3 = r5.get(r1)
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r2[r1] = r3
            float[] r2 = r4.b
            java.lang.Object r3 = r6.get(r1)
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            r2[r1] = r3
            int r1 = r1 + 1
            goto L10
        L31:
            return
    }

    public bb0(float[] r1) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r1 = 2
            int[] r1 = new int[r1]
            r0.a = r1
            return
    }

    @Override // defpackage.ab0
    public void a(android.view.View r1, float[] r2) {
            r0 = this;
            defpackage.v24.d(r2)
            r0.b(r1, r2)
            return
    }

    public void b(android.view.View r4, float[] r5) {
            r3 = this;
            android.view.ViewParent r0 = r4.getParent()
            boolean r1 = r0 instanceof android.view.View
            float[] r2 = r3.b
            if (r1 == 0) goto L38
            android.view.View r0 = (android.view.View) r0
            r3.b(r0, r5)
            int r3 = r4.getScrollX()
            float r3 = (float) r3
            float r3 = -r3
            int r0 = r4.getScrollY()
            float r0 = (float) r0
            float r0 = -r0
            defpackage.v24.d(r2)
            defpackage.v24.f(r2, r3, r0)
            defpackage.hf.g0(r5, r2)
            int r3 = r4.getLeft()
            float r3 = (float) r3
            int r0 = r4.getTop()
            float r0 = (float) r0
            defpackage.v24.d(r2)
            defpackage.v24.f(r2, r3, r0)
            defpackage.hf.g0(r5, r2)
            goto L63
        L38:
            int[] r3 = r3.a
            r4.getLocationInWindow(r3)
            int r0 = r4.getScrollX()
            float r0 = (float) r0
            float r0 = -r0
            int r1 = r4.getScrollY()
            float r1 = (float) r1
            float r1 = -r1
            defpackage.v24.d(r2)
            defpackage.v24.f(r2, r0, r1)
            defpackage.hf.g0(r5, r2)
            r0 = 0
            r0 = r3[r0]
            float r0 = (float) r0
            r1 = 1
            r3 = r3[r1]
            float r3 = (float) r3
            defpackage.v24.d(r2)
            defpackage.v24.f(r2, r0, r3)
            defpackage.hf.g0(r5, r2)
        L63:
            android.graphics.Matrix r3 = r4.getMatrix()
            boolean r4 = r3.isIdentity()
            if (r4 != 0) goto L73
            defpackage.hv.Y(r3, r2)
            defpackage.hf.g0(r5, r2)
        L73:
            return
    }
}
