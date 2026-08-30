package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jd1  reason: default package */
/* loaded from: classes.dex */
public final class jd1 implements b06 {
    public final CharSequence a;
    public final int b;
    public final aj2 c;

    public jd1(CharSequence charSequence, int i, aj2 aj2Var) {
        charSequence.getClass();
        this.a = charSequence;
        this.b = i;
        this.c = aj2Var;
    }

    @Override // defpackage.b06
    public final Iterator iterator() {
        return new id1(this);
    }
}
