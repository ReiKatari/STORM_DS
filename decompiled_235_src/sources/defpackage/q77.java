package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q77  reason: default package */
/* loaded from: classes.dex */
public final class q77 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ q77[] $VALUES;
    public static final q77 SOFTCORE = new q77("SOFTCORE", 0);
    public static final q77 HARDCORE = new q77("HARDCORE", 1);
    public static final q77 SOFTCORE_OFFLINE = new q77("SOFTCORE_OFFLINE", 2);

    private static final /* synthetic */ q77[] $values() {
        return new q77[]{SOFTCORE, HARDCORE, SOFTCORE_OFFLINE};
    }

    static {
        q77[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private q77(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static q77 valueOf(String str) {
        return (q77) Enum.valueOf(q77.class, str);
    }

    public static q77[] values() {
        return (q77[]) $VALUES.clone();
    }
}
