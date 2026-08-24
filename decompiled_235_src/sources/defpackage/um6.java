package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: um6  reason: default package */
/* loaded from: classes.dex */
public final class um6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ um6[] $VALUES;
    public static final um6 ALWAYS_VISIBLE = new um6("ALWAYS_VISIBLE", 0);
    public static final um6 HIDE_SYSTEM_BUTTONS_WHEN_CONTROLLERS_CONNECTED = new um6("HIDE_SYSTEM_BUTTONS_WHEN_CONTROLLERS_CONNECTED", 1);
    public static final um6 HIDE_ALL_BUTTONS_ASSIGNED_TO_CONNECTED_CONTROLLERS = new um6("HIDE_ALL_BUTTONS_ASSIGNED_TO_CONNECTED_CONTROLLERS", 2);
    public static final um6 ALWAYS_INVISIBLE = new um6("ALWAYS_INVISIBLE", 3);

    private static final /* synthetic */ um6[] $values() {
        return new um6[]{ALWAYS_VISIBLE, HIDE_SYSTEM_BUTTONS_WHEN_CONTROLLERS_CONNECTED, HIDE_ALL_BUTTONS_ASSIGNED_TO_CONNECTED_CONTROLLERS, ALWAYS_INVISIBLE};
    }

    static {
        um6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private um6(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static um6 valueOf(String str) {
        return (um6) Enum.valueOf(um6.class, str);
    }

    public static um6[] values() {
        return (um6[]) $VALUES.clone();
    }
}
