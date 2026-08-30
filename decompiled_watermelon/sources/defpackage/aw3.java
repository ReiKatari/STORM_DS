package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: aw3  reason: default package */
/* loaded from: classes.dex */
public final class aw3 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ aw3[] $VALUES;
    public static final aw3 Width = new aw3("Width", 0);
    public static final aw3 Height = new aw3("Height", 1);

    private static final /* synthetic */ aw3[] $values() {
        return new aw3[]{Width, Height};
    }

    static {
        aw3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private aw3(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static aw3 valueOf(String str) {
        return (aw3) Enum.valueOf(aw3.class, str);
    }

    public static aw3[] values() {
        return (aw3[]) $VALUES.clone();
    }
}
