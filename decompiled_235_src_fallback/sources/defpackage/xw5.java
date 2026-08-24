package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xw5  reason: default package */
/* loaded from: classes.dex */
public final class xw5 {
    public static final int d = 0;
    @defpackage.gc6("type")
    private final defpackage.xw5.a a;
    @defpackage.gc6("gbaRomPath")
    private final java.lang.String b;
    @defpackage.gc6("gbaSavePath")
    private final java.lang.String c;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: xw5$a */
    /* loaded from: classes.dex */
    public enum a extends java.lang.Enum<defpackage.xw5.a> {
        private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
        private static final /* synthetic */ defpackage.xw5.a[] $VALUES = null;
        public static final defpackage.xw5.a GbaRom = null;
        public static final defpackage.xw5.a MemoryExpansion = null;
        public static final defpackage.xw5.a None = null;

        private static final /* synthetic */ defpackage.xw5.a[] $values() {
                xw5$a r0 = defpackage.xw5.a.None
                xw5$a r1 = defpackage.xw5.a.GbaRom
                xw5$a r2 = defpackage.xw5.a.MemoryExpansion
                xw5$a[] r0 = new defpackage.xw5.a[]{r0, r1, r2}
                return r0
        }

        static {
                xw5$a r0 = new xw5$a
                java.lang.String r1 = "None"
                r2 = 0
                r0.<init>(r1, r2)
                defpackage.xw5.a.None = r0
                xw5$a r0 = new xw5$a
                java.lang.String r1 = "GbaRom"
                r2 = 1
                r0.<init>(r1, r2)
                defpackage.xw5.a.GbaRom = r0
                xw5$a r0 = new xw5$a
                java.lang.String r1 = "MemoryExpansion"
                r2 = 2
                r0.<init>(r1, r2)
                defpackage.xw5.a.MemoryExpansion = r0
                xw5$a[] r0 = $values()
                defpackage.xw5.a.$VALUES = r0
                u52 r0 = defpackage.nc1.L(r0)
                defpackage.xw5.a.$ENTRIES = r0
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static defpackage.t52 getEntries() {
                t52 r0 = defpackage.xw5.a.$ENTRIES
                return r0
        }

        public static defpackage.xw5.a valueOf(java.lang.String r1) {
                java.lang.Class<xw5$a> r0 = defpackage.xw5.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xw5$a r1 = (defpackage.xw5.a) r1
                return r1
        }

        public static defpackage.xw5.a[] values() {
                xw5$a[] r0 = defpackage.xw5.a.$VALUES
                java.lang.Object r0 = r0.clone()
                xw5$a[] r0 = (defpackage.xw5.a[]) r0
                return r0
        }
    }

    public xw5(defpackage.xw5.a r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final java.lang.String a() {
            r0 = this;
            java.lang.String r0 = r0.b
            return r0
    }

    public final java.lang.String b() {
            r0 = this;
            java.lang.String r0 = r0.c
            return r0
    }

    public final defpackage.xw5.a c() {
            r0 = this;
            xw5$a r0 = r0.a
            return r0
    }
}
