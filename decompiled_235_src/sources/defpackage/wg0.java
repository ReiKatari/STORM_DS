package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wg0  reason: default package */
/* loaded from: classes.dex */
public final class wg0 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ wg0[] $VALUES;
    public static final wg0 CAMERA = new wg0("CAMERA", 0);
    public static final wg0 SCOPE = new wg0("SCOPE", 1);
    public static final wg0 THREAD = new wg0("THREAD", 2);

    private static final /* synthetic */ wg0[] $values() {
        return new wg0[]{CAMERA, SCOPE, THREAD};
    }

    static {
        wg0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private wg0(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static wg0 valueOf(String str) {
        return (wg0) Enum.valueOf(wg0.class, str);
    }

    public static wg0[] values() {
        return (wg0[]) $VALUES.clone();
    }
}
