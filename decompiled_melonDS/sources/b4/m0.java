package b4;

import android.os.Looper;
import android.view.Choreographer;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m0 extends nc.l implements mc.a {
    public static final m0 L = new m0(0, 0);
    public static final m0 R = new m0(0, 1);
    public static final m0 X = new m0(0, 2);
    public static final m0 Y = new m0(0, 3);
    public static final m0 Z = new m0(0, 4);

    /* renamed from: b0  reason: collision with root package name */
    public static final m0 f1879b0 = new m0(0, 5);

    /* renamed from: c0  reason: collision with root package name */
    public static final m0 f1880c0 = new m0(0, 6);

    /* renamed from: d0  reason: collision with root package name */
    public static final m0 f1881d0 = new m0(0, 7);

    /* renamed from: e0  reason: collision with root package name */
    public static final m0 f1882e0 = new m0(0, 8);

    /* renamed from: f0  reason: collision with root package name */
    public static final m0 f1883f0 = new m0(0, 9);

    /* renamed from: g0  reason: collision with root package name */
    public static final m0 f1884g0 = new m0(0, 10);

    /* renamed from: h0  reason: collision with root package name */
    public static final m0 f1885h0 = new m0(0, 11);

    /* renamed from: i0  reason: collision with root package name */
    public static final m0 f1886i0 = new m0(0, 12);

    /* renamed from: j0  reason: collision with root package name */
    public static final m0 f1887j0 = new m0(0, 13);

    /* renamed from: k0  reason: collision with root package name */
    public static final m0 f1888k0 = new m0(0, 14);

    /* renamed from: l0  reason: collision with root package name */
    public static final m0 f1889l0 = new m0(0, 15);

    /* renamed from: m0  reason: collision with root package name */
    public static final m0 f1890m0 = new m0(0, 16);

    /* renamed from: n0  reason: collision with root package name */
    public static final m0 f1891n0 = new m0(0, 17);

    /* renamed from: o0  reason: collision with root package name */
    public static final m0 f1892o0 = new m0(0, 18);
    public static final m0 p0 = new m0(0, 19);

    /* renamed from: q0  reason: collision with root package name */
    public static final m0 f1893q0 = new m0(0, 20);

    /* renamed from: r0  reason: collision with root package name */
    public static final m0 f1894r0 = new m0(0, 21);

    /* renamed from: s0  reason: collision with root package name */
    public static final m0 f1895s0 = new m0(0, 22);

    /* renamed from: t0  reason: collision with root package name */
    public static final m0 f1896t0 = new m0(0, 23);

    /* renamed from: u0  reason: collision with root package name */
    public static final m0 f1897u0 = new m0(0, 24);

    /* renamed from: v0  reason: collision with root package name */
    public static final m0 f1898v0 = new m0(0, 25);

    /* renamed from: w0  reason: collision with root package name */
    public static final m0 f1899w0 = new m0(0, 26);

    /* renamed from: x0  reason: collision with root package name */
    public static final m0 f1900x0 = new m0(0, 27);

    /* renamed from: y0  reason: collision with root package name */
    public static final m0 f1901y0 = new m0(0, 28);
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0(int i2, int i10) {
        super(i2);
        this.B = i10;
    }

    @Override // mc.a
    public final Object b() {
        Choreographer choreographer;
        switch (this.B) {
            case 0:
                r0.b("LocalConfiguration");
                throw null;
            case DSiCameraSource.FrontCamera /* 1 */:
                r0.b("LocalContext");
                throw null;
            case 2:
                r0.b("LocalImageVectorCache");
                throw null;
            case 3:
                r0.b("LocalResourceIdCache");
                throw null;
            case 4:
                r0.b("LocalView");
                throw null;
            case l1.c.f8511g /* 5 */:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    choreographer = Choreographer.getInstance();
                } else {
                    gd.f fVar = zc.g0.f15015a;
                    choreographer = (Choreographer) zc.x.z(ed.n.f4465a, new v0(2, 0, null));
                }
                y0 y0Var = new y0(choreographer, p7.t.f(Looper.getMainLooper()));
                return pc.a.G(y0Var, y0Var.f2013f0);
            case l1.c.f8509e /* 6 */:
            case 7:
                return null;
            case 8:
                q1.b("LocalAutofillManager");
                throw null;
            case l1.c.f8508d /* 9 */:
                q1.b("LocalAutofillTree");
                throw null;
            case l1.c.f8510f /* 10 */:
                q1.b("LocalClipboard");
                throw null;
            case 11:
                q1.b("LocalClipboardManager");
                throw null;
            case 12:
                return Boolean.TRUE;
            case 13:
                q1.b("LocalDensity");
                throw null;
            case 14:
                q1.b("LocalFocusManager");
                throw null;
            case l1.c.f8512h /* 15 */:
                q1.b("LocalFontFamilyResolver");
                throw null;
            case 16:
                q1.b("LocalFontLoader");
                throw null;
            case 17:
                q1.b("LocalGraphicsContext");
                throw null;
            case 18:
                q1.b("LocalHapticFeedback");
                throw null;
            case 19:
                q1.b("LocalInputManager");
                throw null;
            case 20:
                q1.b("LocalLayoutDirection");
                throw null;
            case 21:
                return null;
            case 22:
                return Boolean.FALSE;
            case 23:
            case 24:
                return null;
            case 25:
                q1.b("LocalTextToolbar");
                throw null;
            case 26:
                q1.b("LocalUriHandler");
                throw null;
            case 27:
                q1.b("LocalViewConfiguration");
                throw null;
            default:
                q1.b("LocalWindowInfo");
                throw null;
        }
    }
}
