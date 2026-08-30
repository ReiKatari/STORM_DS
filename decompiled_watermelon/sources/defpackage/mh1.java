package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mh1  reason: default package */
/* loaded from: classes.dex */
public final class mh1 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ mh1[] $VALUES;
    public static final mh1 FILE = new mh1("FILE", 0);
    public static final mh1 DIRECTORY = new mh1("DIRECTORY", 1);

    private static final /* synthetic */ mh1[] $values() {
        return new mh1[]{FILE, DIRECTORY};
    }

    static {
        mh1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private mh1(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static mh1 valueOf(String str) {
        return (mh1) Enum.valueOf(mh1.class, str);
    }

    public static mh1[] values() {
        return (mh1[]) $VALUES.clone();
    }
}
