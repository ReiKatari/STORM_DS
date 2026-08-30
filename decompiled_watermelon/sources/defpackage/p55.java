package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p55  reason: default package */
/* loaded from: classes.dex */
public final class p55 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ p55[] $VALUES;
    public static final p55 ShutDown = new p55("ShutDown", 0);
    public static final p55 ShuttingDown = new p55("ShuttingDown", 1);
    public static final p55 Inactive = new p55("Inactive", 2);
    public static final p55 InactivePendingWork = new p55("InactivePendingWork", 3);
    public static final p55 Idle = new p55("Idle", 4);
    public static final p55 PendingWork = new p55("PendingWork", 5);

    private static final /* synthetic */ p55[] $values() {
        return new p55[]{ShutDown, ShuttingDown, Inactive, InactivePendingWork, Idle, PendingWork};
    }

    static {
        p55[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private p55(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static p55 valueOf(String str) {
        return (p55) Enum.valueOf(p55.class, str);
    }

    public static p55[] values() {
        return (p55[]) $VALUES.clone();
    }
}
