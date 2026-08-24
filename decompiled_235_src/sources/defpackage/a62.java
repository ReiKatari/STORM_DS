package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a62  reason: default package */
/* loaded from: classes.dex */
public final class a62 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ a62[] $VALUES;
    public static final z52 Companion;
    private final int httpCode;
    public static final a62 NO_ERROR = new a62("NO_ERROR", 0, 0);
    public static final a62 PROTOCOL_ERROR = new a62("PROTOCOL_ERROR", 1, 1);
    public static final a62 INTERNAL_ERROR = new a62("INTERNAL_ERROR", 2, 2);
    public static final a62 FLOW_CONTROL_ERROR = new a62("FLOW_CONTROL_ERROR", 3, 3);
    public static final a62 SETTINGS_TIMEOUT = new a62("SETTINGS_TIMEOUT", 4, 4);
    public static final a62 STREAM_CLOSED = new a62("STREAM_CLOSED", 5, 5);
    public static final a62 FRAME_SIZE_ERROR = new a62("FRAME_SIZE_ERROR", 6, 6);
    public static final a62 REFUSED_STREAM = new a62("REFUSED_STREAM", 7, 7);
    public static final a62 CANCEL = new a62("CANCEL", 8, 8);
    public static final a62 COMPRESSION_ERROR = new a62("COMPRESSION_ERROR", 9, 9);
    public static final a62 CONNECT_ERROR = new a62("CONNECT_ERROR", 10, 10);
    public static final a62 ENHANCE_YOUR_CALM = new a62("ENHANCE_YOUR_CALM", 11, 11);
    public static final a62 INADEQUATE_SECURITY = new a62("INADEQUATE_SECURITY", 12, 12);
    public static final a62 HTTP_1_1_REQUIRED = new a62("HTTP_1_1_REQUIRED", 13, 13);

    private static final /* synthetic */ a62[] $values() {
        return new a62[]{NO_ERROR, PROTOCOL_ERROR, INTERNAL_ERROR, FLOW_CONTROL_ERROR, SETTINGS_TIMEOUT, STREAM_CLOSED, FRAME_SIZE_ERROR, REFUSED_STREAM, CANCEL, COMPRESSION_ERROR, CONNECT_ERROR, ENHANCE_YOUR_CALM, INADEQUATE_SECURITY, HTTP_1_1_REQUIRED};
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [z52, java.lang.Object] */
    static {
        a62[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
    }

    private a62(String str, int i, int i2) {
        this.httpCode = i2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static a62 valueOf(String str) {
        return (a62) Enum.valueOf(a62.class, str);
    }

    public static a62[] values() {
        return (a62[]) $VALUES.clone();
    }

    public final int getHttpCode() {
        return this.httpCode;
    }
}
