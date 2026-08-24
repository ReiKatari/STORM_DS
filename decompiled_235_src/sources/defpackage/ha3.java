package defpackage;

import android.content.Context;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ha3  reason: default package */
/* loaded from: classes.dex */
public final class ha3 {
    public static final Type g;
    public final Context a;
    public final su2 b;
    public final jd6 c;
    public boolean e;
    public final hb4 d = new hb4();
    public final tp6 f = up6.a(yt1.A);

    static {
        Type type = new ie7().b;
        type.getClass();
        g = type;
    }

    public ha3(Context context, su2 su2Var, jd6 jd6Var) {
        this.a = context;
        this.b = su2Var;
        this.c = jd6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
        if (b(r0) == r1) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0078 A[LOOP:1: B:31:0x0078->B:32:0x0096, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0073 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(n00 n00Var, s41 s41Var) {
        ea3 ea3Var;
        int i;
        Iterator it;
        Object obj;
        fh1 fh1Var;
        Object value;
        ArrayList arrayList;
        if (s41Var instanceof ea3) {
            ea3Var = (ea3) s41Var;
            int i2 = ea3Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ea3Var.Z = i2 - Integer.MIN_VALUE;
                Object obj2 = ea3Var.X;
                Object obj3 = x61.COROUTINE_SUSPENDED;
                i = ea3Var.Z;
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
                    n00Var = ea3Var.R;
                    oi2.Y(obj2);
                } else {
                    oi2.Y(obj2);
                    ea3Var.R = n00Var;
                    ea3Var.Z = 1;
                }
                tp6 tp6Var = this.f;
                it = ((Iterable) tp6Var.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = it.next();
                        fh1 fh1Var2 = (fh1) obj;
                        if (!fh1Var2.b && nb3.k(((n00) fh1Var2.a).a, n00Var.a)) {
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
                    ea3Var.R = null;
                    ea3Var.Z = 2;
                    xe1 xe1Var = xk1.a;
                    Object d0 = hv.d0(de1.L, new y3(this, (r41) null, 11), ea3Var);
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
        ea3Var = new ea3(this, s41Var);
        Object obj22 = ea3Var.X;
        Object obj32 = x61.COROUTINE_SUSPENDED;
        i = ea3Var.Z;
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

    public final Object b(s41 s41Var) {
        xe1 xe1Var = xk1.a;
        Object d0 = hv.d0(de1.L, new u12(this, (r41) null, 13), s41Var);
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
    public final Object c(UUID uuid, s41 s41Var) {
        fa3 fa3Var;
        int i;
        Iterator it;
        Object obj;
        fh1 fh1Var;
        if (s41Var instanceof fa3) {
            fa3Var = (fa3) s41Var;
            int i2 = fa3Var.Z;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fa3Var.Z = i2 - Integer.MIN_VALUE;
                Object obj2 = fa3Var.X;
                Object obj3 = x61.COROUTINE_SUSPENDED;
                i = fa3Var.Z;
                if (i == 0) {
                    if (i == 1) {
                        uuid = fa3Var.R;
                        oi2.Y(obj2);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj2);
                    fa3Var.R = uuid;
                    fa3Var.Z = 1;
                    if (b(fa3Var) == obj3) {
                        return obj3;
                    }
                }
                it = ((Iterable) this.f.getValue()).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = it.next();
                        fh1 fh1Var2 = (fh1) obj;
                        if (!fh1Var2.b && nb3.k(((n00) fh1Var2.a).a, uuid)) {
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
                return (n00) fh1Var.a;
            }
        }
        fa3Var = new fa3(this, s41Var);
        Object obj22 = fa3Var.X;
        Object obj32 = x61.COROUTINE_SUSPENDED;
        i = fa3Var.Z;
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
}
