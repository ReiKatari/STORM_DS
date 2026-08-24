package defpackage;

import java.io.File;
import java.util.ArrayDeque;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fc2  reason: default package */
/* loaded from: classes.dex */
public final class fc2 extends t0 {
    public final ArrayDeque L;
    public final /* synthetic */ hc2 R;

    public fc2(hc2 hc2Var) {
        this.R = hc2Var;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.L = arrayDeque;
        File file = hc2Var.a;
        if (file.isDirectory()) {
            arrayDeque.push(b(file));
        } else if (file.isFile()) {
            file.getClass();
            arrayDeque.push(new gc2(file));
        } else {
            this.A = 2;
        }
    }

    @Override // defpackage.t0
    public final void a() {
        File file;
        File a;
        while (true) {
            ArrayDeque arrayDeque = this.L;
            gc2 gc2Var = (gc2) arrayDeque.peek();
            if (gc2Var == null) {
                file = null;
                break;
            }
            a = gc2Var.a();
            if (a == null) {
                arrayDeque.pop();
            } else if (a.equals(gc2Var.a) || !a.isDirectory() || arrayDeque.size() >= this.R.d) {
                break;
            } else {
                arrayDeque.push(b(a));
            }
        }
        file = a;
        if (file != null) {
            this.B = file;
            this.A = 1;
            return;
        }
        this.A = 2;
    }

    public final ac2 b(File file) {
        int i = ec2.a[this.R.b.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new bc2(this, file);
            }
            i.d();
            return null;
        }
        return new dc2(this, file);
    }
}
