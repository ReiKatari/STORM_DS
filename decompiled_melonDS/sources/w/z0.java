package w;

import android.os.Build;
import j0.l2;
import j0.n2;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class z0 {

    /* renamed from: a  reason: collision with root package name */
    public static final j0.g f14105a;

    /* renamed from: b  reason: collision with root package name */
    public static final ac.e f14106b;

    /* renamed from: c  reason: collision with root package name */
    public static final ac.e f14107c;

    static {
        Class cls = Long.TYPE;
        cls.getClass();
        f14105a = new j0.g("camera2.streamSpec.streamUseCase", cls, null);
        ac.e eVar = new ac.e();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 33) {
            n2 n2Var = n2.PREVIEW;
            n2 n2Var2 = n2.METERING_REPEATING;
            n2 n2Var3 = n2.IMAGE_ANALYSIS;
            eVar.put(4L, zb.k.S(new n2[]{n2Var, n2Var2, n2Var3}));
            eVar.put(1L, zb.k.S(new n2[]{n2Var, n2Var2, n2Var3}));
            eVar.put(2L, p7.j.E(n2.IMAGE_CAPTURE));
            eVar.put(3L, p7.j.E(n2.VIDEO_CAPTURE));
        }
        f14106b = eVar.b();
        ac.e eVar2 = new ac.e();
        if (i2 >= 33) {
            n2 n2Var4 = n2.PREVIEW;
            n2 n2Var5 = n2.IMAGE_CAPTURE;
            n2 n2Var6 = n2.VIDEO_CAPTURE;
            eVar2.put(4L, zb.k.S(new n2[]{n2Var4, n2Var5, n2Var6}));
            eVar2.put(3L, zb.k.S(new n2[]{n2Var4, n2Var6}));
        }
        f14107c = eVar2.b();
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [v.a, a0.b] */
    public static v.a a(j0.r0 r0Var, Long l10) {
        j0.g gVar = f14105a;
        if (r0Var.e(gVar) && nc.k.a(r0Var.g(gVar), l10)) {
            return null;
        }
        j0.g1 c4 = j0.g1.c(r0Var);
        c4.o(gVar, l10);
        return new a0.b(13, c4);
    }

    public static boolean b(n2 n2Var, long j2, List list) {
        if (Build.VERSION.SDK_INT >= 33) {
            if (n2Var == n2.STREAM_SHARING) {
                Long valueOf = Long.valueOf(j2);
                ac.e eVar = f14107c;
                if (eVar.containsKey(valueOf)) {
                    Object obj = eVar.get(Long.valueOf(j2));
                    obj.getClass();
                    Set set = (Set) obj;
                    if (list.size() == set.size()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            if (!set.contains((n2) it.next())) {
                                return false;
                            }
                        }
                        return true;
                    }
                    return false;
                }
                return false;
            }
            Long valueOf2 = Long.valueOf(j2);
            ac.e eVar2 = f14106b;
            if (eVar2.containsKey(valueOf2)) {
                Object obj2 = eVar2.get(Long.valueOf(j2));
                obj2.getClass();
                if (((Set) obj2).contains(n2Var)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static boolean c(j0.r0 r0Var, n2 n2Var) {
        Object h2 = r0Var.h(l2.K, Boolean.FALSE);
        h2.getClass();
        if (!((Boolean) h2).booleanValue()) {
            j0.g gVar = j0.z0.B;
            if (r0Var.e(gVar)) {
                Object g10 = r0Var.g(gVar);
                g10.getClass();
                if (p7.o.l(n2Var, ((Number) g10).intValue()) == 5) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }
}
