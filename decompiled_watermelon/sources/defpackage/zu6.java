package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zu6  reason: default package */
/* loaded from: classes.dex */
public final class zu6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ zu6[] $VALUES;
    public static final zu6 SOFTCORE = new zu6("SOFTCORE", 0);
    public static final zu6 HARDCORE = new zu6("HARDCORE", 1);
    public static final zu6 SOFTCORE_OFFLINE = new zu6("SOFTCORE_OFFLINE", 2);

    private static final /* synthetic */ zu6[] $values() {
        return new zu6[]{SOFTCORE, HARDCORE, SOFTCORE_OFFLINE};
    }

    static {
        zu6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private zu6(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static zu6 valueOf(String str) {
        return (zu6) Enum.valueOf(zu6.class, str);
    }

    public static zu6[] values() {
        return (zu6[]) $VALUES.clone();
    }
}
