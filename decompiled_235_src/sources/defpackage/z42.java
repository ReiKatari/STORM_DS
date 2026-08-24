package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z42  reason: default package */
/* loaded from: classes.dex */
public final class z42 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ z42[] $VALUES;
    public static final z42 PreEnter = new z42("PreEnter", 0);
    public static final z42 Visible = new z42("Visible", 1);
    public static final z42 PostExit = new z42("PostExit", 2);

    private static final /* synthetic */ z42[] $values() {
        return new z42[]{PreEnter, Visible, PostExit};
    }

    static {
        z42[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private z42(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static z42 valueOf(String str) {
        return (z42) Enum.valueOf(z42.class, str);
    }

    public static z42[] values() {
        return (z42[]) $VALUES.clone();
    }
}
