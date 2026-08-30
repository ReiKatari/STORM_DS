package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m47  reason: default package */
/* loaded from: classes.dex */
public final class m47 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ m47[] $VALUES;
    public static final m47 SESSION_CONFIG = new m47("SESSION_CONFIG", 0);
    public static final m47 DEFAULT = new m47("DEFAULT", 1);
    public static final m47 CAMERA2_CAMERA_CONTROL = new m47("CAMERA2_CAMERA_CONTROL", 2);

    private static final /* synthetic */ m47[] $values() {
        return new m47[]{SESSION_CONFIG, DEFAULT, CAMERA2_CAMERA_CONTROL};
    }

    static {
        m47[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private m47(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static m47 valueOf(String str) {
        return (m47) Enum.valueOf(m47.class, str);
    }

    public static m47[] values() {
        return (m47[]) $VALUES.clone();
    }
}
