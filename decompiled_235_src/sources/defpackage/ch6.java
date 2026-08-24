package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ch6  reason: default package */
/* loaded from: classes.dex */
public final class ch6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ch6[] $VALUES;
    public static final ch6 START = new ch6("START", 0);
    public static final ch6 STOP = new ch6("STOP", 1);
    public static final ch6 STOP_AND_RESET_REPLAY_CACHE = new ch6("STOP_AND_RESET_REPLAY_CACHE", 2);

    private static final /* synthetic */ ch6[] $values() {
        return new ch6[]{START, STOP, STOP_AND_RESET_REPLAY_CACHE};
    }

    static {
        ch6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ch6(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ch6 valueOf(String str) {
        return (ch6) Enum.valueOf(ch6.class, str);
    }

    public static ch6[] values() {
        return (ch6[]) $VALUES.clone();
    }
}
