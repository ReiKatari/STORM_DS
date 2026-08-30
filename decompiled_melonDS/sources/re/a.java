package re;

import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ a[] $VALUES;
    private final String fileName;
    public static final a PUBLIC_SAV = new a("PUBLIC_SAV", 0, "public.sav");
    public static final a PRIVATE_SAV = new a("PRIVATE_SAV", 1, "private.sav");
    public static final a BANNER_SAV = new a("BANNER_SAV", 2, "banner.sav");

    private static final /* synthetic */ a[] $values() {
        return new a[]{PUBLIC_SAV, PRIVATE_SAV, BANNER_SAV};
    }

    static {
        a[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private a(String str, int i2, String str2) {
        this.fileName = str2;
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final String getFileName() {
        return this.fileName;
    }
}
