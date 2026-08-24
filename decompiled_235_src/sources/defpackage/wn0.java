package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wn0  reason: default package */
/* loaded from: classes.dex */
public final class wn0 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ wn0[] $VALUES;
    public static final wn0 CANNOT_BE_EMPTY = new wn0("CANNOT_BE_EMPTY", 0);
    public static final wn0 INVALID_FORMAT = new wn0("INVALID_FORMAT", 1);

    private static final /* synthetic */ wn0[] $values() {
        return new wn0[]{CANNOT_BE_EMPTY, INVALID_FORMAT};
    }

    static {
        wn0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private wn0(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static wn0 valueOf(String str) {
        return (wn0) Enum.valueOf(wn0.class, str);
    }

    public static wn0[] values() {
        return (wn0[]) $VALUES.clone();
    }
}
