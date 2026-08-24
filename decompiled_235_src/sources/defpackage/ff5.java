package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ff5  reason: default package */
/* loaded from: classes.dex */
public final class ff5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ff5[] $VALUES;
    public static final ff5 ShutDown = new ff5("ShutDown", 0);
    public static final ff5 ShuttingDown = new ff5("ShuttingDown", 1);
    public static final ff5 Inactive = new ff5("Inactive", 2);
    public static final ff5 InactivePendingWork = new ff5("InactivePendingWork", 3);
    public static final ff5 Idle = new ff5("Idle", 4);
    public static final ff5 PendingWork = new ff5("PendingWork", 5);

    private static final /* synthetic */ ff5[] $values() {
        return new ff5[]{ShutDown, ShuttingDown, Inactive, InactivePendingWork, Idle, PendingWork};
    }

    static {
        ff5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ff5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ff5 valueOf(String str) {
        return (ff5) Enum.valueOf(ff5.class, str);
    }

    public static ff5[] values() {
        return (ff5[]) $VALUES.clone();
    }
}
