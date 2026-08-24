package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xy1  reason: default package */
/* loaded from: classes.dex */
public final class xy1 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ xy1[] $VALUES;
    public static final xy1 SAVING = new xy1("SAVING", 0);
    public static final xy1 LOADING = new xy1("LOADING", 1);

    private static final /* synthetic */ xy1[] $values() {
        return new xy1[]{SAVING, LOADING};
    }

    static {
        xy1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private xy1(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static xy1 valueOf(String str) {
        return (xy1) Enum.valueOf(xy1.class, str);
    }

    public static xy1[] values() {
        return (xy1[]) $VALUES.clone();
    }
}
