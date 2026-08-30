package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l52  reason: default package */
/* loaded from: classes.dex */
public final class l52 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ l52[] $VALUES;
    public static final l52 KEY_PRESS = new l52("KEY_PRESS", 0);
    public static final l52 KEY_RELEASE = new l52("KEY_RELEASE", 1);

    private static final /* synthetic */ l52[] $values() {
        return new l52[]{KEY_PRESS, KEY_RELEASE};
    }

    static {
        l52[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private l52(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static l52 valueOf(String str) {
        return (l52) Enum.valueOf(l52.class, str);
    }

    public static l52[] values() {
        return (l52[]) $VALUES.clone();
    }
}
