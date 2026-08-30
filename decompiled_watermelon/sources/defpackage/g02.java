package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: g02  reason: default package */
/* loaded from: classes.dex */
public final class g02 extends nk6 implements aj2 {
    public List X;
    public df4 Y;
    public int Z;
    public int c0;
    public int d0;
    public /* synthetic */ Object e0;
    public final /* synthetic */ h02 f0;
    public final /* synthetic */ b02 g0;
    public final /* synthetic */ df4 h0;
    public final /* synthetic */ List i0;
    public final /* synthetic */ t12 j0;
    public final /* synthetic */ vw2 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g02(h02 h02Var, b02 b02Var, df4 df4Var, List list, t12 t12Var, vw2 vw2Var, j11 j11Var) {
        super(2, j11Var);
        this.f0 = h02Var;
        this.g0 = b02Var;
        this.h0 = df4Var;
        this.i0 = list;
        this.j0 = t12Var;
        this.k0 = vw2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((g02) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        g02 g02Var = new g02(this.f0, this.g0, this.h0, this.i0, this.j0, this.k0, j11Var);
        g02Var.e0 = obj;
        return g02Var;
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        o31 o31Var;
        df4 df4Var;
        Bitmap j;
        List list;
        int size;
        int i;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i2 = this.d0;
        t12 t12Var = this.j0;
        b02 b02Var = this.g0;
        if (i2 != 0) {
            if (i2 == 1) {
                size = this.c0;
                int i3 = this.Z;
                df4Var = this.Y;
                list = this.X;
                o31Var = (o31) this.e0;
                me2.a0(obj);
                j = (Bitmap) obj;
                ln2.B(o31Var.w());
                i = i3 + 1;
            } else {
                i.n("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            me2.a0(obj);
            o31Var = (o31) this.e0;
            Drawable drawable = b02Var.a;
            boolean z = drawable instanceof BitmapDrawable;
            df4Var = this.h0;
            if (z) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                Bitmap.Config config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (nu.a0(k.a, config)) {
                    j = bitmap;
                    t12Var.getClass();
                    list = this.i0;
                    size = list.size();
                    i = 0;
                }
            }
            j = w81.j(drawable, df4Var.b, df4Var.d, df4Var.e, df4Var.f);
            t12Var.getClass();
            list = this.i0;
            size = list.size();
            i = 0;
        }
        if (i >= size) {
            t12Var.getClass();
            return new b02(new BitmapDrawable(this.k0.a.getResources(), j), b02Var.b, b02Var.c, b02Var.d);
        } else if (list.get(i) != null) {
            c44.b();
            return null;
        } else {
            h76 h76Var = df4Var.d;
            this.e0 = o31Var;
            this.X = list;
            this.Y = df4Var;
            this.Z = i;
            this.c0 = size;
            this.d0 = 1;
            throw null;
        }
    }
}
