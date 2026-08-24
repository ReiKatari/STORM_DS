package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pf6 */
/* loaded from: classes.dex */
public abstract class pf6 {
    public static final gr1 a = new gr1("NO_VALUE", 9);

    public static final of6 a(int i, int i2, m80 m80Var) {
        if (i >= 0) {
            if (i2 >= 0) {
                if (i <= 0 && i2 <= 0 && m80Var != m80.SUSPEND) {
                    u34.w(m80Var, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
                    return null;
                }
                int i3 = i2 + i;
                if (i3 < 0) {
                    i3 = Integer.MAX_VALUE;
                }
                return new of6(i, i3, m80Var);
            }
            i.f(lb1.g(i2, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        i.f(lb1.g(i, "replay cannot be negative, but was "));
        return null;
    }

    public static /* synthetic */ of6 b(int i, int i2, m80 m80Var, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            m80Var = m80.SUSPEND;
        }
        return a(i, i2, m80Var);
    }

    public static final void c(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }

    public static final le2 d(kf6 kf6Var, l61 l61Var, int i, m80 m80Var) {
        if ((i == 0 || i == -3) && m80Var == m80.SUSPEND) {
            return kf6Var;
        }
        return new xl0(i, m80Var, l61Var, kf6Var);
    }
}
