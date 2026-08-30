package kb;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.j0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends ContextWrapper {

    /* renamed from: a  reason: collision with root package name */
    public LayoutInflater f8133a;

    /* renamed from: b  reason: collision with root package name */
    public LayoutInflater f8134b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public i(android.view.LayoutInflater r3, androidx.fragment.app.j0 r4) {
        /*
            r2 = this;
            r3.getClass()
            android.content.Context r0 = r3.getContext()
            r0.getClass()
            r2.<init>(r0)
            q7.a r0 = new q7.a
            r1 = 2
            r0.<init>(r1, r2)
            r2.f8133a = r3
            r4.getClass()
            androidx.lifecycle.r r3 = r4.getLifecycle()
            r3.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kb.i.<init>(android.view.LayoutInflater, androidx.fragment.app.j0):void");
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.f8134b == null) {
            if (this.f8133a == null) {
                this.f8133a = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.f8134b = this.f8133a.cloneInContext(this);
        }
        return this.f8134b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(Context context, j0 j0Var) {
        super(context);
        context.getClass();
        q7.a aVar = new q7.a(2, this);
        this.f8133a = null;
        j0Var.getClass();
        j0Var.getLifecycle().a(aVar);
    }
}
