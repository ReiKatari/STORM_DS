package defpackage;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.JarURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sb5  reason: default package */
/* loaded from: classes.dex */
public final class sb5 extends j62 {
    public static final jk4 X;
    public final ClassLoader B;
    public final j62 L;
    public final il6 R;

    static {
        String str = jk4.B;
        X = hm1.o("/");
    }

    public sb5(ClassLoader classLoader) {
        d93 d93Var = j62.A;
        d93Var.getClass();
        this.B = classLoader;
        this.L = d93Var;
        this.R = new il6(new bz2(11, this));
    }

    @Override // defpackage.j62
    public final List D(jk4 jk4Var) {
        jk4Var.getClass();
        jk4 jk4Var2 = X;
        jk4Var2.getClass();
        String r = f.b(jk4Var2, jk4Var, true).c(jk4Var2).A.r();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (ti4 ti4Var : (List) this.R.getValue()) {
            j62 j62Var = (j62) ti4Var.A;
            jk4 jk4Var3 = (jk4) ti4Var.B;
            try {
                List D = j62Var.D(jk4Var3.d(r));
                ArrayList arrayList = new ArrayList();
                for (Object obj : D) {
                    if (so1.e((jk4) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(uq0.y0(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    jk4 jk4Var4 = (jk4) obj2;
                    jk4Var4.getClass();
                    String replace = zg6.J0(jk4Var4.A.r(), jk4Var3.A.r()).replace('\\', '/');
                    replace.getClass();
                    arrayList2.add(jk4Var2.d(replace));
                }
                tq0.D0(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return tq0.n1(linkedHashSet);
        }
        f81.v(jk4Var, "file not found: ");
        return null;
    }

    @Override // defpackage.j62
    public final wd1 I(jk4 jk4Var) {
        jk4Var.getClass();
        if (so1.e(jk4Var)) {
            jk4 jk4Var2 = X;
            jk4Var2.getClass();
            String r = f.b(jk4Var2, jk4Var, true).c(jk4Var2).A.r();
            for (ti4 ti4Var : (List) this.R.getValue()) {
                wd1 I = ((j62) ti4Var.A).I(((jk4) ti4Var.B).d(r));
                if (I != null) {
                    return I;
                }
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.j62
    public final c93 J(jk4 jk4Var) {
        if (so1.e(jk4Var)) {
            jk4 jk4Var2 = X;
            jk4Var2.getClass();
            String r = f.b(jk4Var2, jk4Var, true).c(jk4Var2).A.r();
            Iterator it = ((List) this.R.getValue()).iterator();
            while (it.hasNext()) {
                ti4 ti4Var = (ti4) it.next();
                try {
                    return ((j62) ti4Var.A).J(((jk4) ti4Var.B).d(r));
                } catch (FileNotFoundException unused) {
                }
            }
            f81.v(jk4Var, "file not found: ");
            return null;
        }
        f81.v(jk4Var, "file not found: ");
        return null;
    }

    @Override // defpackage.j62
    public final g76 K(jk4 jk4Var) {
        jk4Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.j62
    public final sb6 N(jk4 jk4Var) {
        jk4Var.getClass();
        if (so1.e(jk4Var)) {
            jk4 jk4Var2 = X;
            jk4Var2.getClass();
            URL resource = this.B.getResource(f.b(jk4Var2, jk4Var, false).c(jk4Var2).A.r());
            if (resource != null) {
                URLConnection openConnection = resource.openConnection();
                if (openConnection instanceof JarURLConnection) {
                    ((JarURLConnection) openConnection).setUseCaches(false);
                }
                InputStream inputStream = openConnection.getInputStream();
                inputStream.getClass();
                return sn2.P(inputStream);
            }
            f81.v(jk4Var, "file not found: ");
            return null;
        }
        f81.v(jk4Var, "file not found: ");
        return null;
    }

    @Override // defpackage.j62
    public final g76 d(jk4 jk4Var) {
        jk4Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.j62
    public final void i(jk4 jk4Var, jk4 jk4Var2) {
        jk4Var.getClass();
        jk4Var2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.j62
    public final void w(jk4 jk4Var) {
        jk4Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.j62
    public final void x(jk4 jk4Var) {
        jk4Var.getClass();
        throw new IOException(this + " is read-only");
    }
}
