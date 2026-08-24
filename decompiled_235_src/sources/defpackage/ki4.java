package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ki4  reason: default package */
/* loaded from: classes.dex */
public final class ki4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ki4[] $VALUES;
    public static final ki4 MALE = new ki4("MALE", 0);
    public static final ki4 FEMALE = new ki4("FEMALE", 1);
    public static final ki4 NEUTRAL = new ki4("NEUTRAL", 2);

    private static final /* synthetic */ ki4[] $values() {
        return new ki4[]{MALE, FEMALE, NEUTRAL};
    }

    static {
        ki4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ki4(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ki4 valueOf(String str) {
        return (ki4) Enum.valueOf(ki4.class, str);
    }

    public static ki4[] values() {
        return (ki4[]) $VALUES.clone();
    }
}
