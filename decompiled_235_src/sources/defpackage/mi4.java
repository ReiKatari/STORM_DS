package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mi4  reason: default package */
/* loaded from: classes.dex */
public final class mi4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ mi4[] $VALUES;
    public static final mi4 SYNC_NOW = new mi4("SYNC_NOW", 0);
    public static final mi4 CONTINUE_OFFLINE = new mi4("CONTINUE_OFFLINE", 1);

    private static final /* synthetic */ mi4[] $values() {
        return new mi4[]{SYNC_NOW, CONTINUE_OFFLINE};
    }

    static {
        mi4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private mi4(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static mi4 valueOf(String str) {
        return (mi4) Enum.valueOf(mi4.class, str);
    }

    public static mi4[] values() {
        return (mi4[]) $VALUES.clone();
    }
}
