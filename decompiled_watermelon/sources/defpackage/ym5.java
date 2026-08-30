package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ym5  reason: default package */
/* loaded from: classes.dex */
public final class ym5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ym5[] $VALUES;
    public static final ym5 GLOBAL = new ym5("GLOBAL", 0);
    public static final ym5 CUSTOM = new ym5("CUSTOM", 1);

    private static final /* synthetic */ ym5[] $values() {
        return new ym5[]{GLOBAL, CUSTOM};
    }

    static {
        ym5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private ym5(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ym5 valueOf(String str) {
        return (ym5) Enum.valueOf(ym5.class, str);
    }

    public static ym5[] values() {
        return (ym5[]) $VALUES.clone();
    }
}
