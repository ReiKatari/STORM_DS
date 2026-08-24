package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ds0  reason: default package */
/* loaded from: classes.dex */
public final class ds0 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ds0[] $VALUES;
    public static final ds0 APP_CLOSED = new ds0("APP_CLOSED", 0);
    public static final ds0 APP_DISCONNECTED = new ds0("APP_DISCONNECTED", 1);
    public static final ds0 CAMERA2_CLOSED = new ds0("CAMERA2_CLOSED", 2);
    public static final ds0 CAMERA2_DISCONNECTED = new ds0("CAMERA2_DISCONNECTED", 3);
    public static final ds0 CAMERA2_ERROR = new ds0("CAMERA2_ERROR", 4);
    public static final ds0 CAMERA2_EXCEPTION = new ds0("CAMERA2_EXCEPTION", 5);

    private static final /* synthetic */ ds0[] $values() {
        return new ds0[]{APP_CLOSED, APP_DISCONNECTED, CAMERA2_CLOSED, CAMERA2_DISCONNECTED, CAMERA2_ERROR, CAMERA2_EXCEPTION};
    }

    static {
        ds0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ds0(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ds0 valueOf(String str) {
        return (ds0) Enum.valueOf(ds0.class, str);
    }

    public static ds0[] values() {
        return (ds0[]) $VALUES.clone();
    }
}
