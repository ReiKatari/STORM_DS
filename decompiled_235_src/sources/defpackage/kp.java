package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kp  reason: default package */
/* loaded from: classes.dex */
public final class kp {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ kp[] $VALUES;
    public static final kp Paragraph = new kp("Paragraph", 0);
    public static final kp Span = new kp("Span", 1);
    public static final kp VerbatimTts = new kp("VerbatimTts", 2);
    public static final kp Url = new kp("Url", 3);
    public static final kp Link = new kp("Link", 4);
    public static final kp Clickable = new kp("Clickable", 5);
    public static final kp String = new kp("String", 6);

    private static final /* synthetic */ kp[] $values() {
        return new kp[]{Paragraph, Span, VerbatimTts, Url, Link, Clickable, String};
    }

    static {
        kp[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private kp(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static kp valueOf(String str) {
        return (kp) Enum.valueOf(kp.class, str);
    }

    public static kp[] values() {
        return (kp[]) $VALUES.clone();
    }
}
