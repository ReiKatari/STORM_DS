package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kp  reason: default package */
/* loaded from: classes.dex */
public enum kp extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.kp[] $VALUES = null;
    public static final defpackage.kp Clickable = null;
    public static final defpackage.kp Link = null;
    public static final defpackage.kp Paragraph = null;
    public static final defpackage.kp Span = null;
    public static final defpackage.kp String = null;
    public static final defpackage.kp Url = null;
    public static final defpackage.kp VerbatimTts = null;

    private static final /* synthetic */ defpackage.kp[] $values() {
            kp r0 = defpackage.kp.Paragraph
            kp r1 = defpackage.kp.Span
            kp r2 = defpackage.kp.VerbatimTts
            kp r3 = defpackage.kp.Url
            kp r4 = defpackage.kp.Link
            kp r5 = defpackage.kp.Clickable
            kp r6 = defpackage.kp.String
            kp[] r0 = new defpackage.kp[]{r0, r1, r2, r3, r4, r5, r6}
            return r0
    }

    static {
            kp r0 = new kp
            java.lang.String r1 = "Paragraph"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.kp.Paragraph = r0
            kp r0 = new kp
            java.lang.String r1 = "Span"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.kp.Span = r0
            kp r0 = new kp
            java.lang.String r1 = "VerbatimTts"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.kp.VerbatimTts = r0
            kp r0 = new kp
            java.lang.String r1 = "Url"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.kp.Url = r0
            kp r0 = new kp
            java.lang.String r1 = "Link"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.kp.Link = r0
            kp r0 = new kp
            java.lang.String r1 = "Clickable"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.kp.Clickable = r0
            kp r0 = new kp
            java.lang.String r1 = "String"
            r2 = 6
            r0.<init>(r1, r2)
            defpackage.kp.String = r0
            kp[] r0 = $values()
            defpackage.kp.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.kp.$ENTRIES = r0
            return
    }

    kp(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.kp.$ENTRIES
            return r0
    }

    public static defpackage.kp valueOf(java.lang.String r1) {
            java.lang.Class<kp> r0 = defpackage.kp.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            kp r1 = (defpackage.kp) r1
            return r1
    }

    public static defpackage.kp[] values() {
            kp[] r0 = defpackage.kp.$VALUES
            java.lang.Object r0 = r0.clone()
            kp[] r0 = (defpackage.kp[]) r0
            return r0
    }
}
