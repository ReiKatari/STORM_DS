package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w25  reason: default package */
/* loaded from: classes.dex */
public final class w25 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ w25[] $VALUES;
    public static final v25 Companion;
    private final int wireValue;
    public static final w25 ACCEPTED = new w25("ACCEPTED", 0, 1);
    public static final w25 ALREADY_ACCEPTED = new w25("ALREADY_ACCEPTED", 1, 2);
    public static final w25 PERMANENT_FAILURE = new w25("PERMANENT_FAILURE", 2, 3);
    public static final w25 RETRYABLE_FAILURE = new w25("RETRYABLE_FAILURE", 3, 4);

    private static final /* synthetic */ w25[] $values() {
        return new w25[]{ACCEPTED, ALREADY_ACCEPTED, PERMANENT_FAILURE, RETRYABLE_FAILURE};
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [v25, java.lang.Object] */
    static {
        w25[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
        Companion = new Object();
    }

    private w25(String str, int i, int i2) {
        this.wireValue = i2;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static w25 valueOf(String str) {
        return (w25) Enum.valueOf(w25.class, str);
    }

    public static w25[] values() {
        return (w25[]) $VALUES.clone();
    }

    public final int getWireValue() {
        return this.wireValue;
    }
}
