package defpackage;

import androidx.preference.Preference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: d46 */
/* loaded from: classes.dex */
public abstract class d46 {
    public static final an1 a = new an1("NO_VALUE", 9);

    public static final c46 a(int i, int i2, h60 h60Var) {
        if (i >= 0) {
            if (i2 >= 0) {
                if (i <= 0 && i2 <= 0 && h60Var != h60.SUSPEND) {
                    c44.u(h60Var, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
                    return null;
                }
                int i3 = i2 + i;
                if (i3 < 0) {
                    i3 = Preference.DEFAULT_ORDER;
                }
                return new c46(i, i3, h60Var);
            }
            i.g(wh1.g(i2, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        i.g(wh1.g(i, "replay cannot be negative, but was "));
        return null;
    }

    public static /* synthetic */ c46 b(int i, int i2, h60 h60Var, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            h60Var = h60.SUSPEND;
        }
        return a(i, i2, h60Var);
    }

    public static final void c(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final u92 d(y36 y36Var, e31 e31Var, int i, h60 h60Var) {
        if ((i == 0 || i == -3) && h60Var == h60.SUSPEND) {
            return y36Var;
        }
        return new oj0(i, h60Var, e31Var, y36Var);
    }
}
