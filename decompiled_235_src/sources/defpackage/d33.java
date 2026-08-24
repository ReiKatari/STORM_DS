package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d33  reason: default package */
/* loaded from: classes.dex */
public final class d33 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final int g;
    public final boolean h;
    public final ArrayList i;
    public final c33 j;
    public boolean k;

    public d33(String str, float f, float f2, float f3, float f4, long j, int i, boolean z, int i2) {
        long j2;
        int i3;
        str = (i2 & 1) != 0 ? "" : str;
        if ((i2 & 32) != 0) {
            j2 = kt0.h;
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
        c33 c33Var = new c33(null, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, RecyclerView.B1, null, 1023);
        this.j = c33Var;
        arrayList.add(c33Var);
    }

    public static void a(d33 d33Var, ArrayList arrayList, int i, cn6 cn6Var) {
        if (d33Var.k) {
            p53.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        ArrayList arrayList2 = d33Var.i;
        ((c33) arrayList2.get(arrayList2.size() - 1)).j.add(new hl7("", arrayList, i, cn6Var, 1.0f, null, 1.0f, 1.0f, 0, 2, 1.0f, RecyclerView.B1, 1.0f, RecyclerView.B1));
    }

    public final e33 b() {
        if (this.k) {
            p53.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
        }
        while (true) {
            ArrayList arrayList = this.i;
            if (arrayList.size() > 1) {
                if (this.k) {
                    p53.c("ImageVector.Builder is single use, create a new instance to create a new ImageVector");
                }
                c33 c33Var = (c33) arrayList.remove(arrayList.size() - 1);
                ((c33) arrayList.get(arrayList.size() - 1)).j.add(new dl7(c33Var.a, c33Var.b, c33Var.c, c33Var.d, c33Var.e, c33Var.f, c33Var.g, c33Var.h, c33Var.i, c33Var.j));
            } else {
                c33 c33Var2 = this.j;
                e33 e33Var = new e33(this.a, this.b, this.c, this.d, this.e, new dl7(c33Var2.a, c33Var2.b, c33Var2.c, c33Var2.d, c33Var2.e, c33Var2.f, c33Var2.g, c33Var2.h, c33Var2.i, c33Var2.j), this.f, this.g, this.h);
                this.k = true;
                return e33Var;
            }
        }
    }
}
