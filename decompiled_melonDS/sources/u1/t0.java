package u1;

import android.content.res.Resources;
import android.os.Build;
import me.magnum.melonds.R;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t0 {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ t0[] $VALUES;
    public static final t0 Autofill;
    private final int drawableId;
    private final Object key;
    private final int stringId;
    public static final t0 Cut = new t0("Cut", 0, x1.e.f14328a, 17039363, 16843537);
    public static final t0 Copy = new t0("Copy", 1, x1.e.f14329b, 17039361, 16843538);
    public static final t0 Paste = new t0("Paste", 2, x1.e.f14330c, 17039371, 16843539);
    public static final t0 SelectAll = new t0("SelectAll", 3, x1.e.f14331d, 17039373, 16843646);

    private static final /* synthetic */ t0[] $values() {
        return new t0[]{Cut, Copy, Paste, SelectAll, Autofill};
    }

    static {
        int i2;
        if (Build.VERSION.SDK_INT <= 26) {
            i2 = R.string.androidx_compose_foundation_autofill;
        } else {
            i2 = 17039386;
        }
        Autofill = new t0("Autofill", 4, x1.e.f14332e, i2, 0);
        t0[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private t0(String str, int i2, Object obj, int i10, int i11) {
        this.key = obj;
        this.stringId = i10;
        this.drawableId = i11;
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) $VALUES.clone();
    }

    /* renamed from: getDrawableId-3I4p1mQ  reason: not valid java name */
    public final int m17getDrawableId3I4p1mQ() {
        return this.drawableId;
    }

    public final Object getKey() {
        return this.key;
    }

    /* renamed from: getStringId-9Hzcbyc  reason: not valid java name */
    public final int m18getStringId9Hzcbyc() {
        return this.stringId;
    }

    public final String resolvedString(n2.m mVar, int i2) {
        return ((Resources) ((n2.r) mVar).j(b4.r0.f1938c)).getString(this.stringId);
    }
}
