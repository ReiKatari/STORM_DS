package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mi0  reason: default package */
/* loaded from: classes.dex */
public final class mi0 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ mi0[] $VALUES;
    public static final mi0 PENDING = new mi0("PENDING", 0);
    public static final mi0 CREATING = new mi0("CREATING", 1);
    public static final mi0 CREATED = new mi0("CREATED", 2);
    public static final mi0 CLOSING = new mi0("CLOSING", 3);
    public static final mi0 CLOSED = new mi0("CLOSED", 4);

    private static final /* synthetic */ mi0[] $values() {
        return new mi0[]{PENDING, CREATING, CREATED, CLOSING, CLOSED};
    }

    static {
        mi0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private mi0(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static mi0 valueOf(String str) {
        return (mi0) Enum.valueOf(mi0.class, str);
    }

    public static mi0[] values() {
        return (mi0[]) $VALUES.clone();
    }
}
