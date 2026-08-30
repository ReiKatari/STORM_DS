package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x94  reason: default package */
/* loaded from: classes.dex */
public final class x94 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ x94[] $VALUES;
    public static final x94 OK = new x94("OK", 0);
    public static final x94 EMPTY = new x94("EMPTY", 1);
    public static final x94 TAMPERED = new x94("TAMPERED", 2);
    public static final x94 SIGNING_KEY_INVALID = new x94("SIGNING_KEY_INVALID", 3);
    public static final x94 IO_ERROR = new x94("IO_ERROR", 4);

    private static final /* synthetic */ x94[] $values() {
        return new x94[]{OK, EMPTY, TAMPERED, SIGNING_KEY_INVALID, IO_ERROR};
    }

    static {
        x94[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private x94(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static x94 valueOf(String str) {
        return (x94) Enum.valueOf(x94.class, str);
    }

    public static x94[] values() {
        return (x94[]) $VALUES.clone();
    }
}
