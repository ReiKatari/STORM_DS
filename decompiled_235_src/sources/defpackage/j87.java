package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j87  reason: default package */
/* loaded from: classes.dex */
public final class j87 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ j87[] $VALUES;
    public static final j87 Uninitialized = new j87("Uninitialized", 0);
    public static final j87 Detached = new j87("Detached", 1);
    public static final j87 Attached = new j87("Attached", 2);

    private static final /* synthetic */ j87[] $values() {
        return new j87[]{Uninitialized, Detached, Attached};
    }

    static {
        j87[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private j87(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static j87 valueOf(String str) {
        return (j87) Enum.valueOf(j87.class, str);
    }

    public static j87[] values() {
        return (j87[]) $VALUES.clone();
    }
}
