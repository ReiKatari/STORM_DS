package fh;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import og.j;
import q.w;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends j {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4964a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f4965b;

    public c(ve.c cVar, int i2) {
        this.f4964a = i2;
        cVar.getClass();
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.f4965b = cVar;
                return;
            default:
                this.f4965b = cVar;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [gh.a, android.view.View, q.w] */
    @Override // og.j
    public final View a(Context context) {
        yb.j jVar;
        yb.j jVar2;
        int i2;
        switch (this.f4964a) {
            case 0:
                ?? wVar = new w(context, null, 0);
                int i10 = b.f4963a[((ve.c) this.f4965b).ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            jVar2 = new yb.j(null, null);
                            wVar.setEnabledDrawable((Integer) jVar2.A);
                            wVar.setDisabledDrawable((Integer) jVar2.B);
                            return wVar;
                        }
                        jVar = new yb.j(Integer.valueOf((int) R.drawable.ic_touch_enabled), Integer.valueOf((int) R.drawable.ic_touch_disabled));
                    } else {
                        jVar = new yb.j(Integer.valueOf((int) R.drawable.button_microphone), Integer.valueOf((int) R.drawable.button_microphone_disabled));
                    }
                } else {
                    jVar = new yb.j(Integer.valueOf((int) R.drawable.button_fast_forward), Integer.valueOf((int) R.drawable.button_fast_forward_disabled));
                }
                jVar2 = jVar;
                wVar.setEnabledDrawable((Integer) jVar2.A);
                wVar.setDisabledDrawable((Integer) jVar2.B);
                return wVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                ImageView imageView = new ImageView(context);
                switch (tg.b.f13186a[((ve.c) this.f4965b).ordinal()]) {
                    case DSiCameraSource.FrontCamera /* 1 */:
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
                    case l1.c.f8511g /* 5 */:
                        i2 = R.drawable.button_toggle_lid;
                        break;
                    case l1.c.f8509e /* 6 */:
                        i2 = R.drawable.button_pause;
                        break;
                    case 7:
                        i2 = R.drawable.button_fast_forward;
                        break;
                    case 8:
                        i2 = R.drawable.ic_touch_enabled;
                        break;
                    case l1.c.f8508d /* 9 */:
                        i2 = R.drawable.button_reset;
                        break;
                    case l1.c.f8510f /* 10 */:
                        i2 = R.drawable.button_swap_screens;
                        break;
                    case 11:
                        i2 = R.drawable.button_quick_save;
                        break;
                    case 12:
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
            default:
                View a10 = ((j) this.f4965b).a(context);
                a10.setBackground(context.getDrawable(R.drawable.background_uiview_selector));
                return a10;
        }
    }

    @Override // og.j
    public final float b() {
        switch (this.f4964a) {
            case 0:
                return 1.0f;
            case DSiCameraSource.FrontCamera /* 1 */:
                return 1.0f;
            default:
                return ((j) this.f4965b).b();
        }
    }

    public c(j jVar) {
        this.f4964a = 2;
        this.f4965b = jVar;
    }
}
