package w5;

import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import bi.l;
import k5.c;
import me.magnum.melonds.R;
import me.magnum.melonds.ui.romlist.RomListActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends l {
    public final c B;

    public a(RomListActivity romListActivity) {
        super(romListActivity);
        this.B = new c(this, romListActivity);
    }

    @Override // bi.l
    public final void a() {
        int i2;
        RomListActivity romListActivity = this.A;
        Resources.Theme theme = romListActivity.getTheme();
        theme.getClass();
        TypedValue typedValue = new TypedValue();
        if (theme.resolveAttribute(R.attr.postSplashScreenTheme, typedValue, true) && (i2 = typedValue.resourceId) != 0) {
            romListActivity.setTheme(i2);
        }
        if (Build.VERSION.SDK_INT < 33) {
            View decorView = romListActivity.getWindow().getDecorView();
            decorView.getClass();
            ((ViewGroup) decorView).setOnHierarchyChangeListener(this.B);
        }
    }
}
