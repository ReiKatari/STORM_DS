package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yx6  reason: default package */
/* loaded from: classes.dex */
public final class yx6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ yx6[] $VALUES;
    public static final yx6 ContinueTraversal = new yx6("ContinueTraversal", 0);
    public static final yx6 SkipSubtreeAndContinueTraversal = new yx6("SkipSubtreeAndContinueTraversal", 1);
    public static final yx6 CancelTraversal = new yx6("CancelTraversal", 2);

    private static final /* synthetic */ yx6[] $values() {
        return new yx6[]{ContinueTraversal, SkipSubtreeAndContinueTraversal, CancelTraversal};
    }

    static {
        yx6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private yx6(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static yx6 valueOf(String str) {
        return (yx6) Enum.valueOf(yx6.class, str);
    }

    public static yx6[] values() {
        return (yx6[]) $VALUES.clone();
    }
}
