package defpackage;

import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.workers.ConstraintTrackingWorker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y42  reason: default package */
/* loaded from: classes.dex */
public abstract class y42 {
    public static final String a = ga0.h("EnqueueRunnable");

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01e5  */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(aw7 aw7Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        List list;
        boolean z5;
        WorkDatabase workDatabase;
        boolean z6;
        Iterator it;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        HashSet b = aw7.b(aw7Var);
        lw7 lw7Var = aw7Var.a;
        List list2 = aw7Var.d;
        String[] strArr = (String[]) b.toArray(new String[0]);
        String str = aw7Var.b;
        y72 y72Var = aw7Var.c;
        lw7Var.b.d.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        WorkDatabase workDatabase2 = lw7Var.c;
        if (strArr != null && strArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            z3 = false;
            z4 = false;
            z2 = true;
            for (String str2 : strArr) {
                yw7 d = workDatabase2.w().d(str2);
                if (d == null) {
                    ga0.f().d(a, "Prerequisite " + str2 + " doesn't exist; not enqueuing");
                    break;
                }
                iw7 iw7Var = d.b;
                if (iw7Var == iw7.SUCCEEDED) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                z2 &= z10;
                if (iw7Var == iw7.FAILED) {
                    z4 = true;
                } else if (iw7Var == iw7.CANCELLED) {
                    z3 = true;
                }
            }
        } else {
            z2 = true;
            z3 = false;
            z4 = false;
        }
        boolean isEmpty = TextUtils.isEmpty(str);
        if (!isEmpty && !z) {
            dx7 w = workDatabase2.w();
            w.getClass();
            str.getClass();
            list = list2;
            List<ww7> list3 = (List) hv.Q(w.a, true, false, new cx7(str, 0));
            if (!list3.isEmpty()) {
                int i = 29;
                if (y72Var != y72.APPEND && y72Var != y72.APPEND_OR_REPLACE) {
                    if (y72Var == y72.KEEP) {
                        for (ww7 ww7Var : list3) {
                            iw7 iw7Var2 = ww7Var.b;
                            if (iw7Var2 != iw7.ENQUEUED) {
                                if (iw7Var2 == iw7.RUNNING) {
                                }
                            }
                            z8 = false;
                            z7 = true;
                        }
                    }
                    workDatabase2.getClass();
                    workDatabase2.o(new er2(new v(workDatabase2, str, lw7Var, 7), 26));
                    dx7 w2 = workDatabase2.w();
                    for (ww7 ww7Var2 : list3) {
                        String str3 = ww7Var2.a;
                        w2.getClass();
                        str3.getClass();
                        hv.Q(w2.a, false, true, new c70(str3, i));
                        w2 = w2;
                        i = 29;
                    }
                    z5 = isEmpty;
                    workDatabase = workDatabase2;
                    z6 = true;
                    it = list.iterator();
                    while (it.hasNext()) {
                    }
                    z7 = true;
                    z8 = z6;
                    aw7Var.g = z7;
                    return z8;
                }
                zh1 r = workDatabase2.r();
                ArrayList arrayList = new ArrayList();
                for (ww7 ww7Var3 : list3) {
                    String str4 = ww7Var3.a;
                    r.getClass();
                    str4.getClass();
                    boolean z11 = isEmpty;
                    zh1 zh1Var = r;
                    WorkDatabase workDatabase3 = workDatabase2;
                    if (!((Boolean) hv.Q(r.a, true, false, new c70(str4, 2))).booleanValue()) {
                        iw7 iw7Var3 = ww7Var3.b;
                        if (iw7Var3 == iw7.SUCCEEDED) {
                            z9 = true;
                        } else {
                            z9 = false;
                        }
                        boolean z12 = z9 & z2;
                        if (iw7Var3 == iw7.FAILED) {
                            z4 = true;
                        } else if (iw7Var3 == iw7.CANCELLED) {
                            z3 = true;
                        }
                        arrayList.add(ww7Var3.a);
                        z2 = z12;
                    }
                    isEmpty = z11;
                    r = zh1Var;
                    workDatabase2 = workDatabase3;
                }
                z5 = isEmpty;
                workDatabase = workDatabase2;
                ArrayList arrayList2 = arrayList;
                arrayList2 = arrayList;
                if (y72Var == y72.APPEND_OR_REPLACE && (z3 || z4)) {
                    dx7 w3 = workDatabase.w();
                    w3.getClass();
                    m16 m16Var = w3.a;
                    for (ww7 ww7Var4 : (List) hv.Q(m16Var, true, false, new cx7(str, 0))) {
                        String str5 = ww7Var4.a;
                        str5.getClass();
                        hv.Q(m16Var, false, true, new c70(str5, 29));
                    }
                    z3 = false;
                    z4 = false;
                    arrayList2 = Collections.EMPTY_LIST;
                }
                strArr = (String[]) arrayList2.toArray(strArr);
                if (strArr.length > 0) {
                    z = true;
                } else {
                    z = false;
                }
                z6 = false;
                it = list.iterator();
                while (it.hasNext()) {
                    gm4 gm4Var = (gm4) it.next();
                    yw7 yw7Var = gm4Var.b;
                    UUID uuid = gm4Var.a;
                    if (z && !z2) {
                        if (z4) {
                            yw7Var.b = iw7.FAILED;
                        } else if (z3) {
                            yw7Var.b = iw7.CANCELLED;
                        } else {
                            yw7Var.b = iw7.BLOCKED;
                        }
                    } else {
                        yw7Var.n = currentTimeMillis;
                    }
                    if (yw7Var.b == iw7.ENQUEUED) {
                        z6 = true;
                    }
                    dx7 w4 = workDatabase.w();
                    lw7Var.e.getClass();
                    lw7 lw7Var2 = lw7Var;
                    boolean c = yw7Var.e.c("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME");
                    boolean z13 = z6;
                    Iterator it2 = it;
                    boolean c2 = yw7Var.e.c("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_PACKAGE_NAME");
                    boolean c3 = yw7Var.e.c("androidx.work.impl.workers.RemoteListenableWorker.ARGUMENT_CLASS_NAME");
                    if (!c && c2 && c3) {
                        String str6 = yw7Var.c;
                        wb1 wb1Var = new wb1(0, (byte) 0);
                        xb1 xb1Var = yw7Var.e;
                        xb1Var.getClass();
                        wb1Var.j(xb1Var.a);
                        wb1Var.b.put("androidx.work.multiprocess.RemoteListenableDelegatingWorker.ARGUMENT_REMOTE_LISTENABLE_WORKER_NAME", str6);
                        yw7Var = yw7.b(yw7Var, "androidx.work.multiprocess.RemoteListenableDelegatingWorker", wb1Var.e());
                    }
                    if (Build.VERSION.SDK_INT <= 25) {
                        p21 p21Var = yw7Var.j;
                        String str7 = yw7Var.c;
                        if (!nb3.k(str7, ConstraintTrackingWorker.class.getName()) && (p21Var.e || p21Var.f)) {
                            wb1 wb1Var2 = new wb1(0, (byte) 0);
                            xb1 xb1Var2 = yw7Var.e;
                            xb1Var2.getClass();
                            wb1Var2.j(xb1Var2.a);
                            wb1Var2.b.put("androidx.work.impl.workers.ConstraintTrackingWorker.ARGUMENT_CLASS_NAME", str7);
                            yw7Var = yw7.b(yw7Var, ConstraintTrackingWorker.class.getName(), wb1Var2.e());
                        }
                    }
                    w4.getClass();
                    hv.Q(w4.a, false, true, new ja7(13, w4, yw7Var));
                    if (z) {
                        int length = strArr.length;
                        int i2 = 0;
                        while (i2 < length) {
                            String str8 = strArr[i2];
                            String uuid2 = uuid.toString();
                            uuid2.getClass();
                            vh1 vh1Var = new vh1(uuid2, str8);
                            zh1 r2 = workDatabase.r();
                            r2.getClass();
                            hv.Q(r2.a, false, true, new y(22, r2, vh1Var));
                            i2++;
                            strArr = strArr;
                        }
                    }
                    String[] strArr2 = strArr;
                    fx7 x = workDatabase.x();
                    String uuid3 = uuid.toString();
                    uuid3.getClass();
                    Set<String> set = gm4Var.c;
                    x.getClass();
                    set.getClass();
                    for (String str9 : set) {
                        hv.Q(x.a, false, true, new ja7(15, x, new ex7(str9, uuid3)));
                    }
                    if (!z5) {
                        qw7 u = workDatabase.u();
                        String uuid4 = uuid.toString();
                        uuid4.getClass();
                        pw7 pw7Var = new pw7(str, uuid4);
                        u.getClass();
                        hv.Q(u.a, false, true, new ja7(9, u, pw7Var));
                    }
                    lw7Var = lw7Var2;
                    z6 = z13;
                    it = it2;
                    strArr = strArr2;
                }
                z7 = true;
                z8 = z6;
                aw7Var.g = z7;
                return z8;
            }
        } else {
            list = list2;
        }
        z5 = isEmpty;
        workDatabase = workDatabase2;
        z6 = false;
        it = list.iterator();
        while (it.hasNext()) {
        }
        z7 = true;
        z8 = z6;
        aw7Var.g = z7;
        return z8;
    }
}
