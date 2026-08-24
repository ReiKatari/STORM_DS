package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xw5  reason: default package */
/* loaded from: classes.dex */
public final class xw5 {
    public static final int d = 0;
    @gc6("type")
    private final a a;
    @gc6("gbaRomPath")
    private final String b;
    @gc6("gbaSavePath")
    private final String c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: xw5$a */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ t52 $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a None = new a("None", 0);
        public static final a GbaRom = new a("GbaRom", 1);
        public static final a MemoryExpansion = new a("MemoryExpansion", 2);

        private static final /* synthetic */ a[] $values() {
            return new a[]{None, GbaRom, MemoryExpansion};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = nc1.L($values);
        }

        private a(String str, int i) {
        }

        public static t52 getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public xw5(a aVar, String str, String str2) {
        aVar.getClass();
        this.a = aVar;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.b;
    }

    public final String b() {
        return this.c;
    }

    public final a c() {
        return this.a;
    }
}
