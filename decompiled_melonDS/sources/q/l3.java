package q;

import android.content.Context;
import android.view.View;
import android.view.Window;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l3 implements View.OnClickListener {
    public final p.a A;
    public final /* synthetic */ m3 B;

    /* JADX WARN: Type inference failed for: r0v0, types: [p.a, java.lang.Object] */
    public l3(m3 m3Var) {
        this.B = m3Var;
        Context context = m3Var.f11964a.getContext();
        CharSequence charSequence = m3Var.f11971h;
        ?? obj = new Object();
        obj.f11060e = 4096;
        obj.f11062g = 4096;
        obj.f11067l = null;
        obj.m = null;
        obj.f11068n = false;
        obj.f11069o = false;
        obj.f11070p = 16;
        obj.f11064i = context;
        obj.f11056a = charSequence;
        this.A = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        m3 m3Var = this.B;
        Window.Callback callback = m3Var.f11974k;
        if (callback != null && m3Var.f11975l) {
            callback.onMenuItemSelected(0, this.A);
        }
    }
}
