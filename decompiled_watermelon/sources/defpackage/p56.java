package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p56  reason: default package */
/* loaded from: classes.dex */
public final class p56 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ p56[] $VALUES;
    public static final p56 START = new p56("START", 0);
    public static final p56 STOP = new p56("STOP", 1);
    public static final p56 STOP_AND_RESET_REPLAY_CACHE = new p56("STOP_AND_RESET_REPLAY_CACHE", 2);

    private static final /* synthetic */ p56[] $values() {
        return new p56[]{START, STOP, STOP_AND_RESET_REPLAY_CACHE};
    }

    static {
        p56[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private p56(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static p56 valueOf(String str) {
        return (p56) Enum.valueOf(p56.class, str);
    }

    public static p56[] values() {
        return (p56[]) $VALUES.clone();
    }
}
