package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dn5  reason: default package */
/* loaded from: classes.dex */
public final class dn5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ dn5[] $VALUES;
    public static final dn5 OFFICIAL = new dn5("OFFICIAL", 0);
    public static final dn5 RA_OFFLINE_PROXY = new dn5("RA_OFFLINE_PROXY", 1);
    public static final dn5 RA_OFFLINE_PROXY_UNAVAILABLE = new dn5("RA_OFFLINE_PROXY_UNAVAILABLE", 2);

    private static final /* synthetic */ dn5[] $values() {
        return new dn5[]{OFFICIAL, RA_OFFLINE_PROXY, RA_OFFLINE_PROXY_UNAVAILABLE};
    }

    static {
        dn5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private dn5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static dn5 valueOf(String str) {
        return (dn5) Enum.valueOf(dn5.class, str);
    }

    public static dn5[] values() {
        return (dn5[]) $VALUES.clone();
    }
}
