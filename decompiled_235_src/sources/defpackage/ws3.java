package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ws3  reason: default package */
/* loaded from: classes.dex */
public final class ws3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ws3[] $VALUES;
    public static final ws3 RC_CLIENT = new ws3("RC_CLIENT", 0);
    public static final ws3 LEGACY = new ws3("LEGACY", 1);
    public static final ws3 NONE = new ws3("NONE", 2);

    private static final /* synthetic */ ws3[] $values() {
        return new ws3[]{RC_CLIENT, LEGACY, NONE};
    }

    static {
        ws3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ws3(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ws3 valueOf(String str) {
        return (ws3) Enum.valueOf(ws3.class, str);
    }

    public static ws3[] values() {
        return (ws3[]) $VALUES.clone();
    }
}
