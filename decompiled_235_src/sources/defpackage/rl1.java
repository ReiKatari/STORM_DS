package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rl1  reason: default package */
/* loaded from: classes.dex */
public final class rl1 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ rl1[] $VALUES;
    public static final rl1 FILE = new rl1("FILE", 0);
    public static final rl1 DIRECTORY = new rl1("DIRECTORY", 1);

    private static final /* synthetic */ rl1[] $values() {
        return new rl1[]{FILE, DIRECTORY};
    }

    static {
        rl1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private rl1(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static rl1 valueOf(String str) {
        return (rl1) Enum.valueOf(rl1.class, str);
    }

    public static rl1[] values() {
        return (rl1[]) $VALUES.clone();
    }
}
