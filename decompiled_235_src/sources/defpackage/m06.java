package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m06  reason: default package */
/* loaded from: classes.dex */
public final class m06 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ m06[] $VALUES;
    public static final m06 SCANNING = new m06("SCANNING", 0);
    public static final m06 NOT_SCANNING = new m06("NOT_SCANNING", 1);

    private static final /* synthetic */ m06[] $values() {
        return new m06[]{SCANNING, NOT_SCANNING};
    }

    static {
        m06[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private m06(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static m06 valueOf(String str) {
        return (m06) Enum.valueOf(m06.class, str);
    }

    public static m06[] values() {
        return (m06[]) $VALUES.clone();
    }
}
