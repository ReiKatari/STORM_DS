package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jf  reason: default package */
/* loaded from: classes.dex */
public final class jf extends aj3 implements on2 {
    public final /* synthetic */ int B;
    public static final jf L = new jf(0, 0);
    public static final jf R = new jf(0, 1);
    public static final jf X = new jf(0, 2);
    public static final jf Y = new jf(0, 3);
    public static final jf Z = new jf(0, 4);
    public static final jf d0 = new jf(0, 5);
    public static final jf e0 = new jf(0, 6);
    public static final jf f0 = new jf(0, 7);
    public static final jf g0 = new jf(0, 8);
    public static final jf h0 = new jf(0, 9);
    public static final jf i0 = new jf(0, 10);
    public static final jf j0 = new jf(0, 11);
    public static final jf k0 = new jf(0, 12);
    public static final jf l0 = new jf(0, 13);
    public static final jf m0 = new jf(0, 14);
    public static final jf n0 = new jf(0, 15);
    public static final jf o0 = new jf(0, 16);
    public static final jf p0 = new jf(0, 17);
    public static final jf q0 = new jf(0, 18);
    public static final jf r0 = new jf(0, 19);
    public static final jf s0 = new jf(0, 20);
    public static final jf t0 = new jf(0, 21);
    public static final jf u0 = new jf(0, 22);
    public static final jf v0 = new jf(0, 23);
    public static final jf w0 = new jf(0, 24);
    public static final jf x0 = new jf(0, 25);
    public static final jf y0 = new jf(0, 26);
    public static final jf z0 = new jf(0, 27);
    public static final jf A0 = new jf(0, 28);
    public static final jf B0 = new jf(0, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jf(int i, int i2) {
        super(i);
        this.B = i2;
    }

    @Override // defpackage.on2
    public final Object c() {
        Choreographer choreographer;
        switch (this.B) {
            case 0:
                kf.a("LocalConfiguration");
                throw null;
            case 1:
                kf.a("LocalContext");
                throw null;
            case 2:
                kf.a("LocalImageVectorCache");
                throw null;
            case 3:
                kf.a("LocalResourceIdCache");
                throw null;
            case 4:
                kf.a("LocalView");
                throw null;
            case 5:
                return UUID.randomUUID();
            case 6:
                return Boolean.FALSE;
            case 7:
                return "DEFAULT_TEST_TAG";
            case 8:
                return UUID.randomUUID();
            case 9:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    xe1 xe1Var = xk1.a;
                    choreographer = (Choreographer) hv.V(e04.a, new wg(2, null, 4));
                }
                sm smVar = new sm(choreographer, uj2.u(Looper.getMainLooper()));
                return jw2.y(smVar, smVar.h0);
            case 10:
                return null;
            case 11:
                return new sm3(2);
            case 12:
            case 13:
                return null;
            case 14:
                ky0.b("LocalAutofillManager");
                throw null;
            case 15:
                ky0.b("LocalAutofillTree");
                throw null;
            case 16:
                ky0.b("LocalClipboard");
                throw null;
            case 17:
                ky0.b("LocalClipboardManager");
                throw null;
            case 18:
                return Boolean.TRUE;
            case 19:
                ky0.b("LocalDensity");
                throw null;
            case 20:
                ky0.b("LocalFocusManager");
                throw null;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                ky0.b("LocalFontFamilyResolver");
                throw null;
            case 22:
                ky0.b("LocalFontLoader");
                throw null;
            case ConnectionResult.API_DISABLED /* 23 */:
                ky0.b("LocalGraphicsContext");
                throw null;
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                ky0.b("LocalHapticFeedback");
                throw null;
            case 25:
                ky0.b("LocalInputManager");
                throw null;
            case SubAllocator.N4 /* 26 */:
                ky0.b("LocalLayoutDirection");
                throw null;
            case 27:
                return null;
            case 28:
                ky0.b("LocalProvidableLocaleList");
                throw null;
            default:
                return Boolean.FALSE;
        }
    }
}
