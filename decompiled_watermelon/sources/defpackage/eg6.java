package defpackage;

import android.os.Build;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: eg6  reason: default package */
/* loaded from: classes.dex */
public abstract class eg6 {
    public static final uw a;
    public static final mt3 b;
    public static final mt3 c;

    static {
        Class cls = Long.TYPE;
        cls.getClass();
        a = new uw("camera2.streamSpec.streamUseCase", cls, null);
        mt3 mt3Var = new mt3();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            d57 d57Var = d57.PREVIEW;
            d57 d57Var2 = d57.METERING_REPEATING;
            d57 d57Var3 = d57.IMAGE_ANALYSIS;
            mt3Var.put(4L, nu.H0(new d57[]{d57Var, d57Var2, d57Var3}));
            mt3Var.put(1L, nu.H0(new d57[]{d57Var, d57Var2, d57Var3}));
            mt3Var.put(2L, hi2.X(d57.IMAGE_CAPTURE));
            mt3Var.put(3L, hi2.X(d57.VIDEO_CAPTURE));
        }
        b = mt3Var.b();
        mt3 mt3Var2 = new mt3();
        if (i >= 33) {
            d57 d57Var4 = d57.PREVIEW;
            d57 d57Var5 = d57.IMAGE_CAPTURE;
            d57 d57Var6 = d57.VIDEO_CAPTURE;
            mt3Var2.put(4L, nu.H0(new d57[]{d57Var4, d57Var5, d57Var6}));
            mt3Var2.put(3L, nu.H0(new d57[]{d57Var4, d57Var6}));
        }
        c = mt3Var2.b();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [bq0, cb0] */
    public static cb0 a(cw0 cw0Var, Long l) {
        uw uwVar = a;
        if (cw0Var.a(uwVar) && b53.x(cw0Var.g(uwVar), l)) {
            return null;
        }
        x14 j = x14.j(cw0Var);
        j.r(uwVar, l);
        return new bq0(j);
    }

    public static boolean b(d57 d57Var, long j, List list) {
        if (Build.VERSION.SDK_INT >= 33) {
            if (d57Var == d57.STREAM_SHARING) {
                Long valueOf = Long.valueOf(j);
                mt3 mt3Var = c;
                if (mt3Var.containsKey(valueOf)) {
                    Object obj = mt3Var.get(Long.valueOf(j));
                    obj.getClass();
                    Set set = (Set) obj;
                    if (list.size() == set.size()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (!set.contains((d57) it.next())) {
                                return false;
                            }
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            Long valueOf2 = Long.valueOf(j);
            mt3 mt3Var2 = b;
            if (mt3Var2.containsKey(valueOf2)) {
                Object obj2 = mt3Var2.get(Long.valueOf(j));
                obj2.getClass();
                if (((Set) obj2).contains(d57Var)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean c(cw0 cw0Var, d57 d57Var) {
        Object d = cw0Var.d(b57.P, Boolean.FALSE);
        d.getClass();
        if (!((Boolean) d).booleanValue()) {
            uw uwVar = aw2.B;
            if (cw0Var.a(uwVar)) {
                Object g = cw0Var.g(uwVar);
                g.getClass();
                int intValue = ((Number) g).intValue();
                if (dg6.a[d57Var.ordinal()] == 1 && intValue == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
