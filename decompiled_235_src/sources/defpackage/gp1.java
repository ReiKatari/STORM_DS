package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gp1  reason: default package */
/* loaded from: classes.dex */
public final class gp1 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ gp1[] $VALUES;
    public static final gp1 ACTIVE = new gp1("ACTIVE", 0);
    public static final gp1 INSTALLED = new gp1("INSTALLED", 1);
    public static final gp1 NOT_INSTALLED = new gp1("NOT_INSTALLED", 2);

    private static final /* synthetic */ gp1[] $values() {
        return new gp1[]{ACTIVE, INSTALLED, NOT_INSTALLED};
    }

    static {
        gp1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private gp1(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static gp1 valueOf(String str) {
        return (gp1) Enum.valueOf(gp1.class, str);
    }

    public static gp1[] values() {
        return (gp1[]) $VALUES.clone();
    }
}
