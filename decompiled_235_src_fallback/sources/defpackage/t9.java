package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t9  reason: default package */
/* loaded from: classes.dex */
public final class t9 {
    public static final defpackage.t9 c = null;
    public final /* synthetic */ int a;
    public float[] b;

    static {
            r0 = 9
            float[] r0 = new float[r0]
            r0 = {x0010: FILL_ARRAY_DATA  , data: [1063593286, -1086321381, 1025463707, 1049126293, 1071338488, -1114879558, -1104853493, 1024873149, 1065601519} // fill-array
            t9 r1 = new t9
            r1.<init>(r0)
            defpackage.t9.c = r1
            return
    }

    public /* synthetic */ t9() {
            r1 = this;
            r0 = 1
            r1.a = r0
            r1.<init>()
            return
    }

    public t9(float[] r2) {
            r1 = this;
            r0 = 0
            r1.a = r0
            r1.<init>()
            r1.b = r2
            return
    }

    public static java.util.ArrayList a(defpackage.t9 r22, java.lang.String r23) {
            r0 = r22
            r1 = r23
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r1.length()
            r4 = 0
            r5 = r4
        Lf:
            r6 = 32
            if (r5 >= r3) goto L20
            char r7 = r1.charAt(r5)
            int r7 = defpackage.nb3.p(r7, r6)
            if (r7 > 0) goto L20
            int r5 = r5 + 1
            goto Lf
        L20:
            if (r3 <= r5) goto L31
            int r7 = r3 + (-1)
            char r7 = r1.charAt(r7)
            int r7 = defpackage.nb3.p(r7, r6)
            if (r7 > 0) goto L31
            int r3 = r3 + (-1)
            goto L20
        L31:
            r7 = r4
        L32:
            if (r5 >= r3) goto L345
        L34:
            int r8 = r5 + 1
            char r5 = r1.charAt(r5)
            r9 = r5 | 32
            int r10 = r9 + (-97)
            int r11 = r9 + (-122)
            int r11 = r11 * r10
            if (r11 > 0) goto L48
            r10 = 101(0x65, float:1.42E-43)
            if (r9 == r10) goto L48
            goto L4b
        L48:
            if (r8 < r3) goto L342
            r5 = r4
        L4b:
            if (r5 == 0) goto L33f
            r9 = r5 | 32
            r10 = 122(0x7a, float:1.71E-43)
            r11 = 1
            if (r9 == r10) goto Lca
        L54:
            if (r8 >= r3) goto L63
            char r7 = r1.charAt(r8)
            int r7 = defpackage.nb3.p(r7, r6)
            if (r7 > 0) goto L63
            int r8 = r8 + 1
            goto L54
        L63:
            r7 = 97
            if (r9 != r7) goto L69
            r7 = r11
            goto L6a
        L69:
            r7 = r4
        L6a:
            r9 = r4
        L6b:
            if (r7 == 0) goto L7e
            r10 = 3
            if (r10 > r9) goto L7e
            r10 = 5
            if (r9 >= r10) goto L7e
            int r10 = r8 + 1
            int r10 = java.lang.Math.min(r10, r3)
            long r12 = defpackage.u24.y(r8, r10, r1)
            goto L82
        L7e:
            long r12 = defpackage.u24.y(r8, r3, r1)
        L82:
            long r14 = r12 >>> r6
            int r8 = (int) r14
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r12 = r12 & r14
            int r10 = (int) r12
            float r10 = java.lang.Float.intBitsToFloat(r10)
            boolean r12 = java.lang.Float.isNaN(r10)
            if (r12 != 0) goto Laa
            float[] r12 = r0.b
            int r13 = r9 + 1
            r12[r9] = r10
            int r9 = r12.length
            if (r13 < r9) goto La9
            int r9 = r13 * 2
            float[] r9 = new float[r9]
            r0.b = r9
            int r14 = r12.length
            java.lang.System.arraycopy(r12, r4, r9, r4, r14)
        La9:
            r9 = r13
        Laa:
            if (r8 >= r3) goto Lc1
            char r12 = r1.charAt(r8)
            int r12 = defpackage.nb3.p(r12, r6)
            if (r12 <= 0) goto Lbe
            char r12 = r1.charAt(r8)
            r13 = 44
            if (r12 != r13) goto Lc1
        Lbe:
            int r8 = r8 + 1
            goto Laa
        Lc1:
            if (r8 >= r3) goto Lc9
            boolean r10 = java.lang.Float.isNaN(r10)
            if (r10 == 0) goto L6b
        Lc9:
            r7 = r9
        Lca:
            float[] r9 = r0.b
            r10 = 2
            r12 = 0
            switch(r5) {
                case 65: goto L2f7;
                case 67: goto L2ce;
                case 72: goto L2b9;
                case 76: goto L2a0;
                case 77: goto L27b;
                case 81: goto L25a;
                case 83: goto L239;
                case 84: goto L220;
                case 86: goto L20b;
                case 90: goto L202;
                case 97: goto L1be;
                case 99: goto L198;
                case 104: goto L186;
                case 108: goto L170;
                case 109: goto L14d;
                case 113: goto L12f;
                case 115: goto L111;
                case 116: goto Lfb;
                case 118: goto Le5;
                case 122: goto L202;
                default: goto Ld1;
            }
        Ld1:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown command for: "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        Le5:
            int r5 = r7 + (-1)
            r10 = r4
        Le8:
            if (r10 > r5) goto Lf7
            fu4 r11 = new fu4
            r12 = r9[r10]
            r11.<init>(r12)
            r2.add(r11)
            int r10 = r10 + 1
            goto Le8
        Lf7:
            r21 = r4
            goto L33a
        Lfb:
            int r5 = r7 + (-2)
            r10 = r4
        Lfe:
            if (r10 > r5) goto Lf7
            eu4 r11 = new eu4
            r12 = r9[r10]
            int r13 = r10 + 1
            r13 = r9[r13]
            r11.<init>(r12, r13)
            r2.add(r11)
            int r10 = r10 + 2
            goto Lfe
        L111:
            int r5 = r7 + (-4)
            r10 = r4
        L114:
            if (r10 > r5) goto Lf7
            du4 r11 = new du4
            r12 = r9[r10]
            int r13 = r10 + 1
            r13 = r9[r13]
            int r14 = r10 + 2
            r14 = r9[r14]
            int r15 = r10 + 3
            r15 = r9[r15]
            r11.<init>(r12, r13, r14, r15)
            r2.add(r11)
            int r10 = r10 + 4
            goto L114
        L12f:
            int r5 = r7 + (-4)
            r10 = r4
        L132:
            if (r10 > r5) goto Lf7
            cu4 r11 = new cu4
            r12 = r9[r10]
            int r13 = r10 + 1
            r13 = r9[r13]
            int r14 = r10 + 2
            r14 = r9[r14]
            int r15 = r10 + 3
            r15 = r9[r15]
            r11.<init>(r12, r13, r14, r15)
            r2.add(r11)
            int r10 = r10 + 4
            goto L132
        L14d:
            int r5 = r7 + (-2)
            if (r5 < 0) goto Lf7
            bu4 r12 = new bu4
            r13 = r9[r4]
            r11 = r9[r11]
            r12.<init>(r13, r11)
            r2.add(r12)
        L15d:
            if (r10 > r5) goto Lf7
            au4 r11 = new au4
            r12 = r9[r10]
            int r13 = r10 + 1
            r13 = r9[r13]
            r11.<init>(r12, r13)
            r2.add(r11)
            int r10 = r10 + 2
            goto L15d
        L170:
            int r5 = r7 + (-2)
            r10 = r4
        L173:
            if (r10 > r5) goto Lf7
            au4 r11 = new au4
            r12 = r9[r10]
            int r13 = r10 + 1
            r13 = r9[r13]
            r11.<init>(r12, r13)
            r2.add(r11)
            int r10 = r10 + 2
            goto L173
        L186:
            int r5 = r7 + (-1)
            r10 = r4
        L189:
            if (r10 > r5) goto Lf7
            zt4 r11 = new zt4
            r12 = r9[r10]
            r11.<init>(r12)
            r2.add(r11)
            int r10 = r10 + 1
            goto L189
        L198:
            int r5 = r7 + (-6)
            r10 = r4
        L19b:
            if (r10 > r5) goto Lf7
            yt4 r11 = new yt4
            r12 = r9[r10]
            int r13 = r10 + 1
            r13 = r9[r13]
            int r14 = r10 + 2
            r14 = r9[r14]
            int r15 = r10 + 3
            r15 = r9[r15]
            int r16 = r10 + 4
            r16 = r9[r16]
            int r17 = r10 + 5
            r17 = r9[r17]
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r2.add(r11)
            int r10 = r10 + 6
            goto L19b
        L1be:
            int r5 = r7 + (-7)
            r10 = r4
        L1c1:
            if (r10 > r5) goto Lf7
            xt4 r13 = new xt4
            r14 = r9[r10]
            int r15 = r10 + 1
            r15 = r9[r15]
            int r16 = r10 + 2
            r16 = r9[r16]
            int r17 = r10 + 3
            r21 = r4
            r4 = r9[r17]
            int r4 = java.lang.Float.compare(r4, r12)
            if (r4 == 0) goto L1de
            r17 = r11
            goto L1e0
        L1de:
            r17 = r21
        L1e0:
            int r4 = r10 + 4
            r4 = r9[r4]
            int r4 = java.lang.Float.compare(r4, r12)
            if (r4 == 0) goto L1ed
            r18 = r11
            goto L1ef
        L1ed:
            r18 = r21
        L1ef:
            int r4 = r10 + 5
            r19 = r9[r4]
            int r4 = r10 + 6
            r20 = r9[r4]
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r2.add(r13)
            int r10 = r10 + 7
            r4 = r21
            goto L1c1
        L202:
            r21 = r4
            pt4 r4 = defpackage.pt4.c
            r2.add(r4)
            goto L33a
        L20b:
            r21 = r4
            int r4 = r7 + (-1)
            r5 = r21
        L211:
            if (r5 > r4) goto L33a
            gu4 r10 = new gu4
            r11 = r9[r5]
            r10.<init>(r11)
            r2.add(r10)
            int r5 = r5 + 1
            goto L211
        L220:
            r21 = r4
            int r4 = r7 + (-2)
            r5 = r21
        L226:
            if (r5 > r4) goto L33a
            wt4 r10 = new wt4
            r11 = r9[r5]
            int r12 = r5 + 1
            r12 = r9[r12]
            r10.<init>(r11, r12)
            r2.add(r10)
            int r5 = r5 + 2
            goto L226
        L239:
            r21 = r4
            int r4 = r7 + (-4)
            r5 = r21
        L23f:
            if (r5 > r4) goto L33a
            vt4 r10 = new vt4
            r11 = r9[r5]
            int r12 = r5 + 1
            r12 = r9[r12]
            int r13 = r5 + 2
            r13 = r9[r13]
            int r14 = r5 + 3
            r14 = r9[r14]
            r10.<init>(r11, r12, r13, r14)
            r2.add(r10)
            int r5 = r5 + 4
            goto L23f
        L25a:
            r21 = r4
            int r4 = r7 + (-4)
            r5 = r21
        L260:
            if (r5 > r4) goto L33a
            ut4 r10 = new ut4
            r11 = r9[r5]
            int r12 = r5 + 1
            r12 = r9[r12]
            int r13 = r5 + 2
            r13 = r9[r13]
            int r14 = r5 + 3
            r14 = r9[r14]
            r10.<init>(r11, r12, r13, r14)
            r2.add(r10)
            int r5 = r5 + 4
            goto L260
        L27b:
            r21 = r4
            int r4 = r7 + (-2)
            if (r4 < 0) goto L33a
            tt4 r5 = new tt4
            r12 = r9[r21]
            r11 = r9[r11]
            r5.<init>(r12, r11)
            r2.add(r5)
        L28d:
            if (r10 > r4) goto L33a
            st4 r5 = new st4
            r11 = r9[r10]
            int r12 = r10 + 1
            r12 = r9[r12]
            r5.<init>(r11, r12)
            r2.add(r5)
            int r10 = r10 + 2
            goto L28d
        L2a0:
            r21 = r4
            int r4 = r7 + (-2)
            r5 = r21
        L2a6:
            if (r5 > r4) goto L33a
            st4 r10 = new st4
            r11 = r9[r5]
            int r12 = r5 + 1
            r12 = r9[r12]
            r10.<init>(r11, r12)
            r2.add(r10)
            int r5 = r5 + 2
            goto L2a6
        L2b9:
            r21 = r4
            int r4 = r7 + (-1)
            r5 = r21
        L2bf:
            if (r5 > r4) goto L33a
            rt4 r10 = new rt4
            r11 = r9[r5]
            r10.<init>(r11)
            r2.add(r10)
            int r5 = r5 + 1
            goto L2bf
        L2ce:
            r21 = r4
            int r4 = r7 + (-6)
            r5 = r21
        L2d4:
            if (r5 > r4) goto L33a
            qt4 r10 = new qt4
            r11 = r9[r5]
            int r12 = r5 + 1
            r12 = r9[r12]
            int r13 = r5 + 2
            r13 = r9[r13]
            int r14 = r5 + 3
            r14 = r9[r14]
            int r15 = r5 + 4
            r15 = r9[r15]
            int r16 = r5 + 5
            r16 = r9[r16]
            r10.<init>(r11, r12, r13, r14, r15, r16)
            r2.add(r10)
            int r5 = r5 + 6
            goto L2d4
        L2f7:
            r21 = r4
            int r4 = r7 + (-7)
            r5 = r21
        L2fd:
            if (r5 > r4) goto L33a
            ot4 r13 = new ot4
            r14 = r9[r5]
            int r10 = r5 + 1
            r15 = r9[r10]
            int r10 = r5 + 2
            r16 = r9[r10]
            int r10 = r5 + 3
            r10 = r9[r10]
            int r10 = java.lang.Float.compare(r10, r12)
            if (r10 == 0) goto L318
            r17 = r11
            goto L31a
        L318:
            r17 = r21
        L31a:
            int r10 = r5 + 4
            r10 = r9[r10]
            int r10 = java.lang.Float.compare(r10, r12)
            if (r10 == 0) goto L327
            r18 = r11
            goto L329
        L327:
            r18 = r21
        L329:
            int r10 = r5 + 5
            r19 = r9[r10]
            int r10 = r5 + 6
            r20 = r9[r10]
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r2.add(r13)
            int r5 = r5 + 7
            goto L2fd
        L33a:
            r5 = r8
            r4 = r21
            goto L32
        L33f:
            r5 = r8
            goto L32
        L342:
            r5 = r8
            goto L34
        L345:
            return r2
    }

    public java.lang.String toString() {
            r1 = this;
            int r0 = r1.a
            switch(r0) {
                case 0: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r1 = super.toString()
            return r1
        La:
            java.lang.String r1 = "Bradford"
            return r1
    }
}
