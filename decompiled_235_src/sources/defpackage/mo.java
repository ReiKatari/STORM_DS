package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mo  reason: default package */
/* loaded from: classes.dex */
public final class mo {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ mo[] $VALUES;
    public static final mo BoundReached = new mo("BoundReached", 0);
    public static final mo Finished = new mo("Finished", 1);

    private static final /* synthetic */ mo[] $values() {
        return new mo[]{BoundReached, Finished};
    }

    static {
        mo[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private mo(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static mo valueOf(String str) {
        return (mo) Enum.valueOf(mo.class, str);
    }

    public static mo[] values() {
        return (mo[]) $VALUES.clone();
    }
}
