package fj;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.zip.Inflater;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j0 extends k {
    public static final x X;
    public final x B;
    public final k L;
    public final LinkedHashMap R;

    static {
        String str = x.B;
        X = x8.e.l("/");
    }

    public j0(x xVar, k kVar, LinkedHashMap linkedHashMap) {
        this.B = xVar;
        this.L = kVar;
        this.R = linkedHashMap;
    }

    @Override // fj.k
    public final List B(x xVar) {
        x xVar2 = X;
        xVar2.getClass();
        gj.j jVar = (gj.j) this.R.get(gj.c.b(xVar2, xVar, true));
        if (jVar != null) {
            return zb.l.p0(jVar.f5708q);
        }
        j.n(xVar, "not a directory: ");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0127  */
    @Override // fj.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final f5.e G(fj.x r27) {
        /*
            Method dump skipped, instructions count: 317
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: fj.j0.G(fj.x):f5.e");
    }

    @Override // fj.k
    public final s H(x xVar) {
        throw new UnsupportedOperationException("not implemented yet!");
    }

    @Override // fj.k
    public final e0 I(x xVar) {
        xVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // fj.k
    public final g0 J(x xVar) {
        a0 a0Var;
        Throwable th2;
        xVar.getClass();
        x xVar2 = X;
        xVar2.getClass();
        gj.j jVar = (gj.j) this.R.get(gj.c.b(xVar2, xVar, true));
        if (jVar != null) {
            long j2 = jVar.f5698f;
            s H = this.L.H(this.B);
            try {
                a0Var = new a0(H.d(jVar.f5700h));
                try {
                    H.close();
                    th2 = null;
                } catch (Throwable th3) {
                    th2 = th3;
                }
            } catch (Throwable th4) {
                if (H != null) {
                    try {
                        H.close();
                    } catch (Throwable th5) {
                        p7.t.a(th4, th5);
                    }
                }
                a0Var = null;
                th2 = th4;
            }
            if (th2 == null) {
                a0Var.getClass();
                gj.b.f(a0Var, null);
                if (jVar.f5699g == 0) {
                    return new gj.g(a0Var, j2, true);
                }
                return new gj.g(new q(new a0(new gj.g(a0Var, jVar.f5697e, true)), new Inflater(true)), j2, false);
            }
            throw th2;
        }
        j.g(xVar, "no such file: ");
        return null;
    }

    @Override // fj.k
    public final e0 d(x xVar) {
        xVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // fj.k
    public final void i(x xVar, x xVar2) {
        xVar.getClass();
        xVar2.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // fj.k
    public final void t(x xVar) {
        xVar.getClass();
        throw new IOException("zip file systems are read-only");
    }

    @Override // fj.k
    public final void v(x xVar) {
        xVar.getClass();
        throw new IOException("zip file systems are read-only");
    }
}
