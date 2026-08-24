package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jw5  reason: default package */
/* loaded from: classes.dex */
public final class jw5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ jw5[] $VALUES;
    public static final jw5 UPDATED = new jw5("UPDATED", 0);
    public static final jw5 UNCHANGED = new jw5("UNCHANGED", 1);
    public static final jw5 NOT_SCANNED = new jw5("NOT_SCANNED", 2);

    private static final /* synthetic */ jw5[] $values() {
        return new jw5[]{UPDATED, UNCHANGED, NOT_SCANNED};
    }

    static {
        jw5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private jw5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static jw5 valueOf(String str) {
        return (jw5) Enum.valueOf(jw5.class, str);
    }

    public static jw5[] values() {
        return (jw5[]) $VALUES.clone();
    }
}
