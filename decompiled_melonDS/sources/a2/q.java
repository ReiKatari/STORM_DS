package a2;

import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ q[] $VALUES;
    public static final q Uninitialized = new q("Uninitialized", 0);
    public static final q Detached = new q("Detached", 1);
    public static final q Attached = new q("Attached", 2);

    private static final /* synthetic */ q[] $values() {
        return new q[]{Uninitialized, Detached, Attached};
    }

    static {
        q[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private q(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) $VALUES.clone();
    }
}
