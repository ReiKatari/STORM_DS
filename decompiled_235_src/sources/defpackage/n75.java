package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n75  reason: default package */
/* loaded from: classes.dex */
public final class n75 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ n75[] $VALUES;
    public static final n75 CORE = new n75("CORE", 0);
    public static final n75 UNOFFICIAL = new n75("UNOFFICIAL", 1);

    private static final /* synthetic */ n75[] $values() {
        return new n75[]{CORE, UNOFFICIAL};
    }

    static {
        n75[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private n75(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static n75 valueOf(String str) {
        return (n75) Enum.valueOf(n75.class, str);
    }

    public static n75[] values() {
        return (n75[]) $VALUES.clone();
    }
}
