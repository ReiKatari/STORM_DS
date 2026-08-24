package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yv2  reason: default package */
/* loaded from: classes.dex */
public final class yv2 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ yv2[] $VALUES;
    public static final yv2 SYNC_AND_EXIT = new yv2("SYNC_AND_EXIT", 0);
    public static final yv2 CONTINUE_PLAYING = new yv2("CONTINUE_PLAYING", 1);
    public static final yv2 DISCARD_AND_EXIT = new yv2("DISCARD_AND_EXIT", 2);

    private static final /* synthetic */ yv2[] $values() {
        return new yv2[]{SYNC_AND_EXIT, CONTINUE_PLAYING, DISCARD_AND_EXIT};
    }

    static {
        yv2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private yv2(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static yv2 valueOf(String str) {
        return (yv2) Enum.valueOf(yv2.class, str);
    }

    public static yv2[] values() {
        return (yv2[]) $VALUES.clone();
    }
}
