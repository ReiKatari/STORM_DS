package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: re6  reason: default package */
/* loaded from: classes.dex */
public final class re6 extends defpackage.ve6 {
    public final defpackage.te6 c;
    public final float d;
    public final float e;

    public re6(defpackage.te6 r1, float r2, float r3) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.d = r2
            r0.e = r3
            return
    }

    @Override // defpackage.ve6
    public final void a(android.graphics.Matrix r18, defpackage.ie6 r19, int r20, android.graphics.Canvas r21) {
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            r3 = r21
            te6 r4 = r0.c
            float r5 = r4.c
            float r6 = r0.e
            float r5 = r5 - r6
            float r4 = r4.b
            float r7 = r0.d
            float r4 = r4 - r7
            android.graphics.RectF r8 = new android.graphics.RectF
            double r9 = (double) r5
            double r4 = (double) r4
            double r4 = java.lang.Math.hypot(r9, r4)
            float r4 = (float) r4
            r5 = 0
            r8.<init>(r5, r5, r4, r5)
            android.graphics.Matrix r4 = r0.a
            r9 = r18
            r4.set(r9)
            r4.preTranslate(r7, r6)
            float r0 = r0.b()
            r4.preRotate(r0)
            r1.getClass()
            float r0 = r8.bottom
            float r6 = (float) r2
            float r0 = r0 + r6
            r8.bottom = r0
            int r0 = -r2
            float r0 = (float) r0
            r8.offset(r5, r0)
            r0 = 0
            int r2 = r1.f
            int[] r14 = defpackage.ie6.i
            r14[r0] = r2
            r0 = 1
            int r2 = r1.e
            r14[r0] = r2
            r0 = 2
            int r2 = r1.d
            r14[r0] = r2
            android.graphics.Paint r0 = r1.c
            android.graphics.LinearGradient r9 = new android.graphics.LinearGradient
            float r10 = r8.left
            float r11 = r8.top
            float r13 = r8.bottom
            float[] r15 = defpackage.ie6.j
            android.graphics.Shader$TileMode r16 = android.graphics.Shader.TileMode.CLAMP
            r12 = r10
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r0.setShader(r9)
            r3.save()
            r3.concat(r4)
            r3.drawRect(r8, r0)
            r3.restore()
            return
    }

    public final float b() {
            r3 = this;
            te6 r0 = r3.c
            float r1 = r0.c
            float r2 = r3.e
            float r1 = r1 - r2
            float r0 = r0.b
            float r3 = r3.d
            float r0 = r0 - r3
            float r1 = r1 / r0
            double r0 = (double) r1
            double r0 = java.lang.Math.atan(r0)
            double r0 = java.lang.Math.toDegrees(r0)
            float r3 = (float) r0
            return r3
    }
}
