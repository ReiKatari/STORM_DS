package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mc5  reason: default package */
/* loaded from: classes.dex */
public final class mc5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ mc5[] $VALUES;
    public static final mc5 RESUMABLE_SESSION = new mc5("RESUMABLE_SESSION", 0);
    public static final mc5 TERMINAL_STOP = new mc5("TERMINAL_STOP", 1);

    private static final /* synthetic */ mc5[] $values() {
        return new mc5[]{RESUMABLE_SESSION, TERMINAL_STOP};
    }

    static {
        mc5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private mc5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static mc5 valueOf(String str) {
        return (mc5) Enum.valueOf(mc5.class, str);
    }

    public static mc5[] values() {
        return (mc5[]) $VALUES.clone();
    }
}
