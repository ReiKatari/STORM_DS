package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.LinearLayout;
import com.stormds.emulator.R;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p90  reason: default package */
/* loaded from: classes.dex */
public final class p90 extends ak3 {
    public final /* synthetic */ int a;

    public /* synthetic */ p90(int i) {
        this.a = i;
    }

    @Override // defpackage.ak3
    public final View a(Context context) {
        switch (this.a) {
            case 0:
                s64 s64Var = new s64(context);
                SharedPreferences sharedPreferences = context.getSharedPreferences(v15.b(context), 0);
                s64Var.setButtonSpread(sharedPreferences.getFloat("pref_button_cluster_spread", 1.0f));
                s64Var.setButtonInnerScale(sharedPreferences.getFloat("pref_button_cluster_inner_scale", 1.0f));
                return s64Var;
            case 1:
                return new u64(context);
            default:
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                View view = new View(context);
                view.setBackground(context.getDrawable(R.drawable.background_top_screen));
                linearLayout.addView(view, new LinearLayout.LayoutParams(-1, 0, 1.0f));
                View view2 = new View(context);
                view2.setBackground(context.getDrawable(R.drawable.background_bottom_screen));
                linearLayout.addView(view2, new LinearLayout.LayoutParams(-1, 0, 1.0f));
                return linearLayout;
        }
    }

    @Override // defpackage.ak3
    public final float b() {
        switch (this.a) {
            case 0:
                return 1.0f;
            case 1:
                return 1.0f;
            default:
                return 0.6666667f;
        }
    }
}
