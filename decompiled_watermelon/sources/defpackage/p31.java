package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p31  reason: default package */
/* loaded from: classes.dex */
public final class p31 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ p31[] $VALUES;
    public static final p31 COROUTINE_SUSPENDED = new p31("COROUTINE_SUSPENDED", 0);
    public static final p31 UNDECIDED = new p31("UNDECIDED", 1);
    public static final p31 RESUMED = new p31("RESUMED", 2);

    private static final /* synthetic */ p31[] $values() {
        return new p31[]{COROUTINE_SUSPENDED, UNDECIDED, RESUMED};
    }

    static {
        p31[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private p31(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static p31 valueOf(String str) {
        return (p31) Enum.valueOf(p31.class, str);
    }

    public static p31[] values() {
        return (p31[]) $VALUES.clone();
    }
}
