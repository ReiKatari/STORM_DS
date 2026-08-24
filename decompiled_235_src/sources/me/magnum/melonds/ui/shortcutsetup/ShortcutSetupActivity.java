package me.magnum.melonds.ui.shortcutsetup;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.o;
import com.stormds.emulator.R;
import java.util.WeakHashMap;
import me.magnum.melonds.ui.romlist.a;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ShortcutSetupActivity extends sx2 {
    public static final /* synthetic */ int C0 = 0;
    public final uo7 B0;

    public ShortcutSetupActivity() {
        super(4);
        this.B0 = new uo7(gh5.a(tz5.class), new ih6(this, 1), new ih6(this, 0), new ih6(this, 2));
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, bh5] */
    @Override // defpackage.sx2, androidx.fragment.app.p, defpackage.mv0, defpackage.lv0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        a aVar;
        setTheme(ht.a().getThemeResId());
        tr1.a(this, new ix6(0, 0, 2, new r76(18)));
        super.onCreate(bundle);
        View inflate = getLayoutInflater().inflate(R.layout.activity_shortcut_setup, (ViewGroup) null, false);
        int i = R.id.layout_root;
        FrameLayout frameLayout = (FrameLayout) gi2.B(inflate, R.id.layout_root);
        if (frameLayout != null) {
            i = R.id.toolbar;
            Toolbar toolbar = (Toolbar) gi2.B(inflate, R.id.toolbar);
            if (toolbar != null) {
                i = R.id.view_status_bar_background;
                View B = gi2.B(inflate, R.id.view_status_bar_background);
                if (B != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
                    bt btVar = new bt(constraintLayout, frameLayout, toolbar, B);
                    setContentView(constraintLayout);
                    y(toolbar);
                    ?? obj = new Object();
                    obj.A = -1;
                    pk0 pk0Var = new pk0(7, obj, btVar);
                    WeakHashMap weakHashMap = ao7.a;
                    sn7.c(constraintLayout, pk0Var);
                    if (bundle == null) {
                        a.EnumC0004a enumC0004a = a.EnumC0004a.ENABLE_ALL;
                        enumC0004a.getClass();
                        aVar = new a();
                        aVar.setArguments(jw2.l(new vr4("allow_rom_configuration", Boolean.FALSE), new vr4("rom_enable_criteria", enumC0004a.toString())));
                        ll2 t = t();
                        t.getClass();
                        androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(t);
                        aVar2.e(frameLayout.getId(), aVar, "rom_list");
                        aVar2.h();
                    } else {
                        o D = t().D("rom_list");
                        D.getClass();
                        aVar = (a) D;
                    }
                    aVar.e0 = new ro5(this, 11);
                    return;
                }
            }
        }
        u34.x("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
    }
}
