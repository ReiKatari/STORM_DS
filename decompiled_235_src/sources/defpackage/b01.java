package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b01  reason: default package */
/* loaded from: classes.dex */
public final class b01 implements e36, fb4 {
    public final e36 A;
    public final fb4 B;
    public l61 L;
    public Throwable R;
    public final a01 X;

    public b01(e36 e36Var) {
        hb4 hb4Var = new hb4();
        e36Var.getClass();
        this.A = e36Var;
        this.B = hb4Var;
        this.X = new a01(this);
    }

    @Override // defpackage.e36
    public final boolean Y() {
        return this.A.Y();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        a01 a01Var = this.X;
        if (a01Var != null) {
            a01Var.p(-1);
        }
        this.A.close();
    }

    @Override // defpackage.fb4
    public final Object e(r41 r41Var) {
        return this.B.e(r41Var);
    }

    @Override // defpackage.fb4
    public final void h(Object obj) {
        this.B.h(null);
    }

    @Override // defpackage.e36
    public final j36 i0(String str) {
        str.getClass();
        a01 a01Var = this.X;
        if (a01Var != null) {
            Object h = a01Var.h(str);
            h.getClass();
            return new zz0((j36) h);
        }
        return this.A.i0(str);
    }

    public final void k(StringBuilder sb) {
        int i;
        a01 a01Var = this.X;
        if (this.L == null && this.R == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            l61 l61Var = this.L;
            if (l61Var != null) {
                sb.append("\t\tCoroutine: " + l61Var);
                sb.append('\n');
            }
            Throwable th = this.R;
            if (th != null) {
                sb.append("\t\tAcquired:");
                sb.append('\n');
                StringWriter stringWriter = new StringWriter();
                PrintWriter printWriter = new PrintWriter(stringWriter);
                th.printStackTrace(printWriter);
                printWriter.flush();
                String stringWriter2 = stringWriter.toString();
                stringWriter2.getClass();
                Iterator it = gt0.D0(qs6.z0(stringWriter2), 1).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (a01Var != null) {
            StringBuilder sb2 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            synchronized (((q61) a01Var.g)) {
                i = a01Var.c;
            }
            sb2.append(i);
            sb.append(sb2.toString());
            sb.append('\n');
        }
    }

    public final String toString() {
        return this.A.toString();
    }
}
