package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zw2  reason: default package */
/* loaded from: classes.dex */
public final class zw2 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final yw2 j;
    public boolean k;

    public zw2(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        long j2;
        int i3;
        str = (i2 & 1) != 0 ? "" : str;
        if ((i2 & 32) != 0) {
            j2 = xq0.h;
        } else {
            j2 = j;
        }
        if ((i2 & 64) != 0) {
            i3 = 5;
        } else {
            i3 = i;
        }
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = f4;
        this.f = j2;
        this.g = i3;
        this.h = z;
        ArrayList arrayList = new ArrayList();
        this.i = arrayList;
        yw2 yw2Var = new yw2(null, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, RecyclerView.A1, null, 1023);
        this.j = yw2Var;
        arrayList.add(yw2Var);
    }

    public static void a(zw2 zw2Var, ArrayList arrayList, int i, mb6 mb6Var) {
        if (zw2Var.k) {
            mz2.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ArrayList arrayList2 = zw2Var.i;
        ((yw2) arrayList2.get(arrayList2.size() - 1)).j.add(new i77("", arrayList, i, mb6Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, RecyclerView.A1, 1.0f, RecyclerView.A1));
    }

    public final ax2 b() {
        if (this.k) {
            mz2.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() > 1) {
                if (this.k) {
                    mz2.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                }
                yw2 yw2Var = (yw2) arrayList.remove(arrayList.size() - 1);
                ((yw2) arrayList.get(arrayList.size() - 1)).j.add(new e77(yw2Var.a, yw2Var.b, yw2Var.c, yw2Var.d, yw2Var.e, yw2Var.f, yw2Var.g, yw2Var.h, yw2Var.i, yw2Var.j));
            } else {
                yw2 yw2Var2 = this.j;
                ax2 ax2Var = new ax2(this.a, this.b, this.c, this.d, this.e, new e77(yw2Var2.a, yw2Var2.b, yw2Var2.c, yw2Var2.d, yw2Var2.e, yw2Var2.f, yw2Var2.g, yw2Var2.h, yw2Var2.i, yw2Var2.j), this.f, this.g, this.h);
                this.k = true;
                return ax2Var;
            }
        }
    }
}
