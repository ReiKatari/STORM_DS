package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ra0  reason: default package */
/* loaded from: classes.dex */
public final class ra0 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ ra0[] $VALUES;
    private final boolean readEnabled;
    private final boolean writeEnabled;
    public static final ra0 ENABLED = new ra0("ENABLED", 0, true, true);
    public static final ra0 READ_ONLY = new ra0("READ_ONLY", 1, true, false);
    public static final ra0 WRITE_ONLY = new ra0("WRITE_ONLY", 2, false, true);
    public static final ra0 DISABLED = new ra0("DISABLED", 3, false, false);

    private static final /* synthetic */ ra0[] $values() {
        return new ra0[]{ENABLED, READ_ONLY, WRITE_ONLY, DISABLED};
    }

    static {
        ra0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private ra0(String str, int i, boolean z, boolean z2) {
        this.readEnabled = z;
        this.writeEnabled = z2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static ra0 valueOf(String str) {
        return (ra0) Enum.valueOf(ra0.class, str);
    }

    public static ra0[] values() {
        return (ra0[]) $VALUES.clone();
    }

    public final boolean getReadEnabled() {
        return this.readEnabled;
    }

    public final boolean getWriteEnabled() {
        return this.writeEnabled;
    }
}
