package defpackage;

import android.content.res.Resources;
import android.os.Build;
import me.magnum.melondualds.R;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: io6  reason: default package */
/* loaded from: classes.dex */
public final class io6 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ io6[] $VALUES;
    public static final io6 Autofill;
    private final int drawableId;
    private final Object key;
    private final int stringId;
    public static final io6 Cut = new io6("Cut", 0, dk7.k, 17039363, 16843537);
    public static final io6 Copy = new io6("Copy", 1, dk7.l, 17039361, 16843538);
    public static final io6 Paste = new io6("Paste", 2, dk7.m, 17039371, 16843539);
    public static final io6 SelectAll = new io6("SelectAll", 3, dk7.n, 17039373, 16843646);

    private static final /* synthetic */ io6[] $values() {
        return new io6[]{Cut, Copy, Paste, SelectAll, Autofill};
    }

    static {
        int i;
        Object obj = dk7.o;
        if (Build.VERSION.SDK_INT <= 26) {
            i = R.string.androidx_compose_foundation_autofill;
        } else {
            i = 17039386;
        }
        Autofill = new io6("Autofill", 4, obj, i, 0);
        io6[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private io6(String str, int i, Object obj, int i2, int i3) {
        this.key = obj;
        this.stringId = i2;
        this.drawableId = i3;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static io6 valueOf(String str) {
        return (io6) Enum.valueOf(io6.class, str);
    }

    public static io6[] values() {
        return (io6[]) $VALUES.clone();
    }

    /* renamed from: getDrawableId-3I4p1mQ  reason: not valid java name */
    public final int m9getDrawableId3I4p1mQ() {
        return this.drawableId;
    }

    public final Object getKey() {
        return this.key;
    }

    /* renamed from: getStringId-9Hzcbyc  reason: not valid java name */
    public final int m10getStringId9Hzcbyc() {
        return this.stringId;
    }

    public final String resolvedString(tu0 tu0Var, int i) {
        return ((Resources) ((sk2) tu0Var).j(ue.c)).getString(this.stringId);
    }
}
