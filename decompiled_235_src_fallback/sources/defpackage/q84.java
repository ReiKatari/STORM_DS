package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q84  reason: default package */
/* loaded from: classes.dex */
public abstract class q84 extends defpackage.ga2 {
    public boolean L;
    public int R;
    public int X;
    public final java.util.ArrayList Y;
    public final java.util.ArrayList Z;
    public final java.util.ArrayList d0;
    public final java.util.ArrayList e0;

    public q84(defpackage.s03 r1, boolean r2, defpackage.u87 r3) {
            r0 = this;
            r1.getClass()
            r3.getClass()
            r0.<init>(r1, r2, r3)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.Y = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.Z = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.d0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.e0 = r1
            return
    }

    public abstract defpackage.b63 b();

    public abstract defpackage.b63 c();

    public abstract defpackage.b63 d();

    public abstract defpackage.b63 e();

    public final void f(int r10, int r11) {
            r9 = this;
            float r0 = (float) r10
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            float r2 = (float) r11
            float r2 = r2 / r1
            int r10 = java.lang.Math.min(r10, r11)
            float r10 = (float) r10
            r11 = 1049750405(0x3e91eb85, float:0.285)
            float r11 = r11 * r10
            r1 = 1047904911(0x3e75c28f, float:0.24)
            float r10 = r10 * r1
            float r10 = r10 * r10
            java.util.ArrayList r1 = r9.Y
            r1.clear()
            p84 r3 = new p84
            b63 r4 = r9.d()
            my4 r5 = new my4
            float r6 = r0 + r11
            int r6 = (int) r6
            int r7 = (int) r2
            r5.<init>(r6, r7)
            r3.<init>(r4, r5, r10)
            r1.add(r3)
            p84 r3 = new p84
            b63 r4 = r9.b()
            my4 r5 = new my4
            int r6 = (int) r0
            float r8 = r2 + r11
            int r8 = (int) r8
            r5.<init>(r6, r8)
            r3.<init>(r4, r5, r10)
            r1.add(r3)
            p84 r3 = new p84
            b63 r4 = r9.e()
            my4 r5 = new my4
            float r2 = r2 - r11
            int r2 = (int) r2
            r5.<init>(r6, r2)
            r3.<init>(r4, r5, r10)
            r1.add(r3)
            p84 r2 = new p84
            b63 r9 = r9.c()
            my4 r3 = new my4
            float r0 = r0 - r11
            int r11 = (int) r0
            r3.<init>(r11, r7)
            r2.<init>(r9, r3, r10)
            r1.add(r2)
            return
    }

    public boolean g() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final void h(float r12, float r13, java.util.ArrayList r14) {
            r11 = this;
            java.util.ArrayList r0 = r11.Y
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1b
            int r1 = r11.R
            if (r1 <= 0) goto L13
            int r2 = r11.X
            if (r2 <= 0) goto L13
            r11.f(r1, r2)
        L13:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L1b
            goto Le9
        L1b:
            java.util.ArrayList r11 = new java.util.ArrayList
            r1 = 10
            int r1 = defpackage.ht0.v0(r0, r1)
            r11.<init>(r1)
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        L2c:
            if (r3 >= r1) goto L66
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            p84 r4 = (defpackage.p84) r4
            my4 r5 = r4.b
            int r5 = r5.a
            float r5 = (float) r5
            float r5 = r12 - r5
            double r5 = (double) r5
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = java.lang.Math.pow(r5, r7)
            float r5 = (float) r5
            my4 r6 = r4.b
            int r6 = r6.b
            float r6 = (float) r6
            float r6 = r13 - r6
            double r9 = (double) r6
            double r6 = java.lang.Math.pow(r9, r7)
            float r6 = (float) r6
            float r5 = r5 + r6
            double r5 = (double) r5
            double r5 = java.lang.Math.sqrt(r5)
            float r5 = (float) r5
            java.lang.Float r5 = java.lang.Float.valueOf(r5)
            vr4 r6 = new vr4
            r6.<init>(r4, r5)
            r11.add(r6)
            goto L2c
        L66:
            zh2 r12 = new zh2
            r13 = 23
            r12.<init>(r13)
            java.util.List r11 = defpackage.gt0.d1(r11, r12)
            java.lang.Object r12 = r11.get(r2)
            vr4 r12 = (defpackage.vr4) r12
            java.lang.Object r13 = r12.A
            java.lang.Object r12 = r12.B
            r0 = r13
            p84 r0 = (defpackage.p84) r0
            float r0 = r0.c
            double r0 = (double) r0
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            r1 = 1069966950(0x3fc66666, float:1.55)
            float r1 = r1 * r0
            java.lang.Number r12 = (java.lang.Number) r12
            float r2 = r12.floatValue()
            int r1 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r1 > 0) goto Le9
            float r12 = r12.floatValue()
            p84 r13 = (defpackage.p84) r13
            b63 r1 = r13.a
            boolean r1 = r14.contains(r1)
            if (r1 != 0) goto La7
            b63 r13 = r13.a
            r14.add(r13)
        La7:
            int r13 = r11.size()
            r1 = 1
        Lac:
            if (r1 >= r13) goto Le9
            java.lang.Object r2 = r11.get(r1)
            vr4 r2 = (defpackage.vr4) r2
            java.lang.Object r3 = r2.B
            java.lang.Object r4 = r2.A
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r5 = 1069128090(0x3fb9999a, float:1.45)
            float r5 = r5 * r0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 > 0) goto Le6
            java.lang.Object r2 = r2.B
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            float r2 = r2 - r12
            r3 = 1060320051(0x3f333333, float:0.7)
            float r3 = r3 * r0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 > 0) goto Le6
            p84 r4 = (defpackage.p84) r4
            b63 r2 = r4.a
            boolean r2 = r14.contains(r2)
            if (r2 != 0) goto Le6
            b63 r2 = r4.a
            r14.add(r2)
        Le6:
            int r1 = r1 + 1
            goto Lac
        Le9:
            return
    }

    public final void i(float r4, float r5, java.util.ArrayList r6) {
            r3 = this;
            int r0 = r3.R
            float r0 = (float) r0
            r1 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r1
            int r2 = r3.X
            float r2 = (float) r2
            float r2 = r2 / r1
            float r4 = r4 - r0
            float r5 = r5 - r2
            float r0 = r4 * r4
            float r1 = r5 * r5
            float r1 = r1 + r0
            double r0 = (double) r1
            double r0 = java.lang.Math.sqrt(r0)
            float r0 = (float) r0
            int r1 = r3.R
            float r1 = (float) r1
            r2 = 1036831949(0x3dcccccd, float:0.1)
            float r1 = r1 * r2
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L24
            goto Le1
        L24:
            double r0 = (double) r5
            double r4 = (double) r4
            double r4 = java.lang.Math.atan2(r0, r4)
            double r4 = java.lang.Math.toDegrees(r4)
            float r4 = (float) r4
            r5 = 0
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 >= 0) goto L37
            r5 = 1135869952(0x43b40000, float:360.0)
            float r4 = r4 + r5
        L37:
            r5 = 1135132672(0x43a8c000, float:337.5)
            int r0 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r0 >= 0) goto Le2
            r0 = 1102315520(0x41b40000, float:22.5)
            int r1 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r1 >= 0) goto L46
            goto Le2
        L46:
            int r0 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            r1 = 1116143616(0x42870000, float:67.5)
            if (r0 > 0) goto L5f
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L5f
            b63 r4 = r3.d()
            r6.add(r4)
            b63 r3 = r3.b()
            r6.add(r3)
            return
        L5f:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r1 = 1122041856(0x42e10000, float:112.5)
            if (r0 > 0) goto L71
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L71
            b63 r3 = r3.b()
            r6.add(r3)
            return
        L71:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r1 = 1126006784(0x431d8000, float:157.5)
            if (r0 > 0) goto L8b
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L8b
            b63 r4 = r3.b()
            r6.add(r4)
            b63 r3 = r3.c()
            r6.add(r3)
            return
        L8b:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r1 = 1128955904(0x434a8000, float:202.5)
            if (r0 > 0) goto L9e
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto L9e
            b63 r3 = r3.c()
            r6.add(r3)
            return
        L9e:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r1 = 1131905024(0x43778000, float:247.5)
            if (r0 > 0) goto Lb8
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto Lb8
            b63 r4 = r3.c()
            r6.add(r4)
            b63 r3 = r3.e()
            r6.add(r3)
            return
        Lb8:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            r1 = 1133658112(0x43924000, float:292.5)
            if (r0 > 0) goto Lcb
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 > 0) goto Lcb
            b63 r3 = r3.e()
            r6.add(r3)
            return
        Lcb:
            int r0 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r0 > 0) goto Le1
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto Le1
            b63 r4 = r3.e()
            r6.add(r4)
            b63 r3 = r3.d()
            r6.add(r3)
        Le1:
            return
        Le2:
            b63 r3 = r3.d()
            r6.add(r3)
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
            r10 = this;
            s03 r0 = r10.A
            r11.getClass()
            r12.getClass()
            boolean r1 = r10.L
            r2 = 1
            if (r1 == 0) goto L1d
            int r1 = r10.R
            int r3 = r11.getWidth()
            if (r1 != r3) goto L1d
            int r1 = r10.X
            int r3 = r11.getHeight()
            if (r1 == r3) goto L36
        L1d:
            int r1 = r11.getWidth()
            r10.R = r1
            int r1 = r11.getHeight()
            r10.X = r1
            int r1 = r11.getWidth()
            int r3 = r11.getHeight()
            r10.f(r1, r3)
            r10.L = r2
        L36:
            java.util.ArrayList r1 = r10.d0
            r1.clear()
            int r3 = r12.getActionMasked()
            r4 = 0
            if (r3 == 0) goto L7a
            if (r3 == r2) goto L76
            r5 = 2
            if (r3 == r5) goto L7a
            r5 = 3
            if (r3 == r5) goto L76
            r5 = 5
            if (r3 == r5) goto L7a
            r5 = 6
            if (r3 == r5) goto L51
            goto L99
        L51:
            int r3 = r12.getActionIndex()
            int r5 = r12.getPointerCount()
            r6 = r4
        L5a:
            if (r6 >= r5) goto L99
            if (r6 == r3) goto L73
            float r7 = r12.getX(r6)
            float r8 = r12.getY(r6)
            boolean r9 = r10.g()
            if (r9 == 0) goto L70
            r10.i(r7, r8, r1)
            goto L73
        L70:
            r10.h(r7, r8, r1)
        L73:
            int r6 = r6 + 1
            goto L5a
        L76:
            r1.clear()
            goto L99
        L7a:
            int r3 = r12.getPointerCount()
            r5 = r4
        L7f:
            if (r5 >= r3) goto L99
            float r6 = r12.getX(r5)
            float r7 = r12.getY(r5)
            boolean r8 = r10.g()
            if (r8 == 0) goto L93
            r10.i(r6, r7, r1)
            goto L96
        L93:
            r10.h(r6, r7, r1)
        L96:
            int r5 = r5 + 1
            goto L7f
        L99:
            java.util.ArrayList r12 = r10.e0
            r12.clear()
            java.util.ArrayList r3 = r10.Z
            int r5 = r3.size()
            r6 = r4
        La5:
            if (r6 >= r5) goto Lba
            java.lang.Object r7 = r3.get(r6)
            int r6 = r6 + 1
            r8 = r7
            b63 r8 = (defpackage.b63) r8
            boolean r8 = r1.contains(r8)
            if (r8 != 0) goto La5
            r12.add(r7)
            goto La5
        Lba:
            int r5 = r12.size()
            r6 = r4
        Lbf:
            if (r6 >= r5) goto Lcd
            java.lang.Object r7 = r12.get(r6)
            int r6 = r6 + 1
            b63 r7 = (defpackage.b63) r7
            r0.b(r7)
            goto Lbf
        Lcd:
            boolean r5 = r12.isEmpty()
            if (r5 != 0) goto Ld8
            ea2 r5 = defpackage.ea2.KEY_RELEASE
            r10.a(r11, r5)
        Ld8:
            r12.clear()
            int r5 = r1.size()
            r6 = r4
        Le0:
            if (r6 >= r5) goto Lf5
            java.lang.Object r7 = r1.get(r6)
            int r6 = r6 + 1
            r8 = r7
            b63 r8 = (defpackage.b63) r8
            boolean r8 = r3.contains(r8)
            if (r8 != 0) goto Le0
            r12.add(r7)
            goto Le0
        Lf5:
            int r5 = r12.size()
        Lf9:
            if (r4 >= r5) goto L107
            java.lang.Object r6 = r12.get(r4)
            int r4 = r4 + 1
            b63 r6 = (defpackage.b63) r6
            r0.c(r6)
            goto Lf9
        L107:
            boolean r12 = r12.isEmpty()
            if (r12 != 0) goto L112
            ea2 r12 = defpackage.ea2.KEY_PRESS
            r10.a(r11, r12)
        L112:
            r3.clear()
            r3.addAll(r1)
            boolean r10 = r11 instanceof defpackage.r03
            if (r10 == 0) goto L11f
            r03 r11 = (defpackage.r03) r11
            goto L120
        L11f:
            r11 = 0
        L120:
            if (r11 == 0) goto L129
            java.util.Set r10 = defpackage.gt0.p1(r1)
            r11.a(r10)
        L129:
            return r2
    }
}
