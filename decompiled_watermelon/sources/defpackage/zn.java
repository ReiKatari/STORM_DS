package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zn  reason: default package */
/* loaded from: classes.dex */
public final class zn {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ zn[] $VALUES;
    public static final zn BoundReached = new zn("BoundReached", 0);
    public static final zn Finished = new zn("Finished", 1);

    private static final /* synthetic */ zn[] $values() {
        return new zn[]{BoundReached, Finished};
    }

    static {
        zn[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private zn(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static zn valueOf(String str) {
        return (zn) Enum.valueOf(zn.class, str);
    }

    public static zn[] values() {
        return (zn[]) $VALUES.clone();
    }
}
