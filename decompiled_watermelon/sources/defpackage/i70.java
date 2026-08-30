package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i70  reason: default package */
/* loaded from: classes.dex */
public final class i70 extends id3 {
    public final /* synthetic */ int a;

    @Override // defpackage.id3
    public final View a(Context context) {
        switch (this.a) {
            case 0:
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.buttons);
                return imageView;
            case 1:
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.keypad);
                return imageView2;
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

    @Override // defpackage.id3
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
