package defpackage;

import android.text.Editable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: at1  reason: default package */
/* loaded from: classes.dex */
public final class at1 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile at1 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        if (cls != null) {
            return new tn6(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
