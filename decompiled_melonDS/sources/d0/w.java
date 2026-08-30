package d0;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseArray;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: r  reason: collision with root package name */
    public static final Object f3482r = new Object();

    /* renamed from: s  reason: collision with root package name */
    public static final SparseArray f3483s = new SparseArray();

    /* renamed from: c  reason: collision with root package name */
    public final y f3486c;

    /* renamed from: d  reason: collision with root package name */
    public final Executor f3487d;

    /* renamed from: e  reason: collision with root package name */
    public final Handler f3488e;

    /* renamed from: f  reason: collision with root package name */
    public final HandlerThread f3489f;

    /* renamed from: g  reason: collision with root package name */
    public w.j f3490g;

    /* renamed from: h  reason: collision with root package name */
    public w.c0 f3491h;

    /* renamed from: i  reason: collision with root package name */
    public w.f0 f3492i;

    /* renamed from: j  reason: collision with root package name */
    public jb.c f3493j;

    /* renamed from: k  reason: collision with root package name */
    public b9.e f3494k;

    /* renamed from: l  reason: collision with root package name */
    public final h1 f3495l;
    public final b5.l m;

    /* renamed from: n  reason: collision with root package name */
    public final j0.f0 f3496n;

    /* renamed from: o  reason: collision with root package name */
    public v f3497o;

    /* renamed from: q  reason: collision with root package name */
    public final Integer f3499q;

    /* renamed from: a  reason: collision with root package name */
    public final j0.j0 f3484a = new j0.j0();

    /* renamed from: b  reason: collision with root package name */
    public final Object f3485b = new Object();

    /* renamed from: p  reason: collision with root package name */
    public ta.a f3498p = m0.k.L;

    /* JADX WARN: Code restructure failed: missing block: B:147:0x02a0, code lost:
        r11 = r12;
        r5 = r1;
        r12 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02b0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01b2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x019f  */
    /* JADX WARN: Type inference failed for: r0v68, types: [java.lang.Object, b5.n] */
    /* JADX WARN: Type inference failed for: r6v2, types: [b5.i, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:139:0x028d -> B:136:0x028a). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:149:0x02a6 -> B:143:0x0291). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:154:0x02ab -> B:172:0x02ac). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public w(android.content.Context r11, x0.c r12) {
        /*
            Method dump skipped, instructions count: 702
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: d0.w.<init>(android.content.Context, x0.c):void");
    }

    public static void a(Integer num) {
        synchronized (f3482r) {
            try {
                if (num == null) {
                    return;
                }
                SparseArray sparseArray = f3483s;
                int intValue = ((Integer) sparseArray.get(num.intValue())).intValue() - 1;
                if (intValue == 0) {
                    sparseArray.remove(num.intValue());
                } else {
                    sparseArray.put(num.intValue(), Integer.valueOf(intValue));
                }
                b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static void b() {
        SparseArray sparseArray = f3483s;
        if (sparseArray.size() == 0) {
            aj.g.f869g = 3;
        } else if (sparseArray.get(3) != null) {
            aj.g.f869g = 3;
        } else if (sparseArray.get(4) != null) {
            aj.g.f869g = 4;
        } else if (sparseArray.get(5) != null) {
            aj.g.f869g = 5;
        } else if (sparseArray.get(6) != null) {
            aj.g.f869g = 6;
        }
    }
}
