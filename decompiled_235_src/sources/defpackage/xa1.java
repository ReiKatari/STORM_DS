package defpackage;

import android.graphics.Bitmap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xa1  reason: default package */
/* loaded from: classes.dex */
public final class xa1 extends qo7 {
    public final kd6 b;
    public final kx5 c;
    public final tp6 d;
    public final de5 e;

    public xa1(p06 p06Var, kd6 kd6Var, kx5 kx5Var) {
        p06Var.getClass();
        kd6Var.getClass();
        kx5Var.getClass();
        this.b = kd6Var;
        this.c = kx5Var;
        tp6 a = up6.a(oa1.a);
        this.d = a;
        this.e = new de5(a);
        hv.L(to7.a(this), null, null, new a6(new cf2(new g21(((xb2) p06Var).o(), 1), new m5(this, null, 10), 2), null, 20), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(pq5 pq5Var, s41 s41Var) {
        va1 va1Var;
        int i;
        if (s41Var instanceof va1) {
            va1Var = (va1) s41Var;
            int i2 = va1Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                va1Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = va1Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = va1Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    va1Var.Y = 1;
                    kx5 kx5Var = this.c;
                    kx5Var.getClass();
                    xe1 xe1Var = xk1.a;
                    obj = hv.d0(de1.L, new m5(pq5Var, kx5Var, (r41) null, 28), va1Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                return new ix5((Bitmap) obj, ((ng6) this.b).q());
            }
        }
        va1Var = new va1(this, s41Var);
        Object obj2 = va1Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = va1Var.Y;
        if (i == 0) {
        }
        return new ix5((Bitmap) obj2, ((ng6) this.b).q());
    }
}
