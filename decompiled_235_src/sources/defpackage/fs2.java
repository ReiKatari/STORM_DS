package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fs2  reason: default package */
/* loaded from: classes.dex */
public final class fs2 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ fs2[] $VALUES;
    public static final es2 Companion;
    public static final fs2 STABLE = new fs2("STABLE", 0, "stable");
    public static final fs2 STABLE_AND_PRERELEASE = new fs2("STABLE_AND_PRERELEASE", 1, "stable_and_prerelease");
    private final String preferenceValue;

    private static final /* synthetic */ fs2[] $values() {
        return new fs2[]{STABLE, STABLE_AND_PRERELEASE};
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [es2, java.lang.Object] */
    static {
        fs2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
    }

    private fs2(String str, int i, String str2) {
        this.preferenceValue = str2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static fs2 valueOf(String str) {
        return (fs2) Enum.valueOf(fs2.class, str);
    }

    public static fs2[] values() {
        return (fs2[]) $VALUES.clone();
    }

    public final String getPreferenceValue() {
        return this.preferenceValue;
    }
}
