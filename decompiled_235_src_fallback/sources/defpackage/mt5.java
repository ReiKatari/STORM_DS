package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mt5  reason: default package */
/* loaded from: classes.dex */
public final class mt5 {
    @defpackage.gc6("runtimeConsoleType")
    private final defpackage.u26 a;
    @defpackage.gc6("runtimeMicSource")
    private final defpackage.a36 b;
    @defpackage.gc6("layoutId")
    private final java.lang.String c;
    @defpackage.gc6("gbaSlotConfig")
    private final defpackage.ww5 d;
    @defpackage.gc6("customName")
    private final java.lang.String e;
    @defpackage.gc6(alternate = {"useHgInputWorkaround"}, value = "useHgEngineFix")
    private final java.lang.Boolean f;
    @defpackage.gc6("inputMode")
    private final defpackage.nx5 g;
    @defpackage.gc6("customControllerConfiguration")
    private final defpackage.v41 h;
    @defpackage.gc6("videoRenderer")
    private final me.magnum.melonds.domain.model.VideoRenderer i;
    @defpackage.gc6("threadedRendering")
    private final java.lang.Boolean j;
    @defpackage.gc6("internalResolutionScaling")
    private final java.lang.Integer k;
    @defpackage.gc6("videoFiltering")
    private final me.magnum.melonds.domain.model.VideoFiltering l;
    @defpackage.gc6("retroArchShaderPresetPath")
    private final java.lang.String m;
    @defpackage.gc6("retroArchShaderParameters")
    private final java.lang.String n;
    @defpackage.gc6("retroAchievementsEnabled")
    private final java.lang.Boolean o;
    @defpackage.gc6("dualScreenPreset")
    private final defpackage.jq1 p;
    @defpackage.gc6("dualScreenKeepAspectRatio")
    private final java.lang.Boolean q;
    @defpackage.gc6("dualScreenIntegerScale")
    private final java.lang.Boolean r;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: mt5$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static defpackage.mt5 a(defpackage.jt5 r20) {
                r0 = r20
                r0.getClass()
                u26 r1 = r0.a
                a36 r2 = r0.b
                java.util.UUID r3 = r0.c
                r4 = 0
                if (r3 == 0) goto L13
                java.lang.String r3 = r3.toString()
                goto L14
            L13:
                r3 = r4
            L14:
                hi2 r5 = r0.d
                r5.getClass()
                r6 = r4
                ww5 r4 = new ww5
                uw5 r7 = defpackage.uw5.o
                boolean r7 = r5.equals(r7)
                if (r7 == 0) goto L27
                ww5$b r7 = defpackage.ww5.b.None
                goto L4e
            L27:
                boolean r7 = r5 instanceof defpackage.sw5
                if (r7 == 0) goto L2e
                ww5$b r7 = defpackage.ww5.b.GbaRom
                goto L4e
            L2e:
                vw5 r7 = defpackage.vw5.o
                boolean r7 = r5.equals(r7)
                if (r7 == 0) goto L39
                ww5$b r7 = defpackage.ww5.b.RumblePak
                goto L4e
            L39:
                tw5 r7 = defpackage.tw5.o
                boolean r7 = r5.equals(r7)
                if (r7 == 0) goto L44
                ww5$b r7 = defpackage.ww5.b.MemoryExpansion
                goto L4e
            L44:
                rw5 r7 = defpackage.rw5.o
                boolean r7 = r5.equals(r7)
                if (r7 == 0) goto Lb9
                ww5$b r7 = defpackage.ww5.b.AnalogInput
            L4e:
                boolean r8 = r5 instanceof defpackage.sw5
                if (r8 == 0) goto L56
                r9 = r5
                sw5 r9 = (defpackage.sw5) r9
                goto L57
            L56:
                r9 = r6
            L57:
                if (r9 == 0) goto L62
                android.net.Uri r9 = r9.o
                if (r9 == 0) goto L62
                java.lang.String r9 = r9.toString()
                goto L63
            L62:
                r9 = r6
            L63:
                if (r8 == 0) goto L68
                sw5 r5 = (defpackage.sw5) r5
                goto L69
            L68:
                r5 = r6
            L69:
                if (r5 == 0) goto L74
                android.net.Uri r5 = r5.p
                if (r5 == 0) goto L74
                java.lang.String r5 = r5.toString()
                goto L75
            L74:
                r5 = r6
            L75:
                r4.<init>(r7, r9, r5)
                java.lang.String r5 = r0.e
                boolean r7 = r0.f
                java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
                r8 = r6
                r6 = r7
                nx5 r7 = r0.g
                u41 r9 = r0.h
                if (r9 == 0) goto L91
                v41$b r8 = defpackage.v41.Companion
                r8.getClass()
                v41 r8 = defpackage.v41.b.a(r9)
            L91:
                me.magnum.melonds.domain.model.VideoRenderer r9 = r0.i
                java.lang.Boolean r10 = r0.j
                java.lang.Integer r11 = r0.k
                me.magnum.melonds.domain.model.VideoFiltering r12 = r0.l
                java.lang.String r13 = r0.m
                java.lang.String r14 = r0.n
                java.lang.Boolean r15 = r0.o
                r16 = r1
                jq1 r1 = r0.p
                r17 = r1
                java.lang.Boolean r1 = r0.q
                java.lang.Boolean r0 = r0.r
                r18 = r0
                mt5 r0 = new mt5
                r19 = r17
                r17 = r1
                r1 = r16
                r16 = r19
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
                return r0
            Lb9:
                r8 = r6
                defpackage.i.d()
                return r8
        }
    }

    public mt5(defpackage.u26 r1, defpackage.a36 r2, java.lang.String r3, defpackage.ww5 r4, java.lang.String r5, java.lang.Boolean r6, defpackage.nx5 r7, defpackage.v41 r8, me.magnum.melonds.domain.model.VideoRenderer r9, java.lang.Boolean r10, java.lang.Integer r11, me.magnum.melonds.domain.model.VideoFiltering r12, java.lang.String r13, java.lang.String r14, java.lang.Boolean r15, defpackage.jq1 r16, java.lang.Boolean r17, java.lang.Boolean r18) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            r0.j = r10
            r0.k = r11
            r0.l = r12
            r0.m = r13
            r0.n = r14
            r0.o = r15
            r1 = r16
            r0.p = r1
            r1 = r17
            r0.q = r1
            r1 = r18
            r0.r = r1
            return
    }

    public static defpackage.mt5 a(defpackage.mt5 r19, defpackage.u26 r20) {
            r0 = r19
            a36 r2 = r0.b
            java.lang.String r3 = r0.c
            ww5 r4 = r0.d
            java.lang.String r5 = r0.e
            java.lang.Boolean r6 = r0.f
            nx5 r7 = r0.g
            v41 r8 = r0.h
            me.magnum.melonds.domain.model.VideoRenderer r9 = r0.i
            java.lang.Boolean r10 = r0.j
            java.lang.Integer r11 = r0.k
            me.magnum.melonds.domain.model.VideoFiltering r12 = r0.l
            java.lang.String r13 = r0.m
            java.lang.String r14 = r0.n
            java.lang.Boolean r15 = r0.o
            jq1 r1 = r0.p
            r16 = r1
            java.lang.Boolean r1 = r0.q
            r17 = r1
            java.lang.Boolean r1 = r0.r
            r0.getClass()
            r20.getClass()
            r2.getClass()
            r4.getClass()
            mt5 r0 = new mt5
            r18 = r1
            r1 = r20
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
    }

    public final defpackage.jt5 b() {
            r20 = this;
            r0 = r20
            u26 r1 = r0.a
            a36 r2 = r0.b
            java.lang.String r3 = r0.c
            r4 = 0
            if (r3 == 0) goto L10
            java.util.UUID r3 = java.util.UUID.fromString(r3)
            goto L11
        L10:
            r3 = r4
        L11:
            ww5 r5 = r0.d
            hi2 r5 = r5.a()
            r6 = r4
            r4 = r5
            java.lang.String r5 = r0.e
            java.lang.Boolean r7 = r0.f
            if (r7 == 0) goto L24
            boolean r7 = r7.booleanValue()
            goto L25
        L24:
            r7 = 0
        L25:
            nx5 r8 = r0.g
            if (r8 != 0) goto L2b
            nx5 r8 = defpackage.nx5.GLOBAL
        L2b:
            v41 r9 = r0.h
            if (r9 == 0) goto L33
            u41 r6 = r9.a()
        L33:
            me.magnum.melonds.domain.model.VideoRenderer r9 = r0.i
            java.lang.Boolean r10 = r0.j
            java.lang.Integer r11 = r0.k
            me.magnum.melonds.domain.model.VideoFiltering r12 = r0.l
            java.lang.String r13 = r0.m
            java.lang.String r14 = r0.n
            java.lang.Boolean r15 = r0.o
            r16 = r1
            jq1 r1 = r0.p
            r17 = r1
            java.lang.Boolean r1 = r0.q
            java.lang.Boolean r0 = r0.r
            r18 = r0
            jt5 r0 = new jt5
            r19 = r17
            r17 = r1
            r1 = r16
            r16 = r19
            r19 = r8
            r8 = r6
            r6 = r7
            r7 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.mt5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            mt5 r5 = (defpackage.mt5) r5
            u26 r1 = r4.a
            u26 r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            a36 r1 = r4.b
            a36 r3 = r5.b
            if (r1 == r3) goto L1a
            return r2
        L1a:
            java.lang.String r1 = r4.c
            java.lang.String r3 = r5.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L25
            return r2
        L25:
            ww5 r1 = r4.d
            ww5 r3 = r5.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L30
            return r2
        L30:
            java.lang.String r1 = r4.e
            java.lang.String r3 = r5.e
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L3b
            return r2
        L3b:
            java.lang.Boolean r1 = r4.f
            java.lang.Boolean r3 = r5.f
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L46
            return r2
        L46:
            nx5 r1 = r4.g
            nx5 r3 = r5.g
            if (r1 == r3) goto L4d
            return r2
        L4d:
            v41 r1 = r4.h
            v41 r3 = r5.h
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L58
            return r2
        L58:
            me.magnum.melonds.domain.model.VideoRenderer r1 = r4.i
            me.magnum.melonds.domain.model.VideoRenderer r3 = r5.i
            if (r1 == r3) goto L5f
            return r2
        L5f:
            java.lang.Boolean r1 = r4.j
            java.lang.Boolean r3 = r5.j
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L6a
            return r2
        L6a:
            java.lang.Integer r1 = r4.k
            java.lang.Integer r3 = r5.k
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L75
            return r2
        L75:
            me.magnum.melonds.domain.model.VideoFiltering r1 = r4.l
            me.magnum.melonds.domain.model.VideoFiltering r3 = r5.l
            if (r1 == r3) goto L7c
            return r2
        L7c:
            java.lang.String r1 = r4.m
            java.lang.String r3 = r5.m
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L87
            return r2
        L87:
            java.lang.String r1 = r4.n
            java.lang.String r3 = r5.n
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L92
            return r2
        L92:
            java.lang.Boolean r1 = r4.o
            java.lang.Boolean r3 = r5.o
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L9d
            return r2
        L9d:
            jq1 r1 = r4.p
            jq1 r3 = r5.p
            if (r1 == r3) goto La4
            return r2
        La4:
            java.lang.Boolean r1 = r4.q
            java.lang.Boolean r3 = r5.q
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto Laf
            return r2
        Laf:
            java.lang.Boolean r4 = r4.r
            java.lang.Boolean r5 = r5.r
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto Lba
            return r2
        Lba:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            u26 r0 = r3.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            a36 r1 = r3.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            java.lang.String r0 = r3.c
            r2 = 0
            if (r0 != 0) goto L18
            r0 = r2
            goto L1c
        L18:
            int r0 = r0.hashCode()
        L1c:
            int r1 = r1 + r0
            int r1 = r1 * 31
            ww5 r0 = r3.d
            int r0 = r0.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.e
            if (r1 != 0) goto L2e
            r1 = r2
            goto L32
        L2e:
            int r1 = r1.hashCode()
        L32:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Boolean r1 = r3.f
            if (r1 != 0) goto L3b
            r1 = r2
            goto L3f
        L3b:
            int r1 = r1.hashCode()
        L3f:
            int r0 = r0 + r1
            int r0 = r0 * 31
            nx5 r1 = r3.g
            if (r1 != 0) goto L48
            r1 = r2
            goto L4c
        L48:
            int r1 = r1.hashCode()
        L4c:
            int r0 = r0 + r1
            int r0 = r0 * 31
            v41 r1 = r3.h
            if (r1 != 0) goto L55
            r1 = r2
            goto L59
        L55:
            int r1 = r1.hashCode()
        L59:
            int r0 = r0 + r1
            int r0 = r0 * 31
            me.magnum.melonds.domain.model.VideoRenderer r1 = r3.i
            if (r1 != 0) goto L62
            r1 = r2
            goto L66
        L62:
            int r1 = r1.hashCode()
        L66:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Boolean r1 = r3.j
            if (r1 != 0) goto L6f
            r1 = r2
            goto L73
        L6f:
            int r1 = r1.hashCode()
        L73:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Integer r1 = r3.k
            if (r1 != 0) goto L7c
            r1 = r2
            goto L80
        L7c:
            int r1 = r1.hashCode()
        L80:
            int r0 = r0 + r1
            int r0 = r0 * 31
            me.magnum.melonds.domain.model.VideoFiltering r1 = r3.l
            if (r1 != 0) goto L89
            r1 = r2
            goto L8d
        L89:
            int r1 = r1.hashCode()
        L8d:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.m
            if (r1 != 0) goto L96
            r1 = r2
            goto L9a
        L96:
            int r1 = r1.hashCode()
        L9a:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r1 = r3.n
            if (r1 != 0) goto La3
            r1 = r2
            goto La7
        La3:
            int r1 = r1.hashCode()
        La7:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Boolean r1 = r3.o
            if (r1 != 0) goto Lb0
            r1 = r2
            goto Lb4
        Lb0:
            int r1 = r1.hashCode()
        Lb4:
            int r0 = r0 + r1
            int r0 = r0 * 31
            jq1 r1 = r3.p
            if (r1 != 0) goto Lbd
            r1 = r2
            goto Lc1
        Lbd:
            int r1 = r1.hashCode()
        Lc1:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Boolean r1 = r3.q
            if (r1 != 0) goto Lca
            r1 = r2
            goto Lce
        Lca:
            int r1 = r1.hashCode()
        Lce:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.Boolean r3 = r3.r
            if (r3 != 0) goto Ld6
            goto Lda
        Ld6:
            int r2 = r3.hashCode()
        Lda:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r19 = this;
            r0 = r19
            u26 r1 = r0.a
            a36 r2 = r0.b
            java.lang.String r3 = r0.c
            ww5 r4 = r0.d
            java.lang.String r5 = r0.e
            java.lang.Boolean r6 = r0.f
            nx5 r7 = r0.g
            v41 r8 = r0.h
            me.magnum.melonds.domain.model.VideoRenderer r9 = r0.i
            java.lang.Boolean r10 = r0.j
            java.lang.Integer r11 = r0.k
            me.magnum.melonds.domain.model.VideoFiltering r12 = r0.l
            java.lang.String r13 = r0.m
            java.lang.String r14 = r0.n
            java.lang.Boolean r15 = r0.o
            r16 = r15
            jq1 r15 = r0.p
            r17 = r15
            java.lang.Boolean r15 = r0.q
            java.lang.Boolean r0 = r0.r
            r19 = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r18 = r15
            java.lang.String r15 = "RomConfigDto(runtimeConsoleType="
            r0.<init>(r15)
            r0.append(r1)
            java.lang.String r1 = ", runtimeMicSource="
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ", layoutId="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r1 = ", gbaSlotConfig="
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ", customName="
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ", useHgEngineFix="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r1 = ", inputMode="
            r0.append(r1)
            r0.append(r7)
            java.lang.String r1 = ", customControllerConfiguration="
            r0.append(r1)
            r0.append(r8)
            java.lang.String r1 = ", videoRenderer="
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = ", threadedRendering="
            r0.append(r1)
            r0.append(r10)
            java.lang.String r1 = ", internalResolutionScaling="
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = ", videoFiltering="
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = ", retroArchShaderPresetPath="
            r0.append(r1)
            java.lang.String r1 = ", retroArchShaderParameters="
            java.lang.String r2 = ", retroAchievementsEnabled="
            defpackage.i61.B(r0, r13, r1, r14, r2)
            r1 = r16
            r0.append(r1)
            java.lang.String r1 = ", dualScreenPreset="
            r0.append(r1)
            r1 = r17
            r0.append(r1)
            java.lang.String r1 = ", dualScreenKeepAspectRatio="
            r0.append(r1)
            r1 = r18
            r0.append(r1)
            java.lang.String r1 = ", dualScreenIntegerScale="
            r0.append(r1)
            r1 = r19
            r0.append(r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
