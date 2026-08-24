package defpackage;

import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ke3  reason: default package */
/* loaded from: classes.dex */
public class ke3 extends yc7 {
    public static final ke3 a = new ke3();

    private ke3() {
    }

    public static ee3 d(hf3 hf3Var) {
        String str;
        boolean z;
        if (hf3Var instanceof rf3) {
            rf3 rf3Var = (rf3) hf3Var;
            jf3 n0 = rf3Var.n0();
            if (n0 != jf3.NAME && n0 != jf3.END_ARRAY && n0 != jf3.END_OBJECT && n0 != jf3.END_DOCUMENT) {
                ee3 ee3Var = (ee3) rf3Var.C0();
                rf3Var.u0();
                return ee3Var;
            }
            e41.o(n0, " when reading a JsonElement.", "Unexpected ");
            return null;
        }
        jf3 n02 = hf3Var.n0();
        ee3 f = f(hf3Var, n02);
        if (f == null) {
            return e(hf3Var, n02);
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        while (true) {
            if (hf3Var.F()) {
                if (f instanceof ze3) {
                    str = hf3Var.c0();
                } else {
                    str = null;
                }
                jf3 n03 = hf3Var.n0();
                ee3 f2 = f(hf3Var, n03);
                if (f2 != null) {
                    z = true;
                } else {
                    z = false;
                }
                if (f2 == null) {
                    f2 = e(hf3Var, n03);
                }
                if (f instanceof od3) {
                    ((od3) f).A.add(f2);
                } else {
                    ((ze3) f).d(str, f2);
                }
                if (z) {
                    arrayDeque.addLast(f);
                    f = f2;
                }
            } else {
                if (f instanceof od3) {
                    hf3Var.r();
                } else {
                    hf3Var.u();
                }
                if (arrayDeque.isEmpty()) {
                    return f;
                }
                f = (ee3) arrayDeque.removeLast();
            }
        }
    }

    public static ee3 e(hf3 hf3Var, jf3 jf3Var) {
        int i = je3.a[jf3Var.ordinal()];
        if (i != 3) {
            if (i != 4) {
                if (i != 5) {
                    if (i == 6) {
                        hf3Var.j0();
                        return ve3.A;
                    }
                    e41.y(jf3Var, "Unexpected token: ");
                    return null;
                }
                return new ef3(Boolean.valueOf(hf3Var.U()));
            }
            return new ef3(new fo3(hf3Var.l0()));
        }
        return new ef3(hf3Var.l0());
    }

    public static ee3 f(hf3 hf3Var, jf3 jf3Var) {
        int i = je3.a[jf3Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            hf3Var.h();
            return new ze3();
        }
        hf3Var.e();
        return new od3();
    }

    public static void g(vf3 vf3Var, ee3 ee3Var) {
        boolean parseBoolean;
        if (ee3Var != null && !(ee3Var instanceof ve3)) {
            if (ee3Var instanceof ef3) {
                ef3 ef3Var = (ef3) ee3Var;
                Serializable serializable = ef3Var.A;
                if (serializable instanceof Number) {
                    vf3Var.a0(ef3Var.g());
                    return;
                } else if (serializable instanceof Boolean) {
                    if (serializable instanceof Boolean) {
                        parseBoolean = ((Boolean) serializable).booleanValue();
                    } else {
                        parseBoolean = Boolean.parseBoolean(ef3Var.c());
                    }
                    vf3Var.e0(parseBoolean);
                    return;
                } else {
                    vf3Var.c0(ef3Var.c());
                    return;
                }
            }
            boolean z = ee3Var instanceof od3;
            if (z) {
                vf3Var.h();
                if (z) {
                    ArrayList arrayList = ((od3) ee3Var).A;
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj = arrayList.get(i);
                        i++;
                        g(vf3Var, (ee3) obj);
                    }
                    vf3Var.r();
                    return;
                }
                e41.y(ee3Var, "Not a JSON Array: ");
                return;
            } else if (ee3Var instanceof ze3) {
                vf3Var.k();
                Iterator it = ((yv3) ee3Var.b().A.entrySet()).iterator();
                while (((xv3) it).hasNext()) {
                    zv3 b = ((xv3) it).b();
                    vf3Var.v((String) b.getKey());
                    g(vf3Var, (ee3) b.getValue());
                }
                vf3Var.u();
                return;
            } else {
                e41.A(ee3Var.getClass(), "Couldn't write ");
                return;
            }
        }
        vf3Var.A();
    }

    @Override // defpackage.yc7
    public final /* bridge */ /* synthetic */ Object b(hf3 hf3Var) {
        return d(hf3Var);
    }

    @Override // defpackage.yc7
    public final /* bridge */ /* synthetic */ void c(vf3 vf3Var, Object obj) {
        g(vf3Var, (ee3) obj);
    }
}
