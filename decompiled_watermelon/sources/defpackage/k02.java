package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k02  reason: default package */
/* loaded from: classes.dex */
public final class k02 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ k02[] $VALUES;
    public static final k02 PreEnter = new k02("PreEnter", 0);
    public static final k02 Visible = new k02("Visible", 1);
    public static final k02 PostExit = new k02("PostExit", 2);

    private static final /* synthetic */ k02[] $values() {
        return new k02[]{PreEnter, Visible, PostExit};
    }

    static {
        k02[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private k02(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static k02 valueOf(String str) {
        return (k02) Enum.valueOf(k02.class, str);
    }

    public static k02[] values() {
        return (k02[]) $VALUES.clone();
    }
}
