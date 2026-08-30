package m7;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements t7.a, id.a {
    public final t7.a A;
    public final id.a B;
    public cc.g L;
    public Throwable R;
    public final k9.e X;

    public g(t7.a aVar) {
        id.c cVar = new id.c();
        aVar.getClass();
        this.A = aVar;
        this.B = cVar;
        this.X = new k9.e(this);
    }

    @Override // t7.a
    public final t7.c T(String str) {
        str.getClass();
        k9.e eVar = this.X;
        if (eVar != null) {
            Object h2 = eVar.h(str);
            h2.getClass();
            return new f((t7.c) h2);
        }
        return this.A.T(str);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        k9.e eVar = this.X;
        if (eVar != null) {
            eVar.p(-1);
        }
        this.A.close();
    }

    @Override // id.a
    public final void d(Object obj) {
        this.B.d(null);
    }

    @Override // id.a
    public final Object i(cc.c cVar) {
        return this.B.i(cVar);
    }

    public final void m(StringBuilder sb2) {
        int i2;
        k9.e eVar = this.X;
        if (this.L == null && this.R == null) {
            sb2.append("\t\tStatus: Free connection");
            sb2.append('\n');
        } else {
            sb2.append("\t\tStatus: Acquired connection");
            sb2.append('\n');
            cc.g gVar = this.L;
            if (gVar != null) {
                sb2.append("\t\tCoroutine: " + gVar);
                sb2.append('\n');
            }
            Throwable th2 = this.R;
            if (th2 != null) {
                sb2.append("\t\tAcquired:");
                sb2.append('\n');
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th2.printStackTrace(printWriter);
                printWriter.flush();
                String stringWriter2 = stringWriter.toString();
                stringWriter2.getClass();
                Iterator it = zb.l.P(vc.h.n0(stringWriter2)).iterator();
                while (it.hasNext()) {
                    sb2.append("\t\t" + ((String) it.next()));
                    sb2.append('\n');
                }
            }
        }
        if (eVar != null) {
            StringBuilder sb3 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            synchronized (((x8.e) eVar.f99g)) {
                i2 = eVar.f95c;
            }
            sb3.append(i2);
            sb2.append(sb3.toString());
            sb2.append('\n');
        }
    }

    public final String toString() {
        return this.A.toString();
    }

    @Override // t7.a
    public final boolean x() {
        return this.A.x();
    }
}
