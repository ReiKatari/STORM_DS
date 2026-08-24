package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r24  reason: default package */
/* loaded from: classes.dex */
public final class r24 extends defpackage.q14 {
    public final float g;
    public final float h;
    public final float i;

    public r24(android.view.View r2) {
            r1 = this;
            r1.<init>(r2)
            android.content.res.Resources r2 = r2.getResources()
            r0 = 2131165366(0x7f0700b6, float:1.7944947E38)
            float r0 = r2.getDimension(r0)
            r1.g = r0
            r0 = 2131165365(0x7f0700b5, float:1.7944945E38)
            float r0 = r2.getDimension(r0)
            r1.h = r0
            r0 = 2131165367(0x7f0700b7, float:1.794495E38)
            float r2 = r2.getDimension(r0)
            r1.i = r2
            return
    }

    public final void a(float r11, int r12, boolean r13) {
            r10 = this;
            android.view.animation.PathInterpolator r0 = r10.a
            float r11 = r0.getInterpolation(r11)
            android.view.View r0 = r10.b
            int r1 = r0.getLayoutDirection()
            int r12 = android.view.Gravity.getAbsoluteGravity(r12, r1)
            r1 = 3
            r12 = r12 & r1
            r2 = 0
            r3 = 1
            if (r12 != r1) goto L18
            r12 = r3
            goto L19
        L18:
            r12 = r2
        L19:
            if (r13 != r12) goto L1c
            goto L1d
        L1c:
            r3 = r2
        L1d:
            int r13 = r0.getWidth()
            int r1 = r0.getHeight()
            float r4 = (float) r13
            r5 = 0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 <= 0) goto Lbc
            float r1 = (float) r1
            int r6 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r6 > 0) goto L32
            goto Lbc
        L32:
            float r6 = r10.g
            float r6 = r6 / r4
            float r7 = r10.h
            float r7 = r7 / r4
            float r10 = r10.i
            float r10 = r10 / r1
            if (r12 == 0) goto L3e
            r4 = r5
        L3e:
            r0.setPivotX(r4)
            if (r3 == 0) goto L44
            goto L45
        L44:
            float r7 = -r6
        L45:
            float r1 = defpackage.vo.a(r5, r7, r11)
            r4 = 1065353216(0x3f800000, float:1.0)
            float r6 = r1 + r4
            float r10 = defpackage.vo.a(r5, r10, r11)
            float r10 = r4 - r10
            boolean r11 = java.lang.Float.isNaN(r6)
            if (r11 != 0) goto Lbc
            boolean r11 = java.lang.Float.isNaN(r10)
            if (r11 == 0) goto L60
            goto Lbc
        L60:
            r0.setScaleX(r6)
            r0.setScaleY(r10)
            boolean r11 = r0 instanceof android.view.ViewGroup
            if (r11 == 0) goto Lbc
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
        L6c:
            int r11 = r0.getChildCount()
            if (r2 >= r11) goto Lbc
            android.view.View r11 = r0.getChildAt(r2)
            if (r12 == 0) goto L85
            int r7 = r11.getRight()
            int r7 = r13 - r7
            int r8 = r11.getWidth()
            int r8 = r8 + r7
            float r7 = (float) r8
            goto L8b
        L85:
            int r7 = r11.getLeft()
            int r7 = -r7
            float r7 = (float) r7
        L8b:
            r11.setPivotX(r7)
            int r7 = r11.getTop()
            int r7 = -r7
            float r7 = (float) r7
            r11.setPivotY(r7)
            if (r3 == 0) goto L9c
            float r7 = r4 - r1
            goto L9d
        L9c:
            r7 = r4
        L9d:
            int r8 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r8 == 0) goto La5
            float r8 = r6 / r10
            float r8 = r8 * r7
            goto La6
        La5:
            r8 = r4
        La6:
            boolean r9 = java.lang.Float.isNaN(r7)
            if (r9 != 0) goto Lb9
            boolean r9 = java.lang.Float.isNaN(r8)
            if (r9 == 0) goto Lb3
            goto Lb9
        Lb3:
            r11.setScaleX(r7)
            r11.setScaleY(r8)
        Lb9:
            int r2 = r2 + 1
            goto L6c
        Lbc:
            return
    }
}
