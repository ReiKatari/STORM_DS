package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h91  reason: default package */
/* loaded from: classes.dex */
public final class h91 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ h91[] $VALUES;
    public static final h91 BLACK_SCREEN = new h91("BLACK_SCREEN", 0);
    public static final h91 PHYSICAL_CAMERAS = new h91("PHYSICAL_CAMERAS", 1);
    public static final h91 STATIC_IMAGE = new h91("STATIC_IMAGE", 2);

    private static final /* synthetic */ h91[] $values() {
        return new h91[]{BLACK_SCREEN, PHYSICAL_CAMERAS, STATIC_IMAGE};
    }

    static {
        h91[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private h91(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static h91 valueOf(String str) {
        return (h91) Enum.valueOf(h91.class, str);
    }

    public static h91[] values() {
        return (h91[]) $VALUES.clone();
    }
}
