package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ny5  reason: default package */
/* loaded from: classes.dex */
public final class ny5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ny5[] $VALUES;
    public static final ny5 INITIAL_SELECTION = new ny5("INITIAL_SELECTION", 0);
    public static final ny5 SELECTED_BY_USER = new ny5("SELECTED_BY_USER", 1);
    public static final ny5 SELECTED_BY_FALLBACK = new ny5("SELECTED_BY_FALLBACK", 2);

    private static final /* synthetic */ ny5[] $values() {
        return new ny5[]{INITIAL_SELECTION, SELECTED_BY_USER, SELECTED_BY_FALLBACK};
    }

    static {
        ny5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private ny5(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ny5 valueOf(String str) {
        return (ny5) Enum.valueOf(ny5.class, str);
    }

    public static ny5[] values() {
        return (ny5[]) $VALUES.clone();
    }
}
