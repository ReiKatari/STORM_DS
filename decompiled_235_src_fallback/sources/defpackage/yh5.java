package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yh5  reason: default package */
/* loaded from: classes.dex */
public enum yh5 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.yh5[] $VALUES = null;
    public static final defpackage.yh5 CANON_EQ = null;
    public static final defpackage.yh5 COMMENTS = null;
    public static final defpackage.yh5 DOT_MATCHES_ALL = null;
    public static final defpackage.yh5 IGNORE_CASE = null;
    public static final defpackage.yh5 LITERAL = null;
    public static final defpackage.yh5 MULTILINE = null;
    public static final defpackage.yh5 UNIX_LINES = null;
    private final int mask;
    private final int value;

    private static final /* synthetic */ defpackage.yh5[] $values() {
            yh5 r0 = defpackage.yh5.IGNORE_CASE
            yh5 r1 = defpackage.yh5.MULTILINE
            yh5 r2 = defpackage.yh5.LITERAL
            yh5 r3 = defpackage.yh5.UNIX_LINES
            yh5 r4 = defpackage.yh5.COMMENTS
            yh5 r5 = defpackage.yh5.DOT_MATCHES_ALL
            yh5 r6 = defpackage.yh5.CANON_EQ
            yh5[] r0 = new defpackage.yh5[]{r0, r1, r2, r3, r4, r5, r6}
            return r0
    }

    static {
            yh5 r0 = new yh5
            r5 = 2
            r6 = 0
            java.lang.String r1 = "IGNORE_CASE"
            r2 = 0
            r3 = 2
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6)
            defpackage.yh5.IGNORE_CASE = r0
            yh5 r1 = new yh5
            r6 = 2
            r7 = 0
            java.lang.String r2 = "MULTILINE"
            r3 = 1
            r4 = 8
            r5 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7)
            defpackage.yh5.MULTILINE = r1
            yh5 r2 = new yh5
            r7 = 2
            r8 = 0
            java.lang.String r3 = "LITERAL"
            r4 = 2
            r5 = 16
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7, r8)
            defpackage.yh5.LITERAL = r2
            yh5 r3 = new yh5
            r8 = 2
            r9 = 0
            java.lang.String r4 = "UNIX_LINES"
            r5 = 3
            r6 = 1
            r7 = 0
            r3.<init>(r4, r5, r6, r7, r8, r9)
            defpackage.yh5.UNIX_LINES = r3
            yh5 r4 = new yh5
            r9 = 2
            r10 = 0
            java.lang.String r5 = "COMMENTS"
            r6 = 4
            r7 = 4
            r8 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10)
            defpackage.yh5.COMMENTS = r4
            yh5 r5 = new yh5
            r10 = 2
            r11 = 0
            java.lang.String r6 = "DOT_MATCHES_ALL"
            r7 = 5
            r8 = 32
            r9 = 0
            r5.<init>(r6, r7, r8, r9, r10, r11)
            defpackage.yh5.DOT_MATCHES_ALL = r5
            yh5 r6 = new yh5
            r11 = 2
            r12 = 0
            java.lang.String r7 = "CANON_EQ"
            r8 = 6
            r9 = 128(0x80, float:1.8E-43)
            r10 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            defpackage.yh5.CANON_EQ = r6
            yh5[] r0 = $values()
            defpackage.yh5.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.yh5.$ENTRIES = r0
            return
    }

    yh5(java.lang.String r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            r0.mask = r4
            return
    }

    /* synthetic */ yh5(java.lang.String r1, int r2, int r3, int r4, int r5, defpackage.id1 r6) {
            r0 = this;
            r5 = r5 & 2
            if (r5 == 0) goto L5
            r4 = r3
        L5:
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.yh5.$ENTRIES
            return r0
    }

    public static defpackage.yh5 valueOf(java.lang.String r1) {
            java.lang.Class<yh5> r0 = defpackage.yh5.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            yh5 r1 = (defpackage.yh5) r1
            return r1
    }

    public static defpackage.yh5[] values() {
            yh5[] r0 = defpackage.yh5.$VALUES
            java.lang.Object r0 = r0.clone()
            yh5[] r0 = (defpackage.yh5[]) r0
            return r0
    }

    public int getMask() {
            r0 = this;
            int r0 = r0.mask
            return r0
    }

    public int getValue() {
            r0 = this;
            int r0 = r0.value
            return r0
    }
}
