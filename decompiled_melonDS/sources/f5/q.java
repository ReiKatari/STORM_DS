package f5;

import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class q {

    /* renamed from: f  reason: collision with root package name */
    public static int f4883f;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f4884a;

    /* renamed from: b  reason: collision with root package name */
    public int f4885b;

    /* renamed from: c  reason: collision with root package name */
    public int f4886c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f4887d;

    /* renamed from: e  reason: collision with root package name */
    public int f4888e;

    public final void a(ArrayList arrayList) {
        int size = this.f4884a.size();
        if (this.f4888e != -1 && size > 0) {
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                q qVar = (q) arrayList.get(i2);
                if (this.f4888e == qVar.f4885b) {
                    c(this.f4886c, qVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int b(c5.c cVar, int i2) {
        int n10;
        int n11;
        ArrayList arrayList = this.f4884a;
        if (arrayList.size() == 0) {
            return 0;
        }
        e5.h hVar = (e5.h) ((e5.g) arrayList.get(0)).U;
        cVar.t();
        hVar.b(cVar, false);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            ((e5.g) arrayList.get(i10)).b(cVar, false);
        }
        if (i2 == 0 && hVar.C0 > 0) {
            e5.n.a(hVar, cVar, arrayList, 0);
        }
        if (i2 == 1 && hVar.D0 > 0) {
            e5.n.a(hVar, cVar, arrayList, 1);
        }
        try {
            cVar.p();
        } catch (Exception e6) {
            System.err.println(e6.toString() + "\n" + Arrays.toString(e6.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.f4887d = new ArrayList();
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            e5.g gVar = (e5.g) arrayList.get(i11);
            Object obj = new Object();
            new WeakReference(gVar);
            c5.c.n(gVar.I);
            c5.c.n(gVar.J);
            c5.c.n(gVar.K);
            c5.c.n(gVar.L);
            c5.c.n(gVar.M);
            this.f4887d.add(obj);
        }
        if (i2 == 0) {
            n10 = c5.c.n(hVar.I);
            n11 = c5.c.n(hVar.K);
            cVar.t();
        } else {
            n10 = c5.c.n(hVar.J);
            n11 = c5.c.n(hVar.L);
            cVar.t();
        }
        return n11 - n10;
    }

    public final void c(int i2, q qVar) {
        int i10 = qVar.f4885b;
        ArrayList arrayList = this.f4884a;
        int size = arrayList.size();
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            e5.g gVar = (e5.g) obj;
            ArrayList arrayList2 = qVar.f4884a;
            if (!arrayList2.contains(gVar)) {
                arrayList2.add(gVar);
            }
            if (i2 == 0) {
                gVar.f4321r0 = i10;
            } else {
                gVar.f4323s0 = i10;
            }
        }
        this.f4888e = i10;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        int i2 = this.f4886c;
        if (i2 == 0) {
            str = "Horizontal";
        } else if (i2 == 1) {
            str = "Vertical";
        } else if (i2 == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb2.append(str);
        sb2.append(" [");
        String q10 = w.d.q(sb2, this.f4885b, "] <");
        ArrayList arrayList = this.f4884a;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            q10 = q10 + " " + ((e5.g) obj).f4307j0;
        }
        return q10.concat(" >");
    }
}
