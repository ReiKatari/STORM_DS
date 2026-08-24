package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v42  reason: default package */
/* loaded from: classes.dex */
public final class v42 extends hw6 implements eo2 {
    public List X;
    public fo4 Y;
    public int Z;
    public int d0;
    public int e0;
    public /* synthetic */ Object f0;
    public final /* synthetic */ w42 g0;
    public final /* synthetic */ q42 h0;
    public final /* synthetic */ fo4 i0;
    public final /* synthetic */ List j0;
    public final /* synthetic */ k62 k0;
    public final /* synthetic */ z23 l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v42(w42 w42Var, q42 q42Var, fo4 fo4Var, List list, k62 k62Var, z23 z23Var, r41 r41Var) {
        super(2, r41Var);
        this.g0 = w42Var;
        this.h0 = q42Var;
        this.i0 = fo4Var;
        this.j0 = list;
        this.k0 = k62Var;
        this.l0 = z23Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((v42) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        v42 v42Var = new v42(this.g0, this.h0, this.i0, this.j0, this.k0, this.l0, r41Var);
        v42Var.f0 = obj;
        return v42Var;
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        w61 w61Var;
        fo4 fo4Var;
        Bitmap A;
        List list;
        int size;
        int i;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i2 = this.e0;
        k62 k62Var = this.k0;
        q42 q42Var = this.h0;
        if (i2 != 0) {
            if (i2 == 1) {
                size = this.d0;
                int i3 = this.Z;
                fo4Var = this.Y;
                list = this.X;
                w61Var = (w61) this.f0;
                oi2.Y(obj);
                A = (Bitmap) obj;
                yh2.o(w61Var.A());
                i = i3 + 1;
            } else {
                i.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            oi2.Y(obj);
            w61Var = (w61) this.f0;
            Drawable drawable = q42Var.a;
            boolean z = drawable instanceof BitmapDrawable;
            fo4Var = this.i0;
            if (z) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                Bitmap.Config config = bitmap.getConfig();
                if (config == null) {
                    config = Bitmap.Config.ARGB_8888;
                }
                if (fv.o0(k.a, config)) {
                    A = bitmap;
                    k62Var.getClass();
                    list = this.j0;
                    size = list.size();
                    i = 0;
                }
            }
            A = g04.A(drawable, fo4Var.b, fo4Var.d, fo4Var.e, fo4Var.f);
            k62Var.getClass();
            list = this.j0;
            size = list.size();
            i = 0;
        }
        if (i >= size) {
            k62Var.getClass();
            return new q42(new BitmapDrawable(this.l0.a.getResources(), A), q42Var.b, q42Var.c, q42Var.d);
        } else if (list.get(i) != null) {
            u34.a();
            return null;
        } else {
            wi6 wi6Var = fo4Var.d;
            this.f0 = w61Var;
            this.X = list;
            this.Y = fo4Var;
            this.Z = i;
            this.d0 = size;
            this.e0 = 1;
            throw null;
        }
    }
}
