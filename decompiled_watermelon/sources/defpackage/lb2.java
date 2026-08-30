package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lb2  reason: default package */
/* loaded from: classes.dex */
public final class lb2 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ lb2[] $VALUES;
    public static final lb2 Visible = new lb2("Visible", 0);
    public static final lb2 Clip = new lb2("Clip", 1);
    public static final lb2 ExpandIndicator = new lb2("ExpandIndicator", 2);
    public static final lb2 ExpandOrCollapseIndicator = new lb2("ExpandOrCollapseIndicator", 3);

    private static final /* synthetic */ lb2[] $values() {
        return new lb2[]{Visible, Clip, ExpandIndicator, ExpandOrCollapseIndicator};
    }

    static {
        lb2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private lb2(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static lb2 valueOf(String str) {
        return (lb2) Enum.valueOf(lb2.class, str);
    }

    public static lb2[] values() {
        return (lb2[]) $VALUES.clone();
    }
}
