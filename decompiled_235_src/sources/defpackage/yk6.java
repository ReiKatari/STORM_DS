package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yk6  reason: default package */
/* loaded from: classes.dex */
public final class yk6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ yk6[] $VALUES;
    public static final yk6 MISSING_FROM_CURRENT_SET = new yk6("MISSING_FROM_CURRENT_SET", 0);
    public static final yk6 DEFINITION_CHANGED = new yk6("DEFINITION_CHANGED", 1);
    public static final yk6 NOT_IN_PREFETCH_CACHE = new yk6("NOT_IN_PREFETCH_CACHE", 2);
    public static final yk6 SERVER_REJECTED = new yk6("SERVER_REJECTED", 3);

    private static final /* synthetic */ yk6[] $values() {
        return new yk6[]{MISSING_FROM_CURRENT_SET, DEFINITION_CHANGED, NOT_IN_PREFETCH_CACHE, SERVER_REJECTED};
    }

    static {
        yk6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private yk6(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static yk6 valueOf(String str) {
        return (yk6) Enum.valueOf(yk6.class, str);
    }

    public static yk6[] values() {
        return (yk6[]) $VALUES.clone();
    }
}
