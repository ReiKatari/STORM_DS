package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yh4  reason: default package */
/* loaded from: classes.dex */
public final class yh4 extends yc7 {
    public static final kh4 c = new kh4(n67.DOUBLE, 1);
    public final su2 a;
    public final o67 b;

    public yh4(su2 su2Var, o67 o67Var) {
        this.a = su2Var;
        this.b = o67Var;
    }

    public static Serializable e(hf3 hf3Var, jf3 jf3Var) {
        int i = xh4.a[jf3Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            hf3Var.h();
            return new aw3(true);
        }
        hf3Var.e();
        return new ArrayList();
    }

    @Override // defpackage.yc7
    public final Object b(hf3 hf3Var) {
        String str;
        boolean z;
        jf3 n0 = hf3Var.n0();
        Object e = e(hf3Var, n0);
        if (e == null) {
            return d(hf3Var, n0);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (hf3Var.F()) {
                if (e instanceof Map) {
                    str = hf3Var.c0();
                } else {
                    str = null;
                }
                jf3 n02 = hf3Var.n0();
                Serializable e2 = e(hf3Var, n02);
                if (e2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (e2 == null) {
                    e2 = d(hf3Var, n02);
                }
                if (e instanceof List) {
                    ((List) e).add(e2);
                } else {
                    ((Map) e).put(str, e2);
                }
                if (z) {
                    arrayDeque.addLast(e);
                    e = e2;
                }
            } else {
                if (e instanceof List) {
                    hf3Var.r();
                } else {
                    hf3Var.u();
                }
                if (arrayDeque.isEmpty()) {
                    return e;
                }
                e = arrayDeque.removeLast();
            }
        }
    }

    @Override // defpackage.yc7
    public final void c(vf3 vf3Var, Object obj) {
        if (obj == null) {
            vf3Var.A();
            return;
        }
        Class<?> cls = obj.getClass();
        su2 su2Var = this.a;
        su2Var.getClass();
        yc7 d = su2Var.d(new ie7(cls));
        if (d instanceof yh4) {
            vf3Var.k();
            vf3Var.u();
            return;
        }
        d.c(vf3Var, obj);
    }

    public final Serializable d(hf3 hf3Var, jf3 jf3Var) {
        int i = xh4.a[jf3Var.ordinal()];
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        hf3Var.j0();
                        return null;
                    }
                    e41.y(jf3Var, "Unexpected token: ");
                    return null;
                }
                return Boolean.valueOf(hf3Var.U());
            }
            return this.b.readNumber(hf3Var);
        }
        return hf3Var.l0();
    }
}
