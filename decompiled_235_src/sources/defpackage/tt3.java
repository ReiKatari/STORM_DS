package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tt3  reason: default package */
/* loaded from: classes.dex */
public final class tt3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ tt3[] $VALUES;
    public static final tt3 DESTROYED = new tt3("DESTROYED", 0);
    public static final tt3 INITIALIZED = new tt3("INITIALIZED", 1);
    public static final tt3 CREATED = new tt3("CREATED", 2);
    public static final tt3 STARTED = new tt3("STARTED", 3);
    public static final tt3 RESUMED = new tt3("RESUMED", 4);

    private static final /* synthetic */ tt3[] $values() {
        return new tt3[]{DESTROYED, INITIALIZED, CREATED, STARTED, RESUMED};
    }

    static {
        tt3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private tt3(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static tt3 valueOf(String str) {
        return (tt3) Enum.valueOf(tt3.class, str);
    }

    public static tt3[] values() {
        return (tt3[]) $VALUES.clone();
    }

    public final boolean isAtLeast(tt3 tt3Var) {
        tt3Var.getClass();
        if (compareTo(tt3Var) >= 0) {
            return true;
        }
        return false;
    }
}
