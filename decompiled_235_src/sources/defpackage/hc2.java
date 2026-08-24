package defpackage;

import java.io.File;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hc2  reason: default package */
/* loaded from: classes.dex */
public final class hc2 implements qb6 {
    public final File a;
    public final ic2 b;
    public final eo2 c;
    public final int d;

    public hc2(File file, ic2 ic2Var, eo2 eo2Var, int i) {
        this.a = file;
        this.b = ic2Var;
        this.c = eo2Var;
        this.d = i;
    }

    @Override // defpackage.qb6
    public final Iterator iterator() {
        return new fc2(this);
    }
}
