package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ww5  reason: default package */
/* loaded from: classes.dex */
public final class ww5 {
    @defpackage.gc6("type")
    private final defpackage.ww5.b a;
    @defpackage.gc6("gbaRomPath")
    private final java.lang.String b;
    @defpackage.gc6("gbaSavePath")
    private final java.lang.String c;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: ww5$a */
    /* loaded from: classes.dex */
    public static final class a {
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: ww5$b */
    /* loaded from: classes.dex */
    public enum b extends java.lang.Enum<defpackage.ww5.b> {
        private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
        private static final /* synthetic */ defpackage.ww5.b[] $VALUES = null;
        public static final defpackage.ww5.b AnalogInput = null;
        public static final defpackage.ww5.b GbaRom = null;
        public static final defpackage.ww5.b MemoryExpansion = null;
        public static final defpackage.ww5.b None = null;
        public static final defpackage.ww5.b RumblePak = null;

        private static final /* synthetic */ defpackage.ww5.b[] $values() {
                ww5$b r0 = defpackage.ww5.b.None
                ww5$b r1 = defpackage.ww5.b.GbaRom
                ww5$b r2 = defpackage.ww5.b.RumblePak
                ww5$b r3 = defpackage.ww5.b.MemoryExpansion
                ww5$b r4 = defpackage.ww5.b.AnalogInput
                ww5$b[] r0 = new defpackage.ww5.b[]{r0, r1, r2, r3, r4}
                return r0
        }

        static {
                ww5$b r0 = new ww5$b
                java.lang.String r1 = "None"
                r2 = 0
                r0.<init>(r1, r2)
                defpackage.ww5.b.None = r0
                ww5$b r0 = new ww5$b
                java.lang.String r1 = "GbaRom"
                r2 = 1
                r0.<init>(r1, r2)
                defpackage.ww5.b.GbaRom = r0
                ww5$b r0 = new ww5$b
                java.lang.String r1 = "RumblePak"
                r2 = 2
                r0.<init>(r1, r2)
                defpackage.ww5.b.RumblePak = r0
                ww5$b r0 = new ww5$b
                java.lang.String r1 = "MemoryExpansion"
                r2 = 3
                r0.<init>(r1, r2)
                defpackage.ww5.b.MemoryExpansion = r0
                ww5$b r0 = new ww5$b
                java.lang.String r1 = "AnalogInput"
                r2 = 4
                r0.<init>(r1, r2)
                defpackage.ww5.b.AnalogInput = r0
                ww5$b[] r0 = $values()
                defpackage.ww5.b.$VALUES = r0
                u52 r0 = defpackage.nc1.L(r0)
                defpackage.ww5.b.$ENTRIES = r0
                return
        }

        b(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static defpackage.t52 getEntries() {
                t52 r0 = defpackage.ww5.b.$ENTRIES
                return r0
        }

        public static defpackage.ww5.b valueOf(java.lang.String r1) {
                java.lang.Class<ww5$b> r0 = defpackage.ww5.b.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                ww5$b r1 = (defpackage.ww5.b) r1
                return r1
        }

        public static defpackage.ww5.b[] values() {
                ww5$b[] r0 = defpackage.ww5.b.$VALUES
                java.lang.Object r0 = r0.clone()
                ww5$b[] r0 = (defpackage.ww5.b[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: ww5$c */
    /* loaded from: classes.dex */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] a = null;

        static {
                ww5$b[] r0 = defpackage.ww5.b.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                ww5$b r1 = defpackage.ww5.b.None     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                ww5$b r1 = defpackage.ww5.b.GbaRom     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                ww5$b r1 = defpackage.ww5.b.RumblePak     // Catch: java.lang.NoSuchFieldError -> L22
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22
            L22:
                ww5$b r1 = defpackage.ww5.b.MemoryExpansion     // Catch: java.lang.NoSuchFieldError -> L2b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b
            L2b:
                ww5$b r1 = defpackage.ww5.b.AnalogInput     // Catch: java.lang.NoSuchFieldError -> L34
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L34
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L34
            L34:
                defpackage.ww5.c.a = r0
                return
        }
    }

    public ww5(defpackage.ww5.b r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final defpackage.hi2 a() {
            r3 = this;
            ww5$b r0 = r3.a
            int[] r1 = defpackage.ww5.c.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L3f
            r1 = 2
            r2 = 0
            if (r0 == r1) goto L27
            r3 = 3
            if (r0 == r3) goto L24
            r3 = 4
            if (r0 == r3) goto L21
            r3 = 5
            if (r0 != r3) goto L1d
            rw5 r3 = defpackage.rw5.o
            return r3
        L1d:
            defpackage.i.d()
            return r2
        L21:
            tw5 r3 = defpackage.tw5.o
            return r3
        L24:
            vw5 r3 = defpackage.vw5.o
            return r3
        L27:
            sw5 r0 = new sw5
            java.lang.String r1 = r3.b
            if (r1 == 0) goto L32
            android.net.Uri r1 = android.net.Uri.parse(r1)
            goto L33
        L32:
            r1 = r2
        L33:
            java.lang.String r3 = r3.c
            if (r3 == 0) goto L3b
            android.net.Uri r2 = android.net.Uri.parse(r3)
        L3b:
            r0.<init>(r1, r2)
            return r0
        L3f:
            uw5 r3 = defpackage.uw5.o
            return r3
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.ww5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ww5 r5 = (defpackage.ww5) r5
            ww5$b r1 = r4.a
            ww5$b r3 = r5.a
            if (r1 == r3) goto L13
            return r2
        L13:
            java.lang.String r1 = r4.b
            java.lang.String r3 = r5.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L1e
            return r2
        L1e:
            java.lang.String r4 = r4.c
            java.lang.String r5 = r5.c
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L29
            return r2
        L29:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            ww5$b r0 = r3.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r3.b
            r2 = 0
            if (r1 != 0) goto Lf
            r1 = r2
            goto L13
        Lf:
            int r1 = r1.hashCode()
        L13:
            int r0 = r0 + r1
            int r0 = r0 * 31
            java.lang.String r3 = r3.c
            if (r3 != 0) goto L1b
            goto L1f
        L1b:
            int r2 = r3.hashCode()
        L1f:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r4 = this;
            ww5$b r0 = r4.a
            java.lang.String r1 = r4.b
            java.lang.String r4 = r4.c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "RomGbaSlotConfigDto(type="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", gbaRomPath="
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = ", gbaSavePath="
            r2.append(r0)
            java.lang.String r0 = ")"
            java.lang.String r4 = defpackage.i61.n(r2, r4, r0)
            return r4
    }
}
