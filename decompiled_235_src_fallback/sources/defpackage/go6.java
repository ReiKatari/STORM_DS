package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: go6  reason: default package */
/* loaded from: classes.dex */
public final class go6 {
    public double a;
    public double b;
    public boolean c;
    public double d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public final defpackage.gv j;

    public go6() {
            r2 = this;
            r2.<init>()
            r0 = 4654311885213007872(0x4097700000000000, double:1500.0)
            double r0 = java.lang.Math.sqrt(r0)
            r2.a = r0
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r2.b = r0
            r0 = 0
            r2.c = r0
            r0 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            r2.i = r0
            gv r0 = new gv
            r0.<init>()
            r2.j = r0
            return
    }

    public go6(float r3) {
            r2 = this;
            r2.<init>()
            r0 = 4654311885213007872(0x4097700000000000, double:1500.0)
            double r0 = java.lang.Math.sqrt(r0)
            r2.a = r0
            r0 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r2.b = r0
            r0 = 0
            r2.c = r0
            gv r0 = new gv
            r0.<init>()
            r2.j = r0
            double r0 = (double) r3
            r2.i = r0
            return
    }

    public final void a(float r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 < 0) goto Lc
            double r0 = (double) r3
            r2.b = r0
            r3 = 0
            r2.c = r3
            return
        Lc:
            java.lang.String r2 = "Damping ratio must be non-negative"
            defpackage.i.h(r2)
            return
    }

    public final void b(float r3) {
            r2 = this;
            r0 = 0
            int r0 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r0 <= 0) goto L10
            double r0 = (double) r3
            double r0 = java.lang.Math.sqrt(r0)
            r2.a = r0
            r3 = 0
            r2.c = r3
            return
        L10:
            java.lang.String r2 = "Spring stiffness constant must be positive."
            defpackage.i.h(r2)
            return
    }

    public final defpackage.gv c(double r17, double r19, long r21) {
            r16 = this;
            r0 = r16
            boolean r1 = r0.c
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r1 == 0) goto Lb
        L8:
            r4 = r21
            goto L55
        Lb:
            double r4 = r0.i
            r6 = 9218868437227405311(0x7fefffffffffffff, double:1.7976931348623157E308)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L120
            double r4 = r0.b
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L3b
            double r6 = -r4
            double r8 = r0.a
            double r6 = r6 * r8
            double r4 = r4 * r4
            double r4 = r4 - r2
            double r4 = java.lang.Math.sqrt(r4)
            double r4 = r4 * r8
            double r4 = r4 + r6
            r0.f = r4
            double r4 = r0.b
            double r6 = -r4
            double r8 = r0.a
            double r6 = r6 * r8
            double r4 = r4 * r4
            double r4 = r4 - r2
            double r4 = java.lang.Math.sqrt(r4)
            double r4 = r4 * r8
            double r6 = r6 - r4
            r0.g = r6
            goto L51
        L3b:
            r6 = 0
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto L51
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 >= 0) goto L51
            double r6 = r0.a
            double r4 = r4 * r4
            double r4 = r2 - r4
            double r4 = java.lang.Math.sqrt(r4)
            double r4 = r4 * r6
            r0.h = r4
        L51:
            r1 = 1
            r0.c = r1
            goto L8
        L55:
            double r4 = (double) r4
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 / r6
            double r6 = r0.i
            double r6 = r17 - r6
            double r8 = r0.b
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r10 = 4613303445314885481(0x4005bf0a8b145769, double:2.718281828459045)
            if (r1 <= 0) goto L9b
            double r1 = r0.g
            double r8 = r1 * r6
            double r8 = r8 - r19
            double r12 = r0.f
            double r12 = r1 - r12
            double r8 = r8 / r12
            double r6 = r6 - r8
            double r1 = r1 * r4
            double r1 = java.lang.Math.pow(r10, r1)
            double r1 = r1 * r6
            double r12 = r0.f
            double r12 = r12 * r4
            double r12 = java.lang.Math.pow(r10, r12)
            double r12 = r12 * r8
            double r12 = r12 + r1
            double r1 = r0.g
            double r6 = r6 * r1
            double r1 = r1 * r4
            double r1 = java.lang.Math.pow(r10, r1)
            double r1 = r1 * r6
            double r6 = r0.f
            double r8 = r8 * r6
            double r6 = r6 * r4
            double r3 = java.lang.Math.pow(r10, r6)
            double r3 = r3 * r8
            double r3 = r3 + r1
            goto L114
        L9b:
            if (r1 != 0) goto Lc3
            double r1 = r0.a
            double r8 = r1 * r6
            double r8 = r8 + r19
            double r12 = r8 * r4
            double r12 = r12 + r6
            double r1 = -r1
            double r1 = r1 * r4
            double r1 = java.lang.Math.pow(r10, r1)
            double r1 = r1 * r12
            double r6 = r0.a
            double r6 = -r6
            double r6 = r6 * r4
            double r6 = java.lang.Math.pow(r10, r6)
            double r6 = r6 * r12
            double r12 = r0.a
            double r12 = -r12
            double r6 = r6 * r12
            double r12 = r12 * r4
            double r3 = java.lang.Math.pow(r10, r12)
            double r3 = r3 * r8
            double r3 = r3 + r6
            r12 = r1
            goto L114
        Lc3:
            double r12 = r0.h
            double r2 = r2 / r12
            double r12 = r0.a
            double r14 = r8 * r12
            double r14 = r14 * r6
            double r14 = r14 + r19
            double r14 = r14 * r2
            double r1 = -r8
            double r1 = r1 * r12
            double r1 = r1 * r4
            double r1 = java.lang.Math.pow(r10, r1)
            double r8 = r0.h
            double r8 = r8 * r4
            double r8 = java.lang.Math.cos(r8)
            double r8 = r8 * r6
            double r12 = r0.h
            double r12 = r12 * r4
            double r12 = java.lang.Math.sin(r12)
            double r12 = r12 * r14
            double r12 = r12 + r8
            double r12 = r12 * r1
            double r1 = r0.a
            double r8 = -r1
            double r8 = r8 * r12
            double r10 = r0.b
            double r8 = r8 * r10
            double r10 = -r10
            double r10 = r10 * r1
            double r10 = r10 * r4
            r1 = 4613303445314885481(0x4005bf0a8b145769, double:2.718281828459045)
            double r1 = java.lang.Math.pow(r1, r10)
            double r10 = r0.h
            r17 = r1
            double r1 = -r10
            double r1 = r1 * r6
            double r10 = r10 * r4
            double r6 = java.lang.Math.sin(r10)
            double r6 = r6 * r1
            double r1 = r0.h
            double r14 = r14 * r1
            double r1 = r1 * r4
            double r1 = java.lang.Math.cos(r1)
            double r1 = r1 * r14
            double r1 = r1 + r6
            double r1 = r1 * r17
            double r3 = r1 + r8
        L114:
            double r1 = r0.i
            double r12 = r12 + r1
            float r1 = (float) r12
            gv r0 = r0.j
            r0.a = r1
            float r1 = (float) r3
            r0.b = r1
            return r0
        L120:
            java.lang.String r0 = "Error: Final position of the spring must be set before the animation starts"
            defpackage.i.m(r0)
            r0 = 0
            return r0
    }
}
