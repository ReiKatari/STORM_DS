package defpackage;

import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gx6  reason: default package */
/* loaded from: classes.dex */
public final class gx6 extends f55 {
    public final HashMap L;
    public final /* synthetic */ hx6 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gx6(hx6 hx6Var) {
        super(0);
        this.R = hx6Var;
        this.L = new HashMap();
    }

    @Override // defpackage.f55
    public final void i0(au7 au7Var) {
        boolean z;
        ArrayList arrayList = this.R.b;
        if ((au7Var.a.d() & 519) != 0) {
            this.L.remove(au7Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                l45 l45Var = (l45) arrayList.get(size);
                int i = l45Var.e;
                if (i > 0) {
                    z = true;
                } else {
                    z = false;
                }
                int i2 = i - 1;
                l45Var.e = i2;
                if (z && i2 == 0) {
                    l45Var.c();
                }
            }
        }
    }

    @Override // defpackage.f55
    public final void j0(au7 au7Var) {
        ArrayList arrayList = this.R.b;
        if ((au7Var.a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((l45) arrayList.get(size)).e++;
            }
        }
    }

    @Override // defpackage.f55
    public final vu7 k0(vu7 vu7Var, List list) {
        ArrayList arrayList = this.R.b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            au7 au7Var = (au7) list.get(size);
            Integer num = (Integer) this.L.get(au7Var);
            if (num != null) {
                int intValue = num.intValue();
                float a = au7Var.a.a();
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
        e83 b = e83.b(vu7Var.a.h(519), vu7Var.a.h(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            l45 l45Var = (l45) arrayList.get(size2);
            e83 e83Var = l45Var.d;
            ArrayList arrayList2 = l45Var.a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                mt0 mt0Var = (mt0) arrayList2.get(size3);
                int i2 = mt0Var.a;
                if ((i2 & i) != 0) {
                    k45 k45Var = mt0Var.b;
                    if (!k45Var.d) {
                        k45Var.d = true;
                        ap3 ap3Var = k45Var.i;
                        if (ap3Var != null) {
                            ((View) ap3Var.L).setVisibility(0);
                        }
                    }
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 != 4) {
                                if (i2 == 8) {
                                    int i3 = e83Var.d;
                                    if (i3 > 0) {
                                        mt0Var.b(b.d / i3);
                                    }
                                    mt0Var.a(rectF.bottom);
                                }
                            } else {
                                int i4 = e83Var.c;
                                if (i4 > 0) {
                                    mt0Var.b(b.c / i4);
                                }
                                mt0Var.a(rectF.right);
                            }
                        } else {
                            int i5 = e83Var.b;
                            if (i5 > 0) {
                                mt0Var.b(b.b / i5);
                            }
                            mt0Var.a(rectF.top);
                        }
                    } else {
                        int i6 = e83Var.a;
                        if (i6 > 0) {
                            mt0Var.b(b.a / i6);
                        }
                        mt0Var.a(rectF.left);
                    }
                }
            }
        }
        return vu7Var;
    }

    @Override // defpackage.f55
    public final rr6 l0(au7 au7Var, rr6 rr6Var) {
        int i;
        if ((au7Var.a.d() & 519) != 0) {
            e83 e83Var = (e83) rr6Var.L;
            e83 e83Var2 = (e83) rr6Var.B;
            if (e83Var.a != e83Var2.a) {
                i = 1;
            } else {
                i = 0;
            }
            if (e83Var.b != e83Var2.b) {
                i |= 2;
            }
            if (e83Var.c != e83Var2.c) {
                i |= 4;
            }
            if (e83Var.d != e83Var2.d) {
                i |= 8;
            }
            this.L.put(au7Var, Integer.valueOf(i));
        }
        return rr6Var;
    }
}
