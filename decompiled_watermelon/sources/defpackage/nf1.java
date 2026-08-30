package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: nf1  reason: default package */
/* loaded from: classes.dex */
public class nf1 extends yd1 {
    public int m;

    public nf1(be7 be7Var) {
        super(be7Var);
        if (be7Var instanceof ks2) {
            this.e = xd1.HORIZONTAL_DIMENSION;
        } else {
            this.e = xd1.VERTICAL_DIMENSION;
        }
    }

    @Override // defpackage.yd1
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
                ud1 ud1Var = (ud1) obj;
                ud1Var.a(ud1Var);
            }
        }
    }
}
