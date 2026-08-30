package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bf5  reason: default package */
/* loaded from: classes.dex */
public final class bf5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ bf5[] $VALUES;
    public static final bf5 NoNetwork = new bf5("NoNetwork", 0);
    public static final bf5 NotEnoughSpace = new bf5("NotEnoughSpace", 1);
    public static final bf5 HttpError = new bf5("HttpError", 2);
    public static final bf5 Truncated = new bf5("Truncated", 3);
    public static final bf5 CorruptArchive = new bf5("CorruptArchive", 4);

    private static final /* synthetic */ bf5[] $values() {
        return new bf5[]{NoNetwork, NotEnoughSpace, HttpError, Truncated, CorruptArchive};
    }

    static {
        bf5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private bf5(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static bf5 valueOf(String str) {
        return (bf5) Enum.valueOf(bf5.class, str);
    }

    public static bf5[] values() {
        return (bf5[]) $VALUES.clone();
    }
}
