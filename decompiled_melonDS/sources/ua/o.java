package ua;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class o {
    public static final o DEFAULT = new a("DEFAULT", 0);
    public static final o STRING = new o("STRING", 1) { // from class: ua.o.b
        @Override // ua.o
        public j serialize(Long l10) {
            if (l10 == null) {
                return l.A;
            }
            return new n(l10.toString());
        }
    };
    private static final /* synthetic */ o[] $VALUES = $values();

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public enum a extends o {
        public a(String str, int i2) {
            super(str, i2, null);
        }

        @Override // ua.o
        public j serialize(Long l10) {
            if (l10 == null) {
                return l.A;
            }
            return new n(l10);
        }
    }

    private static /* synthetic */ o[] $values() {
        return new o[]{DEFAULT, STRING};
    }

    private o(String str, int i2) {
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) $VALUES.clone();
    }

    public abstract j serialize(Long l10);

    public /* synthetic */ o(String str, int i2, a aVar) {
        this(str, i2);
    }
}
