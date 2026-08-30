package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l12  reason: default package */
/* loaded from: classes.dex */
public final class l12 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ l12[] $VALUES;
    public static final k12 Companion;
    private final int httpCode;
    public static final l12 NO_ERROR = new l12("NO_ERROR", 0, 0);
    public static final l12 PROTOCOL_ERROR = new l12("PROTOCOL_ERROR", 1, 1);
    public static final l12 INTERNAL_ERROR = new l12("INTERNAL_ERROR", 2, 2);
    public static final l12 FLOW_CONTROL_ERROR = new l12("FLOW_CONTROL_ERROR", 3, 3);
    public static final l12 SETTINGS_TIMEOUT = new l12("SETTINGS_TIMEOUT", 4, 4);
    public static final l12 STREAM_CLOSED = new l12("STREAM_CLOSED", 5, 5);
    public static final l12 FRAME_SIZE_ERROR = new l12("FRAME_SIZE_ERROR", 6, 6);
    public static final l12 REFUSED_STREAM = new l12("REFUSED_STREAM", 7, 7);
    public static final l12 CANCEL = new l12("CANCEL", 8, 8);
    public static final l12 COMPRESSION_ERROR = new l12("COMPRESSION_ERROR", 9, 9);
    public static final l12 CONNECT_ERROR = new l12("CONNECT_ERROR", 10, 10);
    public static final l12 ENHANCE_YOUR_CALM = new l12("ENHANCE_YOUR_CALM", 11, 11);
    public static final l12 INADEQUATE_SECURITY = new l12("INADEQUATE_SECURITY", 12, 12);
    public static final l12 HTTP_1_1_REQUIRED = new l12("HTTP_1_1_REQUIRED", 13, 13);

    private static final /* synthetic */ l12[] $values() {
        return new l12[]{NO_ERROR, PROTOCOL_ERROR, INTERNAL_ERROR, FLOW_CONTROL_ERROR, SETTINGS_TIMEOUT, STREAM_CLOSED, FRAME_SIZE_ERROR, REFUSED_STREAM, CANCEL, COMPRESSION_ERROR, CONNECT_ERROR, ENHANCE_YOUR_CALM, INADEQUATE_SECURITY, HTTP_1_1_REQUIRED};
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, k12] */
    static {
        l12[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
        Companion = new Object();
    }

    private l12(String str, int i, int i2) {
        this.httpCode = i2;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static l12 valueOf(String str) {
        return (l12) Enum.valueOf(l12.class, str);
    }

    public static l12[] values() {
        return (l12[]) $VALUES.clone();
    }

    public final int getHttpCode() {
        return this.httpCode;
    }
}
