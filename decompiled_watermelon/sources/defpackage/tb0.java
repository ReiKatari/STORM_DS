package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tb0  reason: default package */
/* loaded from: classes.dex */
public final class tb0 extends sb0 {
    public final /* synthetic */ int a;
    public final Object b;

    public tb0(List list) {
        this.a = 0;
        this.b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sb0 sb0Var = (sb0) it.next();
            if (!(sb0Var instanceof ub0)) {
                ((ArrayList) this.b).add(sb0Var);
            }
        }
    }

    @Override // defpackage.sb0
    public void a(int i) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((sb0) obj).a(i);
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.sb0
    public final void b(int i, ac0 ac0Var) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((sb0) obj).b(i, ac0Var);
                }
                return;
            case 1:
                vx3 vx3Var = (vx3) this.b;
                synchronized (vx3Var.A) {
                    try {
                        if (!vx3Var.X) {
                            vx3Var.d0.put(ac0Var.c(), new bc0(ac0Var));
                            vx3Var.k();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            default:
                kc7 kc7Var = (kc7) ((WeakReference) this.b).get();
                if (kc7Var != null) {
                    Iterator it = kc7Var.A.iterator();
                    while (it.hasNext()) {
                        d16 d16Var = ((f47) it.next()).o;
                        for (sb0 sb0Var : d16Var.g.d) {
                            sb0Var.b(i, new ac1(ac0Var, d16Var.g.e, -1L));
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.sb0
    public void c(int i, sn1 sn1Var) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((sb0) obj).c(i, sn1Var);
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.sb0
    public void d(int i, int i2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((sb0) obj).d(i, i2);
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.sb0
    public void e(int i) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((sb0) obj).e(i);
                }
                return;
            default:
                return;
        }
    }

    public tb0(kc7 kc7Var) {
        this.a = 2;
        this.b = new WeakReference(kc7Var);
    }

    public tb0(vx3 vx3Var) {
        this.a = 1;
        this.b = vx3Var;
    }
}
