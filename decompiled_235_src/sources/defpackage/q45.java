package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q45  reason: default package */
/* loaded from: classes.dex */
public final class q45 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ q45[] $VALUES;
    private final long signature;
    public static final q45 DEFAULT = new q45("DEFAULT", 0, 0);
    public static final q45 SIGNED = new q45("SIGNED", 1, 8589934592L);
    public static final q45 FIXED = new q45("FIXED", 2, 17179869184L);

    private static final /* synthetic */ q45[] $values() {
        return new q45[]{DEFAULT, SIGNED, FIXED};
    }

    static {
        q45[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private q45(String str, int i, long j) {
        this.signature = j;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static q45 valueOf(String str) {
        return (q45) Enum.valueOf(q45.class, str);
    }

    public static q45[] values() {
        return (q45[]) $VALUES.clone();
    }

    public final long getSignature$kotlinx_serialization_protobuf() {
        return this.signature;
    }
}
