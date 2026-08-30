package defpackage;

import android.text.Editable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qo1  reason: default package */
/* loaded from: classes.dex */
public final class qo1 extends Editable.Factory {
    public static final Object a = new Object();
    public static volatile qo1 b;
    public static Class c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = c;
        if (cls != null) {
            return new dc6(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
