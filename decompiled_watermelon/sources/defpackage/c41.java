package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c41  reason: default package */
/* loaded from: classes.dex */
public final class c41 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ c41[] $VALUES;
    public static final c41 CROSSED = new c41("CROSSED", 0);
    public static final c41 NOT_CROSSED = new c41("NOT_CROSSED", 1);
    public static final c41 COLLAPSED = new c41("COLLAPSED", 2);

    private static final /* synthetic */ c41[] $values() {
        return new c41[]{CROSSED, NOT_CROSSED, COLLAPSED};
    }

    static {
        c41[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private c41(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static c41 valueOf(String str) {
        return (c41) Enum.valueOf(c41.class, str);
    }

    public static c41[] values() {
        return (c41[]) $VALUES.clone();
    }
}
