package defpackage;

import android.os.SystemClock;
import java.lang.reflect.Method;
import java.security.Provider;
import java.time.Instant;
import javax.crypto.Mac;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jd1  reason: default package */
/* loaded from: classes.dex */
public class jd1 implements x42, x93, vr0, kw2, mk4, k61, wx4, i71, a97 {
    public final /* synthetic */ int A;

    public /* synthetic */ jd1(int i) {
        this.A = i;
    }

    public static final boolean c(lt4 lt4Var) {
        lt4 lt4Var2 = kl5.X;
        da0 da0Var = lt4Var.A;
        int k = da0.k(da0Var, f.a);
        if (k == -1) {
            k = da0.k(lt4Var.A, f.b);
        }
        if (k != -1) {
            da0Var = da0.p(da0Var, k + 1, 0, 2);
        } else if (lt4Var.e() != null && da0Var.d() == 2) {
            da0Var = da0.R;
        }
        return !xs6.Y(da0Var.s(), ".class", true);
    }

    @Override // defpackage.x42
    public Object a(String str, Provider provider) {
        if (provider == null) {
            return Mac.getInstance(str);
        }
        return Mac.getInstance(str, provider);
    }

    @Override // defpackage.vr0
    public s83 b() {
        Instant now;
        long epochSecond;
        int nano;
        now = Instant.now();
        now.getClass();
        s83 s83Var = s83.L;
        epochSecond = now.getEpochSecond();
        nano = now.getNano();
        return bl2.A(nano, epochSecond);
    }

    @Override // defpackage.kw2
    public boolean d() {
        boolean z;
        synchronized (ta2.a) {
            try {
                int i = ta2.c;
                ta2.c = i + 1;
                if (i >= 30 || SystemClock.uptimeMillis() > ta2.d + 30000) {
                    boolean z2 = false;
                    ta2.c = 0;
                    ta2.d = SystemClock.uptimeMillis();
                    String[] list = ta2.b.list();
                    if (list == null) {
                        list = new String[0];
                    }
                    if (list.length < 800) {
                        z2 = true;
                    }
                    ta2.e = z2;
                }
                z = ta2.e;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // defpackage.kw2
    public boolean e(wi6 wi6Var) {
        int i;
        ge7 ge7Var = wi6Var.a;
        int i2 = Integer.MAX_VALUE;
        if (ge7Var instanceof pj1) {
            i = ((pj1) ge7Var).m;
        } else {
            i = Integer.MAX_VALUE;
        }
        if (i > 100) {
            ge7 ge7Var2 = wi6Var.b;
            if (ge7Var2 instanceof pj1) {
                i2 = ((pj1) ge7Var2).m;
            }
            if (i2 > 100) {
                return true;
            }
            return false;
        }
        return false;
    }

    public String f(Method method, int i) {
        return "parameter #" + (i + 1);
    }

    public Object g(Method method, Object obj, Object[] objArr) {
        throw new AssertionError();
    }

    public boolean h(Method method) {
        return false;
    }

    public boolean j(CharSequence charSequence) {
        return false;
    }

    public String toString() {
        switch (this.A) {
            case 25:
                return "ReusedSlotId";
            default:
                return super.toString();
        }
    }

    @Override // defpackage.mk4
    public int i(int i) {
        return i;
    }

    @Override // defpackage.mk4
    public int s(int i) {
        return i;
    }
}
