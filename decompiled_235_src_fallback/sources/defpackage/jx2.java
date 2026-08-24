package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jx2  reason: default package */
/* loaded from: classes.dex */
public final class jx2 {
    public static defpackage.e33 b;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public final /* synthetic */ int a;

    public /* synthetic */ jx2(int r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    public static java.lang.String A(java.lang.String r3, java.lang.String r4) {
            int r0 = r3.length()
            int r1 = r4.length()
            int r0 = r0 - r1
            if (r0 < 0) goto L3f
            r1 = 1
            if (r0 > r1) goto L3f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r3.length()
            int r2 = r4.length()
            int r2 = r2 + r1
            r0.<init>(r2)
            r1 = 0
        L1d:
            int r2 = r3.length()
            if (r1 >= r2) goto L3a
            char r2 = r3.charAt(r1)
            r0.append(r2)
            int r2 = r4.length()
            if (r2 <= r1) goto L37
            char r2 = r4.charAt(r1)
            r0.append(r2)
        L37:
            int r1 = r1 + 1
            goto L1d
        L3a:
            java.lang.String r3 = r0.toString()
            return r3
        L3f:
            java.lang.String r3 = "Invalid input received"
            defpackage.i.h(r3)
            r3 = 0
            return r3
    }

    public static final void B(defpackage.z64 r2, defpackage.on2 r3) {
            hi4 r0 = r2.Z
            if (r0 != 0) goto Le
            hi4 r0 = new hi4
            r1 = r2
            gi4 r1 = (defpackage.gi4) r1
            r0.<init>(r1)
            r2.Z = r0
        Le:
            zp4 r2 = defpackage.nc1.g0(r2)
            te r2 = (defpackage.te) r2
            bq4 r2 = r2.getSnapshotObserver()
            hh2 r1 = defpackage.hh2.f0
            qm6 r2 = r2.a
            r2.d(r0, r1, r3)
            return
    }

    public static final defpackage.gg3 C(defpackage.ar0 r6, java.util.ArrayList r7, defpackage.on2 r8) {
            r6.getClass()
            java.lang.Class r0 = r6.a
            java.lang.Class<java.util.Collection> r1 = java.util.Collection.class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r6.equals(r1)
            r2 = 0
            if (r1 != 0) goto L171
            java.lang.Class<java.util.List> r1 = java.util.List.class
            ar0 r3 = defpackage.gh5.a(r1)
            boolean r3 = r6.equals(r3)
            if (r3 != 0) goto L171
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L171
            java.lang.Class<java.util.ArrayList> r1 = java.util.ArrayList.class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L36
            goto L171
        L36:
            java.lang.Class<java.util.HashSet> r1 = java.util.HashSet.class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r6.equals(r1)
            r3 = 1
            if (r1 == 0) goto L50
            ru r6 = new ru
            java.lang.Object r8 = r7.get(r2)
            gg3 r8 = (defpackage.gg3) r8
            r6.<init>(r8, r3)
            goto L17c
        L50:
            java.lang.Class<java.util.Set> r1 = java.util.Set.class
            ar0 r4 = defpackage.gh5.a(r1)
            boolean r4 = r6.equals(r4)
            r5 = 2
            if (r4 != 0) goto L165
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L165
            java.lang.Class<java.util.LinkedHashSet> r1 = java.util.LinkedHashSet.class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L75
            goto L165
        L75:
            java.lang.Class<java.util.HashMap> r1 = java.util.HashMap.class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L94
            qw2 r6 = new qw2
            java.lang.Object r8 = r7.get(r2)
            gg3 r8 = (defpackage.gg3) r8
            java.lang.Object r1 = r7.get(r3)
            gg3 r1 = (defpackage.gg3) r1
            r6.<init>(r8, r1, r2)
            goto L17c
        L94:
            java.lang.Class<java.util.Map> r1 = java.util.Map.class
            ar0 r4 = defpackage.gh5.a(r1)
            boolean r4 = r6.equals(r4)
            if (r4 != 0) goto L153
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r6.equals(r1)
            if (r1 != 0) goto L153
            java.lang.Class<java.util.LinkedHashMap> r1 = java.util.LinkedHashMap.class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto Lb8
            goto L153
        Lb8:
            java.lang.Class<java.util.Map$Entry> r1 = java.util.Map.Entry.class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto Lde
            java.lang.Object r6 = r7.get(r2)
            gg3 r6 = (defpackage.gg3) r6
            java.lang.Object r8 = r7.get(r3)
            gg3 r8 = (defpackage.gg3) r8
            r6.getClass()
            r8.getClass()
            w04 r1 = new w04
            r1.<init>(r6, r8, r2)
        Ldb:
            r6 = r1
            goto L17c
        Lde:
            java.lang.Class<vr4> r1 = defpackage.vr4.class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r1 = r6.equals(r1)
            if (r1 == 0) goto L102
            java.lang.Object r6 = r7.get(r2)
            gg3 r6 = (defpackage.gg3) r6
            java.lang.Object r8 = r7.get(r3)
            gg3 r8 = (defpackage.gg3) r8
            r6.getClass()
            r8.getClass()
            w04 r1 = new w04
            r1.<init>(r6, r8, r3)
            goto Ldb
        L102:
            java.lang.Class<oc7> r1 = defpackage.oc7.class
            ar0 r1 = defpackage.gh5.a(r1)
            boolean r6 = r6.equals(r1)
            if (r6 == 0) goto L130
            java.lang.Object r6 = r7.get(r2)
            gg3 r6 = (defpackage.gg3) r6
            java.lang.Object r8 = r7.get(r3)
            gg3 r8 = (defpackage.gg3) r8
            java.lang.Object r1 = r7.get(r5)
            gg3 r1 = (defpackage.gg3) r1
            r6.getClass()
            r8.getClass()
            r1.getClass()
            pc7 r3 = new pc7
            r3.<init>(r6, r8, r1)
            r6 = r3
            goto L17c
        L130:
            r0.getClass()
            boolean r6 = r0.isArray()
            if (r6 == 0) goto L151
            java.lang.Object r6 = r8.c()
            r6.getClass()
            ar0 r6 = (defpackage.ar0) r6
            java.lang.Object r8 = r7.get(r2)
            gg3 r8 = (defpackage.gg3) r8
            r8.getClass()
            eh5 r1 = new eh5
            r1.<init>(r6, r8)
            goto Ldb
        L151:
            r6 = 0
            goto L17c
        L153:
            qw2 r6 = new qw2
            java.lang.Object r8 = r7.get(r2)
            gg3 r8 = (defpackage.gg3) r8
            java.lang.Object r1 = r7.get(r3)
            gg3 r1 = (defpackage.gg3) r1
            r6.<init>(r8, r1, r3)
            goto L17c
        L165:
            ru r6 = new ru
            java.lang.Object r8 = r7.get(r2)
            gg3 r8 = (defpackage.gg3) r8
            r6.<init>(r8, r5)
            goto L17c
        L171:
            ru r6 = new ru
            java.lang.Object r8 = r7.get(r2)
            gg3 r8 = (defpackage.gg3) r8
            r6.<init>(r8, r2)
        L17c:
            if (r6 != 0) goto L19b
            gg3[] r6 = new defpackage.gg3[r2]
            java.lang.Object[] r6 = r7.toArray(r6)
            gg3[] r6 = (defpackage.gg3[]) r6
            int r7 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            gg3[] r6 = (defpackage.gg3[]) r6
            r0.getClass()
            int r7 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r7)
            gg3[] r6 = (defpackage.gg3[]) r6
            gg3 r6 = p(r0, r6)
        L19b:
            return r6
    }

    public static defpackage.cm7 D(java.lang.String r5) {
            if (r5 == 0) goto L52
            boolean r0 = defpackage.qs6.v0(r5)
            if (r0 == 0) goto L9
            goto L52
        L9:
            java.lang.String r0 = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r5 = r0.matcher(r5)
            boolean r0 = r5.matches()
            if (r0 != 0) goto L1a
            goto L52
        L1a:
            r0 = 1
            java.lang.String r0 = r5.group(r0)
            if (r0 == 0) goto L52
            int r0 = java.lang.Integer.parseInt(r0)
            r1 = 2
            java.lang.String r1 = r5.group(r1)
            if (r1 == 0) goto L52
            int r1 = java.lang.Integer.parseInt(r1)
            r2 = 3
            java.lang.String r2 = r5.group(r2)
            if (r2 == 0) goto L52
            int r2 = java.lang.Integer.parseInt(r2)
            r3 = 4
            java.lang.String r4 = r5.group(r3)
            if (r4 == 0) goto L47
            java.lang.String r5 = r5.group(r3)
            goto L49
        L47:
            java.lang.String r5 = ""
        L49:
            cm7 r3 = new cm7
            r5.getClass()
            r3.<init>(r0, r1, r2, r5)
            return r3
        L52:
            r5 = 0
            return r5
    }

    public static final defpackage.g81 E(defpackage.vh2 r5, int r6) {
            sh2 r0 = r5.W0()
            int[] r1 = defpackage.wh2.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L8c
            r2 = 2
            if (r0 == r2) goto L89
            r2 = 3
            r3 = 0
            if (r0 == r2) goto L1f
            r5 = 4
            if (r0 != r5) goto L1b
            goto L8c
        L1b:
            defpackage.i.d()
            return r3
        L1f:
            vh2 r0 = defpackage.yh2.t(r5)
            if (r0 == 0) goto L83
            g81 r0 = E(r0, r6)
            g81 r2 = defpackage.g81.None
            if (r0 != r2) goto L2e
            goto L2f
        L2e:
            r3 = r0
        L2f:
            if (r3 != 0) goto L82
            boolean r0 = r5.l0
            if (r0 != 0) goto L81
            r5.l0 = r1
            r0 = 0
            ih2 r1 = r5.T0()     // Catch: java.lang.Throwable -> L65
            mj0 r3 = new mj0     // Catch: java.lang.Throwable -> L65
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L65
            zp4 r6 = defpackage.nc1.g0(r5)     // Catch: java.lang.Throwable -> L65
            te r6 = (defpackage.te) r6     // Catch: java.lang.Throwable -> L65
            ah2 r6 = r6.getFocusOwner()     // Catch: java.lang.Throwable -> L65
            eh2 r6 = (defpackage.eh2) r6     // Catch: java.lang.Throwable -> L65
            vh2 r4 = r6.f()     // Catch: java.lang.Throwable -> L65
            qn2 r1 = r1.k     // Catch: java.lang.Throwable -> L65
            r1.g(r3)     // Catch: java.lang.Throwable -> L65
            vh2 r6 = r6.f()     // Catch: java.lang.Throwable -> L65
            boolean r1 = r3.b     // Catch: java.lang.Throwable -> L65
            if (r1 == 0) goto L67
            nh2 r6 = defpackage.nh2.b     // Catch: java.lang.Throwable -> L65
            g81 r6 = defpackage.g81.Cancelled     // Catch: java.lang.Throwable -> L65
            r5.l0 = r0
            return r6
        L65:
            r6 = move-exception
            goto L7e
        L67:
            if (r4 == r6) goto L7b
            if (r6 == 0) goto L7b
            nh2 r6 = defpackage.nh2.d     // Catch: java.lang.Throwable -> L65
            nh2 r1 = defpackage.nh2.c     // Catch: java.lang.Throwable -> L65
            if (r6 != r1) goto L76
            g81 r6 = defpackage.g81.Cancelled     // Catch: java.lang.Throwable -> L65
            r5.l0 = r0
            return r6
        L76:
            g81 r6 = defpackage.g81.Redirected     // Catch: java.lang.Throwable -> L65
            r5.l0 = r0
            return r6
        L7b:
            r5.l0 = r0
            return r2
        L7e:
            r5.l0 = r0
            throw r6
        L81:
            return r2
        L82:
            return r3
        L83:
            java.lang.String r5 = "ActiveParent with no focused child"
            defpackage.i.h(r5)
            return r3
        L89:
            g81 r5 = defpackage.g81.Cancelled
            return r5
        L8c:
            g81 r5 = defpackage.g81.None
            return r5
    }

    public static final defpackage.g81 F(defpackage.vh2 r4) {
            boolean r0 = r4.m0
            if (r0 != 0) goto L41
            r0 = 1
            r4.m0 = r0
            r0 = 0
            ih2 r1 = r4.T0()     // Catch: java.lang.Throwable -> L34
            zp4 r2 = defpackage.nc1.g0(r4)     // Catch: java.lang.Throwable -> L34
            te r2 = (defpackage.te) r2     // Catch: java.lang.Throwable -> L34
            ah2 r2 = r2.getFocusOwner()     // Catch: java.lang.Throwable -> L34
            eh2 r2 = (defpackage.eh2) r2     // Catch: java.lang.Throwable -> L34
            vh2 r3 = r2.f()     // Catch: java.lang.Throwable -> L34
            hh2 r1 = r1.j     // Catch: java.lang.Throwable -> L34
            r1.getClass()     // Catch: java.lang.Throwable -> L34
            vh2 r1 = r2.f()     // Catch: java.lang.Throwable -> L34
            if (r3 == r1) goto L3b
            if (r1 == 0) goto L3b
            nh2 r1 = defpackage.nh2.d     // Catch: java.lang.Throwable -> L34
            nh2 r2 = defpackage.nh2.c     // Catch: java.lang.Throwable -> L34
            if (r1 != r2) goto L36
            g81 r1 = defpackage.g81.Cancelled     // Catch: java.lang.Throwable -> L34
            r4.m0 = r0
            return r1
        L34:
            r1 = move-exception
            goto L3e
        L36:
            g81 r1 = defpackage.g81.Redirected     // Catch: java.lang.Throwable -> L34
            r4.m0 = r0
            return r1
        L3b:
            r4.m0 = r0
            goto L41
        L3e:
            r4.m0 = r0
            throw r1
        L41:
            g81 r4 = defpackage.g81.None
            return r4
    }

    public static final defpackage.g81 G(defpackage.vh2 r11, int r12) {
            sh2 r0 = r11.W0()
            int[] r1 = defpackage.wh2.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto Lf0
            r2 = 2
            if (r0 == r2) goto Lf0
            r3 = 3
            r4 = 0
            if (r0 == r3) goto Ldf
            r5 = 4
            if (r0 != r5) goto Ldb
            z64 r0 = r11.A
            boolean r0 = r0.j0
            if (r0 != 0) goto L24
            java.lang.String r0 = "visitAncestors called on an unattached node"
            defpackage.p53.c(r0)
        L24:
            z64 r0 = r11.A
            z64 r0 = r0.X
            sm3 r11 = defpackage.nc1.f0(r11)
        L2c:
            if (r11 == 0) goto L9c
            if0 r6 = r11.B0
            java.lang.Object r6 = r6.g
            z64 r6 = (defpackage.z64) r6
            int r6 = r6.R
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L8b
        L3a:
            if (r0 == 0) goto L8b
            int r6 = r0.L
            r6 = r6 & 1024(0x400, float:1.435E-42)
            if (r6 == 0) goto L88
            r6 = r0
            r7 = r4
        L44:
            if (r6 == 0) goto L88
            boolean r8 = r6 instanceof defpackage.vh2
            if (r8 == 0) goto L4b
            goto L9d
        L4b:
            int r8 = r6.L
            r8 = r8 & 1024(0x400, float:1.435E-42)
            if (r8 == 0) goto L83
            boolean r8 = r6 instanceof defpackage.zg1
            if (r8 == 0) goto L83
            r8 = r6
            zg1 r8 = (defpackage.zg1) r8
            z64 r8 = r8.l0
            r9 = 0
        L5b:
            if (r8 == 0) goto L80
            int r10 = r8.L
            r10 = r10 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto L7d
            int r9 = r9 + 1
            if (r9 != r1) goto L69
            r6 = r8
            goto L7d
        L69:
            if (r7 != 0) goto L74
            ua4 r7 = new ua4
            r10 = 16
            z64[] r10 = new defpackage.z64[r10]
            r7.<init>(r10)
        L74:
            if (r6 == 0) goto L7a
            r7.b(r6)
            r6 = r4
        L7a:
            r7.b(r8)
        L7d:
            z64 r8 = r8.Y
            goto L5b
        L80:
            if (r9 != r1) goto L83
            goto L44
        L83:
            z64 r6 = defpackage.nc1.A(r7)
            goto L44
        L88:
            z64 r0 = r0.X
            goto L3a
        L8b:
            sm3 r11 = r11.v()
            if (r11 == 0) goto L9a
            if0 r0 = r11.B0
            if (r0 == 0) goto L9a
            java.lang.Object r0 = r0.f
            vy6 r0 = (defpackage.vy6) r0
            goto L2c
        L9a:
            r0 = r4
            goto L2c
        L9c:
            r6 = r4
        L9d:
            vh2 r6 = (defpackage.vh2) r6
            if (r6 != 0) goto La4
            g81 r11 = defpackage.g81.None
            return r11
        La4:
            sh2 r11 = r6.W0()
            int[] r0 = defpackage.wh2.a
            int r11 = r11.ordinal()
            r11 = r0[r11]
            if (r11 == r1) goto Ld6
            if (r11 == r2) goto Ld3
            if (r11 == r3) goto Lce
            if (r11 != r5) goto Lca
            g81 r11 = G(r6, r12)
            g81 r12 = defpackage.g81.None
            if (r11 != r12) goto Lc1
            goto Lc2
        Lc1:
            r4 = r11
        Lc2:
            if (r4 != 0) goto Lc9
            g81 r11 = F(r6)
            return r11
        Lc9:
            return r4
        Lca:
            defpackage.i.d()
            return r4
        Lce:
            g81 r11 = G(r6, r12)
            return r11
        Ld3:
            g81 r11 = defpackage.g81.Cancelled
            return r11
        Ld6:
            g81 r11 = F(r6)
            return r11
        Ldb:
            defpackage.i.d()
            return r4
        Ldf:
            vh2 r11 = defpackage.yh2.t(r11)
            if (r11 == 0) goto Lea
            g81 r11 = E(r11, r12)
            return r11
        Lea:
            java.lang.String r11 = "ActiveParent with no focused child"
            defpackage.i.h(r11)
            return r4
        Lf0:
            g81 r11 = defpackage.g81.None
            return r11
    }

    public static final long H(defpackage.s43 r8, defpackage.lo4 r9, defpackage.r43 r10, boolean r11) {
            long r0 = r8.g
            if (r9 != 0) goto L5
            goto L42
        L5:
            int r2 = r10.a
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r5 = 32
            r6 = 1
            if (r2 != r6) goto L18
            long r0 = r0 >> r5
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            goto L21
        L18:
            r6 = 2
            if (r2 != r6) goto L42
            long r0 = r0 & r3
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
        L21:
            lo4 r1 = defpackage.lo4.Horizontal
            r2 = 0
            if (r9 != r1) goto L35
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r0 = (long) r0
            int r2 = java.lang.Float.floatToRawIntBits(r2)
            long r6 = (long) r2
            long r0 = r0 << r5
        L31:
            long r2 = r6 & r3
            long r0 = r0 | r2
            goto L42
        L35:
            int r1 = java.lang.Float.floatToRawIntBits(r2)
            long r1 = (long) r1
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r6 = (long) r0
            long r0 = r1 << r5
            goto L31
        L42:
            long r9 = I(r8, r9, r10)
            long r9 = defpackage.jk4.e(r9, r0)
            if (r11 != 0) goto L53
            boolean r8 = r8.i
            if (r8 == 0) goto L53
            r8 = 0
            return r8
        L53:
            return r9
    }

    public static final long I(defpackage.s43 r5, defpackage.lo4 r6, defpackage.r43 r7) {
            if (r6 != 0) goto L5
            long r5 = r5.c
            return r5
        L5:
            int r7 = r7.a
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r2 = 32
            r3 = 1
            if (r7 != r3) goto L1a
            long r3 = r5.c
            long r3 = r3 >> r2
            int r5 = (int) r3
            float r5 = java.lang.Float.intBitsToFloat(r5)
            goto L25
        L1a:
            r3 = 2
            if (r7 != r3) goto L45
            long r3 = r5.c
            long r3 = r3 & r0
            int r5 = (int) r3
            float r5 = java.lang.Float.intBitsToFloat(r5)
        L25:
            lo4 r7 = defpackage.lo4.Horizontal
            r3 = 0
            if (r6 != r7) goto L38
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r5 = (long) r5
            int r7 = java.lang.Float.floatToRawIntBits(r3)
            long r3 = (long) r7
            long r5 = r5 << r2
        L35:
            long r0 = r0 & r3
            long r5 = r5 | r0
            return r5
        L38:
            int r6 = java.lang.Float.floatToRawIntBits(r3)
            long r6 = (long) r6
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r3 = (long) r5
            long r5 = r6 << r2
            goto L35
        L45:
            long r5 = r5.c
            return r5
    }

    public static final defpackage.mi6 J(defpackage.px0 r2) {
            xq2 r2 = (defpackage.xq2) r2
            java.lang.Object r0 = r2.P()
            vs0 r1 = defpackage.ox0.a
            if (r0 != r1) goto L12
            mi6 r0 = new mi6
            r0.<init>()
            r2.l0(r0)
        L12:
            mi6 r0 = (defpackage.mi6) r0
            return r0
    }

    public static final defpackage.gg3 K(defpackage.ar0 r1) {
            r1.getClass()
            gg3 r0 = M(r1)
            if (r0 == 0) goto La
            return r0
        La:
            fc6 r0 = new fc6
            java.lang.String r1 = defpackage.q60.P(r1)
            r0.<init>(r1)
            throw r0
    }

    public static final defpackage.gg3 L(defpackage.jd1 r1, java.lang.reflect.Type r2) {
            r1.getClass()
            r2.getClass()
            r0 = 1
            gg3 r1 = defpackage.yh2.J(r1, r2, r0)
            if (r1 == 0) goto Le
            return r1
        Le:
            java.lang.Class r1 = defpackage.yh2.D(r2)
            r1.getClass()
            fc6 r2 = new fc6
            ar0 r1 = defpackage.gh5.a(r1)
            java.lang.String r1 = defpackage.q60.P(r1)
            r2.<init>(r1)
            throw r2
    }

    public static final defpackage.gg3 M(defpackage.ar0 r3) {
            r3.getClass()
            r0 = 0
            gg3[] r1 = new defpackage.gg3[r0]
            java.lang.Class r2 = r3.a
            r2.getClass()
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            gg3[] r0 = (defpackage.gg3[]) r0
            gg3 r0 = p(r2, r0)
            if (r0 != 0) goto L20
            p04 r0 = defpackage.a35.a
            java.lang.Object r3 = r0.get(r3)
            gg3 r3 = (defpackage.gg3) r3
            return r3
        L20:
            return r0
    }

    public static final defpackage.gg3 N(defpackage.jd1 r1, defpackage.hg3 r2) {
            r1.getClass()
            r2.getClass()
            r0 = 0
            gg3 r1 = defpackage.gi2.O(r1, r2, r0)
            return r1
    }

    public static final java.util.ArrayList O(defpackage.jd1 r2, java.util.List r3, boolean r4) {
            r2.getClass()
            r3.getClass()
            r0 = 10
            if (r4 == 0) goto L40
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = defpackage.ht0.v0(r3, r0)
            r4.<init>(r0)
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L3f
            java.lang.Object r0 = r3.next()
            hg3 r0 = (defpackage.hg3) r0
            r0.getClass()
            r1 = 1
            gg3 r1 = defpackage.gi2.O(r2, r0, r1)
            if (r1 == 0) goto L31
            r4.add(r1)
            goto L17
        L31:
            ar0 r2 = defpackage.q60.O(r0)
            fc6 r3 = new fc6
            java.lang.String r2 = defpackage.q60.P(r2)
            r3.<init>(r2)
            throw r3
        L3f:
            return r4
        L40:
            java.util.ArrayList r4 = new java.util.ArrayList
            int r0 = defpackage.ht0.v0(r3, r0)
            r4.<init>(r0)
            java.util.Iterator r3 = r3.iterator()
        L4d:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L65
            java.lang.Object r0 = r3.next()
            hg3 r0 = (defpackage.hg3) r0
            gg3 r0 = N(r2, r0)
            if (r0 != 0) goto L61
            r2 = 0
            return r2
        L61:
            r4.add(r0)
            goto L4d
        L65:
            return r4
    }

    public static void P(android.view.View r2, defpackage.p24 r3) {
            n24 r0 = r3.B
            ps1 r0 = r0.c
            if (r0 == 0) goto L2d
            boolean r0 = r0.a
            if (r0 == 0) goto L2d
            android.view.ViewParent r2 = r2.getParent()
            r0 = 0
        Lf:
            boolean r1 = r2 instanceof android.view.View
            if (r1 == 0) goto L20
            r1 = r2
            android.view.View r1 = (android.view.View) r1
            float r1 = r1.getElevation()
            float r0 = r0 + r1
            android.view.ViewParent r2 = r2.getParent()
            goto Lf
        L20:
            n24 r2 = r3.B
            float r1 = r2.m
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 == 0) goto L2d
            r2.m = r0
            r3.s()
        L2d:
            return
    }

    public static final double Q(long r4) {
            r0 = 11
            long r0 = r4 >>> r0
            double r0 = (double) r0
            r2 = 4656722014701092864(0x40a0000000000000, double:2048.0)
            double r0 = r0 * r2
            r2 = 2047(0x7ff, double:1.0114E-320)
            long r4 = r4 & r2
            double r4 = (double) r4
            double r0 = r0 + r4
            return r0
    }

    public static final java.lang.String R(int r7, long r8) {
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 < 0) goto L11
            defpackage.g04.y(r7)
            java.lang.String r7 = java.lang.Long.toString(r8, r7)
            r7.getClass()
            return r7
        L11:
            r0 = 1
            long r1 = r8 >>> r0
            long r3 = (long) r7
            long r1 = r1 / r3
            long r0 = r1 << r0
            long r5 = r0 * r3
            long r8 = r8 - r5
            int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r2 < 0) goto L23
            long r8 = r8 - r3
            r2 = 1
            long r0 = r0 + r2
        L23:
            defpackage.g04.y(r7)
            java.lang.String r0 = java.lang.Long.toString(r0, r7)
            r0.getClass()
            defpackage.g04.y(r7)
            java.lang.String r7 = java.lang.Long.toString(r8, r7)
            r7.getClass()
            java.lang.String r7 = r0.concat(r7)
            return r7
    }

    public static final void S(defpackage.xa6 r9, int r10, defpackage.f76 r11) {
            ua4 r0 = new ua4
            r1 = 16
            xa6[] r1 = new defpackage.xa6[r1]
            r0.<init>(r1)
            r1 = 0
            java.util.List r9 = r9.i(r1, r1)
        Le:
            int r2 = r0.L
            r0.d(r2, r9)
        L13:
            int r9 = r0.L
            if (r9 == 0) goto L97
            int r9 = r9 + (-1)
            java.lang.Object r9 = r0.l(r9)
            xa6 r9 = (defpackage.xa6) r9
            boolean r2 = defpackage.u24.v(r9)
            ta6 r3 = r9.d
            ja4 r4 = r3.A
            if (r2 != 0) goto L13
            fb6 r2 = defpackage.bb6.j
            boolean r2 = r4.c(r2)
            if (r2 == 0) goto L32
            goto L13
        L32:
            eg4 r2 = r9.d()
            if (r2 == 0) goto L90
            r5 = 1
            of5 r6 = defpackage.ej2.k(r2, r5)
            m93 r6 = defpackage.ln2.W(r6)
            int r7 = r6.a
            int r8 = r6.c
            if (r7 >= r8) goto L13
            int r7 = r6.b
            int r8 = r6.d
            if (r7 < r8) goto L4e
            goto L13
        L4e:
            fb6 r7 = defpackage.sa6.e
            ja4 r3 = r3.A
            java.lang.Object r3 = r3.g(r7)
            r7 = 0
            if (r3 != 0) goto L5a
            r3 = r7
        L5a:
            eo2 r3 = (defpackage.eo2) r3
            fb6 r8 = defpackage.bb6.w
            java.lang.Object r4 = r4.g(r8)
            if (r4 != 0) goto L65
            goto L66
        L65:
            r7 = r4
        L66:
            e76 r7 = (defpackage.e76) r7
            if (r3 == 0) goto L8a
            if (r7 == 0) goto L8a
            on2 r3 = r7.b
            java.lang.Object r3 = r3.c()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            r4 = 0
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 <= 0) goto L8a
            int r5 = r5 + r10
            g76 r3 = new g76
            r3.<init>(r9, r5, r6, r2)
            r11.g(r3)
            S(r9, r5, r11)
            goto L13
        L8a:
            java.util.List r9 = r9.i(r1, r1)
            goto Le
        L90:
            java.lang.String r9 = "Expected semantics node to have a coordinator."
            ug r9 = defpackage.i61.e(r9)
            throw r9
        L97:
            return
    }

    public static final void a(defpackage.a74 r19, defpackage.s95 r20, defpackage.px0 r21, int r22) {
            r0 = r19
            r1 = r20
            r2 = r22
            r1.getClass()
            r9 = r21
            xq2 r9 = (defpackage.xq2) r9
            r3 = -1151379056(0xffffffffbb5f5990, float:-0.0034080483)
            r9.d0(r3)
            boolean r3 = r9.f(r0)
            r4 = 2
            if (r3 == 0) goto L1c
            r3 = 4
            goto L1d
        L1c:
            r3 = r4
        L1d:
            r3 = r3 | r2
            boolean r5 = r9.h(r1)
            if (r5 == 0) goto L27
            r5 = 32
            goto L29
        L27:
            r5 = 16
        L29:
            r3 = r3 | r5
            r5 = r3 & 19
            r6 = 18
            r7 = 1
            if (r5 == r6) goto L33
            r5 = r7
            goto L34
        L33:
            r5 = 0
        L34:
            r3 = r3 & r7
            boolean r3 = r9.S(r3, r5)
            if (r3 == 0) goto Lb5
            boolean r3 = r9.f(r1)
            java.lang.Object r5 = r9.P()
            vs0 r6 = defpackage.ox0.a
            if (r3 != 0) goto L49
            if (r5 != r6) goto L52
        L49:
            j14 r3 = defpackage.j14.SHOW_ICON
            vs4 r5 = defpackage.np2.Y(r3)
            r9.l0(r5)
        L52:
            qa4 r5 = (defpackage.qa4) r5
            boolean r3 = r9.f(r5)
            java.lang.Object r8 = r9.P()
            if (r3 != 0) goto L60
            if (r8 != r6) goto L69
        L60:
            x5 r8 = new x5
            r3 = 0
            r8.<init>(r5, r3, r4)
            r9.l0(r8)
        L69:
            eo2 r8 = (defpackage.eo2) r8
            defpackage.mb3.i(r9, r8, r1)
            r3 = 1098907648(0x41800000, float:16.0)
            a74 r10 = defpackage.ge7.O(r0, r3)
            r11 = 1090519040(0x41000000, float:8.0)
            y16 r12 = defpackage.z16.b(r11)
            r3 = 4294956800(0xffffd700, double:2.1219906053E-314)
            long r14 = defpackage.hv.c(r3)
            r16 = 12
            r13 = 0
            a74 r6 = defpackage.nj2.E(r10, r11, r12, r13, r14, r16)
            r8 = 1137180672(0x43c80000, float:400.0)
            a74 r6 = defpackage.dj6.m(r8, r7, r6)
            long r3 = defpackage.hv.c(r3)
            y16 r7 = defpackage.z16.b(r11)
            ql1 r8 = new ql1
            r10 = 14
            r8.<init>(r10, r1, r5)
            r5 = 1353536755(0x50ad54f3, float:2.3264205E10)
            zv0 r8 = defpackage.n16.I(r5, r8, r9)
            r10 = 1572864(0x180000, float:2.204052E-39)
            r11 = 56
            r17 = r3
            r3 = r6
            r5 = r17
            r4 = r7
            r7 = 0
            defpackage.hf.b(r3, r4, r5, r7, r8, r9, r10, r11)
            goto Lb8
        Lb5:
            r9.V()
        Lb8:
            cf5 r3 = r9.t()
            if (r3 == 0) goto Lc7
            ql1 r4 = new ql1
            r5 = 15
            r4.<init>(r0, r2, r5, r1)
            r3.d = r4
        Lc7:
            return
    }

    public static final void b(defpackage.a74 r36, defpackage.pr3 r37, defpackage.lq4 r38, boolean r39, defpackage.sd2 r40, boolean r41, defpackage.sg r42, defpackage.c40 r43, defpackage.iu r44, defpackage.d40 r45, defpackage.fu r46, defpackage.qn2 r47, defpackage.px0 r48, int r49, int r50, int r51) {
            r1 = r36
            r3 = r37
            r5 = r38
            r4 = r39
            r0 = r41
            r14 = r47
            r15 = r49
            r2 = r50
            r6 = r51
            r7 = r48
            xq2 r7 = (defpackage.xq2) r7
            r8 = 924924659(0x37213af3, float:9.610073E-6)
            r7.d0(r8)
            r8 = r15 & 6
            if (r8 != 0) goto L2b
            boolean r8 = r7.f(r1)
            if (r8 == 0) goto L28
            r8 = 4
            goto L29
        L28:
            r8 = 2
        L29:
            r8 = r8 | r15
            goto L2c
        L2b:
            r8 = r15
        L2c:
            r11 = r15 & 48
            if (r11 != 0) goto L3c
            boolean r11 = r7.f(r3)
            if (r11 == 0) goto L39
            r11 = 32
            goto L3b
        L39:
            r11 = 16
        L3b:
            r8 = r8 | r11
        L3c:
            r11 = r15 & 384(0x180, float:5.38E-43)
            r16 = 128(0x80, float:1.8E-43)
            if (r11 != 0) goto L4e
            boolean r11 = r7.f(r5)
            if (r11 == 0) goto L4b
            r11 = 256(0x100, float:3.59E-43)
            goto L4d
        L4b:
            r11 = r16
        L4d:
            r8 = r8 | r11
        L4e:
            r11 = r15 & 3072(0xc00, float:4.305E-42)
            r9 = 0
            r18 = 1024(0x400, float:1.435E-42)
            if (r11 != 0) goto L61
            boolean r11 = r7.g(r9)
            if (r11 == 0) goto L5e
            r11 = 2048(0x800, float:2.87E-42)
            goto L60
        L5e:
            r11 = r18
        L60:
            r8 = r8 | r11
        L61:
            r11 = r15 & 24576(0x6000, float:3.4438E-41)
            if (r11 != 0) goto L71
            boolean r11 = r7.g(r4)
            if (r11 == 0) goto L6e
            r11 = 16384(0x4000, float:2.2959E-41)
            goto L70
        L6e:
            r11 = 8192(0x2000, float:1.148E-41)
        L70:
            r8 = r8 | r11
        L71:
            r11 = 196608(0x30000, float:2.75506E-40)
            r11 = r11 & r15
            if (r11 != 0) goto L86
            r11 = r40
            boolean r20 = r7.f(r11)
            if (r20 == 0) goto L81
            r20 = 131072(0x20000, float:1.83671E-40)
            goto L83
        L81:
            r20 = 65536(0x10000, float:9.1835E-41)
        L83:
            r8 = r8 | r20
            goto L88
        L86:
            r11 = r40
        L88:
            r20 = 1572864(0x180000, float:2.204052E-39)
            r21 = r15 & r20
            if (r21 != 0) goto L9b
            boolean r21 = r7.g(r0)
            if (r21 == 0) goto L97
            r21 = 1048576(0x100000, float:1.469368E-39)
            goto L99
        L97:
            r21 = 524288(0x80000, float:7.34684E-40)
        L99:
            r8 = r8 | r21
        L9b:
            r21 = 12582912(0xc00000, float:1.7632415E-38)
            r22 = r15 & r21
            r9 = r42
            if (r22 != 0) goto Lb0
            boolean r23 = r7.f(r9)
            if (r23 == 0) goto Lac
            r23 = 8388608(0x800000, float:1.1754944E-38)
            goto Lae
        Lac:
            r23 = 4194304(0x400000, float:5.877472E-39)
        Lae:
            r8 = r8 | r23
        Lb0:
            r23 = 100663296(0x6000000, float:2.4074124E-35)
            r24 = r15 & r23
            if (r24 != 0) goto Lba
            r24 = 33554432(0x2000000, float:9.403955E-38)
            r8 = r8 | r24
        Lba:
            r12 = r6 & 512(0x200, float:7.17E-43)
            r25 = 805306368(0x30000000, float:4.656613E-10)
            if (r12 == 0) goto Lc5
            r8 = r8 | r25
            r13 = r43
            goto Ld8
        Lc5:
            r26 = r15 & r25
            r13 = r43
            if (r26 != 0) goto Ld8
            boolean r27 = r7.f(r13)
            if (r27 == 0) goto Ld4
            r27 = 536870912(0x20000000, float:1.0842022E-19)
            goto Ld6
        Ld4:
            r27 = 268435456(0x10000000, float:2.524355E-29)
        Ld6:
            r8 = r8 | r27
        Ld8:
            r10 = r6 & 1024(0x400, float:1.435E-42)
            if (r10 == 0) goto Le5
            r28 = r2 | 6
            r29 = r28
            r28 = r8
            r8 = r44
            goto L101
        Le5:
            r28 = r2 & 6
            if (r28 != 0) goto Lfb
            r28 = r8
            r8 = r44
            boolean r29 = r7.f(r8)
            if (r29 == 0) goto Lf6
            r29 = 4
            goto Lf8
        Lf6:
            r29 = 2
        Lf8:
            r29 = r2 | r29
            goto L101
        Lfb:
            r28 = r8
            r8 = r44
            r29 = r2
        L101:
            r8 = r6 & 2048(0x800, float:2.87E-42)
            if (r8 == 0) goto L10c
            r29 = r29 | 48
            r30 = r8
        L109:
            r8 = r29
            goto L127
        L10c:
            r30 = r2 & 48
            if (r30 != 0) goto L122
            r30 = r8
            r8 = r45
            boolean r31 = r7.f(r8)
            if (r31 == 0) goto L11d
            r19 = 32
            goto L11f
        L11d:
            r19 = 16
        L11f:
            r29 = r29 | r19
            goto L109
        L122:
            r30 = r8
            r8 = r45
            goto L109
        L127:
            r9 = r6 & 4096(0x1000, float:5.74E-42)
            if (r9 == 0) goto L130
            r8 = r8 | 384(0x180, float:5.38E-43)
        L12d:
            r6 = r46
            goto L140
        L130:
            r6 = r2 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L12d
            r6 = r46
            boolean r19 = r7.f(r6)
            if (r19 == 0) goto L13e
            r16 = 256(0x100, float:3.59E-43)
        L13e:
            r8 = r8 | r16
        L140:
            r6 = r2 & 3072(0xc00, float:4.305E-42)
            if (r6 != 0) goto L14e
            boolean r6 = r7.h(r14)
            if (r6 == 0) goto L14c
            r18 = 2048(0x800, float:2.87E-42)
        L14c:
            r8 = r8 | r18
        L14e:
            r6 = 306783379(0x12492493, float:6.34695E-28)
            r6 = r28 & r6
            r2 = 306783378(0x12492492, float:6.3469493E-28)
            r16 = 1
            if (r6 != r2) goto L163
            r2 = r8 & 1171(0x493, float:1.641E-42)
            r6 = 1170(0x492, float:1.64E-42)
            if (r2 == r6) goto L161
            goto L163
        L161:
            r2 = 0
            goto L165
        L163:
            r2 = r16
        L165:
            r6 = r28 & 1
            boolean r2 = r7.S(r6, r2)
            if (r2 == 0) goto L45d
            r7.X()
            r2 = r15 & 1
            r6 = -234881025(0xfffffffff1ffffff, float:-2.535301E30)
            r18 = 0
            if (r2 == 0) goto L18e
            boolean r2 = r7.B()
            if (r2 == 0) goto L180
            goto L18e
        L180:
            r7.V()
            r2 = r28 & r6
            r6 = r44
            r9 = r8
            r12 = r13
            r13 = r45
            r8 = r46
            goto L1af
        L18e:
            r2 = r28 & r6
            if (r12 == 0) goto L194
            r13 = r18
        L194:
            if (r10 == 0) goto L199
            r6 = r18
            goto L19b
        L199:
            r6 = r44
        L19b:
            if (r30 == 0) goto L1a0
            r10 = r18
            goto L1a2
        L1a0:
            r10 = r45
        L1a2:
            if (r9 == 0) goto L1aa
            r9 = r8
            r12 = r13
            r8 = r18
        L1a8:
            r13 = r10
            goto L1af
        L1aa:
            r9 = r8
            r12 = r13
            r8 = r46
            goto L1a8
        L1af:
            r7.q()
            int r19 = r2 >> 3
            r10 = r19 & 14
            int r28 = r9 >> 6
            r28 = r28 & 112(0x70, float:1.57E-43)
            r28 = r10 | r28
            r43 = r2
            qa4 r2 = defpackage.np2.b0(r14, r7)
            r29 = r28 & 14
            r44 = r9
            r9 = r29 ^ 6
            r45 = r10
            r10 = 4
            if (r9 <= r10) goto L1d3
            boolean r9 = r7.f(r3)
            if (r9 != 0) goto L1d7
        L1d3:
            r9 = r28 & 6
            if (r9 != r10) goto L1da
        L1d7:
            r9 = r16
            goto L1db
        L1da:
            r9 = 0
        L1db:
            java.lang.Object r10 = r7.P()
            vs0 r14 = defpackage.ox0.a
            if (r9 != 0) goto L1e5
            if (r10 != r14) goto L227
        L1e5:
            lp3 r9 = new lp3
            r9.<init>()
            ss4 r10 = new ss4
            r11 = 2147483647(0x7fffffff, float:NaN)
            r10.<init>(r11)
            r9.a = r10
            ss4 r10 = new ss4
            r10.<init>(r11)
            r9.b = r10
            vs0 r10 = defpackage.vs0.s0
            f4 r11 = new f4
            r15 = 29
            r11.<init>(r2, r15)
            ii1 r2 = defpackage.np2.J(r11, r10)
            u6 r11 = new u6
            r15 = 14
            r11.<init>(r2, r3, r9, r15)
            ii1 r32 = defpackage.np2.J(r11, r10)
            qo3 r28 = new qo3
            r29 = 0
            r30 = 2
            java.lang.Class<pp6> r31 = defpackage.pp6.class
            java.lang.String r33 = "value"
            java.lang.String r34 = "getValue()Ljava/lang/Object;"
            r28.<init>(r29, r30, r31, r32, r33, r34)
            r10 = r28
            r7.l0(r10)
        L227:
            r2 = r10
            qo3 r2 = (defpackage.qo3) r2
            int r9 = r43 >> 9
            r10 = r9 & 112(0x70, float:1.57E-43)
            r10 = r45 | r10
            r11 = r10 & 14
            r11 = r11 ^ 6
            r15 = 4
            if (r11 <= r15) goto L23d
            boolean r11 = r7.f(r3)
            if (r11 != 0) goto L241
        L23d:
            r11 = r10 & 6
            if (r11 != r15) goto L244
        L241:
            r11 = r16
            goto L245
        L244:
            r11 = 0
        L245:
            r27 = r10 & 112(0x70, float:1.57E-43)
            r15 = r27 ^ 48
            r45 = r2
            r2 = 32
            if (r15 <= r2) goto L255
            boolean r15 = r7.g(r4)
            if (r15 != 0) goto L259
        L255:
            r10 = r10 & 48
            if (r10 != r2) goto L25c
        L259:
            r2 = r16
            goto L25d
        L25c:
            r2 = 0
        L25d:
            r2 = r2 | r11
            java.lang.Object r10 = r7.P()
            if (r2 != 0) goto L266
            if (r10 != r14) goto L26e
        L266:
            vq3 r10 = new vq3
            r10.<init>(r3, r4)
            r7.l0(r10)
        L26e:
            r15 = r10
            tq3 r15 = (defpackage.tq3) r15
            java.lang.Object r2 = r7.P()
            if (r2 != r14) goto L27e
            w61 r2 = defpackage.mb3.w(r7)
            r7.l0(r2)
        L27e:
            w61 r2 = (defpackage.w61) r2
            nq6 r10 = defpackage.ky0.g
            java.lang.Object r10 = r7.j(r10)
            tt2 r10 = (defpackage.tt2) r10
            py0 r11 = defpackage.ky0.w
            java.lang.Object r11 = r7.j(r11)
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            if (r11 != 0) goto L298
            q61 r18 = defpackage.tq6.a
        L298:
            r11 = r18
            r18 = 65520(0xfff0, float:9.1813E-41)
            r18 = r43 & r18
            r27 = 3670016(0x380000, float:5.142788E-39)
            r9 = r9 & r27
            r9 = r18 | r9
            int r18 = r44 << 18
            r29 = 29360128(0x1c00000, float:7.052966E-38)
            r30 = r18 & r29
            r9 = r9 | r30
            r30 = 234881024(0xe000000, float:1.5777218E-30)
            r18 = r18 & r30
            r9 = r9 | r18
            int r18 = r44 << 27
            r31 = 1879048192(0x70000000, float:1.5845633E29)
            r18 = r18 & r31
            r9 = r9 | r18
            r18 = r9 & 112(0x70, float:1.57E-43)
            r43 = r2
            r2 = r18 ^ 48
            r0 = 32
            if (r2 <= r0) goto L2cb
            boolean r2 = r7.f(r3)
            if (r2 != 0) goto L2cf
        L2cb:
            r2 = r9 & 48
            if (r2 != r0) goto L2d2
        L2cf:
            r0 = r16
            goto L2d3
        L2d2:
            r0 = 0
        L2d3:
            r2 = r9 & 896(0x380, float:1.256E-42)
            r2 = r2 ^ 384(0x180, float:5.38E-43)
            r44 = r0
            r0 = 256(0x100, float:3.59E-43)
            if (r2 <= r0) goto L2e3
            boolean r2 = r7.f(r5)
            if (r2 != 0) goto L2e7
        L2e3:
            r2 = r9 & 384(0x180, float:5.38E-43)
            if (r2 != r0) goto L2ea
        L2e7:
            r0 = r16
            goto L2eb
        L2ea:
            r0 = 0
        L2eb:
            r0 = r44 | r0
            r2 = r9 & 7168(0x1c00, float:1.0045E-41)
            r2 = r2 ^ 3072(0xc00, float:4.305E-42)
            r44 = r0
            r0 = 2048(0x800, float:2.87E-42)
            if (r2 <= r0) goto L2fe
            r2 = 0
            boolean r17 = r7.g(r2)
            if (r17 != 0) goto L302
        L2fe:
            r2 = r9 & 3072(0xc00, float:4.305E-42)
            if (r2 != r0) goto L305
        L302:
            r2 = r16
            goto L306
        L305:
            r2 = 0
        L306:
            r0 = r44 | r2
            r2 = 57344(0xe000, float:8.0356E-41)
            r2 = r2 & r9
            r2 = r2 ^ 24576(0x6000, float:3.4438E-41)
            r44 = r0
            r0 = 16384(0x4000, float:2.2959E-41)
            if (r2 <= r0) goto L31a
            boolean r2 = r7.g(r4)
            if (r2 != 0) goto L31e
        L31a:
            r2 = r9 & 24576(0x6000, float:3.4438E-41)
            if (r2 != r0) goto L321
        L31e:
            r2 = r16
            goto L322
        L321:
            r2 = 0
        L322:
            r0 = r44 | r2
            r2 = 0
            boolean r17 = r7.d(r2)
            r0 = r0 | r17
            r17 = r9 & r27
            r2 = r17 ^ r20
            r44 = r0
            r0 = 1048576(0x100000, float:1.469368E-39)
            if (r2 <= r0) goto L33b
            boolean r2 = r7.f(r12)
            if (r2 != 0) goto L33f
        L33b:
            r2 = r9 & r20
            if (r2 != r0) goto L342
        L33f:
            r2 = r16
            goto L343
        L342:
            r2 = 0
        L343:
            r0 = r44 | r2
            r2 = r9 & r29
            r2 = r2 ^ r21
            r44 = r0
            r0 = 8388608(0x800000, float:1.1754944E-38)
            if (r2 <= r0) goto L355
            boolean r2 = r7.f(r13)
            if (r2 != 0) goto L359
        L355:
            r2 = r9 & r21
            if (r2 != r0) goto L35c
        L359:
            r2 = r16
            goto L35d
        L35c:
            r2 = 0
        L35d:
            r0 = r44 | r2
            r2 = r9 & r30
            r2 = r2 ^ r23
            r44 = r0
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            if (r2 <= r0) goto L36f
            boolean r2 = r7.f(r8)
            if (r2 != 0) goto L373
        L36f:
            r2 = r9 & r23
            if (r2 != r0) goto L376
        L373:
            r2 = r16
            goto L377
        L376:
            r2 = 0
        L377:
            r0 = r44 | r2
            r2 = r9 & r31
            r2 = r2 ^ r25
            r44 = r0
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            if (r2 <= r0) goto L389
            boolean r2 = r7.f(r6)
            if (r2 != 0) goto L38d
        L389:
            r2 = r9 & r25
            if (r2 != r0) goto L390
        L38d:
            r2 = r16
            goto L391
        L390:
            r2 = 0
        L391:
            r0 = r44 | r2
            boolean r2 = r7.f(r10)
            r0 = r0 | r2
            boolean r2 = r7.f(r11)
            r0 = r0 | r2
            java.lang.Object r2 = r7.P()
            if (r0 != 0) goto L3b0
            if (r2 != r14) goto L3a6
            goto L3b0
        L3a6:
            r11 = r45
            r10 = r6
            r0 = r7
            r18 = r8
            r43 = r15
            r15 = 4
            goto L3c5
        L3b0:
            ir3 r2 = new ir3
            r9 = r43
            r0 = r7
            r43 = r15
            r15 = 4
            r7 = r6
            r6 = r45
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r11 = r6
            r10 = r7
            r18 = r8
            r0.l0(r2)
        L3c5:
            r17 = r2
            eq3 r17 = (defpackage.eq3) r17
            if (r39 == 0) goto L3cf
            lo4 r2 = defpackage.lo4.Vertical
        L3cd:
            r4 = r2
            goto L3d2
        L3cf:
            lo4 r2 = defpackage.lo4.Horizontal
            goto L3cd
        L3d2:
            if (r41 == 0) goto L413
            r2 = -2077147368(0xffffffff84313f18, float:-2.0835221E-36)
            r0.b0(r2)
            r2 = r19 & 14
            r2 = r2 ^ 6
            if (r2 <= r15) goto L3e6
            boolean r2 = r0.f(r3)
            if (r2 != 0) goto L3ea
        L3e6:
            r2 = r19 & 6
            if (r2 != r15) goto L3ee
        L3ea:
            r9 = r16
        L3ec:
            r2 = 0
            goto L3f0
        L3ee:
            r9 = 0
            goto L3ec
        L3f0:
            boolean r5 = r0.d(r2)
            r2 = r9 | r5
            java.lang.Object r5 = r0.P()
            if (r2 != 0) goto L3fe
            if (r5 != r14) goto L406
        L3fe:
            ar3 r5 = new ar3
            r5.<init>(r3)
            r0.l0(r5)
        L406:
            ar3 r5 = (defpackage.ar3) r5
            p70 r2 = r3.p
            a74 r2 = defpackage.ak7.n0(r5, r2, r4)
            r5 = 0
            r0.p(r5)
            goto L41f
        L413:
            r5 = 0
            r2 = -2076718545(0xffffffff8437ca2f, float:-2.1604385E-36)
            r0.b0(r2)
            r0.p(r5)
            x64 r2 = defpackage.x64.a
        L41f:
            gp3 r5 = r3.m
            a74 r5 = r1.d(r5)
            sz r6 = r3.n
            a74 r5 = r5.d(r6)
            r6 = r41
            r7 = r43
            a74 r5 = defpackage.vy7.p0(r5, r11, r7, r4, r6)
            a74 r2 = r5.d(r2)
            zp3 r5 = r3.o
            java.lang.Object r5 = r5.i
            a74 r5 = (defpackage.a74) r5
            a74 r2 = r2.d(r5)
            r94 r8 = r3.g
            r9 = 0
            r7 = r40
            r5 = r42
            a74 r2 = defpackage.f04.O(r2, r3, r4, r5, r6, r7, r8, r9)
            r8 = r3
            pq3 r4 = r8.q
            r7 = 0
            r6 = r0
            r3 = r2
            r2 = r11
            r5 = r17
            defpackage.kn2.e(r2, r3, r4, r5, r6, r7)
            r9 = r10
            r10 = r13
            r11 = r18
            goto L469
        L45d:
            r8 = r3
            r0 = r7
            r0.V()
            r9 = r44
            r10 = r45
            r11 = r46
            r12 = r13
        L469:
            cf5 r0 = r0.t()
            if (r0 == 0) goto L48f
            r2 = r0
            gr3 r0 = new gr3
            r3 = r38
            r4 = r39
            r5 = r40
            r6 = r41
            r7 = r42
            r13 = r49
            r14 = r50
            r15 = r51
            r35 = r2
            r2 = r8
            r8 = r12
            r12 = r47
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r2 = r35
            r2.d = r0
        L48f:
            return
    }

    public static final void c(defpackage.c37 r29, defpackage.qn2 r30, defpackage.a74 r31, boolean r32, defpackage.s47 r33, defpackage.eo2 r34, defpackage.eo2 r35, boolean r36, defpackage.wq7 r37, defpackage.xh3 r38, defpackage.vh3 r39, boolean r40, int r41, int r42, defpackage.ke6 r43, defpackage.i17 r44, defpackage.px0 r45, int r46, int r47, int r48) {
            r7 = r35
            r14 = r36
            r0 = r46
            r1 = r48
            r29.getClass()
            r30.getClass()
            r2 = r45
            xq2 r2 = (defpackage.xq2) r2
            r3 = 1252638432(0x4aa9bee0, float:5562224.0)
            r2.d0(r3)
            r8 = r29
            boolean r3 = r2.f(r8)
            if (r3 == 0) goto L22
            r3 = 4
            goto L23
        L22:
            r3 = 2
        L23:
            r3 = r3 | r0
            r9 = r30
            boolean r6 = r2.h(r9)
            r10 = 16
            r11 = 32
            if (r6 == 0) goto L32
            r6 = r11
            goto L33
        L32:
            r6 = r10
        L33:
            r3 = r3 | r6
            r6 = r0 & 384(0x180, float:5.38E-43)
            if (r6 != 0) goto L47
            r6 = r31
            boolean r12 = r2.f(r6)
            if (r12 == 0) goto L43
            r12 = 256(0x100, float:3.59E-43)
            goto L45
        L43:
            r12 = 128(0x80, float:1.8E-43)
        L45:
            r3 = r3 | r12
            goto L49
        L47:
            r6 = r31
        L49:
            r3 = r3 | 27648(0x6c00, float:3.8743E-41)
            r12 = r1 & 32
            r13 = 131072(0x20000, float:1.83671E-40)
            r15 = 65536(0x10000, float:9.1835E-41)
            if (r12 != 0) goto L5e
            r12 = r33
            boolean r16 = r2.f(r12)
            if (r16 == 0) goto L60
            r16 = r13
            goto L62
        L5e:
            r12 = r33
        L60:
            r16 = r15
        L62:
            r3 = r3 | r16
            r16 = 918552576(0x36c00000, float:5.722046E-6)
            r3 = r3 | r16
            boolean r16 = r2.g(r14)
            if (r16 == 0) goto L6f
            r10 = r11
        L6f:
            r10 = r47 | r10
            r10 = r10 | 384(0x180, float:5.38E-43)
            r11 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r11 != 0) goto L82
            r11 = r39
            boolean r16 = r2.f(r11)
            if (r16 == 0) goto L84
            r16 = 16384(0x4000, float:2.2959E-41)
            goto L86
        L82:
            r11 = r39
        L84:
            r16 = 8192(0x2000, float:1.148E-41)
        L86:
            r10 = r10 | r16
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r1 & r16
            r17 = 196608(0x30000, float:2.75506E-40)
            if (r16 == 0) goto L96
            r10 = r10 | r17
            r5 = r40
            goto La4
        L96:
            r17 = r47 & r17
            r5 = r40
            if (r17 != 0) goto La4
            boolean r17 = r2.g(r5)
            if (r17 == 0) goto La3
            r15 = r13
        La3:
            r10 = r10 | r15
        La4:
            r15 = 524288(0x80000, float:7.34684E-40)
            r15 = r15 | r10
            r13 = r13 & r1
            if (r13 == 0) goto Lb0
            r15 = 13107200(0xc80000, float:1.8367099E-38)
            r15 = r15 | r10
        Lad:
            r10 = r42
            goto Lc5
        Lb0:
            r10 = 12582912(0xc00000, float:1.7632415E-38)
            r10 = r47 & r10
            if (r10 != 0) goto Lad
            r10 = r42
            boolean r17 = r2.d(r10)
            if (r17 == 0) goto Lc1
            r17 = 8388608(0x800000, float:1.1754944E-38)
            goto Lc3
        Lc1:
            r17 = 4194304(0x400000, float:5.877472E-39)
        Lc3:
            r15 = r15 | r17
        Lc5:
            r17 = 369098752(0x16000000, float:1.0339758E-25)
            r15 = r15 | r17
            r4 = r44
            boolean r18 = r2.f(r4)
            if (r18 == 0) goto Ld4
            r18 = 4
            goto Ld6
        Ld4:
            r18 = 2
        Ld6:
            r19 = 306783379(0x12492493, float:6.34695E-28)
            r0 = r3 & r19
            r45 = r3
            r3 = 306783378(0x12492492, float:6.3469493E-28)
            if (r0 != r3) goto Lee
            r0 = r15 & r19
            if (r0 != r3) goto Lee
            r0 = r18 & 3
            r3 = 2
            if (r0 == r3) goto Lec
            goto Lee
        Lec:
            r0 = 0
            goto Lef
        Lee:
            r0 = 1
        Lef:
            r3 = r45 & 1
            boolean r0 = r2.S(r3, r0)
            if (r0 == 0) goto L26d
            r2.X()
            r0 = r46 & 1
            r3 = -1882718209(0xffffffff8fc7ffff, float:-1.9721521E-29)
            r17 = -57345(0xffffffffffff1fff, float:NaN)
            r19 = -458753(0xfffffffffff8ffff, float:NaN)
            if (r0 == 0) goto L132
            boolean r0 = r2.B()
            if (r0 == 0) goto L10e
            goto L132
        L10e:
            r2.V()
            r0 = r1 & 32
            if (r0 == 0) goto L118
            r0 = r45 & r19
            goto L11a
        L118:
            r0 = r45
        L11a:
            r13 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r13 == 0) goto L120
            r15 = r15 & r17
        L120:
            r3 = r3 & r15
            r15 = r37
            r19 = r41
            r21 = r43
            r17 = r11
            r11 = r32
        L12b:
            r20 = r10
            r4 = r18
            r18 = r5
            goto L180
        L132:
            r0 = r1 & 32
            if (r0 == 0) goto L146
            py0 r0 = defpackage.x37.a
            java.lang.Object r0 = r2.j(r0)
            s47 r0 = (defpackage.s47) r0
            r12 = r45 & r19
            r28 = r12
            r12 = r0
            r0 = r28
            goto L148
        L146:
            r0 = r45
        L148:
            fa6 r19 = defpackage.xd5.v0
            r45 = r3
            r3 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r3 == 0) goto L15b
            vh3 r3 = new vh3
            r11 = 0
            r4 = 63
            r3.<init>(r4, r11)
            r15 = r15 & r17
            goto L15c
        L15b:
            r3 = r11
        L15c:
            if (r16 == 0) goto L15f
            r5 = 0
        L15f:
            if (r5 == 0) goto L163
            r4 = 1
            goto L166
        L163:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L166:
            if (r13 == 0) goto L169
            r10 = 1
        L169:
            nq6 r11 = defpackage.ze6.a
            java.lang.Object r11 = r2.j(r11)
            ye6 r11 = (defpackage.ye6) r11
            y16 r11 = r11.a
            r13 = r15 & r45
            r17 = r3
            r21 = r11
            r3 = r13
            r15 = r19
            r11 = 1
            r19 = r4
            goto L12b
        L180:
            r2.q()
            x64 r5 = defpackage.x64.a
            a74 r5 = defpackage.u24.f(r5)
            gu r10 = new gu
            i r13 = new i
            r32 = r0
            r0 = 1
            r13.<init>(r0)
            r1 = 1082130432(0x40800000, float:4.0)
            r10.<init>(r1, r0, r13)
            c40 r0 = defpackage.d90.k0
            r1 = 6
            yt0 r0 = defpackage.wt0.a(r10, r0, r2, r1)
            r33 = r3
            r37 = r4
            long r3 = r2.T
            int r3 = java.lang.Long.hashCode(r3)
            xv4 r4 = r2.l()
            a74 r5 = defpackage.l.E(r2, r5)
            ix0 r10 = defpackage.jx0.i
            r10.getClass()
            iy0 r10 = defpackage.ix0.b
            r2.f0()
            boolean r13 = r2.S
            if (r13 == 0) goto L1c3
            r2.k(r10)
            goto L1c6
        L1c3:
            r2.o0()
        L1c6:
            pn r10 = defpackage.ix0.f
            defpackage.yh2.K(r2, r10, r0)
            pn r0 = defpackage.ix0.e
            defpackage.yh2.K(r2, r0, r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            pn r3 = defpackage.ix0.g
            defpackage.yh2.K(r2, r3, r0)
            ne r0 = defpackage.ix0.h
            defpackage.yh2.F(r2, r0)
            pn r0 = defpackage.ix0.d
            defpackage.yh2.K(r2, r0, r5)
            r0 = 2147483646(0x7ffffffe, float:NaN)
            r24 = r32 & r0
            int r0 = r33 >> 3
            r3 = 268435454(0xffffffe, float:2.5243546E-29)
            r0 = r0 & r3
            int r3 = r37 << 27
            r4 = 1879048192(0x70000000, float:1.5845633E29)
            r3 = r3 & r4
            r25 = r0 | r3
            r26 = 0
            r13 = r34
            r16 = r38
            r22 = r44
            r23 = r2
            r10 = r6
            defpackage.zo4.a(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            r0 = r23
            if (r36 == 0) goto L251
            if (r7 == 0) goto L251
            r2 = -421320268(0xffffffffe6e329b4, float:-5.3637324E23)
            r0.b0(r2)
            py0 r2 = defpackage.x37.a
            nq6 r3 = defpackage.ye7.b
            java.lang.Object r3 = r0.j(r3)
            xe7 r3 = (defpackage.xe7) r3
            s47 r3 = r3.l
            pq r2 = r2.a(r3)
            py0 r3 = defpackage.j31.a
            nq6 r4 = defpackage.vt0.a
            java.lang.Object r4 = r0.j(r4)
            ut0 r4 = (defpackage.ut0) r4
            long r4 = r4.b()
            kt0 r6 = new kt0
            r6.<init>(r4)
            pq r3 = r3.a(r6)
            pq[] r2 = new defpackage.pq[]{r2, r3}
            bc r3 = new bc
            r3.<init>(r1, r7)
            r1 = -1157798543(0xffffffffbafd6571, float:-0.00193326)
            zv0 r1 = defpackage.n16.I(r1, r3, r0)
            r3 = 56
            defpackage.hv.e(r2, r1, r0, r3)
            r1 = 0
            r0.p(r1)
        L24f:
            r1 = 1
            goto L25c
        L251:
            r1 = 0
            r2 = -421081940(0xffffffffe6e6ccac, float:-5.449599E23)
            r0.b0(r2)
            r0.p(r1)
            goto L24f
        L25c:
            r0.p(r1)
            r4 = r11
            r5 = r12
            r9 = r15
            r11 = r17
            r12 = r18
            r13 = r19
            r14 = r20
            r15 = r21
            goto L27d
        L26d:
            r0 = r2
            r0.V()
            r4 = r12
            r12 = r5
            r5 = r4
            r4 = r32
            r9 = r37
            r13 = r41
            r15 = r43
            r14 = r10
        L27d:
            cf5 r0 = r0.t()
            if (r0 == 0) goto L2a5
            r1 = r0
            uo4 r0 = new uo4
            r20 = 1
            r2 = r30
            r3 = r31
            r6 = r34
            r8 = r36
            r10 = r38
            r16 = r44
            r17 = r46
            r18 = r47
            r19 = r48
            r27 = r1
            r1 = r29
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            r1 = r27
            r1.d = r0
        L2a5:
            return
    }

    public static final void d(boolean r17, defpackage.eo2 r18, defpackage.px0 r19, int r20) {
            r0 = r17
            r1 = r18
            r2 = r20
            r7 = r19
            xq2 r7 = (defpackage.xq2) r7
            r3 = -642000585(0xffffffffd9bbd937, float:-6.6093314E15)
            r7.d0(r3)
            r3 = r2 & 6
            r9 = 4
            if (r3 != 0) goto L20
            boolean r3 = r7.g(r0)
            if (r3 == 0) goto L1d
            r3 = r9
            goto L1e
        L1d:
            r3 = 2
        L1e:
            r3 = r3 | r2
            goto L21
        L20:
            r3 = r2
        L21:
            r4 = r2 & 48
            r5 = 16
            if (r4 != 0) goto L32
            boolean r4 = r7.h(r1)
            if (r4 == 0) goto L30
            r4 = 32
            goto L31
        L30:
            r4 = r5
        L31:
            r3 = r3 | r4
        L32:
            r4 = r3 & 19
            r6 = 18
            r10 = 0
            if (r4 == r6) goto L3b
            r4 = 1
            goto L3c
        L3b:
            r4 = r10
        L3c:
            r6 = r3 & 1
            boolean r4 = r7.S(r6, r4)
            if (r4 == 0) goto L140
            id4 r4 = defpackage.ay3.a(r7)
            if (r4 != 0) goto L58
            r4 = 1512740606(0x5a2a96fe, float:1.2004191E16)
            r7.b0(r4)
            jl4 r4 = defpackage.by3.a(r7)
        L54:
            r7.p(r10)
            goto L5f
        L58:
            r6 = 1512737723(0x5a2a8bbb, float:1.2001095E16)
            r7.b0(r6)
            goto L54
        L5f:
            if (r4 == 0) goto L13a
            boolean r6 = r7.f(r4)
            java.lang.Object r11 = r7.P()
            vs0 r12 = defpackage.ox0.a
            if (r6 != 0) goto L6f
            if (r11 != r12) goto L98
        L6f:
            e00 r11 = new e00
            boolean r6 = r4 instanceof defpackage.id4
            r13 = 0
            if (r6 == 0) goto L7a
            r6 = r4
            id4 r6 = (defpackage.id4) r6
            goto L7b
        L7a:
            r6 = r13
        L7b:
            if (r6 == 0) goto L82
            eb r6 = r6.a()
            goto L83
        L82:
            r6 = r13
        L83:
            boolean r14 = r4 instanceof defpackage.jl4
            if (r14 == 0) goto L8b
            r14 = r4
            jl4 r14 = (defpackage.jl4) r14
            goto L8c
        L8b:
            r14 = r13
        L8c:
            if (r14 == 0) goto L92
            il4 r13 = r14.b()
        L92:
            r11.<init>(r6, r13)
            r7.l0(r11)
        L98:
            e00 r11 = (defpackage.e00) r11
            java.lang.Object r6 = r7.P()
            if (r6 != r12) goto La7
            w61 r6 = defpackage.mb3.w(r7)
            r7.l0(r6)
        La7:
            w61 r6 = (defpackage.w61) r6
            long r13 = r7.T
            boolean r15 = r7.f(r11)
            boolean r16 = r7.e(r13)
            r15 = r15 | r16
            java.lang.Object r8 = r7.P()
            if (r15 != 0) goto Lbd
            if (r8 != r12) goto Lca
        Lbd:
            ax0 r8 = new ax0
            u05 r15 = new u05
            r15.<init>(r13, r4)
            r8.<init>(r6, r15)
            r7.l0(r8)
        Lca:
            r4 = r8
            ax0 r4 = (defpackage.ax0) r4
            r6 = -348514256(0xffffffffeb3a1830, float:-2.2497442E26)
            r7.b0(r6)
            boolean r6 = r7.h(r4)
            boolean r8 = r7.h(r1)
            r6 = r6 | r8
            java.lang.Object r8 = r7.P()
            if (r6 != 0) goto Le4
            if (r8 != r12) goto Lec
        Le4:
            ci2 r8 = new ci2
            r8.<init>(r5, r4, r1)
            r7.l0(r8)
        Lec:
            on2 r8 = (defpackage.on2) r8
            defpackage.mb3.n(r8, r7)
            r5 = r3
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            boolean r6 = r7.h(r4)
            r8 = r5 & 14
            if (r8 != r9) goto L100
            r5 = 1
            goto L101
        L100:
            r5 = r10
        L101:
            r5 = r5 | r6
            java.lang.Object r6 = r7.P()
            if (r5 != 0) goto L10a
            if (r6 != r12) goto L112
        L10a:
            g00 r6 = new g00
            r6.<init>(r4, r0, r9)
            r7.l0(r6)
        L112:
            qn2 r6 = (defpackage.qn2) r6
            r5 = 0
            defpackage.xk2.b(r3, r4, r5, r6, r7, r8)
            boolean r3 = r7.h(r11)
            boolean r5 = r7.h(r4)
            r3 = r3 | r5
            java.lang.Object r5 = r7.P()
            if (r3 != 0) goto L129
            if (r5 != r12) goto L131
        L129:
            qk4 r5 = new qk4
            r5.<init>(r9, r11, r4)
            r7.l0(r5)
        L131:
            qn2 r5 = (defpackage.qn2) r5
            defpackage.mb3.e(r11, r4, r5, r7)
            r7.p(r10)
            goto L143
        L13a:
            java.lang.String r0 = "No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two."
            defpackage.i.m(r0)
            return
        L140:
            r7.V()
        L143:
            cf5 r3 = r7.t()
            if (r3 == 0) goto L150
            h00 r4 = new h00
            r4.<init>(r0, r1, r2)
            r3.d = r4
        L150:
            return
    }

    public static final void e(defpackage.mi6 r8, defpackage.px0 r9, int r10) {
            r8.getClass()
            r5 = r9
            xq2 r5 = (defpackage.xq2) r5
            r9 = -43957353(0xfffffffffd614397, float:-1.8714203E37)
            r5.d0(r9)
            boolean r9 = r5.f(r8)
            r0 = 2
            r1 = 4
            if (r9 == 0) goto L16
            r9 = r1
            goto L17
        L16:
            r9 = r0
        L17:
            r9 = r9 | r10
            r2 = r9 & 3
            r3 = 0
            r4 = 1
            if (r2 == r0) goto L20
            r0 = r4
            goto L21
        L20:
            r0 = r3
        L21:
            r2 = r9 & 1
            boolean r0 = r5.S(r2, r0)
            if (r0 == 0) goto L9a
            vs4 r0 = r8.a
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L45
            cf5 r9 = r5.t()
            if (r9 == 0) goto Laa
            ki6 r0 = new ki6
            r0.<init>(r8, r10, r3)
        L42:
            r9.d = r0
            return
        L45:
            vs4 r0 = r8.b
            java.lang.Object r0 = r0.getValue()
            li6 r0 = (defpackage.li6) r0
            if (r0 != 0) goto L5b
            cf5 r9 = r5.t()
            if (r9 == 0) goto Laa
            ki6 r0 = new ki6
            r0.<init>(r8, r10, r4)
            goto L42
        L5b:
            r2 = r0
            java.lang.String r0 = r2.a
            r6 = 14
            r9 = r9 & r6
            if (r9 != r1) goto L64
            r3 = r4
        L64:
            java.lang.Object r9 = r5.P()
            if (r3 != 0) goto L6e
            vs0 r1 = defpackage.ox0.a
            if (r9 != r1) goto L76
        L6e:
            ji6 r9 = new ji6
            r9.<init>(r8, r4)
            r5.l0(r9)
        L76:
            r1 = r9
            on2 r1 = (defpackage.on2) r1
            l4 r9 = new l4
            r9.<init>(r6, r2, r8)
            r2 = 497074786(0x1da0c262, float:4.2552634E-21)
            zv0 r2 = defpackage.n16.I(r2, r9, r5)
            ki6 r9 = new ki6
            r9.<init>(r8)
            r3 = 367337888(0x15e521a0, float:9.2545414E-26)
            zv0 r3 = defpackage.n16.I(r3, r9, r5)
            r6 = 3456(0xd80, float:4.843E-42)
            r7 = 16
            r4 = 0
            defpackage.q60.a(r0, r1, r2, r3, r4, r5, r6, r7)
            goto L9d
        L9a:
            r5.V()
        L9d:
            cf5 r9 = r5.t()
            if (r9 == 0) goto Laa
            ki6 r0 = new ki6
            r1 = 3
            r0.<init>(r8, r10, r1)
            goto L42
        Laa:
            return
    }

    public static final long f(int r4, int r5) {
            if (r4 < 0) goto L5
            if (r5 < 0) goto L5
            goto L23
        L5:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "start and end cannot be negative. [start: "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r1 = ", end: "
            r0.append(r1)
            r0.append(r5)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            defpackage.q53.a(r0)
        L23:
            long r0 = (long) r4
            r4 = 32
            long r0 = r0 << r4
            long r4 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            long r4 = r4 | r0
            int r0 = defpackage.k47.c
            return r4
    }

    public static final long g(float r4, float r5) {
            int r4 = java.lang.Float.floatToRawIntBits(r4)
            long r0 = (long) r4
            int r4 = java.lang.Float.floatToRawIntBits(r5)
            long r4 = (long) r4
            r2 = 32
            long r0 = r0 << r2
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r4 = r4 & r2
            long r4 = r4 | r0
            int r0 = defpackage.i97.c
            return r4
    }

    public static final void h(defpackage.j97 r13, defpackage.s43 r14, defpackage.lo4 r15, defpackage.r43 r16, defpackage.zb r17, long r18) {
            r1 = r17
            java.lang.Object r2 = r1.L
            ca4 r2 = (defpackage.ca4) r2
            long r3 = r14.c
            r5 = 32
            long r3 = r3 >> r5
            int r3 = (int) r3
            float r3 = java.lang.Float.intBitsToFloat(r3)
            long r6 = r14.c
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            int r4 = (int) r6
            float r4 = java.lang.Float.intBitsToFloat(r4)
            boolean r6 = k(r14)
            r7 = 0
            if (r6 == 0) goto L29
            r1.B = r7
            r2.d()
        L29:
            boolean r6 = i(r14)
            r10 = 0
            if (r6 != 0) goto L85
            boolean r6 = k(r14)
            if (r6 != 0) goto L85
            int r3 = r2.b
            r4 = 3
            if (r3 != r4) goto L45
            int r3 = r1.B
            int r6 = r3 + 1
            r1.B = r6
            r2.n(r3, r14)
            goto L48
        L45:
            r2.a(r14)
        L48:
            int r3 = r1.B
            if (r3 != r4) goto L4e
            r1.B = r7
        L4e:
            java.lang.Object[] r1 = r2.a
            int r3 = r2.b
            r4 = r7
            r6 = r10
        L54:
            if (r4 >= r3) goto L66
            r11 = r1[r4]
            s43 r11 = (defpackage.s43) r11
            long r11 = r11.c
            long r11 = r11 >> r5
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            float r6 = r6 + r11
            int r4 = r4 + 1
            goto L54
        L66:
            int r1 = r2.b
            float r3 = (float) r1
            float r3 = r6 / r3
            java.lang.Object[] r4 = r2.a
            r6 = r10
        L6e:
            if (r7 >= r1) goto L80
            r11 = r4[r7]
            s43 r11 = (defpackage.s43) r11
            long r11 = r11.c
            long r11 = r11 & r8
            int r11 = (int) r11
            float r11 = java.lang.Float.intBitsToFloat(r11)
            float r6 = r6 + r11
            int r7 = r7 + 1
            goto L6e
        L80:
            int r1 = r2.b
            float r1 = (float) r1
            float r4 = r6 / r1
        L85:
            int r1 = java.lang.Float.floatToRawIntBits(r3)
            long r1 = (long) r1
            int r3 = java.lang.Float.floatToRawIntBits(r4)
            long r3 = (long) r3
            long r1 = r1 << r5
            long r3 = r3 & r8
            long r1 = r1 | r3
            if (r15 != 0) goto L95
            goto Lcd
        L95:
            r3 = r16
            int r3 = r3.a
            r4 = 1
            if (r3 != r4) goto La3
            long r1 = r1 >> r5
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
            goto Lac
        La3:
            r4 = 2
            if (r3 != r4) goto Lcd
            long r1 = r1 & r8
            int r1 = (int) r1
            float r1 = java.lang.Float.intBitsToFloat(r1)
        Lac:
            lo4 r2 = defpackage.lo4.Horizontal
            if (r15 != r2) goto Lbf
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            int r2 = java.lang.Float.floatToRawIntBits(r10)
            long r2 = (long) r2
            long r0 = r0 << r5
            long r2 = r2 & r8
            long r1 = r0 | r2
            goto Lcd
        Lbf:
            int r0 = java.lang.Float.floatToRawIntBits(r10)
            long r2 = (long) r0
            int r0 = java.lang.Float.floatToRawIntBits(r1)
            long r0 = (long) r0
            long r2 = r2 << r5
            long r0 = r0 & r8
            long r1 = r2 | r0
        Lcd:
            long r3 = r14.b
            r5 = r18
            long r0 = defpackage.jk4.f(r1, r5)
            java.lang.Object r13 = r13.B
            bg1 r13 = (defpackage.bg1) r13
            r13.e(r3, r0)
            return
    }

    public static final boolean i(defpackage.s43 r1) {
            boolean r0 = r1.h
            if (r0 == 0) goto La
            boolean r1 = r1.d
            if (r1 != 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static final void j(java.util.logging.Logger r1, defpackage.lz6 r2, defpackage.pz6 r3, java.lang.String r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r3.b
            r0.append(r3)
            r3 = 32
            r0.append(r3)
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r4, r3)
            java.lang.String r4 = "%-22s"
            java.lang.String r3 = java.lang.String.format(r4, r3)
            r0.append(r3)
            java.lang.String r3 = ": "
            r0.append(r3)
            java.lang.String r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r1.fine(r2)
            return
    }

    public static final boolean k(defpackage.s43 r1) {
            boolean r0 = r1.h
            if (r0 != 0) goto La
            boolean r1 = r1.d
            if (r1 == 0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }

    public static final boolean l(defpackage.vh2 r4, boolean r5) {
            sh2 r0 = r4.W0()
            int[] r1 = defpackage.wh2.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L36
            r2 = 2
            if (r0 == r2) goto L35
            r2 = 3
            r3 = 0
            if (r0 == r2) goto L1e
            r4 = 4
            if (r0 != r4) goto L1a
            goto L36
        L1a:
            defpackage.i.d()
            return r3
        L1e:
            vh2 r0 = defpackage.yh2.t(r4)
            if (r0 == 0) goto L29
            boolean r5 = l(r0, r5)
            goto L2a
        L29:
            r5 = r1
        L2a:
            if (r5 == 0) goto L34
            sh2 r5 = defpackage.sh2.ActiveParent
            sh2 r0 = defpackage.sh2.Inactive
            r4.S0(r5, r0)
            return r1
        L34:
            return r3
        L35:
            return r5
        L36:
            return r1
    }

    public static final long m(int r5, long r6) {
            int r0 = defpackage.k47.c
            r0 = 32
            long r0 = r6 >> r0
            int r0 = (int) r0
            r1 = 0
            if (r0 >= 0) goto Lc
            r2 = r1
            goto Ld
        Lc:
            r2 = r0
        Ld:
            if (r2 <= r5) goto L10
            r2 = r5
        L10:
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r3 = r3 & r6
            int r3 = (int) r3
            if (r3 >= 0) goto L1a
            goto L1b
        L1a:
            r1 = r3
        L1b:
            if (r1 <= r5) goto L1e
            goto L1f
        L1e:
            r5 = r1
        L1f:
            if (r2 != r0) goto L25
            if (r5 == r3) goto L24
            goto L25
        L24:
            return r6
        L25:
            long r5 = f(r2, r5)
            return r5
    }

    public static defpackage.ve1 n(long r7, long r9, defpackage.px0 r11, int r12, int r13) {
            r12 = r13 & 1
            if (r12 == 0) goto L13
            nq6 r7 = defpackage.vt0.a
            r8 = r11
            xq2 r8 = (defpackage.xq2) r8
            java.lang.Object r7 = r8.j(r7)
            ut0 r7 = (defpackage.ut0) r7
            long r7 = r7.i()
        L13:
            r1 = r7
            r7 = r13 & 2
            if (r7 == 0) goto L2e
            nq6 r7 = defpackage.vt0.a
            r8 = r11
            xq2 r8 = (defpackage.xq2) r8
            java.lang.Object r7 = r8.j(r7)
            ut0 r7 = (defpackage.ut0) r7
            long r7 = r7.f()
            r9 = 1058642330(0x3f19999a, float:0.6)
            long r9 = defpackage.kt0.c(r9, r7)
        L2e:
            r3 = r9
            nq6 r7 = defpackage.vt0.a
            r8 = r11
            xq2 r8 = (defpackage.xq2) r8
            java.lang.Object r9 = r8.j(r7)
            ut0 r9 = (defpackage.ut0) r9
            long r9 = r9.f()
            py0 r12 = defpackage.j31.a
            java.lang.Object r12 = r8.j(r12)
            kt0 r12 = (defpackage.kt0) r12
            long r12 = r12.a
            java.lang.Object r7 = r8.j(r7)
            ut0 r7 = (defpackage.ut0) r7
            boolean r7 = r7.k()
            if (r7 == 0) goto L58
            defpackage.hv.N(r12)
            goto L5b
        L58:
            defpackage.hv.N(r12)
        L5b:
            r7 = 1052938076(0x3ec28f5c, float:0.38)
            long r5 = defpackage.kt0.c(r7, r9)
            r7 = r11
            xq2 r7 = (defpackage.xq2) r7
            boolean r7 = r7.e(r1)
            r8 = r11
            xq2 r8 = (defpackage.xq2) r8
            boolean r8 = r8.e(r3)
            r7 = r7 | r8
            r8 = r11
            xq2 r8 = (defpackage.xq2) r8
            boolean r8 = r8.e(r5)
            r7 = r7 | r8
            xq2 r11 = (defpackage.xq2) r11
            java.lang.Object r8 = r11.P()
            if (r7 != 0) goto L85
            vs0 r7 = defpackage.ox0.a
            if (r8 != r7) goto L8e
        L85:
            ve1 r0 = new ve1
            r0.<init>(r1, r3, r5)
            r11.l0(r0)
            r8 = r0
        L8e:
            ve1 r8 = (defpackage.ve1) r8
            return r8
    }

    public static final void o(defpackage.nc4 r3, defpackage.ar0 r4, java.util.Map r5, defpackage.zv0 r6) {
            vw0 r0 = new vw0
            rd4 r1 = r3.g
            r1.getClass()
            java.lang.Class<uw0> r2 = defpackage.uw0.class
            java.lang.String r2 = defpackage.xk2.o(r2)
            qd4 r1 = r1.b(r2)
            uw0 r1 = (defpackage.uw0) r1
            r0.<init>(r1, r4, r5, r6)
            java.util.ArrayList r3 = r3.i
            ic4 r4 = r0.a()
            r3.add(r4)
            return
    }

    public static final defpackage.gg3 p(java.lang.Class r17, defpackage.gg3... r18) {
            r0 = r17
            r1 = r18
            r0.getClass()
            boolean r2 = r0.isEnum()
            java.lang.Class<cz4> r3 = defpackage.cz4.class
            java.lang.Class<cc6> r4 = defpackage.cc6.class
            if (r2 == 0) goto L33
            java.lang.annotation.Annotation r2 = r0.getAnnotation(r4)
            if (r2 != 0) goto L33
            java.lang.annotation.Annotation r2 = r0.getAnnotation(r3)
            if (r2 != 0) goto L33
            java.lang.Object[] r1 = r0.getEnumConstants()
            v52 r2 = new v52
            java.lang.String r0 = r0.getCanonicalName()
            r0.getClass()
            r1.getClass()
            java.lang.Enum[] r1 = (java.lang.Enum[]) r1
            r2.<init>(r0, r1)
            return r2
        L33:
            int r2 = r1.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r1, r2)
            gg3[] r2 = (defpackage.gg3[]) r2
            java.lang.String r5 = "Companion"
            r6 = 1
            r7 = 0
            java.lang.reflect.Field r5 = r0.getDeclaredField(r5)     // Catch: java.lang.Throwable -> L4a
            r5.setAccessible(r6)     // Catch: java.lang.Throwable -> L4a
            java.lang.Object r5 = r5.get(r7)     // Catch: java.lang.Throwable -> L4a
            goto L4b
        L4a:
            r5 = r7
        L4b:
            if (r5 != 0) goto L4f
            r2 = r7
            goto L5a
        L4f:
            int r8 = r2.length
            java.lang.Object[] r2 = java.util.Arrays.copyOf(r2, r8)
            gg3[] r2 = (defpackage.gg3[]) r2
            gg3 r2 = x(r5, r2)
        L5a:
            if (r2 == 0) goto L5d
            return r2
        L5d:
            java.lang.String r2 = r0.getCanonicalName()
            java.lang.String r5 = "INSTANCE"
            r8 = 0
            if (r2 == 0) goto Lb2
            java.lang.String r9 = "java."
            boolean r9 = defpackage.xs6.g0(r2, r9, r8)
            if (r9 != 0) goto Lb2
            java.lang.String r9 = "kotlin."
            boolean r2 = defpackage.xs6.g0(r2, r9, r8)
            if (r2 == 0) goto L77
            goto Lb2
        L77:
            java.lang.reflect.Field[] r2 = r0.getDeclaredFields()
            r2.getClass()
            int r9 = r2.length
            r12 = r7
            r10 = r8
            r11 = r10
        L82:
            if (r10 >= r9) goto Lad
            r13 = r2[r10]
            java.lang.String r14 = r13.getName()
            boolean r14 = defpackage.nb3.k(r14, r5)
            if (r14 == 0) goto Laa
            java.lang.Class r14 = r13.getType()
            boolean r14 = defpackage.nb3.k(r14, r0)
            if (r14 == 0) goto Laa
            int r14 = r13.getModifiers()
            boolean r14 = java.lang.reflect.Modifier.isStatic(r14)
            if (r14 == 0) goto Laa
            if (r11 == 0) goto La8
        La6:
            r12 = r7
            goto Lb0
        La8:
            r11 = r6
            r12 = r13
        Laa:
            int r10 = r10 + 1
            goto L82
        Lad:
            if (r11 != 0) goto Lb0
            goto La6
        Lb0:
            if (r12 != 0) goto Lb4
        Lb2:
            r2 = r7
            goto L103
        Lb4:
            java.lang.Object r2 = r12.get(r7)
            java.lang.reflect.Method[] r9 = r0.getMethods()
            r9.getClass()
            int r10 = r9.length
            r13 = r7
            r11 = r8
            r12 = r11
        Lc3:
            if (r11 >= r10) goto Lf3
            r14 = r9[r11]
            java.lang.String r15 = r14.getName()
            java.lang.String r8 = "serializer"
            boolean r8 = defpackage.nb3.k(r15, r8)
            if (r8 == 0) goto Lef
            java.lang.Class[] r8 = r14.getParameterTypes()
            r8.getClass()
            int r8 = r8.length
            if (r8 != 0) goto Lef
            java.lang.Class r8 = r14.getReturnType()
            java.lang.Class<gg3> r15 = defpackage.gg3.class
            boolean r8 = defpackage.nb3.k(r8, r15)
            if (r8 == 0) goto Lef
            if (r12 == 0) goto Led
        Leb:
            r13 = r7
            goto Lf6
        Led:
            r12 = r6
            r13 = r14
        Lef:
            int r11 = r11 + 1
            r8 = 0
            goto Lc3
        Lf3:
            if (r12 != 0) goto Lf6
            goto Leb
        Lf6:
            if (r13 != 0) goto Lf9
            goto Lb2
        Lf9:
            java.lang.Object r2 = r13.invoke(r2, r7)
            boolean r8 = r2 instanceof defpackage.gg3
            if (r8 == 0) goto Lb2
            gg3 r2 = (defpackage.gg3) r2
        L103:
            if (r2 == 0) goto L106
            return r2
        L106:
            int r2 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r2)
            gg3[] r1 = (defpackage.gg3[]) r1
            java.lang.reflect.Field[] r2 = r0.getDeclaredFields()
            r2.getClass()
            int r8 = r2.length
            r9 = 0
        L116:
            if (r9 >= r8) goto L134
            r10 = r2[r9]
            int r11 = r10.getModifiers()
            boolean r11 = java.lang.reflect.Modifier.isStatic(r11)
            if (r11 == 0) goto L131
            java.lang.Class r11 = r10.getType()
            java.lang.Class<nb4> r12 = defpackage.nb4.class
            java.lang.annotation.Annotation r11 = r11.getAnnotation(r12)
            if (r11 == 0) goto L131
            goto L135
        L131:
            int r9 = r9 + 1
            goto L116
        L134:
            r10 = r7
        L135:
            if (r10 != 0) goto L139
        L137:
            r2 = r7
            goto L140
        L139:
            r10.setAccessible(r6)     // Catch: java.lang.Throwable -> L137
            java.lang.Object r2 = r10.get(r7)     // Catch: java.lang.Throwable -> L137
        L140:
            if (r2 == 0) goto L150
            int r8 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r8)
            gg3[] r1 = (defpackage.gg3[]) r1
            gg3 r1 = x(r2, r1)
            if (r1 == 0) goto L150
            goto L18f
        L150:
            java.lang.Class[] r1 = r0.getDeclaredClasses()     // Catch: java.lang.NoSuchFieldException -> L18e
            r1.getClass()     // Catch: java.lang.NoSuchFieldException -> L18e
            int r2 = r1.length     // Catch: java.lang.NoSuchFieldException -> L18e
            r9 = r7
            r8 = 0
            r16 = 0
        L15c:
            if (r8 >= r2) goto L176
            r10 = r1[r8]     // Catch: java.lang.NoSuchFieldException -> L18e
            java.lang.String r11 = r10.getSimpleName()     // Catch: java.lang.NoSuchFieldException -> L18e
            java.lang.String r12 = "$serializer"
            boolean r11 = r11.equals(r12)     // Catch: java.lang.NoSuchFieldException -> L18e
            if (r11 == 0) goto L173
            if (r16 == 0) goto L170
        L16e:
            r9 = r7
            goto L179
        L170:
            r16 = r6
            r9 = r10
        L173:
            int r8 = r8 + 1
            goto L15c
        L176:
            if (r16 != 0) goto L179
            goto L16e
        L179:
            if (r9 == 0) goto L186
            java.lang.reflect.Field r1 = r9.getField(r5)     // Catch: java.lang.NoSuchFieldException -> L18e
            if (r1 == 0) goto L186
            java.lang.Object r1 = r1.get(r7)     // Catch: java.lang.NoSuchFieldException -> L18e
            goto L187
        L186:
            r1 = r7
        L187:
            boolean r2 = r1 instanceof defpackage.gg3     // Catch: java.lang.NoSuchFieldException -> L18e
            if (r2 == 0) goto L18e
            gg3 r1 = (defpackage.gg3) r1     // Catch: java.lang.NoSuchFieldException -> L18e
            goto L18f
        L18e:
            r1 = r7
        L18f:
            if (r1 == 0) goto L192
            return r1
        L192:
            java.lang.annotation.Annotation r1 = r0.getAnnotation(r3)
            if (r1 == 0) goto L199
            goto L1b5
        L199:
            java.lang.annotation.Annotation r1 = r0.getAnnotation(r4)
            cc6 r1 = (defpackage.cc6) r1
            if (r1 == 0) goto L1be
            java.lang.Class r1 = r1.with()
            ar0 r1 = defpackage.gh5.a(r1)
            java.lang.Class<fz4> r2 = defpackage.fz4.class
            ar0 r2 = defpackage.gh5.a(r2)
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L1be
        L1b5:
            fz4 r7 = new fz4
            ar0 r0 = defpackage.gh5.a(r0)
            r7.<init>(r0)
        L1be:
            return r7
    }

    public static defpackage.lk5 q(java.lang.String r8, defpackage.n34 r9) {
            java.nio.charset.Charset r0 = defpackage.qm0.a
            if (r9 == 0) goto L23
            java.nio.charset.Charset r1 = defpackage.n34.a(r9)
            if (r1 != 0) goto L22
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r9)
            java.lang.String r9 = "; charset=utf-8"
            r1.append(r9)
            java.lang.String r9 = r1.toString()
            n34 r9 = defpackage.xk2.k(r9)     // Catch: java.lang.IllegalArgumentException -> L20
            goto L23
        L20:
            r9 = 0
            goto L23
        L22:
            r0 = r1
        L23:
            byte[] r8 = r8.getBytes(r0)
            r8.getClass()
            int r0 = r8.length
            int r1 = r8.length
            long r2 = (long) r1
            r4 = 0
            long r6 = (long) r0
            defpackage.yy7.a(r2, r4, r6)
            lk5 r1 = new lk5
            r1.<init>(r9, r0, r8)
            return r1
    }

    public static defpackage.q60 r(int r1) {
            if (r1 == 0) goto L11
            r0 = 1
            if (r1 == r0) goto Lb
            a26 r1 = new a26
            r1.<init>()
            return r1
        Lb:
            m81 r1 = new m81
            r1.<init>()
            return r1
        L11:
            a26 r1 = new a26
            r1.<init>()
            return r1
    }

    public static final java.lang.String s(long r18) {
            r0 = -999500000(0xffffffffc46cd720, double:NaN)
            int r0 = (r18 > r0 ? 1 : (r18 == r0 ? 0 : -1))
            java.lang.String r1 = " s "
            r2 = 1000000000(0x3b9aca00, double:4.94065646E-315)
            r4 = 500000000(0x1dcd6500, double:2.47032823E-315)
            if (r0 > 0) goto L1c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r4 = r18 - r4
            long r4 = r4 / r2
            java.lang.String r0 = defpackage.lb1.p(r0, r4, r1)
            goto L85
        L1c:
            r6 = -999500(0xfffffffffff0bfb4, double:NaN)
            int r0 = (r18 > r6 ? 1 : (r18 == r6 ? 0 : -1))
            java.lang.String r6 = " ms"
            r7 = 1000000(0xf4240, double:4.940656E-318)
            r9 = 500000(0x7a120, double:2.47033E-318)
            if (r0 > 0) goto L38
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r18 - r9
            long r1 = r1 / r7
            java.lang.String r0 = defpackage.lb1.p(r0, r1, r6)
            goto L85
        L38:
            r11 = 0
            int r0 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
            java.lang.String r11 = " µs"
            r12 = 1000(0x3e8, double:4.94E-321)
            r14 = 500(0x1f4, double:2.47E-321)
            if (r0 > 0) goto L51
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r18 - r14
            long r1 = r1 / r12
            java.lang.String r0 = defpackage.lb1.p(r0, r1, r11)
            goto L85
        L51:
            r16 = 999500(0xf404c, double:4.938186E-318)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L65
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r18 + r14
            long r1 = r1 / r12
            java.lang.String r0 = defpackage.lb1.p(r0, r1, r11)
            goto L85
        L65:
            r11 = 999500000(0x3b9328e0, double:4.93818613E-315)
            int r0 = (r18 > r11 ? 1 : (r18 == r11 ? 0 : -1))
            if (r0 >= 0) goto L79
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r1 = r18 + r9
            long r1 = r1 / r7
            java.lang.String r0 = defpackage.lb1.p(r0, r1, r6)
            goto L85
        L79:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            long r4 = r18 + r4
            long r4 = r4 / r2
            java.lang.String r0 = defpackage.lb1.p(r0, r4, r1)
        L85:
            r1 = 1
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
            java.lang.String r1 = "%6s"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }

    public static final defpackage.j26 t(defpackage.x24 r1) {
            java.lang.Object r1 = r1.B()
            boolean r0 = r1 instanceof defpackage.j26
            if (r0 == 0) goto Lb
            j26 r1 = (defpackage.j26) r1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static final float v(defpackage.j26 r0) {
            if (r0 == 0) goto L5
            float r0 = r0.a
            return r0
        L5:
            r0 = 0
            return r0
    }

    public static final boolean w(float[] r49, float[] r50) {
            r0 = r49
            r1 = r50
            int r2 = r0.length
            r3 = 0
            r4 = 16
            if (r2 < r4) goto Ld
            int r2 = r1.length
            if (r2 >= r4) goto L11
        Ld:
            r19 = r3
            goto L1a3
        L11:
            r2 = r0[r3]
            r4 = 1
            r5 = r0[r4]
            r6 = 2
            r7 = r0[r6]
            r8 = 3
            r9 = r0[r8]
            r10 = 4
            r11 = r0[r10]
            r12 = 5
            r13 = r0[r12]
            r14 = 6
            r15 = r0[r14]
            r16 = 7
            r17 = r0[r16]
            r18 = 8
            r19 = r3
            r3 = r0[r18]
            r20 = 9
            r21 = r4
            r4 = r0[r20]
            r22 = 10
            r23 = r0[r22]
            r24 = 11
            r25 = r0[r24]
            r26 = 12
            r27 = r6
            r6 = r0[r26]
            r28 = 13
            r29 = r0[r28]
            r30 = 14
            r31 = r0[r30]
            r32 = 15
            r0 = r0[r32]
            float r33 = r2 * r13
            float r34 = r5 * r11
            float r33 = r33 - r34
            float r34 = r2 * r15
            float r35 = r7 * r11
            float r34 = r34 - r35
            float r35 = r2 * r17
            float r36 = r9 * r11
            float r35 = r35 - r36
            float r36 = r5 * r15
            float r37 = r7 * r13
            float r36 = r36 - r37
            float r37 = r5 * r17
            float r38 = r9 * r13
            float r37 = r37 - r38
            float r38 = r7 * r17
            float r39 = r9 * r15
            float r38 = r38 - r39
            float r39 = r3 * r29
            float r40 = r4 * r6
            float r39 = r39 - r40
            float r40 = r3 * r31
            float r41 = r23 * r6
            float r40 = r40 - r41
            float r41 = r3 * r0
            float r42 = r25 * r6
            float r41 = r41 - r42
            float r42 = r4 * r31
            float r43 = r23 * r29
            float r42 = r42 - r43
            float r43 = r4 * r0
            float r44 = r25 * r29
            float r43 = r43 - r44
            float r44 = r23 * r0
            float r45 = r25 * r31
            float r44 = r44 - r45
            float r45 = r33 * r44
            float r46 = r34 * r43
            float r45 = r45 - r46
            float r46 = r35 * r42
            float r46 = r46 + r45
            float r45 = r36 * r41
            float r45 = r45 + r46
            float r46 = r37 * r40
            float r45 = r45 - r46
            float r46 = r38 * r39
            float r46 = r46 + r45
            r45 = 0
            int r45 = (r46 > r45 ? 1 : (r46 == r45 ? 0 : -1))
            if (r45 != 0) goto Lb5
            goto L199
        Lb5:
            r47 = 1065353216(0x3f800000, float:1.0)
            float r47 = r47 / r46
            float r46 = r13 * r44
            float r48 = r15 * r43
            float r46 = r46 - r48
            float r48 = r17 * r42
            float r48 = r48 + r46
            float r48 = r48 * r47
            r1[r19] = r48
            r46 = r8
            float r8 = -r5
            float r8 = r8 * r44
            float r48 = r7 * r43
            float r48 = r48 + r8
            float r8 = r9 * r42
            float r48 = r48 - r8
            float r48 = r48 * r47
            r1[r21] = r48
            float r8 = r29 * r38
            float r48 = r31 * r37
            float r8 = r8 - r48
            float r48 = r0 * r36
            float r48 = r48 + r8
            float r48 = r48 * r47
            r1[r27] = r48
            float r8 = -r4
            float r8 = r8 * r38
            float r27 = r23 * r37
            float r27 = r27 + r8
            float r8 = r25 * r36
            float r27 = r27 - r8
            float r27 = r27 * r47
            r1[r46] = r27
            float r8 = -r11
            float r27 = r8 * r44
            float r46 = r15 * r41
            float r46 = r46 + r27
            float r27 = r17 * r40
            float r46 = r46 - r27
            float r46 = r46 * r47
            r1[r10] = r46
            float r44 = r44 * r2
            float r10 = r7 * r41
            float r44 = r44 - r10
            float r10 = r9 * r40
            float r10 = r10 + r44
            float r10 = r10 * r47
            r1[r12] = r10
            float r10 = -r6
            float r12 = r10 * r38
            float r27 = r31 * r35
            float r27 = r27 + r12
            float r12 = r0 * r34
            float r27 = r27 - r12
            float r27 = r27 * r47
            r1[r14] = r27
            float r38 = r38 * r3
            float r12 = r23 * r35
            float r38 = r38 - r12
            float r12 = r25 * r34
            float r12 = r12 + r38
            float r12 = r12 * r47
            r1[r16] = r12
            float r11 = r11 * r43
            float r12 = r13 * r41
            float r11 = r11 - r12
            float r17 = r17 * r39
            float r17 = r17 + r11
            float r17 = r17 * r47
            r1[r18] = r17
            float r11 = -r2
            float r11 = r11 * r43
            float r41 = r41 * r5
            float r41 = r41 + r11
            float r9 = r9 * r39
            float r41 = r41 - r9
            float r41 = r41 * r47
            r1[r20] = r41
            float r6 = r6 * r37
            float r9 = r29 * r35
            float r6 = r6 - r9
            float r0 = r0 * r33
            float r0 = r0 + r6
            float r0 = r0 * r47
            r1[r22] = r0
            float r0 = -r3
            float r0 = r0 * r37
            float r35 = r35 * r4
            float r35 = r35 + r0
            float r25 = r25 * r33
            float r35 = r35 - r25
            float r35 = r35 * r47
            r1[r24] = r35
            float r8 = r8 * r42
            float r13 = r13 * r40
            float r13 = r13 + r8
            float r15 = r15 * r39
            float r13 = r13 - r15
            float r13 = r13 * r47
            r1[r26] = r13
            float r2 = r2 * r42
            float r5 = r5 * r40
            float r2 = r2 - r5
            float r7 = r7 * r39
            float r7 = r7 + r2
            float r7 = r7 * r47
            r1[r28] = r7
            float r10 = r10 * r36
            float r29 = r29 * r34
            float r29 = r29 + r10
            float r31 = r31 * r33
            float r29 = r29 - r31
            float r29 = r29 * r47
            r1[r30] = r29
            float r3 = r3 * r36
            float r4 = r4 * r34
            float r3 = r3 - r4
            float r23 = r23 * r33
            float r23 = r23 + r3
            float r23 = r23 * r47
            r1[r32] = r23
        L199:
            if (r45 != 0) goto L19e
            r3 = r21
            goto L1a0
        L19e:
            r3 = r19
        L1a0:
            r0 = r3 ^ 1
            return r0
        L1a3:
            return r19
    }

    public static final defpackage.gg3 x(java.lang.Object r4, defpackage.gg3... r5) {
            int r0 = r5.length     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4d
            r1 = 0
            if (r0 != 0) goto L7
            java.lang.Class[] r0 = new java.lang.Class[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4d
            goto L14
        L7:
            int r0 = r5.length     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4d
            java.lang.Class[] r2 = new java.lang.Class[r0]     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4d
        La:
            if (r1 >= r0) goto L13
            java.lang.Class<gg3> r3 = defpackage.gg3.class
            r2[r1] = r3     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4d
            int r1 = r1 + 1
            goto La
        L13:
            r0 = r2
        L14:
            java.lang.Class r1 = r4.getClass()     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4d
            java.lang.String r2 = "serializer"
            int r3 = r0.length     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4d
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4d
            java.lang.Class[] r0 = (java.lang.Class[]) r0     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4d
            java.lang.reflect.Method r0 = r1.getDeclaredMethod(r2, r0)     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4d
            int r1 = r5.length     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4d
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r5, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4d
            java.lang.Object r4 = r0.invoke(r4, r5)     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4d
            boolean r5 = r4 instanceof defpackage.gg3     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4d
            if (r5 == 0) goto L4d
            gg3 r4 = (defpackage.gg3) r4     // Catch: java.lang.reflect.InvocationTargetException -> L35 java.lang.NoSuchMethodException -> L4d
            return r4
        L35:
            r4 = move-exception
            java.lang.Throwable r5 = r4.getCause()
            if (r5 == 0) goto L4c
            java.lang.reflect.InvocationTargetException r0 = new java.lang.reflect.InvocationTargetException
            java.lang.String r1 = r5.getMessage()
            if (r1 != 0) goto L48
            java.lang.String r1 = r4.getMessage()
        L48:
            r0.<init>(r5, r1)
            throw r0
        L4c:
            throw r4
        L4d:
            r4 = 0
            return r4
    }

    public static final boolean y(defpackage.ar0 r0) {
            r0.getClass()
            java.lang.Class r0 = r0.a()
            r0.getClass()
            boolean r0 = r0.isInterface()
            return r0
    }

    public static final defpackage.ap3 z(defpackage.eo2 r2, defpackage.qn2 r3) {
            bc r0 = new bc
            r1 = 5
            r0.<init>(r1, r2)
            r2 = 1
            defpackage.ge7.p(r2, r3)
            ap3 r2 = new ap3
            r1 = 28
            r2.<init>(r1, r0, r3)
            return r2
    }

    public final android.view.ViewPropertyAnimator u(android.view.View r1, int r2) {
            r0 = this;
            int r0 = r0.a
            switch(r0) {
                case 0: goto L1a;
                case 1: goto Lf;
                default: goto L5;
            }
        L5:
            android.view.ViewPropertyAnimator r0 = r1.animate()
            float r1 = (float) r2
            android.view.ViewPropertyAnimator r0 = r0.translationX(r1)
            return r0
        Lf:
            android.view.ViewPropertyAnimator r0 = r1.animate()
            int r1 = -r2
            float r1 = (float) r1
            android.view.ViewPropertyAnimator r0 = r0.translationX(r1)
            return r0
        L1a:
            android.view.ViewPropertyAnimator r0 = r1.animate()
            float r1 = (float) r2
            android.view.ViewPropertyAnimator r0 = r0.translationY(r1)
            return r0
    }
}
