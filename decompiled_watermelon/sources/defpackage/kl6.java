package defpackage;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kl6  reason: default package */
/* loaded from: classes.dex */
public final class kl6 extends yv4 {
    public final HashMap L;
    public final /* synthetic */ ll6 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kl6(ll6 ll6Var) {
        super(0);
        this.R = ll6Var;
        this.L = new HashMap();
    }

    @Override // defpackage.yv4
    public final void i0(ze7 ze7Var) {
        boolean z;
        ArrayList arrayList = this.R.b;
        if ((ze7Var.a.d() & 519) != 0) {
            this.L.remove(ze7Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ev4 ev4Var = (ev4) arrayList.get(size);
                int i = ev4Var.e;
                if (i > 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = i - 1;
                ev4Var.e = i2;
                if (z && i2 == 0) {
                    ev4Var.c();
                }
            }
        }
    }

    @Override // defpackage.yv4
    public final void j0(ze7 ze7Var) {
        ArrayList arrayList = this.R.b;
        if ((ze7Var.a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ev4) arrayList.get(size)).e++;
            }
        }
    }

    @Override // defpackage.yv4
    public final vf7 k0(vf7 vf7Var, List list) {
        ArrayList arrayList = this.R.b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            ze7 ze7Var = (ze7) list.get(size);
            Integer num = (Integer) this.L.get(ze7Var);
            if (num != null) {
                int intValue = num.intValue();
                float a = ze7Var.a.a();
                if ((intValue & 1) != 0) {
                    rectF.left = a;
                }
                if ((intValue & 2) != 0) {
                    rectF.top = a;
                }
                if ((intValue & 4) != 0) {
                    rectF.right = a;
                }
                if ((intValue & 8) != 0) {
                    rectF.bottom = a;
                }
                i |= intValue;
            }
        }
        x13 b = x13.b(vf7Var.a.h(519), vf7Var.a.h(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ev4 ev4Var = (ev4) arrayList.get(size2);
            x13 x13Var = ev4Var.d;
            ArrayList arrayList2 = ev4Var.a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                zq0 zq0Var = (zq0) arrayList2.get(size3);
                int i2 = zq0Var.a;
                if ((i2 & i) != 0) {
                    dv4 dv4Var = zq0Var.b;
                    if (!dv4Var.d) {
                        dv4Var.d = true;
                        ci3 ci3Var = dv4Var.i;
                        if (ci3Var != null) {
                            ((View) ci3Var.L).setVisibility(0);
                        }
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 4) {
                                if (i2 == 8) {
                                    int i3 = x13Var.d;
                                    if (i3 > 0) {
                                        zq0Var.b(b.d / i3);
                                    }
                                    zq0Var.a(rectF.bottom);
                                }
                            } else {
                                int i4 = x13Var.c;
                                if (i4 > 0) {
                                    zq0Var.b(b.c / i4);
                                }
                                zq0Var.a(rectF.right);
                            }
                        } else {
                            int i5 = x13Var.b;
                            if (i5 > 0) {
                                zq0Var.b(b.b / i5);
                            }
                            zq0Var.a(rectF.top);
                        }
                    } else {
                        int i6 = x13Var.a;
                        if (i6 > 0) {
                            zq0Var.b(b.a / i6);
                        }
                        zq0Var.a(rectF.left);
                    }
                }
            }
        }
        return vf7Var;
    }

    @Override // defpackage.yv4
    public final wv6 l0(ze7 ze7Var, wv6 wv6Var) {
        int i;
        if ((ze7Var.a.d() & 519) != 0) {
            x13 x13Var = (x13) wv6Var.L;
            x13 x13Var2 = (x13) wv6Var.B;
            if (x13Var.a != x13Var2.a) {
                i = 1;
            } else {
                i = 0;
            }
            if (x13Var.b != x13Var2.b) {
                i |= 2;
            }
            if (x13Var.c != x13Var2.c) {
                i |= 4;
            }
            if (x13Var.d != x13Var2.d) {
                i |= 8;
            }
            this.L.put(ze7Var, Integer.valueOf(i));
        }
        return wv6Var;
    }
}
