package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b77  reason: default package */
/* loaded from: classes.dex */
public final class b77 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ b77[] $VALUES;
    public static final b77 MISSING_FROM_CURRENT_SET = new b77("MISSING_FROM_CURRENT_SET", 0);
    public static final b77 DEFINITION_CHANGED = new b77("DEFINITION_CHANGED", 1);
    public static final b77 NOT_IN_PREFETCH_CACHE = new b77("NOT_IN_PREFETCH_CACHE", 2);
    public static final b77 SERVER_REJECTED = new b77("SERVER_REJECTED", 3);

    private static final /* synthetic */ b77[] $values() {
        return new b77[]{MISSING_FROM_CURRENT_SET, DEFINITION_CHANGED, NOT_IN_PREFETCH_CACHE, SERVER_REJECTED};
    }

    static {
        b77[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private b77(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static b77 valueOf(String str) {
        return (b77) Enum.valueOf(b77.class, str);
    }

    public static b77[] values() {
        return (b77[]) $VALUES.clone();
    }
}
