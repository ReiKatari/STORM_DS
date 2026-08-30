package oi;

import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ c[] $VALUES;
    public static final c Core = new c("Core", 0);
    public static final c Bonus = new c("Bonus", 1);
    public static final c Specialty = new c("Specialty", 2);
    public static final c Exclusive = new c("Exclusive", 3);
    public static final c Challenge = new c("Challenge", 4);

    private static final /* synthetic */ c[] $values() {
        return new c[]{Core, Bonus, Specialty, Exclusive, Challenge};
    }

    static {
        c[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private c(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) $VALUES.clone();
    }
}
