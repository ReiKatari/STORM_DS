package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vv6  reason: default package */
/* loaded from: classes.dex */
public final class vv6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ vv6[] $VALUES;
    public static final vv6 Uninitialized = new vv6("Uninitialized", 0);
    public static final vv6 Detached = new vv6("Detached", 1);
    public static final vv6 Attached = new vv6("Attached", 2);

    private static final /* synthetic */ vv6[] $values() {
        return new vv6[]{Uninitialized, Detached, Attached};
    }

    static {
        vv6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private vv6(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static vv6 valueOf(String str) {
        return (vv6) Enum.valueOf(vv6.class, str);
    }

    public static vv6[] values() {
        return (vv6[]) $VALUES.clone();
    }
}
