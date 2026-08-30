package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i94  reason: default package */
/* loaded from: classes.dex */
public final class i94 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ i94[] $VALUES;
    public static final i94 NO_OP = new i94("NO_OP", 0);
    public static final i94 ADD = new i94("ADD", 1);
    public static final i94 REMOVE = new i94("REMOVE", 2);

    private static final /* synthetic */ i94[] $values() {
        return new i94[]{NO_OP, ADD, REMOVE};
    }

    static {
        i94[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private i94(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static i94 valueOf(String str) {
        return (i94) Enum.valueOf(i94.class, str);
    }

    public static i94[] values() {
        return (i94[]) $VALUES.clone();
    }
}
