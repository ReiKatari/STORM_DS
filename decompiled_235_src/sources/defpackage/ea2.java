package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ea2  reason: default package */
/* loaded from: classes.dex */
public final class ea2 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ea2[] $VALUES;
    public static final ea2 KEY_PRESS = new ea2("KEY_PRESS", 0);
    public static final ea2 KEY_RELEASE = new ea2("KEY_RELEASE", 1);

    private static final /* synthetic */ ea2[] $values() {
        return new ea2[]{KEY_PRESS, KEY_RELEASE};
    }

    static {
        ea2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ea2(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ea2 valueOf(String str) {
        return (ea2) Enum.valueOf(ea2.class, str);
    }

    public static ea2[] values() {
        return (ea2[]) $VALUES.clone();
    }
}
