package d6;

import a6.i2;
import a6.p1;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends pd.g {
    public final HashMap L;
    public final /* synthetic */ g R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(g gVar) {
        super(0);
        this.R = gVar;
        this.L = new HashMap();
    }

    @Override // pd.g
    public final void a(p1 p1Var) {
        boolean z10;
        ArrayList arrayList = this.R.f3914b;
        if ((p1Var.f502a.d() & 519) != 0) {
            this.L.remove(p1Var);
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                c cVar = (c) arrayList.get(size);
                int i2 = cVar.f3911e;
                if (i2 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int i10 = i2 - 1;
                cVar.f3911e = i10;
                if (z10 && i10 == 0) {
                    cVar.c();
                }
            }
        }
    }

    @Override // pd.g
    public final void b(p1 p1Var) {
        ArrayList arrayList = this.R.f3914b;
        if ((p1Var.f502a.d() & 519) != 0) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((c) arrayList.get(size)).f3911e++;
            }
        }
    }

    @Override // pd.g
    public final i2 c(i2 i2Var, List list) {
        ArrayList arrayList = this.R.f3914b;
        RectF rectF = new RectF(1.0f, 1.0f, 1.0f, 1.0f);
        int i2 = 0;
        for (int size = list.size() - 1; size >= 0; size--) {
            p1 p1Var = (p1) list.get(size);
            Integer num = (Integer) this.L.get(p1Var);
            if (num != null) {
                int intValue = num.intValue();
                float a10 = p1Var.f502a.a();
                if ((intValue & 1) != 0) {
                    rectF.left = a10;
                }
                if ((intValue & 2) != 0) {
                    rectF.top = a10;
                }
                if ((intValue & 4) != 0) {
                    rectF.right = a10;
                }
                if ((intValue & 8) != 0) {
                    rectF.bottom = a10;
                }
                i2 |= intValue;
            }
        }
        q5.b b10 = q5.b.b(i2Var.f479a.f(519), i2Var.f479a.f(64));
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            c cVar = (c) arrayList.get(size2);
            q5.b bVar = cVar.f3910d;
            ArrayList arrayList2 = cVar.f3907a;
            for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
                a aVar = (a) arrayList2.get(size3);
                int i10 = aVar.f3890a;
                if ((i10 & i2) != 0) {
                    b bVar2 = aVar.f3891b;
                    if (!bVar2.f3901d) {
                        bVar2.f3901d = true;
                        a0.g gVar = bVar2.f3906i;
                        if (gVar != null) {
                            ((View) gVar.L).setVisibility(0);
                        }
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 4) {
                                if (i10 == 8) {
                                    int i11 = bVar.f12286d;
                                    if (i11 > 0) {
                                        aVar.b(b10.f12286d / i11);
                                    }
                                    aVar.a(rectF.bottom);
                                }
                            } else {
                                int i12 = bVar.f12285c;
                                if (i12 > 0) {
                                    aVar.b(b10.f12285c / i12);
                                }
                                aVar.a(rectF.right);
                            }
                        } else {
                            int i13 = bVar.f12284b;
                            if (i13 > 0) {
                                aVar.b(b10.f12284b / i13);
                            }
                            aVar.a(rectF.top);
                        }
                    } else {
                        int i14 = bVar.f12283a;
                        if (i14 > 0) {
                            aVar.b(b10.f12283a / i14);
                        }
                        aVar.a(rectF.left);
                    }
                }
            }
        }
        return i2Var;
    }

    @Override // pd.g
    public final a0.g d(p1 p1Var, a0.g gVar) {
        int i2;
        if ((p1Var.f502a.d() & 519) != 0) {
            q5.b bVar = (q5.b) gVar.L;
            q5.b bVar2 = (q5.b) gVar.B;
            if (bVar.f12283a != bVar2.f12283a) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (bVar.f12284b != bVar2.f12284b) {
                i2 |= 2;
            }
            if (bVar.f12285c != bVar2.f12285c) {
                i2 |= 4;
            }
            if (bVar.f12286d != bVar2.f12286d) {
                i2 |= 8;
            }
            this.L.put(p1Var, Integer.valueOf(i2));
        }
        return gVar;
    }
}
