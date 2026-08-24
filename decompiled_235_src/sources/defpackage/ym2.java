package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ym2  reason: default package */
/* loaded from: classes.dex */
public final class ym2 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ym2[] $VALUES;
    public static final ym2 ON_CONFIGURE = new ym2("ON_CONFIGURE", 0);
    public static final ym2 ON_CREATE = new ym2("ON_CREATE", 1);
    public static final ym2 ON_UPGRADE = new ym2("ON_UPGRADE", 2);
    public static final ym2 ON_DOWNGRADE = new ym2("ON_DOWNGRADE", 3);
    public static final ym2 ON_OPEN = new ym2("ON_OPEN", 4);

    private static final /* synthetic */ ym2[] $values() {
        return new ym2[]{ON_CONFIGURE, ON_CREATE, ON_UPGRADE, ON_DOWNGRADE, ON_OPEN};
    }

    static {
        ym2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ym2(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ym2 valueOf(String str) {
        return (ym2) Enum.valueOf(ym2.class, str);
    }

    public static ym2[] values() {
        return (ym2[]) $VALUES.clone();
    }
}
