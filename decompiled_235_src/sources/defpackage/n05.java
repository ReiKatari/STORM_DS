package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n05  reason: default package */
/* loaded from: classes.dex */
public final class n05 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ n05[] $VALUES;
    public static final n05 EXACT = new n05("EXACT", 0);
    public static final n05 INEXACT = new n05("INEXACT", 1);
    public static final n05 AUTOMATIC = new n05("AUTOMATIC", 2);

    private static final /* synthetic */ n05[] $values() {
        return new n05[]{EXACT, INEXACT, AUTOMATIC};
    }

    static {
        n05[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private n05(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static n05 valueOf(String str) {
        return (n05) Enum.valueOf(n05.class, str);
    }

    public static n05[] values() {
        return (n05[]) $VALUES.clone();
    }
}
