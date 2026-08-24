package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hp7  reason: default package */
/* loaded from: classes.dex */
public abstract class hp7 {
    public defpackage.ci0 a;
    public java.lang.String b;
    public int c;
    public java.lang.String d;
    public int e;
    public final java.util.ArrayList f;

    public hp7() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.c = r0
            r1 = 0
            r2.d = r1
            r2.e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r2.f = r0
            return
    }

    public static defpackage.hp7 b(java.lang.String r12) {
            java.lang.String r0 = "CUSTOM"
            boolean r0 = r12.startsWith(r0)
            r1 = 1
            if (r0 == 0) goto L13
            ep7 r12 = new ep7
            r12.<init>()
            float[] r0 = new float[r1]
            r12.g = r0
            return r12
        L13:
            int r0 = r12.hashCode()
            r2 = 9
            r3 = 8
            r4 = 7
            r5 = 6
            r6 = 5
            r7 = 4
            r8 = 3
            r9 = 2
            r10 = 0
            r11 = -1
            switch(r0) {
                case -1249320806: goto Lc8;
                case -1249320805: goto Lbd;
                case -1225497657: goto Lb2;
                case -1225497656: goto La7;
                case -1225497655: goto L9c;
                case -1001078227: goto L91;
                case -908189618: goto L86;
                case -908189617: goto L7a;
                case -797520672: goto L6d;
                case -40300674: goto L60;
                case -4379043: goto L52;
                case 37232917: goto L44;
                case 92909918: goto L36;
                case 156108012: goto L28;
                default: goto L26;
            }
        L26:
            goto Ld2
        L28:
            java.lang.String r0 = "waveOffset"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L32
            goto Ld2
        L32:
            r11 = 13
            goto Ld2
        L36:
            java.lang.String r0 = "alpha"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L40
            goto Ld2
        L40:
            r11 = 12
            goto Ld2
        L44:
            java.lang.String r0 = "transitionPathRotate"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L4e
            goto Ld2
        L4e:
            r11 = 11
            goto Ld2
        L52:
            java.lang.String r0 = "elevation"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L5c
            goto Ld2
        L5c:
            r11 = 10
            goto Ld2
        L60:
            java.lang.String r0 = "rotation"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L6a
            goto Ld2
        L6a:
            r11 = r2
            goto Ld2
        L6d:
            java.lang.String r0 = "waveVariesBy"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L77
            goto Ld2
        L77:
            r11 = r3
            goto Ld2
        L7a:
            java.lang.String r0 = "scaleY"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L84
            goto Ld2
        L84:
            r11 = r4
            goto Ld2
        L86:
            java.lang.String r0 = "scaleX"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L8f
            goto Ld2
        L8f:
            r11 = r5
            goto Ld2
        L91:
            java.lang.String r0 = "progress"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto L9a
            goto Ld2
        L9a:
            r11 = r6
            goto Ld2
        L9c:
            java.lang.String r0 = "translationZ"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto La5
            goto Ld2
        La5:
            r11 = r7
            goto Ld2
        La7:
            java.lang.String r0 = "translationY"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto Lb0
            goto Ld2
        Lb0:
            r11 = r8
            goto Ld2
        Lb2:
            java.lang.String r0 = "translationX"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto Lbb
            goto Ld2
        Lbb:
            r11 = r9
            goto Ld2
        Lbd:
            java.lang.String r0 = "rotationY"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto Lc6
            goto Ld2
        Lc6:
            r11 = r1
            goto Ld2
        Lc8:
            java.lang.String r0 = "rotationX"
            boolean r12 = r12.equals(r0)
            if (r12 != 0) goto Ld1
            goto Ld2
        Ld1:
            r11 = r10
        Ld2:
            switch(r11) {
                case 0: goto L127;
                case 1: goto L121;
                case 2: goto L11b;
                case 3: goto L115;
                case 4: goto L10f;
                case 5: goto L107;
                case 6: goto L101;
                case 7: goto Lfb;
                case 8: goto Lf5;
                case 9: goto Lef;
                case 10: goto Le9;
                case 11: goto Le3;
                case 12: goto Ldd;
                case 13: goto Ld7;
                default: goto Ld5;
            }
        Ld5:
            r12 = 0
            return r12
        Ld7:
            dp7 r12 = new dp7
            r12.<init>(r10)
            return r12
        Ldd:
            dp7 r12 = new dp7
            r12.<init>(r10)
            return r12
        Le3:
            fp7 r12 = new fp7
            r12.<init>()
            return r12
        Le9:
            dp7 r12 = new dp7
            r12.<init>(r1)
            return r12
        Lef:
            dp7 r12 = new dp7
            r12.<init>(r9)
            return r12
        Lf5:
            dp7 r12 = new dp7
            r12.<init>(r10)
            return r12
        Lfb:
            dp7 r12 = new dp7
            r12.<init>(r5)
            return r12
        L101:
            dp7 r12 = new dp7
            r12.<init>(r6)
            return r12
        L107:
            gp7 r12 = new gp7
            r12.<init>()
            r12.g = r10
            return r12
        L10f:
            dp7 r12 = new dp7
            r12.<init>(r2)
            return r12
        L115:
            dp7 r12 = new dp7
            r12.<init>(r3)
            return r12
        L11b:
            dp7 r12 = new dp7
            r12.<init>(r4)
            return r12
        L121:
            dp7 r12 = new dp7
            r12.<init>(r7)
            return r12
        L127:
            dp7 r12 = new dp7
            r12.<init>(r8)
            return r12
    }

    public final float a(float r25) {
            r24 = this;
            r0 = r24
            r1 = r25
            ci0 r0 = r0.a
            java.lang.Object r2 = r0.g
            ak7 r2 = (defpackage.ak7) r2
            java.lang.Object r3 = r0.h
            double[] r3 = (double[]) r3
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L18
            double r7 = (double) r1
            r2.a0(r7, r3)
            goto L33
        L18:
            java.lang.Object r2 = r0.e
            float[] r2 = (float[]) r2
            r2 = r2[r6]
            double r7 = (double) r2
            r3[r6] = r7
            java.lang.Object r2 = r0.f
            float[] r2 = (float[]) r2
            r2 = r2[r6]
            double r7 = (double) r2
            r3[r5] = r7
            java.lang.Object r2 = r0.b
            float[] r2 = (float[]) r2
            r2 = r2[r6]
            double r7 = (double) r2
            r3[r4] = r7
        L33:
            java.lang.Object r2 = r0.h
            double[] r2 = (double[]) r2
            r6 = r2[r6]
            r8 = r2[r5]
            java.lang.Object r2 = r0.a
            dk0 r2 = (defpackage.dk0) r2
            double r10 = (double) r1
            r2.getClass()
            r12 = 0
            int r1 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            r16 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            if (r1 > 0) goto L50
            r24 = r4
        L4d:
            r18 = 4611686018427387904(0x4000000000000000, double:2.0)
            goto L9c
        L50:
            int r1 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r1 < 0) goto L59
            r24 = r4
            r12 = r16
            goto L4d
        L59:
            java.lang.Object r1 = r2.X
            double[] r1 = (double[]) r1
            int r1 = java.util.Arrays.binarySearch(r1, r10)
            if (r1 >= 0) goto L65
            int r1 = -r1
            int r1 = r1 - r5
        L65:
            java.lang.Object r3 = r2.R
            float[] r3 = (float[]) r3
            r5 = r3[r1]
            int r12 = r1 + (-1)
            r3 = r3[r12]
            float r5 = r5 - r3
            r24 = r4
            double r4 = (double) r5
            java.lang.Object r13 = r2.X
            double[] r13 = (double[]) r13
            r18 = r13[r1]
            r20 = r13[r12]
            double r18 = r18 - r20
            double r4 = r4 / r18
            java.lang.Object r1 = r2.B
            double[] r1 = (double[]) r1
            r12 = r1[r12]
            r18 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r14 = (double) r3
            double r22 = r4 * r20
            double r14 = r14 - r22
            double r22 = r10 - r20
            double r22 = r22 * r14
            double r22 = r22 + r12
            double r10 = r10 * r10
            double r20 = r20 * r20
            double r10 = r10 - r20
            double r10 = r10 * r4
            double r10 = r10 / r18
            double r12 = r10 + r22
        L9c:
            double r12 = r12 + r8
            int r1 = r2.L
            r3 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            r10 = 4616189618054758400(0x4010000000000000, double:4.0)
            switch(r1) {
                case 1: goto Lec;
                case 2: goto Le1;
                case 3: goto Ld8;
                case 4: goto Lcf;
                case 5: goto Lc8;
                case 6: goto Lba;
                case 7: goto Laf;
                default: goto La9;
            }
        La9:
            double r3 = r3 * r12
            double r1 = java.lang.Math.sin(r3)
            goto Lf5
        Laf:
            java.lang.Object r1 = r2.Y
            g74 r1 = (defpackage.g74) r1
            double r12 = r12 % r16
            double r1 = r1.Z(r12)
            goto Lf5
        Lba:
            double r12 = r12 * r10
            double r12 = r12 % r10
            double r12 = r12 - r18
            double r1 = java.lang.Math.abs(r12)
            double r1 = r16 - r1
            double r1 = r1 * r1
        Lc5:
            double r1 = r16 - r1
            goto Lf5
        Lc8:
            double r8 = r8 + r12
            double r8 = r8 * r3
            double r1 = java.lang.Math.cos(r8)
            goto Lf5
        Lcf:
            double r12 = r12 * r18
            double r12 = r12 + r16
            double r12 = r12 % r18
            double r1 = r16 - r12
            goto Lf5
        Ld8:
            double r12 = r12 * r18
            double r12 = r12 + r16
            double r12 = r12 % r18
            double r1 = r12 - r16
            goto Lf5
        Le1:
            double r12 = r12 * r10
            double r12 = r12 + r16
            double r12 = r12 % r10
            double r12 = r12 - r18
            double r1 = java.lang.Math.abs(r12)
            goto Lc5
        Lec:
            r1 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r12 = r12 % r16
            double r1 = r1 - r12
            double r1 = java.lang.Math.signum(r1)
        Lf5:
            java.lang.Object r0 = r0.h
            double[] r0 = (double[]) r0
            r3 = r0[r24]
            double r1 = r1 * r3
            double r1 = r1 + r6
            float r0 = (float) r1
            return r0
    }

    public void c(defpackage.j11 r1) {
            r0 = this;
            return
    }

    public abstract void d(android.view.View r1, float r2);

    public final void e() {
            r29 = this;
            r0 = r29
            java.util.ArrayList r1 = r0.f
            int r2 = r1.size()
            if (r2 != 0) goto Lb
            return
        Lb:
            zh2 r3 = new zh2
            r4 = 18
            r3.<init>(r4)
            java.util.Collections.sort(r1, r3)
            double[] r3 = new double[r2]
            r4 = 2
            int[] r5 = new int[r4]
            r6 = 1
            r7 = 3
            r5[r6] = r7
            r8 = 0
            r5[r8] = r2
            java.lang.Class r9 = java.lang.Double.TYPE
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r9, r5)
            double[][] r5 = (double[][]) r5
            ci0 r10 = new ci0
            int r11 = r0.c
            java.lang.String r12 = r0.d
            r10.<init>()
            dk0 r13 = new dk0
            r14 = 5
            r13.<init>(r14)
            float[] r14 = new float[r8]
            r13.R = r14
            double[] r14 = new double[r8]
            r13.X = r14
            r10.a = r13
            r13.L = r11
            if (r12 == 0) goto Lfa
            int r11 = r12.length()
            int r11 = r11 / r4
            double[] r11 = new double[r11]
            r16 = r7
            r7 = 40
            int r7 = r12.indexOf(r7)
            int r7 = r7 + r6
            r17 = r8
            r8 = 44
            int r18 = r12.indexOf(r8, r7)
            r19 = r18
            r18 = r6
            r6 = r19
            r19 = r17
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L68:
            r14 = -1
            if (r6 == r14) goto L84
            java.lang.String r7 = r12.substring(r7, r6)
            java.lang.String r7 = r7.trim()
            int r14 = r19 + 1
            double r22 = java.lang.Double.parseDouble(r7)
            r11[r19] = r22
            int r7 = r6 + 1
            int r6 = r12.indexOf(r8, r7)
            r19 = r14
            goto L68
        L84:
            r6 = 41
            int r6 = r12.indexOf(r6, r7)
            java.lang.String r6 = r12.substring(r7, r6)
            java.lang.String r6 = r6.trim()
            int r7 = r19 + 1
            double r14 = java.lang.Double.parseDouble(r6)
            r11[r19] = r14
            double[] r6 = java.util.Arrays.copyOf(r11, r7)
            int r7 = r6.length
            int r7 = r7 * 3
            int r7 = r7 - r4
            int r8 = r6.length
            int r8 = r8 + (-1)
            double r11 = (double) r8
            double r14 = r20 / r11
            int[] r11 = new int[r4]
            r11[r18] = r18
            r11[r17] = r7
            java.lang.Object r11 = java.lang.reflect.Array.newInstance(r9, r11)
            double[][] r11 = (double[][]) r11
            double[] r7 = new double[r7]
            r19 = r4
            r12 = r17
        Lba:
            int r4 = r6.length
            if (r12 >= r4) goto Lf2
            r22 = r6[r12]
            int r4 = r12 + r8
            r24 = r11[r4]
            r24[r17] = r22
            r24 = r14
            double r14 = (double) r12
            double r14 = r14 * r24
            r7[r4] = r14
            if (r12 <= 0) goto Led
            int r4 = r8 * 2
            int r4 = r4 + r12
            r26 = r11[r4]
            double r27 = r22 + r20
            r26[r17] = r27
            double r26 = r14 + r20
            r7[r4] = r26
            int r4 = r12 + (-1)
            r26 = r11[r4]
            double r22 = r22 - r20
            double r22 = r22 - r24
            r26[r17] = r22
            r22 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            double r14 = r14 + r22
            double r14 = r14 - r24
            r7[r4] = r14
        Led:
            int r12 = r12 + 1
            r14 = r24
            goto Lba
        Lf2:
            g74 r4 = new g74
            r4.<init>(r7, r11)
            r13.Y = r4
            goto L104
        Lfa:
            r19 = r4
            r18 = r6
            r16 = r7
            r17 = r8
            r20 = 4607182418800017408(0x3ff0000000000000, double:1.0)
        L104:
            float[] r4 = new float[r2]
            r10.b = r4
            double[] r4 = new double[r2]
            r10.c = r4
            float[] r4 = new float[r2]
            r10.d = r4
            float[] r4 = new float[r2]
            r10.e = r4
            float[] r4 = new float[r2]
            r10.f = r4
            float[] r2 = new float[r2]
            r0.a = r10
            int r2 = r1.size()
            r4 = r17
            r6 = r4
        L123:
            if (r6 >= r2) goto L179
            java.lang.Object r7 = r1.get(r6)
            int r6 = r6 + 1
            rg3 r7 = (defpackage.rg3) r7
            float r8 = r7.d
            double r10 = (double) r8
            r12 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            double r10 = r10 * r12
            r3[r4] = r10
            r10 = r5[r4]
            float r11 = r7.b
            double r12 = (double) r11
            r10[r17] = r12
            float r12 = r7.c
            double r13 = (double) r12
            r10[r18] = r13
            float r13 = r7.e
            double r14 = (double) r13
            r10[r19] = r14
            ci0 r10 = r0.a
            int r7 = r7.a
            java.lang.Object r14 = r10.c
            double[] r14 = (double[]) r14
            r15 = r1
            r22 = r2
            double r1 = (double) r7
            r23 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r1 = r1 / r23
            r14[r4] = r1
            java.lang.Object r1 = r10.d
            float[] r1 = (float[]) r1
            r1[r4] = r8
            java.lang.Object r1 = r10.e
            float[] r1 = (float[]) r1
            r1[r4] = r12
            java.lang.Object r1 = r10.f
            float[] r1 = (float[]) r1
            r1[r4] = r13
            java.lang.Object r1 = r10.b
            float[] r1 = (float[]) r1
            r1[r4] = r11
            int r4 = r4 + 1
            r1 = r15
            r2 = r22
            goto L123
        L179:
            ci0 r0 = r0.a
            java.lang.Object r1 = r0.d
            float[] r1 = (float[]) r1
            java.lang.Object r2 = r0.a
            dk0 r2 = (defpackage.dk0) r2
            java.lang.Object r4 = r0.c
            double[] r4 = (double[]) r4
            int r6 = r4.length
            r7 = r19
            int[] r8 = new int[r7]
            r8[r18] = r16
            r8[r17] = r6
            java.lang.Object r6 = java.lang.reflect.Array.newInstance(r9, r8)
            double[][] r6 = (double[][]) r6
            java.lang.Object r8 = r0.b
            float[] r8 = (float[]) r8
            int r9 = r8.length
            int r9 = r9 + r7
            double[] r9 = new double[r9]
            r0.h = r9
            int r9 = r8.length
            int r9 = r9 + r7
            double[] r7 = new double[r9]
            r9 = r4[r17]
            r11 = 0
            int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r7 <= 0) goto L1b1
            r7 = r1[r17]
            r2.f(r11, r7)
        L1b1:
            int r7 = r4.length
            int r7 = r7 + (-1)
            r9 = r4[r7]
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 >= 0) goto L1c1
            r7 = r1[r7]
            r9 = r20
            r2.f(r9, r7)
        L1c1:
            r7 = r17
        L1c3:
            int r9 = r6.length
            if (r7 >= r9) goto L1eb
            r9 = r6[r7]
            java.lang.Object r10 = r0.e
            float[] r10 = (float[]) r10
            r10 = r10[r7]
            double r13 = (double) r10
            r9[r17] = r13
            java.lang.Object r10 = r0.f
            float[] r10 = (float[]) r10
            r10 = r10[r7]
            double r13 = (double) r10
            r9[r18] = r13
            r10 = r8[r7]
            double r13 = (double) r10
            r19 = 2
            r9[r19] = r13
            r9 = r4[r7]
            r13 = r1[r7]
            r2.f(r9, r13)
            int r7 = r7 + 1
            goto L1c3
        L1eb:
            r7 = r11
            r1 = r17
        L1ee:
            java.lang.Object r9 = r2.R
            float[] r9 = (float[]) r9
            int r10 = r9.length
            if (r1 >= r10) goto L1fc
            r9 = r9[r1]
            double r9 = (double) r9
            double r7 = r7 + r9
            int r1 = r1 + 1
            goto L1ee
        L1fc:
            r9 = r11
            r1 = r18
        L1ff:
            java.lang.Object r13 = r2.R
            float[] r13 = (float[]) r13
            int r14 = r13.length
            r15 = 1073741824(0x40000000, float:2.0)
            if (r1 >= r14) goto L224
            int r14 = r1 + (-1)
            r16 = r13[r14]
            r13 = r13[r1]
            float r16 = r16 + r13
            float r13 = r16 / r15
            java.lang.Object r15 = r2.X
            double[] r15 = (double[]) r15
            r19 = r15[r1]
            r14 = r15[r14]
            double r19 = r19 - r14
            double r13 = (double) r13
            double r19 = r19 * r13
            double r9 = r19 + r9
            int r1 = r1 + 1
            goto L1ff
        L224:
            r1 = r17
        L226:
            java.lang.Object r13 = r2.R
            float[] r13 = (float[]) r13
            int r14 = r13.length
            if (r1 >= r14) goto L23c
            r14 = r13[r1]
            r19 = r11
            double r11 = r7 / r9
            float r11 = (float) r11
            float r14 = r14 * r11
            r13[r1] = r14
            int r1 = r1 + 1
            r11 = r19
            goto L226
        L23c:
            r19 = r11
            java.lang.Object r1 = r2.B
            double[] r1 = (double[]) r1
            r1[r17] = r19
            r1 = r18
        L246:
            java.lang.Object r7 = r2.R
            float[] r7 = (float[]) r7
            int r8 = r7.length
            if (r1 >= r8) goto L26c
            int r8 = r1 + (-1)
            r9 = r7[r8]
            r7 = r7[r1]
            float r9 = r9 + r7
            float r9 = r9 / r15
            java.lang.Object r7 = r2.X
            double[] r7 = (double[]) r7
            r10 = r7[r1]
            r12 = r7[r8]
            double r10 = r10 - r12
            java.lang.Object r7 = r2.B
            double[] r7 = (double[]) r7
            r12 = r7[r8]
            double r8 = (double) r9
            double r10 = r10 * r8
            double r10 = r10 + r12
            r7[r1] = r10
            int r1 = r1 + 1
            goto L246
        L26c:
            int r1 = r4.length
            r2 = r18
            if (r1 <= r2) goto L27a
            r1 = r17
            ak7 r2 = defpackage.ak7.U(r1, r4, r6)
            r0.g = r2
            goto L27f
        L27a:
            r1 = r17
            r2 = 0
            r0.g = r2
        L27f:
            defpackage.ak7.U(r1, r3, r5)
            return
    }

    public final java.lang.String toString() {
            r6 = this;
            java.lang.String r0 = r6.b
            java.text.DecimalFormat r1 = new java.text.DecimalFormat
            java.lang.String r2 = "##.##"
            r1.<init>(r2)
            java.util.ArrayList r6 = r6.f
            int r2 = r6.size()
            r3 = 0
        L10:
            if (r3 >= r2) goto L3e
            java.lang.Object r4 = r6.get(r3)
            int r3 = r3 + 1
            rg3 r4 = (defpackage.rg3) r4
            java.lang.String r5 = "["
            java.lang.StringBuilder r0 = defpackage.i61.r(r0, r5)
            int r5 = r4.a
            r0.append(r5)
            java.lang.String r5 = " , "
            r0.append(r5)
            float r4 = r4.b
            double r4 = (double) r4
            java.lang.String r4 = r1.format(r4)
            r0.append(r4)
            java.lang.String r4 = "] "
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            goto L10
        L3e:
            return r0
    }
}
