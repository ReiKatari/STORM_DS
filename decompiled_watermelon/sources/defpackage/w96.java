package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w96  reason: default package */
/* loaded from: classes.dex */
public final class w96 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ w96[] $VALUES;
    public static final w96 Dismissed = new w96("Dismissed", 0);
    public static final w96 ActionPerformed = new w96("ActionPerformed", 1);

    private static final /* synthetic */ w96[] $values() {
        return new w96[]{Dismissed, ActionPerformed};
    }

    static {
        w96[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private w96(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static w96 valueOf(String str) {
        return (w96) Enum.valueOf(w96.class, str);
    }

    public static w96[] values() {
        return (w96[]) $VALUES.clone();
    }
}
