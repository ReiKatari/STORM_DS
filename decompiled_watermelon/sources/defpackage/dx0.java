package defpackage;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dx0  reason: default package */
/* loaded from: classes.dex */
public final class dx0 implements ls5, z24 {
    public final ls5 A;
    public final z24 B;
    public e31 L;
    public Throwable R;
    public final cx0 X;

    public dx0(ls5 ls5Var) {
        b34 b34Var = new b34();
        ls5Var.getClass();
        this.A = ls5Var;
        this.B = b34Var;
        this.X = new cx0(this);
    }

    @Override // defpackage.ls5
    public final boolean G() {
        return this.A.G();
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        cx0 cx0Var = this.X;
        if (cx0Var != null) {
            cx0Var.p(-1);
        }
        this.A.close();
    }

    @Override // defpackage.z24
    public final void d(Object obj) {
        this.B.d(null);
    }

    @Override // defpackage.z24
    public final Object i(j11 j11Var) {
        return this.B.i(j11Var);
    }

    @Override // defpackage.ls5
    public final ns5 i0(String str) {
        str.getClass();
        cx0 cx0Var = this.X;
        if (cx0Var != null) {
            Object h = cx0Var.h(str);
            h.getClass();
            return new bx0((ns5) h);
        }
        return this.A.i0(str);
    }

    public final void p(StringBuilder sb) {
        int i;
        cx0 cx0Var = this.X;
        if (this.L == null && this.R == null) {
            sb.append("\t\tStatus: Free connection");
            sb.append('\n');
        } else {
            sb.append("\t\tStatus: Acquired connection");
            sb.append('\n');
            e31 e31Var = this.L;
            if (e31Var != null) {
                sb.append("\t\tCoroutine: " + e31Var);
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
                Iterator it = tq0.G0(1, zg6.F0(stringWriter2)).iterator();
                while (it.hasNext()) {
                    sb.append("\t\t" + ((String) it.next()));
                    sb.append('\n');
                }
            }
        }
        if (cx0Var != null) {
            StringBuilder sb2 = new StringBuilder("\t\tPrepared Statement Cache Size: ");
            synchronized (((so1) cx0Var.g)) {
                i = cx0Var.c;
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
