package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jv4  reason: default package */
/* loaded from: classes.dex */
public final class jv4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ jv4[] $VALUES;
    private final long signature;
    public static final jv4 DEFAULT = new jv4("DEFAULT", 0, 0);
    public static final jv4 SIGNED = new jv4("SIGNED", 1, 8589934592L);
    public static final jv4 FIXED = new jv4("FIXED", 2, 17179869184L);

    private static final /* synthetic */ jv4[] $values() {
        return new jv4[]{DEFAULT, SIGNED, FIXED};
    }

    static {
        jv4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private jv4(String str, int i, long j) {
        this.signature = j;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static jv4 valueOf(String str) {
        return (jv4) Enum.valueOf(jv4.class, str);
    }

    public static jv4[] values() {
        return (jv4[]) $VALUES.clone();
    }

    public final long getSignature$kotlinx_serialization_protobuf() {
        return this.signature;
    }
}
