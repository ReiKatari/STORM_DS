package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qc5  reason: default package */
/* loaded from: classes.dex */
public final class qc5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ qc5[] $VALUES;
    public static final qc5 START_SYNC = new qc5("START_SYNC", 0);
    public static final qc5 REOPEN_PAUSE_MENU = new qc5("REOPEN_PAUSE_MENU", 1);

    private static final /* synthetic */ qc5[] $values() {
        return new qc5[]{START_SYNC, REOPEN_PAUSE_MENU};
    }

    static {
        qc5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private qc5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static qc5 valueOf(String str) {
        return (qc5) Enum.valueOf(qc5.class, str);
    }

    public static qc5[] values() {
        return (qc5[]) $VALUES.clone();
    }
}
