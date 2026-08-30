package me.magnum.melonds.ui.shortcutsetup;

import a4.n;
import a6.p0;
import a6.x0;
import a7.v;
import ah.j1;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.h1;
import androidx.fragment.app.j0;
import bi.h;
import bi.i0;
import hi.c;
import java.util.WeakHashMap;
import k7.w;
import m9.o;
import me.magnum.melonds.R;
import me.magnum.melonds.ui.romlist.a;
import nc.u;
import yb.j;
import zb.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class ShortcutSetupActivity extends j1 {

    /* renamed from: z0  reason: collision with root package name */
    public static final /* synthetic */ int f9629z0 = 0;

    /* renamed from: y0  reason: collision with root package name */
    public final v f9630y0;

    public ShortcutSetupActivity() {
        super(2);
        this.f9630y0 = new v(u.a(i0.class), new c(this, 1), new c(this, 0), new c(this, 2));
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, nc.r] */
    @Override // ah.j1, androidx.fragment.app.o0, d.k, m5.e, android.app.Activity
    public final void onCreate(Bundle bundle) {
        a aVar;
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_shortcut_setup, (ViewGroup) null, false);
        int i2 = R.id.layout_root;
        FrameLayout frameLayout = (FrameLayout) w.k(inflate, R.id.layout_root);
        if (frameLayout != null) {
            i2 = R.id.toolbar;
            Toolbar toolbar = (Toolbar) w.k(inflate, R.id.toolbar);
            if (toolbar != null) {
                i2 = R.id.view_status_bar_background;
                View k10 = w.k(inflate, R.id.view_status_bar_background);
                if (k10 != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    n nVar = new n(constraintLayout, frameLayout, toolbar, k10, 20);
                    setContentView(constraintLayout);
                    y(toolbar);
                    ?? obj = new Object();
                    obj.A = -1;
                    h hVar = new h(6, obj, nVar);
                    WeakHashMap weakHashMap = x0.f533a;
                    p0.k(constraintLayout, hVar);
                    if (bundle == null) {
                        a.EnumC0005a enumC0005a = a.EnumC0005a.ENABLE_ALL;
                        enumC0005a.getClass();
                        aVar = new a();
                        aVar.setArguments(k.b(new j("allow_rom_configuration", Boolean.FALSE), new j("rom_enable_criteria", enumC0005a.toString())));
                        h1 t5 = t();
                        t5.getClass();
                        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(t5);
                        aVar2.i(frameLayout.getId(), aVar, "rom_list");
                        aVar2.e();
                    } else {
                        j0 D = t().D("rom_list");
                        D.getClass();
                        aVar = (a) D;
                    }
                    aVar.f9575c0 = new a2.c(22, this);
                    return;
                }
            }
        }
        o.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i2)));
    }
}
