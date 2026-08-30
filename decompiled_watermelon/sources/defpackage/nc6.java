package defpackage;

import android.content.res.Resources;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import me.magnum.melonds.ui.romlist.RomListActivity;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nc6  reason: default package */
/* loaded from: classes.dex */
public final class nc6 extends rn5 {
    public final y11 B;

    public nc6(RomListActivity romListActivity) {
        super(romListActivity);
        this.B = new y11(this, romListActivity);
    }

    @Override // defpackage.rn5
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
