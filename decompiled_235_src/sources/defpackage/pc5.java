package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pc5  reason: default package */
/* loaded from: classes.dex */
public final class pc5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ pc5[] $VALUES;
    public static final pc5 SYNC_COMPLETED = new pc5("SYNC_COMPLETED", 0);
    public static final pc5 SYNC_INCOMPLETE = new pc5("SYNC_INCOMPLETE", 1);
    public static final pc5 CONTINUE_PLAYING = new pc5("CONTINUE_PLAYING", 2);
    public static final pc5 DISCARD_COMPLETED = new pc5("DISCARD_COMPLETED", 3);
    public static final pc5 DISCARD_INCOMPLETE = new pc5("DISCARD_INCOMPLETE", 4);

    private static final /* synthetic */ pc5[] $values() {
        return new pc5[]{SYNC_COMPLETED, SYNC_INCOMPLETE, CONTINUE_PLAYING, DISCARD_COMPLETED, DISCARD_INCOMPLETE};
    }

    static {
        pc5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private pc5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static pc5 valueOf(String str) {
        return (pc5) Enum.valueOf(pc5.class, str);
    }

    public static pc5[] values() {
        return (pc5[]) $VALUES.clone();
    }
}
