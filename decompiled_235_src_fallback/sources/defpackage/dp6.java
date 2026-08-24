package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dp6  reason: default package */
/* loaded from: classes.dex */
public enum dp6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.dp6[] $VALUES = null;
    public static final defpackage.dp6 CR = null;
    public static final defpackage.dp6 CRLF = null;
    public static final defpackage.dp6 LF = null;
    private final java.lang.String lineSeparator;

    private static /* synthetic */ defpackage.dp6[] $values() {
            dp6 r0 = defpackage.dp6.CR
            dp6 r1 = defpackage.dp6.CRLF
            dp6 r2 = defpackage.dp6.LF
            dp6[] r0 = new defpackage.dp6[]{r0, r1, r2}
            return r0
    }

    static {
            dp6 r0 = new dp6
            r1 = 0
            java.lang.String r2 = "\r"
            java.lang.String r3 = "CR"
            r0.<init>(r3, r1, r2)
            defpackage.dp6.CR = r0
            dp6 r0 = new dp6
            r1 = 1
            java.lang.String r2 = "\r\n"
            java.lang.String r3 = "CRLF"
            r0.<init>(r3, r1, r2)
            defpackage.dp6.CRLF = r0
            dp6 r0 = new dp6
            r1 = 2
            java.lang.String r2 = "\n"
            java.lang.String r3 = "LF"
            r0.<init>(r3, r1, r2)
            defpackage.dp6.LF = r0
            dp6[] r0 = $values()
            defpackage.dp6.$VALUES = r0
            return
    }

    dp6(java.lang.String r1, int r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2)
            java.lang.String r1 = "lineSeparator"
            java.util.Objects.requireNonNull(r3, r1)
            r0.lineSeparator = r3
            return
    }

    public static defpackage.dp6 valueOf(java.lang.String r1) {
            java.lang.Class<dp6> r0 = defpackage.dp6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            dp6 r1 = (defpackage.dp6) r1
            return r1
    }

    public static defpackage.dp6[] values() {
            dp6[] r0 = defpackage.dp6.$VALUES
            java.lang.Object r0 = r0.clone()
            dp6[] r0 = (defpackage.dp6[]) r0
            return r0
    }

    public byte[] getBytes(java.nio.charset.Charset r1) {
            r0 = this;
            java.lang.String r0 = r0.lineSeparator
            byte[] r0 = r0.getBytes(r1)
            return r0
    }

    public java.lang.String getString() {
            r0 = this;
            java.lang.String r0 = r0.lineSeparator
            return r0
    }
}
