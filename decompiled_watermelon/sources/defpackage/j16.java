package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j16  reason: default package */
/* loaded from: classes.dex */
public final class j16 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ j16[] $VALUES;
    public static final j16 PENDING = new j16("PENDING", 0);
    public static final j16 CREATING = new j16("CREATING", 1);
    public static final j16 CREATED = new j16("CREATED", 2);

    private static final /* synthetic */ j16[] $values() {
        return new j16[]{PENDING, CREATING, CREATED};
    }

    static {
        j16[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private j16(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static j16 valueOf(String str) {
        return (j16) Enum.valueOf(j16.class, str);
    }

    public static j16[] values() {
        return (j16[]) $VALUES.clone();
    }
}
