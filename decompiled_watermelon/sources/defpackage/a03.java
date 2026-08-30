package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a03  reason: default package */
/* loaded from: classes.dex */
public final class a03 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ a03[] $VALUES;
    public static final a03 POSITIVE = new a03("POSITIVE", 0);
    public static final a03 NEGATIVE = new a03("NEGATIVE", 1);

    private static final /* synthetic */ a03[] $values() {
        return new a03[]{POSITIVE, NEGATIVE};
    }

    static {
        a03[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private a03(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static a03 valueOf(String str) {
        return (a03) Enum.valueOf(a03.class, str);
    }

    public static a03[] values() {
        return (a03[]) $VALUES.clone();
    }
}
