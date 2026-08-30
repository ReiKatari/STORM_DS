package bi;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.s0;
import j7.j1;
import j7.k0;
import java.util.ArrayList;
import me.magnum.melonds.R;
import zc.l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y extends k0 {

    /* renamed from: d  reason: collision with root package name */
    public final boolean f2322d;

    /* renamed from: e  reason: collision with root package name */
    public final Context f2323e;

    /* renamed from: f  reason: collision with root package name */
    public final androidx.lifecycle.s f2324f;

    /* renamed from: g  reason: collision with root package name */
    public final z f2325g;

    /* renamed from: h  reason: collision with root package name */
    public final a0.j f2326h;

    /* renamed from: i  reason: collision with root package name */
    public final ArrayList f2327i = new ArrayList();

    /* renamed from: j  reason: collision with root package name */
    public final /* synthetic */ me.magnum.melonds.ui.romlist.a f2328j;

    public y(me.magnum.melonds.ui.romlist.a aVar, boolean z10, Context context, androidx.lifecycle.s sVar, z zVar, a0.j jVar) {
        this.f2328j = aVar;
        this.f2322d = z10;
        this.f2323e = context;
        this.f2324f = sVar;
        this.f2325g = zVar;
        this.f2326h = jVar;
    }

    @Override // j7.k0
    public final int a() {
        return this.f2327i.size();
    }

    @Override // j7.k0
    public final void e(j1 j1Var, int i2) {
        int i10;
        Drawable drawable;
        w wVar = (w) j1Var;
        Object obj = this.f2327i.get(i2);
        obj.getClass();
        ze.a aVar = (ze.a) obj;
        boolean z10 = true;
        switch (this.f2326h.A) {
            case 12:
                break;
            default:
                z10 = true ^ aVar.f15060h;
                break;
        }
        boolean z11 = z10;
        View view = wVar.f7594a;
        ImageView imageView = wVar.f2317y;
        boolean z12 = aVar.f15060h;
        wVar.f2318z = aVar;
        TextView textView = wVar.f2315w;
        String str = aVar.f15058f.f711e;
        if (str == null) {
            str = aVar.f15053a;
        }
        textView.setText(str);
        wVar.f2316x.setText(aVar.f15055c);
        wVar.f2314v.setImageDrawable(null);
        imageView.getClass();
        if (z12) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        imageView.setVisibility(i10);
        if (z12) {
            Resources resources = view.getResources();
            ThreadLocal threadLocal = p5.k.f11352a;
            drawable = resources.getDrawable(R.drawable.logo_dsiware, null);
        } else {
            drawable = null;
        }
        if (drawable != null && !z11) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            drawable.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            drawable.setAlpha(127);
        }
        imageView.setImageDrawable(drawable);
        wVar.A = zc.x.v(wVar.f2313u, null, null, new v(wVar.B.f2328j, aVar, wVar, z11, (cc.c) null), 3);
        view.getClass();
        l0.f.F(view, z11);
    }

    @Override // j7.k0
    public final j1 f(ViewGroup viewGroup, int i2) {
        boolean z10 = this.f2322d;
        Context context = this.f2323e;
        if (z10) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.item_rom_configurable, viewGroup, false);
            int i10 = R.id.buttonRomConfig;
            if (((ImageView) k7.w.k(inflate, R.id.buttonRomConfig)) != null) {
                if (((RelativeLayout) k7.w.k(inflate, R.id.layout_rom_base_content)) != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    constraintLayout.getClass();
                    androidx.lifecycle.s f8 = s0.f(this.f2328j);
                    z zVar = this.f2325g;
                    a2.g gVar = new a2.g(1, zVar, z.class, "onRomClicked", "onRomClicked(Lme/magnum/melonds/domain/model/rom/Rom;)V", 0, 0, 2);
                    a2.g gVar2 = new a2.g(1, zVar, z.class, "onRomConfigClicked", "onRomConfigClicked(Lme/magnum/melonds/domain/model/rom/Rom;)V", 0, 0, 3);
                    w wVar = new w(this, constraintLayout, f8, gVar);
                    ((ImageView) constraintLayout.findViewById(R.id.buttonRomConfig)).setOnClickListener(new b(1, gVar2, wVar));
                    return wVar;
                }
                i10 = R.id.layout_rom_base_content;
            }
            m9.o.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i10)));
            return null;
        }
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.item_rom_simple, viewGroup, false);
        if (inflate2 != null) {
            return new w(this, (RelativeLayout) inflate2, this.f2324f, new a2.g(1, this.f2325g, z.class, "onRomClicked", "onRomClicked(Lme/magnum/melonds/domain/model/rom/Rom;)V", 0, 0, 4));
        }
        m9.o.i("rootView");
        return null;
    }

    @Override // j7.k0
    public final void g(j1 j1Var) {
        w wVar = (w) j1Var;
        wVar.getClass();
        l1 l1Var = wVar.A;
        if (l1Var != null) {
            l1Var.i(null);
        }
    }
}
