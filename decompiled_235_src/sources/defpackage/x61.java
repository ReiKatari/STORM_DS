package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x61  reason: default package */
/* loaded from: classes.dex */
public final class x61 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ x61[] $VALUES;
    public static final x61 COROUTINE_SUSPENDED = new x61("COROUTINE_SUSPENDED", 0);
    public static final x61 UNDECIDED = new x61("UNDECIDED", 1);
    public static final x61 RESUMED = new x61("RESUMED", 2);

    private static final /* synthetic */ x61[] $values() {
        return new x61[]{COROUTINE_SUSPENDED, UNDECIDED, RESUMED};
    }

    static {
        x61[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private x61(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static x61 valueOf(String str) {
        return (x61) Enum.valueOf(x61.class, str);
    }

    public static x61[] values() {
        return (x61[]) $VALUES.clone();
    }
}
