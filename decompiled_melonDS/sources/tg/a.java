package tg;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import me.magnum.melonds.R;
import og.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f13185a;

    @Override // og.j
    public final View a(Context context) {
        switch (this.f13185a) {
            case 0:
                ImageView imageView = new ImageView(context);
                imageView.setImageResource(R.drawable.buttons);
                return imageView;
            default:
                ImageView imageView2 = new ImageView(context);
                imageView2.setImageResource(R.drawable.keypad);
                return imageView2;
        }
    }

    @Override // og.j
    public final float b() {
        switch (this.f13185a) {
            case 0:
                return 1.0f;
            default:
                return 1.0f;
        }
    }
}
