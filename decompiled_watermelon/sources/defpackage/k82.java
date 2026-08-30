package defpackage;

import me.magnum.melondualds.R;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: k82  reason: default package */
/* loaded from: classes.dex */
public final class k82 implements ll4 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ k82[] $VALUES;
    private final int textResource;
    public static final k82 SETTINGS = new k82("SETTINGS", 0, R.string.settings);
    public static final k82 RESET = new k82("RESET", 1, R.string.reset);
    public static final k82 EXIT = new k82("EXIT", 2, R.string.exit);

    private static final /* synthetic */ k82[] $values() {
        return new k82[]{SETTINGS, RESET, EXIT};
    }

    static {
        k82[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private k82(String str, int i, int i2) {
        this.textResource = i2;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static k82 valueOf(String str) {
        return (k82) Enum.valueOf(k82.class, str);
    }

    public static k82[] values() {
        return (k82[]) $VALUES.clone();
    }

    @Override // defpackage.ll4
    public int getTextResource() {
        return this.textResource;
    }
}
