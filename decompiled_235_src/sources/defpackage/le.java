package defpackage;

import android.view.KeyEvent;
import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: le  reason: default package */
/* loaded from: classes.dex */
public final class le extends aj3 implements on2 {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ le(int i, Object obj, Object obj2) {
        super(0);
        this.B = i;
        this.L = obj;
        this.R = obj2;
    }

    @Override // defpackage.on2
    public final Object c() {
        boolean dispatchKeyEvent;
        float f;
        float f2;
        xa6 xa6Var;
        sm3 sm3Var;
        of5 of5Var;
        yo7 defaultViewModelProviderFactory;
        int i = this.B;
        boolean z = false;
        mw2 mw2Var = null;
        jg7 jg7Var = jg7.a;
        Object obj = this.R;
        Object obj2 = this.L;
        switch (i) {
            case 0:
                dispatchKeyEvent = super/*android.view.ViewGroup*/.dispatchKeyEvent((KeyEvent) obj);
                return Boolean.valueOf(dispatchKeyEvent);
            case 1:
                ze zeVar = (ze) obj;
                o76 o76Var = (o76) obj2;
                e76 e76Var = o76Var.X;
                e76 e76Var2 = o76Var.Y;
                Float f3 = o76Var.L;
                Float f4 = o76Var.R;
                if (e76Var != null && f3 != null) {
                    f = ((Number) e76Var.a.c()).floatValue() - f3.floatValue();
                } else {
                    f = 0.0f;
                }
                if (e76Var2 != null && f4 != null) {
                    f2 = ((Number) e76Var2.a.c()).floatValue() - f4.floatValue();
                } else {
                    f2 = 0.0f;
                }
                if (f != RecyclerView.B1 || f2 != RecyclerView.B1) {
                    int A = zeVar.A(o76Var.A);
                    za6 za6Var = (za6) zeVar.s().b(zeVar.g0);
                    if (za6Var != null) {
                        try {
                            v2 v2Var = zeVar.i0;
                            if (v2Var != null) {
                                v2Var.a.setBoundsInScreen(zeVar.k(za6Var));
                            }
                        } catch (IllegalStateException unused) {
                        }
                    }
                    za6 za6Var2 = (za6) zeVar.s().b(zeVar.h0);
                    if (za6Var2 != null) {
                        try {
                            v2 v2Var2 = zeVar.j0;
                            if (v2Var2 != null) {
                                v2Var2.a.setBoundsInScreen(zeVar.k(za6Var2));
                            }
                        } catch (IllegalStateException unused2) {
                        }
                    }
                    zeVar.R.invalidate();
                    za6 za6Var3 = (za6) zeVar.s().b(A);
                    if (za6Var3 != null && (xa6Var = za6Var3.a) != null && (sm3Var = xa6Var.c) != null) {
                        if (e76Var != null) {
                            zeVar.l0.i(A, e76Var);
                        }
                        if (e76Var2 != null) {
                            zeVar.m0.i(A, e76Var2);
                        }
                        zeVar.w(sm3Var);
                    }
                }
                if (e76Var != null) {
                    o76Var.L = (Float) e76Var.a.c();
                }
                if (e76Var2 != null) {
                    o76Var.R = (Float) e76Var2.a.c();
                }
                return jg7Var;
            case 2:
                on2 on2Var = (on2) obj2;
                if (on2Var != null && (of5Var = (of5) on2Var.c()) != null) {
                    return of5Var;
                }
                eg4 eg4Var = (eg4) obj;
                if (!eg4Var.Y0().j0) {
                    eg4Var = null;
                }
                if (eg4Var == null) {
                    return null;
                }
                return kj2.b(0L, qo2.S(eg4Var.L));
            case 3:
                ((na0) obj2).m0.g((oa0) obj);
                return jg7Var;
            case 4:
                bp7 bp7Var = (bp7) ((go3) obj).getValue();
                if (bp7Var instanceof mw2) {
                    mw2Var = (mw2) bp7Var;
                }
                if (mw2Var == null || (defaultViewModelProviderFactory = mw2Var.getDefaultViewModelProviderFactory()) == null) {
                    return ((uo0) obj2).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory;
            case 5:
                ((dh5) obj2).A = ((vh2) obj).T0();
                return jg7Var;
            case 6:
                ((wx2) obj2).d((z64) obj);
                return jg7Var;
            case 7:
                if0 if0Var = ((sm3) obj2).B0;
                dh5 dh5Var = (dh5) obj;
                if ((((z64) if0Var.g).R & 8) != 0) {
                    for (z64 z64Var = (vy6) if0Var.f; z64Var != null; z64Var = z64Var.X) {
                        if ((z64Var.L & 8) != 0) {
                            z64 z64Var2 = z64Var;
                            ua4 ua4Var = null;
                            while (z64Var2 != null) {
                                if (z64Var2 instanceof va6) {
                                    va6 va6Var = (va6) z64Var2;
                                    if (va6Var.J()) {
                                        ta6 ta6Var = new ta6();
                                        dh5Var.A = ta6Var;
                                        ta6Var.R = true;
                                    }
                                    if (va6Var.C0()) {
                                        ((ta6) dh5Var.A).L = true;
                                    }
                                    va6Var.A0((gb6) dh5Var.A);
                                } else if ((z64Var2.L & 8) != 0 && (z64Var2 instanceof zg1)) {
                                    int i2 = 0;
                                    for (z64 z64Var3 = ((zg1) z64Var2).l0; z64Var3 != null; z64Var3 = z64Var3.Y) {
                                        if ((z64Var3.L & 8) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                z64Var2 = z64Var3;
                                            } else {
                                                if (ua4Var == null) {
                                                    ua4Var = new ua4(new z64[16]);
                                                }
                                                if (z64Var2 != null) {
                                                    ua4Var.b(z64Var2);
                                                    z64Var2 = null;
                                                }
                                                ua4Var.b(z64Var3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                z64Var2 = nc1.A(ua4Var);
                            }
                        }
                    }
                }
                return jg7Var;
            case 8:
                op5 op5Var = eg4.K0;
                ((qn2) obj2).g(op5Var);
                eg4 eg4Var2 = (eg4) obj;
                boolean k = nb3.k(eg4Var2.B0, op5Var.i0);
                boolean z2 = eg4Var2.C0;
                boolean z3 = op5Var.j0;
                if (z2 != z3) {
                    z = true;
                }
                if (!k || z) {
                    eg4Var2.B0 = op5Var.i0;
                    eg4Var2.C0 = z3;
                    if (eg4Var2.D0 && (z || (z3 && !k))) {
                        eg4Var2.k0.F();
                    }
                }
                eg4Var2.D0 = true;
                op5Var.p0 = op5Var.i0.a(op5Var.k0, op5Var.m0, op5Var.l0);
                return jg7Var;
            case 9:
                ((p0) obj2).removeOnAttachStateChangeListener((wh6) obj);
                return jg7Var;
            default:
                ((ut3) obj2).c((wb4) obj);
                return jg7Var;
        }
    }
}
