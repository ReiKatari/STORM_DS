package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uk0  reason: default package */
/* loaded from: classes.dex */
public final class uk0 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ uk0[] $VALUES;
    public static final uk0 PENDING = new uk0("PENDING", 0);
    public static final uk0 CREATING = new uk0("CREATING", 1);
    public static final uk0 CREATED = new uk0("CREATED", 2);
    public static final uk0 CLOSING = new uk0("CLOSING", 3);
    public static final uk0 CLOSED = new uk0("CLOSED", 4);

    private static final /* synthetic */ uk0[] $values() {
        return new uk0[]{PENDING, CREATING, CREATED, CLOSING, CLOSED};
    }

    static {
        uk0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private uk0(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static uk0 valueOf(String str) {
        return (uk0) Enum.valueOf(uk0.class, str);
    }

    public static uk0[] values() {
        return (uk0[]) $VALUES.clone();
    }
}
