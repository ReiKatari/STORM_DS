package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ka5  reason: default package */
/* loaded from: classes.dex */
public final class ka5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ka5[] $VALUES;
    public static final ka5 Restart = new ka5("Restart", 0);
    public static final ka5 Reverse = new ka5("Reverse", 1);

    private static final /* synthetic */ ka5[] $values() {
        return new ka5[]{Restart, Reverse};
    }

    static {
        ka5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private ka5(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ka5 valueOf(String str) {
        return (ka5) Enum.valueOf(ka5.class, str);
    }

    public static ka5[] values() {
        return (ka5[]) $VALUES.clone();
    }
}
