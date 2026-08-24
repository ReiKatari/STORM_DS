package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nc5  reason: default package */
/* loaded from: classes.dex */
public final class nc5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ nc5[] $VALUES;
    public static final nc5 EXIT = new nc5("EXIT", 0);
    public static final nc5 RESUME_SESSION = new nc5("RESUME_SESSION", 1);
    public static final nc5 KEEP_SESSION_PAUSED = new nc5("KEEP_SESSION_PAUSED", 2);

    private static final /* synthetic */ nc5[] $values() {
        return new nc5[]{EXIT, RESUME_SESSION, KEEP_SESSION_PAUSED};
    }

    static {
        nc5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private nc5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static nc5 valueOf(String str) {
        return (nc5) Enum.valueOf(nc5.class, str);
    }

    public static nc5[] values() {
        return (nc5[]) $VALUES.clone();
    }
}
