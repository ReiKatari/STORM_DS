package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fy2  reason: default package */
/* loaded from: classes.dex */
public final class fy2 {
    public int a;
    public float b;
    public final Object c;

    public fy2(y37 y37Var) {
        this.c = y37Var;
        this.a = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float a(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int i2;
        float i3;
        y37 y37Var = (y37) this.c;
        int i4 = 1;
        if (z) {
            int C = hi2.C(y37Var.f, i, z);
            int lineStart = y37Var.f.getLineStart(C);
            int f = y37Var.f(C);
            if (i == lineStart || i == f) {
                z4 = true;
                int i5 = i * 4;
                if (!z3) {
                    if (z4) {
                        i4 = 0;
                    }
                } else if (z4) {
                    i4 = 2;
                } else {
                    i4 = 3;
                }
                i2 = i5 + i4;
                if (this.a != i2) {
                    return this.b;
                }
                if (z3) {
                    i3 = y37Var.h(i, z);
                } else {
                    i3 = y37Var.i(i, z);
                }
                if (z2) {
                    this.a = i2;
                    this.b = i3;
                }
                return i3;
            }
        }
        z4 = false;
        int i52 = i * 4;
        if (!z3) {
        }
        i2 = i52 + i4;
        if (this.a != i2) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(float f, s41 s41Var) {
        hi5 hi5Var;
        int i;
        if (s41Var instanceof hi5) {
            hi5Var = (hi5) s41Var;
            int i2 = hi5Var.Y;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                hi5Var.Y = i2 - Integer.MIN_VALUE;
                Object obj = hi5Var.R;
                x61 x61Var = x61.COROUTINE_SUSPENDED;
                i = hi5Var.Y;
                if (i == 0) {
                    if (i == 1) {
                        oi2.Y(obj);
                    } else {
                        i.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    oi2.Y(obj);
                    Float f2 = new Float(f);
                    hi5Var.Y = 1;
                    obj = ((qc) this.c).o(f2, hi5Var);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                }
                this.b += ((Number) obj).floatValue();
                return jg7.a;
            }
        }
        hi5Var = new hi5(this, s41Var);
        Object obj2 = hi5Var.R;
        x61 x61Var2 = x61.COROUTINE_SUSPENDED;
        i = hi5Var.Y;
        if (i == 0) {
        }
        this.b += ((Number) obj2).floatValue();
        return jg7.a;
    }

    public fy2(int i, qc qcVar) {
        this.a = i;
        this.c = qcVar;
    }
}
