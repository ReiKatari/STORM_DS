package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: j80  reason: default package */
/* loaded from: classes.dex */
public final class j80 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ j80[] $VALUES;
    private final boolean readEnabled;
    private final boolean writeEnabled;
    public static final j80 ENABLED = new j80("ENABLED", 0, true, true);
    public static final j80 READ_ONLY = new j80("READ_ONLY", 1, true, false);
    public static final j80 WRITE_ONLY = new j80("WRITE_ONLY", 2, false, true);
    public static final j80 DISABLED = new j80("DISABLED", 3, false, false);

    private static final /* synthetic */ j80[] $values() {
        return new j80[]{ENABLED, READ_ONLY, WRITE_ONLY, DISABLED};
    }

    static {
        j80[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private j80(String str, int i, boolean z, boolean z2) {
        this.readEnabled = z;
        this.writeEnabled = z2;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static j80 valueOf(String str) {
        return (j80) Enum.valueOf(j80.class, str);
    }

    public static j80[] values() {
        return (j80[]) $VALUES.clone();
    }

    public final boolean getReadEnabled() {
        return this.readEnabled;
    }

    public final boolean getWriteEnabled() {
        return this.writeEnabled;
    }
}
