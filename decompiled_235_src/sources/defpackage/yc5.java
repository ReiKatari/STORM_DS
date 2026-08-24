package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yc5  reason: default package */
/* loaded from: classes.dex */
public final class yc5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ yc5[] $VALUES;
    public static final yc5 RC_CLIENT = new yc5("RC_CLIENT", 0);
    public static final yc5 LEGACY_KOTLIN = new yc5("LEGACY_KOTLIN", 1);
    public static final yc5 NONE = new yc5("NONE", 2);

    private static final /* synthetic */ yc5[] $values() {
        return new yc5[]{RC_CLIENT, LEGACY_KOTLIN, NONE};
    }

    static {
        yc5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private yc5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static yc5 valueOf(String str) {
        return (yc5) Enum.valueOf(yc5.class, str);
    }

    public static yc5[] values() {
        return (yc5[]) $VALUES.clone();
    }
}
