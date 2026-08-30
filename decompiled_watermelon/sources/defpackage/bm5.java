package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bm5  reason: default package */
/* loaded from: classes.dex */
public final class bm5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ bm5[] $VALUES;
    public static final bm5 ALL = new bm5("ALL", 0);
    public static final bm5 FAVORITES = new bm5("FAVORITES", 1);
    public static final bm5 DS_ONLY = new bm5("DS_ONLY", 2);
    public static final bm5 DSIWARE_ONLY = new bm5("DSIWARE_ONLY", 3);
    public static final bm5 WITH_RETRO_ACHIEVEMENTS = new bm5("WITH_RETRO_ACHIEVEMENTS", 4);

    private static final /* synthetic */ bm5[] $values() {
        return new bm5[]{ALL, FAVORITES, DS_ONLY, DSIWARE_ONLY, WITH_RETRO_ACHIEVEMENTS};
    }

    static {
        bm5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private bm5(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static bm5 valueOf(String str) {
        return (bm5) Enum.valueOf(bm5.class, str);
    }

    public static bm5[] values() {
        return (bm5[]) $VALUES.clone();
    }
}
