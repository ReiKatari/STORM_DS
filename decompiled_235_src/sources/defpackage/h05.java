package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h05  reason: default package */
/* loaded from: classes.dex */
public final class h05 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ h05[] $VALUES;
    public static final h05 SHOW_ICON = new h05("SHOW_ICON", 0);
    public static final h05 SHOW_TITLE = new h05("SHOW_TITLE", 1);
    public static final h05 SHOW_DESCRIPTION = new h05("SHOW_DESCRIPTION", 2);

    private static final /* synthetic */ h05[] $values() {
        return new h05[]{SHOW_ICON, SHOW_TITLE, SHOW_DESCRIPTION};
    }

    static {
        h05[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private h05(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static h05 valueOf(String str) {
        return (h05) Enum.valueOf(h05.class, str);
    }

    public static h05[] values() {
        return (h05[]) $VALUES.clone();
    }
}
