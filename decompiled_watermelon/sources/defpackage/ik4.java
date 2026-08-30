package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ik4  reason: default package */
/* loaded from: classes.dex */
public final class ik4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ ik4[] $VALUES;
    public static final ik4 CounterClockwise = new ik4("CounterClockwise", 0);
    public static final ik4 Clockwise = new ik4("Clockwise", 1);

    private static final /* synthetic */ ik4[] $values() {
        return new ik4[]{CounterClockwise, Clockwise};
    }

    static {
        ik4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private ik4(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static ik4 valueOf(String str) {
        return (ik4) Enum.valueOf(ik4.class, str);
    }

    public static ik4[] values() {
        return (ik4[]) $VALUES.clone();
    }
}
