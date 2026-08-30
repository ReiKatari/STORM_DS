package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: er4  reason: default package */
/* loaded from: classes.dex */
public final class er4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ er4[] $VALUES;
    public static final er4 SHOW_ICON = new er4("SHOW_ICON", 0);
    public static final er4 SHOW_TITLE = new er4("SHOW_TITLE", 1);
    public static final er4 SHOW_DESCRIPTION = new er4("SHOW_DESCRIPTION", 2);

    private static final /* synthetic */ er4[] $values() {
        return new er4[]{SHOW_ICON, SHOW_TITLE, SHOW_DESCRIPTION};
    }

    static {
        er4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private er4(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static er4 valueOf(String str) {
        return (er4) Enum.valueOf(er4.class, str);
    }

    public static er4[] values() {
        return (er4[]) $VALUES.clone();
    }
}
