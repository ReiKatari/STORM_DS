package g2;

import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.annotation.Annotation;
import li.a;
import li.b;
import li.d;
import li.e;
import li.f;
import li.k;
import me.magnum.melonds.common.camera.DSiCameraSource;
import mf.a;
import mf.b;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class v3 implements mc.a {
    public final /* synthetic */ int A;

    @Override // mc.a
    public final Object b() {
        j8.e eVar;
        WindowLayoutComponent a10;
        Object obj;
        switch (this.A) {
            case 0:
                return new u3();
            case DSiCameraSource.FrontCamera /* 1 */:
                return g7.f5160a;
            case 2:
                return new f7(null, null, 16383);
            case 3:
                n2.b0 b0Var = g7.a.f5602a;
                return null;
            case 4:
                return new nd.d(gf.a.f5657a, 0);
            case l1.c.f8511g /* 5 */:
                qc.a aVar = qc.d.A;
                return Integer.valueOf(qc.d.A.e().nextInt(2147418112) + 65536);
            case l1.c.f8509e /* 6 */:
                float f8 = h1.e0.f5886a;
                return Boolean.TRUE;
            case 7:
                return new nd.y0("me.magnum.melonds.ui.backgrounds.BackgroundsNavigation.BackgroundList", hg.e.INSTANCE, new Annotation[0]);
            case 8:
                try {
                    ClassLoader classLoader = j8.g.class.getClassLoader();
                    if (classLoader != null) {
                        eVar = new j8.e(classLoader, new g8.a(classLoader, 1));
                    } else {
                        eVar = null;
                    }
                    if (eVar == null || (a10 = eVar.a()) == null) {
                        return null;
                    }
                    g8.a aVar2 = new g8.a(classLoader, 1);
                    int a11 = h8.e.a();
                    if (a11 >= 9) {
                        obj = new l8.d(a10, aVar2);
                    } else if (a11 >= 6) {
                        obj = new l8.d(a10, aVar2);
                    } else if (a11 >= 2) {
                        obj = new l8.d(a10, aVar2);
                    } else if (a11 == 1) {
                        obj = new l8.c(a10, aVar2);
                    } else {
                        obj = new Object();
                    }
                    return obj;
                } catch (Throwable unused) {
                    return null;
                }
            case l1.c.f8508d /* 9 */:
                return new nd.y0("me.magnum.melonds.ui.cheats.CheatsNavigation.EnabledCheats", jg.e.INSTANCE, new Annotation[0]);
            case l1.c.f8510f /* 10 */:
                return new nd.y0("me.magnum.melonds.ui.cheats.CheatsNavigation.GameList", jg.l.INSTANCE, new Annotation[0]);
            case 11:
                return yb.y.f14813a;
            case 12:
                return Boolean.TRUE;
            case 13:
                return n2.s.w(kg.b.f8292b);
            case 14:
                b.C0004b c0004b = li.b.Companion;
                return new nd.d(a.C0003a.f9117a, 0);
            case l1.c.f8512h /* 15 */:
                b.C0004b c0004b2 = li.b.Companion;
                return new nd.d(f.a.f9151a, 0);
            case 16:
                d.b bVar = li.d.Companion;
                return new nd.d(b.a.f9126a, 0);
            case 17:
                e.b bVar2 = li.e.Companion;
                return new nd.f0(nd.o1.f10343a, nd.q0.f10352a, 1);
            case 18:
                k.b bVar3 = li.k.Companion;
                return new nd.d(nd.q0.f10352a, 0);
            case 19:
                a.b bVar4 = mf.a.Companion;
                return new nd.d(b.a.f9638a, 0);
            case 20:
                b.c cVar = mf.b.Companion;
                oe.s[] values = oe.s.values();
                values.getClass();
                return new nd.z("me.magnum.melonds.domain.model.Input", values);
            case 21:
                b.c cVar2 = mf.b.Companion;
                return b.AbstractC0012b.Companion.serializer();
            case 22:
                b.c cVar3 = mf.b.Companion;
                return b.AbstractC0012b.Companion.serializer();
            case 23:
                b.AbstractC0012b.C0015b c0015b = b.AbstractC0012b.Companion;
                return new jd.f(nc.u.a(b.AbstractC0012b.class), new nc.e[]{nc.u.a(b.AbstractC0012b.a.class), nc.u.a(b.AbstractC0012b.c.class), nc.u.a(b.AbstractC0012b.d.class)}, new jd.a[]{b.AbstractC0012b.a.C0013a.f9644a, b.AbstractC0012b.c.a.f9647a, new nd.y0("none", b.AbstractC0012b.d.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 24:
                b.AbstractC0012b.a.C0014b c0014b = b.AbstractC0012b.a.Companion;
                oe.t[] values2 = oe.t.values();
                values2.getClass();
                return new nd.z("me.magnum.melonds.domain.model.InputConfig.Assignment.Axis.Direction", values2);
            case 25:
                return new nd.y0("none", b.AbstractC0012b.d.INSTANCE, new Annotation[0]);
            case 26:
                return new n1.x(0, 0);
            case 27:
                n2.t.b("Unexpected call to default provider");
                throw new RuntimeException();
            case 28:
                return new o1.t(0, 0);
            default:
                return od.e0.f10889b;
        }
    }

    public /* synthetic */ v3(int i2) {
        this.A = i2;
    }
}
