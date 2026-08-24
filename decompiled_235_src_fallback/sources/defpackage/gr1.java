package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gr1  reason: default package */
/* loaded from: classes.dex */
public class gr1 implements defpackage.ph4, defpackage.gt1, defpackage.ru6 {
    public static final defpackage.gr1 L = null;
    public static final java.lang.String[] R = null;
    public static final defpackage.gr1 X = null;
    public static final defpackage.gr1 Y = null;
    public static final defpackage.gr1 Z = null;
    public static final defpackage.gr1 d0 = null;
    public static final defpackage.gr1 e0 = null;
    public static final defpackage.gr1 f0 = null;
    public static final defpackage.gr1 g0 = null;
    public static final defpackage.gr1 h0 = null;
    public final /* synthetic */ int A;
    public java.lang.String B;

    static {
            gr1 r0 = new gr1
            r0.<init>()
            defpackage.gr1.L = r0
            java.lang.String r0 = "decelerate"
            java.lang.String r1 = "linear"
            java.lang.String r2 = "standard"
            java.lang.String r3 = "accelerate"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            defpackage.gr1.R = r0
            gr1 r0 = new gr1
            java.lang.String r1 = "NONE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.gr1.X = r0
            gr1 r0 = new gr1
            java.lang.String r1 = "FULL"
            r0.<init>(r1, r2)
            defpackage.gr1.Y = r0
            gr1 r0 = new gr1
            java.lang.String r1 = "VERTICAL"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.gr1.Z = r0
            gr1 r0 = new gr1
            java.lang.String r1 = "HORIZONTAL"
            r0.<init>(r1, r2)
            defpackage.gr1.d0 = r0
            gr1 r0 = new gr1
            java.lang.String r1 = "FLAT"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.gr1.e0 = r0
            gr1 r0 = new gr1
            java.lang.String r1 = "HALF_OPENED"
            r0.<init>(r1, r2)
            defpackage.gr1.f0 = r0
            gr1 r0 = new gr1
            java.lang.String r1 = "FOLD"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.gr1.g0 = r0
            gr1 r0 = new gr1
            java.lang.String r1 = "HINGE"
            r0.<init>(r1, r2)
            defpackage.gr1.h0 = r0
            return
    }

    public gr1() {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            java.lang.String r0 = "identity"
            r1.B = r0
            return
    }

    public gr1(java.lang.String r2) {
            r1 = this;
            r0 = 5
            r1.A = r0
            r2.getClass()
            r1.<init>()
            r1.B = r2
            return
    }

    public /* synthetic */ gr1(java.lang.String r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    public static defpackage.gr1 c(java.lang.String r19) {
            r0 = r19
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.lang.String r1 = "cubic"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L14
            fr1 r1 = new fr1
            r1.<init>(r0)
            return r1
        L14:
            java.lang.String r1 = "spline"
            boolean r1 = r0.startsWith(r1)
            r2 = 3
            r3 = -1
            r4 = 0
            r5 = 2
            r6 = 44
            r7 = 1
            r8 = 40
            if (r1 == 0) goto Lf3
            sq6 r1 = new sq6
            r1.<init>()
            r1.B = r0
            int r9 = r0.length()
            int r9 = r9 / r5
            double[] r9 = new double[r9]
            int r8 = r0.indexOf(r8)
            int r8 = r8 + r7
            int r10 = r0.indexOf(r6, r8)
            r11 = r4
        L3d:
            if (r10 == r3) goto L57
            java.lang.String r8 = r0.substring(r8, r10)
            java.lang.String r8 = r8.trim()
            int r12 = r11 + 1
            double r13 = java.lang.Double.parseDouble(r8)
            r9[r11] = r13
            int r8 = r10 + 1
            int r10 = r0.indexOf(r6, r8)
            r11 = r12
            goto L3d
        L57:
            r3 = 41
            int r3 = r0.indexOf(r3, r8)
            java.lang.String r0 = r0.substring(r8, r3)
            java.lang.String r0 = r0.trim()
            int r3 = r11 + 1
            double r12 = java.lang.Double.parseDouble(r0)
            r9[r11] = r12
            double[] r0 = java.util.Arrays.copyOf(r9, r3)
            int r3 = r0.length
            int r3 = r3 * r2
            int r3 = r3 - r5
            int r2 = r0.length
            int r2 = r2 - r7
            double r8 = (double) r2
            r10 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r8 = r10 / r8
            int[] r5 = new int[r5]
            r5[r7] = r7
            r5[r4] = r3
            java.lang.Class r6 = java.lang.Double.TYPE
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r6, r5)
            double[][] r5 = (double[][]) r5
            double[] r3 = new double[r3]
            r6 = r4
        L8c:
            int r7 = r0.length
            if (r6 >= r7) goto Lbb
            r12 = r0[r6]
            int r7 = r6 + r2
            r14 = r5[r7]
            r14[r4] = r12
            double r14 = (double) r6
            double r14 = r14 * r8
            r3[r7] = r14
            if (r6 <= 0) goto Lb8
            int r7 = r2 * 2
            int r7 = r7 + r6
            r16 = r5[r7]
            double r17 = r12 + r10
            r16[r4] = r17
            double r16 = r14 + r10
            r3[r7] = r16
            int r7 = r6 + (-1)
            r16 = r5[r7]
            double r12 = r12 - r10
            double r12 = r12 - r8
            r16[r4] = r12
            r12 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r14 = r14 + r12
            double r14 = r14 - r8
            r3[r7] = r14
        Lb8:
            int r6 = r6 + 1
            goto L8c
        Lbb:
            g74 r0 = new g74
            r0.<init>(r3, r5)
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = " 0 "
            r3.<init>(r4)
            r4 = 0
            double r4 = r0.Z(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.println(r3)
            java.io.PrintStream r2 = java.lang.System.out
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = " 1 "
            r3.<init>(r4)
            double r4 = r0.Z(r10)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.println(r3)
            r1.i0 = r0
            return r1
        Lf3:
            java.lang.String r1 = "Schlick"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L12d
            n66 r1 = new n66
            r1.<init>()
            r1.B = r0
            int r2 = r0.indexOf(r8)
            int r3 = r0.indexOf(r6, r2)
            int r2 = r2 + r7
            java.lang.String r2 = r0.substring(r2, r3)
            java.lang.String r2 = r2.trim()
            double r4 = java.lang.Double.parseDouble(r2)
            r1.i0 = r4
            int r3 = r3 + r7
            int r2 = r0.indexOf(r6, r3)
            java.lang.String r0 = r0.substring(r3, r2)
            java.lang.String r0 = r0.trim()
            double r2 = java.lang.Double.parseDouble(r0)
            r1.j0 = r2
            return r1
        L12d:
            int r1 = r0.hashCode()
            switch(r1) {
                case -1354466595: goto L16b;
                case -1263948740: goto L160;
                case -1197605014: goto L155;
                case -1102672091: goto L14c;
                case -749065269: goto L141;
                case 1312628413: goto L136;
                default: goto L134;
            }
        L134:
            r2 = r3
            goto L175
        L136:
            java.lang.String r1 = "standard"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L13f
            goto L134
        L13f:
            r2 = 5
            goto L175
        L141:
            java.lang.String r1 = "overshoot"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L14a
            goto L134
        L14a:
            r2 = 4
            goto L175
        L14c:
            java.lang.String r1 = "linear"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L175
            goto L134
        L155:
            java.lang.String r1 = "anticipate"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15e
            goto L134
        L15e:
            r2 = r5
            goto L175
        L160:
            java.lang.String r1 = "decelerate"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L169
            goto L134
        L169:
            r2 = r7
            goto L175
        L16b:
            java.lang.String r1 = "accelerate"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L174
            goto L134
        L174:
            r2 = r4
        L175:
            switch(r2) {
                case 0: goto L1bc;
                case 1: goto L1b4;
                case 2: goto L1ac;
                case 3: goto L1a4;
                case 4: goto L19c;
                case 5: goto L194;
                default: goto L178;
            }
        L178:
            java.io.PrintStream r0 = java.lang.System.err
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "transitionEasing syntax error syntax:transitionEasing=\"cubic(1.0,0.5,0.0,0.6)\" or "
            r1.<init>(r2)
            java.lang.String[] r2 = defpackage.gr1.R
            java.lang.String r2 = java.util.Arrays.toString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.println(r1)
            gr1 r0 = defpackage.gr1.L
            return r0
        L194:
            fr1 r0 = new fr1
            java.lang.String r1 = "cubic(0.4, 0.0, 0.2, 1)"
            r0.<init>(r1)
            return r0
        L19c:
            fr1 r0 = new fr1
            java.lang.String r1 = "cubic(0.34, 1.56, 0.64, 1)"
            r0.<init>(r1)
            return r0
        L1a4:
            fr1 r0 = new fr1
            java.lang.String r1 = "cubic(1, 1, 0, 0)"
            r0.<init>(r1)
            return r0
        L1ac:
            fr1 r0 = new fr1
            java.lang.String r1 = "cubic(0.36, 0, 0.66, -0.56)"
            r0.<init>(r1)
            return r0
        L1b4:
            fr1 r0 = new fr1
            java.lang.String r1 = "cubic(0.0, 0.0, 0.2, 0.95)"
            r0.<init>(r1)
            return r0
        L1bc:
            fr1 r0 = new fr1
            java.lang.String r1 = "cubic(0.4, 0.05, 0.8, 0.7)"
            r0.<init>(r1)
            return r0
    }

    public double a(double r1) {
            r0 = this;
            return r1
    }

    public double b(double r1) {
            r0 = this;
            r0 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            return r0
    }

    @Override // defpackage.gt1
    public java.lang.Object d() {
            r0 = this;
            return r0
    }

    @Override // defpackage.ph4
    public java.lang.Object e() {
            r1 = this;
            ne3 r0 = new ne3
            java.lang.String r1 = r1.B
            r0.<init>(r1)
            throw r0
    }

    @Override // defpackage.ru6
    public java.lang.String g() {
            r0 = this;
            java.lang.String r0 = r0.B
            return r0
    }

    @Override // defpackage.ru6
    public void l(defpackage.qu6 r1) {
            r0 = this;
            return
    }

    @Override // defpackage.gt1
    public boolean m(java.lang.CharSequence r1, int r2, int r3, defpackage.re7 r4) {
            r0 = this;
            java.lang.CharSequence r1 = r1.subSequence(r2, r3)
            java.lang.String r0 = r0.B
            boolean r0 = android.text.TextUtils.equals(r1, r0)
            if (r0 == 0) goto L16
            int r0 = r4.c
            r0 = r0 & 3
            r0 = r0 | 4
            r4.c = r0
            r0 = 0
            return r0
        L16:
            r0 = 1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.A
            switch(r0) {
                case 0: goto L26;
                case 1: goto L23;
                case 2: goto L20;
                case 3: goto L1d;
                case 4: goto L1a;
                case 5: goto L5;
                case 6: goto L5;
                case 7: goto L5;
                case 8: goto L5;
                case 9: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "<"
            r0.<init>(r1)
            java.lang.String r2 = r2.B
            r1 = 62
            java.lang.String r2 = defpackage.lb1.q(r0, r2, r1)
            return r2
        L1a:
            java.lang.String r2 = r2.B
            return r2
        L1d:
            java.lang.String r2 = r2.B
            return r2
        L20:
            java.lang.String r2 = r2.B
            return r2
        L23:
            java.lang.String r2 = r2.B
            return r2
        L26:
            java.lang.String r2 = r2.B
            return r2
    }
}
