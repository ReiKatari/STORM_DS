package ba;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public d8.b f2130a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ c f2131b;

    public a(c cVar) {
        this.f2131b = cVar;
    }

    public final void a(Drawable drawable) {
        c cVar = this.f2131b;
        ColorStateList colorStateList = cVar.f2146l0;
        if (colorStateList != null) {
            drawable.setTint(colorStateList.getColorForState(cVar.p0, colorStateList.getDefaultColor()));
        }
    }
}
