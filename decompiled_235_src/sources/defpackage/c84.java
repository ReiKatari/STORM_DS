package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c84  reason: default package */
/* loaded from: classes.dex */
public final class c84 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ c84[] $VALUES;
    public static final c84 OFF = new c84("OFF", 0);
    public static final c84 TOUCH_AIM = new c84("TOUCH_AIM", 1);
    public static final c84 DPAD_STEER = new c84("DPAD_STEER", 2);
    public static final c84 SLOT2_ANALOG = new c84("SLOT2_ANALOG", 3);

    private static final /* synthetic */ c84[] $values() {
        return new c84[]{OFF, TOUCH_AIM, DPAD_STEER, SLOT2_ANALOG};
    }

    static {
        c84[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private c84(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static c84 valueOf(String str) {
        return (c84) Enum.valueOf(c84.class, str);
    }

    public static c84[] values() {
        return (c84[]) $VALUES.clone();
    }
}
