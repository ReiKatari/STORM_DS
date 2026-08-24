package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d63  reason: default package */
/* loaded from: classes.dex */
public final class d63 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ d63[] $VALUES;
    public static final d63 POSITIVE = new d63("POSITIVE", 0);
    public static final d63 NEGATIVE = new d63("NEGATIVE", 1);

    private static final /* synthetic */ d63[] $values() {
        return new d63[]{POSITIVE, NEGATIVE};
    }

    static {
        d63[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private d63(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static d63 valueOf(String str) {
        return (d63) Enum.valueOf(d63.class, str);
    }

    public static d63[] values() {
        return (d63[]) $VALUES.clone();
    }
}
