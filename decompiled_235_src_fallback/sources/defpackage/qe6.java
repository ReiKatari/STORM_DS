package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qe6  reason: default package */
/* loaded from: classes.dex */
public final class qe6 extends defpackage.ve6 {
    public final defpackage.se6 c;

    public qe6(defpackage.se6 r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            return
    }

    @Override // defpackage.ve6
    public final void a(android.graphics.Matrix r22, defpackage.ie6 r23, int r24, android.graphics.Canvas r25) {
            r21 = this;
            r0 = r23
            r1 = r24
            r2 = r21
            r3 = r25
            se6 r2 = r2.c
            float r4 = r2.f
            float r5 = r2.g
            android.graphics.RectF r6 = new android.graphics.RectF
            float r7 = r2.b
            float r8 = r2.c
            float r9 = r2.d
            float r2 = r2.e
            r6.<init>(r7, r8, r9, r2)
            android.graphics.Paint r2 = r0.b
            r7 = 0
            int r8 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r9 = 1
            r10 = 0
            if (r8 >= 0) goto L26
            r8 = r9
            goto L27
        L26:
            r8 = r10
        L27:
            android.graphics.Path r11 = r0.g
            r12 = 3
            r13 = 2
            int[] r18 = defpackage.ie6.k
            if (r8 == 0) goto L3e
            r18[r10] = r10
            int r10 = r0.f
            r18[r9] = r10
            int r10 = r0.e
            r18[r13] = r10
            int r10 = r0.d
            r18[r12] = r10
            goto L65
        L3e:
            r11.rewind()
            float r14 = r6.centerX()
            float r15 = r6.centerY()
            r11.moveTo(r14, r15)
            r11.arcTo(r6, r4, r5)
            r11.close()
            int r14 = -r1
            float r14 = (float) r14
            r6.inset(r14, r14)
            r18[r10] = r10
            int r10 = r0.d
            r18[r9] = r10
            int r10 = r0.e
            r18[r13] = r10
            int r10 = r0.f
            r18[r12] = r10
        L65:
            float r10 = r6.width()
            r12 = 1073741824(0x40000000, float:2.0)
            float r17 = r10 / r12
            int r7 = (r17 > r7 ? 1 : (r17 == r7 ? 0 : -1))
            if (r7 > 0) goto L72
            return
        L72:
            float r1 = (float) r1
            float r1 = r1 / r17
            r7 = 1065353216(0x3f800000, float:1.0)
            float r1 = r7 - r1
            float r10 = r7 - r1
            float r10 = r10 / r12
            float r10 = r10 + r1
            float[] r19 = defpackage.ie6.l
            r19[r9] = r1
            r19[r13] = r10
            android.graphics.RadialGradient r14 = new android.graphics.RadialGradient
            float r15 = r6.centerX()
            float r16 = r6.centerY()
            android.graphics.Shader$TileMode r20 = android.graphics.Shader.TileMode.CLAMP
            r14.<init>(r15, r16, r17, r18, r19, r20)
            r2.setShader(r14)
            r3.save()
            r1 = r22
            r3.concat(r1)
            float r1 = r6.height()
            float r9 = r6.width()
            float r1 = r1 / r9
            r3.scale(r7, r1)
            if (r8 != 0) goto Lb5
            android.graphics.Region$Op r1 = android.graphics.Region.Op.DIFFERENCE
            r3.clipPath(r11, r1)
            android.graphics.Paint r0 = r0.h
            r3.drawPath(r11, r0)
        Lb5:
            r3 = r5
            r5 = r2
            r2 = r4
            r4 = 1
            r0 = r25
            r1 = r6
            r0.drawArc(r1, r2, r3, r4, r5)
            r25.restore()
            return
    }
}
