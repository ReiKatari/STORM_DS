package defpackage;

import android.os.Looper;
import android.view.Choreographer;
import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: te  reason: default package */
/* loaded from: classes.dex */
public final class te extends ic3 implements ki2 {
    public final /* synthetic */ int B;
    public static final te L = new te(0, 0);
    public static final te R = new te(0, 1);
    public static final te X = new te(0, 2);
    public static final te Y = new te(0, 3);
    public static final te Z = new te(0, 4);
    public static final te c0 = new te(0, 5);
    public static final te d0 = new te(0, 6);
    public static final te e0 = new te(0, 7);
    public static final te f0 = new te(0, 8);
    public static final te g0 = new te(0, 9);
    public static final te h0 = new te(0, 10);
    public static final te i0 = new te(0, 11);
    public static final te j0 = new te(0, 12);
    public static final te k0 = new te(0, 13);
    public static final te l0 = new te(0, 14);
    public static final te m0 = new te(0, 15);
    public static final te n0 = new te(0, 16);
    public static final te o0 = new te(0, 17);
    public static final te p0 = new te(0, 18);
    public static final te q0 = new te(0, 19);
    public static final te r0 = new te(0, 20);
    public static final te s0 = new te(0, 21);
    public static final te t0 = new te(0, 22);
    public static final te u0 = new te(0, 23);
    public static final te v0 = new te(0, 24);
    public static final te w0 = new te(0, 25);
    public static final te x0 = new te(0, 26);
    public static final te y0 = new te(0, 27);
    public static final te z0 = new te(0, 28);
    public static final te A0 = new te(0, 29);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ te(int i, int i2) {
        super(i);
        this.B = i2;
    }

    @Override // defpackage.ki2
    public final Object c() {
        Choreographer choreographer;
        switch (this.B) {
            case 0:
                ue.a("LocalConfiguration");
                throw null;
            case 1:
                ue.a("LocalContext");
                throw null;
            case 2:
                ue.a("LocalImageVectorCache");
                throw null;
            case 3:
                ue.a("LocalResourceIdCache");
                throw null;
            case 4:
                ue.a("LocalView");
                throw null;
            case 5:
                return UUID.randomUUID();
            case ig7.b /* 6 */:
                return Boolean.FALSE;
            case 7:
                return "DEFAULT_TEST_TAG";
            case 8:
                return UUID.randomUUID();
            case 9:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    bb1 bb1Var = tg1.a;
                    choreographer = (Choreographer) tq5.A(bt3.a, new jg(2, 3, null));
                }
                gm gmVar = new gm(choreographer, me2.n(Looper.getMainLooper()));
                return se.O(gmVar, gmVar.g0);
            case 10:
                return null;
            case 11:
                return new vf3(2);
            case mj2.L /* 12 */:
            case 13:
                return null;
            case 14:
                ov0.b("LocalAutofillManager");
                throw null;
            case ig7.e /* 15 */:
                ov0.b("LocalAutofillTree");
                throw null;
            case 16:
                ov0.b("LocalClipboard");
                throw null;
            case 17:
                ov0.b("LocalClipboardManager");
                throw null;
            case 18:
                return Boolean.TRUE;
            case 19:
                ov0.b("LocalDensity");
                throw null;
            case 20:
                ov0.b("LocalFocusManager");
                throw null;
            case 21:
                ov0.b("LocalFontFamilyResolver");
                throw null;
            case 22:
                ov0.b("LocalFontLoader");
                throw null;
            case 23:
                ov0.b("LocalGraphicsContext");
                throw null;
            case 24:
                ov0.b("LocalHapticFeedback");
                throw null;
            case 25:
                ov0.b("LocalInputManager");
                throw null;
            case 26:
                ov0.b("LocalLayoutDirection");
                throw null;
            case 27:
                return null;
            case 28:
                ov0.b("LocalProvidableLocaleList");
                throw null;
            default:
                return Boolean.FALSE;
        }
    }
}
