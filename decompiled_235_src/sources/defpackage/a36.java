package defpackage;

import me.magnum.melonds.domain.model.MicSource;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a36  reason: default package */
/* loaded from: classes.dex */
public final class a36 implements v26 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ a36[] $VALUES;
    private final MicSource micSource;
    public static final a36 DEFAULT = new a36("DEFAULT", 0, null);
    public static final a36 NONE = new a36("NONE", 1, MicSource.NONE);
    public static final a36 BLOW = new a36("BLOW", 2, MicSource.BLOW);
    public static final a36 DEVICE = new a36("DEVICE", 3, MicSource.DEVICE);

    private static final /* synthetic */ a36[] $values() {
        return new a36[]{DEFAULT, NONE, BLOW, DEVICE};
    }

    static {
        a36[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private a36(String str, int i, MicSource micSource) {
        this.micSource = micSource;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static a36 valueOf(String str) {
        return (a36) Enum.valueOf(a36.class, str);
    }

    public static a36[] values() {
        return (a36[]) $VALUES.clone();
    }

    public final MicSource getMicSource() {
        return this.micSource;
    }

    @Override // defpackage.v26
    public MicSource getValue() {
        MicSource micSource = this.micSource;
        micSource.getClass();
        return micSource;
    }

    @Override // defpackage.v26
    public a36 getDefault() {
        return DEFAULT;
    }
}
