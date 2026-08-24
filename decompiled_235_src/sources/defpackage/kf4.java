package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kf4  reason: default package */
/* loaded from: classes.dex */
public final class kf4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ kf4[] $VALUES;
    public static final kf4 NOT_REQUIRED = new kf4("NOT_REQUIRED", 0);
    public static final kf4 CONNECTED = new kf4("CONNECTED", 1);
    public static final kf4 UNMETERED = new kf4("UNMETERED", 2);
    public static final kf4 NOT_ROAMING = new kf4("NOT_ROAMING", 3);
    public static final kf4 METERED = new kf4("METERED", 4);
    public static final kf4 TEMPORARILY_UNMETERED = new kf4("TEMPORARILY_UNMETERED", 5);

    private static final /* synthetic */ kf4[] $values() {
        return new kf4[]{NOT_REQUIRED, CONNECTED, UNMETERED, NOT_ROAMING, METERED, TEMPORARILY_UNMETERED};
    }

    static {
        kf4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private kf4(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static kf4 valueOf(String str) {
        return (kf4) Enum.valueOf(kf4.class, str);
    }

    public static kf4[] values() {
        return (kf4[]) $VALUES.clone();
    }
}
