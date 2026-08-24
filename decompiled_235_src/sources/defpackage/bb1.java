package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bb1  reason: default package */
/* loaded from: classes.dex */
public final class bb1 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ bb1[] $VALUES;
    private final String fileName;
    public static final bb1 PUBLIC_SAV = new bb1("PUBLIC_SAV", 0, "public.sav");
    public static final bb1 PRIVATE_SAV = new bb1("PRIVATE_SAV", 1, "private.sav");
    public static final bb1 BANNER_SAV = new bb1("BANNER_SAV", 2, "banner.sav");

    private static final /* synthetic */ bb1[] $values() {
        return new bb1[]{PUBLIC_SAV, PRIVATE_SAV, BANNER_SAV};
    }

    static {
        bb1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private bb1(String str, int i, String str2) {
        this.fileName = str2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static bb1 valueOf(String str) {
        return (bb1) Enum.valueOf(bb1.class, str);
    }

    public static bb1[] values() {
        return (bb1[]) $VALUES.clone();
    }

    public final String getFileName() {
        return this.fileName;
    }
}
