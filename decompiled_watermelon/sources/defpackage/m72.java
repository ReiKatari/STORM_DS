package defpackage;

import java.io.File;
import java.util.ArrayDeque;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m72  reason: default package */
/* loaded from: classes.dex */
public final class m72 extends s0 {
    public final ArrayDeque L;
    public final /* synthetic */ o72 R;

    public m72(o72 o72Var) {
        this.R = o72Var;
        ArrayDeque arrayDeque = new ArrayDeque();
        this.L = arrayDeque;
        File file = (File) o72Var.b;
        if (file.isDirectory()) {
            arrayDeque.push(b(file));
        } else if (file.isFile()) {
            file.getClass();
            arrayDeque.push(new n72(file));
        } else {
            this.A = 2;
        }
    }

    @Override // defpackage.s0
    public final void a() {
        File file;
        File a;
        while (true) {
            ArrayDeque arrayDeque = this.L;
            n72 n72Var = (n72) arrayDeque.peek();
            if (n72Var == null) {
                file = null;
                break;
            }
            a = n72Var.a();
            if (a == null) {
                arrayDeque.pop();
            } else if (a.equals(n72Var.a) || !a.isDirectory() || arrayDeque.size() >= Integer.MAX_VALUE) {
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

    /* JADX WARN: Type inference failed for: r1v6, types: [h72, n72] */
    /* JADX WARN: Type inference failed for: r1v8, types: [h72, n72] */
    public final h72 b(File file) {
        int i = l72.a[((p72) this.R.c).ordinal()];
        if (i != 1) {
            if (i == 2) {
                file.getClass();
                return new n72(file);
            }
            i.c();
            return null;
        }
        file.getClass();
        return new n72(file);
    }
}
