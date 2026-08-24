package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gc5  reason: default package */
/* loaded from: classes.dex */
public final class gc5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ gc5[] $VALUES;
    public static final fc5 Companion;
    private final int wireValue;
    public static final gc5 ACCEPTED = new gc5("ACCEPTED", 0, 1);
    public static final gc5 ALREADY_ACCEPTED = new gc5("ALREADY_ACCEPTED", 1, 2);
    public static final gc5 PERMANENT_FAILURE = new gc5("PERMANENT_FAILURE", 2, 3);
    public static final gc5 RETRYABLE_FAILURE = new gc5("RETRYABLE_FAILURE", 3, 4);

    private static final /* synthetic */ gc5[] $values() {
        return new gc5[]{ACCEPTED, ALREADY_ACCEPTED, PERMANENT_FAILURE, RETRYABLE_FAILURE};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [fc5, java.lang.Object] */
    static {
        gc5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
    }

    private gc5(String str, int i, int i2) {
        this.wireValue = i2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static gc5 valueOf(String str) {
        return (gc5) Enum.valueOf(gc5.class, str);
    }

    public static gc5[] values() {
        return (gc5[]) $VALUES.clone();
    }

    public final int getWireValue() {
        return this.wireValue;
    }
}
