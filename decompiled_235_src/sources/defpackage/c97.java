package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c97  reason: default package */
/* loaded from: classes.dex */
public final class c97 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ c97[] $VALUES;
    public static final c97 DEFERRED = new c97("DEFERRED", 0);
    public static final c97 IMMEDIATE = new c97("IMMEDIATE", 1);
    public static final c97 EXCLUSIVE = new c97("EXCLUSIVE", 2);

    private static final /* synthetic */ c97[] $values() {
        return new c97[]{DEFERRED, IMMEDIATE, EXCLUSIVE};
    }

    static {
        c97[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private c97(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static c97 valueOf(String str) {
        return (c97) Enum.valueOf(c97.class, str);
    }

    public static c97[] values() {
        return (c97[]) $VALUES.clone();
    }
}
