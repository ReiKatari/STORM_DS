package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ar6  reason: default package */
/* loaded from: classes.dex */
public final class ar6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ar6[] $VALUES;
    public static final ar6 StartInput = new ar6("StartInput", 0);
    public static final ar6 StopInput = new ar6("StopInput", 1);
    public static final ar6 ShowKeyboard = new ar6("ShowKeyboard", 2);
    public static final ar6 HideKeyboard = new ar6("HideKeyboard", 3);

    private static final /* synthetic */ ar6[] $values() {
        return new ar6[]{StartInput, StopInput, ShowKeyboard, HideKeyboard};
    }

    static {
        ar6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private ar6(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ar6 valueOf(String str) {
        return (ar6) Enum.valueOf(ar6.class, str);
    }

    public static ar6[] values() {
        return (ar6[]) $VALUES.clone();
    }
}
