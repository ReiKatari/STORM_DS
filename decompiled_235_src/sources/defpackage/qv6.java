package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qv6  reason: default package */
/* loaded from: classes.dex */
public final class qv6 {
    public final int a;
    public final Matrix b;
    public final boolean c;
    public final Rect d;
    public final boolean e;
    public final int f;
    public final yy g;
    public int h;
    public int i;
    public bw6 k;
    public pv6 l;
    public boolean j = false;
    public final HashSet m = new HashSet();
    public boolean n = false;
    public final ArrayList o = new ArrayList();

    public qv6(int i, int i2, yy yyVar, Matrix matrix, boolean z, Rect rect, int i3, int i4, boolean z2) {
        this.f = i;
        this.a = i2;
        this.g = yyVar;
        this.b = matrix;
        this.c = z;
        this.d = rect;
        this.i = i3;
        this.h = i4;
        this.e = z2;
        this.l = new pv6(i2, yyVar.a);
    }

    public final void a() {
        np2.A("Edge is already closed.", !this.n);
    }

    public final void b() {
        nj2.h();
        this.l.a();
        this.n = true;
        this.o.clear();
        this.m.clear();
    }

    public final bw6 c(boolean z) {
        nj2.h();
        a();
        yy yyVar = this.g;
        bw6 bw6Var = new bw6(yyVar.a, z, yyVar.c, new kv6(this, 0));
        try {
            o33 o33Var = bw6Var.j;
            pv6 pv6Var = this.l;
            Objects.requireNonNull(pv6Var);
            if (pv6Var.g(o33Var, new lv6(pv6Var, 0))) {
                l.F(pv6Var.e).a(u24.j(), new mv6(o33Var, 0));
            }
            this.k = bw6Var;
            e();
            return bw6Var;
        } catch (hg1 e) {
            throw new AssertionError("Surface is somehow already closed", e);
        } catch (RuntimeException e2) {
            bw6Var.b();
            throw e2;
        }
    }

    public final void d() {
        boolean z;
        nj2.h();
        a();
        pv6 pv6Var = this.l;
        pv6Var.getClass();
        nj2.h();
        if (pv6Var.p == null) {
            synchronized (pv6Var.a) {
                z = pv6Var.c;
            }
            if (!z) {
                return;
            }
        }
        this.j = false;
        this.l.a();
        this.l = new pv6(this.a, this.g.a);
        Iterator it = this.m.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    public final void e() {
        pk0 pk0Var;
        ov2 ov2Var;
        nj2.h();
        cz czVar = new cz(this.d, this.i, this.h, this.c, this.b, this.e);
        bw6 bw6Var = this.k;
        int i = 0;
        if (bw6Var != null) {
            synchronized (bw6Var.a) {
                bw6Var.k = czVar;
                pk0Var = bw6Var.l;
                ov2Var = bw6Var.m;
            }
            if (pk0Var != null && ov2Var != null) {
                ov2Var.execute(new yv6(pk0Var, czVar, 0));
            }
        }
        ArrayList arrayList = this.o;
        int size = arrayList.size();
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((b31) obj).accept(czVar);
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
        sb.append(k97.b(matrix));
        sb.append(", isMirrorInTransform= ");
        sb.append(k97.e(matrix));
        sb.append(", isClosed=");
        return xg6.r(sb, this.n, '}');
    }
}
