package me.magnum.melonds.ui.shortcutsetup;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o;
import java.util.WeakHashMap;
import me.magnum.melonds.ui.romlist.a;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class ShortcutSetupActivity extends rr2 {
    public static final /* synthetic */ int B0 = 0;
    public final va7 A0;

    public ShortcutSetupActivity() {
        super(4);
        this.A0 = new va7(q75.a(yo5.class), new v56(this, 1), new v56(this, 0), new v56(this, 2));
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, l75] */
    @Override // defpackage.rr2, androidx.fragment.app.p, defpackage.ys0, defpackage.xs0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        a aVar;
        jn1.a(this, new ml6(0, 0, 2, new d96(6)), 2);
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_shortcut_setup, (ViewGroup) null, false);
        int i = R.id.layout_root;
        FrameLayout frameLayout = (FrameLayout) ep2.r(inflate, R.id.layout_root);
        if (frameLayout != null) {
            i = R.id.toolbar;
            Toolbar toolbar = (Toolbar) ep2.r(inflate, R.id.toolbar);
            if (toolbar != null) {
                i = R.id.view_status_bar_background;
                View r = ep2.r(inflate, R.id.view_status_bar_background);
                if (r != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    os osVar = new os(constraintLayout, frameLayout, toolbar, r);
                    setContentView(constraintLayout);
                    y(toolbar);
                    ?? obj = new Object();
                    obj.A = -1;
                    hi0 hi0Var = new hi0(8, obj, osVar);
                    WeakHashMap weakHashMap = aa7.a;
                    s97.c(constraintLayout, hi0Var);
                    if (bundle == null) {
                        a.EnumC0004a enumC0004a = a.EnumC0004a.ENABLE_ALL;
                        enumC0004a.getClass();
                        aVar = new a();
                        aVar.setArguments(dk7.k(new ti4("allow_rom_configuration", Boolean.FALSE), new ti4("rom_enable_criteria", enumC0004a.toString())));
                        mg2 t = t();
                        t.getClass();
                        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(t);
                        aVar2.j(frameLayout.getId(), aVar, "rom_list");
                        aVar2.f();
                    } else {
                        o D = t().D("rom_list");
                        D.getClass();
                        aVar = (a) D;
                    }
                    aVar.d0 = new n95(13, this);
                    return;
                }
            }
        }
        c44.i("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
