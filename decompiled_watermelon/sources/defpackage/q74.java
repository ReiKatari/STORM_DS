package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q74  reason: default package */
/* loaded from: classes.dex */
public final class q74 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ q74[] $VALUES;
    public static final q74 Width = new q74("Width", 0);
    public static final q74 Height = new q74("Height", 1);

    private static final /* synthetic */ q74[] $values() {
        return new q74[]{Width, Height};
    }

    static {
        q74[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private q74(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static q74 valueOf(String str) {
        return (q74) Enum.valueOf(q74.class, str);
    }

    public static q74[] values() {
        return (q74[]) $VALUES.clone();
    }
}
