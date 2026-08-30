package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v64  reason: default package */
/* loaded from: classes.dex */
public final class v64 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ v64[] $VALUES;
    public static final v64 NOT_REQUIRED = new v64("NOT_REQUIRED", 0);
    public static final v64 CONNECTED = new v64("CONNECTED", 1);
    public static final v64 UNMETERED = new v64("UNMETERED", 2);
    public static final v64 NOT_ROAMING = new v64("NOT_ROAMING", 3);
    public static final v64 METERED = new v64("METERED", 4);
    public static final v64 TEMPORARILY_UNMETERED = new v64("TEMPORARILY_UNMETERED", 5);

    private static final /* synthetic */ v64[] $values() {
        return new v64[]{NOT_REQUIRED, CONNECTED, UNMETERED, NOT_ROAMING, METERED, TEMPORARILY_UNMETERED};
    }

    static {
        v64[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private v64(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static v64 valueOf(String str) {
        return (v64) Enum.valueOf(v64.class, str);
    }

    public static v64[] values() {
        return (v64[]) $VALUES.clone();
    }
}
