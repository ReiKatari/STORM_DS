package d0;

import j0.n2;
import j0.w1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements j0.t1 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3435a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f3436b;

    public /* synthetic */ p0(int i2, Object obj) {
        this.f3435a = i2;
        this.f3436b = obj;
    }

    @Override // j0.t1
    public final void a(w1 w1Var, j0.u1 u1Var) {
        switch (this.f3435a) {
            case 0:
                s0 s0Var = (s0) this.f3436b;
                if (s0Var.c() != null) {
                    i0.e eVar = s0Var.f3464v;
                    eVar.getClass();
                    l0.f.e();
                    eVar.R = true;
                    s0Var.C(true);
                    j0.k kVar = s0Var.f3475h;
                    kVar.getClass();
                    j0.r1 D = s0Var.D(s0Var.e(), (j0.z0) s0Var.f3474g, kVar);
                    s0Var.f3462t = D;
                    ArrayList arrayList = new ArrayList(1);
                    Object obj = new Object[]{D.c()}[0];
                    Objects.requireNonNull(obj);
                    arrayList.add(obj);
                    s0Var.B(Collections.unmodifiableList(arrayList));
                    s0Var.o();
                    i0.e eVar2 = s0Var.f3464v;
                    eVar2.getClass();
                    l0.f.e();
                    eVar2.R = false;
                    eVar2.b();
                    return;
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                f1 f1Var = (f1) this.f3436b;
                if (f1Var.c() != null) {
                    f1Var.D((j0.j1) f1Var.f3474g, f1Var.f3475h);
                    f1Var.o();
                    return;
                }
                return;
            case 2:
                ArrayList arrayList2 = ((j0.v1) this.f3436b).f7312n;
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList2.get(i2);
                    i2++;
                    ((j0.t1) obj2).a(w1Var, u1Var);
                }
                return;
            default:
                w.x0 x0Var = (w.x0) this.f3436b;
                x0Var.f14090c = x0Var.e();
                w.l lVar = (w.l) x0Var.f14093f;
                if (lVar != null) {
                    w.x xVar = lVar.B;
                    try {
                        if (((Boolean) a.a.A(new w.l(xVar, 3)).B.get()).booleanValue()) {
                            w.x0 x0Var2 = xVar.f14083v0;
                            xVar.L.execute(new w.m(xVar, w.x.y(x0Var2), (w1) x0Var2.f14090c, (w.w0) x0Var2.f14091d, null, Collections.singletonList(n2.METERING_REPEATING), 0));
                            return;
                        }
                        return;
                    } catch (InterruptedException | ExecutionException e6) {
                        m9.o.m("Unable to check if MeteringRepeating is attached.", e6);
                        return;
                    }
                }
                return;
        }
    }
}
