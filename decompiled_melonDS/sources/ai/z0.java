package ai;

import android.view.KeyEvent;
import java.util.Iterator;
import java.util.List;
import n2.d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z0 implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ x4.m B;
    public final /* synthetic */ d1 L;
    public final /* synthetic */ Object R;

    public /* synthetic */ z0(Object obj, x4.m mVar, d1 d1Var, int i2) {
        this.A = i2;
        this.R = obj;
        this.B = mVar;
        this.L = d1Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        int i2;
        d1 d1Var;
        int i10;
        d1 d1Var2;
        switch (this.A) {
            case 0:
                KeyEvent keyEvent = ((t3.b) obj).f13107a;
                zh.x xVar = (zh.x) this.R;
                keyEvent.getClass();
                boolean z10 = false;
                if (t3.c.c(keyEvent) == 2) {
                    long a10 = t3.c.a(keyEvent.getKeyCode());
                    int i11 = -1;
                    if (t3.a.a(a10, t3.a.J)) {
                        i2 = -1;
                    } else if (t3.a.a(a10, t3.a.K)) {
                        i2 = 1;
                    } else {
                        i2 = 0;
                    }
                    if (this.B != x4.m.Ltr) {
                        i2 = -i2;
                    }
                    List list = xVar.f15142a;
                    Iterator it = list.iterator();
                    int i12 = 0;
                    while (true) {
                        boolean hasNext = it.hasNext();
                        d1Var = this.L;
                        if (hasNext) {
                            if (((zh.c) it.next()).f15110a == d1Var.g()) {
                                i11 = i12;
                            } else {
                                i12++;
                            }
                        }
                    }
                    if (i2 != 0) {
                        int size = list.size();
                        int i13 = i11 + i2;
                        if (i13 >= 0 && i13 < size) {
                            d1Var.h(((zh.c) list.get(i13)).f15110a);
                            z10 = true;
                        }
                    }
                }
                return Boolean.valueOf(z10);
            default:
                KeyEvent keyEvent2 = ((t3.b) obj).f13107a;
                List list2 = (List) this.R;
                keyEvent2.getClass();
                boolean z11 = false;
                if (t3.c.c(keyEvent2) == 2) {
                    long a11 = t3.c.a(keyEvent2.getKeyCode());
                    int i14 = -1;
                    if (t3.a.a(a11, t3.a.J)) {
                        i10 = -1;
                    } else if (t3.a.a(a11, t3.a.K)) {
                        i10 = 1;
                    } else {
                        i10 = 0;
                    }
                    if (this.B != x4.m.Ltr) {
                        i10 = -i10;
                    }
                    Iterator it2 = list2.iterator();
                    int i15 = 0;
                    while (true) {
                        boolean hasNext2 = it2.hasNext();
                        d1Var2 = this.L;
                        if (hasNext2) {
                            if (((zh.c) it2.next()).f15110a == d1Var2.g()) {
                                i14 = i15;
                            } else {
                                i15++;
                            }
                        }
                    }
                    if (i10 != 0) {
                        int size2 = list2.size();
                        int i16 = i14 + i10;
                        if (i16 >= 0 && i16 < size2) {
                            d1Var2.h(((zh.c) list2.get(i16)).f15110a);
                            z11 = true;
                        }
                    }
                }
                return Boolean.valueOf(z11);
        }
    }
}
