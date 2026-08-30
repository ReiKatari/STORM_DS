package o6;

import android.text.Editable;
import m6.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends Editable.Factory {

    /* renamed from: a  reason: collision with root package name */
    public static final Object f10848a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static volatile a f10849b;

    /* renamed from: c  reason: collision with root package name */
    public static Class f10850c;

    @Override // android.text.Editable.Factory
    public final Editable newEditable(CharSequence charSequence) {
        Class cls = f10850c;
        if (cls != null) {
            return new t(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
