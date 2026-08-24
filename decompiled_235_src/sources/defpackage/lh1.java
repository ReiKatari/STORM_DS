package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lh1  reason: default package */
/* loaded from: classes.dex */
public final class lh1 implements qb6 {
    public final CharSequence a;
    public final int b;
    public final eo2 c;

    public lh1(CharSequence charSequence, int i, eo2 eo2Var) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = eo2Var;
    }

    @Override // defpackage.qb6
    public final Iterator iterator() {
        return new kh1(this);
    }
}
