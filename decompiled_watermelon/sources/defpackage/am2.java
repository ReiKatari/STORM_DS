package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: am2  reason: default package */
/* loaded from: classes.dex */
public final class am2 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ am2[] $VALUES;
    public static final zl2 Companion;
    public static final am2 STABLE = new am2("STABLE", 0, "stable");
    public static final am2 STABLE_AND_PRERELEASE = new am2("STABLE_AND_PRERELEASE", 1, "stable_and_prerelease");
    private final String preferenceValue;

    private static final /* synthetic */ am2[] $values() {
        return new am2[]{STABLE, STABLE_AND_PRERELEASE};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [zl2, java.lang.Object] */
    static {
        am2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
        Companion = new Object();
    }

    private am2(String str, int i, String str2) {
        this.preferenceValue = str2;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static am2 valueOf(String str) {
        return (am2) Enum.valueOf(am2.class, str);
    }

    public static am2[] values() {
        return (am2[]) $VALUES.clone();
    }

    public final String getPreferenceValue() {
        return this.preferenceValue;
    }
}
