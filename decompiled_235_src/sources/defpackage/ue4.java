package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ue4  reason: default package */
/* loaded from: classes.dex */
public final class ue4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ue4[] $VALUES;
    public static final ue4 CONNECTED = new ue4("CONNECTED", 0);
    public static final ue4 DISCONNECTED = new ue4("DISCONNECTED", 1);

    private static final /* synthetic */ ue4[] $values() {
        return new ue4[]{CONNECTED, DISCONNECTED};
    }

    static {
        ue4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ue4(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ue4 valueOf(String str) {
        return (ue4) Enum.valueOf(ue4.class, str);
    }

    public static ue4[] values() {
        return (ue4[]) $VALUES.clone();
    }
}
