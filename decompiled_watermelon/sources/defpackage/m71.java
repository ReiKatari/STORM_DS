package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m71  reason: default package */
/* loaded from: classes.dex */
public final class m71 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ m71[] $VALUES;
    private final String fileName;
    public static final m71 PUBLIC_SAV = new m71("PUBLIC_SAV", 0, "public.sav");
    public static final m71 PRIVATE_SAV = new m71("PRIVATE_SAV", 1, "private.sav");
    public static final m71 BANNER_SAV = new m71("BANNER_SAV", 2, "banner.sav");

    private static final /* synthetic */ m71[] $values() {
        return new m71[]{PUBLIC_SAV, PRIVATE_SAV, BANNER_SAV};
    }

    static {
        m71[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private m71(String str, int i, String str2) {
        this.fileName = str2;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static m71 valueOf(String str) {
        return (m71) Enum.valueOf(m71.class, str);
    }

    public static m71[] values() {
        return (m71[]) $VALUES.clone();
    }

    public final String getFileName() {
        return this.fileName;
    }
}
