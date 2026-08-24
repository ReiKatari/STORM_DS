package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m71  reason: default package */
/* loaded from: classes.dex */
public final class m71 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ m71[] $VALUES;
    public static final m71 CROSSED = new m71("CROSSED", 0);
    public static final m71 NOT_CROSSED = new m71("NOT_CROSSED", 1);
    public static final m71 COLLAPSED = new m71("COLLAPSED", 2);

    private static final /* synthetic */ m71[] $values() {
        return new m71[]{CROSSED, NOT_CROSSED, COLLAPSED};
    }

    static {
        m71[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private m71(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static m71 valueOf(String str) {
        return (m71) Enum.valueOf(m71.class, str);
    }

    public static m71[] values() {
        return (m71[]) $VALUES.clone();
    }
}
