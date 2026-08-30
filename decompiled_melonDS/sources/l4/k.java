package l4;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ k[] $VALUES;
    public static final k Paragraph = new k("Paragraph", 0);
    public static final k Span = new k("Span", 1);
    public static final k VerbatimTts = new k("VerbatimTts", 2);
    public static final k Url = new k("Url", 3);
    public static final k Link = new k("Link", 4);
    public static final k Clickable = new k("Clickable", 5);
    public static final k String = new k("String", 6);

    private static final /* synthetic */ k[] $values() {
        return new k[]{Paragraph, Span, VerbatimTts, Url, Link, Clickable, String};
    }

    static {
        k[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private k(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) $VALUES.clone();
    }
}
