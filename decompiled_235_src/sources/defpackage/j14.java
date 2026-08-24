package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j14  reason: default package */
/* loaded from: classes.dex */
public final class j14 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ j14[] $VALUES;
    public static final j14 SHOW_ICON = new j14("SHOW_ICON", 0);
    public static final j14 SHOW_FULL = new j14("SHOW_FULL", 1);

    private static final /* synthetic */ j14[] $values() {
        return new j14[]{SHOW_ICON, SHOW_FULL};
    }

    static {
        j14[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private j14(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static j14 valueOf(String str) {
        return (j14) Enum.valueOf(j14.class, str);
    }

    public static j14[] values() {
        return (j14[]) $VALUES.clone();
    }
}
