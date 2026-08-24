package defpackage;

import java.util.LinkedHashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jd4  reason: default package */
/* loaded from: classes.dex */
public abstract class jd4 {
    public kj2 a;
    public boolean b;
    public eb c;

    public abstract void a();

    public abstract void b();

    public abstract void c(hd4 hd4Var);

    public abstract void d(hd4 hd4Var);

    public final void e() {
        eb ebVar = this.c;
        if (ebVar != null && ((LinkedHashSet) ebVar.R).remove(this)) {
            md4 md4Var = (md4) ebVar.L;
            md4Var.getClass();
            if (equals(md4Var.f)) {
                if (md4Var.g == -1) {
                    a();
                }
                md4Var.f = null;
                md4Var.g = 0;
                md4Var.h = null;
            }
            md4Var.d.remove(this);
            md4Var.e.remove(this);
            this.c = null;
            md4Var.b();
        }
    }

    public final void f(boolean z) {
        md4 md4Var;
        if (this.b != z) {
            this.b = z;
            eb ebVar = this.c;
            if (ebVar != null && (md4Var = (md4) ebVar.L) != null) {
                md4Var.b();
            }
        }
    }
}
