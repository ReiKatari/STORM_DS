package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s24  reason: default package */
/* loaded from: classes.dex */
public final class s24 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ s24[] $VALUES;
    public static final s24 Default = new s24("Default", 0);
    public static final s24 UserInput = new s24("UserInput", 1);
    public static final s24 PreventUserInput = new s24("PreventUserInput", 2);

    private static final /* synthetic */ s24[] $values() {
        return new s24[]{Default, UserInput, PreventUserInput};
    }

    static {
        s24[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private s24(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static s24 valueOf(String str) {
        return (s24) Enum.valueOf(s24.class, str);
    }

    public static s24[] values() {
        return (s24[]) $VALUES.clone();
    }
}
