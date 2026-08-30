package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g6  reason: default package */
/* loaded from: classes.dex */
public final class g6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ g6[] $VALUES;
    public static final g6 RUNTIME_OWNS_SUBMIT = new g6("RUNTIME_OWNS_SUBMIT", 0);
    public static final g6 SUBMIT_FROM_KOTLIN = new g6("SUBMIT_FROM_KOTLIN", 1);

    private static final /* synthetic */ g6[] $values() {
        return new g6[]{RUNTIME_OWNS_SUBMIT, SUBMIT_FROM_KOTLIN};
    }

    static {
        g6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private g6(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static g6 valueOf(String str) {
        return (g6) Enum.valueOf(g6.class, str);
    }

    public static g6[] values() {
        return (g6[]) $VALUES.clone();
    }
}
