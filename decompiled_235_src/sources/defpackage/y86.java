package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y86  reason: default package */
/* loaded from: classes.dex */
public final class y86 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ y86[] $VALUES;
    public static final y86 Inherit = new y86("Inherit", 0);
    public static final y86 SecureOn = new y86("SecureOn", 1);
    public static final y86 SecureOff = new y86("SecureOff", 2);

    private static final /* synthetic */ y86[] $values() {
        return new y86[]{Inherit, SecureOn, SecureOff};
    }

    static {
        y86[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private y86(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static y86 valueOf(String str) {
        return (y86) Enum.valueOf(y86.class, str);
    }

    public static y86[] values() {
        return (y86[]) $VALUES.clone();
    }
}
