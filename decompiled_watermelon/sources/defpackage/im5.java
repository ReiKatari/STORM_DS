package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: im5  reason: default package */
/* loaded from: classes.dex */
public final class im5 {
    public static final int d = 0;
    @r06("type")
    private final a a;
    @r06("gbaRomPath")
    private final String b;
    @r06("gbaSavePath")
    private final String c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: im5$a */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ e12 $ENTRIES;
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
            $ENTRIES = l.C($values);
        }

        private a(String str, int i) {
        }

        public static e12 getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public im5(a aVar, String str, String str2) {
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
