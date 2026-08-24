package defpackage;

import android.content.Context;
import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wa3  reason: default package */
/* loaded from: classes.dex */
public final class wa3 {
    public static final Type h;
    public final Context a;
    public final su2 b;
    public final jd6 c;
    public boolean e;
    public final hb4 d = new hb4();
    public final tp6 f = up6.a(yt1.A);
    public final ex6 g = new ex6(new er2(this, 5));

    static {
        Type type = new ie7().b;
        type.getClass();
        h = type;
    }

    public wa3(Context context, su2 su2Var, jd6 jd6Var) {
        this.a = context;
        this.b = su2Var;
        this.c = jd6Var;
    }

    public static final List a(wa3 wa3Var) {
        ArrayList arrayList;
        File file = new File(wa3Var.a.getFilesDir(), "layouts.json");
        if (file.isFile()) {
            try {
                List<gk3> list = (List) wa3Var.b.b(new FileReader(file), h);
                if (list != null) {
                    arrayList = new ArrayList(ht0.v0(list, 10));
                    for (gk3 gk3Var : list) {
                        arrayList.add(gk3Var.a());
                    }
                } else {
                    arrayList = null;
                }
                if (arrayList != null) {
                    return arrayList;
                }
            } catch (Exception unused) {
            }
        }
        return yt1.A;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (c(r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[LOOP:1: B:31:0x0078->B:32:0x0096, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(fk3 fk3Var, s41 s41Var) {
        la3 la3Var;
        int i;
        Iterator it;
        Object obj;
        fh1 fh1Var;
        Object value;
        ArrayList arrayList;
        if (s41Var instanceof la3) {
            la3Var = (la3) s41Var;
            int i2 = la3Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                la3Var.Z = i2 - Integer.MIN_VALUE;
                Object obj2 = la3Var.X;
                Object obj3 = x61.COROUTINE_SUSPENDED;
                i = la3Var.Z;
                Object obj4 = jg7.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj2);
                            return obj4;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fk3Var = la3Var.R;
                    oi2.Y(obj2);
                } else {
                    oi2.Y(obj2);
                    la3Var.R = fk3Var;
                    la3Var.Z = 1;
                }
                tp6 tp6Var = this.f;
                it = ((Iterable) tp6Var.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = it.next();
                        fh1 fh1Var2 = (fh1) obj;
                        if (!fh1Var2.b && nb3.k(((fk3) fh1Var2.a).a, fk3Var.a)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                fh1Var = (fh1) obj;
                if (fh1Var != null) {
                    do {
                        value = tp6Var.getValue();
                        List list = (List) value;
                        int indexOf = list.indexOf(fh1Var);
                        arrayList = new ArrayList(list);
                        arrayList.set(indexOf, new fh1(true, fh1Var.a));
                    } while (!tp6Var.j(value, arrayList));
                    la3Var.R = null;
                    la3Var.Z = 2;
                    xe1 xe1Var = xk1.a;
                    Object d0 = hv.d0(de1.L, new va3(this, null), la3Var);
                    if (d0 != x61.COROUTINE_SUSPENDED) {
                        d0 = obj4;
                    }
                    if (d0 == obj3) {
                        return obj3;
                    }
                }
                return obj4;
            }
        }
        la3Var = new la3(this, s41Var);
        Object obj22 = la3Var.X;
        Object obj32 = x61.COROUTINE_SUSPENDED;
        i = la3Var.Z;
        Object obj42 = jg7.a;
        if (i == 0) {
        }
        tp6 tp6Var2 = this.f;
        it = ((Iterable) tp6Var2.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        fh1Var = (fh1) obj;
        if (fh1Var != null) {
        }
        return obj42;
    }

    public final Object c(s41 s41Var) {
        xe1 xe1Var = xk1.a;
        Object d0 = hv.d0(de1.L, new u12(this, (r41) null, 14), s41Var);
        if (d0 == x61.COROUTINE_SUSPENDED) {
            return d0;
        }
        return jg7.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0072 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0068 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(UUID uuid, s41 s41Var) {
        ma3 ma3Var;
        int i;
        Iterator it;
        Object obj;
        fh1 fh1Var;
        if (s41Var instanceof ma3) {
            ma3Var = (ma3) s41Var;
            int i2 = ma3Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ma3Var.Z = i2 - Integer.MIN_VALUE;
                Object obj2 = ma3Var.X;
                Object obj3 = x61.COROUTINE_SUSPENDED;
                i = ma3Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        uuid = ma3Var.R;
                        oi2.Y(obj2);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj2);
                    ma3Var.R = uuid;
                    ma3Var.Z = 1;
                    if (c(ma3Var) == obj3) {
                        return obj3;
                    }
                }
                it = ((Iterable) this.f.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = it.next();
                        fh1 fh1Var2 = (fh1) obj;
                        if (!fh1Var2.b && nb3.k(((fk3) fh1Var2.a).a, uuid)) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                fh1Var = (fh1) obj;
                if (fh1Var != null) {
                    return null;
                }
                return (fk3) fh1Var.a;
            }
        }
        ma3Var = new ma3(this, s41Var);
        Object obj22 = ma3Var.X;
        Object obj32 = x61.COROUTINE_SUSPENDED;
        i = ma3Var.Z;
        if (i == 0) {
        }
        it = ((Iterable) this.f.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
            }
        }
        fh1Var = (fh1) obj;
        if (fh1Var != null) {
        }
    }

    public final le2 e(UUID uuid) {
        uuid.getClass();
        return f04.z(new b7(new wp0(3, new wp0(7, new pa3(new cf2(new ra3(this, null, 1), this.f), this, 1), uuid), new m8(2, null, 3)), 10));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ec A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00ed A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(fk3 fk3Var, s41 s41Var) {
        ua3 ua3Var;
        Object obj;
        int i;
        fk3 fk3Var2;
        UUID uuid;
        Object value;
        ArrayList m1;
        Object d0;
        Object value2;
        ArrayList m12;
        if (s41Var instanceof ua3) {
            ua3Var = (ua3) s41Var;
            int i2 = ua3Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ua3Var.Z = i2 - Integer.MIN_VALUE;
                Object obj2 = ua3Var.X;
                obj = x61.COROUTINE_SUSPENDED;
                i = ua3Var.Z;
                Object obj3 = jg7.a;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            oi2.Y(obj2);
                            return obj3;
                        }
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    fk3 fk3Var3 = ua3Var.R;
                    oi2.Y(obj2);
                    fk3Var2 = fk3Var3;
                } else {
                    oi2.Y(obj2);
                    ua3Var.R = fk3Var;
                    ua3Var.Z = 1;
                    if (c(ua3Var) != obj) {
                        fk3Var2 = fk3Var;
                    }
                    return obj;
                }
                uuid = fk3Var2.a;
                tp6 tp6Var = this.f;
                if (uuid != null) {
                    fk3 a = fk3.a(fk3Var2, UUID.randomUUID(), null, null, null, false, 0, null, 126);
                    do {
                        value2 = tp6Var.getValue();
                        m12 = gt0.m1((List) value2);
                        m12.add(new fh1(false, a));
                    } while (!tp6Var.j(value2, m12));
                } else {
                    fk3 fk3Var4 = fk3Var2;
                    Iterator it = ((List) tp6Var.getValue()).iterator();
                    int i3 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            if (nb3.k(((fk3) ((fh1) it.next()).a).a, fk3Var4.a)) {
                                break;
                            }
                            i3++;
                        } else {
                            i3 = -1;
                            break;
                        }
                    }
                    do {
                        value = tp6Var.getValue();
                        m1 = gt0.m1((List) value);
                        if (i3 >= 0) {
                            m1.set(i3, new fh1(false, fk3Var4));
                        } else {
                            m1.add(new fh1(false, fk3Var4));
                        }
                    } while (!tp6Var.j(value, m1));
                }
                ua3Var.R = null;
                ua3Var.Z = 2;
                xe1 xe1Var = xk1.a;
                d0 = hv.d0(de1.L, new va3(this, null), ua3Var);
                if (d0 != x61.COROUTINE_SUSPENDED) {
                    d0 = obj3;
                }
                if (d0 != obj) {
                    return obj;
                }
                return obj3;
            }
        }
        ua3Var = new ua3(this, s41Var);
        Object obj22 = ua3Var.X;
        obj = x61.COROUTINE_SUSPENDED;
        i = ua3Var.Z;
        Object obj32 = jg7.a;
        if (i == 0) {
        }
        uuid = fk3Var2.a;
        tp6 tp6Var2 = this.f;
        if (uuid != null) {
        }
        ua3Var.R = null;
        ua3Var.Z = 2;
        xe1 xe1Var2 = xk1.a;
        d0 = hv.d0(de1.L, new va3(this, null), ua3Var);
        if (d0 != x61.COROUTINE_SUSPENDED) {
        }
        if (d0 != obj) {
        }
    }
}
