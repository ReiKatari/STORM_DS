package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ug3  reason: default package */
/* loaded from: classes.dex */
public final class ug3 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ug3[] $VALUES;
    public static final ug3 MAIN_SCREEN = new ug3("MAIN_SCREEN", 0);
    public static final ug3 SECONDARY_SCREEN = new ug3("SECONDARY_SCREEN", 1);

    private static final /* synthetic */ ug3[] $values() {
        return new ug3[]{MAIN_SCREEN, SECONDARY_SCREEN};
    }

    static {
        ug3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private ug3(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ug3 valueOf(String str) {
        return (ug3) Enum.valueOf(ug3.class, str);
    }

    public static ug3[] values() {
        return (ug3[]) $VALUES.clone();
    }
}
