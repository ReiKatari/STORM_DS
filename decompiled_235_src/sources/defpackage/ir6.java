package defpackage;

import android.util.Size;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ir6  reason: default package */
/* loaded from: classes.dex */
public final class ir6 {
    public final int a;
    public final Size b;
    public final int c;
    public final String d;
    public final rp4 e;
    public final qp4 f;
    public final sp4 g;
    public final vs0 h;
    public final tp4 i;
    public ki0 j;

    public ir6(int i, int i2, vs0 vs0Var, qp4 qp4Var, rp4 rp4Var, sp4 sp4Var, tp4 tp4Var, Size size, String str) {
        size.getClass();
        str.getClass();
        this.a = i;
        this.b = size;
        this.c = i2;
        this.d = str;
        this.e = rp4Var;
        this.f = qp4Var;
        this.g = sp4Var;
        this.h = vs0Var;
        this.i = tp4Var;
    }

    public final boolean a() {
        tp4 tp4Var;
        sp4 sp4Var = this.g;
        if (sp4Var != null) {
            long j = sp4Var.a;
            if (!sp4.a(j, 0L) && !sp4.a(j, 1L) && !sp4.a(j, 3L) && (tp4Var = this.i) != null) {
                long j2 = tp4Var.a;
                if (!tp4.a(j2, 0L) && !tp4.a(j2, 1L)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final String toString() {
        return lb1.g(this.a, "Output-");
    }
}
