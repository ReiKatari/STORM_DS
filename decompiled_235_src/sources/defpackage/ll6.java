package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ll6  reason: default package */
/* loaded from: classes.dex */
public final class ll6 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ll6[] $VALUES;
    public static final ll6 Dismissed = new ll6("Dismissed", 0);
    public static final ll6 ActionPerformed = new ll6("ActionPerformed", 1);

    private static final /* synthetic */ ll6[] $values() {
        return new ll6[]{Dismissed, ActionPerformed};
    }

    static {
        ll6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ll6(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ll6 valueOf(String str) {
        return (ll6) Enum.valueOf(ll6.class, str);
    }

    public static ll6[] values() {
        return (ll6[]) $VALUES.clone();
    }
}
