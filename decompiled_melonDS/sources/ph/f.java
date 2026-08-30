package ph;

import aj.g;
import android.util.Log;
import androidx.lifecycle.y0;
import cd.e1;
import cd.h1;
import cd.q;
import cd.q1;
import cd.x0;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kf.d2;
import m9.o;
import mf.a;
import nc.k;
import oe.j;
import oe.s;
import oe.u;
import oe.v;
import oe.w;
import oe.x;
import oe.y;
import pd.h;
import pd.t;
import zb.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends y0 {

    /* renamed from: b  reason: collision with root package name */
    public final cf.d f11651b;

    /* renamed from: c  reason: collision with root package name */
    public final q1 f11652c;

    /* renamed from: d  reason: collision with root package name */
    public final cd.y0 f11653d;

    /* renamed from: e  reason: collision with root package name */
    public final q1 f11654e;

    /* renamed from: f  reason: collision with root package name */
    public final cd.y0 f11655f;

    /* renamed from: g  reason: collision with root package name */
    public final e1 f11656g;

    /* renamed from: h  reason: collision with root package name */
    public final x0 f11657h;

    public f(cf.d dVar) {
        dVar.getClass();
        this.f11651b = dVar;
        q1 c4 = q.c(((j) ((q1) ((d2) dVar).f8184e.getValue()).getValue()).f10941a);
        this.f11652c = c4;
        this.f11653d = new cd.y0(c4);
        q1 c10 = q.c(null);
        this.f11654e = c10;
        this.f11655f = new cd.y0(c10);
        e1 b10 = g.b();
        this.f11656g = b10;
        this.f11657h = new x0(b10);
    }

    public final void e(s sVar) {
        Object obj;
        q1 q1Var = this.f11652c;
        Iterator it = ((List) q1Var.getValue()).iterator();
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((y) it.next()).f10962a == sVar) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        List list = (List) q1Var.getValue();
        int i10 = i2 + 1;
        list.getClass();
        if (i10 >= 0 && i10 < list.size()) {
            obj = list.get(i10);
        } else {
            obj = null;
        }
        y yVar = (y) obj;
        if (yVar != null) {
            this.f11656g.p(yVar.f10962a);
        }
    }

    public final void f(s sVar, x xVar) {
        Object value;
        ArrayList q02;
        q1 q1Var = this.f11652c;
        Iterator it = ((List) q1Var.getValue()).iterator();
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((y) it.next()).f10962a == sVar) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            do {
                value = q1Var.getValue();
                q02 = l.q0((List) value);
                y yVar = (y) q02.get(i2);
                x xVar2 = yVar.f10963b;
                x xVar3 = yVar.f10964c;
                w wVar = w.f10961a;
                if (xVar.equals(wVar)) {
                    xVar2 = wVar;
                    xVar3 = xVar2;
                } else if (xVar instanceof v) {
                    if (!k.a(xVar2, wVar) && !k.a(xVar2, xVar)) {
                        if (!k.a(xVar3, wVar)) {
                            k.a(xVar3, xVar);
                        }
                        xVar3 = xVar;
                    }
                    xVar2 = xVar;
                } else if (xVar instanceof u) {
                    if (!k.a(xVar2, wVar) && !k.a(xVar2, xVar)) {
                        if (!k.a(xVar3, wVar)) {
                            k.a(xVar3, xVar);
                        }
                        xVar3 = xVar;
                    }
                    xVar2 = xVar;
                } else {
                    o.o();
                    return;
                }
                s sVar2 = yVar.f10962a;
                sVar2.getClass();
                xVar2.getClass();
                xVar3.getClass();
                q02.set(i2, new y(sVar2, xVar2, xVar3));
                j jVar = new j(q02);
                d2 d2Var = (d2) this.f11651b;
                d2Var.getClass();
                q1 q1Var2 = (q1) d2Var.f8184e.getValue();
                q1Var2.getClass();
                q1Var2.k(null, jVar);
                try {
                    File file = new File(d2Var.f8180a.getFilesDir(), "controller_config.json");
                    a.b bVar = mf.a.Companion;
                    bVar.getClass();
                    mf.a a10 = a.b.a(jVar);
                    FileOutputStream fileOutputStream = new FileOutputStream(file);
                    od.c cVar = d2Var.f8182c;
                    jd.a serializer = bVar.serializer();
                    serializer.getClass();
                    h1 h1Var = new h1(fileOutputStream);
                    byte[] bArr = (byte[]) h1Var.L;
                    t.i(cVar, h1Var, serializer, a10);
                    h1Var.e();
                    h hVar = h.L;
                    char[] cArr = (char[]) h1Var.R;
                    hVar.getClass();
                    cArr.getClass();
                    hVar.f(cArr);
                    pd.f fVar = pd.f.L;
                    fVar.getClass();
                    bArr.getClass();
                    fVar.e(bArr);
                    fileOutputStream.close();
                } catch (Exception e6) {
                    Log.w("SPSettingsRepository", "Failed to save controller configuration", e6);
                }
            } while (!q1Var.i(value, q02));
            this.f11654e.j(null);
        }
        this.f11654e.j(null);
    }
}
