package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p26  reason: default package */
/* loaded from: classes.dex */
public final class p26 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ p26[] $VALUES;
    public static final p26 OPEN_GL = new p26("OPEN_GL", 0);
    public static final p26 VULKAN = new p26("VULKAN", 1);

    private static final /* synthetic */ p26[] $values() {
        return new p26[]{OPEN_GL, VULKAN};
    }

    static {
        p26[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private p26(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static p26 valueOf(String str) {
        return (p26) Enum.valueOf(p26.class, str);
    }

    public static p26[] values() {
        return (p26[]) $VALUES.clone();
    }
}
