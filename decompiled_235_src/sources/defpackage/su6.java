package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: su6  reason: default package */
/* loaded from: classes.dex */
public final class su6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ su6[] $VALUES;
    public static final su6 END = new su6("END", 0);
    public static final su6 ROLLBACK = new su6("ROLLBACK", 1);
    public static final su6 BEGIN_EXCLUSIVE = new su6("BEGIN_EXCLUSIVE", 2);
    public static final su6 BEGIN_IMMEDIATE = new su6("BEGIN_IMMEDIATE", 3);
    public static final su6 BEGIN_DEFERRED = new su6("BEGIN_DEFERRED", 4);

    private static final /* synthetic */ su6[] $values() {
        return new su6[]{END, ROLLBACK, BEGIN_EXCLUSIVE, BEGIN_IMMEDIATE, BEGIN_DEFERRED};
    }

    static {
        su6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private su6(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static su6 valueOf(String str) {
        return (su6) Enum.valueOf(su6.class, str);
    }

    public static su6[] values() {
        return (su6[]) $VALUES.clone();
    }
}
