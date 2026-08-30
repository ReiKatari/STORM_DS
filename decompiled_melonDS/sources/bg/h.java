package bg;

import q8.r;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: d  reason: collision with root package name */
    public static final int f2250d = 0;
    @va.b("type")

    /* renamed from: a  reason: collision with root package name */
    private final a f2251a;
    @va.b("gbaRomPath")

    /* renamed from: b  reason: collision with root package name */
    private final String f2252b;
    @va.b("gbaSavePath")

    /* renamed from: c  reason: collision with root package name */
    private final String f2253c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class a {
        private static final /* synthetic */ fc.a $ENTRIES;
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
            $ENTRIES = r.x($values);
        }

        private a(String str, int i2) {
        }

        public static fc.a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public h(a aVar, String str, String str2) {
        aVar.getClass();
        this.f2251a = aVar;
        this.f2252b = str;
        this.f2253c = str2;
    }

    public final String a() {
        return this.f2252b;
    }

    public final String b() {
        return this.f2253c;
    }

    public final a c() {
        return this.f2251a;
    }
}
