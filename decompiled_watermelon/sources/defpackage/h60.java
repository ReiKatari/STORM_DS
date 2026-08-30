package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h60  reason: default package */
/* loaded from: classes.dex */
public final class h60 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ h60[] $VALUES;
    public static final h60 SUSPEND = new h60("SUSPEND", 0);
    public static final h60 DROP_OLDEST = new h60("DROP_OLDEST", 1);
    public static final h60 DROP_LATEST = new h60("DROP_LATEST", 2);

    private static final /* synthetic */ h60[] $values() {
        return new h60[]{SUSPEND, DROP_OLDEST, DROP_LATEST};
    }

    static {
        h60[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private h60(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static h60 valueOf(String str) {
        return (h60) Enum.valueOf(h60.class, str);
    }

    public static h60[] values() {
        return (h60[]) $VALUES.clone();
    }
}
