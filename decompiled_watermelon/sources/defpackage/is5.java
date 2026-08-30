package defpackage;

import me.magnum.melonds.domain.model.MicSource;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: is5  reason: default package */
/* loaded from: classes.dex */
public final class is5 implements ds5 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ is5[] $VALUES;
    private final MicSource micSource;
    public static final is5 DEFAULT = new is5("DEFAULT", 0, null);
    public static final is5 NONE = new is5("NONE", 1, MicSource.NONE);
    public static final is5 BLOW = new is5("BLOW", 2, MicSource.BLOW);
    public static final is5 DEVICE = new is5("DEVICE", 3, MicSource.DEVICE);

    private static final /* synthetic */ is5[] $values() {
        return new is5[]{DEFAULT, NONE, BLOW, DEVICE};
    }

    static {
        is5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private is5(String str, int i, MicSource micSource) {
        this.micSource = micSource;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static is5 valueOf(String str) {
        return (is5) Enum.valueOf(is5.class, str);
    }

    public static is5[] values() {
        return (is5[]) $VALUES.clone();
    }

    public final MicSource getMicSource() {
        return this.micSource;
    }

    @Override // defpackage.ds5
    public MicSource getValue() {
        MicSource micSource = this.micSource;
        micSource.getClass();
        return micSource;
    }

    @Override // defpackage.ds5
    public is5 getDefault() {
        return DEFAULT;
    }
}
