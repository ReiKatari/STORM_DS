package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yo  reason: default package */
/* loaded from: classes.dex */
public final class yo {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ yo[] $VALUES;
    public static final yo Paragraph = new yo("Paragraph", 0);
    public static final yo Span = new yo("Span", 1);
    public static final yo VerbatimTts = new yo("VerbatimTts", 2);
    public static final yo Url = new yo("Url", 3);
    public static final yo Link = new yo("Link", 4);
    public static final yo Clickable = new yo("Clickable", 5);
    public static final yo String = new yo("String", 6);

    private static final /* synthetic */ yo[] $values() {
        return new yo[]{Paragraph, Span, VerbatimTts, Url, Link, Clickable, String};
    }

    static {
        yo[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private yo(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static yo valueOf(String str) {
        return (yo) Enum.valueOf(yo.class, str);
    }

    public static yo[] values() {
        return (yo[]) $VALUES.clone();
    }
}
