package wi;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final b Companion;
    private final int httpCode;
    public static final c NO_ERROR = new c("NO_ERROR", 0, 0);
    public static final c PROTOCOL_ERROR = new c("PROTOCOL_ERROR", 1, 1);
    public static final c INTERNAL_ERROR = new c("INTERNAL_ERROR", 2, 2);
    public static final c FLOW_CONTROL_ERROR = new c("FLOW_CONTROL_ERROR", 3, 3);
    public static final c SETTINGS_TIMEOUT = new c("SETTINGS_TIMEOUT", 4, 4);
    public static final c STREAM_CLOSED = new c("STREAM_CLOSED", 5, 5);
    public static final c FRAME_SIZE_ERROR = new c("FRAME_SIZE_ERROR", 6, 6);
    public static final c REFUSED_STREAM = new c("REFUSED_STREAM", 7, 7);
    public static final c CANCEL = new c("CANCEL", 8, 8);
    public static final c COMPRESSION_ERROR = new c("COMPRESSION_ERROR", 9, 9);
    public static final c CONNECT_ERROR = new c("CONNECT_ERROR", 10, 10);
    public static final c ENHANCE_YOUR_CALM = new c("ENHANCE_YOUR_CALM", 11, 11);
    public static final c INADEQUATE_SECURITY = new c("INADEQUATE_SECURITY", 12, 12);
    public static final c HTTP_1_1_REQUIRED = new c("HTTP_1_1_REQUIRED", 13, 13);

    private static final /* synthetic */ c[] $values() {
        return new c[]{NO_ERROR, PROTOCOL_ERROR, INTERNAL_ERROR, FLOW_CONTROL_ERROR, SETTINGS_TIMEOUT, STREAM_CLOSED, FRAME_SIZE_ERROR, REFUSED_STREAM, CANCEL, COMPRESSION_ERROR, CONNECT_ERROR, ENHANCE_YOUR_CALM, INADEQUATE_SECURITY, HTTP_1_1_REQUIRED};
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [wi.b, java.lang.Object] */
    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
        Companion = new Object();
    }

    private c(String str, int i2, int i10) {
        this.httpCode = i10;
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }

    public final int getHttpCode() {
        return this.httpCode;
    }
}
