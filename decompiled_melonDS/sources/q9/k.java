package q9;

import android.os.SystemClock;
import androidx.preference.Preference;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k implements i {

    /* renamed from: a  reason: collision with root package name */
    public static final k f12406a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static e9.h f12407b;

    @Override // q9.i
    public boolean a(n9.g gVar) {
        int i2;
        ij.a aVar = gVar.f10114a;
        boolean z10 = aVar instanceof n9.a;
        int i10 = Preference.DEFAULT_ORDER;
        if (z10) {
            i2 = ((n9.a) aVar).f10110e;
        } else {
            i2 = Integer.MAX_VALUE;
        }
        if (i2 > 100) {
            ij.a aVar2 = gVar.f10115b;
            if (aVar2 instanceof n9.a) {
                i10 = ((n9.a) aVar2).f10110e;
            }
            if (i10 > 100) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // q9.i
    public boolean c() {
        boolean z10;
        synchronized (h.f12396a) {
            try {
                int i2 = h.f12398c;
                h.f12398c = i2 + 1;
                if (i2 >= 30 || SystemClock.uptimeMillis() > h.f12399d + 30000) {
                    boolean z11 = false;
                    h.f12398c = 0;
                    h.f12399d = SystemClock.uptimeMillis();
                    String[] list = h.f12397b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    if (list.length < 800) {
                        z11 = true;
                    }
                    h.f12400e = z11;
                }
                z10 = h.f12400e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return z10;
    }
}
