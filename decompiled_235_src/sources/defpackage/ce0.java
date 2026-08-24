package defpackage;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ce0  reason: default package */
/* loaded from: classes.dex */
public final class ce0 extends be0 {
    public final /* synthetic */ int a;
    public final Object b;

    public ce0(List list) {
        this.a = 0;
        this.b = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            be0 be0Var = (be0) it.next();
            if (!(be0Var instanceof de0)) {
                ((ArrayList) this.b).add(be0Var);
            }
        }
    }

    @Override // defpackage.be0
    public void a(int i) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((be0) obj).a(i);
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.be0
    public final void b(int i, je0 je0Var) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((be0) obj).b(i, je0Var);
                }
                return;
            case 1:
                o54 o54Var = (o54) this.b;
                synchronized (o54Var.A) {
                    try {
                        if (!o54Var.X) {
                            o54Var.e0.put(je0Var.c(), new ke0(je0Var));
                            o54Var.k();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            default:
                mq7 mq7Var = (mq7) ((WeakReference) this.b).get();
                if (mq7Var != null) {
                    Iterator it = mq7Var.A.iterator();
                    while (it.hasNext()) {
                        rc6 rc6Var = ((di7) it.next()).o;
                        for (be0 be0Var : rc6Var.g.d) {
                            be0Var.b(i, new bg1(je0Var, rc6Var.g.e, -1L));
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.be0
    public void c(int i, d90 d90Var) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((be0) obj).c(i, d90Var);
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.be0
    public void d(int i, int i2) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = arrayList.get(i3);
                    i3++;
                    ((be0) obj).d(i, i2);
                }
                return;
            default:
                return;
        }
    }

    @Override // defpackage.be0
    public void e(int i) {
        switch (this.a) {
            case 0:
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((be0) obj).e(i);
                }
                return;
            default:
                return;
        }
    }

    public ce0(mq7 mq7Var) {
        this.a = 2;
        this.b = new WeakReference(mq7Var);
    }

    public ce0(o54 o54Var) {
        this.a = 1;
        this.b = o54Var;
    }
}
