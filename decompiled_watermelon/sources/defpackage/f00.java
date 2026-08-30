package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f00  reason: default package */
/* loaded from: classes.dex */
public final class f00 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ f00[] $VALUES;
    public static final f00 EXPONENTIAL = new f00("EXPONENTIAL", 0);
    public static final f00 LINEAR = new f00("LINEAR", 1);

    private static final /* synthetic */ f00[] $values() {
        return new f00[]{EXPONENTIAL, LINEAR};
    }

    static {
        f00[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private f00(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static f00 valueOf(String str) {
        return (f00) Enum.valueOf(f00.class, str);
    }

    public static f00[] values() {
        return (f00[]) $VALUES.clone();
    }
}
