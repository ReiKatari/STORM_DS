package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u10  reason: default package */
/* loaded from: classes.dex */
public final class u10 extends hw6 implements eo2 {
    public final /* synthetic */ int X;
    public int Y;
    public final /* synthetic */ v10 Z;
    public final /* synthetic */ n00 d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u10(v10 v10Var, n00 n00Var, r41 r41Var, int i) {
        super(2, r41Var);
        this.X = i;
        this.Z = v10Var;
        this.d0 = n00Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        int i = this.X;
        jg7 jg7Var = jg7.a;
        w61 w61Var = (w61) obj;
        r41 r41Var = (r41) obj2;
        switch (i) {
            case 0:
                return ((u10) q(r41Var, w61Var)).s(jg7Var);
            default:
                return ((u10) q(r41Var, w61Var)).s(jg7Var);
        }
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        int i = this.X;
        n00 n00Var = this.d0;
        v10 v10Var = this.Z;
        switch (i) {
            case 0:
                return new u10(v10Var, n00Var, r41Var, 0);
            default:
                return new u10(v10Var, n00Var, r41Var, 1);
        }
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        Object value;
        ArrayList m1;
        Object value2;
        ArrayList m12;
        int i = this.X;
        Object obj2 = jg7.a;
        v10 v10Var = this.Z;
        n00 n00Var = this.d0;
        switch (i) {
            case 0:
                Object obj3 = x61.COROUTINE_SUSPENDED;
                int i2 = this.Y;
                if (i2 != 0) {
                    if (i2 == 1) {
                        oi2.Y(obj);
                        return obj2;
                    }
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                oi2.Y(obj);
                ha3 ha3Var = v10Var.b;
                this.Y = 1;
                tp6 tp6Var = ha3Var.f;
                if (n00Var.a == null) {
                    UUID randomUUID = UUID.randomUUID();
                    String str = n00Var.b;
                    Uri uri = n00Var.c;
                    str.getClass();
                    uri.getClass();
                    n00 n00Var2 = new n00(randomUUID, str, uri);
                    do {
                        value2 = tp6Var.getValue();
                        m12 = gt0.m1((List) value2);
                        m12.add(new fh1(false, n00Var2));
                    } while (!tp6Var.j(value2, m12));
                } else {
                    Iterator it = ((List) tp6Var.getValue()).iterator();
                    int i3 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            if (!nb3.k(((n00) ((fh1) it.next()).a).a, n00Var.a)) {
                                i3++;
                            }
                        } else {
                            i3 = -1;
                        }
                    }
                    do {
                        value = tp6Var.getValue();
                        List list = (List) value;
                        if (i3 >= 0) {
                            m1 = gt0.m1(list);
                            m1.set(i3, new fh1(false, n00Var));
                        } else {
                            m1 = gt0.m1(list);
                            m1.add(new fh1(false, n00Var));
                        }
                    } while (!tp6Var.j(value, m1));
                }
                xe1 xe1Var = xk1.a;
                Object d0 = hv.d0(de1.L, new y3(ha3Var, (r41) null, 11), this);
                Object obj4 = x61.COROUTINE_SUSPENDED;
                Object obj5 = d0;
                if (d0 != obj4) {
                    obj5 = obj2;
                }
                if (obj5 != obj4) {
                    obj5 = obj2;
                }
                if (obj5 == obj3) {
                    return obj3;
                }
                return obj2;
            default:
                tp6 tp6Var2 = v10Var.f;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                int i4 = this.Y;
                if (i4 != 0) {
                    if (i4 == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    ha3 ha3Var2 = v10Var.b;
                    this.Y = 1;
                    if (ha3Var2.a(n00Var, this) == x61Var) {
                        return x61Var;
                    }
                }
                if (nb3.k(n00Var.a, tp6Var2.getValue())) {
                    tp6Var2.l(null);
                    return obj2;
                }
                return obj2;
        }
    }
}
