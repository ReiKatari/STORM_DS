package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h6  reason: default package */
/* loaded from: classes.dex */
public final class h6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ h6[] $VALUES;
    public static final h6 RUNTIME_OWNS_SUBMIT = new h6("RUNTIME_OWNS_SUBMIT", 0);
    public static final h6 SUBMIT_FROM_KOTLIN = new h6("SUBMIT_FROM_KOTLIN", 1);

    private static final /* synthetic */ h6[] $values() {
        return new h6[]{RUNTIME_OWNS_SUBMIT, SUBMIT_FROM_KOTLIN};
    }

    static {
        h6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private h6(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static h6 valueOf(String str) {
        return (h6) Enum.valueOf(h6.class, str);
    }

    public static h6[] values() {
        return (h6[]) $VALUES.clone();
    }
}
