package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i6  reason: default package */
/* loaded from: classes.dex */
public final class i6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ i6[] $VALUES;
    public static final i6 RC_CLIENT = new i6("RC_CLIENT", 0);
    public static final i6 LEGACY_KOTLIN = new i6("LEGACY_KOTLIN", 1);

    private static final /* synthetic */ i6[] $values() {
        return new i6[]{RC_CLIENT, LEGACY_KOTLIN};
    }

    static {
        i6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private i6(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static i6 valueOf(String str) {
        return (i6) Enum.valueOf(i6.class, str);
    }

    public static i6[] values() {
        return (i6[]) $VALUES.clone();
    }
}
