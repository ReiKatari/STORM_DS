package defpackage;

import android.os.Build;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import defpackage.ua5;
import defpackage.wa5;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pi3  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pi3 implements on2 {
    public final /* synthetic */ int A;

    public /* synthetic */ pi3(int i) {
        this.A = i;
    }

    @Override // defpackage.on2
    public final Object c() {
        gg3 _init_$_anonymous_;
        switch (this.A) {
            case 0:
                return Boolean.valueOf(Build.BRAND.equals("google"));
            case 1:
                return np2.Y(Boolean.FALSE);
            case 2:
                return new ip3(0, 0);
            case 3:
                return new pr3(0, 0);
            case 4:
                return "https://translate.terraprint.co/translate";
            case 5:
                return "";
            case 6:
                py0 py0Var = wx3.a;
                return null;
            case 7:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 8:
                py0 py0Var2 = ay3.a;
                return null;
            case 9:
                py0 py0Var3 = by3.a;
                return null;
            case 10:
                nq6 nq6Var = cy3.a;
                return cs1.d0;
            case 11:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 12:
                py0 py0Var4 = ey3.a;
                return null;
            case 13:
                return new h56();
            case 14:
                wb1 wb1Var = new wb1(2, (byte) 0);
                wb1Var.b(gh5.a(tb4.class), new x84(1));
                return wb1Var.d();
            case 15:
                return new ru(zi4.a, 0);
            case 16:
                return dj4.Companion.serializer();
            case 17:
                return gk4.Companion.serializer();
            case 18:
                return ik4.Companion.serializer();
            case 19:
                _init_$_anonymous_ = dj4._init_$_anonymous_();
                return _init_$_anonymous_;
            case 20:
                return new ru(qj4.a, 0);
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                return new ru(wj4.a, 0);
            case 22:
                return gk4.a();
            case ConnectionResult.API_DISABLED /* 23 */:
                return ik4.a();
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return new vp4();
            case 25:
                int i = ru4.b;
                return jg7.a;
            case SubAllocator.N4 /* 26 */:
                xe1 xe1Var = xk1.a;
                return de1.L;
            case 27:
                ua5.b bVar = ua5.Companion;
                return new ru(wa5.a.a, 0);
            case 28:
                return new ru(nv.a, 0);
            default:
                return new fq5();
        }
    }
}
