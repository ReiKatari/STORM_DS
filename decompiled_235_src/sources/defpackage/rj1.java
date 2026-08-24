package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rj1  reason: default package */
/* loaded from: classes.dex */
public class rj1 extends ci1 {
    public int m;

    public rj1(ct7 ct7Var) {
        super(ct7Var);
        if (ct7Var instanceof ly2) {
            this.e = bi1.HORIZONTAL_DIMENSION;
        } else {
            this.e = bi1.VERTICAL_DIMENSION;
        }
    }

    @Override // defpackage.ci1
    public final void d(int i) {
        if (!this.j) {
            this.j = true;
            this.g = i;
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                xh1 xh1Var = (xh1) obj;
                xh1Var.a(xh1Var);
            }
        }
    }
}
