package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: js3  reason: default package */
/* loaded from: classes.dex */
public final class js3 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ js3[] $VALUES;
    public static final js3 IsPlacedInLookahead = new js3("IsPlacedInLookahead", 0);
    public static final js3 IsPlacedInApproach = new js3("IsPlacedInApproach", 1);
    public static final js3 IsNotPlaced = new js3("IsNotPlaced", 2);

    private static final /* synthetic */ js3[] $values() {
        return new js3[]{IsPlacedInLookahead, IsPlacedInApproach, IsNotPlaced};
    }

    static {
        js3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private js3(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static js3 valueOf(String str) {
        return (js3) Enum.valueOf(js3.class, str);
    }

    public static js3[] values() {
        return (js3[]) $VALUES.clone();
    }
}
