package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s26  reason: default package */
/* loaded from: classes.dex */
public final class s26 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ s26[] $VALUES;
    public static final s26 NEAREST = new s26("NEAREST", 0);
    public static final s26 LINEAR = new s26("LINEAR", 1);

    private static final /* synthetic */ s26[] $values() {
        return new s26[]{NEAREST, LINEAR};
    }

    static {
        s26[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private s26(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static s26 valueOf(String str) {
        return (s26) Enum.valueOf(s26.class, str);
    }

    public static s26[] values() {
        return (s26[]) $VALUES.clone();
    }
}
