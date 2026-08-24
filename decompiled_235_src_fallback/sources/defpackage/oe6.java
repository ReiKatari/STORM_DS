package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oe6  reason: default package */
/* loaded from: classes.dex */
public final class oe6 {
    public final defpackage.we6[] a;
    public final android.graphics.Matrix[] b;
    public final android.graphics.Matrix[] c;
    public final android.graphics.PointF d;
    public final android.graphics.Path e;
    public final android.graphics.Path f;
    public final defpackage.we6 g;
    public final float[] h;
    public final float[] i;
    public final android.graphics.Path j;
    public final android.graphics.Path k;
    public final boolean l;

    public oe6() {
            r4 = this;
            r4.<init>()
            r0 = 4
            we6[] r1 = new defpackage.we6[r0]
            r4.a = r1
            android.graphics.Matrix[] r1 = new android.graphics.Matrix[r0]
            r4.b = r1
            android.graphics.Matrix[] r1 = new android.graphics.Matrix[r0]
            r4.c = r1
            android.graphics.PointF r1 = new android.graphics.PointF
            r1.<init>()
            r4.d = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r4.e = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r4.f = r1
            we6 r1 = new we6
            r1.<init>()
            r4.g = r1
            r1 = 2
            float[] r2 = new float[r1]
            r4.h = r2
            float[] r1 = new float[r1]
            r4.i = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r4.j = r1
            android.graphics.Path r1 = new android.graphics.Path
            r1.<init>()
            r4.k = r1
            r1 = 1
            r4.l = r1
            r1 = 0
        L47:
            if (r1 >= r0) goto L67
            we6[] r2 = r4.a
            we6 r3 = new we6
            r3.<init>()
            r2[r1] = r3
            android.graphics.Matrix[] r2 = r4.b
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r2[r1] = r3
            android.graphics.Matrix[] r2 = r4.c
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            r2[r1] = r3
            int r1 = r1 + 1
            goto L47
        L67:
            return
    }

    public final void a(defpackage.me6 r21, float[] r22, float r23, android.graphics.RectF r24, defpackage.m24 r25, android.graphics.Path r26) {
            r20 = this;
            r0 = r20
            r1 = r21
            r2 = r24
            r3 = r25
            r4 = r26
            r4.rewind()
            android.graphics.Path r5 = r0.e
            r5.rewind()
            android.graphics.Path r6 = r0.f
            r6.rewind()
            android.graphics.Path$Direction r7 = android.graphics.Path.Direction.CW
            r6.addRect(r2, r7)
            r8 = 0
        L1d:
            android.graphics.Matrix[] r9 = r0.c
            r10 = 2
            r11 = 3
            float[] r12 = r0.h
            r13 = 4
            we6[] r14 = r0.a
            android.graphics.Matrix[] r15 = r0.b
            r16 = 0
            r7 = 1
            if (r8 >= r13) goto Ldb
            if (r22 != 0) goto L41
            if (r8 == r7) goto L3e
            if (r8 == r10) goto L3b
            if (r8 == r11) goto L38
            f61 r13 = r1.f
            goto L48
        L38:
            f61 r13 = r1.e
            goto L48
        L3b:
            f61 r13 = r1.h
            goto L48
        L3e:
            f61 r13 = r1.g
            goto L48
        L41:
            xq0 r13 = new xq0
            r11 = r22[r8]
            r13.<init>(r11)
        L48:
            if (r8 == r7) goto L58
            if (r8 == r10) goto L55
            r11 = 3
            if (r8 == r11) goto L52
            q60 r11 = r1.b
            goto L5a
        L52:
            q60 r11 = r1.a
            goto L5a
        L55:
            q60 r11 = r1.d
            goto L5a
        L58:
            q60 r11 = r1.c
        L5a:
            r10 = r14[r8]
            r11.getClass()
            float r13 = r13.a(r2)
            r7 = r23
            r11.C(r10, r7, r13)
            int r10 = r8 + 1
            int r11 = r10 % 4
            int r11 = r11 * 90
            float r11 = (float) r11
            r13 = r15[r8]
            r13.reset()
            android.graphics.PointF r13 = r0.d
            r7 = 1
            if (r8 == r7) goto L9d
            r7 = 2
            if (r8 == r7) goto L93
            r7 = 3
            if (r8 == r7) goto L89
            float r7 = r2.right
            r17 = r8
            float r8 = r2.top
            r13.set(r7, r8)
            goto La6
        L89:
            r17 = r8
            float r7 = r2.left
            float r8 = r2.top
            r13.set(r7, r8)
            goto La6
        L93:
            r17 = r8
            float r7 = r2.left
            float r8 = r2.bottom
            r13.set(r7, r8)
            goto La6
        L9d:
            r17 = r8
            float r7 = r2.right
            float r8 = r2.bottom
            r13.set(r7, r8)
        La6:
            r7 = r15[r17]
            float r8 = r13.x
            float r13 = r13.y
            r7.setTranslate(r8, r13)
            r7 = r15[r17]
            r7.preRotate(r11)
            r7 = r14[r17]
            float r8 = r7.b
            r12[r16] = r8
            float r7 = r7.c
            r18 = 1
            r12[r18] = r7
            r7 = r15[r17]
            r7.mapPoints(r12)
            r7 = r9[r17]
            r7.reset()
            r7 = r9[r17]
            r8 = r12[r16]
            r12 = r12[r18]
            r7.setTranslate(r8, r12)
            r7 = r9[r17]
            r7.preRotate(r11)
            r8 = r10
            goto L1d
        Ldb:
            r7 = r16
        Ldd:
            if (r7 >= r13) goto L254
            r8 = r14[r7]
            r8.getClass()
            r10 = 0
            r12[r16] = r10
            float r8 = r8.a
            r18 = 1
            r12[r18] = r8
            r8 = r15[r7]
            r8.mapPoints(r12)
            if (r7 != 0) goto Lfc
            r8 = r12[r16]
            r11 = r12[r18]
            r4.moveTo(r8, r11)
            goto L103
        Lfc:
            r8 = r12[r16]
            r11 = r12[r18]
            r4.lineTo(r8, r11)
        L103:
            r8 = r14[r7]
            r11 = r15[r7]
            r8.b(r11, r4)
            if (r3 == 0) goto L139
            r8 = r14[r7]
            r11 = r15[r7]
            p24 r13 = r3.a
            r22 = r10
            java.util.BitSet r10 = r13.X
            r8.getClass()
            r2 = r16
            r10.set(r7, r2)
            ve6[] r2 = r13.L
            float r10 = r8.e
            r8.a(r10)
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>(r11)
            java.util.ArrayList r11 = new java.util.ArrayList
            java.util.ArrayList r8 = r8.g
            r11.<init>(r8)
            pe6 r8 = new pe6
            r8.<init>(r11, r10)
            r2[r7] = r8
            goto L13b
        L139:
            r22 = r10
        L13b:
            int r2 = r7 + 1
            int r8 = r2 % 4
            r10 = r14[r7]
            float r11 = r10.b
            r16 = 0
            r12[r16] = r11
            float r10 = r10.c
            r18 = 1
            r12[r18] = r10
            r10 = r15[r7]
            r10.mapPoints(r12)
            r10 = r14[r8]
            r10.getClass()
            float[] r11 = r0.i
            r11[r16] = r22
            float r10 = r10.a
            r11[r18] = r10
            r10 = r15[r8]
            r10.mapPoints(r11)
            r10 = r12[r16]
            r13 = r11[r16]
            float r10 = r10 - r13
            r13 = r9
            double r9 = (double) r10
            r19 = r12[r18]
            r11 = r11[r18]
            float r11 = r19 - r11
            r23 = r13
            r19 = r14
            double r13 = (double) r11
            double r9 = java.lang.Math.hypot(r9, r13)
            float r9 = (float) r9
            r10 = 981668463(0x3a83126f, float:0.001)
            float r9 = r9 - r10
            r10 = r22
            float r9 = java.lang.Math.max(r9, r10)
            r10 = r19[r7]
            float r11 = r10.b
            r16 = 0
            r12[r16] = r11
            float r10 = r10.c
            r11 = 1
            r12[r11] = r10
            r10 = r15[r7]
            r10.mapPoints(r12)
            if (r7 == r11) goto L1a7
            r10 = 3
            if (r7 == r10) goto L1a7
            float r10 = r24.centerY()
            r13 = r12[r11]
            float r10 = r10 - r13
            java.lang.Math.abs(r10)
            goto L1b3
        L1a7:
            float r10 = r24.centerX()
            r16 = 0
            r11 = r12[r16]
            float r10 = r10 - r11
            java.lang.Math.abs(r10)
        L1b3:
            r10 = 1132920832(0x43870000, float:270.0)
            we6 r11 = r0.g
            r13 = 0
            r11.d(r13, r10, r13)
            r10 = 1
            if (r7 == r10) goto L1ce
            r10 = 2
            if (r7 == r10) goto L1ca
            r13 = 3
            if (r7 == r13) goto L1c7
            cs1 r14 = r1.j
            goto L1d2
        L1c7:
            cs1 r14 = r1.i
            goto L1d2
        L1ca:
            r13 = 3
            cs1 r14 = r1.l
            goto L1d2
        L1ce:
            r10 = 2
            r13 = 3
            cs1 r14 = r1.k
        L1d2:
            r14.getClass()
            r14 = 0
            r11.c(r9, r14)
            android.graphics.Path r9 = r0.j
            r9.reset()
            r14 = r23[r7]
            r11.b(r14, r9)
            boolean r14 = r0.l
            if (r14 == 0) goto L1f4
            boolean r14 = r0.b(r9, r7)
            if (r14 != 0) goto L1f7
            boolean r8 = r0.b(r9, r8)
            if (r8 == 0) goto L1f4
            goto L1f7
        L1f4:
            r18 = 1
            goto L219
        L1f7:
            android.graphics.Path$Op r8 = android.graphics.Path.Op.DIFFERENCE
            r9.op(r9, r6, r8)
            r14 = 0
            r16 = 0
            r12[r16] = r14
            float r8 = r11.a
            r18 = 1
            r12[r18] = r8
            r8 = r23[r7]
            r8.mapPoints(r12)
            r8 = r12[r16]
            r9 = r12[r18]
            r5.moveTo(r8, r9)
            r8 = r23[r7]
            r11.b(r8, r5)
            goto L21e
        L219:
            r8 = r23[r7]
            r11.b(r8, r4)
        L21e:
            if (r3 == 0) goto L247
            r8 = r23[r7]
            p24 r9 = r3.a
            java.util.BitSet r14 = r9.X
            int r10 = r7 + 4
            r13 = 0
            r14.set(r10, r13)
            ve6[] r9 = r9.R
            float r10 = r11.e
            r11.a(r10)
            android.graphics.Matrix r10 = new android.graphics.Matrix
            r10.<init>(r8)
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.ArrayList r11 = r11.g
            r8.<init>(r11)
            pe6 r11 = new pe6
            r11.<init>(r8, r10)
            r9[r7] = r11
            goto L248
        L247:
            r13 = 0
        L248:
            r9 = r23
            r7 = r2
            r16 = r13
            r14 = r19
            r13 = 4
            r2 = r24
            goto Ldd
        L254:
            r4.close()
            r5.close()
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L265
            android.graphics.Path$Op r0 = android.graphics.Path.Op.UNION
            r4.op(r5, r0)
        L265:
            return
    }

    public final boolean b(android.graphics.Path r3, int r4) {
            r2 = this;
            android.graphics.Path r0 = r2.k
            r0.reset()
            we6[] r1 = r2.a
            r1 = r1[r4]
            android.graphics.Matrix[] r2 = r2.b
            r2 = r2[r4]
            r1.b(r2, r0)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r4 = 1
            r3.computeBounds(r2, r4)
            r0.computeBounds(r2, r4)
            android.graphics.Path$Op r1 = android.graphics.Path.Op.INTERSECT
            r3.op(r0, r1)
            r3.computeBounds(r2, r4)
            boolean r3 = r2.isEmpty()
            if (r3 == 0) goto L3f
            float r3 = r2.width()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r3 <= 0) goto L3d
            float r2 = r2.height()
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L3d
            goto L3f
        L3d:
            r2 = 0
            return r2
        L3f:
            return r4
    }
}
