package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qh1  reason: default package */
/* loaded from: classes.dex */
public final class qh1 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ qh1[] $VALUES;
    public static final qh1 LOCAL = new qh1("LOCAL", 0);
    public static final qh1 DOCUMENT = new qh1("DOCUMENT", 1);

    private static final /* synthetic */ qh1[] $values() {
        return new qh1[]{LOCAL, DOCUMENT};
    }

    static {
        qh1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private qh1(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static qh1 valueOf(String str) {
        return (qh1) Enum.valueOf(qh1.class, str);
    }

    public static qh1[] values() {
        return (qh1[]) $VALUES.clone();
    }
}
