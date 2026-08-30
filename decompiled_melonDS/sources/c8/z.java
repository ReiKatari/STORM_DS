package c8;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class z extends t {
    public int A0;
    public t[] D0;

    /* renamed from: y0  reason: collision with root package name */
    public ArrayList f2722y0 = new ArrayList();

    /* renamed from: z0  reason: collision with root package name */
    public boolean f2723z0 = true;
    public boolean B0 = false;
    public int C0 = 0;

    @Override // c8.t
    public final void B(View view) {
        super.B(view);
        int size = this.f2722y0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((t) this.f2722y0.get(i2)).B(view);
        }
    }

    @Override // c8.t
    public final void C() {
        this.f2712r0 = 0L;
        y yVar = new y(this, 0);
        for (int i2 = 0; i2 < this.f2722y0.size(); i2++) {
            t tVar = (t) this.f2722y0.get(i2);
            tVar.a(yVar);
            tVar.C();
            long j2 = tVar.f2712r0;
            boolean z10 = this.f2723z0;
            long j10 = this.f2712r0;
            if (z10) {
                this.f2712r0 = Math.max(j10, j2);
            } else {
                tVar.f2714t0 = j10;
                this.f2712r0 = j10 + j2;
            }
        }
    }

    @Override // c8.t
    public final t D(r rVar) {
        super.D(rVar);
        return this;
    }

    @Override // c8.t
    public final void E(View view) {
        for (int i2 = 0; i2 < this.f2722y0.size(); i2++) {
            ((t) this.f2722y0.get(i2)).E(view);
        }
        this.Y.remove(view);
    }

    @Override // c8.t
    public final void F(View view) {
        super.F(view);
        t[] tVarArr = this.D0;
        this.D0 = null;
        if (tVarArr == null) {
            tVarArr = new t[this.f2722y0.size()];
        }
        t[] tVarArr2 = (t[]) this.f2722y0.toArray(tVarArr);
        int size = this.f2722y0.size();
        for (int i2 = 0; i2 < size; i2++) {
            tVarArr2[i2].F(view);
        }
        Arrays.fill(tVarArr2, (Object) null);
        this.D0 = tVarArr2;
    }

    @Override // c8.t
    public final void G() {
        ArrayList arrayList;
        if (this.f2722y0.isEmpty()) {
            O();
            p();
            return;
        }
        y yVar = new y();
        yVar.f2721b = this;
        ArrayList arrayList2 = this.f2722y0;
        int size = arrayList2.size();
        int i2 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ((t) obj).a(yVar);
        }
        this.A0 = this.f2722y0.size();
        if (!this.f2723z0) {
            int i11 = 1;
            while (true) {
                int size2 = this.f2722y0.size();
                arrayList = this.f2722y0;
                if (i11 >= size2) {
                    break;
                }
                ((t) arrayList.get(i11 - 1)).a(new y((t) this.f2722y0.get(i11), 2));
                i11++;
            }
            t tVar = (t) arrayList.get(0);
            if (tVar != null) {
                tVar.G();
                return;
            }
            return;
        }
        ArrayList arrayList3 = this.f2722y0;
        int size3 = arrayList3.size();
        while (i2 < size3) {
            Object obj2 = arrayList3.get(i2);
            i2++;
            ((t) obj2).G();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:55:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    @Override // c8.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void H(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c8.z.H(long, long):void");
    }

    @Override // c8.t
    public final void I(long j2) {
        ArrayList arrayList;
        this.L = j2;
        if (j2 >= 0 && (arrayList = this.f2722y0) != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((t) this.f2722y0.get(i2)).I(j2);
            }
        }
    }

    @Override // c8.t
    public final void J(k0.d dVar) {
        this.p0 = dVar;
        this.C0 |= 8;
        int size = this.f2722y0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((t) this.f2722y0.get(i2)).J(dVar);
        }
    }

    @Override // c8.t
    public final void K(TimeInterpolator timeInterpolator) {
        this.C0 |= 1;
        ArrayList arrayList = this.f2722y0;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((t) this.f2722y0.get(i2)).K(timeInterpolator);
            }
        }
        this.R = timeInterpolator;
    }

    @Override // c8.t
    public final void L(na.f fVar) {
        super.L(fVar);
        this.C0 |= 4;
        if (this.f2722y0 != null) {
            for (int i2 = 0; i2 < this.f2722y0.size(); i2++) {
                ((t) this.f2722y0.get(i2)).L(fVar);
            }
        }
    }

    @Override // c8.t
    public final void M() {
        this.C0 |= 2;
        int size = this.f2722y0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((t) this.f2722y0.get(i2)).M();
        }
    }

    @Override // c8.t
    public final void N(long j2) {
        this.B = j2;
    }

    @Override // c8.t
    public final String P(String str) {
        String P = super.P(str);
        for (int i2 = 0; i2 < this.f2722y0.size(); i2++) {
            P = P + "\n" + ((t) this.f2722y0.get(i2)).P(str.concat("  "));
        }
        return P;
    }

    public final void Q(t tVar) {
        this.f2722y0.add(tVar);
        tVar.f2698c0 = this;
        long j2 = this.L;
        if (j2 >= 0) {
            tVar.I(j2);
        }
        if ((this.C0 & 1) != 0) {
            tVar.K(this.R);
        }
        if ((this.C0 & 2) != 0) {
            tVar.M();
        }
        if ((this.C0 & 4) != 0) {
            tVar.L(this.f2711q0);
        }
        if ((this.C0 & 8) != 0) {
            tVar.J(this.p0);
        }
    }

    public final t R(int i2) {
        if (i2 >= 0 && i2 < this.f2722y0.size()) {
            return (t) this.f2722y0.get(i2);
        }
        return null;
    }

    @Override // c8.t
    public final void b(View view) {
        for (int i2 = 0; i2 < this.f2722y0.size(); i2++) {
            ((t) this.f2722y0.get(i2)).b(view);
        }
        this.Y.add(view);
    }

    @Override // c8.t
    public final void cancel() {
        super.cancel();
        t[] tVarArr = this.D0;
        this.D0 = null;
        if (tVarArr == null) {
            tVarArr = new t[this.f2722y0.size()];
        }
        t[] tVarArr2 = (t[]) this.f2722y0.toArray(tVarArr);
        int size = this.f2722y0.size();
        for (int i2 = 0; i2 < size; i2++) {
            tVarArr2[i2].cancel();
        }
        Arrays.fill(tVarArr2, (Object) null);
        this.D0 = tVarArr2;
    }

    @Override // c8.t
    public final void e(b0 b0Var) {
        View view = b0Var.f2621b;
        if (y(view)) {
            ArrayList arrayList = this.f2722y0;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                t tVar = (t) obj;
                if (tVar.y(view)) {
                    tVar.e(b0Var);
                    b0Var.f2622c.add(tVar);
                }
            }
        }
    }

    @Override // c8.t
    public final void g(b0 b0Var) {
        int size = this.f2722y0.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((t) this.f2722y0.get(i2)).g(b0Var);
        }
    }

    @Override // c8.t
    public final void h(b0 b0Var) {
        View view = b0Var.f2621b;
        if (y(view)) {
            ArrayList arrayList = this.f2722y0;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                t tVar = (t) obj;
                if (tVar.y(view)) {
                    tVar.h(b0Var);
                    b0Var.f2622c.add(tVar);
                }
            }
        }
    }

    @Override // c8.t
    /* renamed from: l */
    public final t clone() {
        z zVar = (z) super.clone();
        zVar.f2722y0 = new ArrayList();
        int size = this.f2722y0.size();
        for (int i2 = 0; i2 < size; i2++) {
            t clone = ((t) this.f2722y0.get(i2)).clone();
            zVar.f2722y0.add(clone);
            clone.f2698c0 = zVar;
        }
        return zVar;
    }

    @Override // c8.t
    public final void o(ViewGroup viewGroup, b9.e eVar, b9.e eVar2, ArrayList arrayList, ArrayList arrayList2) {
        long j2 = this.B;
        int size = this.f2722y0.size();
        for (int i2 = 0; i2 < size; i2++) {
            t tVar = (t) this.f2722y0.get(i2);
            if (j2 > 0 && (this.f2723z0 || i2 == 0)) {
                long j10 = tVar.B;
                if (j10 > 0) {
                    tVar.N(j10 + j2);
                } else {
                    tVar.N(j2);
                }
            }
            tVar.o(viewGroup, eVar, eVar2, arrayList, arrayList2);
        }
    }

    @Override // c8.t
    public final boolean v() {
        for (int i2 = 0; i2 < this.f2722y0.size(); i2++) {
            if (((t) this.f2722y0.get(i2)).v()) {
                return true;
            }
        }
        return false;
    }

    @Override // c8.t
    public final boolean w() {
        int size = this.f2722y0.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (!((t) this.f2722y0.get(i2)).w()) {
                return false;
            }
        }
        return true;
    }
}
