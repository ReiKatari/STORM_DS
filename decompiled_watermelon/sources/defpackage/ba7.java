package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import androidx.fragment.app.o;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ba7  reason: default package */
/* loaded from: classes.dex */
public final class ba7 extends ContextWrapper {
    public LayoutInflater a;
    public LayoutInflater b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ba7(android.view.LayoutInflater r3, androidx.fragment.app.o r4) {
        /*
            r2 = this;
            r3.getClass()
            android.content.Context r0 = r3.getContext()
            r0.getClass()
            r2.<init>(r0)
            w55 r0 = new w55
            r1 = 5
            r0.<init>(r1, r2)
            r2.a = r3
            r4.getClass()
            rm3 r2 = r4.getLifecycle()
            r2.a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ba7.<init>(android.view.LayoutInflater, androidx.fragment.app.o):void");
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
    public ba7(Context context, o oVar) {
        super(context);
        context.getClass();
        w55 w55Var = new w55(5, this);
        this.a = null;
        oVar.getClass();
        oVar.getLifecycle().a(w55Var);
    }
}
