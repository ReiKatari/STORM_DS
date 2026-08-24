package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qw5  reason: default package */
/* loaded from: classes.dex */
public final class qw5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ qw5[] $VALUES;
    public static final qw5 ALL = new qw5("ALL", 0);
    public static final qw5 FAVORITES = new qw5("FAVORITES", 1);
    public static final qw5 DS_ONLY = new qw5("DS_ONLY", 2);
    public static final qw5 DSIWARE_ONLY = new qw5("DSIWARE_ONLY", 3);
    public static final qw5 WITH_RETRO_ACHIEVEMENTS = new qw5("WITH_RETRO_ACHIEVEMENTS", 4);

    private static final /* synthetic */ qw5[] $values() {
        return new qw5[]{ALL, FAVORITES, DS_ONLY, DSIWARE_ONLY, WITH_RETRO_ACHIEVEMENTS};
    }

    static {
        qw5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private qw5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static qw5 valueOf(String str) {
        return (qw5) Enum.valueOf(qw5.class, str);
    }

    public static qw5[] values() {
        return (qw5[]) $VALUES.clone();
    }
}
