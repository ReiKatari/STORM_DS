package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s66  reason: default package */
/* loaded from: classes.dex */
public final class s66 extends id3 {
    public final /* synthetic */ int a;
    public final Object b;

    public s66(vc3 vc3Var, int i) {
        this.a = i;
        vc3Var.getClass();
        switch (i) {
            case 1:
                this.b = vc3Var;
                return;
            default:
                this.b = vc3Var;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ar, iv6, android.view.View] */
    @Override // defpackage.id3
    public final View a(Context context) {
        ti4 ti4Var;
        ti4 ti4Var2;
        int i = this.a;
        int i2 = R.drawable.button_fast_forward;
        Object obj = this.b;
        switch (i) {
            case 0:
                ImageView imageView = new ImageView(context);
                switch (r66.a[((vc3) obj).ordinal()]) {
                    case 1:
                        i2 = R.drawable.button_l;
                        break;
                    case 2:
                        i2 = R.drawable.button_r;
                        break;
                    case 3:
                        i2 = R.drawable.button_start;
                        break;
                    case 4:
                        i2 = R.drawable.button_select;
                        break;
                    case 5:
                        i2 = R.drawable.button_toggle_lid;
                        break;
                    case ig7.b /* 6 */:
                        i2 = R.drawable.button_pause;
                        break;
                    case 7:
                        break;
                    case 8:
                        i2 = R.drawable.ic_touch_enabled;
                        break;
                    case 9:
                        i2 = R.drawable.button_reset;
                        break;
                    case 10:
                        i2 = R.drawable.button_swap_screens;
                        break;
                    case 11:
                        i2 = R.drawable.button_quick_save;
                        break;
                    case mj2.L /* 12 */:
                        i2 = R.drawable.button_quick_load;
                        break;
                    case 13:
                        i2 = R.drawable.button_rewind;
                        break;
                    case 14:
                        i2 = R.drawable.button_microphone;
                        break;
                    default:
                        i2 = -1;
                        break;
                }
                imageView.setImageResource(i2);
                return imageView;
            case 1:
                ?? arVar = new ar(context, null, 0);
                int i3 = kv6.a[((vc3) obj).ordinal()];
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            ti4Var2 = new ti4(null, null);
                            arVar.setEnabledDrawable((Integer) ti4Var2.A);
                            arVar.setDisabledDrawable((Integer) ti4Var2.B);
                            return arVar;
                        }
                        ti4Var = new ti4(Integer.valueOf((int) R.drawable.ic_touch_enabled), Integer.valueOf((int) R.drawable.ic_touch_disabled));
                    } else {
                        ti4Var = new ti4(Integer.valueOf((int) R.drawable.button_microphone), Integer.valueOf((int) R.drawable.button_microphone_disabled));
                    }
                } else {
                    ti4Var = new ti4(Integer.valueOf((int) R.drawable.button_fast_forward), Integer.valueOf((int) R.drawable.button_fast_forward_disabled));
                }
                ti4Var2 = ti4Var;
                arVar.setEnabledDrawable((Integer) ti4Var2.A);
                arVar.setDisabledDrawable((Integer) ti4Var2.B);
                return arVar;
            default:
                View a = ((id3) obj).a(context);
                a.setBackground(context.getDrawable(R.drawable.background_uiview_selector));
                return a;
        }
    }

    @Override // defpackage.id3
    public final float b() {
        switch (this.a) {
            case 0:
            case 1:
                return 1.0f;
            default:
                return ((id3) this.b).b();
        }
    }

    public s66(id3 id3Var) {
        this.a = 2;
        this.b = id3Var;
    }
}
