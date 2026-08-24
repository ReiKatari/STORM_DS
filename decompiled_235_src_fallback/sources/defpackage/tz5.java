package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tz5  reason: default package */
/* loaded from: classes.dex */
public final class tz5 extends defpackage.qo7 {
    public static final defpackage.xh5 L = null;
    public final defpackage.of6 A;
    public final defpackage.of6 B;
    public final defpackage.de5 C;
    public final defpackage.tp6 D;
    public final defpackage.tp6 E;
    public final defpackage.tp6 F;
    public final defpackage.tp6 G;
    public final defpackage.tp6 H;
    public final defpackage.de5 I;
    public final defpackage.tp6 J;
    public final java.util.concurrent.ConcurrentHashMap.KeySetView K;
    public final defpackage.p06 b;
    public final defpackage.kd6 c;
    public final defpackage.kx5 d;
    public final defpackage.wh7 e;
    public final defpackage.yj1 f;
    public final defpackage.fg g;
    public final defpackage.pn5 h;
    public final defpackage.e70 i;
    public final defpackage.db1 j;
    public final defpackage.tp6 k;
    public final defpackage.tp6 l;
    public final defpackage.de5 m;
    public final java.util.LinkedHashSet n;
    public final defpackage.lb6 o;
    public final defpackage.tp6 p;
    public final defpackage.tp6 q;
    public final defpackage.tp6 r;
    public final defpackage.de5 s;
    public final defpackage.de5 t;
    public final defpackage.tp6 u;
    public final defpackage.de5 v;
    public final defpackage.de5 w;
    public final defpackage.of6 x;
    public final defpackage.of6 y;
    public final defpackage.of6 z;

    static {
            xh5 r0 = new xh5
            java.lang.String r1 = "[^\\p{ASCII}]"
            r0.<init>(r1)
            defpackage.tz5.L = r0
            return
    }

    public tz5(defpackage.p06 r24, defpackage.kd6 r25, defpackage.kx5 r26, defpackage.wh7 r27, defpackage.yj1 r28, defpackage.fg r29, defpackage.pn5 r30, defpackage.e70 r31, defpackage.db1 r32) {
            r23 = this;
            r1 = r23
            r0 = r25
            r24.getClass()
            r0.getClass()
            r26.getClass()
            r27.getClass()
            r28.getClass()
            r29.getClass()
            r30.getClass()
            r31.getClass()
            r32.getClass()
            r1.<init>()
            r2 = r24
            r1.b = r2
            r1.c = r0
            r2 = r26
            r1.d = r2
            r2 = r27
            r1.e = r2
            r2 = r28
            r1.f = r2
            r2 = r29
            r1.g = r2
            r2 = r30
            r1.h = r2
            r2 = r31
            r1.i = r2
            r2 = r32
            r1.j = r2
            java.lang.String r2 = ""
            tp6 r2 = defpackage.up6.a(r2)
            r1.k = r2
            zt1 r14 = defpackage.zt1.A
            tp6 r2 = defpackage.up6.a(r14)
            r1.l = r2
            de5 r3 = new de5
            r3.<init>(r2)
            r1.m = r3
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r1.n = r2
            int r2 = defpackage.mb6.a
            lb6 r2 = new lb6
            r15 = 4
            r2.<init>(r15)
            r1.o = r2
            r2 = r0
            ng6 r2 = (defpackage.ng6) r2
            gn6 r0 = r2.s()
            tp6 r0 = defpackage.up6.a(r0)
            r1.p = r0
            android.content.SharedPreferences r0 = r2.b
            java.lang.String r3 = "rom_sorting_order"
            r4 = 0
            java.lang.String r0 = r0.getString(r3, r4)
            if (r0 != 0) goto L8d
            gn6 r0 = r2.s()
            hn6 r0 = r0.getDefaultOrder()
            goto Lb1
        L8d:
            java.util.Locale r3 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = r0.toUpperCase(r3)     // Catch: java.lang.Throwable -> L9b
            r0.getClass()     // Catch: java.lang.Throwable -> L9b
            hn6 r0 = defpackage.hn6.valueOf(r0)     // Catch: java.lang.Throwable -> L9b
            goto La2
        L9b:
            r0 = move-exception
            em5 r3 = new em5
            r3.<init>(r0)
            r0 = r3
        La2:
            gn6 r2 = r2.s()
            hn6 r2 = r2.getDefaultOrder()
            boolean r3 = r0 instanceof defpackage.em5
            if (r3 == 0) goto Laf
            r0 = r2
        Laf:
            hn6 r0 = (defpackage.hn6) r0
        Lb1:
            tp6 r0 = defpackage.up6.a(r0)
            r1.q = r0
            qw5 r10 = defpackage.qw5.ALL
            tp6 r2 = defpackage.up6.a(r10)
            r1.r = r2
            kd6 r2 = r1.c
            ng6 r2 = (defpackage.ng6) r2
            r2.getClass()
            tf6 r3 = new tf6
            r5 = 23
            r3.<init>(r2, r5)
            java.lang.String r5 = "rom_view_mode"
            wp0 r2 = r2.p(r5, r3)
            as0 r3 = defpackage.to7.a(r1)
            kd6 r5 = r1.c
            ng6 r5 = (defpackage.ng6) r5
            n06 r5 = r5.t()
            w31 r6 = defpackage.dh6.a
            de5 r2 = defpackage.f04.R(r2, r3, r6, r5)
            r1.s = r2
            pn5 r2 = r1.h
            pl r2 = (defpackage.pl) r2
            qf4 r2 = r2.b
            vm5 r2 = r2.a
            le2 r2 = r2.A()
            b7 r3 = new b7
            r5 = 14
            r3.<init>(r2, r5)
            as0 r2 = defpackage.to7.a(r1)
            du1 r7 = defpackage.du1.A
            de5 r2 = defpackage.f04.R(r3, r2, r6, r7)
            r1.t = r2
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            tp6 r2 = defpackage.up6.a(r2)
            r1.u = r2
            de5 r3 = new de5
            r3.<init>(r2)
            r1.v = r3
            as0 r2 = defpackage.to7.a(r1)
            pz5 r3 = new pz5
            r7 = 0
            r3.<init>(r1, r4, r7)
            r8 = 3
            defpackage.hv.L(r2, r4, r4, r3, r8)
            pn5 r2 = r1.h
            pl r2 = (defpackage.pl) r2
            qf4 r2 = r2.b
            vm5 r2 = r2.a
            le2 r2 = r2.B()
            b7 r3 = new b7
            r9 = 2
            r3.<init>(r2, r9)
            kd6 r2 = r1.c
            ng6 r2 = (defpackage.ng6) r2
            r2.getClass()
            tf6 r11 = new tf6
            r12 = 26
            r11.<init>(r2, r12)
            java.lang.String r12 = "rom_ra_covers_enabled"
            wp0 r2 = r2.p(r12, r11)
            et r11 = new et
            r11.<init>(r8, r4, r9)
            xf2 r12 = new xf2
            r12.<init>(r3, r2, r11)
            as0 r2 = defpackage.to7.a(r1)
            de5 r2 = defpackage.f04.R(r12, r2, r6, r14)
            r1.w = r2
            m80 r2 = defpackage.m80.DROP_OLDEST
            r3 = 1
            of6 r2 = defpackage.pf6.b(r3, r7, r2, r9)
            r1.x = r2
            r1.y = r2
            of6 r2 = defpackage.bl2.a()
            r1.z = r2
            r1.A = r2
            of6 r2 = defpackage.bl2.a()
            r1.B = r2
            kd6 r2 = r1.c
            ng6 r2 = (defpackage.ng6) r2
            r2.getClass()
            tf6 r6 = new tf6
            r11 = 25
            r6.<init>(r2, r11)
            java.lang.String r11 = "rom_icon_filtering"
            r2.p(r11, r6)
            p06 r2 = r1.b
            xb2 r2 = (defpackage.xb2) r2
            tp6 r2 = r2.l
            de5 r6 = new de5
            r6.<init>(r2)
            r1.C = r6
            r2 = r4
            yt1 r4 = defpackage.yt1.A
            tp6 r6 = defpackage.up6.a(r4)
            r1.D = r6
            tp6 r11 = defpackage.up6.a(r4)
            r1.E = r11
            tp6 r12 = defpackage.up6.a(r4)
            r1.F = r12
            gz5 r12 = defpackage.gz5.a
            java.util.List r12 = defpackage.hf.b0(r12)
            tp6 r12 = defpackage.up6.a(r12)
            r1.G = r12
            r12 = r3
            ss5 r3 = new ss5
            r13 = r9
            n06 r9 = defpackage.n06.GRID
            r16 = r11
            gn6 r11 = defpackage.gn6.ALPHABETICALLY
            r17 = r12
            hn6 r12 = defpackage.hn6.ASCENDING
            r18 = r6
            r6 = 0
            r19 = r7
            r20 = r8
            r8 = 1
            r21 = r5
            r5 = r4
            r22 = r13
            r13 = r4
            r15 = r2
            r2 = r21
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
            tp6 r3 = defpackage.up6.a(r3)
            r1.H = r3
            de5 r5 = new de5
            r5.<init>(r3)
            r1.I = r5
            tp6 r3 = defpackage.up6.a(r4)
            r1.J = r3
            java.util.LinkedHashSet r3 = new java.util.LinkedHashSet
            r3.<init>()
            r1.p()
            as0 r3 = defpackage.to7.a(r1)
            bf4 r4 = new bf4
            r4.<init>(r1, r15, r2)
            r2 = 3
            defpackage.hv.L(r3, r15, r15, r4, r2)
            as0 r3 = defpackage.to7.a(r1)
            dz5 r4 = new dz5
            r5 = 0
            r4.<init>(r1, r15, r5)
            defpackage.hv.L(r3, r15, r15, r4, r2)
            tp6 r3 = r1.p
            rz5 r4 = new rz5
            r4.<init>(r15, r1)
            r6 = 4
            le2[] r6 = new defpackage.le2[r6]
            r6[r5] = r18
            r12 = 1
            r6[r12] = r16
            r6[r22] = r3
            r6[r2] = r0
            wp0 r0 = new wp0
            r2 = 5
            r0.<init>(r2, r6, r4)
            le2 r0 = defpackage.f04.z(r0)
            tp6 r2 = r1.k
            r3 = 200(0xc8, double:9.9E-322)
            le2 r2 = defpackage.f04.x(r2, r3)
            le2 r2 = defpackage.f04.z(r2)
            as0 r3 = defpackage.to7.a(r1)
            vy5 r4 = new vy5
            r5 = 1
            r25 = r0
            r27 = r1
            r26 = r2
            r24 = r4
            r29 = r5
            r28 = r15
            r24.<init>(r25, r26, r27, r28, r29)
            r0 = r24
            r2 = 3
            defpackage.hv.L(r3, r15, r15, r0, r2)
            as0 r0 = defpackage.to7.a(r1)
            dz5 r3 = new dz5
            r3.<init>(r1, r15, r12)
            defpackage.hv.L(r0, r15, r15, r3, r2)
            java.util.concurrent.ConcurrentHashMap$KeySetView r0 = java.util.concurrent.ConcurrentHashMap.newKeySet()
            r1.K = r0
            return
    }

    public static final defpackage.kz5 e(defpackage.tz5 r4, defpackage.pq5 r5, java.lang.String r6) {
            java.lang.String r4 = defpackage.hf.k0(r5)
            java.lang.String r4 = defpackage.ej2.M(r4)
            java.lang.String r0 = r5.a
            java.lang.String r0 = defpackage.ej2.M(r0)
            java.lang.String r1 = r5.c
            java.lang.String r1 = defpackage.ej2.M(r1)
            java.lang.String r2 = r5.b
            java.lang.String r2 = defpackage.ej2.M(r2)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r4)
            java.lang.String r4 = "\u0000"
            r3.append(r4)
            r3.append(r0)
            r3.append(r4)
            r3.append(r1)
            java.lang.String r4 = defpackage.i61.n(r3, r4, r2)
            kz5 r0 = new kz5
            r0.<init>(r5, r6, r4)
            return r0
    }

    public static final java.util.Map f(defpackage.tz5 r8, java.util.ArrayList r9, defpackage.gn6 r10) {
            gn6 r8 = defpackage.gn6.ALPHABETICALLY
            if (r10 == r8) goto L7
            zt1 r8 = defpackage.zt1.A
            return r8
        L7:
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            int r10 = r9.size()
            r0 = 0
            r1 = r0
            r2 = r1
        L13:
            if (r2 >= r10) goto La3
            java.lang.Object r3 = r9.get(r2)
            int r2 = r2 + 1
            int r4 = r1 + 1
            r5 = 0
            if (r1 < 0) goto L9f
            nr5 r3 = (defpackage.nr5) r3
            boolean r6 = r3 instanceof defpackage.mr5
            if (r6 == 0) goto L9c
            mr5 r3 = (defpackage.mr5) r3
            pq5 r3 = r3.a
            java.lang.String r3 = defpackage.hf.k0(r3)
            java.lang.CharSequence r3 = defpackage.qs6.T0(r3)
            java.lang.String r3 = r3.toString()
            java.text.Normalizer$Form r6 = java.text.Normalizer.Form.NFKD
            java.lang.String r3 = java.text.Normalizer.normalize(r3, r6)
            r3.getClass()
            java.lang.String r6 = "\\p{Mn}+"
            java.util.regex.Pattern r6 = java.util.regex.Pattern.compile(r6)
            r6.getClass()
            java.lang.String r7 = ""
            java.util.regex.Matcher r3 = r6.matcher(r3)
            java.lang.String r3 = r3.replaceAll(r7)
            r3.getClass()
            int r6 = r3.length()
            if (r6 != 0) goto L5c
            goto L64
        L5c:
            char r3 = r3.charAt(r0)
            java.lang.Character r5 = java.lang.Character.valueOf(r3)
        L64:
            if (r5 == 0) goto L9c
            char r3 = r5.charValue()
            r5 = 97
            r6 = 91
            r7 = 65
            if (r5 > r3) goto L7a
            r5 = 123(0x7b, float:1.72E-43)
            if (r3 >= r5) goto L7a
            int r3 = r3 + (-32)
            char r3 = (char) r3
            goto L83
        L7a:
            if (r7 > r3) goto L7f
            if (r3 >= r6) goto L7f
            goto L83
        L7f:
            char r3 = java.lang.Character.toUpperCase(r3)
        L83:
            if (r7 > r3) goto L88
            if (r3 >= r6) goto L88
            goto L91
        L88:
            boolean r5 = java.lang.Character.isLetter(r3)
            if (r5 == 0) goto L8f
            goto L91
        L8f:
            r3 = 35
        L91:
            java.lang.Character r3 = java.lang.Character.valueOf(r3)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r8.putIfAbsent(r3, r1)
        L9c:
            r1 = r4
            goto L13
        L9f:
            defpackage.hf.q0()
            throw r5
        La3:
            return r8
    }

    public static final boolean g(defpackage.tz5 r2, defpackage.pq5 r3, defpackage.qw5 r4) {
            boolean r2 = r3.h
            r0 = 0
            if (r2 == 0) goto Lc
            boolean r2 = r3.c()
            if (r2 != 0) goto Lc
            goto L3c
        Lc:
            int[] r2 = defpackage.mz5.b
            int r4 = r4.ordinal()
            r2 = r2[r4]
            r4 = 1
            if (r2 == r4) goto L40
            r1 = 2
            if (r2 == r1) goto L3d
            r1 = 3
            if (r2 == r1) goto L35
            r1 = 4
            if (r2 == r1) goto L30
            r1 = 5
            if (r2 != r1) goto L2c
            java.lang.String r2 = r3.i
            int r2 = r2.length()
            if (r2 <= 0) goto L3c
            goto L40
        L2c:
            defpackage.i.d()
            return r0
        L30:
            boolean r2 = r3.c()
            return r2
        L35:
            boolean r2 = r3.c()
            if (r2 != 0) goto L3c
            goto L40
        L3c:
            return r0
        L3d:
            boolean r2 = r3.k
            return r2
        L40:
            return r4
    }

    public static final defpackage.pq5 h(defpackage.tz5 r47, me.magnum.melonds.domain.model.DSiWareTitle r48) {
            java.lang.String r0 = ""
            long r1 = r48.getTitleId()
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r1 = r1 & r3
            r5 = 16
            defpackage.g04.y(r5)
            java.lang.String r1 = java.lang.Long.toString(r1, r5)
            r1.getClass()
            r2 = 8
            java.lang.String r1 = defpackage.qs6.B0(r2, r1)
            java.util.Locale r6 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r6)
            r1.getClass()
            long r6 = r48.getTitleId()     // Catch: java.lang.Throwable -> L74
            r8 = 24
            long r6 = r6 >> r8
            r8 = 255(0xff, double:1.26E-321)
            long r6 = r6 & r8
            int r6 = (int) r6     // Catch: java.lang.Throwable -> L74
            long r10 = r48.getTitleId()     // Catch: java.lang.Throwable -> L74
            long r10 = r10 >> r5
            long r10 = r10 & r8
            int r7 = (int) r10     // Catch: java.lang.Throwable -> L74
            long r10 = r48.getTitleId()     // Catch: java.lang.Throwable -> L74
            long r10 = r10 >> r2
            long r10 = r10 & r8
            int r10 = (int) r10     // Catch: java.lang.Throwable -> L74
            long r11 = r48.getTitleId()     // Catch: java.lang.Throwable -> L74
            long r8 = r8 & r11
            int r8 = (int) r8     // Catch: java.lang.Throwable -> L74
            r9 = 32
            if (r9 > r6) goto L74
            r11 = 127(0x7f, float:1.78E-43)
            if (r6 >= r11) goto L74
            if (r9 > r7) goto L74
            if (r7 >= r11) goto L74
            if (r9 > r10) goto L74
            if (r10 >= r11) goto L74
            if (r9 > r8) goto L74
            if (r8 >= r11) goto L74
            char r6 = (char) r6     // Catch: java.lang.Throwable -> L74
            char r7 = (char) r7     // Catch: java.lang.Throwable -> L74
            char r9 = (char) r10     // Catch: java.lang.Throwable -> L74
            char r8 = (char) r8     // Catch: java.lang.Throwable -> L74
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
            r10.<init>()     // Catch: java.lang.Throwable -> L74
            r10.append(r6)     // Catch: java.lang.Throwable -> L74
            r10.append(r7)     // Catch: java.lang.Throwable -> L74
            r10.append(r9)     // Catch: java.lang.Throwable -> L74
            r10.append(r8)     // Catch: java.lang.Throwable -> L74
            java.lang.String r6 = r10.toString()     // Catch: java.lang.Throwable -> L74
            goto L75
        L74:
            r6 = r0
        L75:
            java.lang.String r7 = r48.getName()
            boolean r7 = defpackage.qs6.v0(r7)
            if (r7 != 0) goto L92
            java.lang.String r7 = r48.getName()
            r8 = 1
            boolean r7 = defpackage.xs6.Z(r7, r1, r8)
            if (r7 != 0) goto L92
            java.lang.String r6 = r48.getName()
        L8e:
            r8 = r6
            r6 = r47
            goto La6
        L92:
            int r7 = r6.length()
            java.lang.String r8 = ")"
            java.lang.String r9 = "DSiWare ("
            if (r7 <= 0) goto La1
            java.lang.String r6 = defpackage.lb1.A(r9, r6, r8)
            goto L8e
        La1:
            java.lang.String r6 = defpackage.lb1.A(r9, r1, r8)
            goto L8e
        La6:
            db1 r6 = r6.j
            r6.getClass()
            android.content.SharedPreferences r6 = r6.c()
            java.util.Locale r7 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r7)
            r1.getClass()
            java.lang.String r7 = "ra_hash_"
            java.lang.String r1 = r7.concat(r1)
            r7 = 0
            java.lang.String r1 = r6.getString(r1, r7)
            if (r1 == 0) goto Lcc
            boolean r6 = defpackage.qs6.v0(r1)
            if (r6 != 0) goto Lcc
            r7 = r1
        Lcc:
            if (r7 != 0) goto Lcf
            goto Ld0
        Lcf:
            r0 = r7
        Ld0:
            pq5 r1 = new pq5
            java.lang.String r6 = r48.getProducer()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r8)
            java.lang.String r9 = ".nds"
            r7.append(r9)
            java.lang.String r27 = r7.toString()
            long r9 = r48.getTitleId()
            long r9 = r9 & r3
            defpackage.g04.y(r5)
            java.lang.String r5 = java.lang.Long.toString(r9, r5)
            r5.getClass()
            java.lang.String r2 = defpackage.qs6.B0(r2, r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r7 = "dsiware-installed://00030004/"
            r5.<init>(r7)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            android.net.Uri r2 = android.net.Uri.parse(r2)
            r2.getClass()
            jt5 r7 = new jt5
            u26 r29 = defpackage.u26.DSi
            a36 r30 = defpackage.a36.DEFAULT
            nx5 r35 = defpackage.nx5.GLOBAL
            r45 = 0
            r46 = 0
            r31 = 0
            uw5 r32 = defpackage.uw5.o
            r33 = 0
            r34 = 0
            r36 = 0
            r37 = 0
            r38 = 0
            r39 = 0
            r40 = 0
            r41 = 0
            r42 = 0
            r43 = 0
            r44 = 0
            r28 = r7
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            r25 = 0
            r26 = 262127(0x3ffef, float:3.67318E-40)
            r12 = r8
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            jt5 r13 = defpackage.jt5.a(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            long r7 = r48.getTitleId()
            long r3 = r3 & r7
            java.lang.Long r20 = java.lang.Long.valueOf(r3)
            byte[] r21 = r48.getIcon()
            r22 = 1536(0x600, float:2.152E-42)
            r8 = r12
            r12 = 0
            r15 = 1
            r17 = 0
            r19 = 0
            r16 = r0
            r7 = r1
            r11 = r2
            r9 = r6
            r10 = r27
            r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r19, r20, r21, r22)
            return r7
    }

    public static java.lang.String i(defpackage.lz5 r3, java.lang.String r4) {
            java.lang.String r3 = r3.b
            r0 = 58
            java.lang.String r1 = defpackage.qs6.M0(r0, r3, r3)
            java.lang.String r1 = android.net.Uri.decode(r1)
            r1.getClass()
            java.lang.String r0 = defpackage.qs6.M0(r0, r4, r4)
            java.lang.String r0 = android.net.Uri.decode(r0)
            r0.getClass()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L21
            goto L3d
        L21:
            int r3 = r1.length()
            if (r3 <= 0) goto L3d
            java.lang.String r3 = "/"
            java.lang.String r4 = r1.concat(r3)
            r2 = 0
            boolean r4 = defpackage.xs6.g0(r0, r4, r2)
            if (r4 == 0) goto L3d
            java.lang.String r3 = r1.concat(r3)
            java.lang.String r3 = defpackage.qs6.D0(r0, r3)
            return r3
        L3d:
            return r0
    }

    public static java.lang.String k(java.lang.String r3) {
            r0 = 58
            java.lang.String r0 = defpackage.qs6.M0(r0, r3, r3)
            java.lang.String r0 = android.net.Uri.decode(r0)
            r0.getClass()
            r1 = 47
            java.lang.String r1 = defpackage.qs6.O0(r1, r0, r0)
            int r2 = r1.length()
            if (r2 != 0) goto L21
            int r1 = r0.length()
            if (r1 != 0) goto L20
            return r3
        L20:
            return r0
        L21:
            return r1
    }

    public static defpackage.lz5 l(java.lang.String r2, java.util.List r3) {
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r3.next()
            r1 = r0
            lz5 r1 = (defpackage.lz5) r1
            java.lang.String r1 = r1.b
            boolean r1 = o(r2, r1)
            if (r1 == 0) goto L4
            goto L1b
        L1a:
            r0 = 0
        L1b:
            lz5 r0 = (defpackage.lz5) r0
            return r0
    }

    public static java.lang.String m(java.lang.String r3, java.lang.String r4) {
            boolean r0 = defpackage.nb3.k(r3, r4)
            if (r0 == 0) goto L8
            r3 = 0
            return r3
        L8:
            r0 = 47
            r1 = 6
            r2 = 0
            int r0 = defpackage.qs6.x0(r0, r2, r1, r3)
            r1 = -1
            if (r0 != r1) goto L14
            goto L22
        L14:
            java.lang.String r3 = r3.substring(r2, r0)
            int r0 = r3.length()
            int r1 = r4.length()
            if (r0 >= r1) goto L23
        L22:
            return r4
        L23:
            return r3
    }

    public static boolean o(java.lang.String r1, java.lang.String r2) {
            boolean r0 = defpackage.nb3.k(r1, r2)
            if (r0 != 0) goto L20
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "/"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r0 = 0
            boolean r1 = defpackage.xs6.g0(r1, r2, r0)
            if (r1 == 0) goto L1f
            goto L20
        L1f:
            return r0
        L20:
            r1 = 1
            return r1
    }

    public final void j(boolean r3) {
            r2 = this;
            qw5[] r0 = defpackage.qw5.values()
            tp6 r2 = r2.r
            java.lang.Object r1 = r2.getValue()
            int r1 = defpackage.fv.K0(r0, r1)
            if (r1 >= 0) goto L11
            r1 = 0
        L11:
            if (r3 == 0) goto L18
            int r1 = r1 + 1
        L15:
            int r3 = r0.length
            int r1 = r1 % r3
            goto L1d
        L18:
            int r1 = r1 + (-1)
            int r3 = r0.length
            int r1 = r1 + r3
            goto L15
        L1d:
            r3 = r0[r1]
            r2.l(r3)
            return
    }

    public final java.lang.Object n(defpackage.pq5 r7, defpackage.s41 r8) {
            r6 = this;
            boolean r0 = r8 instanceof defpackage.oz5
            if (r0 == 0) goto L13
            r0 = r8
            oz5 r0 = (defpackage.oz5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            oz5 r0 = new oz5
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.oi2.Y(r8)
            goto L4a
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L2e:
            defpackage.oi2.Y(r8)
            r0.Y = r4
            kx5 r8 = r6.d
            r8.getClass()
            xe1 r2 = defpackage.xk1.a
            de1 r2 = defpackage.de1.L
            m5 r4 = new m5
            r5 = 28
            r4.<init>(r7, r8, r3, r5)
            java.lang.Object r8 = defpackage.hv.d0(r2, r4, r0)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            kd6 r6 = r6.c
            ng6 r6 = (defpackage.ng6) r6
            jx5 r6 = r6.q()
            ix5 r7 = new ix5
            r7.<init>(r8, r6)
            return r7
    }

    public final void p() {
            r4 = this;
            as0 r0 = defpackage.to7.a(r4)
            pz5 r1 = new pz5
            r2 = 1
            r3 = 0
            r1.<init>(r4, r3, r2)
            r4 = 3
            defpackage.hv.L(r0, r3, r3, r1, r4)
            return
    }

    public final void q(defpackage.gn6 r8) {
            r7 = this;
            r8.getClass()
            tp6 r0 = r7.p
            java.lang.Object r1 = r0.getValue()
            java.lang.String r2 = "rom_sorting_order"
            kd6 r3 = r7.c
            tp6 r7 = r7.q
            if (r8 != r1) goto L46
            java.lang.Object r8 = r7.getValue()
            hn6 r0 = defpackage.hn6.ASCENDING
            if (r8 != r0) goto L1b
            hn6 r0 = defpackage.hn6.DESCENDING
        L1b:
            java.lang.Object r8 = r7.getValue()
            hn6 r8 = (defpackage.hn6) r8
            ng6 r3 = (defpackage.ng6) r3
            r3.getClass()
            r8.getClass()
            android.content.SharedPreferences r1 = r3.b
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r8 = r8.toString()
            java.util.Locale r3 = java.util.Locale.ROOT
            java.lang.String r8 = r8.toLowerCase(r3)
            r8.getClass()
            r1.putString(r2, r8)
            r1.apply()
            r7.l(r0)
            return
        L46:
            ng6 r3 = (defpackage.ng6) r3
            r3.getClass()
            android.content.SharedPreferences r1 = r3.b
            android.content.SharedPreferences$Editor r1 = r1.edit()
            java.lang.String r4 = r8.toString()
            java.util.Locale r5 = java.util.Locale.ROOT
            java.lang.String r4 = r4.toLowerCase(r5)
            r4.getClass()
            java.lang.String r6 = "rom_sorting_mode"
            r1.putString(r6, r4)
            r1.apply()
            hn6 r1 = r8.getDefaultOrder()
            r3.getClass()
            r1.getClass()
            android.content.SharedPreferences r3 = r3.b
            android.content.SharedPreferences$Editor r3 = r3.edit()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.toLowerCase(r5)
            r1.getClass()
            r3.putString(r2, r1)
            r3.apply()
            r1 = 0
            r0.m(r1, r8)
            hn6 r8 = r8.getDefaultOrder()
            r7.l(r8)
            return
    }

    public final void r() {
            r2 = this;
            de5 r0 = r2.s
            rp6 r0 = r0.A
            java.lang.Object r0 = r0.getValue()
            n06 r0 = (defpackage.n06) r0
            int[] r1 = defpackage.mz5.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L1f
            r1 = 2
            if (r0 != r1) goto L1b
            n06 r0 = defpackage.n06.GRID
            goto L21
        L1b:
            defpackage.i.d()
            return
        L1f:
            n06 r0 = defpackage.n06.LIST
        L21:
            kd6 r2 = r2.c
            ng6 r2 = (defpackage.ng6) r2
            r2.getClass()
            r0.getClass()
            android.content.SharedPreferences r2 = r2.b
            android.content.SharedPreferences$Editor r2 = r2.edit()
            java.lang.String r0 = r0.name()
            java.util.Locale r1 = java.util.Locale.ROOT
            java.lang.String r0 = r0.toLowerCase(r1)
            r0.getClass()
            java.lang.String r1 = "rom_view_mode"
            r2.putString(r1, r0)
            r2.apply()
            return
    }
}
