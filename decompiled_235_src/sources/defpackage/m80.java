package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m80  reason: default package */
/* loaded from: classes.dex */
public final class m80 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ m80[] $VALUES;
    public static final m80 SUSPEND = new m80("SUSPEND", 0);
    public static final m80 DROP_OLDEST = new m80("DROP_OLDEST", 1);
    public static final m80 DROP_LATEST = new m80("DROP_LATEST", 2);

    private static final /* synthetic */ m80[] $values() {
        return new m80[]{SUSPEND, DROP_OLDEST, DROP_LATEST};
    }

    static {
        m80[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private m80(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static m80 valueOf(String str) {
        return (m80) Enum.valueOf(m80.class, str);
    }

    public static m80[] values() {
        return (m80[]) $VALUES.clone();
    }
}
