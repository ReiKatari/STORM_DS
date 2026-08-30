package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dt5  reason: default package */
/* loaded from: classes.dex */
public final class dt5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ dt5[] $VALUES;
    public static final dt5 SAVE_DIR = new dt5("SAVE_DIR", 0);
    public static final dt5 ROM_DIR = new dt5("ROM_DIR", 1);
    public static final dt5 INTERNAL_DIR = new dt5("INTERNAL_DIR", 2);

    private static final /* synthetic */ dt5[] $values() {
        return new dt5[]{SAVE_DIR, ROM_DIR, INTERNAL_DIR};
    }

    static {
        dt5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private dt5(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static dt5 valueOf(String str) {
        return (dt5) Enum.valueOf(dt5.class, str);
    }

    public static dt5[] values() {
        return (dt5[]) $VALUES.clone();
    }
}
