package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yb3  reason: default package */
/* loaded from: classes.dex */
public final class yb3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ yb3[] $VALUES;
    public static final yb3 IGNORED = new yb3("IGNORED", 0);
    public static final yb3 SCHEDULED = new yb3("SCHEDULED", 1);
    public static final yb3 DEFERRED = new yb3("DEFERRED", 2);
    public static final yb3 IMMINENT = new yb3("IMMINENT", 3);

    private static final /* synthetic */ yb3[] $values() {
        return new yb3[]{IGNORED, SCHEDULED, DEFERRED, IMMINENT};
    }

    static {
        yb3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private yb3(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static yb3 valueOf(String str) {
        return (yb3) Enum.valueOf(yb3.class, str);
    }

    public static yb3[] values() {
        return (yb3[]) $VALUES.clone();
    }
}
