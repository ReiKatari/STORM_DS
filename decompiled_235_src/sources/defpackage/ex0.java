package defpackage;

import android.os.CancellationSignal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ex0  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ex0 implements CancellationSignal.OnCancelListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ex0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.os.CancellationSignal.OnCancelListener
    public final void onCancel() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ap6) obj).h(null);
                return;
            default:
                p27 p27Var = (p27) obj;
                if (p27Var != null) {
                    jt3 jt3Var = p27Var.d;
                    if (jt3Var != null) {
                        jt3Var.e(k47.b);
                    }
                    jt3 jt3Var2 = p27Var.d;
                    if (jt3Var2 != null) {
                        jt3Var2.f(k47.b);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}
