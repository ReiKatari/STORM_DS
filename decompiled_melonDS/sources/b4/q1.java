package b4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class q1 {

    /* renamed from: a  reason: collision with root package name */
    public static final n2.t2 f1912a = new n2.n1(m0.f1880c0);

    /* renamed from: b  reason: collision with root package name */
    public static final n2.t2 f1913b = new n2.n1(m0.f1881d0);

    /* renamed from: c  reason: collision with root package name */
    public static final n2.t2 f1914c = new n2.n1(m0.f1883f0);

    /* renamed from: d  reason: collision with root package name */
    public static final n2.t2 f1915d = new n2.n1(m0.f1882e0);

    /* renamed from: e  reason: collision with root package name */
    public static final n2.t2 f1916e = new n2.n1(m0.f1885h0);

    /* renamed from: f  reason: collision with root package name */
    public static final n2.t2 f1917f = new n2.n1(m0.f1884g0);

    /* renamed from: g  reason: collision with root package name */
    public static final n2.t2 f1918g = new n2.n1(m0.f1891n0);

    /* renamed from: h  reason: collision with root package name */
    public static final n2.t2 f1919h = new n2.n1(m0.f1887j0);

    /* renamed from: i  reason: collision with root package name */
    public static final n2.t2 f1920i = new n2.n1(m0.f1888k0);

    /* renamed from: j  reason: collision with root package name */
    public static final n2.t2 f1921j = new n2.n1(m0.f1890m0);

    /* renamed from: k  reason: collision with root package name */
    public static final n2.t2 f1922k = new n2.n1(m0.f1889l0);

    /* renamed from: l  reason: collision with root package name */
    public static final n2.t2 f1923l = new n2.n1(m0.f1892o0);
    public static final n2.t2 m = new n2.n1(m0.p0);

    /* renamed from: n  reason: collision with root package name */
    public static final n2.t2 f1924n = new n2.n1(m0.f1893q0);

    /* renamed from: o  reason: collision with root package name */
    public static final n2.t2 f1925o = new n2.n1(m0.f1897u0);

    /* renamed from: p  reason: collision with root package name */
    public static final n2.t2 f1926p = new n2.n1(m0.f1896t0);

    /* renamed from: q  reason: collision with root package name */
    public static final n2.t2 f1927q = new n2.n1(m0.f1898v0);

    /* renamed from: r  reason: collision with root package name */
    public static final n2.t2 f1928r = new n2.n1(m0.f1899w0);

    /* renamed from: s  reason: collision with root package name */
    public static final n2.t2 f1929s = new n2.n1(m0.f1900x0);

    /* renamed from: t  reason: collision with root package name */
    public static final n2.t2 f1930t = new n2.n1(m0.f1901y0);

    /* renamed from: u  reason: collision with root package name */
    public static final n2.t2 f1931u = new n2.n1(m0.f1894r0);

    /* renamed from: v  reason: collision with root package name */
    public static final n2.b0 f1932v = new n2.b0(m0.f1895s0);

    /* renamed from: w  reason: collision with root package name */
    public static final n2.t2 f1933w = new n2.n1(m0.f1886i0);

    public static final void a(a4.c2 c2Var, b1 b1Var, mc.p pVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        boolean z10;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1925803616);
        if (rVar.f(c2Var)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i10 | i2;
        if (rVar.f(b1Var)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i14 = i13 | i11;
        if (rVar.h(pVar)) {
            i12 = 256;
        } else {
            i12 = 128;
        }
        int i15 = i14 | i12;
        if ((i15 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i15 & 1, z10)) {
            x xVar = (x) c2Var;
            n2.o1 a10 = f1912a.a(xVar.getAccessibilityManager());
            n2.o1 a11 = f1913b.a(xVar.getAutofill());
            n2.o1 a12 = f1915d.a(xVar.getAutofillManager());
            n2.o1 a13 = f1914c.a(xVar.getAutofillTree());
            n2.o1 a14 = f1916e.a(xVar.m9getClipboardManager());
            n2.o1 a15 = f1917f.a(xVar.m8getClipboard());
            n2.o1 a16 = f1919h.a(xVar.getDensity());
            n2.o1 a17 = f1920i.a(xVar.getFocusOwner());
            n2.o1 a18 = f1921j.a(xVar.getFontLoader());
            a18.f9967d = false;
            n2.o1 a19 = f1922k.a(xVar.getFontFamilyResolver());
            a19.f9967d = false;
            n2.s.b(new n2.o1[]{a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, f1923l.a(xVar.getHapticFeedBack()), m.a(xVar.getInputModeManager()), f1924n.a(xVar.getLayoutDirection()), f1925o.a(xVar.getTextInputService()), f1926p.a(xVar.getSoftwareKeyboardController()), f1927q.a(xVar.getTextToolbar()), f1928r.a(b1Var), f1929s.a(xVar.getViewConfiguration()), f1930t.a(xVar.getWindowInfo()), f1931u.a(xVar.getPointerIconService()), f1918g.a(xVar.getGraphicsContext()), w2.b.f14113a.a(xVar.getRetainedValuesStore())}, pVar, rVar, ((i15 >> 3) & 112) | 8);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new n0(c2Var, b1Var, pVar, i2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
