package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a62  reason: default package */
/* loaded from: classes.dex */
public enum a62 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.a62[] $VALUES = null;
    public static final defpackage.a62 CANCEL = null;
    public static final defpackage.a62 COMPRESSION_ERROR = null;
    public static final defpackage.a62 CONNECT_ERROR = null;
    public static final defpackage.z52 Companion = null;
    public static final defpackage.a62 ENHANCE_YOUR_CALM = null;
    public static final defpackage.a62 FLOW_CONTROL_ERROR = null;
    public static final defpackage.a62 FRAME_SIZE_ERROR = null;
    public static final defpackage.a62 HTTP_1_1_REQUIRED = null;
    public static final defpackage.a62 INADEQUATE_SECURITY = null;
    public static final defpackage.a62 INTERNAL_ERROR = null;
    public static final defpackage.a62 NO_ERROR = null;
    public static final defpackage.a62 PROTOCOL_ERROR = null;
    public static final defpackage.a62 REFUSED_STREAM = null;
    public static final defpackage.a62 SETTINGS_TIMEOUT = null;
    public static final defpackage.a62 STREAM_CLOSED = null;
    private final int httpCode;

    private static final /* synthetic */ defpackage.a62[] $values() {
            a62 r0 = defpackage.a62.NO_ERROR
            a62 r1 = defpackage.a62.PROTOCOL_ERROR
            a62 r2 = defpackage.a62.INTERNAL_ERROR
            a62 r3 = defpackage.a62.FLOW_CONTROL_ERROR
            a62 r4 = defpackage.a62.SETTINGS_TIMEOUT
            a62 r5 = defpackage.a62.STREAM_CLOSED
            a62 r6 = defpackage.a62.FRAME_SIZE_ERROR
            a62 r7 = defpackage.a62.REFUSED_STREAM
            a62 r8 = defpackage.a62.CANCEL
            a62 r9 = defpackage.a62.COMPRESSION_ERROR
            a62 r10 = defpackage.a62.CONNECT_ERROR
            a62 r11 = defpackage.a62.ENHANCE_YOUR_CALM
            a62 r12 = defpackage.a62.INADEQUATE_SECURITY
            a62 r13 = defpackage.a62.HTTP_1_1_REQUIRED
            a62[] r0 = new defpackage.a62[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            return r0
    }

    static {
            a62 r0 = new a62
            java.lang.String r1 = "NO_ERROR"
            r2 = 0
            r0.<init>(r1, r2, r2)
            defpackage.a62.NO_ERROR = r0
            a62 r0 = new a62
            java.lang.String r1 = "PROTOCOL_ERROR"
            r2 = 1
            r0.<init>(r1, r2, r2)
            defpackage.a62.PROTOCOL_ERROR = r0
            a62 r0 = new a62
            java.lang.String r1 = "INTERNAL_ERROR"
            r2 = 2
            r0.<init>(r1, r2, r2)
            defpackage.a62.INTERNAL_ERROR = r0
            a62 r0 = new a62
            java.lang.String r1 = "FLOW_CONTROL_ERROR"
            r2 = 3
            r0.<init>(r1, r2, r2)
            defpackage.a62.FLOW_CONTROL_ERROR = r0
            a62 r0 = new a62
            java.lang.String r1 = "SETTINGS_TIMEOUT"
            r2 = 4
            r0.<init>(r1, r2, r2)
            defpackage.a62.SETTINGS_TIMEOUT = r0
            a62 r0 = new a62
            java.lang.String r1 = "STREAM_CLOSED"
            r2 = 5
            r0.<init>(r1, r2, r2)
            defpackage.a62.STREAM_CLOSED = r0
            a62 r0 = new a62
            java.lang.String r1 = "FRAME_SIZE_ERROR"
            r2 = 6
            r0.<init>(r1, r2, r2)
            defpackage.a62.FRAME_SIZE_ERROR = r0
            a62 r0 = new a62
            java.lang.String r1 = "REFUSED_STREAM"
            r2 = 7
            r0.<init>(r1, r2, r2)
            defpackage.a62.REFUSED_STREAM = r0
            a62 r0 = new a62
            java.lang.String r1 = "CANCEL"
            r2 = 8
            r0.<init>(r1, r2, r2)
            defpackage.a62.CANCEL = r0
            a62 r0 = new a62
            java.lang.String r1 = "COMPRESSION_ERROR"
            r2 = 9
            r0.<init>(r1, r2, r2)
            defpackage.a62.COMPRESSION_ERROR = r0
            a62 r0 = new a62
            java.lang.String r1 = "CONNECT_ERROR"
            r2 = 10
            r0.<init>(r1, r2, r2)
            defpackage.a62.CONNECT_ERROR = r0
            a62 r0 = new a62
            java.lang.String r1 = "ENHANCE_YOUR_CALM"
            r2 = 11
            r0.<init>(r1, r2, r2)
            defpackage.a62.ENHANCE_YOUR_CALM = r0
            a62 r0 = new a62
            java.lang.String r1 = "INADEQUATE_SECURITY"
            r2 = 12
            r0.<init>(r1, r2, r2)
            defpackage.a62.INADEQUATE_SECURITY = r0
            a62 r0 = new a62
            java.lang.String r1 = "HTTP_1_1_REQUIRED"
            r2 = 13
            r0.<init>(r1, r2, r2)
            defpackage.a62.HTTP_1_1_REQUIRED = r0
            a62[] r0 = $values()
            defpackage.a62.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.a62.$ENTRIES = r0
            z52 r0 = new z52
            r0.<init>()
            defpackage.a62.Companion = r0
            return
    }

    a62(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.httpCode = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.a62.$ENTRIES
            return r0
    }

    public static defpackage.a62 valueOf(java.lang.String r1) {
            java.lang.Class<a62> r0 = defpackage.a62.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            a62 r1 = (defpackage.a62) r1
            return r1
    }

    public static defpackage.a62[] values() {
            a62[] r0 = defpackage.a62.$VALUES
            java.lang.Object r0 = r0.clone()
            a62[] r0 = (defpackage.a62[]) r0
            return r0
    }

    public final int getHttpCode() {
            r0 = this;
            int r0 = r0.httpCode
            return r0
    }
}
