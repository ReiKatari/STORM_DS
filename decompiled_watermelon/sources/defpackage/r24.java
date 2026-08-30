package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r24  reason: default package */
/* loaded from: classes.dex */
public final class r24 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ r24[] $VALUES;
    public static final r24 Default = new r24("Default", 0);
    public static final r24 UserInput = new r24("UserInput", 1);
    public static final r24 PreventUserInput = new r24("PreventUserInput", 2);

    private static final /* synthetic */ r24[] $values() {
        return new r24[]{Default, UserInput, PreventUserInput};
    }

    static {
        r24[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private r24(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static r24 valueOf(String str) {
        return (r24) Enum.valueOf(r24.class, str);
    }

    public static r24[] values() {
        return (r24[]) $VALUES.clone();
    }
}
