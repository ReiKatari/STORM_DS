package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c11  reason: default package */
/* loaded from: classes.dex */
public final class c11 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ c11[] $VALUES;
    public static final c11 DS_LITE_BLACK = new c11("DS_LITE_BLACK", 0);
    public static final c11 DS_LITE_WHITE = new c11("DS_LITE_WHITE", 1);
    public static final c11 DSI_XL_BLUE = new c11("DSI_XL_BLUE", 2);
    public static final c11 CRIMSON_RED = new c11("CRIMSON_RED", 3);
    public static final c11 N3DS_AQUA = new c11("N3DS_AQUA", 4);
    public static final c11 N3DS_BLACK = new c11("N3DS_BLACK", 5);

    private static final /* synthetic */ c11[] $values() {
        return new c11[]{DS_LITE_BLACK, DS_LITE_WHITE, DSI_XL_BLUE, CRIMSON_RED, N3DS_AQUA, N3DS_BLACK};
    }

    static {
        c11[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private c11(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static c11 valueOf(String str) {
        return (c11) Enum.valueOf(c11.class, str);
    }

    public static c11[] values() {
        return (c11[]) $VALUES.clone();
    }
}
