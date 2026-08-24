package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.o;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bo7  reason: default package */
/* loaded from: classes.dex */
public final class bo7 extends ContextWrapper {
    public LayoutInflater a;
    public LayoutInflater b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public bo7(LayoutInflater layoutInflater, o oVar) {
        super(r0);
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        mf5 mf5Var = new mf5(this, 5);
        this.a = layoutInflater;
        oVar.getClass();
        oVar.getLifecycle().a(mf5Var);
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        if (!"layout_inflater".equals(str)) {
            return getBaseContext().getSystemService(str);
        }
        if (this.b == null) {
            if (this.a == null) {
                this.a = (LayoutInflater) getBaseContext().getSystemService("layout_inflater");
            }
            this.b = this.a.cloneInContext(this);
        }
        return this.b;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bo7(Context context, o oVar) {
        super(context);
        context.getClass();
        mf5 mf5Var = new mf5(this, 5);
        this.a = null;
        oVar.getClass();
        oVar.getLifecycle().a(mf5Var);
    }
}
