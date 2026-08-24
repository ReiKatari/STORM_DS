package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: al6  reason: default package */
/* loaded from: classes.dex */
public final class al6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ al6[] $VALUES;
    public static final al6 Short = new al6("Short", 0);
    public static final al6 Long = new al6("Long", 1);
    public static final al6 Indefinite = new al6("Indefinite", 2);

    private static final /* synthetic */ al6[] $values() {
        return new al6[]{Short, Long, Indefinite};
    }

    static {
        al6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private al6(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static al6 valueOf(String str) {
        return (al6) Enum.valueOf(al6.class, str);
    }

    public static al6[] values() {
        return (al6[]) $VALUES.clone();
    }
}
