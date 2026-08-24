package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l85  reason: default package */
/* loaded from: classes.dex */
public final class l85 {
    public final defpackage.xk4 a;
    public final defpackage.id3 b;
    public final defpackage.hk c;
    public final defpackage.jk d;
    public final defpackage.cn5 e;

    public l85(defpackage.xk4 r1, defpackage.id3 r2, defpackage.hk r3, defpackage.jk r4, defpackage.ek r5, defpackage.cn5 r6) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r6
            return
    }

    public static final java.lang.Object a(defpackage.l85 r11, defpackage.ar0 r12, java.util.Map r13, defpackage.qn2 r14, boolean r15, defpackage.s41 r16) {
            r0 = r16
            r11.getClass()
            boolean r1 = r0 instanceof defpackage.y75
            if (r1 == 0) goto L18
            r1 = r0
            y75 r1 = (defpackage.y75) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.Y = r2
            goto L1d
        L18:
            y75 r1 = new y75
            r1.<init>(r11, r0)
        L1d:
            java.lang.Object r0 = r1.R
            x61 r9 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r1.Y
            r10 = 1
            if (r2 == 0) goto L33
            if (r2 != r10) goto L2c
            defpackage.oi2.Y(r0)
            goto L4e
        L2c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L33:
            defpackage.oi2.Y(r0)
            xe1 r0 = defpackage.xk1.a
            de1 r0 = defpackage.de1.L
            z75 r2 = new z75
            r8 = 0
            r3 = r11
            r6 = r12
            r4 = r13
            r7 = r14
            r5 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r1.Y = r10
            java.lang.Object r0 = defpackage.hv.d0(r0, r2, r1)
            if (r0 != r9) goto L4e
            return r9
        L4e:
            hm5 r0 = (defpackage.hm5) r0
            java.lang.Object r0 = r0.A
            return r0
    }

    public static final java.lang.Object b(defpackage.l85 r5, defpackage.ar0 r6, defpackage.wl5 r7, defpackage.qn2 r8) {
            r5.getClass()
            yl5 r0 = r7.Z
            java.lang.String r0 = r0.r()
            boolean r1 = r7.m0
            if (r1 == 0) goto L181
            boolean r7 = defpackage.qs6.v0(r0)
            if (r7 != 0) goto L179
            hd3 r7 = defpackage.id3.d     // Catch: java.lang.IllegalArgumentException -> L14d defpackage.fc6 -> L163
            r7.getClass()     // Catch: java.lang.IllegalArgumentException -> L14d defpackage.fc6 -> L163
            he3 r1 = defpackage.he3.a     // Catch: java.lang.IllegalArgumentException -> L14d defpackage.fc6 -> L163
            java.lang.Object r7 = r7.a(r1, r0)     // Catch: java.lang.IllegalArgumentException -> L14d defpackage.fc6 -> L163
            de3 r7 = (defpackage.de3) r7     // Catch: java.lang.IllegalArgumentException -> L14d defpackage.fc6 -> L163
            ye3 r7 = defpackage.fe3.g(r7)     // Catch: java.lang.IllegalArgumentException -> L14d defpackage.fc6 -> L163
            java.lang.String r0 = "Success"
            java.lang.Object r0 = r7.get(r0)
            de3 r0 = (defpackage.de3) r0
            r1 = 0
            java.lang.String r2 = "Error"
            if (r0 != 0) goto L51
            java.lang.Object r0 = r7.get(r2)
            de3 r0 = (defpackage.de3) r0
            if (r0 == 0) goto L47
            df3 r0 = defpackage.fe3.h(r0)
            boolean r2 = r0 instanceof defpackage.ue3
            if (r2 == 0) goto L42
            goto L47
        L42:
            java.lang.String r0 = r0.a()
            goto L48
        L47:
            r0 = r1
        L48:
            if (r0 != 0) goto L4c
            java.lang.String r0 = "RA response missing field: Success"
        L4c:
            r8.g(r0)
            goto L122
        L51:
            df3 r0 = defpackage.fe3.h(r0)
            java.lang.Boolean r3 = defpackage.fe3.d(r0)
            if (r3 == 0) goto L61
            boolean r0 = r3.booleanValue()
            goto L102
        L61:
            boolean r3 = r0 instanceof defpackage.ue3
            if (r3 == 0) goto L67
            r0 = r1
            goto L6b
        L67:
            java.lang.String r0 = r0.a()
        L6b:
            if (r0 == 0) goto L145
            java.lang.CharSequence r0 = defpackage.qs6.T0(r0)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L145
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r3)
            r0.getClass()
            int r3 = r0.hashCode()
            r4 = 49
            if (r3 == r4) goto Lb2
            r4 = 3551(0xddf, float:4.976E-42)
            if (r3 == r4) goto La9
            r4 = 119527(0x1d2e7, float:1.67493E-40)
            if (r3 == r4) goto La0
            r4 = 3569038(0x36758e, float:5.001287E-39)
            if (r3 == r4) goto L97
            goto Lba
        L97:
            java.lang.String r3 = "true"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L101
            goto Lba
        La0:
            java.lang.String r3 = "yes"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L101
            goto Lba
        La9:
            java.lang.String r3 = "on"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto Lba
            goto L101
        Lb2:
            java.lang.String r3 = "1"
            boolean r3 = r0.equals(r3)
            if (r3 != 0) goto L101
        Lba:
            int r3 = r0.hashCode()
            r4 = 48
            if (r3 == r4) goto Leb
            r4 = 3521(0xdc1, float:4.934E-42)
            if (r3 == r4) goto Le2
            r4 = 109935(0x1ad6f, float:1.54052E-40)
            if (r3 == r4) goto Ld9
            r4 = 97196323(0x5cb1923, float:1.9099262E-35)
            if (r3 != r4) goto Lf5
            java.lang.String r3 = "false"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto Lf5
            goto Lf3
        Ld9:
            java.lang.String r3 = "off"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto Lf5
            goto Lf3
        Le2:
            java.lang.String r3 = "no"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto Lf5
            goto Lf3
        Leb:
            java.lang.String r3 = "0"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto Lf5
        Lf3:
            r0 = 0
            goto L102
        Lf5:
            kh7 r5 = new kh7
            java.lang.String r6 = "RA response has invalid Success value: "
            java.lang.String r6 = r6.concat(r0)
            r5.<init>(r6)
            throw r5
        L101:
            r0 = 1
        L102:
            if (r0 != 0) goto L122
            java.lang.Object r0 = r7.get(r2)
            de3 r0 = (defpackage.de3) r0
            if (r0 == 0) goto L11a
            df3 r0 = defpackage.fe3.h(r0)
            boolean r2 = r0 instanceof defpackage.ue3
            if (r2 == 0) goto L115
            goto L11a
        L115:
            java.lang.String r0 = r0.a()
            goto L11b
        L11a:
            r0 = r1
        L11b:
            if (r0 != 0) goto L11f
            java.lang.String r0 = "Unknown reason"
        L11f:
            r8.g(r0)
        L122:
            java.lang.Class<jg7> r8 = defpackage.jg7.class
            ar0 r8 = defpackage.gh5.a(r8)
            boolean r8 = defpackage.nb3.k(r6, r8)
            if (r8 == 0) goto L131
            jg7 r5 = defpackage.jg7.a
            return r5
        L131:
            id3 r5 = r5.b
            gg3 r6 = defpackage.jx2.K(r6)
            gg3 r6 = (defpackage.gg3) r6
            kf3 r8 = new kf3
            r0 = 12
            r8.<init>(r5, r7, r1, r0)
            java.lang.Object r5 = r8.k(r6)
            return r5
        L145:
            kh7 r5 = new kh7
            java.lang.String r6 = "RA response value is empty"
            r5.<init>(r6)
            throw r5
        L14d:
            kh7 r5 = new kh7
            java.nio.charset.Charset r6 = defpackage.qm0.a
            byte[] r6 = r0.getBytes(r6)
            r6.getClass()
            int r6 = r6.length
            java.lang.String r7 = "RA response is not a JSON object; body_bytes="
            java.lang.String r6 = defpackage.lb1.g(r6, r7)
            r5.<init>(r6)
            throw r5
        L163:
            kh7 r5 = new kh7
            java.nio.charset.Charset r6 = defpackage.qm0.a
            byte[] r6 = r0.getBytes(r6)
            r6.getClass()
            int r6 = r6.length
            java.lang.String r7 = "RA response is not valid JSON; body_bytes="
            java.lang.String r6 = defpackage.lb1.g(r6, r7)
            r5.<init>(r6)
            throw r5
        L179:
            kh7 r5 = new kh7
            java.lang.String r6 = "RA response body is empty"
            r5.<init>(r6)
            throw r5
        L181:
            kh7 r5 = new kh7
            int r6 = r7.R
            java.nio.charset.Charset r7 = defpackage.qm0.a
            byte[] r7 = r0.getBytes(r7)
            r7.getClass()
            int r7 = r7.length
            java.lang.String r8 = "HTTP "
            java.lang.String r0 = "; body_bytes="
            java.lang.String r6 = defpackage.lb1.j(r8, r6, r7, r0)
            r5.<init>(r6)
            throw r5
    }

    public static final java.lang.Object c(defpackage.l85 r11, defpackage.ar0 r12, java.util.Map r13, defpackage.up3 r14, defpackage.s41 r15) {
            boolean r0 = r15 instanceof defpackage.f85
            if (r0 == 0) goto L13
            r0 = r15
            f85 r0 = (defpackage.f85) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            f85 r0 = new f85
            r0.<init>(r11, r15)
        L18:
            java.lang.Object r15 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.oi2.Y(r15)
            goto L4a
        L27:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r11)
            r11 = 0
            return r11
        L2e:
            defpackage.oi2.Y(r15)
            xe1 r15 = defpackage.xk1.a
            de1 r15 = defpackage.de1.L
            l5 r4 = new l5
            r9 = 0
            r10 = 25
            r5 = r11
            r7 = r12
            r6 = r13
            r8 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.Y = r3
            java.lang.Object r15 = defpackage.hv.d0(r15, r4, r0)
            if (r15 != r1) goto L4a
            return r1
        L4a:
            hm5 r15 = (defpackage.hm5) r15
            java.lang.Object r11 = r15.A
            return r11
    }

    public static java.lang.String g(long r4) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7
            r4 = r0
        L7:
            r0 = 100
            long r2 = r4 / r0
            long r4 = r4 % r0
            java.lang.String r0 = l(r2)
            java.lang.String r1 = ".%02d"
            java.lang.String r0 = r0.concat(r1)
            java.util.Locale r1 = java.util.Locale.US
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            r5 = 1
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
            java.lang.String r4 = java.lang.String.format(r1, r0, r4)
            return r4
    }

    public static java.lang.String h(int r2, int r3, int r4) {
            int r0 = r2 / r3
            int r2 = r2 % r3
            int r2 = java.lang.Math.abs(r2)
            long r0 = (long) r0
            java.lang.String r3 = k(r0)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r2 = defpackage.qs6.B0(r4, r2)
            java.lang.String r4 = "."
            java.lang.String r2 = defpackage.lb1.m(r3, r4, r2)
            return r2
    }

    public static java.lang.String i(int r7, java.lang.String r8) {
            java.util.Locale r0 = java.util.Locale.ROOT
            r0.getClass()
            java.lang.String r8 = r8.toUpperCase(r0)
            r8.getClass()
            int r0 = r8.hashCode()
            r1 = 10
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r5 = 10
            r6 = 1
            switch(r0) {
                case -1929424669: goto L1ec;
                case -1293819249: goto L1dd;
                case -963536587: goto L1c6;
                case -261975517: goto L1b6;
                case 2541122: goto L1ad;
                case 2571254: goto L19a;
                case 2575053: goto L187;
                case 75532016: goto L17d;
                case 78726770: goto L173;
                case 766662389: goto L162;
                case 799745873: goto L14f;
                case 1355078661: goto L138;
                case 1782884543: goto L128;
                case 1912639343: goto L118;
                default: goto L1d;
            }
        L1d:
            switch(r0) {
                case 2074147677: goto L109;
                case 2074147678: goto Lf7;
                case 2074147679: goto Le5;
                default: goto L20;
            }
        L20:
            switch(r0) {
                case 2076646773: goto Lc5;
                case 2076646774: goto La5;
                case 2076646775: goto L85;
                case 2076646776: goto L65;
                case 2076646777: goto L45;
                case 2076646778: goto L25;
                default: goto L23;
            }
        L23:
            goto L1f4
        L25:
            java.lang.String r0 = "FLOAT6"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L2f
            goto L1f4
        L2f:
            java.util.Locale r8 = java.util.Locale.US
            double r0 = (double) r7
            java.lang.Double r7 = java.lang.Double.valueOf(r0)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r6)
            java.lang.String r0 = "%,.6f"
            java.lang.String r7 = java.lang.String.format(r8, r0, r7)
            return r7
        L45:
            java.lang.String r0 = "FLOAT5"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L4f
            goto L1f4
        L4f:
            java.util.Locale r8 = java.util.Locale.US
            double r0 = (double) r7
            java.lang.Double r7 = java.lang.Double.valueOf(r0)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r6)
            java.lang.String r0 = "%,.5f"
            java.lang.String r7 = java.lang.String.format(r8, r0, r7)
            return r7
        L65:
            java.lang.String r0 = "FLOAT4"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L6f
            goto L1f4
        L6f:
            java.util.Locale r8 = java.util.Locale.US
            double r0 = (double) r7
            java.lang.Double r7 = java.lang.Double.valueOf(r0)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r6)
            java.lang.String r0 = "%,.4f"
            java.lang.String r7 = java.lang.String.format(r8, r0, r7)
            return r7
        L85:
            java.lang.String r0 = "FLOAT3"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L8f
            goto L1f4
        L8f:
            java.util.Locale r8 = java.util.Locale.US
            double r0 = (double) r7
            java.lang.Double r7 = java.lang.Double.valueOf(r0)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r6)
            java.lang.String r0 = "%,.3f"
            java.lang.String r7 = java.lang.String.format(r8, r0, r7)
            return r7
        La5:
            java.lang.String r0 = "FLOAT2"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto Laf
            goto L1f4
        Laf:
            java.util.Locale r8 = java.util.Locale.US
            double r0 = (double) r7
            java.lang.Double r7 = java.lang.Double.valueOf(r0)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r6)
            java.lang.String r0 = "%,.2f"
            java.lang.String r7 = java.lang.String.format(r8, r0, r7)
            return r7
        Lc5:
            java.lang.String r0 = "FLOAT1"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto Lcf
            goto L1f4
        Lcf:
            java.util.Locale r8 = java.util.Locale.US
            double r0 = (double) r7
            java.lang.Double r7 = java.lang.Double.valueOf(r0)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r6)
            java.lang.String r0 = "%,.1f"
            java.lang.String r7 = java.lang.String.format(r8, r0, r7)
            return r7
        Le5:
            java.lang.String r0 = "FIXED3"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto Lef
            goto L1f4
        Lef:
            r8 = 1000(0x3e8, float:1.401E-42)
            r0 = 3
            java.lang.String r7 = h(r7, r8, r0)
            return r7
        Lf7:
            java.lang.String r0 = "FIXED2"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L101
            goto L1f4
        L101:
            r8 = 100
            r0 = 2
            java.lang.String r7 = h(r7, r8, r0)
            return r7
        L109:
            java.lang.String r0 = "FIXED1"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L113
            goto L1f4
        L113:
            java.lang.String r7 = h(r7, r5, r6)
            return r7
        L118:
            java.lang.String r0 = "MILLISECS"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L122
            goto L1f4
        L122:
            long r7 = (long) r7
            java.lang.String r7 = g(r7)
            return r7
        L128:
            java.lang.String r0 = "MINUTES"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L132
            goto L1f4
        L132:
            long r7 = (long) r7
            java.lang.String r7 = j(r7)
            return r7
        L138:
            java.lang.String r0 = "HUNDREDS"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L142
            goto L1f4
        L142:
            if (r7 != 0) goto L146
            goto L1d1
        L146:
            long r7 = (long) r7
            r0 = 100
            long r7 = r7 * r0
            java.lang.String r7 = k(r7)
            return r7
        L14f:
            java.lang.String r0 = "SECS_AS_MINS"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L159
            goto L1f4
        L159:
            long r7 = (long) r7
            r0 = 60
            long r7 = r7 / r0
            java.lang.String r7 = j(r7)
            return r7
        L162:
            java.lang.String r0 = "UNSIGNED"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L16c
            goto L1f4
        L16c:
            long r7 = (long) r7
            long r7 = r7 & r3
            java.lang.String r7 = java.lang.Long.toString(r7, r5)
            return r7
        L173:
            java.lang.String r0 = "SCORE"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L1fa
            goto L1f4
        L17d:
            java.lang.String r0 = "OTHER"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L1fa
            goto L1f4
        L187:
            java.lang.String r0 = "TIME"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L190
            goto L1f4
        L190:
            long r7 = (long) r7
            long r7 = r7 * r1
            r0 = 6
            long r7 = r7 / r0
            java.lang.String r7 = g(r7)
            return r7
        L19a:
            java.lang.String r0 = "TENS"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L1a3
            goto L1f4
        L1a3:
            if (r7 != 0) goto L1a6
            goto L1d1
        L1a6:
            long r7 = (long) r7
            long r7 = r7 * r1
            java.lang.String r7 = k(r7)
            return r7
        L1ad:
            java.lang.String r0 = "SECS"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L1e6
            goto L1f4
        L1b6:
            java.lang.String r0 = "UNFORMATTED"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L1bf
            goto L1f4
        L1bf:
            long r7 = (long) r7
            long r7 = r7 & r3
            java.lang.String r7 = java.lang.Long.toString(r7, r5)
            return r7
        L1c6:
            java.lang.String r0 = "THOUSANDS"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L1cf
            goto L1f4
        L1cf:
            if (r7 != 0) goto L1d4
        L1d1:
            java.lang.String r7 = "0"
            return r7
        L1d4:
            long r7 = (long) r7
            r0 = 1000(0x3e8, double:4.94E-321)
            long r7 = r7 * r0
            java.lang.String r7 = k(r7)
            return r7
        L1dd:
            java.lang.String r0 = "TIMESECS"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L1e6
            goto L1f4
        L1e6:
            long r7 = (long) r7
            java.lang.String r7 = l(r7)
            return r7
        L1ec:
            java.lang.String r0 = "POINTS"
            boolean r8 = r8.equals(r0)
            if (r8 != 0) goto L1fa
        L1f4:
            long r7 = (long) r7
            java.lang.String r7 = k(r7)
            return r7
        L1fa:
            java.util.Locale r8 = java.util.Locale.US
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Object[] r7 = new java.lang.Object[]{r7}
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r6)
            java.lang.String r0 = "%06d"
            java.lang.String r7 = java.lang.String.format(r8, r0, r7)
            return r7
    }

    public static java.lang.String j(long r4) {
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7
            r4 = r0
        L7:
            r0 = 60
            long r2 = r4 / r0
            long r4 = r4 % r0
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Object[] r4 = new java.lang.Object[]{r1, r4}
            r5 = 2
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r4, r5)
            java.lang.String r5 = "%dh%02d"
            java.lang.String r4 = java.lang.String.format(r0, r5, r4)
            return r4
    }

    public static java.lang.String k(long r1) {
            java.util.Locale r0 = java.util.Locale.US
            java.text.NumberFormat r0 = java.text.NumberFormat.getIntegerInstance(r0)
            java.lang.String r1 = r0.format(r1)
            r1.getClass()
            return r1
    }

    public static java.lang.String l(long r6) {
            r0 = 0
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7
            r6 = r0
        L7:
            r0 = 60
            long r2 = r6 / r0
            long r6 = r6 % r0
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L2a
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Long r1 = java.lang.Long.valueOf(r2)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r1, r6}
            r7 = 2
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.String r7 = "%d:%02d"
            java.lang.String r6 = java.lang.String.format(r0, r7, r6)
            return r6
        L2a:
            long r4 = r2 / r0
            long r2 = r2 % r0
            java.util.Locale r0 = java.util.Locale.US
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            java.lang.Object[] r6 = new java.lang.Object[]{r1, r2, r6}
            r7 = 3
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            java.lang.String r7 = "%dh%02d:%02d"
            java.lang.String r6 = java.lang.String.format(r0, r7, r6)
            return r6
    }

    public final java.lang.Object d(long r10, boolean r12, java.lang.String r13, java.lang.Long r14, defpackage.s41 r15) {
            r9 = this;
            boolean r0 = r15 instanceof defpackage.w75
            if (r0 == 0) goto L14
            r0 = r15
            w75 r0 = (defpackage.w75) r0
            int r1 = r0.f0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f0 = r1
        L12:
            r8 = r0
            goto L1a
        L14:
            w75 r0 = new w75
            r0.<init>(r9, r15)
            goto L12
        L1a:
            java.lang.Object r15 = r8.d0
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r8.f0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L45
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            defpackage.oi2.Y(r15)
            hm5 r15 = (defpackage.hm5) r15
            java.lang.Object r9 = r15.A
            return r9
        L31:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            return r4
        L37:
            boolean r12 = r8.X
            long r10 = r8.R
            java.lang.Long r14 = r8.Z
            java.lang.String r13 = r8.Y
            defpackage.oi2.Y(r15)
        L42:
            r6 = r13
            r7 = r14
            goto L5b
        L45:
            defpackage.oi2.Y(r15)
            r8.Y = r13
            r8.Z = r14
            r8.R = r10
            r8.X = r12
            r8.f0 = r3
            hk r15 = r9.c
            java.lang.Object r15 = r15.b(r8)
            if (r15 != r0) goto L42
            goto L84
        L5b:
            boolean r13 = r15 instanceof defpackage.hb5
            if (r13 == 0) goto L63
            hb5 r15 = (defpackage.hb5) r15
            r5 = r15
            goto L64
        L63:
            r5 = r4
        L64:
            if (r5 != 0) goto L71
            rj7 r9 = new rj7
            r9.<init>()
            em5 r10 = new em5
            r10.<init>(r9)
            return r10
        L71:
            r8.Y = r4
            r8.Z = r4
            r8.R = r10
            r8.X = r12
            r8.f0 = r2
            r1 = r9
            r2 = r10
            r4 = r12
            java.lang.Object r9 = r1.e(r2, r4, r5, r6, r7, r8)
            if (r9 != r0) goto L85
        L84:
            return r0
        L85:
            return r9
    }

    public final java.lang.Object e(long r24, boolean r26, defpackage.hb5 r27, java.lang.String r28, java.lang.Long r29, defpackage.s41 r30) {
            r23 = this;
            r0 = r23
            r6 = r26
            r7 = r27
            r1 = r28
            r2 = r30
            boolean r3 = r2 instanceof defpackage.x75
            if (r3 == 0) goto L1e
            r3 = r2
            x75 r3 = (defpackage.x75) r3
            int r4 = r3.f0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r4 & r5
            if (r8 == 0) goto L1e
            int r4 = r4 - r5
            r3.f0 = r4
        L1c:
            r5 = r3
            goto L24
        L1e:
            x75 r3 = new x75
            r3.<init>(r0, r2)
            goto L1c
        L24:
            java.lang.Object r2 = r5.d0
            x61 r8 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r5.f0
            r9 = 2
            r4 = 1
            r10 = 0
            if (r3 == 0) goto L53
            if (r3 == r4) goto L3f
            if (r3 != r9) goto L39
            java.lang.Object r0 = r5.Z
            defpackage.oi2.Y(r2)
            return r0
        L39:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r10
        L3f:
            boolean r1 = r5.X
            long r3 = r5.R
            java.lang.Object r6 = r5.Z
            l85 r6 = (defpackage.l85) r6
            hb5 r6 = r5.Y
            defpackage.oi2.Y(r2)
            hm5 r2 = (defpackage.hm5) r2
            java.lang.Object r2 = r2.A
            r11 = r3
            goto L17e
        L53:
            defpackage.oi2.Y(r2)
            r2 = 0
            if (r29 == 0) goto L75
            long r11 = r29.longValue()
            r13 = 0
            r15 = 1209600(0x127500, double:5.97622E-318)
            long r11 = defpackage.gi2.s(r11, r13, r15)
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r11)
            long r11 = r13.longValue()
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 <= 0) goto L75
            goto L76
        L75:
            r13 = r10
        L76:
            r7.getClass()
            java.lang.String r11 = r7.a
            java.lang.String r12 = "MD5"
            java.security.MessageDigest r12 = java.security.MessageDigest.getInstance(r12)
            java.lang.String r14 = java.lang.String.valueOf(r24)
            java.nio.charset.Charset r15 = defpackage.qm0.a
            byte[] r14 = r14.getBytes(r15)
            r14.getClass()
            r12.update(r14)
            byte[] r14 = r11.getBytes(r15)
            r14.getClass()
            r12.update(r14)
            java.lang.String r14 = "0"
            java.lang.String r16 = "1"
            r17 = r2
            if (r6 == 0) goto La6
            r2 = r16
            goto La7
        La6:
            r2 = r14
        La7:
            byte[] r2 = r2.getBytes(r15)
            r2.getClass()
            r12.update(r2)
            if (r13 == 0) goto Ldb
            long r2 = r13.longValue()
            int r2 = (r2 > r17 ? 1 : (r2 == r17 ? 0 : -1))
            if (r2 <= 0) goto Ldb
            java.lang.String r2 = java.lang.String.valueOf(r24)
            byte[] r2 = r2.getBytes(r15)
            r2.getClass()
            r12.update(r2)
            long r2 = r13.longValue()
            java.lang.String r2 = java.lang.String.valueOf(r2)
            byte[] r2 = r2.getBytes(r15)
            r2.getClass()
            r12.update(r2)
        Ldb:
            java.math.BigInteger r2 = new java.math.BigInteger
            byte[] r3 = r12.digest()
            r2.<init>(r4, r3)
            r3 = 16
            java.lang.String r2 = r2.toString(r3)
            r2.getClass()
            r3 = 32
            java.lang.String r2 = defpackage.qs6.B0(r3, r2)
            vr4 r3 = new vr4
            java.lang.String r12 = "r"
            java.lang.String r15 = "awardachievement"
            r3.<init>(r12, r15)
            vr4 r12 = new vr4
            java.lang.String r15 = "u"
            r12.<init>(r15, r11)
            java.lang.String r11 = r7.b
            vr4 r15 = new vr4
            java.lang.String r9 = "t"
            r15.<init>(r9, r11)
            java.lang.String r9 = java.lang.String.valueOf(r24)
            vr4 r11 = new vr4
            java.lang.String r4 = "a"
            r11.<init>(r4, r9)
            if (r6 == 0) goto L11b
            r14 = r16
        L11b:
            vr4 r4 = new vr4
            java.lang.String r9 = "h"
            r4.<init>(r9, r14)
            vr4 r9 = new vr4
            java.lang.String r14 = "v"
            r9.<init>(r14, r2)
            r17 = r3
            r21 = r4
            r22 = r9
            r20 = r11
            r18 = r12
            r19 = r15
            vr4[] r2 = new defpackage.vr4[]{r17, r18, r19, r20, r21, r22}
            java.util.LinkedHashMap r2 = defpackage.c14.n0(r2)
            if (r1 == 0) goto L14b
            boolean r3 = defpackage.qs6.v0(r1)
            if (r3 == 0) goto L146
            goto L14b
        L146:
            java.lang.String r3 = "m"
            r2.put(r3, r1)
        L14b:
            if (r13 == 0) goto L15a
            long r3 = r13.longValue()
            java.lang.String r1 = java.lang.String.valueOf(r3)
            java.lang.String r3 = "o"
            r2.put(r3, r1)
        L15a:
            dv4 r3 = new dv4
            r1 = 17
            r3.<init>(r1)
            java.lang.Class<wz> r1 = defpackage.wz.class
            ar0 r1 = defpackage.gh5.a(r1)
            r5.Y = r7
            r5.Z = r10
            r11 = r24
            r5.R = r11
            r5.X = r6
            r4 = 1
            r5.f0 = r4
            r4 = 1
            java.lang.Object r2 = a(r0, r1, r2, r3, r4, r5)
            if (r2 != r8) goto L17c
            goto L1d0
        L17c:
            r1 = r6
            r6 = r7
        L17e:
            boolean r3 = r2 instanceof defpackage.em5
            if (r3 != 0) goto L19b
            wz r2 = (defpackage.wz) r2
            o85 r13 = new o85
            boolean r14 = r2.a
            int r15 = r2.b
            int r3 = r2.c
            long r3 = (long) r3
            int r2 = r2.d
            r20 = r11
            long r10 = (long) r2
            r16 = r3
            r18 = r10
            r13.<init>(r14, r15, r16, r18)
            r2 = r13
            goto L19d
        L19b:
            r20 = r11
        L19d:
            boolean r3 = r2 instanceof defpackage.em5
            if (r3 != 0) goto L1d1
            r3 = r2
            o85 r3 = (defpackage.o85) r3
            java.lang.String r11 = r6.a
            long r12 = r3.c
            long r14 = r3.d
            r7 = 0
            r5.Y = r7
            r5.Z = r2
            r3 = r20
            r5.R = r3
            r5.X = r1
            r1 = 2
            r5.f0 = r1
            xe1 r1 = defpackage.xk1.a
            de1 r1 = defpackage.de1.L
            ik r9 = new ik
            r16 = 0
            jk r10 = r0.d
            r9.<init>(r10, r11, r12, r14, r16)
            java.lang.Object r0 = defpackage.hv.d0(r1, r9, r5)
            if (r0 != r8) goto L1cc
            goto L1ce
        L1cc:
            jg7 r0 = defpackage.jg7.a
        L1ce:
            if (r0 != r8) goto L1d1
        L1d0:
            return r8
        L1d1:
            return r2
    }

    public final java.lang.Object f(defpackage.pa r5, defpackage.hb5 r6, boolean r7, defpackage.hw6 r8) {
            r4 = this;
            rj0 r0 = new rj0
            r41 r8 = defpackage.np2.V(r8)
            r1 = 1
            r0.<init>(r1, r8)
            r0.v()
            je5 r8 = new je5
            r2 = 0
            xk4 r3 = r4.a
            r8.<init>(r3, r5, r2)
            bk1 r5 = new bk1
            r5.<init>()
            r5.L = r0
            r5.A = r7
            r5.B = r6
            r5.R = r4
            r8.d(r5)
            d80 r4 = new d80
            r4.<init>(r8, r1)
            r0.z(r4)
            java.lang.Object r4 = r0.s()
            x61 r5 = defpackage.x61.COROUTINE_SUSPENDED
            return r4
    }

    public final java.lang.Object m(java.lang.String r9, defpackage.s41 r10) {
            r8 = this;
            boolean r0 = r10 instanceof defpackage.a85
            if (r0 == 0) goto L14
            r0 = r10
            a85 r0 = (defpackage.a85) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            a85 r0 = new a85
            r0.<init>(r8, r10)
            goto L12
        L1a:
            java.lang.Object r10 = r6.X
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r6.Z
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L3e
            if (r1 == r3) goto L38
            if (r1 != r2) goto L32
            defpackage.oi2.Y(r10)
            hm5 r10 = (defpackage.hm5) r10
            java.lang.Object r8 = r10.A
            goto La4
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r4
        L38:
            java.lang.String r9 = r6.R
            defpackage.oi2.Y(r10)
            goto L4e
        L3e:
            defpackage.oi2.Y(r10)
            r6.R = r9
            r6.Z = r3
            hk r10 = r8.c
            java.lang.Object r10 = r10.b(r6)
            if (r10 != r0) goto L4e
            goto La3
        L4e:
            boolean r1 = r10 instanceof defpackage.hb5
            if (r1 == 0) goto L55
            hb5 r10 = (defpackage.hb5) r10
            goto L56
        L55:
            r10 = r4
        L56:
            if (r10 != 0) goto L63
            rj7 r8 = new rj7
            r8.<init>()
            em5 r9 = new em5
            r9.<init>(r8)
            return r9
        L63:
            vr4 r1 = new vr4
            java.lang.String r3 = "r"
            java.lang.String r5 = "achievementsets"
            r1.<init>(r3, r5)
            java.lang.String r3 = r10.a
            vr4 r5 = new vr4
            java.lang.String r7 = "u"
            r5.<init>(r7, r3)
            java.lang.String r10 = r10.b
            vr4 r3 = new vr4
            java.lang.String r7 = "t"
            r3.<init>(r7, r10)
            vr4 r10 = new vr4
            java.lang.String r7 = "m"
            r10.<init>(r7, r9)
            vr4[] r9 = new defpackage.vr4[]{r1, r5, r3, r10}
            java.util.Map r3 = defpackage.c14.m0(r9)
            r9 = r4
            up3 r4 = defpackage.up3.R
            java.lang.Class<fp2> r10 = defpackage.fp2.class
            ar0 r10 = defpackage.gh5.a(r10)
            r6.R = r9
            r6.Z = r2
            r5 = 1
            r1 = r8
            r2 = r10
            java.lang.Object r8 = a(r1, r2, r3, r4, r5, r6)
            if (r8 != r0) goto La4
        La3:
            return r0
        La4:
            boolean r9 = r8 instanceof defpackage.em5
            if (r9 != 0) goto Lc2
            defpackage.oi2.Y(r8)     // Catch: java.lang.Throwable -> Lb2
            fp2 r8 = (defpackage.fp2) r8     // Catch: java.lang.Throwable -> Lb2
            da5 r8 = defpackage.gp2.a(r8)     // Catch: java.lang.Throwable -> Lb2
            return r8
        Lb2:
            r0 = move-exception
            r8 = r0
            l61 r9 = r6.B
            r9.getClass()
            defpackage.yh2.o(r9)
            em5 r9 = new em5
            r9.<init>(r8)
            return r9
        Lc2:
            java.lang.Throwable r8 = defpackage.hm5.a(r8)
            r8.getClass()
            em5 r9 = new em5
            r9.<init>(r8)
            return r9
    }

    public final java.lang.Object n(defpackage.s41 r8) {
            r7 = this;
            boolean r0 = r8 instanceof defpackage.b85
            if (r0 == 0) goto L14
            r0 = r8
            b85 r0 = (defpackage.b85) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            b85 r0 = new b85
            r0.<init>(r7, r8)
            goto L12
        L1a:
            java.lang.Object r8 = r6.R
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r6.Y
            r2 = 1
            if (r1 == 0) goto L34
            if (r1 != r2) goto L2d
            defpackage.oi2.Y(r8)
            hm5 r8 = (defpackage.hm5) r8
            java.lang.Object r7 = r8.A
            goto L56
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            r7 = 0
            return r7
        L34:
            defpackage.oi2.Y(r8)
            java.lang.String r8 = "r"
            java.lang.String r1 = "hashlibrary"
            java.util.Map r3 = java.util.Collections.singletonMap(r8, r1)
            r3.getClass()
            up3 r4 = defpackage.up3.R
            java.lang.Class<ow2> r8 = defpackage.ow2.class
            ar0 r8 = defpackage.gh5.a(r8)
            r6.Y = r2
            r5 = 1
            r1 = r7
            r2 = r8
            java.lang.Object r7 = a(r1, r2, r3, r4, r5, r6)
            if (r7 != r0) goto L56
            return r0
        L56:
            boolean r8 = r7 instanceof defpackage.em5
            if (r8 != 0) goto L99
            ow2 r7 = (defpackage.ow2) r7
            java.util.Map r7 = r7.a
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            int r0 = r7.size()
            int r0 = defpackage.c14.k0(r0)
            r8.<init>(r0)
            java.util.Set r7 = r7.entrySet()
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            java.util.Iterator r7 = r7.iterator()
        L75:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L98
            java.lang.Object r0 = r7.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            long r2 = r0.longValue()
            ga5 r0 = new ga5
            r0.<init>(r2)
            r8.put(r1, r0)
            goto L75
        L98:
            return r8
        L99:
            return r7
    }

    public final java.lang.Object o(long r18, int r20, int r21, defpackage.s41 r22) {
            r17 = this;
            r0 = r22
            boolean r1 = r0 instanceof defpackage.c85
            if (r1 == 0) goto L18
            r1 = r0
            c85 r1 = (defpackage.c85) r1
            int r2 = r1.Z
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L18
            int r2 = r2 - r3
            r1.Z = r2
            r2 = r17
        L16:
            r7 = r1
            goto L20
        L18:
            c85 r1 = new c85
            r2 = r17
            r1.<init>(r2, r0)
            goto L16
        L20:
            java.lang.Object r0 = r7.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r7.Z
            r8 = 0
            r4 = 1
            if (r3 == 0) goto L3c
            if (r3 != r4) goto L36
            long r1 = r7.R
            defpackage.oi2.Y(r0)
            hm5 r0 = (defpackage.hm5) r0
            java.lang.Object r0 = r0.A
            goto L97
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r8
        L3c:
            defpackage.oi2.Y(r0)
            r0 = r20
            if (r0 >= r4) goto L44
            r0 = r4
        L44:
            int r0 = r0 - r4
            r3 = 100
            r5 = r21
            int r3 = defpackage.gi2.q(r5, r4, r3)
            vr4 r5 = new vr4
            java.lang.String r6 = "r"
            java.lang.String r9 = "lbinfo"
            r5.<init>(r6, r9)
            java.lang.String r6 = java.lang.String.valueOf(r18)
            vr4 r9 = new vr4
            java.lang.String r10 = "i"
            r9.<init>(r10, r6)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            vr4 r6 = new vr4
            java.lang.String r10 = "o"
            r6.<init>(r10, r0)
            java.lang.String r0 = java.lang.String.valueOf(r3)
            vr4 r3 = new vr4
            java.lang.String r10 = "c"
            r3.<init>(r10, r0)
            vr4[] r0 = new defpackage.vr4[]{r5, r9, r6, r3}
            java.util.Map r0 = defpackage.c14.m0(r0)
            up3 r5 = defpackage.up3.R
            java.lang.Class<xa5> r3 = defpackage.xa5.class
            ar0 r3 = defpackage.gh5.a(r3)
            r9 = r18
            r7.R = r9
            r7.Z = r4
            r6 = 1
            r4 = r0
            java.lang.Object r0 = a(r2, r3, r4, r5, r6, r7)
            if (r0 != r1) goto L96
            return r1
        L96:
            r1 = r9
        L97:
            boolean r3 = r0 instanceof defpackage.em5
            if (r3 != 0) goto L10a
            defpackage.oi2.Y(r0)     // Catch: java.lang.Throwable -> Le9
            xa5 r0 = (defpackage.xa5) r0     // Catch: java.lang.Throwable -> Le9
            ua5 r0 = r0.a     // Catch: java.lang.Throwable -> Le9
            int r3 = r0.c     // Catch: java.lang.Throwable -> Le9
            java.util.List r4 = r0.b     // Catch: java.lang.Throwable -> Le9
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Le9
            r6 = 10
            int r6 = defpackage.ht0.v0(r4, r6)     // Catch: java.lang.Throwable -> Le9
            r5.<init>(r6)     // Catch: java.lang.Throwable -> Le9
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Le9
        Lb5:
            boolean r6 = r4.hasNext()     // Catch: java.lang.Throwable -> Le9
            if (r6 == 0) goto Lf6
            java.lang.Object r6 = r4.next()     // Catch: java.lang.Throwable -> Le9
            wa5 r6 = (defpackage.wa5) r6     // Catch: java.lang.Throwable -> Le9
            java.lang.String r10 = r6.a     // Catch: java.lang.Throwable -> Le9
            int r11 = r6.b     // Catch: java.lang.Throwable -> Le9
            int r12 = r6.c     // Catch: java.lang.Throwable -> Le9
            java.lang.String r9 = r0.a     // Catch: java.lang.Throwable -> Le9
            java.lang.String r13 = i(r12, r9)     // Catch: java.lang.Throwable -> Le9
            long r14 = r6.d     // Catch: java.lang.Throwable -> Le9
            java.lang.String r6 = r6.e     // Catch: java.lang.Throwable -> Le9
            if (r6 == 0) goto Leb
            boolean r9 = defpackage.qs6.v0(r6)     // Catch: java.lang.Throwable -> Le9
            if (r9 != 0) goto Lda
            goto Ldb
        Lda:
            r6 = r8
        Ldb:
            if (r6 == 0) goto Leb
            java.net.URI r9 = new java.net.URI     // Catch: java.lang.Throwable -> Le9
            r9.<init>(r6)     // Catch: java.lang.Throwable -> Le9
            java.net.URL r6 = r9.toURL()     // Catch: java.lang.Throwable -> Le9
            r16 = r6
            goto Led
        Le9:
            r0 = move-exception
            goto Lfc
        Leb:
            r16 = r8
        Led:
            za5 r9 = new za5     // Catch: java.lang.Throwable -> Le9
            r9.<init>(r10, r11, r12, r13, r14, r16)     // Catch: java.lang.Throwable -> Le9
            r5.add(r9)     // Catch: java.lang.Throwable -> Le9
            goto Lb5
        Lf6:
            ya5 r0 = new ya5     // Catch: java.lang.Throwable -> Le9
            r0.<init>(r1, r3, r5)     // Catch: java.lang.Throwable -> Le9
            return r0
        Lfc:
            l61 r1 = r7.B
            r1.getClass()
            defpackage.yh2.o(r1)
            em5 r1 = new em5
            r1.<init>(r0)
            return r1
        L10a:
            java.lang.Throwable r0 = defpackage.hm5.a(r0)
            r0.getClass()
            em5 r1 = new em5
            r1.<init>(r0)
            return r1
    }

    public final java.lang.Object p(long r10, boolean r12, defpackage.s41 r13) {
            r9 = this;
            boolean r0 = r13 instanceof defpackage.d85
            if (r0 == 0) goto L14
            r0 = r13
            d85 r0 = (defpackage.d85) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.d0 = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            d85 r0 = new d85
            r0.<init>(r9, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r6.Y
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r6.d0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L40
            if (r1 == r3) goto L38
            if (r1 != r2) goto L32
            defpackage.oi2.Y(r13)
            hm5 r13 = (defpackage.hm5) r13
            java.lang.Object r9 = r13.A
            goto Lba
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            return r4
        L38:
            boolean r12 = r6.X
            long r10 = r6.R
            defpackage.oi2.Y(r13)
            goto L52
        L40:
            defpackage.oi2.Y(r13)
            r6.R = r10
            r6.X = r12
            r6.d0 = r3
            hk r13 = r9.c
            java.lang.Object r13 = r13.b(r6)
            if (r13 != r0) goto L52
            goto Lb9
        L52:
            boolean r1 = r13 instanceof defpackage.hb5
            if (r1 == 0) goto L59
            r4 = r13
            hb5 r4 = (defpackage.hb5) r4
        L59:
            if (r4 != 0) goto L66
            rj7 r9 = new rj7
            r9.<init>()
            em5 r10 = new em5
            r10.<init>(r9)
            return r10
        L66:
            vr4 r13 = new vr4
            java.lang.String r1 = "r"
            java.lang.String r3 = "unlocks"
            r13.<init>(r1, r3)
            java.lang.String r1 = r4.a
            vr4 r3 = new vr4
            java.lang.String r5 = "u"
            r3.<init>(r5, r1)
            java.lang.String r1 = r4.b
            vr4 r4 = new vr4
            java.lang.String r5 = "t"
            r4.<init>(r5, r1)
            java.lang.String r1 = java.lang.String.valueOf(r10)
            vr4 r5 = new vr4
            java.lang.String r7 = "g"
            r5.<init>(r7, r1)
            if (r12 == 0) goto L91
            java.lang.String r1 = "1"
            goto L93
        L91:
            java.lang.String r1 = "0"
        L93:
            vr4 r7 = new vr4
            java.lang.String r8 = "h"
            r7.<init>(r8, r1)
            vr4[] r13 = new defpackage.vr4[]{r13, r3, r4, r5, r7}
            java.util.Map r3 = defpackage.c14.m0(r13)
            up3 r4 = defpackage.up3.R
            java.lang.Class<tj7> r13 = defpackage.tj7.class
            ar0 r13 = defpackage.gh5.a(r13)
            r6.R = r10
            r6.X = r12
            r6.d0 = r2
            r5 = 1
            r1 = r9
            r2 = r13
            java.lang.Object r9 = a(r1, r2, r3, r4, r5, r6)
            if (r9 != r0) goto Lba
        Lb9:
            return r0
        Lba:
            boolean r10 = r9 instanceof defpackage.em5
            if (r10 != 0) goto Lc2
            tj7 r9 = (defpackage.tj7) r9
            java.util.List r9 = r9.a
        Lc2:
            return r9
    }

    public final java.lang.Object q(java.lang.String r23, java.lang.String r24, defpackage.s41 r25) {
            r22 = this;
            r0 = r22
            r1 = r25
            boolean r2 = r1 instanceof defpackage.e85
            if (r2 == 0) goto L18
            r2 = r1
            e85 r2 = (defpackage.e85) r2
            int r3 = r2.g0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.g0 = r3
        L16:
            r5 = r2
            goto L1e
        L18:
            e85 r2 = new e85
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r5.e0
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r5.g0
            jg7 r7 = defpackage.jg7.a
            jk r8 = r0.d
            hk r9 = r0.c
            r10 = 5
            r11 = 4
            r3 = 3
            r12 = 2
            r13 = 1
            r14 = 0
            r15 = 0
            if (r2 == 0) goto L77
            if (r2 == r13) goto L6e
            if (r2 == r12) goto L66
            if (r2 == r3) goto L55
            if (r2 == r11) goto L4a
            if (r2 != r10) goto L44
            java.lang.Object r0 = r5.Y
            defpackage.oi2.Y(r1)
            goto L141
        L44:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r15
        L4a:
            int r14 = r5.d0
            qj7 r0 = r5.Z
            java.lang.Object r2 = r5.Y
            defpackage.oi2.Y(r1)
            goto L10b
        L55:
            qj7 r0 = r5.Z
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Object r0 = r5.Y
            l85 r0 = (defpackage.l85) r0
            defpackage.oi2.Y(r1)
            hm5 r1 = (defpackage.hm5) r1
            java.lang.Object r0 = r1.A
            goto Ld9
        L66:
            java.lang.String r2 = r5.X
            java.lang.String r4 = r5.R
            defpackage.oi2.Y(r1)
            goto L9b
        L6e:
            java.lang.String r2 = r5.X
            java.lang.String r4 = r5.R
            defpackage.oi2.Y(r1)
            r1 = r4
            goto L8c
        L77:
            defpackage.oi2.Y(r1)
            r1 = r23
            r5.R = r1
            r2 = r24
            r5.X = r2
            r5.g0 = r13
            java.lang.Object r4 = r9.a(r5)
            if (r4 != r6) goto L8c
            goto L13f
        L8c:
            r5.R = r1
            r5.X = r2
            r5.g0 = r12
            java.lang.Object r4 = r8.b(r5)
            if (r4 != r6) goto L9a
            goto L13f
        L9a:
            r4 = r1
        L9b:
            vr4 r1 = new vr4
            java.lang.String r12 = "r"
            java.lang.String r10 = "login2"
            r1.<init>(r12, r10)
            vr4 r10 = new vr4
            java.lang.String r12 = "u"
            r10.<init>(r12, r4)
            vr4 r4 = new vr4
            java.lang.String r12 = "p"
            r4.<init>(r12, r2)
            vr4[] r1 = new defpackage.vr4[]{r1, r10, r4}
            java.util.Map r2 = defpackage.c14.m0(r1)
            up3 r1 = defpackage.up3.R
            java.lang.Class<qj7> r4 = defpackage.qj7.class
            ar0 r4 = defpackage.gh5.a(r4)
            r5.R = r15
            r5.X = r15
            r5.Y = r15
            r5.Z = r15
            r5.d0 = r14
            r5.g0 = r3
            r3 = r1
            r1 = r4
            r4 = 0
            java.lang.Object r0 = a(r0, r1, r2, r3, r4, r5)
            if (r0 != r6) goto Ld9
            goto L13f
        Ld9:
            boolean r1 = r0 instanceof defpackage.em5
            if (r1 != 0) goto L141
            r1 = r0
            qj7 r1 = (defpackage.qj7) r1
            hb5 r2 = new hb5
            java.lang.String r3 = r1.a
            java.lang.String r4 = r1.b
            r2.<init>(r3, r4)
            r5.R = r15
            r5.X = r15
            r5.Y = r0
            r5.Z = r1
            r5.d0 = r14
            r5.g0 = r11
            xe1 r3 = defpackage.xk1.a
            de1 r3 = defpackage.de1.L
            ji r4 = new ji
            r4.<init>(r9, r2, r15, r13)
            java.lang.Object r2 = defpackage.hv.d0(r3, r4, r5)
            if (r2 != r6) goto L105
            goto L106
        L105:
            r2 = r7
        L106:
            if (r2 != r6) goto L109
            goto L13f
        L109:
            r2 = r0
            r0 = r1
        L10b:
            lb5 r16 = new lb5
            java.lang.String r1 = r0.a
            long r3 = r0.c
            long r9 = r0.d
            r17 = r1
            r18 = r3
            r20 = r9
            r16.<init>(r17, r18, r20)
            r0 = r16
            r5.R = r15
            r5.X = r15
            r5.Y = r2
            r5.Z = r15
            r5.d0 = r14
            r1 = 5
            r5.g0 = r1
            xe1 r1 = defpackage.xk1.a
            de1 r1 = defpackage.de1.L
            ji r3 = new ji
            r4 = 2
            r3.<init>(r8, r0, r15, r4)
            java.lang.Object r0 = defpackage.hv.d0(r1, r3, r5)
            if (r0 != r6) goto L13c
            goto L13d
        L13c:
            r0 = r7
        L13d:
            if (r0 != r6) goto L140
        L13f:
            return r6
        L140:
            r0 = r2
        L141:
            boolean r1 = r0 instanceof defpackage.em5
            if (r1 != 0) goto L148
            qj7 r0 = (defpackage.qj7) r0
            return r7
        L148:
            return r0
    }

    public final java.lang.Object r(defpackage.s41 r17) {
            r16 = this;
            r0 = r16
            r1 = r17
            boolean r2 = r1 instanceof defpackage.g85
            if (r2 == 0) goto L18
            r2 = r1
            g85 r2 = (defpackage.g85) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.Z = r3
        L16:
            r5 = r2
            goto L1e
        L18:
            g85 r2 = new g85
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r5.X
            x61 r6 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r5.Z
            r7 = 3
            r8 = 2
            r3 = 1
            r9 = 0
            if (r2 == 0) goto L4c
            if (r2 == r3) goto L48
            if (r2 == r8) goto L3c
            if (r2 != r7) goto L36
            java.lang.Object r0 = r5.R
            defpackage.oi2.Y(r1)
            return r0
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r9
        L3c:
            java.lang.Object r2 = r5.R
            l85 r2 = (defpackage.l85) r2
            defpackage.oi2.Y(r1)
            hm5 r1 = (defpackage.hm5) r1
            java.lang.Object r1 = r1.A
            goto La7
        L48:
            defpackage.oi2.Y(r1)
            goto L5b
        L4c:
            defpackage.oi2.Y(r1)
            r5.Z = r3
            hk r1 = r0.c
            java.lang.Object r1 = r1.b(r5)
            if (r1 != r6) goto L5b
            goto Lda
        L5b:
            boolean r2 = r1 instanceof defpackage.hb5
            if (r2 == 0) goto L62
            hb5 r1 = (defpackage.hb5) r1
            goto L63
        L62:
            r1 = r9
        L63:
            if (r1 != 0) goto L70
            rj7 r0 = new rj7
            r0.<init>()
            em5 r1 = new em5
            r1.<init>(r0)
            return r1
        L70:
            vr4 r2 = new vr4
            java.lang.String r3 = "r"
            java.lang.String r4 = "login2"
            r2.<init>(r3, r4)
            java.lang.String r3 = r1.a
            vr4 r4 = new vr4
            java.lang.String r10 = "u"
            r4.<init>(r10, r3)
            java.lang.String r1 = r1.b
            vr4 r3 = new vr4
            java.lang.String r10 = "t"
            r3.<init>(r10, r1)
            vr4[] r1 = new defpackage.vr4[]{r2, r4, r3}
            java.util.Map r2 = defpackage.c14.m0(r1)
            up3 r3 = defpackage.up3.R
            java.lang.Class<qj7> r1 = defpackage.qj7.class
            ar0 r1 = defpackage.gh5.a(r1)
            r5.R = r9
            r5.Z = r8
            r4 = 0
            java.lang.Object r1 = a(r0, r1, r2, r3, r4, r5)
            if (r1 != r6) goto La7
            goto Lda
        La7:
            boolean r2 = r1 instanceof defpackage.em5
            if (r2 != 0) goto Lb9
            qj7 r1 = (defpackage.qj7) r1
            lb5 r10 = new lb5
            java.lang.String r11 = r1.a
            long r12 = r1.c
            long r14 = r1.d
            r10.<init>(r11, r12, r14)
            r1 = r10
        Lb9:
            boolean r2 = r1 instanceof defpackage.em5
            if (r2 != 0) goto Ldb
            r2 = r1
            lb5 r2 = (defpackage.lb5) r2
            r5.R = r1
            r5.Z = r7
            xe1 r3 = defpackage.xk1.a
            de1 r3 = defpackage.de1.L
            ji r4 = new ji
            jk r0 = r0.d
            r4.<init>(r0, r2, r9, r8)
            java.lang.Object r0 = defpackage.hv.d0(r3, r4, r5)
            if (r0 != r6) goto Ld6
            goto Ld8
        Ld6:
            jg7 r0 = defpackage.jg7.a
        Ld8:
            if (r0 != r6) goto Ldb
        Lda:
            return r6
        Ldb:
            return r1
    }

    public final java.lang.Object s(long r18, java.lang.String r20, boolean r21, java.lang.String r22, defpackage.s41 r23) {
            r17 = this;
            r0 = r17
            r1 = r23
            boolean r2 = r1 instanceof defpackage.h85
            if (r2 == 0) goto L17
            r2 = r1
            h85 r2 = (defpackage.h85) r2
            int r3 = r2.f0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f0 = r3
            goto L1c
        L17:
            h85 r2 = new h85
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.d0
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.f0
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L45
            if (r4 == r6) goto L39
            if (r4 != r5) goto L33
            defpackage.oi2.Y(r1)
            hm5 r1 = (defpackage.hm5) r1
            java.lang.Object r0 = r1.A
            return r0
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r7
        L39:
            boolean r4 = r2.Z
            long r8 = r2.R
            java.lang.String r6 = r2.Y
            java.lang.String r10 = r2.X
            defpackage.oi2.Y(r1)
            goto L6b
        L45:
            defpackage.oi2.Y(r1)
            r1 = r20
            r2.X = r1
            r4 = r22
            r2.Y = r4
            r8 = r18
            r2.R = r8
            r10 = r21
            r2.Z = r10
            r2.f0 = r6
            hk r6 = r0.c
            java.lang.Object r6 = r6.b(r2)
            if (r6 != r3) goto L64
            goto Lef
        L64:
            r16 = r10
            r10 = r1
            r1 = r6
            r6 = r4
            r4 = r16
        L6b:
            boolean r11 = r1 instanceof defpackage.hb5
            if (r11 == 0) goto L72
            hb5 r1 = (defpackage.hb5) r1
            goto L73
        L72:
            r1 = r7
        L73:
            if (r1 != 0) goto L80
            rj7 r0 = new rj7
            r0.<init>()
            em5 r1 = new em5
            r1.<init>(r0)
            return r1
        L80:
            vr4 r11 = new vr4
            java.lang.String r12 = "r"
            java.lang.String r13 = "ping"
            r11.<init>(r12, r13)
            java.lang.String r12 = r1.a
            vr4 r13 = new vr4
            java.lang.String r14 = "u"
            r13.<init>(r14, r12)
            java.lang.String r1 = r1.b
            vr4 r12 = new vr4
            java.lang.String r14 = "t"
            r12.<init>(r14, r1)
            java.lang.String r1 = java.lang.String.valueOf(r8)
            vr4 r14 = new vr4
            java.lang.String r15 = "g"
            r14.<init>(r15, r1)
            vr4 r1 = new vr4
            java.lang.String r15 = "x"
            r1.<init>(r15, r10)
            if (r4 == 0) goto Lb2
            java.lang.String r10 = "1"
            goto Lb4
        Lb2:
            java.lang.String r10 = "0"
        Lb4:
            vr4 r15 = new vr4
            java.lang.String r5 = "h"
            r15.<init>(r5, r10)
            r22 = r1
            r18 = r11
            r20 = r12
            r19 = r13
            r21 = r14
            r23 = r15
            vr4[] r1 = new defpackage.vr4[]{r18, r19, r20, r21, r22, r23}
            java.util.LinkedHashMap r1 = defpackage.c14.n0(r1)
            if (r6 == 0) goto Ld6
            java.lang.String r5 = "m"
            r1.put(r5, r6)
        Ld6:
            up3 r5 = defpackage.up3.X
            java.lang.Class<jg7> r6 = defpackage.jg7.class
            ar0 r6 = defpackage.gh5.a(r6)
            r2.X = r7
            r2.Y = r7
            r2.R = r8
            r2.Z = r4
            r4 = 2
            r2.f0 = r4
            java.lang.Object r0 = c(r0, r6, r1, r5, r2)
            if (r0 != r3) goto Lf0
        Lef:
            return r3
        Lf0:
            return r0
    }

    public final java.lang.Object t(long r19, defpackage.s41 r21, java.lang.String r22, boolean r23) {
            r18 = this;
            r0 = r18
            r1 = r21
            boolean r2 = r1 instanceof defpackage.i85
            if (r2 == 0) goto L17
            r2 = r1
            i85 r2 = (defpackage.i85) r2
            int r3 = r2.e0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.e0 = r3
            goto L1c
        L17:
            i85 r2 = new i85
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.Z
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.e0
            r5 = 2
            r6 = 1
            r7 = 0
            if (r4 == 0) goto L48
            if (r4 == r6) goto L39
            if (r4 != r5) goto L33
            defpackage.oi2.Y(r1)
            hm5 r1 = (defpackage.hm5) r1
            java.lang.Object r0 = r1.A
            return r0
        L33:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r7
        L39:
            boolean r4 = r2.Y
            long r8 = r2.R
            java.lang.String r6 = r2.X
            defpackage.oi2.Y(r1)
            r17 = r6
            r6 = r1
            r1 = r17
            goto L63
        L48:
            defpackage.oi2.Y(r1)
            r1 = r22
            r2.X = r1
            r8 = r19
            r2.R = r8
            r4 = r23
            r2.Y = r4
            r2.e0 = r6
            hk r6 = r0.c
            java.lang.Object r6 = r6.b(r2)
            if (r6 != r3) goto L63
            goto Lde
        L63:
            boolean r10 = r6 instanceof defpackage.hb5
            if (r10 == 0) goto L6a
            hb5 r6 = (defpackage.hb5) r6
            goto L6b
        L6a:
            r6 = r7
        L6b:
            if (r6 != 0) goto L78
            rj7 r0 = new rj7
            r0.<init>()
            em5 r1 = new em5
            r1.<init>(r0)
            return r1
        L78:
            vr4 r10 = new vr4
            java.lang.String r11 = "r"
            java.lang.String r12 = "startsession"
            r10.<init>(r11, r12)
            java.lang.String r11 = r6.a
            vr4 r12 = new vr4
            java.lang.String r13 = "u"
            r12.<init>(r13, r11)
            java.lang.String r6 = r6.b
            r11 = r12
            vr4 r12 = new vr4
            java.lang.String r13 = "t"
            r12.<init>(r13, r6)
            java.lang.String r6 = java.lang.String.valueOf(r8)
            vr4 r13 = new vr4
            java.lang.String r14 = "g"
            r13.<init>(r14, r6)
            vr4 r14 = new vr4
            java.lang.String r6 = "m"
            r14.<init>(r6, r1)
            if (r4 == 0) goto Lab
            java.lang.String r1 = "1"
            goto Lad
        Lab:
            java.lang.String r1 = "0"
        Lad:
            vr4 r15 = new vr4
            java.lang.String r6 = "h"
            r15.<init>(r6, r1)
            vr4 r1 = new vr4
            java.lang.String r6 = "l"
            java.lang.String r5 = "12.3.0"
            r1.<init>(r6, r5)
            r16 = r1
            vr4[] r1 = new defpackage.vr4[]{r10, r11, r12, r13, r14, r15, r16}
            java.util.Map r1 = defpackage.c14.m0(r1)
            up3 r5 = defpackage.up3.X
            java.lang.Class<jg7> r6 = defpackage.jg7.class
            ar0 r6 = defpackage.gh5.a(r6)
            r2.X = r7
            r2.R = r8
            r2.Y = r4
            r4 = 2
            r2.e0 = r4
            java.lang.Object r0 = c(r0, r6, r1, r5, r2)
            if (r0 != r3) goto Ldf
        Lde:
            return r3
        Ldf:
            return r0
    }

    public final java.lang.Object u(long r9, int r11, java.lang.String r12, defpackage.s41 r13) {
            r8 = this;
            boolean r0 = r13 instanceof defpackage.j85
            if (r0 == 0) goto L14
            r0 = r13
            j85 r0 = (defpackage.j85) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.e0 = r1
        L12:
            r7 = r0
            goto L1a
        L14:
            j85 r0 = new j85
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r13 = r7.Z
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r7.e0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L42
            if (r1 == r3) goto L37
            if (r1 != r2) goto L31
            defpackage.oi2.Y(r13)
            hm5 r13 = (defpackage.hm5) r13
            java.lang.Object r8 = r13.A
            return r8
        L31:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r4
        L37:
            int r11 = r7.X
            long r9 = r7.R
            java.lang.String r12 = r7.Y
            defpackage.oi2.Y(r13)
        L40:
            r6 = r12
            goto L56
        L42:
            defpackage.oi2.Y(r13)
            r7.Y = r12
            r7.R = r9
            r7.X = r11
            r7.e0 = r3
            hk r13 = r8.c
            java.lang.Object r13 = r13.b(r7)
            if (r13 != r0) goto L40
            goto L7d
        L56:
            boolean r12 = r13 instanceof defpackage.hb5
            if (r12 == 0) goto L5e
            hb5 r13 = (defpackage.hb5) r13
            r5 = r13
            goto L5f
        L5e:
            r5 = r4
        L5f:
            if (r5 != 0) goto L6c
            rj7 r8 = new rj7
            r8.<init>()
            em5 r9 = new em5
            r9.<init>(r8)
            return r9
        L6c:
            r7.Y = r4
            r7.R = r9
            r7.X = r11
            r7.e0 = r2
            r1 = r8
            r2 = r9
            r4 = r11
            java.lang.Object r8 = r1.v(r2, r4, r5, r6, r7)
            if (r8 != r0) goto L7e
        L7d:
            return r0
        L7e:
            return r8
    }

    public final java.lang.Object v(long r14, int r16, defpackage.hb5 r17, java.lang.String r18, defpackage.s41 r19) {
            r13 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            boolean r3 = r2 instanceof defpackage.k85
            if (r3 == 0) goto L19
            r3 = r2
            k85 r3 = (defpackage.k85) r3
            int r4 = r3.Y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.Y = r4
            goto L1e
        L19:
            k85 r3 = new k85
            r3.<init>(r13, r2)
        L1e:
            java.lang.Object r2 = r3.R
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.Y
            r6 = 1
            if (r5 == 0) goto L39
            if (r5 != r6) goto L32
            defpackage.oi2.Y(r2)
            hm5 r2 = (defpackage.hm5) r2
            java.lang.Object r13 = r2.A
            goto Lef
        L32:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r13)
            r13 = 0
            return r13
        L39:
            defpackage.oi2.Y(r2)
            r0.getClass()
            java.lang.String r2 = r0.a
            java.lang.String r5 = "MD5"
            java.security.MessageDigest r5 = java.security.MessageDigest.getInstance(r5)
            java.lang.String r7 = java.lang.String.valueOf(r14)
            java.nio.charset.Charset r8 = defpackage.qm0.a
            byte[] r7 = r7.getBytes(r8)
            r7.getClass()
            r5.update(r7)
            byte[] r7 = r2.getBytes(r8)
            r7.getClass()
            r5.update(r7)
            java.lang.String r7 = java.lang.String.valueOf(r16)
            byte[] r7 = r7.getBytes(r8)
            r7.getClass()
            r5.update(r7)
            java.math.BigInteger r7 = new java.math.BigInteger
            byte[] r5 = r5.digest()
            r7.<init>(r6, r5)
            r5 = 16
            java.lang.String r5 = r7.toString(r5)
            r5.getClass()
            r7 = 32
            java.lang.String r5 = defpackage.qs6.B0(r7, r5)
            vr4 r7 = new vr4
            java.lang.String r8 = "r"
            java.lang.String r9 = "submitlbentry"
            r7.<init>(r8, r9)
            vr4 r8 = new vr4
            java.lang.String r9 = "u"
            r8.<init>(r9, r2)
            java.lang.String r0 = r0.b
            vr4 r9 = new vr4
            java.lang.String r2 = "t"
            r9.<init>(r2, r0)
            java.lang.String r0 = java.lang.String.valueOf(r14)
            vr4 r10 = new vr4
            java.lang.String r2 = "i"
            r10.<init>(r2, r0)
            java.lang.String r0 = java.lang.String.valueOf(r16)
            vr4 r11 = new vr4
            java.lang.String r2 = "s"
            r11.<init>(r2, r0)
            vr4 r12 = new vr4
            java.lang.String r0 = "v"
            r12.<init>(r0, r5)
            vr4[] r0 = new defpackage.vr4[]{r7, r8, r9, r10, r11, r12}
            java.util.LinkedHashMap r0 = defpackage.c14.n0(r0)
            if (r1 == 0) goto Ld3
            boolean r2 = defpackage.qs6.v0(r1)
            if (r2 == 0) goto Lce
            goto Ld3
        Lce:
            java.lang.String r2 = "m"
            r0.put(r2, r1)
        Ld3:
            up3 r1 = defpackage.up3.R
            java.lang.Class<db5> r2 = defpackage.db5.class
            ar0 r2 = defpackage.gh5.a(r2)
            r3.Y = r6
            r5 = 1
            r14 = r13
            r16 = r0
            r17 = r1
            r15 = r2
            r19 = r3
            r18 = r5
            java.lang.Object r13 = a(r14, r15, r16, r17, r18, r19)
            if (r13 != r4) goto Lef
            return r4
        Lef:
            boolean r0 = r13 instanceof defpackage.em5
            if (r0 != 0) goto L103
            db5 r13 = (defpackage.db5) r13
            cb5 r0 = new cb5
            zl5 r13 = r13.a
            qd5 r13 = r13.a
            int r1 = r13.b
            int r13 = r13.a
            r0.<init>(r1, r13)
            return r0
        L103:
            return r13
    }
}
