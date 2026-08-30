package af;

import me.magnum.melonds.domain.model.MicSource;
import q8.r;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements g {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ h[] $VALUES;
    private final MicSource micSource;
    public static final h DEFAULT = new h("DEFAULT", 0, null);
    public static final h NONE = new h("NONE", 1, MicSource.NONE);
    public static final h BLOW = new h("BLOW", 2, MicSource.BLOW);
    public static final h DEVICE = new h("DEVICE", 3, MicSource.DEVICE);

    private static final /* synthetic */ h[] $values() {
        return new h[]{DEFAULT, NONE, BLOW, DEVICE};
    }

    static {
        h[] $values = $values();
        $VALUES = $values;
        $ENTRIES = r.x($values);
    }

    private h(String str, int i2, MicSource micSource) {
        this.micSource = micSource;
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static h valueOf(String str) {
        return (h) Enum.valueOf(h.class, str);
    }

    public static h[] values() {
        return (h[]) $VALUES.clone();
    }

    public final MicSource getMicSource() {
        return this.micSource;
    }

    @Override // af.g
    public MicSource getValue() {
        MicSource micSource = this.micSource;
        micSource.getClass();
        return micSource;
    }

    @Override // af.g
    public h getDefault() {
        return DEFAULT;
    }
}
