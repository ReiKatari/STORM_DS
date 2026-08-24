package defpackage;

import android.os.Build;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vr6  reason: default package */
/* loaded from: classes.dex */
public abstract class vr6 {
    public static final xx a;
    public static final p04 b;
    public static final p04 c;

    static {
        Class cls = Long.TYPE;
        cls.getClass();
        a = new xx("camera2.streamSpec.streamUseCase", cls, null);
        p04 p04Var = new p04();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            bj7 bj7Var = bj7.PREVIEW;
            bj7 bj7Var2 = bj7.METERING_REPEATING;
            bj7 bj7Var3 = bj7.IMAGE_ANALYSIS;
            p04Var.put(4L, fv.V0(new bj7[]{bj7Var, bj7Var2, bj7Var3}));
            p04Var.put(1L, fv.V0(new bj7[]{bj7Var, bj7Var2, bj7Var3}));
            p04Var.put(2L, ii2.R(bj7.IMAGE_CAPTURE));
            p04Var.put(3L, ii2.R(bj7.VIDEO_CAPTURE));
        }
        b = p04Var.b();
        p04 p04Var2 = new p04();
        if (i >= 33) {
            bj7 bj7Var4 = bj7.PREVIEW;
            bj7 bj7Var5 = bj7.IMAGE_CAPTURE;
            bj7 bj7Var6 = bj7.VIDEO_CAPTURE;
            p04Var2.put(4L, fv.V0(new bj7[]{bj7Var4, bj7Var5, bj7Var6}));
            p04Var2.put(3L, fv.V0(new bj7[]{bj7Var4, bj7Var6}));
        }
        c = p04Var2.b();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kd0, os0] */
    public static kd0 a(yy0 yy0Var, Long l) {
        xx xxVar = a;
        if (yy0Var.i(xxVar) && nb3.k(yy0Var.e(xxVar), l)) {
            return null;
        }
        da4 k = da4.k(yy0Var);
        k.m(xxVar, l);
        return new os0(k);
    }

    public static boolean b(bj7 bj7Var, long j, List list) {
        if (Build.VERSION.SDK_INT >= 33) {
            if (bj7Var == bj7.STREAM_SHARING) {
                Long valueOf = Long.valueOf(j);
                p04 p04Var = c;
                if (p04Var.containsKey(valueOf)) {
                    Object obj = p04Var.get(Long.valueOf(j));
                    obj.getClass();
                    Set set = (Set) obj;
                    if (list.size() == set.size()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (!set.contains((bj7) it.next())) {
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
            p04 p04Var2 = b;
            if (p04Var2.containsKey(valueOf2)) {
                Object obj2 = p04Var2.get(Long.valueOf(j));
                obj2.getClass();
                if (((Set) obj2).contains(bj7Var)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean c(yy0 yy0Var, bj7 bj7Var) {
        Object b2 = yy0Var.b(zi7.Q, Boolean.FALSE);
        b2.getClass();
        if (!((Boolean) b2).booleanValue()) {
            xx xxVar = e23.B;
            if (yy0Var.i(xxVar)) {
                Object e = yy0Var.e(xxVar);
                e.getClass();
                int intValue = ((Number) e).intValue();
                if (ur6.a[bj7Var.ordinal()] == 1 && intValue == 2) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
