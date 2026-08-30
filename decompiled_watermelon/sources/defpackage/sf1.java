package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sf1  reason: default package */
/* loaded from: classes.dex */
public final class sf1 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ sf1[] $VALUES;
    public static final sf1 Vertical = new sf1("Vertical", 0);
    public static final sf1 Horizontal = new sf1("Horizontal", 1);
    public static final sf1 Both = new sf1("Both", 2);

    private static final /* synthetic */ sf1[] $values() {
        return new sf1[]{Vertical, Horizontal, Both};
    }

    static {
        sf1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private sf1(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static sf1 valueOf(String str) {
        return (sf1) Enum.valueOf(sf1.class, str);
    }

    public static sf1[] values() {
        return (sf1[]) $VALUES.clone();
    }
}
