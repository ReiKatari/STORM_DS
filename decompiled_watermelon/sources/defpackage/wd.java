package defpackage;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wd  reason: default package */
/* loaded from: classes.dex */
public final class wd extends ic3 implements ki2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd(int i, Object obj, Object obj2) {
        super(0);
        this.B = i;
        this.L = obj;
        this.R = obj2;
    }

    @Override // defpackage.ki2
    public final Object c() {
        boolean dispatchKeyEvent;
        float f;
        float f2;
        iz5 iz5Var;
        vf3 vf3Var;
        y55 y55Var;
        xa7 defaultViewModelProviderFactory;
        int i = this.B;
        boolean z = false;
        lq2 lq2Var = null;
        o27 o27Var = o27.a;
        Object obj = this.R;
        Object obj2 = this.L;
        switch (i) {
            case 0:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj);
                return Boolean.valueOf(dispatchKeyEvent);
            case 1:
                ke keVar = (ke) obj;
                cw5 cw5Var = (cw5) obj2;
                rv5 rv5Var = cw5Var.X;
                rv5 rv5Var2 = cw5Var.Y;
                Float f3 = cw5Var.L;
                Float f4 = cw5Var.R;
                if (rv5Var != null && f3 != null) {
                    f = ((Number) rv5Var.a.c()).floatValue() - f3.floatValue();
                } else {
                    f = 0.0f;
                }
                if (rv5Var2 != null && f4 != null) {
                    f2 = ((Number) rv5Var2.a.c()).floatValue() - f4.floatValue();
                } else {
                    f2 = 0.0f;
                }
                if (f != RecyclerView.A1 || f2 != RecyclerView.A1) {
                    int A = keVar.A(cw5Var.A);
                    kz5 kz5Var = (kz5) keVar.s().b(keVar.f0);
                    if (kz5Var != null) {
                        try {
                            t2 t2Var = keVar.h0;
                            if (t2Var != null) {
                                t2Var.a.setBoundsInScreen(keVar.k(kz5Var));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    kz5 kz5Var2 = (kz5) keVar.s().b(keVar.g0);
                    if (kz5Var2 != null) {
                        try {
                            t2 t2Var2 = keVar.i0;
                            if (t2Var2 != null) {
                                t2Var2.a.setBoundsInScreen(keVar.k(kz5Var2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    keVar.R.invalidate();
                    kz5 kz5Var3 = (kz5) keVar.s().b(A);
                    if (kz5Var3 != null && (iz5Var = kz5Var3.a) != null && (vf3Var = iz5Var.c) != null) {
                        if (rv5Var != null) {
                            keVar.k0.i(A, rv5Var);
                        }
                        if (rv5Var2 != null) {
                            keVar.l0.i(A, rv5Var2);
                        }
                        keVar.w(vf3Var);
                    }
                }
                if (rv5Var != null) {
                    cw5Var.L = (Float) rv5Var.a.c();
                }
                if (rv5Var2 != null) {
                    cw5Var.R = (Float) rv5Var2.a.c();
                }
                return o27Var;
            case 2:
                ki2 ki2Var = (ki2) obj2;
                if (ki2Var != null && (y55Var = (y55) ki2Var.c()) != null) {
                    return y55Var;
                }
                m74 m74Var = (m74) obj;
                if (!m74Var.Y0().i0) {
                    m74Var = null;
                }
                if (m74Var == null) {
                    return null;
                }
                return yf2.b(0L, hk2.U(m74Var.L));
            case 3:
                ((f80) obj2).l0.n((g80) obj);
                return o27Var;
            case 4:
                ab7 ab7Var = (ab7) ((gh3) obj).getValue();
                if (ab7Var instanceof lq2) {
                    lq2Var = (lq2) ab7Var;
                }
                if (lq2Var == null || (defaultViewModelProviderFactory = lq2Var.getDefaultViewModelProviderFactory()) == null) {
                    return ((lm0) obj2).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory;
            case 5:
                ((n75) obj2).A = ((ed2) obj).T0();
                return o27Var;
            case ig7.b /* 6 */:
                ((vr2) obj2).d((yy3) obj);
                return o27Var;
            case 7:
                zc0 zc0Var = ((vf3) obj2).A0;
                n75 n75Var = (n75) obj;
                if ((((yy3) zc0Var.g).R & 8) != 0) {
                    for (yy3 yy3Var = (lm6) zc0Var.f; yy3Var != null; yy3Var = yy3Var.X) {
                        if ((yy3Var.L & 8) != 0) {
                            yy3 yy3Var2 = yy3Var;
                            o24 o24Var = null;
                            while (yy3Var2 != null) {
                                if (yy3Var2 instanceof gz5) {
                                    gz5 gz5Var = (gz5) yy3Var2;
                                    if (gz5Var.r0()) {
                                        ez5 ez5Var = new ez5();
                                        n75Var.A = ez5Var;
                                        ez5Var.R = true;
                                    }
                                    if (gz5Var.t0()) {
                                        ((ez5) n75Var.A).L = true;
                                    }
                                    gz5Var.p0((rz5) n75Var.A);
                                } else if ((yy3Var2.L & 8) != 0 && (yy3Var2 instanceof xc1)) {
                                    int i2 = 0;
                                    for (yy3 yy3Var3 = ((xc1) yy3Var2).k0; yy3Var3 != null; yy3Var3 = yy3Var3.Y) {
                                        if ((yy3Var3.L & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                yy3Var2 = yy3Var3;
                                            } else {
                                                if (o24Var == null) {
                                                    o24Var = new o24(new yy3[16]);
                                                }
                                                if (yy3Var2 != null) {
                                                    o24Var.b(yy3Var2);
                                                    yy3Var2 = null;
                                                }
                                                o24Var.b(yy3Var3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                yy3Var2 = l.p(o24Var);
                            }
                        }
                    }
                }
                return o27Var;
            case 8:
                rf5 rf5Var = m74.J0;
                ((mi2) obj2).n(rf5Var);
                m74 m74Var2 = (m74) obj;
                boolean x = b53.x(m74Var2.A0, rf5Var.g0);
                boolean z2 = m74Var2.B0;
                boolean z3 = rf5Var.h0;
                if (z2 != z3) {
                    z = true;
                }
                if (!x || z) {
                    m74Var2.A0 = rf5Var.g0;
                    m74Var2.B0 = z3;
                    if (m74Var2.C0 && (z || (z3 && !x))) {
                        m74Var2.j0.F();
                    }
                }
                m74Var2.C0 = true;
                rf5Var.n0 = rf5Var.g0.a(rf5Var.i0, rf5Var.k0, rf5Var.j0);
                return o27Var;
            case 9:
                ((o0) obj2).removeOnAttachStateChangeListener((i66) obj);
                return o27Var;
            default:
                ((rm3) obj2).c((p34) obj);
                return o27Var;
        }
    }
}
