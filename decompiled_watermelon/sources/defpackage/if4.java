package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: if4  reason: default package */
/* loaded from: classes.dex */
public final class if4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ if4[] $VALUES;
    public static final if4 PORTRAIT = new if4("PORTRAIT", 0);
    public static final if4 LANDSCAPE = new if4("LANDSCAPE", 1);

    private static final /* synthetic */ if4[] $values() {
        return new if4[]{PORTRAIT, LANDSCAPE};
    }

    static {
        if4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private if4(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static if4 valueOf(String str) {
        return (if4) Enum.valueOf(if4.class, str);
    }

    public static if4[] values() {
        return (if4[]) $VALUES.clone();
    }
}
