package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fb6  reason: default package */
/* loaded from: classes.dex */
public final class fb6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ fb6[] $VALUES;
    public static final fb6 ALWAYS_VISIBLE = new fb6("ALWAYS_VISIBLE", 0);
    public static final fb6 HIDE_SYSTEM_BUTTONS_WHEN_CONTROLLERS_CONNECTED = new fb6("HIDE_SYSTEM_BUTTONS_WHEN_CONTROLLERS_CONNECTED", 1);
    public static final fb6 HIDE_ALL_BUTTONS_ASSIGNED_TO_CONNECTED_CONTROLLERS = new fb6("HIDE_ALL_BUTTONS_ASSIGNED_TO_CONNECTED_CONTROLLERS", 2);
    public static final fb6 ALWAYS_INVISIBLE = new fb6("ALWAYS_INVISIBLE", 3);

    private static final /* synthetic */ fb6[] $values() {
        return new fb6[]{ALWAYS_VISIBLE, HIDE_SYSTEM_BUTTONS_WHEN_CONTROLLERS_CONNECTED, HIDE_ALL_BUTTONS_ASSIGNED_TO_CONNECTED_CONTROLLERS, ALWAYS_INVISIBLE};
    }

    static {
        fb6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private fb6(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static fb6 valueOf(String str) {
        return (fb6) Enum.valueOf(fb6.class, str);
    }

    public static fb6[] values() {
        return (fb6[]) $VALUES.clone();
    }
}
