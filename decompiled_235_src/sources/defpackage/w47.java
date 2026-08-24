package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w47  reason: default package */
/* loaded from: classes.dex */
public final class w47 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ w47[] $VALUES;
    public static final w47 Shown = new w47("Shown", 0);
    public static final w47 Hidden = new w47("Hidden", 1);

    private static final /* synthetic */ w47[] $values() {
        return new w47[]{Shown, Hidden};
    }

    static {
        w47[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private w47(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static w47 valueOf(String str) {
        return (w47) Enum.valueOf(w47.class, str);
    }

    public static w47[] values() {
        return (w47[]) $VALUES.clone();
    }
}
