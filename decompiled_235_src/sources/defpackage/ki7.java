package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ki7  reason: default package */
/* loaded from: classes.dex */
public final class ki7 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ki7[] $VALUES;
    public static final ki7 SESSION_CONFIG = new ki7("SESSION_CONFIG", 0);
    public static final ki7 DEFAULT = new ki7("DEFAULT", 1);
    public static final ki7 CAMERA2_CAMERA_CONTROL = new ki7("CAMERA2_CAMERA_CONTROL", 2);

    private static final /* synthetic */ ki7[] $values() {
        return new ki7[]{SESSION_CONFIG, DEFAULT, CAMERA2_CAMERA_CONTROL};
    }

    static {
        ki7[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ki7(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ki7 valueOf(String str) {
        return (ki7) Enum.valueOf(ki7.class, str);
    }

    public static ki7[] values() {
        return (ki7[]) $VALUES.clone();
    }
}
