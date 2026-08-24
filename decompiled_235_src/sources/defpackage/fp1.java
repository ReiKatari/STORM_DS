package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fp1  reason: default package */
/* loaded from: classes.dex */
public final class fp1 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ fp1[] $VALUES;
    public static final fp1 Closed = new fp1("Closed", 0);
    public static final fp1 Open = new fp1("Open", 1);

    private static final /* synthetic */ fp1[] $values() {
        return new fp1[]{Closed, Open};
    }

    static {
        fp1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private fp1(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static fp1 valueOf(String str) {
        return (fp1) Enum.valueOf(fp1.class, str);
    }

    public static fp1[] values() {
        return (fp1[]) $VALUES.clone();
    }
}
