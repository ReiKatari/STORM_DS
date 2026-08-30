package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kr4  reason: default package */
/* loaded from: classes.dex */
public final class kr4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ kr4[] $VALUES;
    public static final kr4 EXACT = new kr4("EXACT", 0);
    public static final kr4 INEXACT = new kr4("INEXACT", 1);
    public static final kr4 AUTOMATIC = new kr4("AUTOMATIC", 2);

    private static final /* synthetic */ kr4[] $values() {
        return new kr4[]{EXACT, INEXACT, AUTOMATIC};
    }

    static {
        kr4[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private kr4(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static kr4 valueOf(String str) {
        return (kr4) Enum.valueOf(kr4.class, str);
    }

    public static kr4[] values() {
        return (kr4[]) $VALUES.clone();
    }
}
