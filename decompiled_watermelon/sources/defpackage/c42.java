package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c42  reason: default package */
/* loaded from: classes.dex */
public final class c42 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ c42[] $VALUES;
    public static final c42 MIRROR = new c42("MIRROR", 0);
    public static final c42 MELON_DUAL_DS = new c42("MELON_DUAL_DS", 1);

    private static final /* synthetic */ c42[] $values() {
        return new c42[]{MIRROR, MELON_DUAL_DS};
    }

    static {
        c42[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private c42(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static c42 valueOf(String str) {
        return (c42) Enum.valueOf(c42.class, str);
    }

    public static c42[] values() {
        return (c42[]) $VALUES.clone();
    }
}
