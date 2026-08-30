package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wr1  reason: default package */
/* loaded from: classes.dex */
public final class wr1 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ wr1[] $VALUES;
    public static final wr1 GBAModeNotSupported = new wr1("GBAModeNotSupported", 0);
    public static final wr1 BadExceptionRegion = new wr1("BadExceptionRegion", 1);
    public static final wr1 PowerOff = new wr1("PowerOff", 2);

    private static final /* synthetic */ wr1[] $values() {
        return new wr1[]{GBAModeNotSupported, BadExceptionRegion, PowerOff};
    }

    static {
        wr1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private wr1(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static wr1 valueOf(String str) {
        return (wr1) Enum.valueOf(wr1.class, str);
    }

    public static wr1[] values() {
        return (wr1[]) $VALUES.clone();
    }
}
