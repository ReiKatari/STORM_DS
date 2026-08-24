package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bj1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class bj1 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ bj1(sb4 sb4Var, List list, boolean z) {
        this.A = 0;
        this.L = sb4Var;
        this.B = z;
        this.R = list;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        Object obj2 = this.R;
        Object obj3 = this.L;
        final boolean z = this.B;
        switch (i) {
            case 0:
                final sb4 sb4Var = (sb4) obj3;
                final List list = (List) obj2;
                gl1 gl1Var = (gl1) obj;
                fu3 fu3Var = new fu3() { // from class: cj1
                    @Override // defpackage.fu3
                    public final void h(hu3 hu3Var, st3 st3Var) {
                        boolean z2 = z;
                        List list2 = list;
                        sb4 sb4Var2 = sb4Var;
                        if (z2 && !list2.contains(sb4Var2)) {
                            list2.add(sb4Var2);
                        }
                        if (st3Var == st3.ON_START && !list2.contains(sb4Var2)) {
                            list2.add(sb4Var2);
                        }
                        if (st3Var == st3.ON_STOP) {
                            list2.remove(sb4Var2);
                        }
                    }
                };
                ((ku3) sb4Var.d0.k).a(fu3Var);
                return new j00(1, sb4Var, fu3Var);
            case 1:
                final ue1 ue1Var = (ue1) obj3;
                final w61 w61Var = (w61) obj2;
                gb6 gb6Var = (gb6) obj;
                if (z) {
                    on2 on2Var = new on2() { // from class: xq4
                        @Override // defpackage.on2
                        public final Object c() {
                            int i2 = r3;
                            w61 w61Var2 = w61Var;
                            ue1 ue1Var2 = ue1Var;
                            boolean z2 = false;
                            switch (i2) {
                                case 0:
                                    if (ue1Var2.b()) {
                                        hv.L(w61Var2, null, null, new yq4(ue1Var2, null, 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (ue1Var2.c()) {
                                        hv.L(w61Var2, null, null, new yq4(ue1Var2, null, 1), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 2:
                                    if (ue1Var2.b()) {
                                        hv.L(w61Var2, null, null, new yq4(ue1Var2, null, 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                default:
                                    if (ue1Var2.c()) {
                                        hv.L(w61Var2, null, null, new yq4(ue1Var2, null, 1), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                            }
                        }
                    };
                    fg3[] fg3VarArr = eb6.a;
                    gb6Var.a(sa6.y, new y1(null, on2Var));
                    gb6Var.a(sa6.A, new y1(null, new on2() { // from class: xq4
                        @Override // defpackage.on2
                        public final Object c() {
                            int i2 = r3;
                            w61 w61Var2 = w61Var;
                            ue1 ue1Var2 = ue1Var;
                            boolean z2 = false;
                            switch (i2) {
                                case 0:
                                    if (ue1Var2.b()) {
                                        hv.L(w61Var2, null, null, new yq4(ue1Var2, null, 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (ue1Var2.c()) {
                                        hv.L(w61Var2, null, null, new yq4(ue1Var2, null, 1), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 2:
                                    if (ue1Var2.b()) {
                                        hv.L(w61Var2, null, null, new yq4(ue1Var2, null, 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                default:
                                    if (ue1Var2.c()) {
                                        hv.L(w61Var2, null, null, new yq4(ue1Var2, null, 1), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                            }
                        }
                    }));
                } else {
                    on2 on2Var2 = new on2() { // from class: xq4
                        @Override // defpackage.on2
                        public final Object c() {
                            int i2 = r3;
                            w61 w61Var2 = w61Var;
                            ue1 ue1Var2 = ue1Var;
                            boolean z2 = false;
                            switch (i2) {
                                case 0:
                                    if (ue1Var2.b()) {
                                        hv.L(w61Var2, null, null, new yq4(ue1Var2, null, 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (ue1Var2.c()) {
                                        hv.L(w61Var2, null, null, new yq4(ue1Var2, null, 1), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 2:
                                    if (ue1Var2.b()) {
                                        hv.L(w61Var2, null, null, new yq4(ue1Var2, null, 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                default:
                                    if (ue1Var2.c()) {
                                        hv.L(w61Var2, null, null, new yq4(ue1Var2, null, 1), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                            }
                        }
                    };
                    fg3[] fg3VarArr2 = eb6.a;
                    gb6Var.a(sa6.z, new y1(null, on2Var2));
                    gb6Var.a(sa6.B, new y1(null, new on2() { // from class: xq4
                        @Override // defpackage.on2
                        public final Object c() {
                            int i2 = r3;
                            w61 w61Var2 = w61Var;
                            ue1 ue1Var2 = ue1Var;
                            boolean z2 = false;
                            switch (i2) {
                                case 0:
                                    if (ue1Var2.b()) {
                                        hv.L(w61Var2, null, null, new yq4(ue1Var2, null, 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (ue1Var2.c()) {
                                        hv.L(w61Var2, null, null, new yq4(ue1Var2, null, 1), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 2:
                                    if (ue1Var2.b()) {
                                        hv.L(w61Var2, null, null, new yq4(ue1Var2, null, 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                default:
                                    if (ue1Var2.c()) {
                                        hv.L(w61Var2, null, null, new yq4(ue1Var2, null, 1), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                            }
                        }
                    }));
                }
                return jg7Var;
            default:
                String str = (String) obj3;
                el6 el6Var = (el6) obj2;
                gb6 gb6Var2 = (gb6) obj;
                if (z) {
                    fg3[] fg3VarArr3 = eb6.a;
                    fb6 fb6Var = bb6.k;
                    fg3 fg3Var = eb6.a[3];
                    gb6Var2.a(fb6Var, new Object());
                }
                fg3[] fg3VarArr4 = eb6.a;
                fb6 fb6Var2 = bb6.d;
                fg3 fg3Var2 = eb6.a[2];
                gb6Var2.a(fb6Var2, str);
                gb6Var2.a(sa6.v, new y1(null, new cl6(el6Var, 0)));
                return jg7Var;
        }
    }

    public /* synthetic */ bj1(int i, Object obj, Object obj2, boolean z) {
        this.A = i;
        this.B = z;
        this.L = obj;
        this.R = obj2;
    }
}
