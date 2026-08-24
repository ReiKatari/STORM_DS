package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ca6  reason: default package */
/* loaded from: classes.dex */
public final class ca6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ca6[] $VALUES;
    public static final ca6 EditableText = new ca6("EditableText", 0);
    public static final ca6 StaticText = new ca6("StaticText", 1);

    private static final /* synthetic */ ca6[] $values() {
        return new ca6[]{EditableText, StaticText};
    }

    static {
        ca6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ca6(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ca6 valueOf(String str) {
        return (ca6) Enum.valueOf(ca6.class, str);
    }

    public static ca6[] values() {
        return (ca6[]) $VALUES.clone();
    }
}
