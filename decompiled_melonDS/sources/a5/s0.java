package a5;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s0 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ s0[] $VALUES;
    public static final s0 Inherit = new s0("Inherit", 0);
    public static final s0 SecureOn = new s0("SecureOn", 1);
    public static final s0 SecureOff = new s0("SecureOff", 2);

    private static final /* synthetic */ s0[] $values() {
        return new s0[]{Inherit, SecureOn, SecureOff};
    }

    static {
        s0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private s0(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) $VALUES.clone();
    }
}
