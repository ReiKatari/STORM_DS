package y2;

import android.app.RemoteAction;
import android.view.textclassifier.TextClassification;
import androidx.lifecycle.s0;
import cd.q1;
import h1.x2;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import mc.p;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.romdetails.RomDetailsActivity;
import n2.f1;
import n2.m;
import n2.r;
import n2.w0;
import p7.t;
import yb.y;
import z2.n;
import zb.l;
import zc.x;
import zh.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements p {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ b(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        CharSequence label;
        CharSequence title;
        Collection e02;
        int i2 = this.A;
        y yVar = y.f14813a;
        Object obj3 = this.B;
        switch (i2) {
            case 0:
                j jVar = (j) obj3;
                c cVar = (c) obj;
                w0 w0Var = (w0) obj2;
                if (w0Var instanceof n) {
                    n nVar = (n) w0Var;
                    Object d4 = jVar.d(cVar, nVar.getValue());
                    if (d4 == null) {
                        return null;
                    }
                    n2.e d10 = nVar.d();
                    d10.getClass();
                    return new f1(d4, d10);
                }
                a0.j.h("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                return null;
            case DSiCameraSource.FrontCamera /* 1 */:
                String str = (String) obj;
                String str2 = (String) obj2;
                int i10 = RomDetailsActivity.f9566z0;
                str.getClass();
                str2.getClass();
                yh.e eVar = (yh.e) ((RomDetailsActivity) obj3).f9571y0.getValue();
                q1 q1Var = eVar.f12533d;
                q1Var.getClass();
                q1Var.k(null, u.f15139a);
                x.v(s0.h(eVar), null, null, new x2(eVar, str, str2, null, 18), 3);
                return yVar;
            case 2:
                ((Integer) obj2).getClass();
                r rVar = (r) ((m) obj);
                rVar.X(666084174);
                String str3 = ((x1.d) obj3).f14325b;
                rVar.p(false);
                return str3;
            case 3:
                ((Integer) obj2).getClass();
                r rVar2 = (r) ((m) obj);
                rVar2.X(950061013);
                label = ((TextClassification) obj3).getLabel();
                String valueOf = String.valueOf(label);
                rVar2.p(false);
                return valueOf;
            case 4:
                ((Integer) obj2).getClass();
                r rVar3 = (r) ((m) obj);
                rVar3.X(-1376593684);
                title = ((RemoteAction) obj3).getTitle();
                String obj4 = title.toString();
                rVar3.p(false);
                return obj4;
            default:
                z2.u uVar = (z2.u) obj3;
                Collection collection = (Set) obj;
                z2.f fVar = (z2.f) obj2;
                AtomicReference atomicReference = uVar.f14946b;
                while (true) {
                    Object obj5 = atomicReference.get();
                    if (obj5 == null) {
                        e02 = collection;
                    } else if (obj5 instanceof Set) {
                        e02 = t.y(obj5, collection);
                    } else if (obj5 instanceof List) {
                        e02 = l.e0((Collection) obj5, t.x(collection));
                    } else {
                        n2.t.b("Unexpected notification");
                        wa.b.a();
                        return null;
                    }
                    while (!atomicReference.compareAndSet(obj5, e02)) {
                        if (atomicReference.get() != obj5) {
                            break;
                        }
                    }
                    if (uVar.b()) {
                        uVar.f14945a.k(new kf.s0(28, uVar));
                        return yVar;
                    }
                    return yVar;
                }
        }
    }
}
