package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gw0  reason: default package */
/* loaded from: classes.dex */
public final class gw0 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ gw0[] $VALUES;
    public static final gw0 UNSET = new gw0("UNSET", 0);
    public static final gw0 INVALID = new gw0("INVALID", 1);
    public static final gw0 VALID = new gw0("VALID", 2);

    private static final /* synthetic */ gw0[] $values() {
        return new gw0[]{UNSET, INVALID, VALID};
    }

    static {
        gw0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private gw0(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static gw0 valueOf(String str) {
        return (gw0) Enum.valueOf(gw0.class, str);
    }

    public static gw0[] values() {
        return (gw0[]) $VALUES.clone();
    }
}
