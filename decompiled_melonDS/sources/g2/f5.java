package g2;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f5 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ f5[] $VALUES;
    public static final f5 Dismissed = new f5("Dismissed", 0);
    public static final f5 ActionPerformed = new f5("ActionPerformed", 1);

    private static final /* synthetic */ f5[] $values() {
        return new f5[]{Dismissed, ActionPerformed};
    }

    static {
        f5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private f5(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static f5 valueOf(String str) {
        return (f5) Enum.valueOf(f5.class, str);
    }

    public static f5[] values() {
        return (f5[]) $VALUES.clone();
    }
}
