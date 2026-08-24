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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kl5  reason: default package */
/* loaded from: classes.dex */
public final class kl5 extends db2 {
    public static final lt4 X;
    public final ClassLoader B;
    public final db2 L;
    public final ex6 R;

    static {
        String str = lt4.B;
        X = w31.p("/");
    }

    public kl5(ClassLoader classLoader) {
        xf3 xf3Var = db2.A;
        xf3Var.getClass();
        this.B = classLoader;
        this.L = xf3Var;
        this.R = new ex6(new er2(this, 18));
    }

    @Override // defpackage.db2
    public final ai1 D(lt4 lt4Var) {
        lt4Var.getClass();
        if (jd1.c(lt4Var)) {
            lt4 lt4Var2 = X;
            lt4Var2.getClass();
            String s = f.b(lt4Var2, lt4Var, true).c(lt4Var2).A.s();
            for (vr4 vr4Var : (List) this.R.getValue()) {
                ai1 D = ((db2) vr4Var.A).D(((lt4) vr4Var.B).d(s));
                if (D != null) {
                    return D;
                }
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.db2
    public final wf3 F(lt4 lt4Var) {
        if (jd1.c(lt4Var)) {
            lt4 lt4Var2 = X;
            lt4Var2.getClass();
            String s = f.b(lt4Var2, lt4Var, true).c(lt4Var2).A.s();
            Iterator it = ((List) this.R.getValue()).iterator();
            while (it.hasNext()) {
                vr4 vr4Var = (vr4) it.next();
                try {
                    return ((db2) vr4Var.A).F(((lt4) vr4Var.B).d(s));
                } catch (FileNotFoundException unused) {
                }
            }
            e41.u(lt4Var, "file not found: ");
            return null;
        }
        e41.u(lt4Var, "file not found: ");
        return null;
    }

    @Override // defpackage.db2
    public final ui6 J(lt4 lt4Var) {
        lt4Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.db2
    public final in6 N(lt4 lt4Var) {
        lt4Var.getClass();
        if (jd1.c(lt4Var)) {
            lt4 lt4Var2 = X;
            lt4Var2.getClass();
            URL resource = this.B.getResource(f.b(lt4Var2, lt4Var, false).c(lt4Var2).A.s());
            if (resource != null) {
                URLConnection openConnection = resource.openConnection();
                if (openConnection instanceof JarURLConnection) {
                    ((JarURLConnection) openConnection).setUseCaches(false);
                }
                InputStream inputStream = openConnection.getInputStream();
                inputStream.getClass();
                return hi2.P(inputStream);
            }
            e41.u(lt4Var, "file not found: ");
            return null;
        }
        e41.u(lt4Var, "file not found: ");
        return null;
    }

    @Override // defpackage.db2
    public final ui6 e(lt4 lt4Var) {
        lt4Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.db2
    public final void h(lt4 lt4Var, lt4 lt4Var2) {
        lt4Var.getClass();
        lt4Var2.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.db2
    public final void n(lt4 lt4Var) {
        lt4Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.db2
    public final void r(lt4 lt4Var) {
        lt4Var.getClass();
        throw new IOException(this + " is read-only");
    }

    @Override // defpackage.db2
    public final List x(lt4 lt4Var) {
        lt4Var.getClass();
        lt4 lt4Var2 = X;
        lt4Var2.getClass();
        String s = f.b(lt4Var2, lt4Var, true).c(lt4Var2).A.s();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        boolean z = false;
        for (vr4 vr4Var : (List) this.R.getValue()) {
            db2 db2Var = (db2) vr4Var.A;
            lt4 lt4Var3 = (lt4) vr4Var.B;
            try {
                List x = db2Var.x(lt4Var3.d(s));
                ArrayList arrayList = new ArrayList();
                for (Object obj : x) {
                    if (jd1.c((lt4) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(ht0.v0(arrayList, 10));
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList.get(i);
                    i++;
                    lt4 lt4Var4 = (lt4) obj2;
                    lt4Var4.getClass();
                    String replace = qs6.D0(lt4Var4.A.s(), lt4Var3.A.s()).replace('\\', '/');
                    replace.getClass();
                    arrayList2.add(lt4Var2.d(replace));
                }
                gt0.A0(linkedHashSet, arrayList2);
                z = true;
            } catch (IOException unused) {
            }
        }
        if (z) {
            return gt0.k1(linkedHashSet);
        }
        e41.u(lt4Var, "file not found: ");
        return null;
    }
}
