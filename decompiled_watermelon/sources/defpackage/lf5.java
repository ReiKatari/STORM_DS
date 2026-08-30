package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lf5  reason: default package */
/* loaded from: classes.dex */
public final class lf5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ lf5[] $VALUES;
    public static final lf5 VULKAN_IR = new lf5("VULKAN_IR", 0);
    public static final lf5 NATIVE = new lf5("NATIVE", 1);

    private static final /* synthetic */ lf5[] $values() {
        return new lf5[]{VULKAN_IR, NATIVE};
    }

    static {
        lf5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private lf5(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static lf5 valueOf(String str) {
        return (lf5) Enum.valueOf(lf5.class, str);
    }

    public static lf5[] values() {
        return (lf5[]) $VALUES.clone();
    }
}
