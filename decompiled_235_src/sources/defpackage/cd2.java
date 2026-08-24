package defpackage;

import com.stormds.emulator.R;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cd2  reason: default package */
/* loaded from: classes.dex */
public final class cd2 implements nu4 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ cd2[] $VALUES;
    private final int textResource;
    public static final cd2 SETTINGS = new cd2("SETTINGS", 0, R.string.settings);
    public static final cd2 RESET = new cd2("RESET", 1, R.string.reset);
    public static final cd2 EXIT = new cd2("EXIT", 2, R.string.exit);

    private static final /* synthetic */ cd2[] $values() {
        return new cd2[]{SETTINGS, RESET, EXIT};
    }

    static {
        cd2[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private cd2(String str, int i, int i2) {
        this.textResource = i2;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static cd2 valueOf(String str) {
        return (cd2) Enum.valueOf(cd2.class, str);
    }

    public static cd2[] values() {
        return (cd2[]) $VALUES.clone();
    }

    @Override // defpackage.nu4
    public int getTextResource() {
        return this.textResource;
    }
}
