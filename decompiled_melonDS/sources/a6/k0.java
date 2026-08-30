package a6;

import android.text.TextUtils;
import android.view.View;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k0 extends m0 {
    public final /* synthetic */ int X;

    public k0(int i2, Class cls, int i10, int i11, int i12) {
        this.X = i12;
        this.A = i2;
        this.R = cls;
        this.L = i10;
        this.B = i11;
    }

    @Override // a6.m0
    public final Object c(View view) {
        switch (this.X) {
            case 0:
                return Boolean.valueOf(s0.c(view));
            case DSiCameraSource.FrontCamera /* 1 */:
                return s0.a(view);
            case 2:
                return u0.b(view);
            default:
                return Boolean.valueOf(s0.b(view));
        }
    }

    @Override // a6.m0
    public final void d(View view, Object obj) {
        switch (this.X) {
            case 0:
                s0.f(view, ((Boolean) obj).booleanValue());
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                s0.e(view, (CharSequence) obj);
                return;
            case 2:
                u0.c(view, (CharSequence) obj);
                return;
            default:
                s0.d(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    @Override // a6.m0
    public final boolean g(Object obj, Object obj2) {
        boolean z10;
        boolean z11;
        boolean equals;
        boolean z12;
        boolean z13;
        switch (this.X) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                boolean z14 = false;
                if (bool != null && bool.booleanValue()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (bool2 != null && bool2.booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z10 == z11) {
                    z14 = true;
                }
                return !z14;
            case DSiCameraSource.FrontCamera /* 1 */:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            case 2:
                equals = TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
                break;
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                boolean z15 = false;
                if (bool3 != null && bool3.booleanValue()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (bool4 != null && bool4.booleanValue()) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (z12 == z13) {
                    z15 = true;
                }
                return !z15;
        }
        return !equals;
    }
}
