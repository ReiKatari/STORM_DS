package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ly6  reason: default package */
/* loaded from: classes.dex */
public abstract class ly6 {
    static {
        ge7.Y(250, 0, ir1.a, 2);
    }

    public static final void a(final int i, a74 a74Var, final long j, final long j2, fo2 fo2Var, eo2 eo2Var, final zv0 zv0Var, px0 px0Var, final int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        final a74 a74Var2;
        final fo2 fo2Var2;
        final eo2 eo2Var2;
        zv0 I;
        zv0 zv0Var2;
        x64 x64Var;
        xq2 xq2Var = (xq2) px0Var;
        xq2Var.d0(113221600);
        if (xq2Var.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i2 | i3 | 48;
        if (xq2Var.e(j)) {
            i4 = 256;
        } else {
            i4 = 128;
        }
        int i7 = i6 | i4;
        if (xq2Var.e(j2)) {
            i5 = 2048;
        } else {
            i5 = 1024;
        }
        int i8 = i7 | i5 | 221184;
        if ((599187 & i8) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (xq2Var.S(i8 & 1, z)) {
            xq2Var.X();
            if ((i2 & 1) != 0 && !xq2Var.B()) {
                xq2Var.V();
                x64Var = a74Var;
                I = fo2Var;
                zv0Var2 = eo2Var;
            } else {
                I = n16.I(1896966245, new fo2() { // from class: hy6
                    @Override // defpackage.fo2
                    public final Object e(Object obj, Object obj2, Object obj3) {
                        ((Integer) obj3).getClass();
                        vs0.w0.l(new nx0(new ov4((fy6) ((List) obj).get(i), 15)), RecyclerView.B1, 0L, (px0) obj2, 3072);
                        return jg7.a;
                    }
                }, xq2Var);
                zv0Var2 = nc1.g;
                x64Var = x64.a;
            }
            xq2Var.q();
            ej2.c(ua6.a(x64Var, false, new r76(2)), null, j, j2, RecyclerView.B1, n16.I(-638448612, new iy6(zv0Var, zv0Var2, I, 0), xq2Var), xq2Var, (i8 & 896) | 1572864 | (i8 & 7168), 50);
            a74Var2 = x64Var;
            fo2Var2 = I;
            eo2Var2 = zv0Var2;
        } else {
            xq2Var.V();
            a74Var2 = a74Var;
            fo2Var2 = fo2Var;
            eo2Var2 = eo2Var;
        }
        cf5 t = xq2Var.t();
        if (t != null) {
            t.d = new eo2(i, a74Var2, j, j2, fo2Var2, eo2Var2, zv0Var, i2) { // from class: jy6
                public final /* synthetic */ int A;
                public final /* synthetic */ a74 B;
                public final /* synthetic */ long L;
                public final /* synthetic */ long R;
                public final /* synthetic */ fo2 X;
                public final /* synthetic */ eo2 Y;
                public final /* synthetic */ zv0 Z;

                @Override // defpackage.eo2
                public final Object o(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int a0 = ii2.a0(1572865);
                    ly6.a(this.A, this.B, this.L, this.R, this.X, this.Y, this.Z, (px0) obj, a0);
                    return jg7.a;
                }
            };
        }
    }
}
