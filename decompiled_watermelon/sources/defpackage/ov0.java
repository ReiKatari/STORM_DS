package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ov0  reason: default package */
/* loaded from: classes.dex */
public abstract class ov0 {
    public static final ye6 a = new ew4(te.j0);
    public static final ye6 b = new ew4(te.k0);
    public static final ye6 c = new ew4(te.m0);
    public static final ye6 d = new ew4(te.l0);
    public static final ye6 e = new ew4(te.o0);
    public static final ye6 f = new ew4(te.n0);
    public static final ye6 g = new ew4(te.u0);
    public static final ye6 h = new ew4(te.q0);
    public static final ye6 i = new ew4(te.r0);
    public static final ye6 j = new ew4(te.t0);
    public static final ye6 k = new ew4(te.s0);
    public static final ye6 l = new ew4(te.v0);
    public static final ye6 m = new ew4(te.w0);
    public static final ye6 n = new ew4(te.x0);
    public static final ye6 o = new ew4(te.z0);
    public static final ye6 p;
    public static final ye6 q;
    public static final ye6 r;
    public static final ye6 s;
    public static final ye6 t;
    public static final ye6 u;
    public static final ye6 v;
    public static final tv0 w;
    public static final ye6 x;

    /* JADX WARN: Type inference failed for: r1v0, types: [ew4, ye6] */
    /* JADX WARN: Type inference failed for: r1v1, types: [ew4, ye6] */
    /* JADX WARN: Type inference failed for: r1v10, types: [ew4, ye6] */
    /* JADX WARN: Type inference failed for: r1v11, types: [ew4, ye6] */
    /* JADX WARN: Type inference failed for: r1v12, types: [ew4, ye6] */
    /* JADX WARN: Type inference failed for: r1v13, types: [ew4, ye6] */
    /* JADX WARN: Type inference failed for: r1v14, types: [ew4, ye6] */
    /* JADX WARN: Type inference failed for: r1v16, types: [ew4, ye6] */
    /* JADX WARN: Type inference failed for: r1v17, types: [ew4, ye6] */
    /* JADX WARN: Type inference failed for: r1v18, types: [ew4, ye6] */
    /* JADX WARN: Type inference failed for: r1v19, types: [ew4, ye6] */
    /* JADX WARN: Type inference failed for: r1v2, types: [ew4, ye6] */
    /* JADX WARN: Type inference failed for: r1v20, types: [ew4, ye6] */
    /* JADX WARN: Type inference failed for: r1v21, types: [ew4, ye6] */
    /* JADX WARN: Type inference failed for: r1v22, types: [ew4, ye6] */
    /* JADX WARN: Type inference failed for: r1v24, types: [ew4, ye6] */
    /* JADX WARN: Type inference failed for: r1v3, types: [ew4, ye6] */
    /* JADX WARN: Type inference failed for: r1v4, types: [ew4, ye6] */
    /* JADX WARN: Type inference failed for: r1v5, types: [ew4, ye6] */
    /* JADX WARN: Type inference failed for: r1v6, types: [ew4, ye6] */
    /* JADX WARN: Type inference failed for: r1v7, types: [ew4, ye6] */
    /* JADX WARN: Type inference failed for: r1v8, types: [ew4, ye6] */
    /* JADX WARN: Type inference failed for: r1v9, types: [ew4, ye6] */
    static {
        yf2.I(new d5(19));
        p = new ew4(mv0.R);
        q = new ew4(mv0.L);
        r = new ew4(mv0.X);
        s = new ew4(mv0.Y);
        t = new ew4(mv0.Z);
        u = new ew4(mv0.c0);
        v = new ew4(te.y0);
        w = new tv0(te.A0);
        x = new ew4(te.p0);
    }

    public static final void a(wg4 wg4Var, jm jmVar, aj2 aj2Var, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(1925803616);
        if (sk2Var.f(wg4Var)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (sk2Var.f(jmVar)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (sk2Var.h(aj2Var)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i8 & 1, z)) {
            ee eeVar = (ee) wg4Var;
            dq a2 = a.a(eeVar.getAccessibilityManager());
            dq a3 = b.a(eeVar.getAutofill());
            dq a4 = d.a(eeVar.getAutofillManager());
            dq a5 = c.a(eeVar.getAutofillTree());
            dq a6 = e.a(eeVar.getClipboardManager());
            dq a7 = f.a(eeVar.getClipboard());
            dq a8 = h.a(eeVar.getDensity());
            dq a9 = i.a(eeVar.getFocusOwner());
            dq a10 = j.a(eeVar.getFontLoader());
            a10.e = false;
            dq a11 = k.a(eeVar.getFontFamilyResolver());
            a11.e = false;
            dk7.b(new dq[]{a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, l.a(eeVar.getHapticFeedBack()), m.a(eeVar.getInputModeManager()), n.a(eeVar.getLayoutDirection()), p.a(eeVar.getTextInputService()), q.a(eeVar.getSoftwareKeyboardController()), r.a(eeVar.getTextToolbar()), s.a(jmVar), t.a(eeVar.getViewConfiguration()), u.a(eeVar.getWindowInfo()), v.a(eeVar.getPointerIconService()), g.a(eeVar.getGraphicsContext()), br3.a.a(eeVar.getRetainedValuesStore()), o.a(eeVar.getLocaleList())}, aj2Var, sk2Var, ((i8 >> 3) & 112) | 8);
        } else {
            sk2Var.R();
        }
        m55 r2 = sk2Var.r();
        if (r2 != null) {
            r2.d = new nv0(wg4Var, jmVar, aj2Var, i2);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
