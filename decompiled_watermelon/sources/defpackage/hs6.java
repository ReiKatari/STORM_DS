package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hs6  reason: default package */
/* loaded from: classes.dex */
public final class hs6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ hs6[] $VALUES;
    public static final hs6 Shown = new hs6("Shown", 0);
    public static final hs6 Hidden = new hs6("Hidden", 1);

    private static final /* synthetic */ hs6[] $values() {
        return new hs6[]{Shown, Hidden};
    }

    static {
        hs6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private hs6(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static hs6 valueOf(String str) {
        return (hs6) Enum.valueOf(hs6.class, str);
    }

    public static hs6[] values() {
        return (hs6[]) $VALUES.clone();
    }
}
