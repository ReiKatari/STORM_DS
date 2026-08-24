package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l72  reason: default package */
/* loaded from: classes.dex */
public final class l72 {
    public final int a;
    public final int b;
    public final byte[] c;

    public l72(byte[] r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r2
            r0.b = r3
            r0.c = r1
            return
    }

    public static defpackage.l72 a(long r4, java.nio.ByteOrder r6) {
            r0 = 1
            long[] r1 = new long[r0]
            r2 = 0
            r1[r2] = r4
            int[] r4 = defpackage.s72.r
            r5 = 4
            r4 = r4[r5]
            byte[] r4 = new byte[r4]
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            r4.order(r6)
            r2 = r1[r2]
            int r6 = (int) r2
            r4.putInt(r6)
            l72 r6 = new l72
            byte[] r4 = r4.array()
            r6.<init>(r4, r5, r0)
            return r6
    }

    public static defpackage.l72 b(defpackage.p72 r4, java.nio.ByteOrder r5) {
            p72[] r4 = new defpackage.p72[]{r4}
            int[] r0 = defpackage.s72.r
            r1 = 5
            r0 = r0[r1]
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.order(r5)
            r5 = 0
            r4 = r4[r5]
            long r2 = r4.a
            int r5 = (int) r2
            r0.putInt(r5)
            long r4 = r4.b
            int r4 = (int) r4
            r0.putInt(r4)
            l72 r4 = new l72
            byte[] r5 = r0.array()
            r0 = 1
            r4.<init>(r5, r1, r0)
            return r4
    }

    public static defpackage.l72 c(int r2, java.nio.ByteOrder r3) {
            int[] r2 = new int[]{r2}
            int[] r0 = defpackage.s72.r
            r1 = 3
            r0 = r0[r1]
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r0.order(r3)
            r3 = 0
            r2 = r2[r3]
            short r2 = (short) r2
            r0.putShort(r2)
            l72 r2 = new l72
            byte[] r3 = r0.array()
            r0 = 1
            r2.<init>(r3, r1, r0)
            return r2
    }

    public final double d(java.nio.ByteOrder r4) {
            r3 = this;
            java.io.Serializable r3 = r3.g(r4)
            if (r3 == 0) goto L6e
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L11
            java.lang.String r3 = (java.lang.String) r3
            double r3 = java.lang.Double.parseDouble(r3)
            return r3
        L11:
            boolean r4 = r3 instanceof long[]
            java.lang.String r0 = "There are more than one component"
            r1 = 0
            r2 = 1
            if (r4 == 0) goto L28
            long[] r3 = (long[]) r3
            int r4 = r3.length
            if (r4 != r2) goto L22
            r0 = r3[r1]
            double r3 = (double) r0
            return r3
        L22:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            r3.<init>(r0)
            throw r3
        L28:
            boolean r4 = r3 instanceof int[]
            if (r4 == 0) goto L3b
            int[] r3 = (int[]) r3
            int r4 = r3.length
            if (r4 != r2) goto L35
            r3 = r3[r1]
            double r3 = (double) r3
            return r3
        L35:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            r3.<init>(r0)
            throw r3
        L3b:
            boolean r4 = r3 instanceof double[]
            if (r4 == 0) goto L4d
            double[] r3 = (double[]) r3
            int r4 = r3.length
            if (r4 != r2) goto L47
            r0 = r3[r1]
            return r0
        L47:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            r3.<init>(r0)
            throw r3
        L4d:
            boolean r4 = r3 instanceof defpackage.p72[]
            if (r4 == 0) goto L66
            p72[] r3 = (defpackage.p72[]) r3
            int r4 = r3.length
            if (r4 != r2) goto L60
            r3 = r3[r1]
            long r0 = r3.a
            double r0 = (double) r0
            long r3 = r3.b
            double r3 = (double) r3
            double r0 = r0 / r3
            return r0
        L60:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            r3.<init>(r0)
            throw r3
        L66:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            java.lang.String r4 = "Couldn't find a double value"
            r3.<init>(r4)
            throw r3
        L6e:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            java.lang.String r4 = "NULL can't be converted to a double value"
            r3.<init>(r4)
            throw r3
    }

    public final int e(java.nio.ByteOrder r4) {
            r3 = this;
            java.io.Serializable r3 = r3.g(r4)
            if (r3 == 0) goto L42
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L11
            java.lang.String r3 = (java.lang.String) r3
            int r3 = java.lang.Integer.parseInt(r3)
            return r3
        L11:
            boolean r4 = r3 instanceof long[]
            java.lang.String r0 = "There are more than one component"
            r1 = 0
            r2 = 1
            if (r4 == 0) goto L28
            long[] r3 = (long[]) r3
            int r4 = r3.length
            if (r4 != r2) goto L22
            r0 = r3[r1]
            int r3 = (int) r0
            return r3
        L22:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            r3.<init>(r0)
            throw r3
        L28:
            boolean r4 = r3 instanceof int[]
            if (r4 == 0) goto L3a
            int[] r3 = (int[]) r3
            int r4 = r3.length
            if (r4 != r2) goto L34
            r3 = r3[r1]
            return r3
        L34:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            r3.<init>(r0)
            throw r3
        L3a:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            java.lang.String r4 = "Couldn't find a integer value"
            r3.<init>(r4)
            throw r3
        L42:
            java.lang.NumberFormatException r3 = new java.lang.NumberFormatException
            java.lang.String r4 = "NULL can't be converted to a integer value"
            r3.<init>(r4)
            throw r3
    }

    public final java.lang.String f(java.nio.ByteOrder r6) {
            r5 = this;
            java.io.Serializable r5 = r5.g(r6)
            if (r5 != 0) goto L8
            goto L95
        L8:
            boolean r6 = r5 instanceof java.lang.String
            if (r6 == 0) goto Lf
            java.lang.String r5 = (java.lang.String) r5
            return r5
        Lf:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            boolean r0 = r5 instanceof long[]
            java.lang.String r1 = ","
            r2 = 0
            if (r0 == 0) goto L33
            long[] r5 = (long[]) r5
        L1d:
            int r0 = r5.length
            if (r2 >= r0) goto L2e
            r3 = r5[r2]
            r6.append(r3)
            int r2 = r2 + 1
            int r0 = r5.length
            if (r2 == r0) goto L1d
            r6.append(r1)
            goto L1d
        L2e:
            java.lang.String r5 = r6.toString()
            return r5
        L33:
            boolean r0 = r5 instanceof int[]
            if (r0 == 0) goto L4f
            int[] r5 = (int[]) r5
        L39:
            int r0 = r5.length
            if (r2 >= r0) goto L4a
            r0 = r5[r2]
            r6.append(r0)
            int r2 = r2 + 1
            int r0 = r5.length
            if (r2 == r0) goto L39
            r6.append(r1)
            goto L39
        L4a:
            java.lang.String r5 = r6.toString()
            return r5
        L4f:
            boolean r0 = r5 instanceof double[]
            if (r0 == 0) goto L6b
            double[] r5 = (double[]) r5
        L55:
            int r0 = r5.length
            if (r2 >= r0) goto L66
            r3 = r5[r2]
            r6.append(r3)
            int r2 = r2 + 1
            int r0 = r5.length
            if (r2 == r0) goto L55
            r6.append(r1)
            goto L55
        L66:
            java.lang.String r5 = r6.toString()
            return r5
        L6b:
            boolean r0 = r5 instanceof defpackage.p72[]
            if (r0 == 0) goto L95
            p72[] r5 = (defpackage.p72[]) r5
        L71:
            int r0 = r5.length
            if (r2 >= r0) goto L90
            r0 = r5[r2]
            long r3 = r0.a
            r6.append(r3)
            r0 = 47
            r6.append(r0)
            r0 = r5[r2]
            long r3 = r0.b
            r6.append(r3)
            int r2 = r2 + 1
            int r0 = r5.length
            if (r2 == r0) goto L71
            r6.append(r1)
            goto L71
        L90:
            java.lang.String r5 = r6.toString()
            return r5
        L95:
            r5 = 0
            return r5
    }

    public final java.io.Serializable g(java.nio.ByteOrder r13) {
            r12 = this;
            byte[] r0 = r12.c
            java.lang.String r1 = "IOException occurred while closing InputStream"
            java.lang.String r2 = "ExifInterface"
            r3 = 0
            j72 r4 = new j72     // Catch: java.lang.Throwable -> L11e java.io.IOException -> L120
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L11e java.io.IOException -> L120
            r4.B = r13     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r13 = r12.a     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r5 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r7 = 0
            int r12 = r12.b
            switch(r13) {
                case 1: goto Lf7;
                case 2: goto Lb7;
                case 3: goto Laa;
                case 4: goto L9b;
                case 5: goto L81;
                case 6: goto Lf7;
                case 7: goto Lb7;
                case 8: goto L74;
                case 9: goto L67;
                case 10: goto L4f;
                case 11: goto L41;
                case 12: goto L24;
                default: goto L1b;
            }
        L1b:
            r4.close()     // Catch: java.io.IOException -> L1f
            return r3
        L1f:
            r12 = move-exception
            android.util.Log.e(r2, r1, r12)
            return r3
        L24:
            double[] r13 = new double[r12]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        L26:
            if (r7 >= r12) goto L38
            double r5 = r4.readDouble()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r13[r7] = r5     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r7 = r7 + 1
            goto L26
        L31:
            r12 = move-exception
            r3 = r4
            goto L132
        L35:
            r12 = move-exception
            goto L122
        L38:
            r4.close()     // Catch: java.io.IOException -> L3c
            return r13
        L3c:
            r12 = move-exception
            android.util.Log.e(r2, r1, r12)
            return r13
        L41:
            double[] r13 = new double[r12]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        L43:
            if (r7 >= r12) goto L38
            float r0 = r4.readFloat()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            double r5 = (double) r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r13[r7] = r5     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r7 = r7 + 1
            goto L43
        L4f:
            p72[] r13 = new defpackage.p72[r12]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        L51:
            if (r7 >= r12) goto L38
            int r0 = r4.readInt()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            long r5 = (long) r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r0 = r4.readInt()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            long r8 = (long) r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            p72 r0 = new p72     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r0.<init>(r5, r8)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r13[r7] = r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r7 = r7 + 1
            goto L51
        L67:
            int[] r13 = new int[r12]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        L69:
            if (r7 >= r12) goto L38
            int r0 = r4.readInt()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r13[r7] = r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r7 = r7 + 1
            goto L69
        L74:
            int[] r13 = new int[r12]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        L76:
            if (r7 >= r12) goto L38
            short r0 = r4.readShort()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r13[r7] = r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r7 = r7 + 1
            goto L76
        L81:
            p72[] r13 = new defpackage.p72[r12]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        L83:
            if (r7 >= r12) goto L38
            int r0 = r4.readInt()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            long r8 = (long) r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            long r8 = r8 & r5
            int r0 = r4.readInt()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            long r10 = (long) r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            long r10 = r10 & r5
            p72 r0 = new p72     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r0.<init>(r8, r10)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r13[r7] = r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r7 = r7 + 1
            goto L83
        L9b:
            long[] r13 = new long[r12]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        L9d:
            if (r7 >= r12) goto L38
            int r0 = r4.readInt()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            long r8 = (long) r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            long r8 = r8 & r5
            r13[r7] = r8     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r7 = r7 + 1
            goto L9d
        Laa:
            int[] r13 = new int[r12]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        Lac:
            if (r7 >= r12) goto L38
            int r0 = r4.readUnsignedShort()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r13[r7] = r0     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r7 = r7 + 1
            goto Lac
        Lb7:
            byte[] r13 = defpackage.s72.s     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r13 = r13.length     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            if (r12 < r13) goto Lcd
            r13 = r7
        Lbd:
            byte[] r5 = defpackage.s72.s     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r6 = r5.length     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            if (r13 >= r6) goto Lcc
            r6 = r0[r13]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r5 = r5[r13]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            if (r6 == r5) goto Lc9
            goto Lcd
        Lc9:
            int r13 = r13 + 1
            goto Lbd
        Lcc:
            int r7 = r5.length     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        Lcd:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r13.<init>()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        Ld2:
            if (r7 >= r12) goto Lea
            r5 = r0[r7]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            if (r5 != 0) goto Ld9
            goto Lea
        Ld9:
            r6 = 32
            if (r5 < r6) goto Le2
            char r5 = (char) r5     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r13.append(r5)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            goto Le7
        Le2:
            r5 = 63
            r13.append(r5)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        Le7:
            int r7 = r7 + 1
            goto Ld2
        Lea:
            java.lang.String r12 = r13.toString()     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
        Lee:
            r4.close()     // Catch: java.io.IOException -> Lf2
            return r12
        Lf2:
            r13 = move-exception
            android.util.Log.e(r2, r1, r13)
            return r12
        Lf7:
            int r12 = r0.length     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r13 = 1
            if (r12 != r13) goto L116
            r12 = r0[r7]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            if (r12 < 0) goto L116
            if (r12 > r13) goto L116
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            int r12 = r12 + 48
            char r12 = (char) r12     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            char[] r13 = new char[r13]     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r13[r7] = r12     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r4.close()     // Catch: java.io.IOException -> L111
            return r0
        L111:
            r12 = move-exception
            android.util.Log.e(r2, r1, r12)
            return r0
        L116:
            java.lang.String r12 = new java.lang.String     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            java.nio.charset.Charset r13 = defpackage.s72.A     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            r12.<init>(r0, r13)     // Catch: java.lang.Throwable -> L31 java.io.IOException -> L35
            goto Lee
        L11e:
            r12 = move-exception
            goto L132
        L120:
            r12 = move-exception
            r4 = r3
        L122:
            java.lang.String r13 = "IOException occurred during reading a value"
            android.util.Log.w(r2, r13, r12)     // Catch: java.lang.Throwable -> L31
            if (r4 == 0) goto L131
            r4.close()     // Catch: java.io.IOException -> L12d
            goto L131
        L12d:
            r12 = move-exception
            android.util.Log.e(r2, r1, r12)
        L131:
            return r3
        L132:
            if (r3 == 0) goto L13c
            r3.close()     // Catch: java.io.IOException -> L138
            goto L13c
        L138:
            r13 = move-exception
            android.util.Log.e(r2, r1, r13)
        L13c:
            throw r12
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            java.lang.String[] r1 = defpackage.s72.q
            int r2 = r3.a
            r1 = r1[r2]
            r0.append(r1)
            java.lang.String r1 = ", data length:"
            r0.append(r1)
            byte[] r3 = r3.c
            int r3 = r3.length
            java.lang.String r1 = ")"
            java.lang.String r3 = defpackage.lb1.o(r0, r3, r1)
            return r3
    }
}
