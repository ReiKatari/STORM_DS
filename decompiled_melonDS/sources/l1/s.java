package l1;

import android.view.View;
import java.util.WeakHashMap;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s implements f {

    /* renamed from: b  reason: collision with root package name */
    public static final s f8618b = new s(0);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8619a;

    public /* synthetic */ s(int i2) {
        this.f8619a = i2;
    }

    public static final b b(int i2, String str) {
        WeakHashMap weakHashMap = c2.f8518w;
        return new b(i2, str);
    }

    public static final y1 d(int i2, String str) {
        WeakHashMap weakHashMap = c2.f8518w;
        return new y1(new q0(0, 0, 0, 0), str);
    }

    public static c2 f(n2.m mVar) {
        n2.r rVar = (n2.r) mVar;
        View view = (View) rVar.j(b4.r0.f1941f);
        c2 g10 = g(view);
        boolean h2 = rVar.h(g10) | rVar.h(view);
        Object L = rVar.L();
        if (h2 || L == n2.l.f9953a) {
            L = new he.g(9, g10, view);
            rVar.h0(L);
        }
        n2.s.d(g10, (mc.l) L, rVar);
        return g10;
    }

    public static c2 g(View view) {
        c2 c2Var;
        WeakHashMap weakHashMap = c2.f8518w;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new c2(view);
                    weakHashMap.put(view, obj);
                }
                c2Var = (c2) obj;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c2Var;
    }

    @Override // l1.f
    public void c(x4.c cVar, int i2, int[] iArr, x4.m mVar, int[] iArr2) {
        switch (this.f8619a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                i.b(iArr, iArr2, false);
                return;
            case 2:
                i.c(i2, iArr, iArr2, false);
                return;
            case 3:
                if (mVar == x4.m.Ltr) {
                    i.c(i2, iArr, iArr2, false);
                    return;
                } else {
                    i.b(iArr, iArr2, true);
                    return;
                }
            default:
                if (mVar == x4.m.Ltr) {
                    i.b(iArr, iArr2, false);
                    return;
                } else {
                    i.c(i2, iArr, iArr2, true);
                    return;
                }
        }
    }

    public b3.p e(b3.p pVar, b3.h hVar) {
        return pVar.f(new l(hVar));
    }

    public String toString() {
        switch (this.f8619a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                return "AbsoluteArrangement#Left";
            case 2:
                return "AbsoluteArrangement#Right";
            case 3:
                return "Arrangement#End";
            case 4:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
