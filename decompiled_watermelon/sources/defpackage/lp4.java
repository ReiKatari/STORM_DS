package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lp4  reason: default package */
/* loaded from: classes.dex */
public final class lp4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ lp4[] $VALUES;
    public static final lp4 Initial = new lp4("Initial", 0);
    public static final lp4 Main = new lp4("Main", 1);
    public static final lp4 Final = new lp4("Final", 2);

    private static final /* synthetic */ lp4[] $values() {
        return new lp4[]{Initial, Main, Final};
    }

    static {
        lp4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private lp4(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static lp4 valueOf(String str) {
        return (lp4) Enum.valueOf(lp4.class, str);
    }

    public static lp4[] values() {
        return (lp4[]) $VALUES.clone();
    }
}
