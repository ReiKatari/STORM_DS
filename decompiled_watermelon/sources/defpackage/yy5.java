package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yy5  reason: default package */
/* loaded from: classes.dex */
public final class yy5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ yy5[] $VALUES;
    public static final yy5 Left = new yy5("Left", 0);
    public static final yy5 Middle = new yy5("Middle", 1);
    public static final yy5 Right = new yy5("Right", 2);

    private static final /* synthetic */ yy5[] $values() {
        return new yy5[]{Left, Middle, Right};
    }

    static {
        yy5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private yy5(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static yy5 valueOf(String str) {
        return (yy5) Enum.valueOf(yy5.class, str);
    }

    public static yy5[] values() {
        return (yy5[]) $VALUES.clone();
    }
}
