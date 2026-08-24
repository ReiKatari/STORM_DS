package defpackage;

import android.content.res.Resources;
import android.os.Build;
import com.stormds.emulator.R;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t07  reason: default package */
/* loaded from: classes.dex */
public final class t07 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ t07[] $VALUES;
    public static final t07 Autofill;
    private final int drawableId;
    private final Object key;
    private final int stringId;
    public static final t07 Cut = new t07("Cut", 0, nc1.i, 17039363, 16843537);
    public static final t07 Copy = new t07("Copy", 1, nc1.j, 17039361, 16843538);
    public static final t07 Paste = new t07("Paste", 2, nc1.k, 17039371, 16843539);
    public static final t07 SelectAll = new t07("SelectAll", 3, nc1.l, 17039373, 16843646);

    private static final /* synthetic */ t07[] $values() {
        return new t07[]{Cut, Copy, Paste, SelectAll, Autofill};
    }

    static {
        int i;
        Object obj = nc1.m;
        if (Build.VERSION.SDK_INT <= 26) {
            i = R.string.androidx_compose_foundation_autofill;
        } else {
            i = 17039386;
        }
        Autofill = new t07("Autofill", 4, obj, i, 0);
        t07[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private t07(String str, int i, Object obj, int i2, int i3) {
        this.key = obj;
        this.stringId = i2;
        this.drawableId = i3;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static t07 valueOf(String str) {
        return (t07) Enum.valueOf(t07.class, str);
    }

    public static t07[] values() {
        return (t07[]) $VALUES.clone();
    }

    /* renamed from: getDrawableId-3I4p1mQ  reason: not valid java name */
    public final int m8getDrawableId3I4p1mQ() {
        return this.drawableId;
    }

    public final Object getKey() {
        return this.key;
    }

    /* renamed from: getStringId-9Hzcbyc  reason: not valid java name */
    public final int m9getStringId9Hzcbyc() {
        return this.stringId;
    }

    public final String resolvedString(px0 px0Var, int i) {
        return ((Resources) ((xq2) px0Var).j(kf.c)).getString(this.stringId);
    }
}
