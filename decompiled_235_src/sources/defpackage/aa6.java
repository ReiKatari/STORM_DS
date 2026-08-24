package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: aa6  reason: default package */
/* loaded from: classes.dex */
public final class aa6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ aa6[] $VALUES;
    public static final aa6 INITIAL_SELECTION = new aa6("INITIAL_SELECTION", 0);
    public static final aa6 SELECTED_BY_USER = new aa6("SELECTED_BY_USER", 1);
    public static final aa6 SELECTED_BY_FALLBACK = new aa6("SELECTED_BY_FALLBACK", 2);

    private static final /* synthetic */ aa6[] $values() {
        return new aa6[]{INITIAL_SELECTION, SELECTED_BY_USER, SELECTED_BY_FALLBACK};
    }

    static {
        aa6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private aa6(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static aa6 valueOf(String str) {
        return (aa6) Enum.valueOf(aa6.class, str);
    }

    public static aa6[] values() {
        return (aa6[]) $VALUES.clone();
    }
}
