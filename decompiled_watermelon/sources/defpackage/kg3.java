package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kg3  reason: default package */
/* loaded from: classes.dex */
public final class kg3 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ kg3[] $VALUES;
    public static final kg3 Horizontal = new kg3("Horizontal", 0);
    public static final kg3 Vertical = new kg3("Vertical", 1);

    private static final /* synthetic */ kg3[] $values() {
        return new kg3[]{Horizontal, Vertical};
    }

    static {
        kg3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private kg3(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static kg3 valueOf(String str) {
        return (kg3) Enum.valueOf(kg3.class, str);
    }

    public static kg3[] values() {
        return (kg3[]) $VALUES.clone();
    }
}
