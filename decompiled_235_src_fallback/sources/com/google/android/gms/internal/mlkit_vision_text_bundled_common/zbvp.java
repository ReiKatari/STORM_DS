package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbvp<T> implements com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx<T> {
    private static final int[] zba = null;
    private static final sun.misc.Unsafe zbb = null;
    private final int[] zbc;
    private final java.lang.Object[] zbd;
    private final int zbe;
    private final int zbf;
    private final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm zbg;
    private final boolean zbh;
    private final int[] zbi;
    private final int zbj;
    private final int zbk;
    private final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl zbl;
    private final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtq zbm;

    static {
            r0 = 0
            int[] r0 = new int[r0]
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zba = r0
            sun.misc.Unsafe r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbg()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbb = r0
            return
    }

    private zbvp(int[] r1, java.lang.Object[] r2, int r3, int r4, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r5, boolean r6, int[] r7, int r8, int r9, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvs r10, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuy r11, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl r12, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtq r13, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvh r14) {
            r0 = this;
            r0.<init>()
            r0.zbc = r1
            r0.zbd = r2
            r0.zbe = r3
            r0.zbf = r4
            r1 = 0
            if (r13 == 0) goto L13
            boolean r2 = r5 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub
            if (r2 == 0) goto L13
            r1 = 1
        L13:
            r0.zbh = r1
            r0.zbi = r7
            r0.zbj = r8
            r0.zbk = r9
            r0.zbl = r12
            r0.zbm = r13
            r0.zbg = r5
            return
    }

    private static void zbA(java.lang.Object r1) {
            boolean r0 = zbL(r1)
            if (r0 == 0) goto L7
            return
        L7:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r0 = "Mutating immutable message: "
            java.lang.String r1 = r0.concat(r1)
            defpackage.i.h(r1)
            return
    }

    private final void zbB(java.lang.Object r6, java.lang.Object r7, int r8) {
            r5 = this;
            boolean r0 = r5.zbI(r7, r8)
            if (r0 != 0) goto L7
            return
        L7:
            int r0 = r5.zbs(r8)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r0 = r0 & r1
            sun.misc.Unsafe r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbb
            long r2 = (long) r0
            java.lang.Object r0 = r1.getObject(r7, r2)
            if (r0 == 0) goto L53
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r7 = r5.zbv(r8)
            boolean r4 = r5.zbI(r6, r8)
            if (r4 != 0) goto L3a
            boolean r4 = zbL(r0)
            if (r4 != 0) goto L2c
            r1.putObject(r6, r2, r0)
            goto L36
        L2c:
            java.lang.Object r4 = r7.zbe()
            r7.zbg(r4, r0)
            r1.putObject(r6, r2, r4)
        L36:
            r5.zbD(r6, r8)
            return
        L3a:
            java.lang.Object r5 = r1.getObject(r6, r2)
            boolean r8 = zbL(r5)
            if (r8 != 0) goto L4f
            java.lang.Object r8 = r7.zbe()
            r7.zbg(r8, r5)
            r1.putObject(r6, r2, r8)
            r5 = r8
        L4f:
            r7.zbg(r5, r0)
            return
        L53:
            int[] r5 = r5.zbc
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            r5 = r5[r8]
            java.lang.String r7 = r7.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "Source subfield "
            r8.<init>(r0)
            r8.append(r5)
            java.lang.String r5 = " is present but null: "
            r8.append(r5)
            r8.append(r7)
            java.lang.String r5 = r8.toString()
            r6.<init>(r5)
            throw r6
    }

    private final void zbC(java.lang.Object r7, java.lang.Object r8, int r9) {
            r6 = this;
            int[] r0 = r6.zbc
            r0 = r0[r9]
            boolean r1 = r6.zbM(r8, r0, r9)
            if (r1 != 0) goto Lb
            return
        Lb:
            int r1 = r6.zbs(r9)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            sun.misc.Unsafe r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbb
            long r3 = (long) r1
            java.lang.Object r1 = r2.getObject(r8, r3)
            if (r1 == 0) goto L57
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r8 = r6.zbv(r9)
            boolean r5 = r6.zbM(r7, r0, r9)
            if (r5 != 0) goto L3e
            boolean r5 = zbL(r1)
            if (r5 != 0) goto L30
            r2.putObject(r7, r3, r1)
            goto L3a
        L30:
            java.lang.Object r5 = r8.zbe()
            r8.zbg(r5, r1)
            r2.putObject(r7, r3, r5)
        L3a:
            r6.zbE(r7, r0, r9)
            return
        L3e:
            java.lang.Object r6 = r2.getObject(r7, r3)
            boolean r9 = zbL(r6)
            if (r9 != 0) goto L53
            java.lang.Object r9 = r8.zbe()
            r8.zbg(r9, r6)
            r2.putObject(r7, r3, r9)
            r6 = r9
        L53:
            r8.zbg(r6, r1)
            return
        L57:
            int[] r6 = r6.zbc
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            r6 = r6[r9]
            java.lang.String r8 = r8.toString()
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r0 = "Source subfield "
            r9.<init>(r0)
            r9.append(r6)
            java.lang.String r6 = " is present but null: "
            r9.append(r6)
            r9.append(r8)
            java.lang.String r6 = r9.toString()
            r7.<init>(r6)
            throw r7
    }

    private final void zbD(java.lang.Object r5, int r6) {
            r4 = this;
            int r4 = r4.zbp(r6)
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r6 = r6 & r4
            long r0 = (long) r6
            r2 = 1048575(0xfffff, double:5.18065E-318)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 != 0) goto L11
            return
        L11:
            int r4 = r4 >>> 20
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r5, r0)
            r2 = 1
            int r4 = r2 << r4
            r4 = r4 | r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbq(r5, r0, r4)
            return
    }

    private final void zbE(java.lang.Object r3, int r4, int r5) {
            r2 = this;
            int r2 = r2.zbp(r5)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r5
            long r0 = (long) r2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbq(r3, r0, r4)
            return
    }

    private final void zbF(java.lang.Object r4, int r5, java.lang.Object r6) {
            r3 = this;
            sun.misc.Unsafe r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbb
            int r1 = r3.zbs(r5)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            long r1 = (long) r1
            r0.putObject(r4, r1, r6)
            r3.zbD(r4, r5)
            return
    }

    private final void zbG(java.lang.Object r4, int r5, int r6, java.lang.Object r7) {
            r3 = this;
            sun.misc.Unsafe r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbb
            int r1 = r3.zbs(r6)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            long r1 = (long) r1
            r0.putObject(r4, r1, r7)
            r3.zbE(r4, r5, r6)
            return
    }

    private final boolean zbH(java.lang.Object r1, java.lang.Object r2, int r3) {
            r0 = this;
            boolean r1 = r0.zbI(r1, r3)
            boolean r0 = r0.zbI(r2, r3)
            if (r1 != r0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private final boolean zbI(java.lang.Object r8, int r9) {
            r7 = this;
            int r0 = r7.zbp(r9)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r0 & r1
            long r2 = (long) r2
            r4 = 1048575(0xfffff, double:5.18065E-318)
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 0
            r6 = 1
            if (r4 != 0) goto Lea
            int r7 = r7.zbs(r9)
            r9 = r7 & r1
            int r7 = zbr(r7)
            long r0 = (long) r9
            r2 = 0
            switch(r7) {
                case 0: goto Ldc;
                case 1: goto Ld0;
                case 2: goto Lc6;
                case 3: goto Lbc;
                case 4: goto Lb4;
                case 5: goto Laa;
                case 6: goto La2;
                case 7: goto L9d;
                case 8: goto L79;
                case 9: goto L71;
                case 10: goto L63;
                case 11: goto L5b;
                case 12: goto L53;
                case 13: goto L4b;
                case 14: goto L41;
                case 15: goto L39;
                case 16: goto L2f;
                case 17: goto L27;
                default: goto L23;
            }
        L23:
            defpackage.u34.t()
            return r5
        L27:
            java.lang.Object r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r8, r0)
            if (r7 == 0) goto L2e
            return r6
        L2e:
            return r5
        L2f:
            long r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r8, r0)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto L38
            return r6
        L38:
            return r5
        L39:
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r8, r0)
            if (r7 == 0) goto L40
            return r6
        L40:
            return r5
        L41:
            long r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r8, r0)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto L4a
            return r6
        L4a:
            return r5
        L4b:
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r8, r0)
            if (r7 == 0) goto L52
            return r6
        L52:
            return r5
        L53:
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r8, r0)
            if (r7 == 0) goto L5a
            return r6
        L5a:
            return r5
        L5b:
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r8, r0)
            if (r7 == 0) goto L62
            return r6
        L62:
            return r5
        L63:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc.zbb
            java.lang.Object r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r8, r0)
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L70
            return r6
        L70:
            return r5
        L71:
            java.lang.Object r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r8, r0)
            if (r7 == 0) goto L78
            return r6
        L78:
            return r5
        L79:
            java.lang.Object r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r8, r0)
            boolean r8 = r7 instanceof java.lang.String
            if (r8 == 0) goto L8b
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = r7.isEmpty()
            if (r7 != 0) goto L8a
            return r6
        L8a:
            return r5
        L8b:
            boolean r8 = r7 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
            if (r8 == 0) goto L99
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc.zbb
            boolean r7 = r8.equals(r7)
            if (r7 != 0) goto L98
            return r6
        L98:
            return r5
        L99:
            defpackage.u34.t()
            return r5
        L9d:
            boolean r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbw(r8, r0)
            return r7
        La2:
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r8, r0)
            if (r7 == 0) goto La9
            return r6
        La9:
            return r5
        Laa:
            long r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r8, r0)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto Lb3
            return r6
        Lb3:
            return r5
        Lb4:
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r8, r0)
            if (r7 == 0) goto Lbb
            return r6
        Lbb:
            return r5
        Lbc:
            long r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r8, r0)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto Lc5
            return r6
        Lc5:
            return r5
        Lc6:
            long r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r8, r0)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto Lcf
            return r6
        Lcf:
            return r5
        Ld0:
            float r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbb(r8, r0)
            int r7 = java.lang.Float.floatToRawIntBits(r7)
            if (r7 == 0) goto Ldb
            return r6
        Ldb:
            return r5
        Ldc:
            double r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zba(r8, r0)
            long r7 = java.lang.Double.doubleToRawLongBits(r7)
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 == 0) goto Le9
            return r6
        Le9:
            return r5
        Lea:
            int r7 = r0 >>> 20
            int r7 = r6 << r7
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r8, r2)
            r7 = r7 & r8
            if (r7 == 0) goto Lf6
            return r6
        Lf6:
            return r5
    }

    private final boolean zbJ(java.lang.Object r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            r0 = 1048575(0xfffff, float:1.469367E-39)
            if (r4 != r0) goto La
            boolean r1 = r1.zbI(r2, r3)
            return r1
        La:
            r1 = r5 & r6
            if (r1 == 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    private static boolean zbK(java.lang.Object r2, int r3, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r4) {
            r0 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r0
            long r0 = (long) r3
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r2, r0)
            boolean r2 = r4.zbk(r2)
            return r2
    }

    private static boolean zbL(java.lang.Object r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            boolean r0 = r1 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
            if (r0 == 0) goto Lf
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r1
            boolean r1 = r1.zbG()
            return r1
        Lf:
            r1 = 1
            return r1
    }

    private final boolean zbM(java.lang.Object r3, int r4, int r5) {
            r2 = this;
            int r2 = r2.zbp(r5)
            r5 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r5
            long r0 = (long) r2
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r3, r0)
            if (r2 != r4) goto L11
            r2 = 1
            return r2
        L11:
            r2 = 0
            return r2
    }

    private static boolean zbN(java.lang.Object r0, long r1) {
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r0, r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    private static final int zbO(byte[] r1, int r2, int r3, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbww r4, java.lang.Class r5, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r6) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbww r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbww.zba
            int r4 = r4.ordinal()
            r0 = 0
            switch(r4) {
                case 0: goto La2;
                case 1: goto L91;
                case 2: goto L84;
                case 3: goto L84;
                case 4: goto L77;
                case 5: goto L6a;
                case 6: goto L5d;
                case 7: goto L49;
                case 8: goto L44;
                case 9: goto La;
                case 10: goto L37;
                case 11: goto L32;
                case 12: goto L77;
                case 13: goto L77;
                case 14: goto L5d;
                case 15: goto L6a;
                case 16: goto L21;
                case 17: goto L10;
                default: goto La;
            }
        La:
            java.lang.String r1 = "unsupported field type."
            defpackage.u34.j(r1)
            return r0
        L10:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbn(r1, r2, r6)
            long r2 = r6.zbb
            long r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtg.zbc(r2)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.zbc = r2
            return r1
        L21:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r1, r2, r6)
            int r2 = r6.zba
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtg.zbb(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.zbc = r2
            return r1
        L32:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zba(r1, r2, r6)
            return r1
        L37:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r4 = r4.zbb(r5)
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbe(r4, r1, r2, r3, r6)
            return r1
        L44:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbi(r1, r2, r6)
            return r1
        L49:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbn(r1, r2, r6)
            long r2 = r6.zbb
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L56
            r0 = 1
        L56:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)
            r6.zbc = r2
            return r1
        L5d:
            int r3 = r2 + 4
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbc(r1, r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r6.zbc = r1
            return r3
        L6a:
            int r3 = r2 + 8
            long r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbr(r1, r2)
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r6.zbc = r1
            return r3
        L77:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r1, r2, r6)
            int r2 = r6.zba
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r6.zbc = r2
            return r1
        L84:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbn(r1, r2, r6)
            long r2 = r6.zbb
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r6.zbc = r2
            return r1
        L91:
            int r3 = r2 + 4
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbc(r1, r2)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r6.zbc = r1
            return r3
        La2:
            int r3 = r2 + 8
            long r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbr(r1, r2)
            double r1 = java.lang.Double.longBitsToDouble(r1)
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r6.zbc = r1
            return r3
    }

    private static final void zbP(int r1, java.lang.Object r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy r3) {
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto La
            java.lang.String r2 = (java.lang.String) r2
            r3.zbH(r1, r2)
            return
        La:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc) r2
            r3.zbd(r1, r2)
            return
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm zbd(java.lang.Object r2) {
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r0 = r2.zbc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm.zbc()
            if (r0 != r1) goto L10
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm.zbf()
            r2.zbc = r0
        L10:
            return r0
    }

    public static com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp zbl(java.lang.Class r31, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvj r32, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvs r33, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuy r34, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl r35, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtq r36, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvh r37) {
            r0 = r32
            boolean r1 = r0 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvw
            if (r1 == 0) goto L40f
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvw r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvw) r0
            java.lang.String r1 = r0.zbd()
            int r2 = r1.length()
            r3 = 0
            char r4 = r1.charAt(r3)
            r5 = 55296(0xd800, float:7.7486E-41)
            if (r4 < r5) goto L25
            r4 = 1
        L1b:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L26
            r4 = r7
            goto L1b
        L25:
            r7 = 1
        L26:
            int r4 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L45
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L32:
            int r10 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L42
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            int r4 = r4 << r9
            r7 = r7 | r4
            int r9 = r9 + 13
            r4 = r10
            goto L32
        L42:
            int r4 = r4 << r9
            r7 = r7 | r4
            r4 = r10
        L45:
            if (r7 != 0) goto L56
            int[] r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zba
            r9 = r3
            r10 = r9
            r11 = r10
            r12 = r11
            r13 = r12
            r17 = r13
            r16 = r7
            r7 = r17
            goto L16a
        L56:
            int r7 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L75
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r9 = 13
        L62:
            int r10 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L72
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            int r7 = r7 << r9
            r4 = r4 | r7
            int r9 = r9 + 13
            r7 = r10
            goto L62
        L72:
            int r7 = r7 << r9
            r4 = r4 | r7
            r7 = r10
        L75:
            int r9 = r7 + 1
            char r7 = r1.charAt(r7)
            if (r7 < r5) goto L94
            r7 = r7 & 8191(0x1fff, float:1.1478E-41)
            r10 = 13
        L81:
            int r11 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r5) goto L91
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            int r9 = r9 << r10
            r7 = r7 | r9
            int r10 = r10 + 13
            r9 = r11
            goto L81
        L91:
            int r9 = r9 << r10
            r7 = r7 | r9
            r9 = r11
        L94:
            int r10 = r9 + 1
            char r9 = r1.charAt(r9)
            if (r9 < r5) goto Lb3
            r9 = r9 & 8191(0x1fff, float:1.1478E-41)
            r11 = 13
        La0:
            int r12 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r5) goto Lb0
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            int r10 = r10 << r11
            r9 = r9 | r10
            int r11 = r11 + 13
            r10 = r12
            goto La0
        Lb0:
            int r10 = r10 << r11
            r9 = r9 | r10
            r10 = r12
        Lb3:
            int r11 = r10 + 1
            char r10 = r1.charAt(r10)
            if (r10 < r5) goto Ld2
            r10 = r10 & 8191(0x1fff, float:1.1478E-41)
            r12 = 13
        Lbf:
            int r13 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r5) goto Lcf
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            int r11 = r11 << r12
            r10 = r10 | r11
            int r12 = r12 + 13
            r11 = r13
            goto Lbf
        Lcf:
            int r11 = r11 << r12
            r10 = r10 | r11
            r11 = r13
        Ld2:
            int r12 = r11 + 1
            char r11 = r1.charAt(r11)
            if (r11 < r5) goto Lf1
            r11 = r11 & 8191(0x1fff, float:1.1478E-41)
            r13 = 13
        Lde:
            int r14 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto Lee
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            int r12 = r12 << r13
            r11 = r11 | r12
            int r13 = r13 + 13
            r12 = r14
            goto Lde
        Lee:
            int r12 = r12 << r13
            r11 = r11 | r12
            r12 = r14
        Lf1:
            int r13 = r12 + 1
            char r12 = r1.charAt(r12)
            if (r12 < r5) goto L110
            r12 = r12 & 8191(0x1fff, float:1.1478E-41)
            r14 = 13
        Lfd:
            int r15 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L10d
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            int r13 = r13 << r14
            r12 = r12 | r13
            int r14 = r14 + 13
            r13 = r15
            goto Lfd
        L10d:
            int r13 = r13 << r14
            r12 = r12 | r13
            r13 = r15
        L110:
            int r14 = r13 + 1
            char r13 = r1.charAt(r13)
            if (r13 < r5) goto L131
            r13 = r13 & 8191(0x1fff, float:1.1478E-41)
            r15 = 13
        L11c:
            int r16 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L12d
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            int r14 = r14 << r15
            r13 = r13 | r14
            int r15 = r15 + 13
            r14 = r16
            goto L11c
        L12d:
            int r14 = r14 << r15
            r13 = r13 | r14
            r14 = r16
        L131:
            int r15 = r14 + 1
            char r14 = r1.charAt(r14)
            if (r14 < r5) goto L154
            r14 = r14 & 8191(0x1fff, float:1.1478E-41)
            r16 = 13
        L13d:
            int r17 = r15 + 1
            char r15 = r1.charAt(r15)
            if (r15 < r5) goto L14f
            r15 = r15 & 8191(0x1fff, float:1.1478E-41)
            int r15 = r15 << r16
            r14 = r14 | r15
            int r16 = r16 + 13
            r15 = r17
            goto L13d
        L14f:
            int r15 = r15 << r16
            r14 = r14 | r15
            r15 = r17
        L154:
            int r16 = r14 + r12
            int r13 = r16 + r13
            int r16 = r4 + r4
            int r16 = r16 + r7
            int[] r7 = new int[r13]
            r13 = r12
            r12 = r9
            r9 = r13
            r13 = r10
            r17 = r14
            r10 = r16
            r16 = r7
            r7 = r4
            r4 = r15
        L16a:
            sun.misc.Unsafe r14 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbb
            java.lang.Object[] r15 = r0.zbe()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r18 = r0.zba()
            java.lang.Class r3 = r18.getClass()
            int r18 = r17 + r9
            int r9 = r11 + r11
            int r11 = r11 * 3
            int[] r11 = new int[r11]
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r21 = r17
            r22 = r18
            r19 = 0
            r20 = 0
        L18a:
            if (r4 >= r2) goto L3f5
            int r23 = r4 + 1
            char r4 = r1.charAt(r4)
            if (r4 < r5) goto L1b2
            r4 = r4 & 8191(0x1fff, float:1.1478E-41)
            r8 = r23
            r23 = 13
        L19a:
            int r24 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r5) goto L1ac
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            int r8 = r8 << r23
            r4 = r4 | r8
            int r23 = r23 + 13
            r8 = r24
            goto L19a
        L1ac:
            int r8 = r8 << r23
            r4 = r4 | r8
            r8 = r24
            goto L1b4
        L1b2:
            r8 = r23
        L1b4:
            int r23 = r8 + 1
            char r8 = r1.charAt(r8)
            if (r8 < r5) goto L1da
            r8 = r8 & 8191(0x1fff, float:1.1478E-41)
            r6 = r23
            r23 = 13
        L1c2:
            int r25 = r6 + 1
            char r6 = r1.charAt(r6)
            if (r6 < r5) goto L1d4
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r6 = r6 << r23
            r8 = r8 | r6
            int r23 = r23 + 13
            r6 = r25
            goto L1c2
        L1d4:
            int r6 = r6 << r23
            r8 = r8 | r6
            r6 = r25
            goto L1dc
        L1da:
            r6 = r23
        L1dc:
            r5 = r8 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L1e6
            int r5 = r19 + 1
            r16[r19] = r20
            r19 = r5
        L1e6:
            r5 = r8 & 255(0xff, float:3.57E-43)
            r25 = r0
            r0 = r8 & 2048(0x800, float:2.87E-42)
            r26 = r0
            r0 = 51
            if (r5 < r0) goto L2a9
            int r0 = r6 + 1
            char r6 = r1.charAt(r6)
            r27 = r0
            r0 = 55296(0xd800, float:7.7486E-41)
            if (r6 < r0) goto L226
            r6 = r6 & 8191(0x1fff, float:1.1478E-41)
            r29 = r27
            r27 = r6
            r6 = r29
            r29 = 13
        L209:
            int r30 = r6 + 1
            char r6 = r1.charAt(r6)
            if (r6 < r0) goto L21f
            r0 = r6 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r29
            r27 = r27 | r0
            int r29 = r29 + 13
            r6 = r30
            r0 = 55296(0xd800, float:7.7486E-41)
            goto L209
        L21f:
            int r0 = r6 << r29
            r6 = r27 | r0
            r0 = r30
            goto L228
        L226:
            r0 = r27
        L228:
            r27 = r0
            int r0 = r5 + (-51)
            r29 = r2
            r2 = 9
            if (r0 == r2) goto L236
            r2 = 17
            if (r0 != r2) goto L238
        L236:
            r2 = 1
            goto L258
        L238:
            r2 = 12
            if (r0 != r2) goto L255
            int r0 = r25.zbc()
            r2 = 1
            if (r0 == r2) goto L248
            if (r26 == 0) goto L246
            goto L248
        L246:
            r0 = 0
            goto L265
        L248:
            int r0 = r10 + 1
            int r24 = r20 / 3
            int r24 = r24 + r24
            int r24 = r24 + 1
            r10 = r15[r10]
            r9[r24] = r10
        L254:
            r10 = r0
        L255:
            r0 = r26
            goto L265
        L258:
            int r0 = r10 + 1
            int r24 = r20 / 3
            int r24 = r24 + r24
            int r28 = r24 + 1
            r2 = r15[r10]
            r9[r28] = r2
            goto L254
        L265:
            int r6 = r6 + r6
            r2 = r15[r6]
            r26 = r0
            boolean r0 = r2 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L274
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
        L270:
            r28 = r6
            r0 = r7
            goto L27d
        L274:
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r2 = zbz(r3, r2)
            r15[r6] = r2
            goto L270
        L27d:
            long r6 = r14.objectFieldOffset(r2)
            int r2 = (int) r6
            int r6 = r28 + 1
            r7 = r15[r6]
            r30 = r0
            boolean r0 = r7 instanceof java.lang.reflect.Field
            if (r0 == 0) goto L28f
            java.lang.reflect.Field r7 = (java.lang.reflect.Field) r7
            goto L297
        L28f:
            java.lang.String r7 = (java.lang.String) r7
            java.lang.reflect.Field r7 = zbz(r3, r7)
            r15[r6] = r7
        L297:
            long r6 = r14.objectFieldOffset(r7)
            int r0 = (int) r6
            r28 = r0
            r7 = r1
            r0 = r26
            r6 = r27
            r1 = 0
            r23 = 55296(0xd800, float:7.7486E-41)
            goto L3b9
        L2a9:
            r29 = r2
            r30 = r7
            int r0 = r10 + 1
            r2 = r15[r10]
            java.lang.String r2 = (java.lang.String) r2
            java.lang.reflect.Field r2 = zbz(r3, r2)
            r7 = 9
            if (r5 == r7) goto L2bf
            r7 = 17
            if (r5 != r7) goto L2c4
        L2bf:
            r28 = r0
            r0 = 1
            goto L337
        L2c4:
            r7 = 27
            if (r5 == r7) goto L329
            r7 = 49
            if (r5 != r7) goto L2d3
            int r10 = r10 + 2
            r28 = r0
            r0 = 1
            goto L32e
        L2d3:
            r7 = 12
            if (r5 == r7) goto L30c
            r7 = 30
            if (r5 == r7) goto L30c
            r7 = 44
            if (r5 != r7) goto L2e0
            goto L30c
        L2e0:
            r7 = 50
            if (r5 != r7) goto L308
            int r7 = r10 + 2
            int r28 = r21 + 1
            r16[r21] = r20
            int r21 = r20 / 3
            r0 = r15[r0]
            int r21 = r21 + r21
            r9[r21] = r0
            if (r26 == 0) goto L301
            int r21 = r21 + 1
            int r0 = r10 + 3
            r7 = r15[r7]
            r9[r21] = r7
            r10 = r0
            r7 = r1
            r21 = r28
            goto L344
        L301:
            r10 = r7
            r21 = r28
            r26 = 0
        L306:
            r7 = r1
            goto L344
        L308:
            r28 = r0
            r0 = 1
            goto L341
        L30c:
            int r7 = r25.zbc()
            r28 = r0
            r0 = 1
            if (r7 == r0) goto L31e
            if (r26 == 0) goto L318
            goto L31e
        L318:
            r7 = r1
            r10 = r28
            r26 = 0
            goto L344
        L31e:
            int r10 = r10 + 2
            int r7 = r20 / 3
            int r7 = r7 + r7
            int r7 = r7 + r0
            r24 = r15[r28]
            r9[r7] = r24
            goto L306
        L329:
            r28 = r0
            r0 = 1
            int r10 = r10 + 2
        L32e:
            int r7 = r20 / 3
            int r7 = r7 + r7
            int r7 = r7 + r0
            r24 = r15[r28]
            r9[r7] = r24
            goto L306
        L337:
            int r7 = r20 / 3
            int r7 = r7 + r7
            int r7 = r7 + r0
            java.lang.Class r10 = r2.getType()
            r9[r7] = r10
        L341:
            r7 = r1
            r10 = r28
        L344:
            long r0 = r14.objectFieldOffset(r2)
            int r2 = (int) r0
            r0 = r8 & 4096(0x1000, float:5.74E-42)
            r1 = 1048575(0xfffff, float:1.469367E-39)
            if (r0 == 0) goto L3a3
            r0 = 17
            if (r5 > r0) goto L3a3
            int r0 = r6 + 1
            char r1 = r7.charAt(r6)
            r6 = 55296(0xd800, float:7.7486E-41)
            if (r1 < r6) goto L379
            r1 = r1 & 8191(0x1fff, float:1.1478E-41)
            r23 = 13
        L363:
            int r28 = r0 + 1
            char r0 = r7.charAt(r0)
            if (r0 < r6) goto L375
            r0 = r0 & 8191(0x1fff, float:1.1478E-41)
            int r0 = r0 << r23
            r1 = r1 | r0
            int r23 = r23 + 13
            r0 = r28
            goto L363
        L375:
            int r0 = r0 << r23
            r1 = r1 | r0
            goto L37b
        L379:
            r28 = r0
        L37b:
            int r0 = r30 + r30
            int r23 = r1 / 32
            int r23 = r23 + r0
            r0 = r15[r23]
            boolean r6 = r0 instanceof java.lang.reflect.Field
            if (r6 == 0) goto L38b
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0
        L389:
            r6 = r1
            goto L394
        L38b:
            java.lang.String r0 = (java.lang.String) r0
            java.lang.reflect.Field r0 = zbz(r3, r0)
            r15[r23] = r0
            goto L389
        L394:
            long r0 = r14.objectFieldOffset(r0)
            int r0 = (int) r0
            int r1 = r6 % 32
            r6 = r28
            r23 = 55296(0xd800, float:7.7486E-41)
            r28 = r0
            goto L3a9
        L3a3:
            r23 = 55296(0xd800, float:7.7486E-41)
            r28 = r1
            r1 = 0
        L3a9:
            r0 = 18
            if (r5 < r0) goto L3b7
            r0 = 49
            if (r5 > r0) goto L3b7
            int r0 = r22 + 1
            r16[r22] = r2
            r22 = r0
        L3b7:
            r0 = r26
        L3b9:
            int r26 = r20 + 1
            r11[r20] = r4
            int r4 = r20 + 2
            r27 = r0
            r0 = r8 & 512(0x200, float:7.17E-43)
            if (r0 == 0) goto L3c8
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            goto L3c9
        L3c8:
            r0 = 0
        L3c9:
            r8 = r8 & 256(0x100, float:3.59E-43)
            if (r8 == 0) goto L3d0
            r8 = 268435456(0x10000000, float:2.524355E-29)
            goto L3d1
        L3d0:
            r8 = 0
        L3d1:
            if (r27 == 0) goto L3d6
            r27 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L3d8
        L3d6:
            r27 = 0
        L3d8:
            int r5 = r5 << 20
            r0 = r0 | r8
            r0 = r0 | r27
            r0 = r0 | r5
            r0 = r0 | r2
            r11[r26] = r0
            int r20 = r20 + 3
            int r0 = r1 << 20
            r0 = r0 | r28
            r11[r4] = r0
            r4 = r6
            r1 = r7
            r5 = r23
            r0 = r25
            r2 = r29
            r7 = r30
            goto L18a
        L3f5:
            r25 = r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r14 = r25.zba()
            r15 = 0
            r19 = r33
            r20 = r34
            r21 = r35
            r22 = r36
            r23 = r37
            r10 = r11
            r11 = r9
            r9 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r9
        L40f:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwi r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwi) r0
            r0 = 0
            throw r0
    }

    private static double zbm(java.lang.Object r0, long r1) {
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r0, r1)
            java.lang.Double r0 = (java.lang.Double) r0
            double r0 = r0.doubleValue()
            return r0
    }

    private static float zbn(java.lang.Object r0, long r1) {
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r0, r1)
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            return r0
    }

    private static int zbo(java.lang.Object r0, long r1) {
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r0, r1)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
    }

    private final int zbp(int r1) {
            r0 = this;
            int[] r0 = r0.zbc
            int r1 = r1 + 2
            r0 = r0[r1]
            return r0
    }

    private final int zbq(int r6, int r7) {
            r5 = this;
            int[] r0 = r5.zbc
            int r0 = r0.length
            int r0 = r0 / 3
            r1 = -1
            int r0 = r0 + r1
        L7:
            if (r7 > r0) goto L1e
            int r2 = r0 + r7
            int r2 = r2 >>> 1
            int r3 = r2 * 3
            int[] r4 = r5.zbc
            r4 = r4[r3]
            if (r6 != r4) goto L16
            return r3
        L16:
            if (r6 >= r4) goto L1b
            int r0 = r2 + (-1)
            goto L7
        L1b:
            int r7 = r2 + 1
            goto L7
        L1e:
            return r1
    }

    private static int zbr(int r0) {
            int r0 = r0 >>> 20
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
    }

    private final int zbs(int r1) {
            r0 = this;
            int[] r0 = r0.zbc
            int r1 = r1 + 1
            r0 = r0[r1]
            return r0
    }

    private static long zbt(java.lang.Object r0, long r1) {
            java.lang.Object r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r0, r1)
            java.lang.Long r0 = (java.lang.Long) r0
            long r0 = r0.longValue()
            return r0
    }

    private final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuj zbu(int r1) {
            r0 = this;
            int r1 = r1 / 3
            int r1 = r1 + r1
            java.lang.Object[] r0 = r0.zbd
            int r1 = r1 + 1
            r0 = r0[r1]
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuj r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuj) r0
            return r0
    }

    private final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx zbv(int r4) {
            r3 = this;
            java.lang.Object[] r0 = r3.zbd
            int r4 = r4 / 3
            int r4 = r4 + r4
            r1 = r0[r4]
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx) r1
            if (r1 == 0) goto Lc
            return r1
        Lc:
            int r1 = r4 + 1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba()
            r0 = r0[r1]
            java.lang.Class r0 = (java.lang.Class) r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r0 = r2.zbb(r0)
            java.lang.Object[] r3 = r3.zbd
            r3[r4] = r0
            return r0
    }

    private final java.lang.Object zbw(int r1) {
            r0 = this;
            int r1 = r1 / 3
            java.lang.Object[] r0 = r0.zbd
            int r1 = r1 + r1
            r0 = r0[r1]
            return r0
    }

    private final java.lang.Object zbx(java.lang.Object r4, int r5) {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r0 = r3.zbv(r5)
            int r1 = r3.zbs(r5)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r1 = r1 & r2
            boolean r3 = r3.zbI(r4, r5)
            if (r3 != 0) goto L17
            java.lang.Object r3 = r0.zbe()
            return r3
        L17:
            long r1 = (long) r1
            sun.misc.Unsafe r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbb
            java.lang.Object r3 = r3.getObject(r4, r1)
            boolean r4 = zbL(r3)
            if (r4 == 0) goto L25
            return r3
        L25:
            java.lang.Object r4 = r0.zbe()
            if (r3 == 0) goto L2e
            r0.zbg(r4, r3)
        L2e:
            return r4
    }

    private final java.lang.Object zby(java.lang.Object r4, int r5, int r6) {
            r3 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r0 = r3.zbv(r6)
            boolean r5 = r3.zbM(r4, r5, r6)
            if (r5 != 0) goto Lf
            java.lang.Object r3 = r0.zbe()
            return r3
        Lf:
            sun.misc.Unsafe r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbb
            int r3 = r3.zbs(r6)
            r6 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r6
            long r1 = (long) r3
            java.lang.Object r3 = r5.getObject(r4, r1)
            boolean r4 = zbL(r3)
            if (r4 == 0) goto L25
            return r3
        L25:
            java.lang.Object r4 = r0.zbe()
            if (r3 == 0) goto L2e
            r0.zbg(r4, r3)
        L2e:
            return r4
    }

    private static java.lang.reflect.Field zbz(java.lang.Class r5, java.lang.String r6) {
            java.lang.reflect.Field r5 = r5.getDeclaredField(r6)     // Catch: java.lang.NoSuchFieldException -> L5
            return r5
        L5:
            java.lang.reflect.Field[] r0 = r5.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
        Lb:
            if (r2 >= r1) goto L1d
            r3 = r0[r2]
            java.lang.String r4 = r3.getName()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L1a
            return r3
        L1a:
            int r2 = r2 + 1
            goto Lb
        L1d:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.String r5 = r5.getName()
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.String r2 = " for "
            java.lang.String r3 = " not found. Known fields are "
            java.lang.String r4 = "Field "
            java.lang.StringBuilder r5 = defpackage.i61.u(r4, r6, r2, r5, r3)
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r1.<init>(r5)
            throw r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final int zba(java.lang.Object r19) {
            r18 = this;
            r0 = r18
            r1 = r19
            sun.misc.Unsafe r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbb
            r8 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r8
            r2 = 0
            r4 = 0
            r9 = 0
        Ld:
            int[] r5 = r0.zbc
            int r5 = r5.length
            if (r2 >= r5) goto L73c
            int r5 = r0.zbs(r2)
            int r10 = zbr(r5)
            int[] r11 = r0.zbc
            int r12 = r2 + 2
            r13 = r11[r2]
            r11 = r11[r12]
            r12 = r11 & r8
            r14 = 17
            r15 = 1
            if (r10 > r14) goto L3b
            if (r12 == r3) goto L36
            if (r12 != r8) goto L2f
            r4 = 0
            goto L35
        L2f:
            long r3 = (long) r12
            int r3 = r6.getInt(r1, r3)
            r4 = r3
        L35:
            r3 = r12
        L36:
            int r11 = r11 >>> 20
            int r11 = r15 << r11
            goto L3c
        L3b:
            r11 = 0
        L3c:
            r5 = r5 & r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtv r12 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtv.zbJ
            int r12 = r12.zba()
            if (r10 < r12) goto L4a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtv r12 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtv.zbW
            r12.zba()
        L4a:
            long r7 = (long) r5
            r16 = 63
            r5 = 4
            r12 = 8
            switch(r10) {
                case 0: goto L725;
                case 1: goto L714;
                case 2: goto L6fc;
                case 3: goto L6e4;
                case 4: goto L6cb;
                case 5: goto L6bb;
                case 6: goto L6aa;
                case 7: goto L69a;
                case 8: goto L66d;
                case 9: goto L657;
                case 10: goto L636;
                case 11: goto L61f;
                case 12: goto L607;
                case 13: goto L5f7;
                case 14: goto L5e8;
                case 15: goto L5cc;
                case 16: goto L5ab;
                case 17: goto L592;
                case 18: goto L586;
                case 19: goto L578;
                case 20: goto L557;
                case 21: goto L53d;
                case 22: goto L51b;
                case 23: goto L50e;
                case 24: goto L501;
                case 25: goto L4e7;
                case 26: goto L483;
                case 27: goto L443;
                case 28: goto L411;
                case 29: goto L3f7;
                case 30: goto L3d8;
                case 31: goto L3cb;
                case 32: goto L3bc;
                case 33: goto L3a1;
                case 34: goto L382;
                case 35: goto L36a;
                case 36: goto L352;
                case 37: goto L33a;
                case 38: goto L322;
                case 39: goto L30a;
                case 40: goto L2f2;
                case 41: goto L2da;
                case 42: goto L2c0;
                case 43: goto L2a8;
                case 44: goto L290;
                case 45: goto L278;
                case 46: goto L260;
                case 47: goto L248;
                case 48: goto L230;
                case 49: goto L209;
                case 50: goto L1cf;
                case 51: goto L1c1;
                case 52: goto L1b3;
                case 53: goto L19d;
                case 54: goto L187;
                case 55: goto L170;
                case 56: goto L162;
                case 57: goto L154;
                case 58: goto L146;
                case 59: goto L11b;
                case 60: goto L106;
                case 61: goto Le7;
                case 62: goto Ld2;
                case 63: goto Lbc;
                case 64: goto Laf;
                case 65: goto La2;
                case 66: goto L88;
                case 67: goto L6c;
                case 68: goto L54;
                default: goto L53;
            }
        L53:
            goto L69
        L54:
            boolean r5 = r0.zbM(r1, r13, r2)
            if (r5 == 0) goto L69
            java.lang.Object r5 = r6.getObject(r1, r7)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm) r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r7 = r0.zbv(r2)
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbz(r13, r5, r7)
            int r9 = r9 + r5
        L69:
            r10 = 0
            goto L733
        L6c:
            boolean r5 = r0.zbM(r1, r13, r2)
            if (r5 == 0) goto L69
            int r5 = r13 << 3
            long r7 = zbt(r1, r7)
            long r10 = r7 + r7
            long r7 = r7 >> r16
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            long r7 = r7 ^ r10
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r7)
        L85:
            int r7 = r7 + r5
            int r9 = r9 + r7
            goto L69
        L88:
            boolean r5 = r0.zbM(r1, r13, r2)
            if (r5 == 0) goto L69
            int r5 = r13 << 3
            int r7 = zbo(r1, r7)
            int r8 = r7 + r7
            int r7 = r7 >> 31
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            r7 = r7 ^ r8
            int r9 = defpackage.xg6.b(r7, r5, r9)
            goto L69
        La2:
            boolean r5 = r0.zbM(r1, r13, r2)
            if (r5 == 0) goto L69
            int r5 = r13 << 3
            int r9 = defpackage.xg6.b(r5, r12, r9)
            goto L69
        Laf:
            boolean r7 = r0.zbM(r1, r13, r2)
            if (r7 == 0) goto L69
            int r7 = r13 << 3
            int r9 = defpackage.xg6.b(r7, r5, r9)
            goto L69
        Lbc:
            boolean r5 = r0.zbM(r1, r13, r2)
            if (r5 == 0) goto L69
            int r5 = r13 << 3
            int r7 = zbo(r1, r7)
            long r7 = (long) r7
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r7)
            goto L85
        Ld2:
            boolean r5 = r0.zbM(r1, r13, r2)
            if (r5 == 0) goto L69
            int r5 = r13 << 3
            int r7 = zbo(r1, r7)
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            int r9 = defpackage.xg6.b(r7, r5, r9)
            goto L69
        Le7:
            boolean r5 = r0.zbM(r1, r13, r2)
            if (r5 == 0) goto L69
            int r5 = r13 << 3
            java.lang.Object r7 = r6.getObject(r1, r7)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r7 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc) r7
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            int r7 = r7.zbd()
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r7)
        L101:
            int r8 = r8 + r7
            int r8 = r8 + r5
            int r9 = r9 + r8
            goto L69
        L106:
            boolean r5 = r0.zbM(r1, r13, r2)
            if (r5 == 0) goto L69
            java.lang.Object r5 = r6.getObject(r1, r7)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r7 = r0.zbv(r2)
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbh(r13, r5, r7)
        L118:
            int r9 = r9 + r5
            goto L69
        L11b:
            boolean r5 = r0.zbM(r1, r13, r2)
            if (r5 == 0) goto L69
            int r5 = r13 << 3
            java.lang.Object r7 = r6.getObject(r1, r7)
            boolean r8 = r7 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
            if (r8 == 0) goto L13a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r7 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc) r7
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            int r7 = r7.zbd()
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r7)
            goto L101
        L13a:
            java.lang.String r7 = (java.lang.String) r7
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbC(r7)
            goto L85
        L146:
            boolean r5 = r0.zbM(r1, r13, r2)
            if (r5 == 0) goto L69
            int r5 = r13 << 3
            int r9 = defpackage.xg6.b(r5, r15, r9)
            goto L69
        L154:
            boolean r7 = r0.zbM(r1, r13, r2)
            if (r7 == 0) goto L69
            int r7 = r13 << 3
            int r9 = defpackage.xg6.b(r7, r5, r9)
            goto L69
        L162:
            boolean r5 = r0.zbM(r1, r13, r2)
            if (r5 == 0) goto L69
            int r5 = r13 << 3
            int r9 = defpackage.xg6.b(r5, r12, r9)
            goto L69
        L170:
            boolean r5 = r0.zbM(r1, r13, r2)
            if (r5 == 0) goto L69
            int r5 = r13 << 3
            int r7 = zbo(r1, r7)
            long r7 = (long) r7
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r7)
            goto L85
        L187:
            boolean r5 = r0.zbM(r1, r13, r2)
            if (r5 == 0) goto L69
            int r5 = r13 << 3
            long r7 = zbt(r1, r7)
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r7)
            goto L85
        L19d:
            boolean r5 = r0.zbM(r1, r13, r2)
            if (r5 == 0) goto L69
            int r5 = r13 << 3
            long r7 = zbt(r1, r7)
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r7)
            goto L85
        L1b3:
            boolean r7 = r0.zbM(r1, r13, r2)
            if (r7 == 0) goto L69
            int r7 = r13 << 3
            int r9 = defpackage.xg6.b(r7, r5, r9)
            goto L69
        L1c1:
            boolean r5 = r0.zbM(r1, r13, r2)
            if (r5 == 0) goto L69
            int r5 = r13 << 3
            int r9 = defpackage.xg6.b(r5, r12, r9)
            goto L69
        L1cf:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.lang.Object r7 = r0.zbw(r2)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg) r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvf r7 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvf) r7
            boolean r8 = r5.isEmpty()
            if (r8 == 0) goto L1e3
        L1e1:
            r12 = 0
            goto L206
        L1e3:
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
            r12 = 0
        L1ec:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L206
            java.lang.Object r8 = r5.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r10 = r8.getKey()
            java.lang.Object r8 = r8.getValue()
            int r8 = r7.zba(r13, r10, r8)
            int r12 = r12 + r8
            goto L1ec
        L206:
            int r9 = r9 + r12
            goto L69
        L209:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r7 = r0.zbv(r2)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zba
            int r8 = r5.size()
            if (r8 != 0) goto L21c
            goto L1e1
        L21c:
            r10 = 0
            r12 = 0
        L21e:
            if (r12 >= r8) goto L22e
            java.lang.Object r11 = r5.get(r12)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r11 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm) r11
            int r11 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbz(r13, r11, r7)
            int r10 = r10 + r11
            int r12 = r12 + 1
            goto L21e
        L22e:
            r12 = r10
            goto L206
        L230:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbj(r5)
            if (r5 <= 0) goto L69
            int r7 = r13 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r7)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            goto L101
        L248:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbi(r5)
            if (r5 <= 0) goto L69
            int r7 = r13 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r7)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            goto L101
        L260:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbe(r5)
            if (r5 <= 0) goto L69
            int r7 = r13 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r7)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            goto L101
        L278:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbc(r5)
            if (r5 <= 0) goto L69
            int r7 = r13 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r7)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            goto L101
        L290:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zba(r5)
            if (r5 <= 0) goto L69
            int r7 = r13 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r7)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            goto L101
        L2a8:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbk(r5)
            if (r5 <= 0) goto L69
            int r7 = r13 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r7)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            goto L101
        L2c0:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zba
            int r5 = r5.size()
            if (r5 <= 0) goto L69
            int r7 = r13 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r7)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            goto L101
        L2da:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbc(r5)
            if (r5 <= 0) goto L69
            int r7 = r13 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r7)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            goto L101
        L2f2:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbe(r5)
            if (r5 <= 0) goto L69
            int r7 = r13 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r7)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            goto L101
        L30a:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbf(r5)
            if (r5 <= 0) goto L69
            int r7 = r13 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r7)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            goto L101
        L322:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbl(r5)
            if (r5 <= 0) goto L69
            int r7 = r13 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r7)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            goto L101
        L33a:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbg(r5)
            if (r5 <= 0) goto L69
            int r7 = r13 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r7)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            goto L101
        L352:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbc(r5)
            if (r5 <= 0) goto L69
            int r7 = r13 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r7)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            goto L101
        L36a:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbe(r5)
            if (r5 <= 0) goto L69
            int r7 = r13 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r7)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            goto L101
        L382:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zba
            int r7 = r5.size()
            if (r7 != 0) goto L392
            goto L1e1
        L392:
            int r8 = r13 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbj(r5)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r8)
        L39c:
            int r8 = r8 * r7
            int r12 = r8 + r5
            goto L206
        L3a1:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zba
            int r7 = r5.size()
            if (r7 != 0) goto L3b1
            goto L1e1
        L3b1:
            int r8 = r13 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbi(r5)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r8)
            goto L39c
        L3bc:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbd(r13, r5, r12)
        L3c7:
            int r9 = r9 + r5
            r10 = r12
            goto L733
        L3cb:
            r12 = 0
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbb(r13, r5, r12)
            goto L118
        L3d8:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zba
            int r7 = r5.size()
            if (r7 != 0) goto L3e9
        L3e6:
            r5 = 0
            goto L118
        L3e9:
            int r8 = r13 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zba(r5)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r8)
        L3f3:
            int r8 = r8 * r7
            int r5 = r5 + r8
            goto L118
        L3f7:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zba
            int r7 = r5.size()
            if (r7 != 0) goto L406
            goto L3e6
        L406:
            int r8 = r13 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbk(r5)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r8)
            goto L3f3
        L411:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zba
            int r7 = r5.size()
            if (r7 != 0) goto L421
            r8 = 0
            goto L440
        L421:
            int r8 = r13 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r8)
            int r8 = r8 * r7
            r7 = 0
        L429:
            int r10 = r5.size()
            if (r7 >= r10) goto L440
            java.lang.Object r10 = r5.get(r7)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r10 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc) r10
            int r10 = r10.zbd()
            int r8 = defpackage.xg6.b(r10, r10, r8)
            int r7 = r7 + 1
            goto L429
        L440:
            int r9 = r9 + r8
            goto L69
        L443:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r7 = r0.zbv(r2)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zba
            int r8 = r5.size()
            if (r8 != 0) goto L457
            r11 = 0
            goto L480
        L457:
            int r10 = r13 << 3
            int r10 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r10)
            int r10 = r10 * r8
            r11 = r10
            r10 = 0
        L460:
            if (r10 >= r8) goto L480
            java.lang.Object r13 = r5.get(r10)
            boolean r15 = r13 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw
            if (r15 == 0) goto L475
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw r13 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw) r13
            int r13 = r13.zba()
            int r11 = defpackage.xg6.b(r13, r13, r11)
            goto L47d
        L475:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r13 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm) r13
            int r13 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbB(r13, r7)
            int r13 = r13 + r11
            r11 = r13
        L47d:
            int r10 = r10 + 1
            goto L460
        L480:
            int r9 = r9 + r11
            goto L69
        L483:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zba
            int r7 = r5.size()
            if (r7 != 0) goto L493
            r10 = 0
            goto L4e4
        L493:
            int r8 = r13 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r8)
            int r8 = r8 * r7
            boolean r10 = r5 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbux
            if (r10 == 0) goto L4c2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbux r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbux) r5
            r10 = r8
            r8 = 0
        L4a2:
            if (r8 >= r7) goto L4e4
            java.lang.Object r11 = r5.zba()
            boolean r13 = r11 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
            if (r13 == 0) goto L4b7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r11 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc) r11
            int r11 = r11.zbd()
            int r10 = defpackage.xg6.b(r11, r11, r10)
            goto L4bf
        L4b7:
            java.lang.String r11 = (java.lang.String) r11
            int r11 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbC(r11)
            int r11 = r11 + r10
            r10 = r11
        L4bf:
            int r8 = r8 + 1
            goto L4a2
        L4c2:
            r10 = r8
            r8 = 0
        L4c4:
            if (r8 >= r7) goto L4e4
            java.lang.Object r11 = r5.get(r8)
            boolean r13 = r11 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
            if (r13 == 0) goto L4d9
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r11 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc) r11
            int r11 = r11.zbd()
            int r10 = defpackage.xg6.b(r11, r11, r10)
            goto L4e1
        L4d9:
            java.lang.String r11 = (java.lang.String) r11
            int r11 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbC(r11)
            int r11 = r11 + r10
            r10 = r11
        L4e1:
            int r8 = r8 + 1
            goto L4c4
        L4e4:
            int r9 = r9 + r10
            goto L69
        L4e7:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zba
            int r5 = r5.size()
            if (r5 != 0) goto L4f7
            goto L3e6
        L4f7:
            int r7 = r13 << 3
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r7)
            int r7 = r7 + r15
            int r5 = r5 * r7
            goto L118
        L501:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            r12 = 0
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbb(r13, r5, r12)
            goto L3c7
        L50e:
            r12 = 0
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbd(r13, r5, r12)
            goto L118
        L51b:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zba
            int r7 = r5.size()
            if (r7 != 0) goto L52c
        L529:
            r17 = 0
            goto L539
        L52c:
            int r8 = r13 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbf(r5)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r8)
        L536:
            int r8 = r8 * r7
            int r17 = r8 + r5
        L539:
            int r9 = r9 + r17
            goto L69
        L53d:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zba
            int r7 = r5.size()
            if (r7 != 0) goto L54c
            goto L529
        L54c:
            int r8 = r13 << 3
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbl(r5)
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r8)
            goto L536
        L557:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zba
            int r7 = r5.size()
            if (r7 != 0) goto L566
            goto L529
        L566:
            int r7 = r13 << 3
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbg(r5)
            int r5 = r5.size()
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r7)
            int r7 = r7 * r5
            int r17 = r7 + r8
            goto L539
        L578:
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            r10 = 0
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbb(r13, r5, r10)
        L583:
            int r9 = r9 + r5
            goto L733
        L586:
            r10 = 0
            java.lang.Object r5 = r6.getObject(r1, r7)
            java.util.List r5 = (java.util.List) r5
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbd(r13, r5, r10)
            goto L583
        L592:
            r5 = r11
            r10 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L733
            java.lang.Object r5 = r6.getObject(r1, r7)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm) r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r7 = r0.zbv(r2)
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbz(r13, r5, r7)
            int r9 = r9 + r5
            goto L733
        L5ab:
            r5 = r11
            r10 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5c8
            int r0 = r13 << 3
            long r7 = r6.getLong(r1, r7)
            long r11 = r7 + r7
            long r7 = r7 >> r16
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r0)
            long r7 = r7 ^ r11
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r7)
        L5c6:
            int r5 = r5 + r0
            int r9 = r9 + r5
        L5c8:
            r0 = r18
            goto L733
        L5cc:
            r5 = r11
            r10 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5c8
            int r0 = r13 << 3
            int r5 = r6.getInt(r1, r7)
            int r7 = r5 + r5
            int r5 = r5 >> 31
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r0)
            r5 = r5 ^ r7
            int r9 = defpackage.xg6.b(r5, r0, r9)
            goto L5c8
        L5e8:
            r5 = r11
            r10 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5c8
            int r0 = r13 << 3
            int r9 = defpackage.xg6.b(r0, r12, r9)
            goto L5c8
        L5f7:
            r7 = r5
            r5 = r11
            r10 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5c8
            int r0 = r13 << 3
            int r9 = defpackage.xg6.b(r0, r7, r9)
            goto L5c8
        L607:
            r5 = r11
            r10 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5c8
            int r0 = r13 << 3
            int r5 = r6.getInt(r1, r7)
            long r7 = (long) r5
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r0)
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r7)
            goto L5c6
        L61f:
            r5 = r11
            r10 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5c8
            int r0 = r13 << 3
            int r5 = r6.getInt(r1, r7)
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r0)
            int r9 = defpackage.xg6.b(r5, r0, r9)
            goto L5c8
        L636:
            r5 = r11
            r10 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5c8
            int r0 = r13 << 3
            java.lang.Object r5 = r6.getObject(r1, r7)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc) r5
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r0)
            int r5 = r5.zbd()
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
        L652:
            int r7 = r7 + r5
            int r7 = r7 + r0
            int r9 = r9 + r7
            goto L5c8
        L657:
            r5 = r11
            r10 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L733
            java.lang.Object r5 = r6.getObject(r1, r7)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r7 = r0.zbv(r2)
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbh(r13, r5, r7)
            goto L583
        L66d:
            r5 = r11
            r10 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5c8
            int r0 = r13 << 3
            java.lang.Object r5 = r6.getObject(r1, r7)
            boolean r7 = r5 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
            if (r7 == 0) goto L68e
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc) r5
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r0)
            int r5 = r5.zbd()
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r5)
            goto L652
        L68e:
            java.lang.String r5 = (java.lang.String) r5
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r0)
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbC(r5)
            goto L5c6
        L69a:
            r5 = r11
            r10 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5c8
            int r0 = r13 << 3
            int r9 = defpackage.xg6.b(r0, r15, r9)
            goto L5c8
        L6aa:
            r7 = r5
            r5 = r11
            r10 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5c8
            int r0 = r13 << 3
            int r9 = defpackage.xg6.b(r0, r7, r9)
            goto L5c8
        L6bb:
            r5 = r11
            r10 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5c8
            int r0 = r13 << 3
            int r9 = defpackage.xg6.b(r0, r12, r9)
            goto L5c8
        L6cb:
            r5 = r11
            r10 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5c8
            int r0 = r13 << 3
            int r5 = r6.getInt(r1, r7)
            long r7 = (long) r5
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r0)
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r7)
            goto L5c6
        L6e4:
            r5 = r11
            r10 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5c8
            int r0 = r13 << 3
            long r7 = r6.getLong(r1, r7)
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r0)
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r7)
            goto L5c6
        L6fc:
            r5 = r11
            r10 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5c8
            int r0 = r13 << 3
            long r7 = r6.getLong(r1, r7)
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbD(r0)
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk.zbE(r7)
            goto L5c6
        L714:
            r7 = r5
            r5 = r11
            r10 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L5c8
            int r0 = r13 << 3
            int r9 = defpackage.xg6.b(r0, r7, r9)
            goto L5c8
        L725:
            r5 = r11
            r10 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L733
            int r1 = r13 << 3
            int r9 = defpackage.xg6.b(r1, r12, r9)
        L733:
            int r2 = r2 + 3
            r1 = r19
            r8 = 1048575(0xfffff, float:1.469367E-39)
            goto Ld
        L73c:
            r10 = 0
            r1 = r19
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r1 = r1.zbc
            int r1 = r1.zba()
            int r1 = r1 + r9
            boolean r0 = r0.zbh
            if (r0 == 0) goto L79b
            r0 = r19
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub) r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu r0 = r0.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r2 = r0.zba
            int r2 = r2.zbc()
            r7 = r10
        L759:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r3 = r0.zba
            if (r7 >= r2) goto L776
            java.util.Map$Entry r3 = r3.zbg(r7)
            r4 = r3
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb r4 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwb) r4
            java.lang.Comparable r4 = r4.zba()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtt r4 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtt) r4
            java.lang.Object r3 = r3.getValue()
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu.zbb(r4, r3)
            int r10 = r10 + r3
            int r7 = r7 + 1
            goto L759
        L776:
            java.lang.Iterable r0 = r3.zbd()
            java.util.Iterator r0 = r0.iterator()
        L77e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L79a
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtt r3 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtt) r3
            java.lang.Object r2 = r2.getValue()
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu.zbb(r3, r2)
            int r10 = r10 + r2
            goto L77e
        L79a:
            int r1 = r1 + r10
        L79b:
            return r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final int zbb(java.lang.Object r9) {
            r8 = this;
            r0 = 0
            r1 = r0
        L2:
            int[] r2 = r8.zbc
            int r2 = r2.length
            if (r0 >= r2) goto L221
            int r2 = r8.zbs(r0)
            int[] r3 = r8.zbc
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r4 & r2
            int r2 = zbr(r2)
            r3 = r3[r0]
            long r4 = (long) r4
            r6 = 37
            r7 = 32
            switch(r2) {
                case 0: goto L20f;
                case 1: goto L203;
                case 2: goto L1f9;
                case 3: goto L1ef;
                case 4: goto L1e7;
                case 5: goto L1dd;
                case 6: goto L1d5;
                case 7: goto L1c9;
                case 8: goto L1bb;
                case 9: goto L1ae;
                case 10: goto L1a2;
                case 11: goto L19a;
                case 12: goto L192;
                case 13: goto L18a;
                case 14: goto L180;
                case 15: goto L178;
                case 16: goto L16e;
                case 17: goto L15f;
                case 18: goto L153;
                case 19: goto L153;
                case 20: goto L153;
                case 21: goto L153;
                case 22: goto L153;
                case 23: goto L153;
                case 24: goto L153;
                case 25: goto L153;
                case 26: goto L153;
                case 27: goto L153;
                case 28: goto L153;
                case 29: goto L153;
                case 30: goto L153;
                case 31: goto L153;
                case 32: goto L153;
                case 33: goto L153;
                case 34: goto L153;
                case 35: goto L153;
                case 36: goto L153;
                case 37: goto L153;
                case 38: goto L153;
                case 39: goto L153;
                case 40: goto L153;
                case 41: goto L153;
                case 42: goto L153;
                case 43: goto L153;
                case 44: goto L153;
                case 45: goto L153;
                case 46: goto L153;
                case 47: goto L153;
                case 48: goto L153;
                case 49: goto L153;
                case 50: goto L147;
                case 51: goto L133;
                case 52: goto L121;
                case 53: goto L111;
                case 54: goto L101;
                case 55: goto Lf3;
                case 56: goto Le3;
                case 57: goto Ld5;
                case 58: goto Lc3;
                case 59: goto Laf;
                case 60: goto L9e;
                case 61: goto L8d;
                case 62: goto L80;
                case 63: goto L73;
                case 64: goto L66;
                case 65: goto L57;
                case 66: goto L4a;
                case 67: goto L35;
                case 68: goto L21;
                default: goto L1f;
            }
        L1f:
            goto L21d
        L21:
            boolean r2 = r8.zbM(r9, r3, r0)
            if (r2 == 0) goto L21d
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r9, r4)
            int r2 = r2.hashCode()
        L31:
            int r2 = r2 + r1
            r1 = r2
            goto L21d
        L35:
            boolean r2 = r8.zbM(r9, r3, r0)
            if (r2 == 0) goto L21d
            int r1 = r1 * 53
            long r2 = zbt(r9, r4)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb
        L43:
            long r4 = r2 >>> r7
            long r2 = r2 ^ r4
            int r2 = (int) r2
        L47:
            int r1 = r1 + r2
            goto L21d
        L4a:
            boolean r2 = r8.zbM(r9, r3, r0)
            if (r2 == 0) goto L21d
            int r1 = r1 * 53
            int r2 = zbo(r9, r4)
            goto L47
        L57:
            boolean r2 = r8.zbM(r9, r3, r0)
            if (r2 == 0) goto L21d
            int r1 = r1 * 53
            long r2 = zbt(r9, r4)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb
            goto L43
        L66:
            boolean r2 = r8.zbM(r9, r3, r0)
            if (r2 == 0) goto L21d
            int r1 = r1 * 53
            int r2 = zbo(r9, r4)
            goto L47
        L73:
            boolean r2 = r8.zbM(r9, r3, r0)
            if (r2 == 0) goto L21d
            int r1 = r1 * 53
            int r2 = zbo(r9, r4)
            goto L47
        L80:
            boolean r2 = r8.zbM(r9, r3, r0)
            if (r2 == 0) goto L21d
            int r1 = r1 * 53
            int r2 = zbo(r9, r4)
            goto L47
        L8d:
            boolean r2 = r8.zbM(r9, r3, r0)
            if (r2 == 0) goto L21d
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r9, r4)
            int r2 = r2.hashCode()
            goto L31
        L9e:
            boolean r2 = r8.zbM(r9, r3, r0)
            if (r2 == 0) goto L21d
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r9, r4)
            int r2 = r2.hashCode()
            goto L31
        Laf:
            boolean r2 = r8.zbM(r9, r3, r0)
            if (r2 == 0) goto L21d
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r9, r4)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.hashCode()
            goto L31
        Lc3:
            boolean r2 = r8.zbM(r9, r3, r0)
            if (r2 == 0) goto L21d
            int r1 = r1 * 53
            boolean r2 = zbN(r9, r4)
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zba(r2)
            goto L31
        Ld5:
            boolean r2 = r8.zbM(r9, r3, r0)
            if (r2 == 0) goto L21d
            int r1 = r1 * 53
            int r2 = zbo(r9, r4)
            goto L47
        Le3:
            boolean r2 = r8.zbM(r9, r3, r0)
            if (r2 == 0) goto L21d
            int r1 = r1 * 53
            long r2 = zbt(r9, r4)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb
            goto L43
        Lf3:
            boolean r2 = r8.zbM(r9, r3, r0)
            if (r2 == 0) goto L21d
            int r1 = r1 * 53
            int r2 = zbo(r9, r4)
            goto L47
        L101:
            boolean r2 = r8.zbM(r9, r3, r0)
            if (r2 == 0) goto L21d
            int r1 = r1 * 53
            long r2 = zbt(r9, r4)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb
            goto L43
        L111:
            boolean r2 = r8.zbM(r9, r3, r0)
            if (r2 == 0) goto L21d
            int r1 = r1 * 53
            long r2 = zbt(r9, r4)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb
            goto L43
        L121:
            boolean r2 = r8.zbM(r9, r3, r0)
            if (r2 == 0) goto L21d
            int r1 = r1 * 53
            float r2 = zbn(r9, r4)
            int r2 = java.lang.Float.floatToIntBits(r2)
            goto L31
        L133:
            boolean r2 = r8.zbM(r9, r3, r0)
            if (r2 == 0) goto L21d
            int r1 = r1 * 53
            double r2 = zbm(r9, r4)
            long r2 = java.lang.Double.doubleToLongBits(r2)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb
            goto L43
        L147:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r9, r4)
            int r2 = r2.hashCode()
            goto L31
        L153:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r9, r4)
            int r2 = r2.hashCode()
            goto L31
        L15f:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r9, r4)
            if (r2 == 0) goto L16b
            int r6 = r2.hashCode()
        L16b:
            int r1 = r1 + r6
            goto L21d
        L16e:
            int r1 = r1 * 53
            long r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r9, r4)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb
            goto L43
        L178:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r9, r4)
            goto L47
        L180:
            int r1 = r1 * 53
            long r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r9, r4)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb
            goto L43
        L18a:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r9, r4)
            goto L47
        L192:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r9, r4)
            goto L47
        L19a:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r9, r4)
            goto L47
        L1a2:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r9, r4)
            int r2 = r2.hashCode()
            goto L31
        L1ae:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r9, r4)
            if (r2 == 0) goto L16b
            int r6 = r2.hashCode()
            goto L16b
        L1bb:
            int r1 = r1 * 53
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r9, r4)
            java.lang.String r2 = (java.lang.String) r2
            int r2 = r2.hashCode()
            goto L31
        L1c9:
            int r1 = r1 * 53
            boolean r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbw(r9, r4)
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zba(r2)
            goto L31
        L1d5:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r9, r4)
            goto L47
        L1dd:
            int r1 = r1 * 53
            long r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r9, r4)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb
            goto L43
        L1e7:
            int r1 = r1 * 53
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r9, r4)
            goto L47
        L1ef:
            int r1 = r1 * 53
            long r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r9, r4)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb
            goto L43
        L1f9:
            int r1 = r1 * 53
            long r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r9, r4)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb
            goto L43
        L203:
            int r1 = r1 * 53
            float r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbb(r9, r4)
            int r2 = java.lang.Float.floatToIntBits(r2)
            goto L31
        L20f:
            int r1 = r1 * 53
            double r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zba(r9, r4)
            long r2 = java.lang.Double.doubleToLongBits(r2)
            byte[] r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zbb
            goto L43
        L21d:
            int r0 = r0 + 3
            goto L2
        L221:
            int r1 = r1 * 53
            r0 = r9
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r0 = r0.zbc
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            boolean r8 = r8.zbh
            if (r8 == 0) goto L23e
            int r0 = r0 * 53
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub r9 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub) r9
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu r8 = r9.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r8 = r8.zba
            int r8 = r8.hashCode()
            int r0 = r0 + r8
        L23e:
            return r0
    }

    public final int zbc(java.lang.Object r35, byte[] r36, int r37, int r38, int r39, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r40) {
            r34 = this;
            r0 = r34
            r2 = r35
            r3 = r36
            r4 = r38
            r6 = r40
            zbA(r2)
            sun.misc.Unsafe r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbb
            r11 = 0
            r12 = -1
            r5 = r37
            r8 = r11
            r14 = r8
            r15 = r14
            r7 = r12
            r9 = 1048575(0xfffff, float:1.469367E-39)
        L1a:
            java.lang.String r16 = "Failed to parse the message."
            r17 = 0
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r37 = 3
            if (r5 >= r4) goto Ldce
            int r15 = r5 + 1
            r5 = r3[r5]
            if (r5 >= 0) goto L31
            int r15 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbl(r5, r3, r15, r6)
            int r5 = r6.zba
        L31:
            r6 = r15
            r15 = r5
            int r5 = r15 >>> 3
            int r13 = r0.zbe
            if (r5 <= r7) goto L49
            int r8 = r8 / 3
            if (r5 < r13) goto L46
            int r7 = r0.zbf
            if (r5 > r7) goto L46
            int r7 = r0.zbq(r5, r8)
            goto L47
        L46:
            r7 = r12
        L47:
            r13 = r7
            goto L55
        L49:
            if (r5 < r13) goto L54
            int r7 = r0.zbf
            if (r5 > r7) goto L54
            int r7 = r0.zbq(r5, r11)
            goto L47
        L54:
            r13 = r12
        L55:
            if (r13 != r12) goto L6b
            r10 = r39
            r28 = r1
            r4 = r3
            r3 = r6
            r22 = r9
            r9 = r11
            r20 = r9
            r21 = r14
            r13 = r15
            r14 = r40
            r15 = r2
            r11 = r5
            goto Ld60
        L6b:
            r7 = r15 & 7
            int[] r8 = r0.zbc
            int r20 = r13 + 1
            r12 = r8[r20]
            r20 = r11
            int r11 = zbr(r12)
            r3 = r12 & r18
            long r3 = (long) r3
            r21 = r3
            r3 = 17
            r23 = 536870912(0x20000000, float:1.0842022E-19)
            r24 = 0
            r4 = 1
            if (r11 > r3) goto L3bb
            int r3 = r13 + 2
            r3 = r8[r3]
            int r8 = r3 >>> 20
            int r8 = r4 << r8
            r3 = r3 & r18
            if (r3 == r9) goto Lac
            r4 = r18
            r27 = r5
            if (r9 == r4) goto La0
            long r4 = (long) r9
            r1.putInt(r2, r4, r14)
            r4 = 1048575(0xfffff, float:1.469367E-39)
        La0:
            if (r3 != r4) goto La5
            r4 = r20
            goto Laa
        La5:
            long r4 = (long) r3
            int r4 = r1.getInt(r2, r4)
        Laa:
            r14 = r3
            goto Lb0
        Lac:
            r27 = r5
            r4 = r14
            r14 = r9
        Lb0:
            switch(r11) {
                case 0: goto L374;
                case 1: goto L343;
                case 2: goto L312;
                case 3: goto L312;
                case 4: goto L2e8;
                case 5: goto L2ae;
                case 6: goto L283;
                case 7: goto L25e;
                case 8: goto L220;
                case 9: goto L1d6;
                case 10: goto L1ba;
                case 11: goto L2e8;
                case 12: goto L153;
                case 13: goto L283;
                case 14: goto L2ae;
                case 15: goto L121;
                case 16: goto Lf2;
                default: goto Lb3;
            }
        Lb3:
            r3 = r37
            if (r7 != r3) goto Le3
            r11 = r4 | r8
            java.lang.Object r3 = r0.zbx(r2, r13)
            int r4 = r27 << 3
            r8 = r4 | 4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r4 = r0.zbv(r13)
            r5 = r36
            r7 = r38
            r9 = r40
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbo(r3, r4, r5, r6, r7, r8, r9)
            r12 = r9
            r9 = r5
            r0.zbF(r2, r13, r3)
            r5 = r4
            r3 = r9
            r6 = r12
            r8 = r13
            r9 = r14
            r7 = r27
            r12 = -1
            r4 = r38
            r14 = r11
        Ldf:
            r11 = r20
            goto L1a
        Le3:
            r9 = r36
            r11 = r40
            r3 = r1
            r1 = r2
            r22 = r4
            r2 = r6
        Lec:
            r21 = r14
            r14 = r27
            goto L3a7
        Lf2:
            r9 = r36
            r12 = r40
            r3 = r6
            if (r7 != 0) goto L119
            r7 = r4 | r8
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbn(r9, r3, r12)
            long r3 = r12.zbb
            long r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtg.zbc(r3)
            r3 = r21
            r1.putLong(r2, r3, r5)
            r4 = r38
            r5 = r8
            r3 = r9
            r6 = r12
            r8 = r13
            r9 = r14
            r11 = r20
            r12 = -1
            r14 = r7
            r7 = r27
            goto L1a
        L119:
            r11 = r3
            r3 = r1
            r1 = r2
            r2 = r11
            r22 = r4
            r11 = r12
            goto Lec
        L121:
            r9 = r36
            r12 = r40
            r11 = r2
            r3 = r6
            r5 = r21
            if (r7 != 0) goto L147
            r2 = r4 | r8
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r9, r3, r12)
            int r4 = r12.zba
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtg.zbb(r4)
            r1.putInt(r11, r5, r4)
            r4 = r38
            r5 = r3
            r3 = r9
            r6 = r12
            r8 = r13
            r9 = r14
            r7 = r27
            r12 = -1
            r14 = r2
            r2 = r11
            goto Ldf
        L147:
            r2 = r3
            r22 = r4
            r21 = r14
            r14 = r27
            r3 = r1
            r1 = r11
            r11 = r12
            goto L3a7
        L153:
            r9 = r36
            r11 = r2
            r3 = r6
            r5 = r21
            r2 = r40
            r21 = r14
            r14 = r27
            if (r7 != 0) goto L1af
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r9, r3, r2)
            int r7 = r2.zba
            r37 = r3
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuj r3 = r0.zbu(r13)
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r12 = r12 & r16
            if (r12 == 0) goto L199
            if (r3 == 0) goto L199
            boolean r3 = r3.zba(r7)
            if (r3 == 0) goto L17c
            goto L199
        L17c:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r3 = zbd(r11)
            long r5 = (long) r7
            java.lang.Long r5 = java.lang.Long.valueOf(r5)
            r3.zbj(r15, r5)
            r5 = r37
            r6 = r2
        L18b:
            r3 = r9
            r2 = r11
            r8 = r13
            r7 = r14
            r11 = r20
            r9 = r21
            r12 = -1
            r14 = r4
        L195:
            r4 = r38
            goto L1a
        L199:
            r3 = r4 | r8
            r1.putInt(r11, r5, r7)
            r5 = r37
            r4 = r38
            r6 = r2
            r2 = r11
            r8 = r13
            r7 = r14
            r11 = r20
            r12 = -1
            r14 = r3
            r3 = r9
        L1ab:
            r9 = r21
            goto L1a
        L1af:
            r22 = r3
            r3 = r1
            r1 = r11
            r11 = r2
            r2 = r22
        L1b6:
            r22 = r4
            goto L3a7
        L1ba:
            r9 = r36
            r11 = r2
            r3 = r6
            r5 = r21
            r12 = 2
            r2 = r40
            r21 = r14
            r14 = r27
            if (r7 != r12) goto L1af
            r4 = r4 | r8
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zba(r9, r3, r2)
            java.lang.Object r7 = r2.zbc
            r1.putObject(r11, r5, r7)
            r6 = r2
            r5 = r3
            goto L18b
        L1d6:
            r9 = r36
            r11 = r2
            r3 = r6
            r21 = r14
            r14 = r27
            r12 = 2
            r2 = r40
            if (r7 != r12) goto L20e
            r7 = r4 | r8
            r4 = r1
            java.lang.Object r1 = r0.zbx(r11, r13)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r2 = r0.zbv(r13)
            r5 = r4
            r4 = r3
            r3 = r9
            r9 = r5
            r5 = r38
            r6 = r40
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbp(r1, r2, r3, r4, r5, r6)
            r4 = r1
            r1 = r3
            r3 = r6
            r0.zbF(r11, r13, r4)
            r4 = r14
            r14 = r7
            r7 = r4
            r4 = r38
            r5 = r2
            r2 = r11
            r8 = r13
            r11 = r20
            r12 = -1
        L20b:
            r3 = r1
            r1 = r9
            goto L1ab
        L20e:
            r33 = r9
            r9 = r1
            r1 = r33
            r33 = r3
            r3 = r2
            r2 = r33
            r22 = r9
            r9 = r1
            r1 = r11
            r11 = r3
            r3 = r22
            goto L1b6
        L220:
            r3 = r40
            r9 = r1
            r11 = r2
            r2 = r6
            r5 = r21
            r1 = r36
            r22 = r4
            r21 = r14
            r14 = r27
            r4 = 2
            if (r7 != r4) goto L255
            r4 = r22 | r8
            r7 = r12 & r23
            if (r7 == 0) goto L23d
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbi(r1, r2, r3)
            goto L241
        L23d:
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbh(r1, r2, r3)
        L241:
            java.lang.Object r7 = r3.zbc
            r9.putObject(r11, r5, r7)
        L246:
            r5 = r2
            r6 = r3
            r2 = r11
            r8 = r13
            r7 = r14
            r11 = r20
            r12 = -1
            r3 = r1
            r14 = r4
            r1 = r9
        L251:
            r9 = r21
            goto L195
        L255:
            r33 = r9
            r9 = r1
            r1 = r11
            r11 = r3
            r3 = r33
            goto L3a7
        L25e:
            r3 = r40
            r9 = r1
            r11 = r2
            r2 = r6
            r5 = r21
            r1 = r36
            r22 = r4
            r21 = r14
            r14 = r27
            if (r7 != 0) goto L255
            r4 = r22 | r8
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbn(r1, r2, r3)
            long r7 = r3.zbb
            int r7 = (r7 > r24 ? 1 : (r7 == r24 ? 0 : -1))
            if (r7 == 0) goto L27d
            r7 = 1
            goto L27f
        L27d:
            r7 = r20
        L27f:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbm(r11, r5, r7)
            goto L246
        L283:
            r3 = r40
            r9 = r1
            r11 = r2
            r2 = r6
            r5 = r21
            r1 = r36
            r22 = r4
            r21 = r14
            r14 = r27
            r4 = 5
            if (r7 != r4) goto L255
            int r4 = r2 + 4
            r7 = r22 | r8
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbc(r1, r2)
            r9.putInt(r11, r5, r2)
            r2 = r14
            r14 = r7
            r7 = r2
            r6 = r3
            r5 = r4
            r2 = r11
            r8 = r13
            r11 = r20
            r12 = -1
            r4 = r38
            goto L20b
        L2ae:
            r3 = r40
            r9 = r1
            r11 = r2
            r2 = r6
            r5 = r21
            r1 = r36
            r22 = r4
            r21 = r14
            r14 = r27
            r4 = 1
            if (r7 != r4) goto L2e1
            int r7 = r2 + 8
            r8 = r22 | r8
            r3 = r5
            long r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbr(r1, r2)
            r2 = r9
            r9 = r1
            r1 = r2
            r2 = r11
            r11 = r40
            r1.putLong(r2, r3, r5)
            r4 = r38
            r5 = r7
            r3 = r9
            r6 = r11
            r7 = r14
            r11 = r20
            r9 = r21
            r12 = -1
            r14 = r8
            r8 = r13
            goto L1a
        L2e1:
            r4 = r9
            r9 = r1
            r1 = r11
            r11 = r3
        L2e5:
            r3 = r4
            goto L3a7
        L2e8:
            r9 = r4
            r4 = r1
            r1 = r2
            r2 = r6
            r5 = r21
            r22 = r9
            r9 = r36
            r11 = r40
            r21 = r14
            r14 = r27
            if (r7 != 0) goto L2e5
            r3 = r22 | r8
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r9, r2, r11)
            int r7 = r11.zba
            r4.putInt(r1, r5, r7)
            r5 = r2
            r6 = r11
            r8 = r13
            r7 = r14
            r11 = r20
            r12 = -1
            r2 = r1
            r14 = r3
            r1 = r4
            r3 = r9
            goto L251
        L312:
            r9 = r4
            r4 = r1
            r1 = r2
            r2 = r6
            r5 = r21
            r22 = r9
            r9 = r36
            r11 = r40
            r21 = r14
            r14 = r27
            if (r7 != 0) goto L2e5
            r7 = r22 | r8
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbn(r9, r2, r11)
            r1 = r4
            r3 = r5
            long r5 = r11.zbb
            r2 = r35
            r1.putLong(r2, r3, r5)
            r3 = r14
            r14 = r7
            r7 = r3
            r4 = r38
            r5 = r8
            r3 = r9
            r6 = r11
            r8 = r13
            r11 = r20
            r9 = r21
        L340:
            r12 = -1
            goto L1a
        L343:
            r9 = r36
            r11 = r40
            r3 = r1
            r1 = r2
            r2 = r6
            r5 = r21
            r22 = r4
            r21 = r14
            r14 = r27
            r4 = 5
            if (r7 != r4) goto L3a7
            int r4 = r2 + 4
            r7 = r22 | r8
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbc(r9, r2)
            float r2 = java.lang.Float.intBitsToFloat(r2)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbp(r1, r5, r2)
            r2 = r14
            r14 = r7
            r7 = r2
            r2 = r1
            r1 = r3
            r5 = r4
            r3 = r9
            r6 = r11
            r8 = r13
            r11 = r20
            r9 = r21
            r12 = -1
            goto L195
        L374:
            r9 = r36
            r11 = r40
            r3 = r1
            r1 = r2
            r2 = r6
            r5 = r21
            r22 = r4
            r21 = r14
            r14 = r27
            r4 = 1
            if (r7 != r4) goto L3a7
            int r4 = r2 + 8
            r7 = r22 | r8
            long r16 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbr(r9, r2)
            r37 = r7
            double r7 = java.lang.Double.longBitsToDouble(r16)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbo(r1, r5, r7)
            r2 = r1
            r1 = r3
            r5 = r4
            r3 = r9
            r6 = r11
            r8 = r13
            r7 = r14
            r11 = r20
            r9 = r21
            r12 = -1
            r14 = r37
            goto L195
        L3a7:
            r4 = r14
            r14 = r11
            r11 = r4
            r4 = r22
            r22 = r21
            r21 = r4
            r10 = r39
            r28 = r3
            r4 = r9
            r9 = r13
            r13 = r15
            r15 = r1
            r3 = r2
            goto Ld60
        L3bb:
            r3 = r1
            r1 = r2
            r2 = r6
            r33 = r14
            r14 = r5
            r5 = r21
            r21 = r33
            r4 = 27
            r22 = 10
            if (r11 != r4) goto L428
            r4 = 2
            if (r7 != r4) goto L414
            java.lang.Object r4 = r3.getObject(r1, r5)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun r4 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun) r4
            boolean r7 = r4.zbc()
            if (r7 != 0) goto L3ed
            int r7 = r4.size()
            if (r7 != 0) goto L3e3
        L3e0:
            r7 = r22
            goto L3e6
        L3e3:
            int r22 = r7 + r7
            goto L3e0
        L3e6:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun r4 = r4.zbd(r7)
            r3.putObject(r1, r5, r4)
        L3ed:
            r6 = r4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r1 = r0.zbv(r13)
            r5 = r38
            r7 = r40
            r4 = r2
            r8 = r3
            r2 = r15
            r15 = r35
            r3 = r36
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbf(r1, r2, r3, r4, r5, r6, r7)
            r3 = r15
            r15 = r2
            r2 = r3
            r3 = r36
            r4 = r38
            r6 = r40
            r5 = r1
            r1 = r8
            r8 = r13
            r7 = r14
            r11 = r20
            r14 = r21
            goto L340
        L414:
            r4 = r2
            r2 = r15
            r15 = r1
            r5 = r40
            r28 = r3
            r22 = r9
            r9 = r13
            r30 = r14
            r3 = r36
            r13 = r2
            r14 = r4
        L424:
            r4 = r38
            goto Lb0e
        L428:
            r4 = r2
            r2 = r15
            r15 = r1
            r1 = r3
            r3 = 49
            java.lang.String r27 = "Protocol message had invalid UTF-8."
            r28 = r1
            java.lang.String r1 = ""
            java.lang.String r29 = "While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length."
            if (r11 > r3) goto L9f9
            r30 = r2
            long r2 = (long) r12
            sun.misc.Unsafe r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbb
            java.lang.Object r12 = r8.getObject(r15, r5)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun) r12
            boolean r23 = r12.zbc()
            if (r23 != 0) goto L45f
            int r23 = r12.size()
            if (r23 != 0) goto L454
        L44f:
            r31 = r2
            r2 = r22
            goto L457
        L454:
            int r22 = r23 + r23
            goto L44f
        L457:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun r12 = r12.zbd(r2)
            r8.putObject(r15, r5, r12)
            goto L461
        L45f:
            r31 = r2
        L461:
            java.lang.String r2 = "CodedInputStream encountered an embedded string or message which claimed to have negative size."
            switch(r11) {
                case 18: goto L97f;
                case 19: goto L920;
                case 20: goto L8cf;
                case 21: goto L8cf;
                case 22: goto L8aa;
                case 23: goto L858;
                case 24: goto L807;
                case 25: goto L794;
                case 26: goto L6c8;
                case 27: goto L693;
                case 28: goto L61b;
                case 29: goto L8aa;
                case 30: goto L572;
                case 31: goto L807;
                case 32: goto L858;
                case 33: goto L51b;
                case 34: goto L4b5;
                case 35: goto L97f;
                case 36: goto L920;
                case 37: goto L8cf;
                case 38: goto L8cf;
                case 39: goto L8aa;
                case 40: goto L858;
                case 41: goto L807;
                case 42: goto L794;
                case 43: goto L8aa;
                case 44: goto L572;
                case 45: goto L807;
                case 46: goto L858;
                case 47: goto L51b;
                case 48: goto L4b5;
                default: goto L466;
            }
        L466:
            r3 = 3
            if (r7 != r3) goto L4a6
            r1 = r30 & (-8)
            r5 = r1 | 4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r1 = r0.zbv(r13)
            r2 = r36
            r6 = r40
            r3 = r4
            r8 = r30
            r4 = r38
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbd(r1, r2, r3, r4, r5, r6)
            r11 = r3
            java.lang.Object r3 = r6.zbc
            r12.add(r3)
        L484:
            if (r7 >= r4) goto L49c
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r2, r7, r6)
            r22 = r1
            int r1 = r6.zba
            if (r8 != r1) goto L49c
            r1 = r22
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbd(r1, r2, r3, r4, r5, r6)
            java.lang.Object r3 = r6.zbc
            r12.add(r3)
            goto L484
        L49c:
            r3 = r6
            r5 = r7
            r22 = r9
        L4a0:
            r9 = r13
            r10 = r14
        L4a2:
            r13 = r8
        L4a3:
            r14 = r11
            goto L9de
        L4a6:
            r2 = r36
            r3 = r40
            r22 = r9
            r9 = r13
            r10 = r14
            r13 = r30
            r14 = r4
            r4 = r38
            goto L9dd
        L4b5:
            r2 = r36
            r6 = r40
            r11 = r4
            r8 = r30
            r1 = 2
            r4 = r38
            if (r7 != r1) goto L4e9
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r2, r11, r6)
            int r3 = r6.zba
            int r3 = r3 + r1
        L4ca:
            if (r1 >= r3) goto L4de
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbn(r2, r1, r6)
            r22 = r9
            long r9 = r6.zbb
            long r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtg.zbc(r9)
            r12.zbg(r9)
            r9 = r22
            goto L4ca
        L4de:
            r22 = r9
            if (r1 != r3) goto L4e5
        L4e2:
            r5 = r1
            r3 = r6
            goto L4a0
        L4e5:
            defpackage.fa6.j(r29)
            return r20
        L4e9:
            r22 = r9
            if (r7 != 0) goto L514
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbn(r2, r11, r6)
            long r9 = r6.zbb
            long r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtg.zbc(r9)
            r12.zbg(r9)
        L4fc:
            if (r1 >= r4) goto L4e2
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r2, r1, r6)
            int r5 = r6.zba
            if (r8 != r5) goto L4e2
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbn(r2, r3, r6)
            long r9 = r6.zbb
            long r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtg.zbc(r9)
            r12.zbg(r9)
            goto L4fc
        L514:
            r3 = r6
            r9 = r13
            r10 = r14
        L517:
            r13 = r8
        L518:
            r14 = r11
            goto L9dd
        L51b:
            r2 = r36
            r6 = r40
            r11 = r4
            r22 = r9
            r8 = r30
            r1 = 2
            r4 = r38
            if (r7 != r1) goto L549
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r2, r11, r6)
            int r3 = r6.zba
            int r3 = r3 + r1
        L532:
            if (r1 >= r3) goto L542
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r2, r1, r6)
            int r5 = r6.zba
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtg.zbb(r5)
            r12.zbg(r5)
            goto L532
        L542:
            if (r1 != r3) goto L545
            goto L4e2
        L545:
            defpackage.fa6.j(r29)
            return r20
        L549:
            if (r7 != 0) goto L514
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r2, r11, r6)
            int r3 = r6.zba
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtg.zbb(r3)
            r12.zbg(r3)
        L55a:
            if (r1 >= r4) goto L4e2
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r2, r1, r6)
            int r5 = r6.zba
            if (r8 != r5) goto L4e2
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r2, r3, r6)
            int r3 = r6.zba
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtg.zbb(r3)
            r12.zbg(r3)
            goto L55a
        L572:
            r2 = r36
            r6 = r40
            r11 = r4
            r22 = r9
            r8 = r30
            r1 = 2
            r4 = r38
            if (r7 != r1) goto L589
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbg(r2, r11, r12, r6)
            r7 = r1
            r1 = r8
            r5 = r12
        L587:
            r3 = r2
            goto L593
        L589:
            if (r7 != 0) goto L617
            r1 = r8
            r3 = r11
            r5 = r12
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbm(r1, r2, r3, r4, r5, r6)
            goto L587
        L593:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuj r2 = r0.zbu(r13)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl r8 = r0.zbl
            int r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zba
            if (r2 == 0) goto L607
            if (r5 == 0) goto L5df
            int r9 = r5.size()
            r23 = r7
            r7 = r17
            r10 = r20
            r12 = r10
        L5aa:
            if (r10 >= r9) goto L5d3
            java.lang.Object r24 = r5.get(r10)
            r0 = r24
            java.lang.Integer r0 = (java.lang.Integer) r0
            r30 = r13
            int r13 = r0.intValue()
            boolean r24 = r2.zba(r13)
            if (r24 == 0) goto L5c8
            if (r10 == r12) goto L5c5
            r5.set(r12, r0)
        L5c5:
            int r12 = r12 + 1
            goto L5cc
        L5c8:
            java.lang.Object r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbn(r15, r14, r13, r7, r8)
        L5cc:
            int r10 = r10 + 1
            r0 = r34
            r13 = r30
            goto L5aa
        L5d3:
            r30 = r13
            if (r12 == r9) goto L60b
            java.util.List r0 = r5.subList(r12, r9)
            r0.clear()
            goto L60b
        L5df:
            r23 = r7
            r30 = r13
            java.util.Iterator r0 = r5.iterator()
            r5 = r17
        L5e9:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L60b
            java.lang.Object r7 = r0.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            boolean r9 = r2.zba(r7)
            if (r9 != 0) goto L5e9
            java.lang.Object r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbn(r15, r14, r7, r5, r8)
            r0.remove()
            goto L5e9
        L607:
            r23 = r7
            r30 = r13
        L60b:
            r0 = r34
            r13 = r1
            r2 = r3
            r3 = r6
            r10 = r14
            r5 = r23
            r9 = r30
            goto L4a3
        L617:
            r0 = r34
            goto L514
        L61b:
            r3 = r36
            r6 = r40
            r11 = r4
            r22 = r9
            r5 = r12
            r1 = r30
            r12 = 2
            r4 = r38
            r30 = r13
            if (r7 != r12) goto L689
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r3, r11, r6)
            int r7 = r6.zba
            if (r7 < 0) goto L685
            int r8 = r3.length
            int r8 = r8 - r0
            if (r7 > r8) goto L681
            if (r7 != 0) goto L640
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc.zbb
            r5.add(r7)
            goto L648
        L640:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc.zbj(r3, r0, r7)
            r5.add(r8)
        L647:
            int r0 = r0 + r7
        L648:
            if (r0 >= r4) goto L676
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r3, r0, r6)
            int r8 = r6.zba
            if (r1 != r8) goto L676
            int r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r3, r7, r6)
            int r7 = r6.zba
            if (r7 < 0) goto L672
            int r8 = r3.length
            int r8 = r8 - r0
            if (r7 > r8) goto L66e
            if (r7 != 0) goto L666
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc.zbb
            r5.add(r7)
            goto L648
        L666:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc.zbj(r3, r0, r7)
            r5.add(r8)
            goto L647
        L66e:
            defpackage.fa6.j(r29)
            return r20
        L672:
            defpackage.fa6.j(r2)
            return r20
        L676:
            r5 = r0
            r13 = r1
            r2 = r3
            r3 = r6
            r10 = r14
            r9 = r30
            r0 = r34
            goto L4a3
        L681:
            defpackage.fa6.j(r29)
            return r20
        L685:
            defpackage.fa6.j(r2)
            return r20
        L689:
            r0 = r34
            r13 = r1
            r2 = r3
            r3 = r6
            r10 = r14
            r9 = r30
            goto L518
        L693:
            r3 = r36
            r6 = r40
            r11 = r4
            r22 = r9
            r5 = r12
            r1 = r30
            r12 = 2
            r4 = r38
            r30 = r13
            if (r7 != r12) goto L6be
            r0 = r34
            r2 = r1
            r9 = r30
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r1 = r0.zbv(r9)
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r11
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbf(r1, r2, r3, r4, r5, r6, r7)
            r13 = r2
            r2 = r3
            r3 = r7
            r10 = r14
            r14 = r4
            r4 = r5
        L6bb:
            r5 = r1
            goto L9de
        L6be:
            r0 = r34
            r9 = r30
            r13 = r1
            r2 = r3
            r3 = r6
        L6c5:
            r10 = r14
            goto L518
        L6c8:
            r3 = r36
            r6 = r40
            r11 = r4
            r22 = r9
            r5 = r12
            r9 = r13
            r8 = r30
            r12 = 2
            r4 = r38
            if (r7 != r12) goto L78f
            r12 = 536870912(0x20000000, double:2.65249474E-315)
            long r12 = r31 & r12
            int r7 = (r12 > r24 ? 1 : (r12 == r24 ? 0 : -1))
            if (r7 != 0) goto L72c
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r3, r11, r6)
            int r10 = r6.zba
            if (r10 < 0) goto L728
            if (r10 != 0) goto L6ef
            r5.add(r1)
            goto L6fa
        L6ef:
            java.lang.String r12 = new java.lang.String
            java.nio.charset.Charset r13 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zba
            r12.<init>(r3, r7, r10, r13)
            r5.add(r12)
        L6f9:
            int r7 = r7 + r10
        L6fa:
            if (r7 >= r4) goto L721
            int r10 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r3, r7, r6)
            int r12 = r6.zba
            if (r8 != r12) goto L721
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r3, r10, r6)
            int r10 = r6.zba
            if (r10 < 0) goto L71d
            if (r10 != 0) goto L712
            r5.add(r1)
            goto L6fa
        L712:
            java.lang.String r12 = new java.lang.String
            java.nio.charset.Charset r13 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zba
            r12.<init>(r3, r7, r10, r13)
            r5.add(r12)
            goto L6f9
        L71d:
            defpackage.fa6.j(r2)
            return r20
        L721:
            r2 = r3
            r3 = r6
            r5 = r7
            r13 = r8
            r10 = r14
            goto L4a3
        L728:
            defpackage.fa6.j(r2)
            return r20
        L72c:
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r3, r11, r6)
            int r10 = r6.zba
            if (r10 < 0) goto L789
            if (r10 != 0) goto L73c
            r5.add(r1)
            r23 = r2
            goto L751
        L73c:
            int r12 = r7 + r10
            boolean r13 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwv.zbd(r3, r7, r12)
            if (r13 == 0) goto L785
            java.lang.String r13 = new java.lang.String
            r23 = r2
            java.nio.charset.Charset r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zba
            r13.<init>(r3, r7, r10, r2)
            r5.add(r13)
            r7 = r12
        L751:
            if (r7 >= r4) goto L721
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r3, r7, r6)
            int r10 = r6.zba
            if (r8 != r10) goto L721
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r3, r2, r6)
            int r2 = r6.zba
            if (r2 < 0) goto L781
            if (r2 != 0) goto L769
            r5.add(r1)
            goto L751
        L769:
            int r10 = r7 + r2
            boolean r12 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwv.zbd(r3, r7, r10)
            if (r12 == 0) goto L77d
            java.lang.String r12 = new java.lang.String
            java.nio.charset.Charset r13 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zba
            r12.<init>(r3, r7, r2, r13)
            r5.add(r12)
            r7 = r10
            goto L751
        L77d:
            defpackage.fa6.j(r27)
            return r20
        L781:
            defpackage.fa6.j(r23)
            return r20
        L785:
            defpackage.fa6.j(r27)
            return r20
        L789:
            r23 = r2
            defpackage.fa6.j(r23)
            return r20
        L78f:
            r2 = r3
            r3 = r6
            r13 = r8
            goto L6c5
        L794:
            r3 = r36
            r6 = r40
            r11 = r4
            r22 = r9
            r5 = r12
            r9 = r13
            r8 = r30
            r12 = 2
            r4 = r38
            if (r7 != r12) goto L7d0
            r12 = r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbss r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbss) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r3, r11, r6)
            int r2 = r6.zba
            int r2 = r2 + r1
        L7ae:
            if (r1 >= r2) goto L7c4
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbn(r3, r1, r6)
            r10 = r14
            long r13 = r6.zbb
            int r5 = (r13 > r24 ? 1 : (r13 == r24 ? 0 : -1))
            if (r5 == 0) goto L7bd
            r5 = 1
            goto L7bf
        L7bd:
            r5 = r20
        L7bf:
            r12.zbe(r5)
            r14 = r10
            goto L7ae
        L7c4:
            r10 = r14
            if (r1 != r2) goto L7cc
        L7c7:
            r5 = r1
            r2 = r3
            r3 = r6
            goto L4a2
        L7cc:
            defpackage.fa6.j(r29)
            return r20
        L7d0:
            r10 = r14
            if (r7 != 0) goto L803
            r12 = r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbss r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbss) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbn(r3, r11, r6)
            long r13 = r6.zbb
            int r2 = (r13 > r24 ? 1 : (r13 == r24 ? 0 : -1))
            if (r2 == 0) goto L7e2
            r2 = 1
            goto L7e4
        L7e2:
            r2 = r20
        L7e4:
            r12.zbe(r2)
        L7e7:
            if (r1 >= r4) goto L7c7
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r3, r1, r6)
            int r5 = r6.zba
            if (r8 != r5) goto L7c7
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbn(r3, r2, r6)
            long r13 = r6.zbb
            int r2 = (r13 > r24 ? 1 : (r13 == r24 ? 0 : -1))
            if (r2 == 0) goto L7fd
            r2 = 1
            goto L7ff
        L7fd:
            r2 = r20
        L7ff:
            r12.zbe(r2)
            goto L7e7
        L803:
            r2 = r3
            r3 = r6
            goto L517
        L807:
            r3 = r36
            r6 = r40
            r11 = r4
            r22 = r9
            r5 = r12
            r9 = r13
            r10 = r14
            r8 = r30
            r12 = 2
            r4 = r38
            if (r7 != r12) goto L835
            r12 = r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r3, r11, r6)
            int r2 = r6.zba
            int r2 = r2 + r1
        L822:
            if (r1 >= r2) goto L82e
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbc(r3, r1)
            r12.zbg(r5)
            int r1 = r1 + 4
            goto L822
        L82e:
            if (r1 != r2) goto L831
            goto L7c7
        L831:
            defpackage.fa6.j(r29)
            return r20
        L835:
            r1 = 5
            if (r7 != r1) goto L803
            int r1 = r11 + 4
            r12 = r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbug) r12
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbc(r3, r11)
            r12.zbg(r2)
        L844:
            if (r1 >= r4) goto L7c7
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r3, r1, r6)
            int r5 = r6.zba
            if (r8 != r5) goto L7c7
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbc(r3, r2)
            r12.zbg(r1)
            int r1 = r2 + 4
            goto L844
        L858:
            r3 = r36
            r6 = r40
            r11 = r4
            r22 = r9
            r5 = r12
            r9 = r13
            r10 = r14
            r8 = r30
            r12 = 2
            r4 = r38
            if (r7 != r12) goto L887
            r12 = r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r3, r11, r6)
            int r2 = r6.zba
            int r2 = r2 + r1
        L873:
            if (r1 >= r2) goto L87f
            long r13 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbr(r3, r1)
            r12.zbg(r13)
            int r1 = r1 + 8
            goto L873
        L87f:
            if (r1 != r2) goto L883
            goto L7c7
        L883:
            defpackage.fa6.j(r29)
            return r20
        L887:
            r1 = 1
            if (r7 != r1) goto L803
            int r1 = r11 + 8
            r12 = r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva) r12
            long r13 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbr(r3, r11)
            r12.zbg(r13)
        L896:
            if (r1 >= r4) goto L7c7
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r3, r1, r6)
            int r5 = r6.zba
            if (r8 != r5) goto L7c7
            long r13 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbr(r3, r2)
            r12.zbg(r13)
            int r1 = r2 + 8
            goto L896
        L8aa:
            r3 = r36
            r6 = r40
            r11 = r4
            r22 = r9
            r5 = r12
            r9 = r13
            r10 = r14
            r8 = r30
            r12 = 2
            r4 = r38
            if (r7 != r12) goto L8c1
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbg(r3, r11, r5, r6)
            goto L7c7
        L8c1:
            if (r7 != 0) goto L803
            r2 = r3
            r1 = r8
            r3 = r11
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbm(r1, r2, r3, r4, r5, r6)
            r13 = r1
            r14 = r3
            r3 = r6
            goto L9de
        L8cf:
            r2 = r36
            r3 = r40
            r22 = r9
            r5 = r12
            r9 = r13
            r10 = r14
            r13 = r30
            r12 = 2
            r14 = r4
            r4 = r38
            if (r7 != r12) goto L8fe
            r12 = r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r2, r14, r3)
            int r5 = r3.zba
            int r5 = r5 + r1
        L8ea:
            if (r1 >= r5) goto L8f6
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbn(r2, r1, r3)
            long r6 = r3.zbb
            r12.zbg(r6)
            goto L8ea
        L8f6:
            if (r1 != r5) goto L8fa
        L8f8:
            goto L6bb
        L8fa:
            defpackage.fa6.j(r29)
            return r20
        L8fe:
            if (r7 != 0) goto L9dd
            r12 = r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbva) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbn(r2, r14, r3)
            long r5 = r3.zbb
            r12.zbg(r5)
        L90c:
            if (r1 >= r4) goto L6bb
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r2, r1, r3)
            int r6 = r3.zba
            if (r13 != r6) goto L6bb
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbn(r2, r5, r3)
            long r5 = r3.zbb
            r12.zbg(r5)
            goto L90c
        L920:
            r2 = r36
            r3 = r40
            r22 = r9
            r5 = r12
            r9 = r13
            r10 = r14
            r13 = r30
            r12 = 2
            r14 = r4
            r4 = r38
            if (r7 != r12) goto L952
            r12 = r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r2, r14, r3)
            int r5 = r3.zba
            int r5 = r5 + r1
        L93b:
            if (r1 >= r5) goto L94b
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbc(r2, r1)
            float r6 = java.lang.Float.intBitsToFloat(r6)
            r12.zbg(r6)
            int r1 = r1 + 4
            goto L93b
        L94b:
            if (r1 != r5) goto L94e
            goto L8f8
        L94e:
            defpackage.fa6.j(r29)
            return r20
        L952:
            r1 = 5
            if (r7 != r1) goto L9dd
            int r6 = r14 + 4
            r12 = r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtw) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbc(r2, r14)
            float r1 = java.lang.Float.intBitsToFloat(r1)
            r12.zbg(r1)
        L965:
            if (r6 >= r4) goto L97d
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r2, r6, r3)
            int r5 = r3.zba
            if (r13 != r5) goto L97d
            int r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbc(r2, r1)
            float r5 = java.lang.Float.intBitsToFloat(r5)
            r12.zbg(r5)
            int r6 = r1 + 4
            goto L965
        L97d:
            r5 = r6
            goto L9de
        L97f:
            r2 = r36
            r3 = r40
            r22 = r9
            r5 = r12
            r9 = r13
            r10 = r14
            r13 = r30
            r12 = 2
            r14 = r4
            r4 = r38
            if (r7 != r12) goto L9b2
            r12 = r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtm r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtm) r12
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r2, r14, r3)
            int r5 = r3.zba
            int r5 = r5 + r1
        L99a:
            if (r1 >= r5) goto L9aa
            long r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbr(r2, r1)
            double r6 = java.lang.Double.longBitsToDouble(r6)
            r12.zbf(r6)
            int r1 = r1 + 8
            goto L99a
        L9aa:
            if (r1 != r5) goto L9ae
            goto L8f8
        L9ae:
            defpackage.fa6.j(r29)
            return r20
        L9b2:
            r1 = 1
            if (r7 != r1) goto L9dd
            int r6 = r14 + 8
            r12 = r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtm r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtm) r12
            long r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbr(r2, r14)
            double r7 = java.lang.Double.longBitsToDouble(r7)
            r12.zbf(r7)
        L9c5:
            if (r6 >= r4) goto L97d
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r2, r6, r3)
            int r5 = r3.zba
            if (r13 != r5) goto L97d
            long r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbr(r2, r1)
            double r5 = java.lang.Double.longBitsToDouble(r5)
            r12.zbf(r5)
            int r6 = r1 + 8
            goto L9c5
        L9dd:
            r5 = r14
        L9de:
            if (r5 == r14) goto L9f1
            r6 = r3
            r8 = r9
            r7 = r10
            r11 = r20
            r14 = r21
            r9 = r22
            r1 = r28
            r12 = -1
            r3 = r2
            r2 = r15
        L9ee:
            r15 = r13
            goto L1a
        L9f1:
            r4 = r2
            r14 = r3
            r3 = r5
            r11 = r10
            r10 = r39
            goto Ld60
        L9f9:
            r3 = r40
            r22 = r9
            r9 = r13
            r30 = r14
            r10 = r28
            r13 = r2
            r14 = r4
            r2 = r36
            r4 = 50
            if (r11 != r4) goto Lb17
            r4 = 2
            if (r7 != r4) goto Lb08
            sun.misc.Unsafe r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbb
            java.lang.Object r4 = r0.zbw(r9)
            java.lang.Object r7 = r1.getObject(r15, r5)
            r8 = r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg r8 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg) r8
            boolean r8 = r8.zbe()
            if (r8 != 0) goto La2f
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg.zba()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg r8 = r8.zbb()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvh.zba(r8, r7)
            r1.putObject(r15, r5, r8)
            r7 = r8
        La2f:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvf r4 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvf) r4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbve r8 = r4.zbc()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg r7 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg) r7
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r2, r14, r3)
            int r4 = r3.zba
            if (r4 < 0) goto Lb04
            int r5 = r38 - r1
            if (r4 > r5) goto Lb04
            int r11 = r1 + r4
            java.lang.Object r4 = r8.zbb
            java.lang.Object r5 = r8.zbd
            r12 = r4
        La4a:
            if (r1 >= r11) goto Lad7
            int r4 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto La58
            int r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbl(r1, r2, r4, r3)
            int r1 = r3.zba
        La58:
            int r6 = r1 >>> 3
            r2 = r1 & 7
            r3 = 1
            if (r6 == r3) goto La9e
            r3 = 2
            if (r6 == r3) goto La6f
            r3 = r36
            r6 = r4
            r2 = r5
            r28 = r10
            r10 = 1
        La69:
            r4 = r38
            r5 = r40
            goto Lace
        La6f:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbww r3 = r8.zbc
            int r3 = r3.zba()
            if (r2 != r3) goto La96
            r2 = r4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbww r4 = r8.zbc
            java.lang.Object r1 = r8.zbd
            java.lang.Class r5 = r1.getClass()
            r1 = r36
            r3 = r38
            r6 = r40
            r28 = r10
            r10 = 1
            int r2 = zbO(r1, r2, r3, r4, r5, r6)
            java.lang.Object r5 = r6.zbc
            r1 = r2
            r3 = r6
            r10 = r28
            r2 = r36
            goto La4a
        La96:
            r28 = r10
            r10 = 1
            r3 = r36
            r6 = r4
            r2 = r5
            goto La69
        La9e:
            r6 = r40
            r28 = r10
            r10 = r3
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbww r3 = r8.zba
            int r3 = r3.zba()
            if (r2 != r3) goto Lac7
            r2 = r4
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbww r4 = r8.zba
            r1 = r5
            r5 = 0
            r3 = r38
            r12 = r1
            r1 = r36
            int r2 = zbO(r1, r2, r3, r4, r5, r6)
            r4 = r3
            r5 = r6
            r3 = r1
            java.lang.Object r1 = r5.zbc
            r10 = r12
            r12 = r1
            r1 = r2
            r2 = r3
            r3 = r5
            r5 = r10
        Lac4:
            r10 = r28
            goto La4a
        Lac7:
            r3 = r36
            r2 = r5
            r5 = r6
            r6 = r4
            r4 = r38
        Lace:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbq(r1, r3, r6, r4, r5)
            r10 = r5
            r5 = r2
            r2 = r3
            r3 = r10
            goto Lac4
        Lad7:
            r4 = r3
            r3 = r2
            r2 = r5
            r5 = r4
            r4 = r38
            r28 = r10
            if (r1 != r11) goto Lb00
            r7.put(r12, r2)
            if (r11 == r14) goto Laf7
            r6 = r5
            r8 = r9
            r5 = r11
            r2 = r15
            r11 = r20
            r14 = r21
            r9 = r22
            r1 = r28
            r7 = r30
            r12 = -1
            goto L9ee
        Laf7:
            r10 = r39
            r4 = r3
            r14 = r5
            r3 = r11
            r11 = r30
            goto Ld60
        Lb00:
            defpackage.fa6.j(r16)
            return r20
        Lb04:
            defpackage.fa6.j(r29)
            return r20
        Lb08:
            r5 = r3
            r28 = r10
            r3 = r2
            goto L424
        Lb0e:
            r10 = r39
            r4 = r3
            r3 = r14
            r11 = r30
            r14 = r5
            goto Ld60
        Lb17:
            r4 = r38
            r3 = r2
            r28 = r10
            r10 = 1
            int r2 = r9 + 2
            sun.misc.Unsafe r10 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbb
            r2 = r8[r2]
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r18
            long r2 = (long) r2
            switch(r11) {
                case 51: goto Ld23;
                case 52: goto Ld01;
                case 53: goto Lce5;
                case 54: goto Lce5;
                case 55: goto Lcc9;
                case 56: goto Lcac;
                case 57: goto Lc8f;
                case 58: goto Lc68;
                case 59: goto Lc2b;
                case 60: goto Lbfb;
                case 61: goto Lbe4;
                case 62: goto Lcc9;
                case 63: goto Lbb0;
                case 64: goto Lc8f;
                case 65: goto Lcac;
                case 66: goto Lb91;
                case 67: goto Lb66;
                case 68: goto Lb37;
                default: goto Lb2c;
            }
        Lb2c:
            r4 = r36
            r11 = r30
        Lb30:
            r30 = r9
            r9 = r14
            r14 = r40
            goto Ld45
        Lb37:
            r3 = 3
            if (r7 != r3) goto Lb61
            r1 = r13 & (-8)
            r6 = r1 | 4
            r11 = r30
            java.lang.Object r1 = r0.zby(r15, r11, r9)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r2 = r0.zbv(r9)
            r3 = r36
            r7 = r40
            r5 = r4
            r4 = r14
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbo(r1, r2, r3, r4, r5, r6, r7)
            r12 = r3
            r3 = r1
            r1 = r12
            r12 = r7
            r0.zbG(r15, r11, r9, r3)
            r5 = r2
        Lb5a:
            r30 = r9
            r14 = r12
            r9 = r4
        Lb5e:
            r4 = r1
            goto Ld46
        Lb61:
            r11 = r30
            r4 = r36
            goto Lb30
        Lb66:
            r1 = r36
            r12 = r40
            r4 = r14
            r11 = r30
            if (r7 != 0) goto Lb8a
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbn(r1, r4, r12)
            r14 = r7
            long r7 = r12.zbb
            long r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtg.zbc(r7)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r10.putObject(r15, r5, r7)
            r10.putInt(r15, r2, r11)
            r30 = r9
            r5 = r14
            r9 = r4
            r14 = r12
            goto Lb5e
        Lb8a:
            r30 = r9
            r14 = r12
            r9 = r4
            r4 = r1
            goto Ld45
        Lb91:
            r1 = r36
            r12 = r40
            r4 = r14
            r11 = r30
            if (r7 != 0) goto Lb8a
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r1, r4, r12)
            int r8 = r12.zba
            int r8 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtg.zbb(r8)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10.putObject(r15, r5, r8)
            r10.putInt(r15, r2, r11)
        Lbae:
            r5 = r7
            goto Lb5a
        Lbb0:
            r1 = r36
            r12 = r40
            r4 = r14
            r11 = r30
            if (r7 != 0) goto Lb8a
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r1, r4, r12)
            int r8 = r12.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuj r14 = r0.zbu(r9)
            if (r14 == 0) goto Lbd9
            boolean r14 = r14.zba(r8)
            if (r14 == 0) goto Lbcc
            goto Lbd9
        Lbcc:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r2 = zbd(r15)
            long r5 = (long) r8
            java.lang.Long r3 = java.lang.Long.valueOf(r5)
            r2.zbj(r13, r3)
            goto Lbae
        Lbd9:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r10.putObject(r15, r5, r8)
            r10.putInt(r15, r2, r11)
            goto Lbae
        Lbe4:
            r1 = r36
            r12 = r40
            r4 = r14
            r11 = r30
            r8 = 2
            if (r7 != r8) goto Lb8a
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zba(r1, r4, r12)
            java.lang.Object r14 = r12.zbc
            r10.putObject(r15, r5, r14)
            r10.putInt(r15, r2, r11)
            goto Lbae
        Lbfb:
            r1 = r36
            r12 = r40
            r4 = r14
            r11 = r30
            r8 = 2
            if (r7 != r8) goto Lc23
            java.lang.Object r1 = r0.zby(r15, r11, r9)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r2 = r0.zbv(r9)
            r3 = r36
            r5 = r38
            r6 = r12
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbp(r1, r2, r3, r4, r5, r6)
            r14 = r4
            r4 = r3
            r3 = r14
            r14 = r6
            r0.zbG(r15, r11, r9, r1)
            r5 = r2
            r30 = r9
            r9 = r3
            goto Ld46
        Lc23:
            r3 = r4
            r14 = r12
            r4 = r1
            r30 = r9
            r9 = r3
            goto Ld45
        Lc2b:
            r4 = r36
            r11 = r30
            r8 = 2
            r30 = r9
            r9 = r14
            r14 = r40
            if (r7 != r8) goto Ld45
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r4, r9, r14)
            int r8 = r14.zba
            if (r8 != 0) goto Lc43
            r10.putObject(r15, r5, r1)
            goto Lc62
        Lc43:
            r1 = r12 & r23
            int r12 = r7 + r8
            if (r1 == 0) goto Lc54
            boolean r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwv.zbd(r4, r7, r12)
            if (r1 == 0) goto Lc50
            goto Lc54
        Lc50:
            defpackage.fa6.j(r27)
            return r20
        Lc54:
            java.lang.String r1 = new java.lang.String
            r23 = r12
            java.nio.charset.Charset r12 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuo.zba
            r1.<init>(r4, r7, r8, r12)
            r10.putObject(r15, r5, r1)
            r7 = r23
        Lc62:
            r10.putInt(r15, r2, r11)
            r5 = r7
            goto Ld46
        Lc68:
            r4 = r36
            r11 = r30
            r30 = r9
            r9 = r14
            r14 = r40
            if (r7 != 0) goto Ld45
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbn(r4, r9, r14)
            long r7 = r14.zbb
            int r7 = (r7 > r24 ? 1 : (r7 == r24 ? 0 : -1))
            if (r7 == 0) goto Lc80
            r26 = 1
            goto Lc82
        Lc80:
            r26 = r20
        Lc82:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r26)
            r10.putObject(r15, r5, r7)
            r10.putInt(r15, r2, r11)
        Lc8c:
            r5 = r1
            goto Ld46
        Lc8f:
            r4 = r36
            r11 = r30
            r1 = 5
            r30 = r9
            r9 = r14
            r14 = r40
            if (r7 != r1) goto Ld45
            int r1 = r9 + 4
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbc(r4, r9)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.putObject(r15, r5, r7)
            r10.putInt(r15, r2, r11)
            goto Lc8c
        Lcac:
            r4 = r36
            r11 = r30
            r1 = 1
            r30 = r9
            r9 = r14
            r14 = r40
            if (r7 != r1) goto Ld45
            int r1 = r9 + 8
            long r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbr(r4, r9)
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r10.putObject(r15, r5, r7)
            r10.putInt(r15, r2, r11)
            goto Lc8c
        Lcc9:
            r4 = r36
            r11 = r30
            r30 = r9
            r9 = r14
            r14 = r40
            if (r7 != 0) goto Ld45
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbk(r4, r9, r14)
            int r7 = r14.zba
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r10.putObject(r15, r5, r7)
            r10.putInt(r15, r2, r11)
            goto Lc8c
        Lce5:
            r4 = r36
            r11 = r30
            r30 = r9
            r9 = r14
            r14 = r40
            if (r7 != 0) goto Ld45
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbn(r4, r9, r14)
            long r7 = r14.zbb
            java.lang.Long r7 = java.lang.Long.valueOf(r7)
            r10.putObject(r15, r5, r7)
            r10.putInt(r15, r2, r11)
            goto Lc8c
        Ld01:
            r4 = r36
            r11 = r30
            r1 = 5
            r30 = r9
            r9 = r14
            r14 = r40
            if (r7 != r1) goto Ld45
            int r1 = r9 + 4
            int r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbc(r4, r9)
            float r7 = java.lang.Float.intBitsToFloat(r7)
            java.lang.Float r7 = java.lang.Float.valueOf(r7)
            r10.putObject(r15, r5, r7)
            r10.putInt(r15, r2, r11)
            goto Lc8c
        Ld23:
            r4 = r36
            r11 = r30
            r1 = 1
            r30 = r9
            r9 = r14
            r14 = r40
            if (r7 != r1) goto Ld45
            int r1 = r9 + 8
            long r7 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbr(r4, r9)
            double r7 = java.lang.Double.longBitsToDouble(r7)
            java.lang.Double r7 = java.lang.Double.valueOf(r7)
            r10.putObject(r15, r5, r7)
            r10.putInt(r15, r2, r11)
            goto Lc8c
        Ld45:
            r5 = r9
        Ld46:
            if (r5 == r9) goto Ld5b
            r3 = r4
            r7 = r11
            r6 = r14
            r2 = r15
            r11 = r20
            r14 = r21
            r9 = r22
            r1 = r28
            r8 = r30
            r12 = -1
            r4 = r38
            goto L9ee
        Ld5b:
            r10 = r39
            r3 = r5
            r9 = r30
        Ld60:
            if (r13 != r10) goto Ld72
            if (r10 == 0) goto Ld72
            r4 = r38
            r5 = r3
            r2 = r15
            r15 = r13
            r14 = r21
            r9 = r22
        Ld6d:
            r1 = 1048575(0xfffff, float:1.469367E-39)
            goto Ldd9
        Ld72:
            boolean r1 = r0.zbh
            if (r1 == 0) goto Ldab
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r1 = r14.zbd
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp.zbb
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp.zba
            if (r1 == r2) goto Ldab
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r2 = r0.zbg
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl r7 = r0.zbl
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbud r6 = r1.zbc(r2, r11)
            if (r6 != 0) goto Ld99
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r5 = zbd(r15)
            r2 = r4
            r1 = r13
            r6 = r14
            r4 = r38
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbj(r1, r2, r3, r4, r5, r6)
        Ld97:
            r5 = r3
            goto Ldbb
        Ld99:
            r1 = r13
            r5 = r15
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub) r5
            r5.zbg()
            r2 = r36
            r4 = r38
            r8 = r40
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbb(r1, r2, r3, r4, r5, r6, r7, r8)
            goto Ld97
        Ldab:
            r1 = r13
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r5 = zbd(r15)
            r2 = r36
            r4 = r38
            r6 = r40
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsr.zbj(r1, r2, r3, r4, r5, r6)
            goto Ld97
        Ldbb:
            r3 = r36
            r6 = r40
            r8 = r9
            r7 = r11
            r2 = r15
            r11 = r20
            r14 = r21
            r9 = r22
            r12 = -1
            r15 = r1
            r1 = r28
            goto L1a
        Ldce:
            r10 = r39
            r28 = r1
            r22 = r9
            r20 = r11
            r21 = r14
            goto Ld6d
        Ldd9:
            if (r9 == r1) goto Lde1
            long r6 = (long) r9
            r1 = r28
            r1.putInt(r2, r6, r14)
        Lde1:
            int r1 = r0.zbj
            r3 = r17
        Lde5:
            int r6 = r0.zbk
            if (r1 >= r6) goto Le9a
            int[] r6 = r0.zbi
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl r7 = r0.zbl
            int[] r8 = r0.zbc
            r6 = r6[r1]
            r8 = r8[r6]
            int r9 = r0.zbs(r6)
            r18 = 1048575(0xfffff, float:1.469367E-39)
            r9 = r9 & r18
            long r11 = (long) r9
            java.lang.Object r9 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r2, r11)
            if (r9 == 0) goto Le8a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuj r11 = r0.zbu(r6)
            if (r11 == 0) goto Le8a
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg r9 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg) r9
            java.lang.Object r6 = r0.zbw(r6)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvf r6 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvf) r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbve r6 = r6.zbc()
            java.util.Set r9 = r9.entrySet()
            java.util.Iterator r9 = r9.iterator()
        Le1d:
            boolean r12 = r9.hasNext()
            if (r12 == 0) goto Le8a
            java.lang.Object r12 = r9.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r13 = r12.getValue()
            java.lang.Integer r13 = (java.lang.Integer) r13
            int r13 = r13.intValue()
            boolean r13 = r11.zba(r13)
            if (r13 != 0) goto Le85
            if (r3 != 0) goto Le3f
            java.lang.Object r3 = r7.zba(r2)
        Le3f:
            java.lang.Object r13 = r12.getKey()
            java.lang.Object r14 = r12.getValue()
            int r13 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvf.zbb(r6, r13, r14)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r14 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc.zbb
            byte[] r14 = new byte[r13]
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbth r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbth
            r17 = r1
            r1 = r20
            r0.<init>(r14, r1, r13)
            java.lang.Object r1 = r12.getKey()     // Catch: java.io.IOException -> Le7e
            java.lang.Object r12 = r12.getValue()     // Catch: java.io.IOException -> Le7e
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvf.zbe(r0, r6, r1, r12)     // Catch: java.io.IOException -> Le7e
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsy.zba(r0, r14)
            r1 = 3
            int r12 = r8 << 3
            r13 = r3
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r13 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm) r13
            r19 = 2
            r12 = r12 | 2
            r13.zbj(r12, r0)
            r9.remove()
            r0 = r34
            r1 = r17
        Le7b:
            r20 = 0
            goto Le1d
        Le7e:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
        Le85:
            r19 = 2
            r0 = r34
            goto Le7b
        Le8a:
            r17 = r1
            r1 = 3
            r19 = 2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r3 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm) r3
            int r0 = r17 + 1
            r1 = r0
            r20 = 0
            r0 = r34
            goto Lde5
        Le9a:
            if (r3 == 0) goto Lea1
            r0 = r2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r0
            r0.zbc = r3
        Lea1:
            if (r10 != 0) goto Leac
            if (r5 != r4) goto Lea6
            goto Leb2
        Lea6:
            defpackage.fa6.j(r16)
            r20 = 0
            return r20
        Leac:
            r20 = 0
            if (r5 > r4) goto Leb3
            if (r15 != r10) goto Leb3
        Leb2:
            return r5
        Leb3:
            defpackage.fa6.j(r16)
            return r20
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final java.lang.Object zbe() {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r0 = r0.zbg
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = r0.zbt()
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbf(java.lang.Object r8) {
            r7 = this;
            boolean r0 = zbL(r8)
            if (r0 != 0) goto L8
            goto L95
        L8:
            boolean r0 = r8 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r0
            r2 = 2147483647(0x7fffffff, float:NaN)
            r0.zbE(r2)
            r0.zba = r1
            r0.zbC()
        L1b:
            int[] r0 = r7.zbc
        L1d:
            int r2 = r0.length
            if (r1 >= r2) goto L87
            int r2 = r7.zbs(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r3 = r3 & r2
            int r2 = zbr(r2)
            long r3 = (long) r3
            r5 = 9
            if (r2 == r5) goto L71
            r5 = 60
            if (r2 == r5) goto L59
            r5 = 68
            if (r2 == r5) goto L59
            switch(r2) {
                case 17: goto L71;
                case 18: goto L4f;
                case 19: goto L4f;
                case 20: goto L4f;
                case 21: goto L4f;
                case 22: goto L4f;
                case 23: goto L4f;
                case 24: goto L4f;
                case 25: goto L4f;
                case 26: goto L4f;
                case 27: goto L4f;
                case 28: goto L4f;
                case 29: goto L4f;
                case 30: goto L4f;
                case 31: goto L4f;
                case 32: goto L4f;
                case 33: goto L4f;
                case 34: goto L4f;
                case 35: goto L4f;
                case 36: goto L4f;
                case 37: goto L4f;
                case 38: goto L4f;
                case 39: goto L4f;
                case 40: goto L4f;
                case 41: goto L4f;
                case 42: goto L4f;
                case 43: goto L4f;
                case 44: goto L4f;
                case 45: goto L4f;
                case 46: goto L4f;
                case 47: goto L4f;
                case 48: goto L4f;
                case 49: goto L4f;
                case 50: goto L3d;
                default: goto L3c;
            }
        L3c:
            goto L84
        L3d:
            sun.misc.Unsafe r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbb
            java.lang.Object r5 = r2.getObject(r8, r3)
            if (r5 == 0) goto L84
            r6 = r5
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg r6 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg) r6
            r6.zbc()
            r2.putObject(r8, r3, r5)
            goto L84
        L4f:
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r8, r3)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun) r2
            r2.zbb()
            goto L84
        L59:
            int[] r2 = r7.zbc
            r2 = r2[r1]
            boolean r2 = r7.zbM(r8, r2, r1)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r2 = r7.zbv(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zbf(r3)
            goto L84
        L71:
            boolean r2 = r7.zbI(r8, r1)
            if (r2 == 0) goto L84
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r2 = r7.zbv(r1)
            sun.misc.Unsafe r5 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbb
            java.lang.Object r3 = r5.getObject(r8, r3)
            r2.zbf(r3)
        L84:
            int r1 = r1 + 3
            goto L1d
        L87:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl r0 = r7.zbl
            r0.zbb(r8)
            boolean r0 = r7.zbh
            if (r0 == 0) goto L95
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtq r7 = r7.zbm
            r7.zba(r8)
        L95:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbg(java.lang.Object r9, java.lang.Object r10) {
            r8 = this;
            zbA(r9)
            r10.getClass()
            r0 = 0
        L7:
            int[] r1 = r8.zbc
            int r1 = r1.length
            if (r0 >= r1) goto L1b8
            int r1 = r8.zbs(r0)
            r2 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r2 & r1
            int[] r3 = r8.zbc
            int r1 = zbr(r1)
            r3 = r3[r0]
            long r4 = (long) r2
            switch(r1) {
                case 0: goto L1a4;
                case 1: goto L193;
                case 2: goto L182;
                case 3: goto L171;
                case 4: goto L160;
                case 5: goto L14f;
                case 6: goto L13e;
                case 7: goto L12c;
                case 8: goto L11a;
                case 9: goto L115;
                case 10: goto L103;
                case 11: goto Lf1;
                case 12: goto Ldf;
                case 13: goto Lcd;
                case 14: goto Lbb;
                case 15: goto La9;
                case 16: goto L97;
                case 17: goto L92;
                case 18: goto L63;
                case 19: goto L63;
                case 20: goto L63;
                case 21: goto L63;
                case 22: goto L63;
                case 23: goto L63;
                case 24: goto L63;
                case 25: goto L63;
                case 26: goto L63;
                case 27: goto L63;
                case 28: goto L63;
                case 29: goto L63;
                case 30: goto L63;
                case 31: goto L63;
                case 32: goto L63;
                case 33: goto L63;
                case 34: goto L63;
                case 35: goto L63;
                case 36: goto L63;
                case 37: goto L63;
                case 38: goto L63;
                case 39: goto L63;
                case 40: goto L63;
                case 41: goto L63;
                case 42: goto L63;
                case 43: goto L63;
                case 44: goto L63;
                case 45: goto L63;
                case 46: goto L63;
                case 47: goto L63;
                case 48: goto L63;
                case 49: goto L63;
                case 50: goto L50;
                case 51: goto L3e;
                case 52: goto L3e;
                case 53: goto L3e;
                case 54: goto L3e;
                case 55: goto L3e;
                case 56: goto L3e;
                case 57: goto L3e;
                case 58: goto L3e;
                case 59: goto L3e;
                case 60: goto L39;
                case 61: goto L27;
                case 62: goto L27;
                case 63: goto L27;
                case 64: goto L27;
                case 65: goto L27;
                case 66: goto L27;
                case 67: goto L27;
                case 68: goto L22;
                default: goto L20;
            }
        L20:
            goto L1b4
        L22:
            r8.zbC(r9, r10, r0)
            goto L1b4
        L27:
            boolean r1 = r8.zbM(r10, r3, r0)
            if (r1 == 0) goto L1b4
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r10, r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbs(r9, r4, r1)
            r8.zbE(r9, r3, r0)
            goto L1b4
        L39:
            r8.zbC(r9, r10, r0)
            goto L1b4
        L3e:
            boolean r1 = r8.zbM(r10, r3, r0)
            if (r1 == 0) goto L1b4
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r10, r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbs(r9, r4, r1)
            r8.zbE(r9, r3, r0)
            goto L1b4
        L50:
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zba
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r9, r4)
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r10, r4)
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvh.zba(r1, r2)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbs(r9, r4, r1)
            goto L1b4
        L63:
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r9, r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun) r1
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r10, r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun) r2
            int r3 = r1.size()
            int r6 = r2.size()
            if (r3 <= 0) goto L89
            if (r6 <= 0) goto L89
            boolean r7 = r1.zbc()
            if (r7 != 0) goto L86
            int r6 = r6 + r3
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun r1 = r1.zbd(r6)
        L86:
            r1.addAll(r2)
        L89:
            if (r3 > 0) goto L8c
            goto L8d
        L8c:
            r2 = r1
        L8d:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbs(r9, r4, r2)
            goto L1b4
        L92:
            r8.zbB(r9, r10, r0)
            goto L1b4
        L97:
            boolean r1 = r8.zbI(r10, r0)
            if (r1 == 0) goto L1b4
            long r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r10, r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbr(r9, r4, r1)
            r8.zbD(r9, r0)
            goto L1b4
        La9:
            boolean r1 = r8.zbI(r10, r0)
            if (r1 == 0) goto L1b4
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r10, r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbq(r9, r4, r1)
            r8.zbD(r9, r0)
            goto L1b4
        Lbb:
            boolean r1 = r8.zbI(r10, r0)
            if (r1 == 0) goto L1b4
            long r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r10, r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbr(r9, r4, r1)
            r8.zbD(r9, r0)
            goto L1b4
        Lcd:
            boolean r1 = r8.zbI(r10, r0)
            if (r1 == 0) goto L1b4
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r10, r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbq(r9, r4, r1)
            r8.zbD(r9, r0)
            goto L1b4
        Ldf:
            boolean r1 = r8.zbI(r10, r0)
            if (r1 == 0) goto L1b4
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r10, r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbq(r9, r4, r1)
            r8.zbD(r9, r0)
            goto L1b4
        Lf1:
            boolean r1 = r8.zbI(r10, r0)
            if (r1 == 0) goto L1b4
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r10, r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbq(r9, r4, r1)
            r8.zbD(r9, r0)
            goto L1b4
        L103:
            boolean r1 = r8.zbI(r10, r0)
            if (r1 == 0) goto L1b4
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r10, r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbs(r9, r4, r1)
            r8.zbD(r9, r0)
            goto L1b4
        L115:
            r8.zbB(r9, r10, r0)
            goto L1b4
        L11a:
            boolean r1 = r8.zbI(r10, r0)
            if (r1 == 0) goto L1b4
            java.lang.Object r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r10, r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbs(r9, r4, r1)
            r8.zbD(r9, r0)
            goto L1b4
        L12c:
            boolean r1 = r8.zbI(r10, r0)
            if (r1 == 0) goto L1b4
            boolean r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbw(r10, r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbm(r9, r4, r1)
            r8.zbD(r9, r0)
            goto L1b4
        L13e:
            boolean r1 = r8.zbI(r10, r0)
            if (r1 == 0) goto L1b4
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r10, r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbq(r9, r4, r1)
            r8.zbD(r9, r0)
            goto L1b4
        L14f:
            boolean r1 = r8.zbI(r10, r0)
            if (r1 == 0) goto L1b4
            long r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r10, r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbr(r9, r4, r1)
            r8.zbD(r9, r0)
            goto L1b4
        L160:
            boolean r1 = r8.zbI(r10, r0)
            if (r1 == 0) goto L1b4
            int r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r10, r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbq(r9, r4, r1)
            r8.zbD(r9, r0)
            goto L1b4
        L171:
            boolean r1 = r8.zbI(r10, r0)
            if (r1 == 0) goto L1b4
            long r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r10, r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbr(r9, r4, r1)
            r8.zbD(r9, r0)
            goto L1b4
        L182:
            boolean r1 = r8.zbI(r10, r0)
            if (r1 == 0) goto L1b4
            long r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r10, r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbr(r9, r4, r1)
            r8.zbD(r9, r0)
            goto L1b4
        L193:
            boolean r1 = r8.zbI(r10, r0)
            if (r1 == 0) goto L1b4
            float r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbb(r10, r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbp(r9, r4, r1)
            r8.zbD(r9, r0)
            goto L1b4
        L1a4:
            boolean r1 = r8.zbI(r10, r0)
            if (r1 == 0) goto L1b4
            double r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zba(r10, r4)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbo(r9, r4, r1)
            r8.zbD(r9, r0)
        L1b4:
            int r0 = r0 + 3
            goto L7
        L1b8:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwl r0 = r8.zbl
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbp(r0, r9, r10)
            boolean r0 = r8.zbh
            if (r0 == 0) goto L1c6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtq r8 = r8.zbm
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbo(r8, r9, r10)
        L1c6:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbh(java.lang.Object r8, byte[] r9, int r10, int r11, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsq r12) {
            r7 = this;
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r6 = r12
            r0.zbc(r1, r2, r3, r4, r5, r6)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final void zbi(java.lang.Object r20, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwy r21) {
            r19 = this;
            r0 = r19
            r1 = r20
            r6 = r21
            boolean r2 = r0.zbh
            if (r2 == 0) goto L23
            r2 = r1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub) r2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu r2 = r2.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwh r3 = r2.zba
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L23
            java.util.Iterator r2 = r2.zbg()
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r8 = r2
            goto L25
        L23:
            r3 = 0
            r8 = 0
        L25:
            int[] r9 = r0.zbc
            sun.misc.Unsafe r10 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbb
            r2 = 0
            r4 = 1048575(0xfffff, float:1.469367E-39)
            r5 = 0
        L2e:
            int r13 = r9.length
            if (r2 >= r13) goto L547
            int r13 = r0.zbs(r2)
            int[] r14 = r0.zbc
            int r15 = zbr(r13)
            r7 = r14[r2]
            r12 = 17
            r16 = 1048575(0xfffff, float:1.469367E-39)
            if (r15 > r12) goto L6a
            int r12 = r2 + 2
            r12 = r14[r12]
            r14 = r12 & r16
            if (r14 == r4) goto L5c
            r11 = r16
            r17 = 1
            if (r14 != r11) goto L54
            r5 = 0
            goto L5a
        L54:
            long r4 = (long) r14
            int r4 = r10.getInt(r1, r4)
            r5 = r4
        L5a:
            r4 = r14
            goto L5e
        L5c:
            r17 = 1
        L5e:
            int r11 = r12 >>> 20
            int r11 = r17 << r11
            r18 = r11
            r11 = r3
            r3 = r4
            r4 = r5
            r5 = r18
            goto L70
        L6a:
            r17 = 1
            r11 = r3
            r3 = r4
            r4 = r5
            r5 = 0
        L70:
            if (r11 == 0) goto L91
            java.lang.Object r12 = r11.getKey()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuc r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuc) r12
            r12 = 32149011(0x1ea8e13, float:8.616189E-38)
            if (r7 < r12) goto L91
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtq r12 = r0.zbm
            r12.zbb(r6, r11)
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L8f
            java.lang.Object r11 = r8.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            goto L70
        L8f:
            r11 = 0
            goto L70
        L91:
            r16 = 1048575(0xfffff, float:1.469367E-39)
            r12 = r13 & r16
            long r12 = (long) r12
            switch(r15) {
                case 0: goto L532;
                case 1: goto L522;
                case 2: goto L512;
                case 3: goto L502;
                case 4: goto L4f2;
                case 5: goto L4e2;
                case 6: goto L4d2;
                case 7: goto L4c2;
                case 8: goto L4b2;
                case 9: goto L49e;
                case 10: goto L48d;
                case 11: goto L47e;
                case 12: goto L46f;
                case 13: goto L460;
                case 14: goto L451;
                case 15: goto L442;
                case 16: goto L430;
                case 17: goto L41c;
                case 18: goto L40c;
                case 19: goto L3fc;
                case 20: goto L3ec;
                case 21: goto L3dc;
                case 22: goto L3cc;
                case 23: goto L3bc;
                case 24: goto L3ac;
                case 25: goto L39c;
                case 26: goto L383;
                case 27: goto L357;
                case 28: goto L33e;
                case 29: goto L32e;
                case 30: goto L31e;
                case 31: goto L30e;
                case 32: goto L2fe;
                case 33: goto L2ee;
                case 34: goto L2de;
                case 35: goto L2cd;
                case 36: goto L2bc;
                case 37: goto L2ab;
                case 38: goto L29a;
                case 39: goto L289;
                case 40: goto L278;
                case 41: goto L267;
                case 42: goto L256;
                case 43: goto L245;
                case 44: goto L234;
                case 45: goto L223;
                case 46: goto L212;
                case 47: goto L201;
                case 48: goto L1f0;
                case 49: goto L1c4;
                case 50: goto L1ad;
                case 51: goto L19e;
                case 52: goto L18f;
                case 53: goto L180;
                case 54: goto L171;
                case 55: goto L162;
                case 56: goto L153;
                case 57: goto L144;
                case 58: goto L135;
                case 59: goto L126;
                case 60: goto L113;
                case 61: goto L103;
                case 62: goto Lf5;
                case 63: goto Le7;
                case 64: goto Ld9;
                case 65: goto Lcb;
                case 66: goto Lbd;
                case 67: goto Laf;
                case 68: goto L9d;
                default: goto L9a;
            }
        L9a:
            r14 = 0
            goto L540
        L9d:
            boolean r5 = r0.zbM(r1, r7, r2)
            if (r5 == 0) goto L9a
            java.lang.Object r5 = r10.getObject(r1, r12)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r12 = r0.zbv(r2)
            r6.zbq(r7, r5, r12)
            goto L9a
        Laf:
            boolean r5 = r0.zbM(r1, r7, r2)
            if (r5 == 0) goto L9a
            long r12 = zbt(r1, r12)
            r6.zbE(r7, r12)
            goto L9a
        Lbd:
            boolean r5 = r0.zbM(r1, r7, r2)
            if (r5 == 0) goto L9a
            int r5 = zbo(r1, r12)
            r6.zbC(r7, r5)
            goto L9a
        Lcb:
            boolean r5 = r0.zbM(r1, r7, r2)
            if (r5 == 0) goto L9a
            long r12 = zbt(r1, r12)
            r6.zbA(r7, r12)
            goto L9a
        Ld9:
            boolean r5 = r0.zbM(r1, r7, r2)
            if (r5 == 0) goto L9a
            int r5 = zbo(r1, r12)
            r6.zby(r7, r5)
            goto L9a
        Le7:
            boolean r5 = r0.zbM(r1, r7, r2)
            if (r5 == 0) goto L9a
            int r5 = zbo(r1, r12)
            r6.zbi(r7, r5)
            goto L9a
        Lf5:
            boolean r5 = r0.zbM(r1, r7, r2)
            if (r5 == 0) goto L9a
            int r5 = zbo(r1, r12)
            r6.zbJ(r7, r5)
            goto L9a
        L103:
            boolean r5 = r0.zbM(r1, r7, r2)
            if (r5 == 0) goto L9a
            java.lang.Object r5 = r10.getObject(r1, r12)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc) r5
            r6.zbd(r7, r5)
            goto L9a
        L113:
            boolean r5 = r0.zbM(r1, r7, r2)
            if (r5 == 0) goto L9a
            java.lang.Object r5 = r10.getObject(r1, r12)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r12 = r0.zbv(r2)
            r6.zbw(r7, r5, r12)
            goto L9a
        L126:
            boolean r5 = r0.zbM(r1, r7, r2)
            if (r5 == 0) goto L9a
            java.lang.Object r5 = r10.getObject(r1, r12)
            zbP(r7, r5, r6)
            goto L9a
        L135:
            boolean r5 = r0.zbM(r1, r7, r2)
            if (r5 == 0) goto L9a
            boolean r5 = zbN(r1, r12)
            r6.zbb(r7, r5)
            goto L9a
        L144:
            boolean r5 = r0.zbM(r1, r7, r2)
            if (r5 == 0) goto L9a
            int r5 = zbo(r1, r12)
            r6.zbk(r7, r5)
            goto L9a
        L153:
            boolean r5 = r0.zbM(r1, r7, r2)
            if (r5 == 0) goto L9a
            long r12 = zbt(r1, r12)
            r6.zbm(r7, r12)
            goto L9a
        L162:
            boolean r5 = r0.zbM(r1, r7, r2)
            if (r5 == 0) goto L9a
            int r5 = zbo(r1, r12)
            r6.zbr(r7, r5)
            goto L9a
        L171:
            boolean r5 = r0.zbM(r1, r7, r2)
            if (r5 == 0) goto L9a
            long r12 = zbt(r1, r12)
            r6.zbL(r7, r12)
            goto L9a
        L180:
            boolean r5 = r0.zbM(r1, r7, r2)
            if (r5 == 0) goto L9a
            long r12 = zbt(r1, r12)
            r6.zbt(r7, r12)
            goto L9a
        L18f:
            boolean r5 = r0.zbM(r1, r7, r2)
            if (r5 == 0) goto L9a
            float r5 = zbn(r1, r12)
            r6.zbo(r7, r5)
            goto L9a
        L19e:
            boolean r5 = r0.zbM(r1, r7, r2)
            if (r5 == 0) goto L9a
            double r12 = zbm(r1, r12)
            r6.zbf(r7, r12)
            goto L9a
        L1ad:
            java.lang.Object r5 = r10.getObject(r1, r12)
            if (r5 == 0) goto L9a
            java.lang.Object r12 = r0.zbw(r2)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvf r12 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvf) r12
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbve r12 = r12.zbc()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg) r5
            r6.zbv(r7, r12, r5)
            goto L9a
        L1c4:
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r12 = r0.zbv(r2)
            int r13 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zba
            if (r7 == 0) goto L9a
            boolean r13 = r7.isEmpty()
            if (r13 != 0) goto L9a
            r13 = 0
        L1dd:
            int r14 = r7.size()
            if (r13 >= r14) goto L9a
            java.lang.Object r14 = r7.get(r13)
            r15 = r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtl r15 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtl) r15
            r15.zbq(r5, r14, r12)
            int r13 = r13 + 1
            goto L1dd
        L1f0:
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            r14 = r17
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbB(r5, r7, r6, r14)
            goto L9a
        L201:
            r14 = r17
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbA(r5, r7, r6, r14)
            goto L9a
        L212:
            r14 = r17
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbz(r5, r7, r6, r14)
            goto L9a
        L223:
            r14 = r17
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zby(r5, r7, r6, r14)
            goto L9a
        L234:
            r14 = r17
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbs(r5, r7, r6, r14)
            goto L9a
        L245:
            r14 = r17
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbC(r5, r7, r6, r14)
            goto L9a
        L256:
            r14 = r17
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbq(r5, r7, r6, r14)
            goto L9a
        L267:
            r14 = r17
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbt(r5, r7, r6, r14)
            goto L9a
        L278:
            r14 = r17
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbu(r5, r7, r6, r14)
            goto L9a
        L289:
            r14 = r17
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbw(r5, r7, r6, r14)
            goto L9a
        L29a:
            r14 = r17
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbD(r5, r7, r6, r14)
            goto L9a
        L2ab:
            r14 = r17
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbx(r5, r7, r6, r14)
            goto L9a
        L2bc:
            r14 = r17
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbv(r5, r7, r6, r14)
            goto L9a
        L2cd:
            r14 = r17
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbr(r5, r7, r6, r14)
            goto L9a
        L2de:
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            r14 = 0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbB(r5, r7, r6, r14)
            goto L540
        L2ee:
            r14 = 0
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbA(r5, r7, r6, r14)
            goto L540
        L2fe:
            r14 = 0
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbz(r5, r7, r6, r14)
            goto L540
        L30e:
            r14 = 0
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zby(r5, r7, r6, r14)
            goto L540
        L31e:
            r14 = 0
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbs(r5, r7, r6, r14)
            goto L540
        L32e:
            r14 = 0
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbC(r5, r7, r6, r14)
            goto L540
        L33e:
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            int r12 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zba
            if (r7 == 0) goto L9a
            boolean r12 = r7.isEmpty()
            if (r12 != 0) goto L9a
            r6.zbe(r5, r7)
            goto L9a
        L357:
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r12 = r0.zbv(r2)
            int r13 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zba
            if (r7 == 0) goto L9a
            boolean r13 = r7.isEmpty()
            if (r13 != 0) goto L9a
            r14 = 0
        L370:
            int r13 = r7.size()
            if (r14 >= r13) goto L9a
            java.lang.Object r13 = r7.get(r14)
            r15 = r6
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtl r15 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtl) r15
            r15.zbw(r5, r13, r12)
            int r14 = r14 + 1
            goto L370
        L383:
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            int r12 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zba
            if (r7 == 0) goto L9a
            boolean r12 = r7.isEmpty()
            if (r12 != 0) goto L9a
            r6.zbI(r5, r7)
            goto L9a
        L39c:
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            r14 = 0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbq(r5, r7, r6, r14)
            goto L540
        L3ac:
            r14 = 0
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbt(r5, r7, r6, r14)
            goto L540
        L3bc:
            r14 = 0
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbu(r5, r7, r6, r14)
            goto L540
        L3cc:
            r14 = 0
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbw(r5, r7, r6, r14)
            goto L540
        L3dc:
            r14 = 0
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbD(r5, r7, r6, r14)
            goto L540
        L3ec:
            r14 = 0
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbx(r5, r7, r6, r14)
            goto L540
        L3fc:
            r14 = 0
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbv(r5, r7, r6, r14)
            goto L540
        L40c:
            r14 = 0
            int[] r5 = r0.zbc
            r5 = r5[r2]
            java.lang.Object r7 = r10.getObject(r1, r12)
            java.util.List r7 = (java.util.List) r7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbr(r5, r7, r6, r14)
            goto L540
        L41c:
            r14 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L540
            java.lang.Object r5 = r10.getObject(r1, r12)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r12 = r0.zbv(r2)
            r6.zbq(r7, r5, r12)
            goto L540
        L430:
            r14 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43e
            long r12 = r10.getLong(r1, r12)
            r6.zbE(r7, r12)
        L43e:
            r0 = r19
            goto L540
        L442:
            r14 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43e
            int r0 = r10.getInt(r1, r12)
            r6.zbC(r7, r0)
            goto L43e
        L451:
            r14 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43e
            long r12 = r10.getLong(r1, r12)
            r6.zbA(r7, r12)
            goto L43e
        L460:
            r14 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43e
            int r0 = r10.getInt(r1, r12)
            r6.zby(r7, r0)
            goto L43e
        L46f:
            r14 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43e
            int r0 = r10.getInt(r1, r12)
            r6.zbi(r7, r0)
            goto L43e
        L47e:
            r14 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43e
            int r0 = r10.getInt(r1, r12)
            r6.zbJ(r7, r0)
            goto L43e
        L48d:
            r14 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43e
            java.lang.Object r0 = r10.getObject(r1, r12)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc) r0
            r6.zbd(r7, r0)
            goto L43e
        L49e:
            r14 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L540
            java.lang.Object r5 = r10.getObject(r1, r12)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r12 = r0.zbv(r2)
            r6.zbw(r7, r5, r12)
            goto L540
        L4b2:
            r14 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43e
            java.lang.Object r0 = r10.getObject(r1, r12)
            zbP(r7, r0, r6)
            goto L43e
        L4c2:
            r14 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43e
            boolean r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbw(r1, r12)
            r6.zbb(r7, r0)
            goto L43e
        L4d2:
            r14 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43e
            int r0 = r10.getInt(r1, r12)
            r6.zbk(r7, r0)
            goto L43e
        L4e2:
            r14 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43e
            long r12 = r10.getLong(r1, r12)
            r6.zbm(r7, r12)
            goto L43e
        L4f2:
            r14 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43e
            int r0 = r10.getInt(r1, r12)
            r6.zbr(r7, r0)
            goto L43e
        L502:
            r14 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43e
            long r12 = r10.getLong(r1, r12)
            r6.zbL(r7, r12)
            goto L43e
        L512:
            r14 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43e
            long r12 = r10.getLong(r1, r12)
            r6.zbt(r7, r12)
            goto L43e
        L522:
            r14 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L43e
            float r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbb(r1, r12)
            r6.zbo(r7, r0)
            goto L43e
        L532:
            r14 = 0
            boolean r5 = r0.zbJ(r1, r2, r3, r4, r5)
            if (r5 == 0) goto L540
            double r12 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zba(r1, r12)
            r6.zbf(r7, r12)
        L540:
            int r2 = r2 + 3
            r5 = r4
            r4 = r3
            r3 = r11
            goto L2e
        L547:
            if (r3 == 0) goto L55e
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtq r2 = r0.zbm
            r2.zbb(r6, r3)
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto L55c
            java.lang.Object r2 = r8.next()
            r3 = r2
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            goto L547
        L55c:
            r3 = 0
            goto L547
        L55e:
            r0 = r1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r0 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r0 = r0.zbc
            r0.zbl(r6)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final boolean zbj(java.lang.Object r8, java.lang.Object r9) {
            r7 = this;
            r0 = 0
            r1 = r0
        L2:
            int[] r2 = r7.zbc
            int r2 = r2.length
            if (r1 >= r2) goto L1c5
            int r2 = r7.zbs(r1)
            r3 = 1048575(0xfffff, float:1.469367E-39)
            r4 = r2 & r3
            int r2 = zbr(r2)
            long r4 = (long) r4
            switch(r2) {
                case 0: goto L1a6;
                case 1: goto L18d;
                case 2: goto L17a;
                case 3: goto L167;
                case 4: goto L156;
                case 5: goto L143;
                case 6: goto L131;
                case 7: goto L11f;
                case 8: goto L109;
                case 9: goto Lf3;
                case 10: goto Ldd;
                case 11: goto Lcb;
                case 12: goto Lb9;
                case 13: goto La7;
                case 14: goto L93;
                case 15: goto L81;
                case 16: goto L6d;
                case 17: goto L57;
                case 18: goto L47;
                case 19: goto L47;
                case 20: goto L47;
                case 21: goto L47;
                case 22: goto L47;
                case 23: goto L47;
                case 24: goto L47;
                case 25: goto L47;
                case 26: goto L47;
                case 27: goto L47;
                case 28: goto L47;
                case 29: goto L47;
                case 30: goto L47;
                case 31: goto L47;
                case 32: goto L47;
                case 33: goto L47;
                case 34: goto L47;
                case 35: goto L47;
                case 36: goto L47;
                case 37: goto L47;
                case 38: goto L47;
                case 39: goto L47;
                case 40: goto L47;
                case 41: goto L47;
                case 42: goto L47;
                case 43: goto L47;
                case 44: goto L47;
                case 45: goto L47;
                case 46: goto L47;
                case 47: goto L47;
                case 48: goto L47;
                case 49: goto L47;
                case 50: goto L3a;
                case 51: goto L1a;
                case 52: goto L1a;
                case 53: goto L1a;
                case 54: goto L1a;
                case 55: goto L1a;
                case 56: goto L1a;
                case 57: goto L1a;
                case 58: goto L1a;
                case 59: goto L1a;
                case 60: goto L1a;
                case 61: goto L1a;
                case 62: goto L1a;
                case 63: goto L1a;
                case 64: goto L1a;
                case 65: goto L1a;
                case 66: goto L1a;
                case 67: goto L1a;
                case 68: goto L1a;
                default: goto L18;
            }
        L18:
            goto L1c0
        L1a:
            int r2 = r7.zbp(r1)
            r2 = r2 & r3
            long r2 = (long) r2
            int r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r8, r2)
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r9, r2)
            if (r6 != r2) goto L1c4
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r8, r4)
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r9, r4)
            boolean r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbE(r2, r3)
            if (r2 != 0) goto L1c0
            goto L1c4
        L3a:
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r8, r4)
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r9, r4)
            boolean r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbE(r2, r3)
            goto L53
        L47:
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r8, r4)
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r9, r4)
            boolean r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbE(r2, r3)
        L53:
            if (r2 != 0) goto L1c0
            goto L1c4
        L57:
            boolean r2 = r7.zbH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r8, r4)
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r9, r4)
            boolean r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbE(r2, r3)
            if (r2 == 0) goto L1c4
            goto L1c0
        L6d:
            boolean r2 = r7.zbH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            long r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r8, r4)
            long r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r9, r4)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L1c4
            goto L1c0
        L81:
            boolean r2 = r7.zbH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r8, r4)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r9, r4)
            if (r2 != r3) goto L1c4
            goto L1c0
        L93:
            boolean r2 = r7.zbH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            long r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r8, r4)
            long r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r9, r4)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L1c4
            goto L1c0
        La7:
            boolean r2 = r7.zbH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r8, r4)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r9, r4)
            if (r2 != r3) goto L1c4
            goto L1c0
        Lb9:
            boolean r2 = r7.zbH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r8, r4)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r9, r4)
            if (r2 != r3) goto L1c4
            goto L1c0
        Lcb:
            boolean r2 = r7.zbH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r8, r4)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r9, r4)
            if (r2 != r3) goto L1c4
            goto L1c0
        Ldd:
            boolean r2 = r7.zbH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r8, r4)
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r9, r4)
            boolean r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbE(r2, r3)
            if (r2 == 0) goto L1c4
            goto L1c0
        Lf3:
            boolean r2 = r7.zbH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r8, r4)
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r9, r4)
            boolean r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbE(r2, r3)
            if (r2 == 0) goto L1c4
            goto L1c0
        L109:
            boolean r2 = r7.zbH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            java.lang.Object r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r8, r4)
            java.lang.Object r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r9, r4)
            boolean r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvz.zbE(r2, r3)
            if (r2 == 0) goto L1c4
            goto L1c0
        L11f:
            boolean r2 = r7.zbH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            boolean r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbw(r8, r4)
            boolean r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbw(r9, r4)
            if (r2 != r3) goto L1c4
            goto L1c0
        L131:
            boolean r2 = r7.zbH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r8, r4)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r9, r4)
            if (r2 != r3) goto L1c4
            goto L1c0
        L143:
            boolean r2 = r7.zbH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            long r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r8, r4)
            long r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r9, r4)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L1c4
            goto L1c0
        L156:
            boolean r2 = r7.zbH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            int r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r8, r4)
            int r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbc(r9, r4)
            if (r2 != r3) goto L1c4
            goto L1c0
        L167:
            boolean r2 = r7.zbH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            long r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r8, r4)
            long r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r9, r4)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L1c4
            goto L1c0
        L17a:
            boolean r2 = r7.zbH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            long r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r8, r4)
            long r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbd(r9, r4)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L1c4
            goto L1c0
        L18d:
            boolean r2 = r7.zbH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            float r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbb(r8, r4)
            int r2 = java.lang.Float.floatToIntBits(r2)
            float r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbb(r9, r4)
            int r3 = java.lang.Float.floatToIntBits(r3)
            if (r2 != r3) goto L1c4
            goto L1c0
        L1a6:
            boolean r2 = r7.zbH(r8, r9, r1)
            if (r2 == 0) goto L1c4
            double r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zba(r8, r4)
            long r2 = java.lang.Double.doubleToLongBits(r2)
            double r4 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zba(r9, r4)
            long r4 = java.lang.Double.doubleToLongBits(r4)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L1c4
        L1c0:
            int r1 = r1 + 3
            goto L2
        L1c4:
            return r0
        L1c5:
            r1 = r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r1
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r1 = r1.zbc
            r2 = r9
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf r2 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuf) r2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwm r2 = r2.zbc
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L1d6
            return r0
        L1d6:
            boolean r7 = r7.zbh
            if (r7 == 0) goto L1e7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub r8 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub) r8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu r7 = r8.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub r9 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub) r9
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu r8 = r9.zbb
            boolean r7 = r7.equals(r8)
            return r7
        L1e7:
            r7 = 1
            return r7
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx
    public final boolean zbk(java.lang.Object r15) {
            r14 = this;
            r0 = 0
            r1 = 1048575(0xfffff, float:1.469367E-39)
            r2 = r0
            r4 = r2
            r3 = r1
        L7:
            int r5 = r14.zbj
            r6 = 1
            if (r2 >= r5) goto L102
            int[] r5 = r14.zbi
            int[] r7 = r14.zbc
            r10 = r5[r2]
            r5 = r7[r10]
            int r7 = r14.zbs(r10)
            int[] r8 = r14.zbc
            int r9 = r10 + 2
            r8 = r8[r9]
            r9 = r8 & r1
            int r8 = r8 >>> 20
            int r13 = r6 << r8
            if (r9 == r3) goto L32
            if (r9 == r1) goto L2f
            long r3 = (long) r9
            sun.misc.Unsafe r6 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvp.zbb
            int r4 = r6.getInt(r15, r3)
        L2f:
            r12 = r4
            r11 = r9
            goto L34
        L32:
            r11 = r3
            r12 = r4
        L34:
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r3 = r3 & r7
            r8 = r14
            r9 = r15
            if (r3 == 0) goto L43
            boolean r14 = r8.zbJ(r9, r10, r11, r12, r13)
            if (r14 == 0) goto L42
            goto L43
        L42:
            return r0
        L43:
            int r14 = zbr(r7)
            r15 = 9
            if (r14 == r15) goto Le9
            r15 = 17
            if (r14 == r15) goto Le9
            r15 = 27
            if (r14 == r15) goto Lc1
            r15 = 60
            if (r14 == r15) goto Lb0
            r15 = 68
            if (r14 == r15) goto Lb0
            r15 = 49
            if (r14 == r15) goto Lc1
            r15 = 50
            if (r14 == r15) goto L65
            goto Lfa
        L65:
            r14 = r7 & r1
            long r14 = (long) r14
            java.lang.Object r14 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r9, r14)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg r14 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvg) r14
            boolean r15 = r14.isEmpty()
            if (r15 != 0) goto Lfa
            java.lang.Object r15 = r8.zbw(r10)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvf r15 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvf) r15
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbve r15 = r15.zbc()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbww r15 = r15.zbc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwx r15 = r15.zbb()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwx r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwx.zbi
            if (r15 != r3) goto Lfa
            java.util.Collection r14 = r14.values()
            java.util.Iterator r14 = r14.iterator()
            r15 = 0
        L91:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto Lfa
            java.lang.Object r3 = r14.next()
            if (r15 != 0) goto La9
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu r15 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvu.zba()
            java.lang.Class r4 = r3.getClass()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r15 = r15.zbb(r4)
        La9:
            boolean r3 = r15.zbk(r3)
            if (r3 != 0) goto L91
            return r0
        Lb0:
            boolean r14 = r8.zbM(r9, r5, r10)
            if (r14 == 0) goto Lfa
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r14 = r8.zbv(r10)
            boolean r14 = zbK(r9, r7, r14)
            if (r14 != 0) goto Lfa
            return r0
        Lc1:
            r14 = r7 & r1
            long r14 = (long) r14
            java.lang.Object r14 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbf(r9, r14)
            java.util.List r14 = (java.util.List) r14
            boolean r15 = r14.isEmpty()
            if (r15 != 0) goto Lfa
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r15 = r8.zbv(r10)
            r3 = r0
        Ld5:
            int r4 = r14.size()
            if (r3 >= r4) goto Lfa
            java.lang.Object r4 = r14.get(r3)
            boolean r4 = r15.zbk(r4)
            if (r4 != 0) goto Le6
            return r0
        Le6:
            int r3 = r3 + 1
            goto Ld5
        Le9:
            boolean r14 = r8.zbJ(r9, r10, r11, r12, r13)
            if (r14 == 0) goto Lfa
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvx r14 = r8.zbv(r10)
            boolean r14 = zbK(r9, r7, r14)
            if (r14 != 0) goto Lfa
            return r0
        Lfa:
            int r2 = r2 + 1
            r14 = r8
            r15 = r9
            r3 = r11
            r4 = r12
            goto L7
        L102:
            r8 = r14
            r9 = r15
            boolean r14 = r8.zbh
            if (r14 == 0) goto L114
            r15 = r9
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub r15 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbub) r15
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtu r14 = r15.zbb
            boolean r14 = r14.zbm()
            if (r14 != 0) goto L114
            return r0
        L114:
            return r6
    }
}
