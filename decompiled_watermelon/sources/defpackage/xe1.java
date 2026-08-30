package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xe1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class xe1 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ boolean B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;

    public /* synthetic */ xe1(l34 l34Var, List list, boolean z) {
        this.A = 0;
        this.L = l34Var;
        this.B = z;
        this.R = list;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        o27 o27Var = o27.a;
        Object obj2 = this.R;
        Object obj3 = this.L;
        final boolean z = this.B;
        switch (i) {
            case 0:
                final l34 l34Var = (l34) obj3;
                final List list = (List) obj2;
                ch1 ch1Var = (ch1) obj;
                dn3 dn3Var = new dn3() { // from class: ye1
                    @Override // defpackage.dn3
                    public final void d(fn3 fn3Var, pm3 pm3Var) {
                        boolean z2 = z;
                        List list2 = list;
                        l34 l34Var2 = l34Var;
                        if (z2 && !list2.contains(l34Var2)) {
                            list2.add(l34Var2);
                        }
                        if (pm3Var == pm3.ON_START && !list2.contains(l34Var2)) {
                            list2.add(l34Var2);
                        }
                        if (pm3Var == pm3.ON_STOP) {
                            list2.remove(l34Var2);
                        }
                    }
                };
                ((in3) l34Var.c0.k).a(dn3Var);
                return new sy(1, l34Var, dn3Var);
            case 1:
                final ya1 ya1Var = (ya1) obj3;
                final o31 o31Var = (o31) obj2;
                rz5 rz5Var = (rz5) obj;
                if (z) {
                    ki2 ki2Var = new ki2() { // from class: uh4
                        @Override // defpackage.ki2
                        public final Object c() {
                            int i2 = r3;
                            o31 o31Var2 = o31Var;
                            ya1 ya1Var2 = ya1Var;
                            boolean z2 = false;
                            switch (i2) {
                                case 0:
                                    if (ya1Var2.a()) {
                                        tq5.w(o31Var2, null, null, new vh4(ya1Var2, null, 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (ya1Var2.c()) {
                                        tq5.w(o31Var2, null, null, new vh4(ya1Var2, null, 1), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 2:
                                    if (ya1Var2.a()) {
                                        tq5.w(o31Var2, null, null, new vh4(ya1Var2, null, 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                default:
                                    if (ya1Var2.c()) {
                                        tq5.w(o31Var2, null, null, new vh4(ya1Var2, null, 1), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                            }
                        }
                    };
                    l93[] l93VarArr = pz5.a;
                    rz5Var.b(dz5.y, new w1(null, ki2Var));
                    rz5Var.b(dz5.A, new w1(null, new ki2() { // from class: uh4
                        @Override // defpackage.ki2
                        public final Object c() {
                            int i2 = r3;
                            o31 o31Var2 = o31Var;
                            ya1 ya1Var2 = ya1Var;
                            boolean z2 = false;
                            switch (i2) {
                                case 0:
                                    if (ya1Var2.a()) {
                                        tq5.w(o31Var2, null, null, new vh4(ya1Var2, null, 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (ya1Var2.c()) {
                                        tq5.w(o31Var2, null, null, new vh4(ya1Var2, null, 1), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 2:
                                    if (ya1Var2.a()) {
                                        tq5.w(o31Var2, null, null, new vh4(ya1Var2, null, 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                default:
                                    if (ya1Var2.c()) {
                                        tq5.w(o31Var2, null, null, new vh4(ya1Var2, null, 1), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                            }
                        }
                    }));
                } else {
                    ki2 ki2Var2 = new ki2() { // from class: uh4
                        @Override // defpackage.ki2
                        public final Object c() {
                            int i2 = r3;
                            o31 o31Var2 = o31Var;
                            ya1 ya1Var2 = ya1Var;
                            boolean z2 = false;
                            switch (i2) {
                                case 0:
                                    if (ya1Var2.a()) {
                                        tq5.w(o31Var2, null, null, new vh4(ya1Var2, null, 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (ya1Var2.c()) {
                                        tq5.w(o31Var2, null, null, new vh4(ya1Var2, null, 1), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 2:
                                    if (ya1Var2.a()) {
                                        tq5.w(o31Var2, null, null, new vh4(ya1Var2, null, 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                default:
                                    if (ya1Var2.c()) {
                                        tq5.w(o31Var2, null, null, new vh4(ya1Var2, null, 1), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                            }
                        }
                    };
                    l93[] l93VarArr2 = pz5.a;
                    rz5Var.b(dz5.z, new w1(null, ki2Var2));
                    rz5Var.b(dz5.B, new w1(null, new ki2() { // from class: uh4
                        @Override // defpackage.ki2
                        public final Object c() {
                            int i2 = r3;
                            o31 o31Var2 = o31Var;
                            ya1 ya1Var2 = ya1Var;
                            boolean z2 = false;
                            switch (i2) {
                                case 0:
                                    if (ya1Var2.a()) {
                                        tq5.w(o31Var2, null, null, new vh4(ya1Var2, null, 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 1:
                                    if (ya1Var2.c()) {
                                        tq5.w(o31Var2, null, null, new vh4(ya1Var2, null, 1), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                case 2:
                                    if (ya1Var2.a()) {
                                        tq5.w(o31Var2, null, null, new vh4(ya1Var2, null, 0), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                                default:
                                    if (ya1Var2.c()) {
                                        tq5.w(o31Var2, null, null, new vh4(ya1Var2, null, 1), 3);
                                        z2 = true;
                                    }
                                    return Boolean.valueOf(z2);
                            }
                        }
                    }));
                }
                return o27Var;
            default:
                String str = (String) obj3;
                p96 p96Var = (p96) obj2;
                rz5 rz5Var2 = (rz5) obj;
                if (z) {
                    l93[] l93VarArr3 = pz5.a;
                    qz5 qz5Var = mz5.k;
                    l93 l93Var = pz5.a[3];
                    rz5Var2.b(qz5Var, new Object());
                }
                l93[] l93VarArr4 = pz5.a;
                qz5 qz5Var2 = mz5.d;
                l93 l93Var2 = pz5.a[2];
                rz5Var2.b(qz5Var2, str);
                rz5Var2.b(dz5.v, new w1(null, new n96(p96Var, 0)));
                return o27Var;
        }
    }

    public /* synthetic */ xe1(int i, Object obj, Object obj2, boolean z) {
        this.A = i;
        this.B = z;
        this.L = obj;
        this.R = obj2;
    }
}
