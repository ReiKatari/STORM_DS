package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vg6  reason: default package */
/* loaded from: classes.dex */
public abstract class vg6 {
    public static final io6 a = ge7.U(RecyclerView.B1, 400.0f, vq7.a, 1);
    public static final tg6 b = new Object();

    /* JADX WARN: Type inference failed for: r0v2, types: [tg6, java.lang.Object] */
    static {
        new ja4();
    }

    public static final void a(a74 a74Var, zv0 zv0Var, px0 px0Var, int i) {
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(646379026);
        int i2 = i | 6;
        if ((i2 & 19) != 18) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i2 & 1, z)) {
            b(n16.I(1948801580, new vz4(zv0Var), xq2Var), xq2Var, 6);
            a74Var = x64.a;
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new pf(a74Var, zv0Var, i);
        }
    }

    public static final void b(zv0 zv0Var, px0 px0Var, int i) {
        boolean z;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(1908320054);
        if ((i & 3) != 2) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i & 1, z)) {
            bl2.d(n16.I(2062852661, new ug6(zv0Var, 0), xq2Var), xq2Var, 6);
        } else {
            xq2Var.V();
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new uz3(zv0Var, i, 1);
        }
    }
}
