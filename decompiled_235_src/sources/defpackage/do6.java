package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.stormds.emulator.R;
import me.magnum.melonds.ui.romlist.RomListActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: do6  reason: default package */
/* loaded from: classes.dex */
public final class do6 extends hy5 {
    public final g51 B;

    public do6(RomListActivity romListActivity) {
        super(romListActivity);
        this.B = new g51(this, romListActivity);
    }

    @Override // defpackage.hy5
    public final void a() {
        int i;
        RomListActivity romListActivity = this.A;
        Resources.Theme theme = romListActivity.getTheme();
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i = typedValue.resourceId) != 0) {
            romListActivity.setTheme(i);
        }
        if (Build.VERSION.SDK_INT < 33) {
            View decorView = romListActivity.getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup) decorView).setOnHierarchyChangeListener(this.B);
        }
    }
}
