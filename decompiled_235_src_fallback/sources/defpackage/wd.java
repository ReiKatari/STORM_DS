package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wd  reason: default package */
/* loaded from: classes.dex */
public final class wd implements defpackage.xj0 {
    public android.graphics.Canvas a;
    public android.graphics.Rect b;
    public android.graphics.Rect c;

    public wd() {
            r1 = this;
            r1.<init>()
            android.graphics.Canvas r0 = defpackage.xd.a
            r1.a = r0
            return
    }

    @Override // defpackage.xj0
    public final void a(defpackage.zh r3, defpackage.aj r4) {
            r2 = this;
            android.graphics.Canvas r2 = r2.a
            android.graphics.Bitmap r3 = defpackage.l.h(r3)
            r0 = 0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            java.lang.Object r4 = r4.L
            android.graphics.Paint r4 = (android.graphics.Paint) r4
            r2.drawBitmap(r3, r1, r0, r4)
            return
    }

    @Override // defpackage.xj0
    public final void b(float r1, float r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a
            r0.scale(r1, r2)
            return
    }

    @Override // defpackage.xj0
    public final void c(float r1) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a
            r0.rotate(r1)
            return
    }

    @Override // defpackage.xj0
    public final void d(float r4, long r5, defpackage.aj r7) {
            r3 = this;
            android.graphics.Canvas r3 = r3.a
            r0 = 32
            long r0 = r5 >> r0
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r1 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r5 = r5 & r1
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            java.lang.Object r6 = r7.L
            android.graphics.Paint r6 = (android.graphics.Paint) r6
            r3.drawCircle(r0, r5, r4, r6)
            return
    }

    @Override // defpackage.xj0
    public final void e(defpackage.zh r9, long r10, long r12, long r14, defpackage.aj r16) {
            r8 = this;
            android.graphics.Rect r0 = r8.b
            if (r0 != 0) goto L12
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.b = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r8.c = r0
        L12:
            android.graphics.Canvas r0 = r8.a
            android.graphics.Bitmap r9 = defpackage.l.h(r9)
            android.graphics.Rect r1 = r8.b
            r1.getClass()
            r2 = 32
            long r3 = r10 >> r2
            int r3 = (int) r3
            r1.left = r3
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r10 = r10 & r4
            int r10 = (int) r10
            r1.top = r10
            long r6 = r12 >> r2
            int r11 = (int) r6
            int r3 = r3 + r11
            r1.right = r3
            long r6 = r12 & r4
            int r11 = (int) r6
            int r10 = r10 + r11
            r1.bottom = r10
            android.graphics.Rect r8 = r8.c
            r8.getClass()
            r10 = 0
            r8.left = r10
            r8.top = r10
            long r10 = r14 >> r2
            int r10 = (int) r10
            r8.right = r10
            long r10 = r14 & r4
            int r10 = (int) r10
            r8.bottom = r10
            r10 = r16
            java.lang.Object r10 = r10.L
            android.graphics.Paint r10 = (android.graphics.Paint) r10
            r0.drawBitmap(r9, r1, r8, r10)
            return
    }

    @Override // defpackage.xj0
    public final void f(defpackage.hj r2, defpackage.aj r3) {
            r1 = this;
            android.graphics.Canvas r1 = r1.a
            boolean r0 = r2 instanceof defpackage.hj
            if (r0 == 0) goto L10
            android.graphics.Path r2 = r2.a
            android.graphics.Paint r3 = defpackage.nc1.Q(r3)
            r1.drawPath(r2, r3)
            return
        L10:
            java.lang.String r1 = "Unable to obtain android.graphics.Path"
            defpackage.fa6.h(r1)
            return
    }

    @Override // defpackage.xj0
    public final void g(float r1, float r2, float r3, float r4, float r5, float r6, defpackage.aj r7) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a
            java.lang.Object r7 = r7.L
            android.graphics.Paint r7 = (android.graphics.Paint) r7
            r0.drawRoundRect(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    @Override // defpackage.xj0
    public final void h() {
            r0 = this;
            android.graphics.Canvas r0 = r0.a
            r0.save()
            return
    }

    @Override // defpackage.xj0
    public final void i(long r7, long r9, defpackage.aj r11) {
            r6 = this;
            android.graphics.Canvas r6 = r6.a
            r0 = 32
            long r1 = r7 >> r0
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r2
            int r7 = (int) r7
            float r8 = java.lang.Float.intBitsToFloat(r7)
            long r4 = r9 >> r0
            int r7 = (int) r4
            float r7 = java.lang.Float.intBitsToFloat(r7)
            long r9 = r9 & r2
            int r9 = (int) r9
            float r10 = java.lang.Float.intBitsToFloat(r9)
            java.lang.Object r9 = r11.L
            r11 = r9
            android.graphics.Paint r11 = (android.graphics.Paint) r11
            r9 = r7
            r7 = r1
            r6.drawLine(r7, r8, r9, r10, r11)
            return
    }

    @Override // defpackage.xj0
    public final void j() {
            r1 = this;
            android.graphics.Canvas r1 = r1.a
            r0 = 0
            defpackage.nw7.X(r1, r0)
            return
    }

    @Override // defpackage.xj0
    public final void k(float r1, float r2, float r3, float r4, defpackage.aj r5) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a
            android.graphics.Paint r5 = defpackage.nc1.Q(r5)
            r0.drawRect(r1, r2, r3, r4, r5)
            return
    }

    @Override // defpackage.xj0
    public final void l(float[] r2) {
            r1 = this;
            boolean r0 = defpackage.nj2.w(r2)
            if (r0 != 0) goto L13
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            defpackage.hv.X(r0, r2)
            android.graphics.Canvas r1 = r1.a
            r1.concat(r0)
        L13:
            return
    }

    @Override // defpackage.xj0
    public final void m(defpackage.hj r2) {
            r1 = this;
            android.graphics.Canvas r1 = r1.a
            boolean r0 = r2 instanceof defpackage.hj
            if (r0 == 0) goto Le
            android.graphics.Path r2 = r2.a
            android.graphics.Region$Op r0 = android.graphics.Region.Op.INTERSECT
            r1.clipPath(r2, r0)
            return
        Le:
            java.lang.String r1 = "Unable to obtain android.graphics.Path"
            defpackage.fa6.h(r1)
            return
    }

    @Override // defpackage.xj0
    public final void n(float r1, float r2, float r3, float r4, int r5) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a
            if (r5 != 0) goto L7
            android.graphics.Region$Op r5 = android.graphics.Region.Op.DIFFERENCE
            goto L9
        L7:
            android.graphics.Region$Op r5 = android.graphics.Region.Op.INTERSECT
        L9:
            r0.clipRect(r1, r2, r3, r4, r5)
            return
    }

    @Override // defpackage.xj0
    public final void o(float r1, float r2) {
            r0 = this;
            android.graphics.Canvas r0 = r0.a
            r0.translate(r1, r2)
            return
    }

    @Override // defpackage.xj0
    public final void p() {
            r0 = this;
            android.graphics.Canvas r0 = r0.a
            r0.restore()
            return
    }

    @Override // defpackage.xj0
    public final void r(java.util.ArrayList r9, defpackage.aj r10) {
            r8 = this;
            int r0 = r9.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L2f
            java.lang.Object r2 = r9.get(r1)
            jk4 r2 = (defpackage.jk4) r2
            long r2 = r2.a
            android.graphics.Canvas r4 = r8.a
            r5 = 32
            long r5 = r2 >> r5
            int r5 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r6
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            java.lang.Object r3 = r10.L
            android.graphics.Paint r3 = (android.graphics.Paint) r3
            r4.drawPoint(r5, r2, r3)
            int r1 = r1 + 1
            goto L5
        L2f:
            return
    }

    @Override // defpackage.xj0
    public final void s(defpackage.of5 r8, defpackage.aj r9) {
            r7 = this;
            android.graphics.Canvas r0 = r7.a
            float r1 = r8.a
            float r2 = r8.b
            float r3 = r8.c
            float r4 = r8.d
            java.lang.Object r7 = r9.L
            r5 = r7
            android.graphics.Paint r5 = (android.graphics.Paint) r5
            r6 = 31
            r0.saveLayer(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // defpackage.xj0
    public final void t() {
            r1 = this;
            android.graphics.Canvas r1 = r1.a
            r0 = 1
            defpackage.nw7.X(r1, r0)
            return
    }

    @Override // defpackage.xj0
    public final void u(float r10, float r11, float r12, float r13, float r14, float r15, defpackage.aj r16) {
            r9 = this;
            android.graphics.Canvas r0 = r9.a
            r9 = r16
            java.lang.Object r9 = r9.L
            r8 = r9
            android.graphics.Paint r8 = (android.graphics.Paint) r8
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r0.drawArc(r1, r2, r3, r4, r5, r6, r7, r8)
            return
    }
}
