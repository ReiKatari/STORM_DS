package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ez3  reason: default package */
/* loaded from: classes.dex */
public abstract class ez3 {
    public static final ez3 DEFAULT = new a("DEFAULT", 0);
    public static final ez3 STRING = new ez3("STRING", 1) { // from class: ez3.b
        @Override // defpackage.ez3
        public ee3 serialize(Long l) {
            if (l == null) {
                return ve3.A;
            }
            return new ef3(l.toString());
        }

        @Override // defpackage.ez3
        public yc7 typeAdapter() {
            return fe7.l;
        }
    };
    private static final /* synthetic */ ez3[] $VALUES = $values();

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: ez3$a */
    /* loaded from: classes.dex */
    public enum a extends ez3 {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // defpackage.ez3
        public ee3 serialize(Long l) {
            if (l == null) {
                return ve3.A;
            }
            return new ef3(l);
        }

        @Override // defpackage.ez3
        public yc7 typeAdapter() {
            return fe7.k;
        }
    }

    private static /* synthetic */ ez3[] $values() {
        return new ez3[]{DEFAULT, STRING};
    }

    private ez3(String str, int i) {
    }

    public static ez3 valueOf(String str) {
        return (ez3) Enum.valueOf(ez3.class, str);
    }

    public static ez3[] values() {
        return (ez3[]) $VALUES.clone();
    }

    public abstract ee3 serialize(Long l);

    public abstract yc7 typeAdapter();

    public /* synthetic */ ez3(String str, int i, a aVar) {
        this(str, i);
    }
}
