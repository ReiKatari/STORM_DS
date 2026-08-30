package gj;

import fj.e0;
import fj.g0;
import fj.s;
import fj.t;
import fj.x;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import yb.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends fj.k {
    public static final x X;
    public final ClassLoader B;
    public final fj.k L;
    public final n R;

    static {
        String str = x.B;
        X = x8.e.l("/");
    }

    public h(ClassLoader classLoader) {
        t tVar = fj.k.A;
        tVar.getClass();
        this.B = classLoader;
        this.L = tVar;
        this.R = new n(new a2.n(20, this));
    }

    @Override // fj.k
    public final List B(x xVar) {
        x xVar2 = X;
        xVar2.getClass();
        String r5 = c.b(xVar2, xVar, true).c(xVar2).A.r();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z10 = false;
        for (yb.j jVar : (List) this.R.getValue()) {
            fj.k kVar = (fj.k) jVar.A;
            x xVar3 = (x) jVar.B;
            try {
                List B = kVar.B(xVar3.d(r5));
                ArrayList arrayList = new ArrayList();
                for (Object obj : B) {
                    if (na.f.e((x) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(zb.m.G(arrayList, 10));
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    x xVar4 = (x) obj2;
                    xVar4.getClass();
                    String replace = vc.h.q0(xVar4.A.r(), xVar3.A.r()).replace('\\', '/');
                    replace.getClass();
                    arrayList2.add(xVar2.d(replace));
                }
                zb.l.L(arrayList2, linkedHashSet);
                z10 = true;
            } catch (IOException unused) {
            }
        }
        if (z10) {
            return zb.l.p0(linkedHashSet);
        }
        fj.j.g(xVar, "file not found: ");
        return null;
    }

    @Override // fj.k
    public final f5.e G(x xVar) {
        xVar.getClass();
        if (na.f.e(xVar)) {
            x xVar2 = X;
            xVar2.getClass();
            String r5 = c.b(xVar2, xVar, true).c(xVar2).A.r();
            for (yb.j jVar : (List) this.R.getValue()) {
                f5.e G = ((fj.k) jVar.A).G(((x) jVar.B).d(r5));
                if (G != null) {
                    return G;
                }
            }
            return null;
        }
        return null;
    }

    @Override // fj.k
    public final s H(x xVar) {
        if (na.f.e(xVar)) {
            x xVar2 = X;
            xVar2.getClass();
            String r5 = c.b(xVar2, xVar, true).c(xVar2).A.r();
            for (yb.j jVar : (List) this.R.getValue()) {
                try {
                    return ((fj.k) jVar.A).H(((x) jVar.B).d(r5));
                } catch (FileNotFoundException unused) {
                }
            }
            fj.j.g(xVar, "file not found: ");
            return null;
        }
        fj.j.g(xVar, "file not found: ");
        return null;
    }

    @Override // fj.k
    public final e0 I(x xVar) {
        xVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // fj.k
    public final g0 J(x xVar) {
        xVar.getClass();
        if (na.f.e(xVar)) {
            x xVar2 = X;
            xVar2.getClass();
            URL resource = this.B.getResource(c.b(xVar2, xVar, false).c(xVar2).A.r());
            if (resource != null) {
                URLConnection openConnection = resource.openConnection();
                if (openConnection instanceof JarURLConnection) {
                    ((JarURLConnection) openConnection).setUseCaches(false);
                }
                InputStream inputStream = openConnection.getInputStream();
                inputStream.getClass();
                return ij.a.w0(inputStream);
            }
            fj.j.g(xVar, "file not found: ");
            return null;
        }
        fj.j.g(xVar, "file not found: ");
        return null;
    }

    @Override // fj.k
    public final e0 d(x xVar) {
        xVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // fj.k
    public final void i(x xVar, x xVar2) {
        xVar.getClass();
        xVar2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // fj.k
    public final void t(x xVar) {
        xVar.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // fj.k
    public final void v(x xVar) {
        xVar.getClass();
        throw new IOException(this + " is read-only");
    }
}
