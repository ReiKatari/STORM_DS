package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: be6  reason: default package */
/* loaded from: classes.dex */
public final class be6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ be6[] $VALUES;
    public static final be6 NoRequest = new be6("NoRequest", 0);
    public static final be6 MatchFound = new be6("MatchFound", 1);
    public static final be6 VisibleContentAbsentDuringTransition = new be6("VisibleContentAbsentDuringTransition", 2);
    public static final be6 NoMatchFound = new be6("NoMatchFound", 3);

    private static final /* synthetic */ be6[] $values() {
        return new be6[]{NoRequest, MatchFound, VisibleContentAbsentDuringTransition, NoMatchFound};
    }

    static {
        be6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private be6(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static be6 valueOf(String str) {
        return (be6) Enum.valueOf(be6.class, str);
    }

    public static be6[] values() {
        return (be6[]) $VALUES.clone();
    }
}
