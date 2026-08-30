package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wk3  reason: default package */
/* loaded from: classes.dex */
public final class wk3 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ wk3[] $VALUES;
    public static final wk3 SYNCHRONIZED = new wk3("SYNCHRONIZED", 0);
    public static final wk3 PUBLICATION = new wk3("PUBLICATION", 1);
    public static final wk3 NONE = new wk3("NONE", 2);

    private static final /* synthetic */ wk3[] $values() {
        return new wk3[]{SYNCHRONIZED, PUBLICATION, NONE};
    }

    static {
        wk3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private wk3(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static wk3 valueOf(String str) {
        return (wk3) Enum.valueOf(wk3.class, str);
    }

    public static wk3[] values() {
        return (wk3[]) $VALUES.clone();
    }
}
