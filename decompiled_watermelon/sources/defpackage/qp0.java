package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qp0  reason: default package */
/* loaded from: classes.dex */
public final class qp0 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ qp0[] $VALUES;
    public static final qp0 APP_CLOSED = new qp0("APP_CLOSED", 0);
    public static final qp0 APP_DISCONNECTED = new qp0("APP_DISCONNECTED", 1);
    public static final qp0 CAMERA2_CLOSED = new qp0("CAMERA2_CLOSED", 2);
    public static final qp0 CAMERA2_DISCONNECTED = new qp0("CAMERA2_DISCONNECTED", 3);
    public static final qp0 CAMERA2_ERROR = new qp0("CAMERA2_ERROR", 4);
    public static final qp0 CAMERA2_EXCEPTION = new qp0("CAMERA2_EXCEPTION", 5);

    private static final /* synthetic */ qp0[] $values() {
        return new qp0[]{APP_CLOSED, APP_DISCONNECTED, CAMERA2_CLOSED, CAMERA2_DISCONNECTED, CAMERA2_ERROR, CAMERA2_EXCEPTION};
    }

    static {
        qp0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private qp0(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static qp0 valueOf(String str) {
        return (qp0) Enum.valueOf(qp0.class, str);
    }

    public static qp0[] values() {
        return (qp0[]) $VALUES.clone();
    }
}
