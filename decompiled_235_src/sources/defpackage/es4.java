package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: es4  reason: default package */
/* loaded from: classes.dex */
public abstract class es4 {
    public static final long a;
    public static final /* synthetic */ int b = 0;

    static {
        y47[] y47VarArr = x47.b;
        a = x47.c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (defpackage.x47.a(r3, r17.c) != false) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ds4 a(ds4 ds4Var, int i, int i2, long j, g37 g37Var, ux4 ux4Var, xu3 xu3Var, int i3, int i4, i47 i47Var) {
        long j2;
        int i5 = i;
        int i6 = i2;
        long j3 = j;
        g37 g37Var2 = g37Var;
        ux4 ux4Var2 = ux4Var;
        xu3 xu3Var2 = xu3Var;
        int i7 = i3;
        int i8 = i4;
        i47 i47Var2 = i47Var;
        if (i5 == 0 || i5 == ds4Var.a) {
            y47[] y47VarArr = x47.b;
            if ((j3 & 1095216660480L) == 0) {
                j2 = 0;
            } else {
                j2 = 0;
            }
            if ((g37Var2 == null || g37Var2.equals(ds4Var.d)) && ((i6 == 0 || i6 == ds4Var.b) && ((ux4Var2 == null || ux4Var2.equals(ds4Var.e)) && ((xu3Var2 == null || xu3Var2.equals(ds4Var.f)) && ((i7 == 0 || i7 == ds4Var.g) && ((i8 == 0 || i8 == ds4Var.h) && (i47Var2 == null || i47Var2.equals(ds4Var.i)))))))) {
                return ds4Var;
            }
        } else {
            j2 = 0;
        }
        y47[] y47VarArr2 = x47.b;
        if ((j3 & 1095216660480L) == j2) {
            j3 = ds4Var.c;
        }
        if (g37Var2 == null) {
            g37Var2 = ds4Var.d;
        }
        if (i5 == 0) {
            i5 = ds4Var.a;
        }
        if (i6 == 0) {
            i6 = ds4Var.b;
        }
        ux4 ux4Var3 = ds4Var.e;
        if (ux4Var3 != null && ux4Var2 == null) {
            ux4Var2 = ux4Var3;
        }
        if (xu3Var2 == null) {
            xu3Var2 = ds4Var.f;
        }
        if (i7 == 0) {
            i7 = ds4Var.g;
        }
        if (i8 == 0) {
            i8 = ds4Var.h;
        }
        if (i47Var2 == null) {
            i47Var2 = ds4Var.i;
        }
        return new ds4(i5, i6, j3, g37Var2, ux4Var2, xu3Var2, i7, i8, i47Var2);
    }
}
