package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wj6  reason: default package */
/* loaded from: classes.dex */
public final class wj6 {
    public final int a;
    public final Matrix b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final jx g;
    public int h;
    public int i;
    public hk6 k;
    public vj6 l;
    public boolean j = false;
    public final HashSet m = new HashSet();
    public boolean n = false;
    public final ArrayList o = new ArrayList();

    public wj6(int i, int i2, jx jxVar, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.f = i;
        this.a = i2;
        this.g = jxVar;
        this.b = matrix;
        this.c = z;
        this.d = rect;
        this.i = i3;
        this.h = i4;
        this.e = z2;
        this.l = new vj6(i2, jxVar.a);
    }

    public final void a() {
        nl2.D("Edge is already closed.", !this.n);
    }

    public final void b() {
        nk2.s();
        this.l.a();
        this.n = true;
        this.o.clear();
        this.m.clear();
    }

    public final hk6 c(boolean z) {
        nk2.s();
        a();
        jx jxVar = this.g;
        hk6 hk6Var = new hk6(jxVar.a, z, jxVar.c, new qj6(this, 0));
        try {
            kx2 kx2Var = hk6Var.j;
            vj6 vj6Var = this.l;
            Objects.requireNonNull(vj6Var);
            if (vj6Var.g(kx2Var, new rj6(vj6Var, 0))) {
                jv3.N(vj6Var.e).a(new sj6(kx2Var, 0), iq2.l());
            }
            this.k = hk6Var;
            e();
            return hk6Var;
        } catch (gc1 e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            hk6Var.b();
            throw e2;
        }
    }

    public final void d() {
        boolean z;
        nk2.s();
        a();
        vj6 vj6Var = this.l;
        vj6Var.getClass();
        nk2.s();
        if (vj6Var.p == null) {
            synchronized (vj6Var.a) {
                z = vj6Var.c;
            }
            if (!z) {
                return;
            }
        }
        this.j = false;
        this.l.a();
        this.l = new vj6(this.a, this.g.a);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void e() {
        hi0 hi0Var;
        np2 np2Var;
        nk2.s();
        nx nxVar = new nx(this.d, this.i, this.h, this.c, this.b, this.e);
        hk6 hk6Var = this.k;
        int i = 0;
        if (hk6Var != null) {
            synchronized (hk6Var.a) {
                hk6Var.k = nxVar;
                hi0Var = hk6Var.l;
                np2Var = hk6Var.m;
            }
            if (hi0Var != null && np2Var != null) {
                np2Var.execute(new ek6(hi0Var, nxVar, 0));
            }
        }
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((wz0) obj).accept(nxVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SurfaceEdge{targets=");
        sb.append(this.f);
        sb.append(", format=");
        sb.append(this.a);
        sb.append(", resolution=");
        sb.append(this.g.a);
        sb.append(", cropRect=");
        sb.append(this.d);
        sb.append(", rotationDegrees=");
        sb.append(this.i);
        sb.append(", mirroring=");
        sb.append(this.e);
        sb.append(", sensorToBufferTransform= ");
        Matrix matrix = this.b;
        sb.append(matrix);
        sb.append(", rotationInTransform= ");
        sb.append(tw6.b(matrix));
        sb.append(", isMirrorInTransform= ");
        sb.append(tw6.e(matrix));
        sb.append(", isClosed=");
        return ej6.h(sb, this.n, '}');
    }
}
