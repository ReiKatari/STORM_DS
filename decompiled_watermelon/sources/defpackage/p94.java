package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p94  reason: default package */
/* loaded from: classes.dex */
public final class p94 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ p94[] $VALUES;
    public static final p94 SYNC_NOW = new p94("SYNC_NOW", 0);
    public static final p94 CONTINUE_OFFLINE = new p94("CONTINUE_OFFLINE", 1);

    private static final /* synthetic */ p94[] $values() {
        return new p94[]{SYNC_NOW, CONTINUE_OFFLINE};
    }

    static {
        p94[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private p94(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static p94 valueOf(String str) {
        return (p94) Enum.valueOf(p94.class, str);
    }

    public static p94[] values() {
        return (p94[]) $VALUES.clone();
    }
}
