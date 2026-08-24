package defpackage;

import android.graphics.Bitmap;
import android.graphics.Rect;
import android.view.PixelCopy;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cq2  reason: default package */
/* loaded from: classes.dex */
public final class cq2 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ int Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ hq2 d0;
    public final /* synthetic */ Bitmap e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq2(int i, int i2, hq2 hq2Var, Bitmap bitmap, r41 r41Var) {
        super(2, r41Var);
        this.Y = i;
        this.Z = i2;
        this.d0 = hq2Var;
        this.e0 = bitmap;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((cq2) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new cq2(this.Y, this.Z, this.d0, this.e0, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        if (i != 0) {
            if (i == 1) {
                oi2.Y(obj);
                return obj;
            }
            i.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        oi2.Y(obj);
        int i2 = this.Y;
        int i3 = this.Z;
        hq2 hq2Var = this.d0;
        this.X = 1;
        rj0 rj0Var = new rj0(1, np2.V(this));
        rj0Var.v();
        Bitmap bitmap = this.e0;
        bq2 bq2Var = new bq2(rj0Var, bitmap, 1);
        try {
            PixelCopy.request(hq2Var.a.getWindow(), new Rect(0, 0, i2, i3), bitmap, bq2Var, hq2Var.k);
        } catch (Throwable unused) {
            if (rj0Var.u() instanceof sg4) {
                rj0Var.G(null, null);
            }
        }
        Object s = rj0Var.s();
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        if (s == x61Var) {
            return x61Var;
        }
        return s;
    }
}
