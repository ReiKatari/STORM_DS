package defpackage;

import com.google.android.gms.tasks.OnFailureListener;
import java.lang.reflect.Method;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sp2  reason: default package */
/* loaded from: classes.dex */
public final class sp2 implements OnFailureListener, mb0 {
    public final /* synthetic */ int A;
    public final /* synthetic */ rj0 B;

    public /* synthetic */ sp2(rj0 rj0Var, int i) {
        this.A = i;
        this.B = rj0Var;
    }

    @Override // defpackage.mb0
    public void c(gb0 gb0Var, vl5 vl5Var) {
        int i = this.A;
        rj0 rj0Var = this.B;
        switch (i) {
            case 1:
                if (vl5Var.a.m0) {
                    Object obj = vl5Var.b;
                    if (obj == null) {
                        pa x = gb0Var.x();
                        x.getClass();
                        ar0 a = gh5.a(ac3.class);
                        Class cls = a.a;
                        cls.getClass();
                        Object cast = cls.cast(((qo2) x.Y).A(a));
                        cast.getClass();
                        Method method = ((ac3) cast).b;
                        rj0Var.i(new em5(new NullPointerException("Response from " + yr2.class.getName() + '.' + method.getName() + " was null but response body type was declared as non-null")));
                        return;
                    }
                    rj0Var.i(obj);
                    return;
                }
                rj0Var.i(new em5(new ug(vl5Var)));
                return;
            case 2:
                if (vl5Var.a.m0) {
                    rj0Var.i(vl5Var.b);
                    return;
                } else {
                    rj0Var.i(new em5(new ug(vl5Var)));
                    return;
                }
            default:
                rj0Var.i(vl5Var);
                return;
        }
    }

    @Override // defpackage.mb0
    public void f(gb0 gb0Var, Throwable th) {
        int i = this.A;
        rj0 rj0Var = this.B;
        switch (i) {
            case 1:
                rj0Var.i(new em5(th));
                return;
            case 2:
                rj0Var.i(new em5(th));
                return;
            default:
                rj0Var.i(new em5(th));
                return;
        }
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public void onFailure(Exception exc) {
        exc.getClass();
        rj0 rj0Var = this.B;
        if (rj0Var.u() instanceof sg4) {
            rj0Var.i(new em5(exc));
        }
    }
}
