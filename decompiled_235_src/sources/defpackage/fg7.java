package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fg7  reason: default package */
/* loaded from: classes.dex */
public final class fg7 {
    public rr6 a;
    public rr6 b;
    public int c;
    public Long d;
    public boolean e;

    /* JADX WARN: Removed duplicated region for block: B:34:0x0071 A[LOOP:0: B:28:0x0061->B:34:0x0071, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076 A[EDGE_INSN: B:38:0x0076->B:35:0x0076 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(c37 c37Var) {
        c37 c37Var2;
        String str;
        rr6 rr6Var;
        rr6 rr6Var2;
        c37 c37Var3;
        this.e = false;
        rr6 rr6Var3 = this.a;
        if (rr6Var3 != null) {
            c37Var2 = (c37) rr6Var3.L;
        } else {
            c37Var2 = null;
        }
        if (!nb3.k(c37Var, c37Var2)) {
            String str2 = c37Var.a.B;
            rr6 rr6Var4 = this.a;
            if (rr6Var4 != null && (c37Var3 = (c37) rr6Var4.L) != null) {
                str = c37Var3.a.B;
            } else {
                str = null;
            }
            boolean k = nb3.k(str2, str);
            rr6 rr6Var5 = this.a;
            if (k) {
                if (rr6Var5 != null) {
                    rr6Var5.L = c37Var;
                    return;
                }
                return;
            }
            this.a = new rr6(8, rr6Var5, c37Var);
            this.b = null;
            int length = c37Var.a.B.length() + this.c;
            this.c = length;
            if (length > 100000) {
                rr6 rr6Var6 = this.a;
                if (rr6Var6 != null) {
                    rr6Var = (rr6) rr6Var6.B;
                } else {
                    rr6Var = null;
                }
                if (rr6Var != null) {
                    while (true) {
                        if (rr6Var6 != null) {
                            rr6 rr6Var7 = (rr6) rr6Var6.B;
                            if (rr6Var7 != null) {
                                rr6Var2 = (rr6) rr6Var7.B;
                                if (rr6Var2 != null) {
                                    break;
                                }
                                rr6Var6 = (rr6) rr6Var6.B;
                            }
                        }
                        rr6Var2 = null;
                        if (rr6Var2 != null) {
                        }
                    }
                    if (rr6Var6 != null) {
                        rr6Var6.B = null;
                    }
                }
            }
        }
    }
}
